package com.hyperdondon.blissgemsremake

import com.hyperdondon.blissgemsremake.api.CooldownHandler
import com.hyperdondon.blissgemsremake.api.Settings
import com.hyperdondon.blissgemsremake.internal.PlayerCooldownStorer
import com.hyperdondon.blissgemsremake.internal.PlayerParticlePreferences
import com.hyperdondon.blissgemsremake.internal.util.KotlinObjectAutoRegisterScanner
import net.kyori.adventure.text.minimessage.MiniMessage
import net.kyori.adventure.text.serializer.legacy.LegacyComponentSerializer
import org.bstats.bukkit.Metrics
import org.bukkit.event.Listener
import org.mineacademy.fo.Common
import org.mineacademy.fo.plugin.SimplePlugin
import java.io.File

class BlissGems() : SimplePlugin(), Listener {
    var pluginId: Int = 24042
    var metrics: Metrics? = null

    protected override fun onPluginStart() {
    }

    protected override fun onPluginStop() {
    }

    protected override fun onReloadablesStart() {
        startPlugin()
    }

    private fun startPlugin() {
        KotlinObjectAutoRegisterScanner.registerKotlinObjectListeners()
        instance = this

        val settingsFile = File(dataFolder, "config.yml")

        if (!settingsFile.exists()) saveResource("config.yml", false)
        Settings.settingsFile = settingsFile
        Settings.loadConfig()

        if (Settings.metrics) {
            var enableMetrics = true
            try {
                Class.forName("com.hyperdondon.blissgemsremake.libs.org.bstats.bukkit.Metrics")
            } catch (e: ClassNotFoundException) {
                Common.error(
                    e,
                    "Are you a developer hotswapping? If you see this and you aren't, please report this bug"
                )
                enableMetrics = false
            }
            if (enableMetrics) {
                Common.logFramed("Starting bStats metrics.")
                metrics = Metrics(this, pluginId)
            }
        }

        val databaseFileName = "Data.db"
        val db = File(dataFolder, databaseFileName)

        if (!db.exists()) saveResource(databaseFileName, false)

        PlayerParticlePreferences.connect("jdbc:sqlite:" + dataFolder.absolutePath + databaseFileName)
        PlayerCooldownStorer.connect("jdbc:sqlite:" + dataFolder.absolutePath + databaseFileName)

        CooldownHandler.init()
    }


    companion object {
        @JvmStatic
        var instance: BlissGems? = null

        //Bad method
        @JvmStatic
        fun colorize(s: String): String {
            var returnedString = s;

            val sc = MiniMessage.miniMessage().deserialize(returnedString);
            returnedString = LegacyComponentSerializer.legacySection().serialize(sc);
            returnedString = Common.colorize(returnedString);
            return returnedString;
        }
    }
}