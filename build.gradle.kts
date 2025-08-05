//If you are building, make sure you use shadowjar at the end. example: "clean build shadowjar"
plugins {
    kotlin("jvm") version "2.2.0"
    id("com.gradleup.shadow") version "8.3.0"
    `java-library`
    `maven-publish`
    id("org.jetbrains.dokka") version "2.0.0"
}

group = "com.hyperdondon"
var pluginArtifactId = "blissgemsremake"
version = 0

repositories {
    mavenCentral()
    maven("https://repo.papermc.io/repository/maven-public/") {
        name = "papermc-repo"
    }
    maven("https://oss.sonatype.org/content/groups/public/") {
        name = "sonatype"
    }
    maven("https://jitpack.io") {
        name = "jitpack"
    }
}

dependencies {
    compileOnly("io.papermc.paper:paper-api:1.20.1-R0.1-SNAPSHOT")
    implementation("com.github.kangarko:Foundation:6.9.22") {
        isTransitive = false
    }
    compileOnly("com.mojang:authlib:3.13.56")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    implementation("org.bstats:bstats-bukkit:3.1.0")
}

val targetJavaVersion = 17
kotlin {
    jvmToolchain(targetJavaVersion)
}

tasks.processResources {
    val props = mapOf("version" to version)
    inputs.properties(props)
    filteringCharset = "UTF-8"
    filesMatching("plugin.yml") {
        expand(props)
    }
}

//Shading
//Should only be used for hot swapping!
//put -Prelocate=false at the end to no relocate the libraries
val relocate = project.findProperty("relocate")?.toString()?.toBooleanStrictOrNull() ?: true

tasks.named<com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar>("shadowJar") {
    dependencies {
        include(dependency("com.github.kangarko:Foundation"))
        include(dependency("org.bstats:bstats-bukkit"))
    }

    if (relocate) {
        relocate("org.mineacademy.fo", "${project.group}.${pluginArtifactId}.libs.org.mineacademy.fo")
        relocate("org.bstats.bukkit", "${project.group}.${pluginArtifactId}.libs.org.bstats.bukkit")
    }

    minimize()
}

//should be used if you are a dev and need to test the api with a minecraft plugin that uses maven. execute publishToMavenLocal to publish to local repo
val apiJar by tasks.registering(Jar::class) {
    archiveBaseName.set("blissgemsremake-api")
    destinationDirectory.set(layout.buildDirectory.dir("libs"))
    archiveClassifier.set(null as String?)
    from(sourceSets.main.get().output) {
        include("com/hyperdondon/blissgemsremake/api/**")
    }
}

val internalJar by tasks.registering(Jar::class) {
    archiveBaseName.set("blissgemsremake-internal")
    destinationDirectory.set(layout.buildDirectory.dir("libs"))
    archiveClassifier.set(null as String?)
    from(sourceSets.main.get().output) {
        include("com/hyperdondon/blissgemsremake/**")
    }
}

//API
if (project.findProperty("publishAPI")?.toString()?.toBooleanStrictOrNull() ?: true) {
    publishing {
        publications {
            create<MavenPublication>("api") {
                groupId = project.group.toString()
                artifactId = pluginArtifactId
                version = project.version.toString()

                artifact(apiJar.get()) {
                    classifier = null // publish as the main artifact
                }

                pom {
                    name.set("BlissGemsRemake-API")
                    url.set("https://github.com/SMP-Remakers/BlissGemsRemake")
                    developers {
                        developer {
                            id.set("hyperdondon")
                            name.set("Daniel Abu Dawoud")
                        }
                    }
                }
            }
        }

        repositories {
            mavenLocal()
        }
    }
}

//Internals
if (project.findProperty("publishInternals")?.toString()?.toBooleanStrictOrNull() ?: true) {
    publishing {
        publications {
            create<MavenPublication>("internal") {
                groupId = project.group.toString()
                artifactId = pluginArtifactId
                version = project.version.toString()

                artifact(internalJar.get()) {
                    classifier = null // publish as the main artifact
                }

                pom {
                    name.set("BlissGemsRemake-API")
                    url.set("https://github.com/SMP-Remakers/BlissGemsRemake")
                    developers {
                        developer {
                            id.set("hyperdondon")
                            name.set("Daniel Abu Dawoud")
                        }
                    }
                }
            }
        }

        repositories {
            mavenLocal()
        }
    }
}

//The actual plugin
if (project.findProperty("publishPlugin")?.toString()?.toBooleanStrictOrNull() ?: true) {
    publishing {
        publications {
            create<MavenPublication>("plugin") {
                groupId = project.group.toString()
                artifactId = pluginArtifactId
                version = project.version.toString()

                artifact(tasks["jar"]) {
                    classifier = null // ensures it's named like blissgemsremake-0-indev.jar
                }

                pom {
                    name.set("BlissGemsRemake")
                    url.set("https://github.com/SMP-Remakers/BlissGemsRemake")
                    developers {
                        developer {
                            id.set("hyperdondon")
                            name.set("Daniel Abu Dawoud")
                        }
                    }
                }
            }
        }

        repositories {
            mavenLocal()
        }
    }
}

artifacts {
    add("archives", apiJar.get())
    add("archives", internalJar.get())
}

//docs
tasks.dokkaJavadoc {
    dokkaSourceSets.configureEach {
        perPackageOption {
            // Hide the Kotlin-specific companion classes.
            matchingRegex.set(".*\\.Companion")
            suppress.set(true)
        }
    }
}