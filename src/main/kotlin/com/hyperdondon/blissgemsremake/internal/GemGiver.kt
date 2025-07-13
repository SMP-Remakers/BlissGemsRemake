package com.hyperdondon.blissgemsremake.internal

import com.hyperdondon.blissgemsremake.api.Energy
import com.hyperdondon.blissgemsremake.api.Gem
import com.hyperdondon.blissgemsremake.api.GemType
import com.hyperdondon.blissgemsremake.api.Settings
import com.hyperdondon.blissgemsremake.internal.util.KotlinObjectAutoRegister
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerJoinEvent
import java.util.*

@KotlinObjectAutoRegister
object GemGiver : Listener {
    @EventHandler
    fun giveGem(e: PlayerJoinEvent) {
        if (!e.getPlayer().hasPlayedBefore() && Settings.giveGemOnJoinAllowed) {
            var type: GemType? = null
            var randomNumber = 0
            if (Settings.season == 1) {
                val random = Random()
                randomNumber = random.nextInt(6) + 1
            }

            if (Settings.season == 2) {
                val random = Random()
                randomNumber = random.nextInt(7) + 1
            }

            if (Settings.season == 3) {
                val random = Random()
                randomNumber = random.nextInt(8) + 1
            }


            //randomNumber = 2;
            if (randomNumber == 1) type = GemType.Life

            if (randomNumber == 2) type = GemType.Strength

            if (randomNumber == 3) type = GemType.Fire

            if (randomNumber == 4) type = GemType.Speed

            if (randomNumber == 5) type = GemType.Wealth

            if (randomNumber == 6) type = GemType.Wealth

            if (randomNumber == 7) type = GemType.Astra

            if (randomNumber == 8) type = GemType.Flux

            val g = Gem(type, 1, Energy.Pristine)
            e.getPlayer().getInventory().addItem(g.toItemStack()!!)
        }
    }
}
