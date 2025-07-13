package com.hyperdondon.blissgemsremake.internal.gem.strength

import com.hyperdondon.blissgemsremake.api.Gem
import com.hyperdondon.blissgemsremake.api.GemType
import com.hyperdondon.blissgemsremake.api.SeasonSupport
import com.hyperdondon.blissgemsremake.internal.powers.Power
import com.hyperdondon.blissgemsremake.internal.util.ComponentWrapper
import com.hyperdondon.blissgemsremake.internal.util.GeometryUtil
import com.hyperdondon.blissgemsremake.internal.util.KotlinObjectAutoRegister
import com.hyperdondon.blissgemsremake.internal.util.VectorList
import org.bukkit.Bukkit
import org.bukkit.Color
import org.bukkit.entity.EntityType
import org.bukkit.entity.Player
import org.bukkit.event.Event
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.entity.EntityDamageByEntityEvent
import org.bukkit.potion.PotionEffectType
import org.mineacademy.fo.Common
import org.mineacademy.fo.remain.CompParticle
import java.util.*

@KotlinObjectAutoRegister
object ChadStrength : Power("Power-ChadStrength", ComponentWrapper("⚔" + " [cooldown]"), SeasonSupport.S1_S2_S3),
    Listener {
    val activeSingleUsePlayers: VectorList<UUID, Int?, UUID?> = VectorList()

    override fun activate(player: Player, gem: Gem, seasonSupport: SeasonSupport, pEvent: Event?) {
        if (activeSingleUsePlayers.containsKey(player.uniqueId)) return
        val useID = UUID.randomUUID()
        activeSingleUsePlayers.add(player.uniqueId, 3, useID)
        Common.runLater(40 * 20, Runnable {
            if (activeSingleUsePlayers.getValue2(player.uniqueId) !== useID) return@Runnable
            activeSingleUsePlayers.remove(player.uniqueId)
        })
    }

    @EventHandler
    fun chadStrengthAttack(event: EntityDamageByEntityEvent) {
        if (event.damager.type != EntityType.PLAYER) return

        val player = event.damager as Player

        var isCritical = false
        try {
            isCritical =
                event.isCritical //This wasn't implemented in older minecraft versions. I don't exactly know when it was added.
        } catch (_: Throwable) {
            player.fallDistance > 0.0f && !player.isOnGround && !player.isClimbing && !player.hasPotionEffect(
                PotionEffectType.BLINDNESS
            ) && player.vehicle == null && player.attackCooldown > 0.9
        }

        if (!isCritical) return

        if (!Gem.isGem(player.inventory.itemInMainHand) && !Gem.isGem(
                player.inventory.itemInOffHand
            )
        ) return
        if (Gem.getGemType(
                player.inventory.itemInMainHand
            ) != GemType.Strength && Gem.getGemType(player.inventory.itemInOffHand) != GemType.Strength
        )  //Check if the gem isn't a strength gem
            return
        if (!activeSingleUsePlayers.value1list.containsKey(player.uniqueId)) return
        val chadNumber: Int = activeSingleUsePlayers.getValue1(player.uniqueId)!!
        if (chadNumber > 0) {
            activeSingleUsePlayers.setValue1(player.uniqueId, chadNumber - 1)
            return
        }
        activeSingleUsePlayers.remove(player.uniqueId)
        event.damage = event.damage * 2
    }

    fun singleUse(player: Player, gem: Gem, seasonSupport: SeasonSupport) {
    }

    override fun runTickTimer() {
        for (uuid in activeSingleUsePlayers.keySet()) {
            val player = Bukkit.getPlayer(uuid!!)
            if (player == null) continue
            val forward = 0.5

            var middle = player.eyeLocation
            middle = GeometryUtil.forwardsBlocks(middle, forward)
            middle = GeometryUtil.underBlocks(middle, 0.3)

            var left = player.eyeLocation
            left = GeometryUtil.forwardsBlocks(left, forward)
            left = GeometryUtil.underBlocks(left, 0.3)
            left = GeometryUtil.leftBlocks(left, 0.5)
            left = GeometryUtil.backwardsBlocks(left, 0.1)

            var right = player.eyeLocation
            right = GeometryUtil.forwardsBlocks(right, forward)
            right = GeometryUtil.underBlocks(right, 0.3)
            right = GeometryUtil.rightBlocks(right, 0.5)
            right = GeometryUtil.backwardsBlocks(right, 0.1)

            if (activeSingleUsePlayers.getValue1(uuid) == 3) {
                CompParticle.SMOKE_NORMAL.spawn(middle, 0.0, 0.0)
                CompParticle.SMOKE_NORMAL.spawn(left, 0.0, 0.0)
                CompParticle.SMOKE_NORMAL.spawn(right, 0.0, 0.0)
            }
            if (activeSingleUsePlayers.getValue1(uuid) == 2) {
                CompParticle.SMOKE_NORMAL.spawn(middle, 0.0, 0.0)
                CompParticle.REDSTONE.spawn(left, Color.fromRGB(241, 3, 3), 1f)
                CompParticle.SMOKE_NORMAL.spawn(right, 0.0, 0.0)
            }
            if (activeSingleUsePlayers.getValue1(uuid) == 1) {
                CompParticle.SMOKE_NORMAL.spawn(middle, 0.0, 0.0)
                CompParticle.REDSTONE.spawn(left, Color.fromRGB(241, 3, 3), 1f)
                CompParticle.REDSTONE.spawn(right, Color.fromRGB(241, 3, 3), 1f)
            }
            if (activeSingleUsePlayers.getValue1(uuid) == 0) {
                CompParticle.REDSTONE.spawn(middle, Color.fromRGB(241, 3, 3), 1f)
                CompParticle.REDSTONE.spawn(left, Color.fromRGB(241, 3, 3), 1f)
                CompParticle.REDSTONE.spawn(right, Color.fromRGB(241, 3, 3), 1f)
            }
        }
    }

    override fun deactivate(player: Player, gem: Gem, seasonSupport: SeasonSupport) {
    }
}
