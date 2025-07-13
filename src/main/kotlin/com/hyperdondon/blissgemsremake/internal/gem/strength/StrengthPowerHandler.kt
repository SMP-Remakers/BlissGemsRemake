package com.hyperdondon.blissgemsremake.internal.gem.strength

import com.hyperdondon.blissgemsremake.api.Gem
import com.hyperdondon.blissgemsremake.api.GemType
import com.hyperdondon.blissgemsremake.api.SeasonSupport
import com.hyperdondon.blissgemsremake.internal.powers.PowerHandler
import com.hyperdondon.blissgemsremake.internal.util.KotlinObjectAutoRegister
import org.bukkit.entity.Monster
import org.bukkit.entity.Player
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.block.Action
import org.bukkit.event.entity.EntityDamageByEntityEvent
import org.bukkit.event.player.PlayerInteractEvent
import org.bukkit.event.server.ServerLoadEvent
import org.mineacademy.fo.remain.CompPotionEffectType

@KotlinObjectAutoRegister
object StrengthPowerHandler : PowerHandler(GemType.Strength, CompPotionEffectType.INCREASE_DAMAGE), Listener {
    @EventHandler
    fun initialize(event: ServerLoadEvent?) {
        registerPower(Frailer)
        registerPower(ChadStrength)
    }

    @EventHandler
    fun activateSingleFrailerPower(event: EntityDamageByEntityEvent) {
        if (event.damager !is Player) return
        if (event.entity !is Monster) return

        val player = event.damager as Player

        if (!isPowerful(player.inventory.itemInMainHand, false, player)) return

        val gem = Gem.fromGemItem(player.inventory.itemInMainHand)
        Frailer.activate(player, gem, SeasonSupport.fromInt(gem.season), event)
    }

    @EventHandler
    fun activateGroupFrailerPower(event: PlayerInteractEvent) {
        val player = event.player

        if (event.action != Action.LEFT_CLICK_AIR && event.action != Action.LEFT_CLICK_BLOCK) return

        if (!isPowerful(player.inventory.itemInMainHand, false, null)) return

        event.isCancelled = true

        val gem = Gem.fromGemItem(player.inventory.itemInMainHand)
        Frailer.activate(player, gem, SeasonSupport.fromInt(gem.season), event)
    }

    @EventHandler
    fun activateSingleChadStrengthPower(event: PlayerInteractEvent) {
        val player = event.player

        if (!isPowerful(player.inventory.itemInMainHand, false, player)) return

        if (!event.action.toString().contains("RIGHT")) return

        event.isCancelled = true

        val gem = Gem.fromGemItem(player.inventory.itemInMainHand)
        ChadStrength.activate(player, gem, SeasonSupport.fromInt(gem.season), event)
    }
}
