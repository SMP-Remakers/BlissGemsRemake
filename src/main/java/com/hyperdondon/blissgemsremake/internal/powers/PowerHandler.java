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
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.mineacademy.fo.remain.Remain;

import java.util.List;

public abstract class PowerHandler {
    List<Power> gemPowers;
    GemType gemType;

    @Getter
    private static volatile PowerHandler instance;

    public PowerHandler(GemType pGemType) {
        this.gemType = pGemType;
        instance = this;
    }

    public void sendActionBar(Player player, Component actionBar) {
        Remain.sendActionBar(player, LegacyComponentSerializer.legacySection().serialize(actionBar));
    }

    public void registerPower(Power power) {
        gemPowers.add(power);
    }

    public void runTickTimer() {
        for (Player player : MultiLib.getAllOnlinePlayers()) {
            ItemStack itemInMainHand = player.getInventory().getItemInMainHand();
            ItemStack itemInOffHand = player.getInventory().getItemInOffHand();
            if (!Gem.isGem(itemInMainHand) && !Gem.isGem(itemInOffHand))
                continue;
            ItemStack gem = (Gem.isGem(itemInMainHand)) ? itemInMainHand : itemInOffHand;
            if (Gem.getGemType(gem) != GemType.Strength)
                continue;
            String id = Gem.getGemID(gem, player);
            Component actionBar = Component.empty();

            for (Power power : gemPowers)
                actionBar = actionBar.append(power.getActionText().replaceText(builder ->
                        builder
                                .match("[cooldown]")
                                .replacement(CooldownHandler.parseCooldown("Power-Frailer:" + id))));
            sendActionBar(player, actionBar);
        }
    }
}
