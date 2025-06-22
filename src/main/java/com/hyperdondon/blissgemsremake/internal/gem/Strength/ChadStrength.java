package com.hyperdondon.blissgemsremake.internal.gem.Strength;

import com.hyperdondon.blissgemsremake.BlissGems;
import com.hyperdondon.blissgemsremake.api.Gem;
import com.hyperdondon.blissgemsremake.api.GemType;
import com.hyperdondon.blissgemsremake.api.SeasonSupport;
import com.hyperdondon.blissgemsremake.api.util.GeometryUtil;
import com.hyperdondon.blissgemsremake.api.util.VectorList;
import com.hyperdondon.blissgemsremake.internal.powers.Power;
import lombok.Getter;
import org.bukkit.Bukkit;
import org.bukkit.Color;
import org.bukkit.Location;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.potion.PotionEffectType;
import org.jetbrains.annotations.Nullable;
import org.mineacademy.fo.Common;
import org.mineacademy.fo.annotation.AutoRegister;
import org.mineacademy.fo.remain.CompParticle;

import java.util.UUID;

@AutoRegister
public final class ChadStrength extends Power implements Listener {
    private static final VectorList<UUID, Integer, UUID> activeSingleUsePlayers = new VectorList<>();

    @Getter
    public static final ChadStrength instance = new ChadStrength();

    public ChadStrength() {
        super("Power-ChadStrength", BlissGems.miniMessageComponent("⚔" + " [cooldown]"), SeasonSupport.S1_S2_S3);
    }

    @Override
    public void activate(Player player, Gem gem, SeasonSupport seasonSupport, @Nullable Event pEvent) {
        if (activeSingleUsePlayers.containsKey(player.getUniqueId())) return;
        UUID useID = UUID.randomUUID();
        activeSingleUsePlayers.add(player.getUniqueId(), 3, useID);
        Common.runLater(40 * 20, () -> {
            if (!(activeSingleUsePlayers.getValue2(player.getUniqueId()) == useID)) return;
            activeSingleUsePlayers.remove(player.getUniqueId());
        });
    }

    @EventHandler
    public void chadStrengthAttack(EntityDamageByEntityEvent event) {
        if (event.getDamager().getType() != EntityType.PLAYER)
            return;
        Player player = (Player) event.getDamager();
        boolean isCritical = player.getFallDistance() > 0.0F &&
                !player.isOnGround() && !player.isClimbing() &&
                !player.hasPotionEffect(PotionEffectType.BLINDNESS) &&
                player.getVehicle() == null &&
                player.getAttackCooldown() > 0.9;
        if (!isCritical) return;
        if (!Gem.isGem(player.getInventory().getItemInMainHand()) && !Gem.isGem(player.getInventory().getItemInOffHand()))
            return;
        if (Gem.getGemType(player.getInventory().getItemInMainHand()) != GemType.Strength && Gem.getGemType(player.getInventory().getItemInOffHand()) != GemType.Strength) //Check if the gem isn't a strength gem
            return;
        if (!activeSingleUsePlayers.VALUE_1_LIST.containsKey(player.getUniqueId())) return;
        int chadNumber = activeSingleUsePlayers.getValue1(player.getUniqueId());
        if (chadNumber > 0) {
            activeSingleUsePlayers.setValue1(player.getUniqueId(), chadNumber - 1);
            return;
        }
        activeSingleUsePlayers.remove(player.getUniqueId());
        event.setDamage(event.getDamage() * 2);
    }

    public void singleUse(Player player, Gem gem, SeasonSupport seasonSupport) {
    }

    @Override
    public void runTickTimer() {
        for (UUID uuid : activeSingleUsePlayers.keySet()) {
            Player player = Bukkit.getPlayer(uuid);
            if (player == null) continue;
            double forward = 0.5;

            Location middle = player.getEyeLocation();
            middle = GeometryUtil.forwardsBlocks(middle, forward);
            middle = GeometryUtil.underBlocks(middle, 0.3);

            Location left = player.getEyeLocation();
            left = GeometryUtil.forwardsBlocks(left, forward);
            left = GeometryUtil.underBlocks(left, 0.3);
            left = GeometryUtil.leftBlocks(left, 0.5);
            left = GeometryUtil.backwardsBlocks(left, 0.1);

            Location right = player.getEyeLocation();
            right = GeometryUtil.forwardsBlocks(right, forward);
            right = GeometryUtil.underBlocks(right, 0.3);
            right = GeometryUtil.rightBlocks(right, 0.5);
            right = GeometryUtil.backwardsBlocks(right, 0.1);

            if (activeSingleUsePlayers.getValue1(uuid) == 3) {
                CompParticle.SMOKE_NORMAL.spawn(middle, 0, 0);
                CompParticle.SMOKE_NORMAL.spawn(left, 0, 0);
                CompParticle.SMOKE_NORMAL.spawn(right, 0, 0);
            }
            if (activeSingleUsePlayers.getValue1(uuid) == 2) {
                CompParticle.SMOKE_NORMAL.spawn(middle, 0, 0);
                CompParticle.REDSTONE.spawn(left, Color.fromRGB(241, 3, 3), 1);
                CompParticle.SMOKE_NORMAL.spawn(right, 0, 0);
            }
            if (activeSingleUsePlayers.getValue1(uuid) == 1) {
                CompParticle.SMOKE_NORMAL.spawn(middle, 0, 0);
                CompParticle.REDSTONE.spawn(left, Color.fromRGB(241, 3, 3), 1);
                CompParticle.REDSTONE.spawn(right, Color.fromRGB(241, 3, 3), 1);
            }
            if (activeSingleUsePlayers.getValue1(uuid) == 0) {
                CompParticle.REDSTONE.spawn(middle, Color.fromRGB(241, 3, 3), 1);
                CompParticle.REDSTONE.spawn(left, Color.fromRGB(241, 3, 3), 1);
                CompParticle.REDSTONE.spawn(right, Color.fromRGB(241, 3, 3), 1);
            }
        }
    }

    @Override
    public void deactivate(Player player, Gem gem, SeasonSupport seasonSupport) {

    }
}
