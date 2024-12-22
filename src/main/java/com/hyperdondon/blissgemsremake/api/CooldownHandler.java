package com.hyperdondon.blissgemsremake.api;

import lombok.Getter;
import org.bukkit.Bukkit;

import java.util.HashMap;

public final class CooldownHandler {

    @Getter
    private static HashMap<String, Long> Cooldowns;

    public static void Initialize() {
        Cooldowns = new HashMap<>();
    }

    public static void setCooldown(String name, long value) {
        Cooldowns.put(name, value + System.currentTimeMillis());
    }

    public static Long getCooldown(String name) {
        if (Cooldowns.containsKey(name)) return Cooldowns.get(name) - System.currentTimeMillis();
        setCooldown(name, 0);
        return getCooldown(name);
    }

    @SuppressWarnings("BooleanMethodIsAlwaysInverted")
    public static boolean canUseCooldown(String name) {
        if (!Cooldowns.containsKey(name))
            return true;
        //Bukkit.broadcastMessage(getCooldown(name).toString());
        return (getCooldown(name) <= 0);
    }
}
