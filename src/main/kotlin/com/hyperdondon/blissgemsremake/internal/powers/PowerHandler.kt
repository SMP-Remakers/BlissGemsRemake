package com.hyperdondon.blissgemsremake.internal.powers

import com.hyperdondon.blissgemsremake.api.CooldownHandler
import com.hyperdondon.blissgemsremake.api.Energy
import com.hyperdondon.blissgemsremake.api.Gem
import com.hyperdondon.blissgemsremake.api.GemType
import com.hyperdondon.blissgemsremake.internal.util.ComponentWrapper
import com.hyperdondon.blissgemsremake.internal.util.ComponentWrapper.Companion.parse
import net.kyori.adventure.text.Component
import net.kyori.adventure.text.serializer.legacy.LegacyComponentSerializer
import org.bukkit.entity.Player
import org.bukkit.inventory.ItemStack
import org.bukkit.potion.PotionEffect
import org.bukkit.potion.PotionEffectType
import org.mineacademy.fo.Common
import org.mineacademy.fo.remain.Remain

abstract class PowerHandler(var gemType: GemType, var potionEffect: PotionEffectType?) {
    init {
        Common.runTimer(1) {
            for (power in gemPowers) power.runTickTimer()
        }
        Common.runTimer(20) {
            for (power in gemPowers) power.runSecondTimer()
        }
        Common.runTimer(1) {
            this.runTickTimer()
        }
        Common.runTimer(20) {
            this.runSecondTimer()
        }
        if (potionEffect != null) Common.runTimer(4) {
            this.runPotionEffectTimer()
        }
    }

    fun sendActionBar(player: Player?, actionBar: Component) {
        Remain.sendActionBar(player, LegacyComponentSerializer.legacySection().serialize(actionBar))
    }

    fun registerPower(power: Power?) {
        if (gemPowers.contains(power)) return  //support for reloads

        gemPowers.add(power!!)
    }

    fun runSecondTimer() {
        for (player in Remain.getOnlinePlayers()) {
            val itemInMainHand = player.inventory.itemInMainHand
            val itemInOffHand = player.inventory.itemInOffHand
            if (!Gem.isGem(itemInMainHand) && !Gem.isGem(itemInOffHand)) continue
            val gem = if (Gem.isGem(itemInMainHand)) itemInMainHand else itemInOffHand
            if (Gem.getGemType(gem) != gemType) continue
            val id = Gem.getGemID(gem, player)
            var actionBar: Component = Component.empty()

            if (isPowerful(gem, false, null)) {
                var i = 1
                for (power in gemPowers) {
                    i++
                    actionBar = actionBar.append(power.actionText.component.replaceText { builder ->
                        builder
                            .matchLiteral("[cooldown]")
                            .replacement(parse(CooldownHandler.parseCooldown(power.id + ":" + id)))
                    })
                    if (i > 1) actionBar = actionBar.append(Component.text(" "))
                }
            } else {
                //TODO Add enchanting passive
            }
            sendActionBar(player, actionBar)
        }
    }

    fun runPotionEffectTimer() {
        for (player in Remain.getOnlinePlayers()) {
            val itemInMainHand = player.inventory.itemInMainHand
            val itemInOffHand = player.inventory.itemInOffHand
            if (!Gem.isGem(itemInMainHand) && !Gem.isGem(itemInOffHand)) continue
            val gemItemStack = if (Gem.isGem(itemInMainHand)) itemInMainHand else itemInOffHand
            val gem = Gem.fromGemItem(gemItemStack)
            if (gem.season == 2) if (gem.energy == Energy.Damaged || gem.energy == Energy.Ruined || gem.energy == Energy.Broken) continue
            if (gem.season == 3) if (gem.energy == Energy.Ruined ||
                gem.energy == Energy.Broken
            ) continue
            if (gem.type != gemType) continue
            val amplifier = if (gem.tier == 1) 0 else 1

            if (potionEffect != null) {
                player.removePotionEffect(potionEffect!!)
                player.addPotionEffect(PotionEffect(potionEffect!!, 40, amplifier, true, false, true))
            }
        }
    }

    fun isPowerful(gem: ItemStack?, supportTier1: Boolean, player: Player?): Boolean {
        if (!Gem.isGem(gem)) return false
        if (Gem.getGemType(gem!!) != gemType)  //Check if the gem isn't a strength gem
            return false
        if (Gem.getGemTier(gem) == 1) { //keep this last
            if (supportTier1) return true
            if (player != null) Common.tellNoPrefix(
                player,
                ComponentWrapper("<#F10303>\uD83D\uDD3A <#FD8988>You need tier 2 gem to cast this skill!").toSectionSign()
            )
            return false
        }
        return true
    }

    fun runTickTimer() {
    }

    companion object {
        var gemPowers: ArrayList<Power> = ArrayList<Power>()
    }
}
