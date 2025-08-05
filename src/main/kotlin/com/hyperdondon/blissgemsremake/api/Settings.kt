package com.hyperdondon.blissgemsremake.api

import org.bukkit.configuration.file.YamlConfiguration
import org.mineacademy.fo.Common
import java.io.File

object Settings {
    var settingsFile: File? = null
    var config: YamlConfiguration? = null

    @JvmStatic
    var season = 0
        set(value) {
            field = value
            config!!.set("season", value)
            try {
                config!!.save(settingsFile!!)
                loadConfig()
            } catch (exc: Exception) {
                Common.error(exc)
            }
        }

    @JvmStatic
    var giveGemOnJoin = false
        set(value) {
            field = value
            config!!.set("give_gem_on_first_join", value)
            try {
                config!!.save(settingsFile!!)
                loadConfig()
            } catch (exc: Exception) {
                Common.error(exc)
            }
        }

    @JvmStatic
    var droppingAllowed = false
        set(value) {
            field = value
            config!!.set("allow_gem_dropping", value)
            try {
                config!!.save(settingsFile!!)
                loadConfig()
            } catch (exc: Exception) {
                Common.error(exc)
            }
        }

    @JvmStatic
    var removingAllowed = false
        set(value) {
            field = value
            config!!.set("allow_gem_removing", value)
            try {
                config!!.save(settingsFile!!)
                loadConfig()
            } catch (exc: Exception) {
                Common.error(exc)
            }
        }

    @JvmStatic
    var texturePackLoadingAllowed = false
        set(value) {
            field = value
            config!!.set("texture_pack_loading", value)
            try {
                config!!.save(settingsFile!!)
                loadConfig()
            } catch (exc: Exception) {
                Common.error(exc)
            }
        }

    @JvmStatic
    var unloadCooldowns = false
        set(value) {
            field = value
            config!!.set("unload_player_cooldowns_on_leave", value)
            try {
                config!!.save(settingsFile!!)
                loadConfig()
            } catch (exc: Exception) {
                Common.error(exc)
            }
        }

    @JvmStatic
    var metrics = false
        set(value) {
            field = value
            config!!.set("metrics", value)
            try {
                config!!.save(settingsFile!!)
                loadConfig()
            } catch (exc: Exception) {
                Common.error(exc)
            }
        }

    fun loadConfig() {
        config = YamlConfiguration.loadConfiguration(settingsFile!!)
        season = config!!.getInt("season")
        giveGemOnJoin = config!!.getBoolean("give_gem_on_first_join")
        droppingAllowed = config!!.getBoolean("allow_gem_dropping")
        removingAllowed = config!!.getBoolean("allow_gem_removing")
        texturePackLoadingAllowed = config!!.getBoolean("texture_pack_loading")
        unloadCooldowns = config!!.getBoolean("unload_player_cooldowns_on_leave")
        metrics = config!!.getBoolean("metrics")
    }
}
