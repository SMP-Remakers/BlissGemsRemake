package com.hyperdondon.blissgemsremake.internal.powers;

import com.github.puregero.multilib.MultiLib;
import com.hyperdondon.blissgemsremake.BlissGems;
import com.hyperdondon.blissgemsremake.api.CooldownHandler;
import com.hyperdondon.blissgemsremake.api.Gem;
import com.hyperdondon.blissgemsremake.api.GemType;
import lombok.Getter;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.TextReplacementConfig;
import net.kyori.adventure.text.serializer.legacy.LegacyComponentSerializer;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.scheduler.BukkitRunnable;
import org.mineacademy.fo.Common;
import org.mineacademy.fo.remain.Remain;

import java.util.ArrayList;
import java.util.List;

public abstract class PowerHandler {
    ArrayList<Power> gemPowers = new ArrayList<Power>();
    GemType gemType;

    @Getter
    private static volatile PowerHandler instance;

    public PowerHandler(GemType pGemType) {
        gemType = pGemType;
        instance = this;
        new BukkitRunnable() {
            @Override
            public void run() {
                instance.runTickTimer();
            }
        }.runTaskTimer(BlissGems.getInstance(), 0, 0);

        new BukkitRunnable() {
            @Override
            public void run() {
                instance.runSecondTimer();
            }
        }.runTaskTimer(BlissGems.getInstance(), 0, 20);
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

            int i = 1;
            for (Power power : gemPowers) {
                i++;
                actionBar = actionBar.append(power.getActionText().replaceText(builder ->
                        builder
                                .matchLiteral("[cooldown]")
                                .replacement(BlissGems.miniMessageComponent(CooldownHandler.parseCooldown(power.getId() + ":" + id)))));
                if (i > 1) actionBar = actionBar.append(Component.text(" "));
            }
            sendActionBar(player, actionBar);
        }
    }

    public void runTickTimer() {
    }
}
