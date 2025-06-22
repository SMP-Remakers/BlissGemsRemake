package com.hyperdondon.blissgemsremake.internal.powers;

import com.github.puregero.multilib.MultiLib;
import com.hyperdondon.blissgemsremake.BlissGems;
import com.hyperdondon.blissgemsremake.api.CooldownHandler;
import com.hyperdondon.blissgemsremake.api.Energy;
import com.hyperdondon.blissgemsremake.api.Gem;
import com.hyperdondon.blissgemsremake.api.GemType;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.serializer.legacy.LegacyComponentSerializer;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.mineacademy.fo.Common;
import org.mineacademy.fo.remain.Remain;

import javax.annotation.Nullable;
import java.util.ArrayList;

public abstract class PowerHandler {
    static ArrayList<Power> gemPowers = new ArrayList<Power>();
    static GemType gemType;
    static PotionEffectType potionEffect;

    public PowerHandler(GemType pGemType, @Nullable PotionEffectType pPotionEffect) {
        gemType = pGemType;
        potionEffect = pPotionEffect;
        Common.runTimer(1, () -> {
            for (Power power : gemPowers) {
                power.runTickTimer();
            }
        });
        Common.runTimer(20, () -> {
            for (Power power : gemPowers) {
                power.runSecondTimer();
            }
        });

        Common.runTimer(1, this::runTickTimer);
        Common.runTimer(20, this::runSecondTimer);
        if (potionEffect != null) Common.runTimer(4, this::runPotionEffectTimer);
    }

    public void sendActionBar(Player player, Component actionBar) {
        Remain.sendActionBar(player, LegacyComponentSerializer.legacySection().serialize(actionBar));
    }

    public void registerPower(Power power) {
        if (gemPowers.contains(power)) return; //support for reloads
        gemPowers.add(power);
    }

    public void runSecondTimer() {
        for (Player player : MultiLib.getAllOnlinePlayers()) {
            ItemStack itemInMainHand = player.getInventory().getItemInMainHand();
            ItemStack itemInOffHand = player.getInventory().getItemInOffHand();
            if (!Gem.isGem(itemInMainHand) && !Gem.isGem(itemInOffHand))
                continue;
            ItemStack gem = (Gem.isGem(itemInMainHand)) ? itemInMainHand : itemInOffHand;
            if (Gem.getGemType(gem) != gemType)
                continue;
            String id = Gem.getGemID(gem, player);
            Component actionBar = Component.empty();

            if (isPowerful(gem, false, null)) {
                int i = 1;
                for (Power power : gemPowers) {
                    i++;
                    actionBar = actionBar.append(power.getActionText().replaceText(builder ->
                            builder
                                    .matchLiteral("[cooldown]")
                                    .replacement(BlissGems.miniMessageComponent(CooldownHandler.parseCooldown(power.getId() + ":" + id)))));
                    if (i > 1) actionBar = actionBar.append(Component.text(" "));
                }
            } else {
                //TODO Add enchanting passive
            }
            sendActionBar(player, actionBar);
        }
    }

    public void runPotionEffectTimer() {
        for (Player player : MultiLib.getAllOnlinePlayers()) {
            ItemStack itemInMainHand = player.getInventory().getItemInMainHand();
            ItemStack itemInOffHand = player.getInventory().getItemInOffHand();
            if (!Gem.isGem(itemInMainHand) && !Gem.isGem(itemInOffHand))
                continue;
            ItemStack gemItemStack = (Gem.isGem(itemInMainHand)) ? itemInMainHand : itemInOffHand;
            Gem gem = Gem.fromGemItem(gemItemStack);
            if (gem.getSeason() == 2) if (gem.getEnergy() == Energy.Damaged ||
                    gem.getEnergy() == Energy.Ruined ||
                    gem.getEnergy() == Energy.Broken) continue;
            if (gem.getSeason() == 3) if (gem.getEnergy() == Energy.Ruined ||
                    gem.getEnergy() == Energy.Broken) continue;
            if (gem.getType() != gemType)
                continue;
            int amplifier = (gem.getTier() == 1) ? 0 : 1;
            player.removePotionEffect(potionEffect);
            player.addPotionEffect(new PotionEffect(potionEffect, 40, amplifier, true, false, true));
        }
    }

    @SuppressWarnings("BooleanMethodIsAlwaysInverted")
    public boolean isPowerful(ItemStack gem, boolean supportTier1, @Nullable Player player) {
        if (!Gem.isGem(gem))
            return false;
        if (Gem.getGemType(gem) != gemType) //Check if the gem isn't a strength gem
            return false;
        if (Gem.getGemTier(gem) == 1) { //keep this last
            if (supportTier1) return true;
            if (player != null)
                player.sendMessage(BlissGems.miniMessage("<#F10303>\uD83D\uDD3A <#FD8988>You need tier 2 gem to cast this skill!"));
            return false;
        }
        return true;
    }

    public void runTickTimer() {
    }
}
