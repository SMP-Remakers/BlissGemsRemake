package com.hyperdondon.blissgemsremake.internal.gem.strength

import com.hyperdondon.blissgemsremake.api.CooldownHandler
import com.hyperdondon.blissgemsremake.api.Gem
import com.hyperdondon.blissgemsremake.api.SeasonSupport
import com.hyperdondon.blissgemsremake.internal.powers.ParticleUtil
import com.hyperdondon.blissgemsremake.internal.powers.Power
import com.hyperdondon.blissgemsremake.internal.util.ComponentWrapper
import com.hyperdondon.blissgemsremake.internal.util.TimeUtils
import org.bukkit.Color
import org.bukkit.entity.LivingEntity
import org.bukkit.entity.Player
import org.bukkit.event.Event
import org.bukkit.event.entity.EntityDamageByEntityEvent
import org.bukkit.event.player.PlayerInteractEvent
import org.bukkit.potion.PotionEffect
import org.bukkit.potion.PotionEffectType
import org.mineacademy.fo.Common
import org.mineacademy.fo.remain.CompParticle

object Frailer : Power("Power-Frailer", ComponentWrapper("🤺" + " [cooldown]"), SeasonSupport.S1_S2_S3) {

    override fun activate(player: Player, gem: Gem, seasonSupport: SeasonSupport, pEvent: Event?) {
        if (pEvent is EntityDamageByEntityEvent) singleUse(player, gem, seasonSupport, pEvent)
        else if (pEvent is PlayerInteractEvent) groupUse(player, gem, seasonSupport, pEvent)
    }

    fun groupUse(player: Player, gem: Gem, seasonSupport: SeasonSupport?, pEvent: PlayerInteractEvent) {
        val id = gem.id

        if (!CooldownHandler.canUseCooldown("Power-Frailer:$id")) return  //Add a "can't use power" message

        CooldownHandler.setCooldown("Power-Frailer:$id", TimeUtils.fromMinutesAndSeconds(4, 0))

        Common.tellNoPrefix(
            player,
            ComponentWrapper(
                "<#F10303>🔮 <#B8FFFB>You have activated group <white>🤺 <#F10303>Frailer <#B8FFFB>skill &7(radius 5)"
            ).toSectionSign()
        )

        for (entity in player.getNearbyEntities(5.0, 5.0, 5.0)) {
            if (entity == player) continue
            if (entity !is LivingEntity) continue
            for (pe in entity.activePotionEffects) entity.removePotionEffect(pe.type)
            entity.addPotionEffect(PotionEffect(PotionEffectType.WITHER, 40, 0))
        }


        val loc = pEvent.getPlayer().location

        ParticleUtil.spawnGenericCircle(loc, Color.fromRGB(241, 3, 3), 1.0)
        ParticleUtil.spawnGenericCircle(loc, Color.fromRGB(241, 3, 3), 2.0)
        ParticleUtil.spawnGenericCircle(loc, Color.fromRGB(241, 3, 3), 3.0)
        ParticleUtil.spawnGenericCircle(loc, Color.fromRGB(241, 3, 3), 4.0)
        ParticleUtil.spawnGenericCircle(loc, Color.fromRGB(241, 3, 3), 5.0)

        var i = 0
        Common.runTimer(6, Runnable {
            if (i < 8) {
                ParticleUtil.spawnGenericCircle(loc, Color.fromRGB(241, 3, 3), 5.0)
                i++
            } else return@Runnable
        })
    }

    fun singleUse(player: Player, gem: Gem, seasonSupport: SeasonSupport, pEvent: EntityDamageByEntityEvent) {
        val ent = pEvent.getEntity() as LivingEntity

        if (!CooldownHandler.canUseCooldown("Power-Frailer:${gem.id}")) {
            val display = CooldownHandler.parseCooldown("Power-Frailer:${gem.id}")
            if (SeasonSupport.isPresent(seasonSupport, SeasonSupport.S1_S2)) Common.tellNoPrefix(
                player,
                ComponentWrapper(
                    "<#F10303>🔮 <#FDABAA>Your <white>🤺<#F10303>Frailer <#FDABAA>skill is on cooldown for <#F10303>$display"
                ).toSectionSign()
            )
            else Common.tellNoPrefix(
                player,
                ComponentWrapper(
                    "<#F10303>🔮 <#FDABAA>Your <white>🤺<#F10303>Nullify <#FDABAA>skill is on cooldown for <#F10303>$display"
                ).toSectionSign()
            )
            return  //Add "can't use power message"
        }

        CooldownHandler.setCooldown("Power-Frailer:" + gem.id, TimeUtils.fromMinutesAndSeconds(4, 0))

        if (SeasonSupport.isPresent(seasonSupport, SeasonSupport.S1_S2)) Common.tellNoPrefix(
            player,
            ComponentWrapper(
                "<#F10303>🔮 <#B8FFFB>You have used &f🤺<#F10303>Frailer <#B8FFFB>skill on <#F10303>${pEvent.entity.name}"
            ).toSectionSign()
        )
        else Common.tellNoPrefix(
            player,
            ComponentWrapper(
                "<#F10303>🔮 <#B8FFFB>You have used &f🤺<#F10303>Nullify <#B8FFFB>skill on <#F10303>${pEvent.entity.name}"
            ).toSectionSign()
        )

        for (pe in ent.activePotionEffects) ent.removePotionEffect(pe.type)

        ent.addPotionEffect(PotionEffect(PotionEffectType.WEAKNESS, 400, 0))

        pEvent.getEntity().location.toVector().subtract(pEvent.damager.location.toVector()).normalize()
            .multiply(0.1)

        var i = 0
        Common.runTimer(0, Runnable {
            if (i < 100) {
                i++
                val point1 = pEvent.damager.location
                point1.y = point1.y + 1

                val point2 = pEvent.getEntity().getLocation()
                point2.y = point2.y + 1

                val world = point1.world
                val distance = point1.distance(point2)
                val vector = point2.toVector().subtract(point1.toVector()).normalize().multiply(0.1)
                val location = point1.clone()

                run {
                    var i = 0
                    while (i < distance * 10) {
                        CompParticle.REDSTONE.spawn(location, Color.fromRGB(241, 3, 3), 1f)
                        CompParticle.SMOKE_NORMAL.spawn(location, 0.0, 0.0)

                        location.add(vector)
                        i++
                    }
                }
            } else return@Runnable
        })
    }

    override fun deactivate(player: Player, gem: Gem, season: SeasonSupport) {
    }
}
