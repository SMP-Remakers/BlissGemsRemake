package com.hyperdondon.blissgemsremake.api;

import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;

public final class CooldownHandler {
    @Getter
    private static HashMap<String, Long> Cooldowns;

    CooldownHandler() {
        Cooldowns = new HashMap<>();
    }

    public static void setCooldown(String name, Long value) {
        Cooldowns.put(name, value);
    }

    public static Long getCooldown(String name) {
        if (Cooldowns.containsKey(name)) return Cooldowns.get(name);
        return null;
    }

    public static boolean canUseCooldown(String name) {
        if (!Cooldowns.containsKey(name))
            return true;
        return getCooldown(name) - System.currentTimeMillis() < 0;
    }
}
