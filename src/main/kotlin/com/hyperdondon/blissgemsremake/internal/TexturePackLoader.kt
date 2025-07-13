package com.hyperdondon.blissgemsremake.internal

import com.hyperdondon.blissgemsremake.api.Settings
import com.hyperdondon.blissgemsremake.internal.util.KotlinObjectAutoRegister
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerJoinEvent

@KotlinObjectAutoRegister
object TexturePackLoader : Listener {
    @EventHandler
    fun PackLoader(e: PlayerJoinEvent) {
        if (Settings.texturePackLoadingAllowed) {
            if (Settings.season == 3) e.getPlayer()
                .setResourcePack("https://download.mc-packs.net/pack/06c8e57d9563a922dc0c167b703cf33df28838d6.zip") //Manhunt pack fixed by Hyper

            if (Settings.season == 2) e.getPlayer()
                .setResourcePack("https://download.mc-packs.net/pack/4260d63d42da9e7ede0782193e09d13551ff8df3.zip")

            if (Settings.season == 1) e.getPlayer()
                .setResourcePack("https://download.mc-packs.net/pack/86c3829ff784247b5a02e1cf74ca90a2bc740252.zip")
        }
    }
}
