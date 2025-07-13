package com.hyperdondon.blissgemsremake.internal.util

import org.bukkit.event.Listener
import org.mineacademy.fo.Common
import org.mineacademy.fo.command.SimpleCommand
import org.mineacademy.fo.plugin.SimplePlugin
import org.mineacademy.fo.remain.Remain
import java.lang.reflect.Modifier
import java.util.jar.JarFile
import java.util.regex.Pattern

object KotlinObjectAutoRegisterScanner {
    //Copied from Foundation
    fun findValidClasses(): MutableList<Class<*>?> {
        val classes: MutableList<Class<*>?> = ArrayList<Class<*>?>()

        // Ignore anonymous inner classes
        val anonymousClassPattern = Pattern.compile("\\w+\\$[0-9]$")

        try {
            JarFile(SimplePlugin.getSource()).use { file ->
                val entry = file.entries()
                while (entry.hasMoreElements()) {
                    val jar = entry.nextElement()
                    val name = jar.getName().replace("/", ".")

                    // Ignore files such as settings.yml
                    if (!name.endsWith(".class")) {
                        continue
                    }

                    val className = name.substring(0, name.length - 6)
                    var clazz: Class<*>? = null

                    // Look up the Java class, silently ignore if failing
                    try {
                        clazz = SimplePlugin::class.java.getClassLoader().loadClass(className)
                    } catch (error: ClassFormatError) {
                        continue
                    } catch (error: VerifyError) {
                        continue
                    } catch (error: NoClassDefFoundError) {
                        continue
                    } catch (error: ClassNotFoundException) {
                        continue
                    } catch (error: IncompatibleClassChangeError) {
                        continue
                    }

                    // Ignore abstract or anonymous classes
                    if (!Modifier.isAbstract(clazz.getModifiers()) && !anonymousClassPattern.matcher(className)
                            .find()
                    ) classes.add(clazz)
                }
            }
        } catch (t: Throwable) {
            Remain.sneaky(t)
        }

        return classes
    }


    fun registerKotlinObjectListeners() {
        for (clazz in findValidClasses()) {
            if (!clazz!!.isAnnotationPresent(KotlinObjectAutoRegister::class.java)) continue

            try {
                val field = clazz.getDeclaredField("INSTANCE")
                field.setAccessible(true)

                val instance = field.get(null)

                if (instance !is Listener && instance !is SimpleCommand) {
                    Common.log("Class $clazz doesn't implement Listener and doesn't extend SimpleCommand!")
                    continue
                }

                if (instance is Listener) Common.registerEvents(instance)


                if (instance is SimpleCommand) instance.register()


            } catch (e: Exception) {
                Common.error(e, "Unable to register Kotlin object ${clazz.name}")
            }
        }
    }
}
