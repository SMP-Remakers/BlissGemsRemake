package com.hyperdondon.blissgemsremake.api;

import com.hyperdondon.blissgemsremake.blissgems;
import lombok.Getter;
import org.bukkit.Bukkit;

import java.time.Duration;
import java.util.HashMap;

import static net.md_5.bungee.api.ChatColor.AQUA;
import static net.md_5.bungee.api.ChatColor.GREEN;

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
        if (Cooldowns.containsKey(name)) return Cooldowns.get(name) - System.currentTimeMillis() + 1000;
        setCooldown(name, -1000);
        return getCooldown(name);
    }

    @SuppressWarnings("BooleanMethodIsAlwaysInverted")
    public static boolean canUseCooldown(String name) {
        if (!Cooldowns.containsKey(name))
            return true;
        //Bukkit.broadcastMessage(getCooldown(name).toString());
        return (getCooldown(name) <= 0);
    }

    public static String parseCooldown(long cooldown, String color) {
        Duration duration = Duration.ofMillis(cooldown);

        long minutes = duration.toMinutes();
        long seconds = duration.toSecondsPart();

        String time = "";
        if (minutes > 0) if (seconds > 0) time = minutes + "m " + seconds + "s";
        else time = minutes + "m";
        else if (seconds > 0) time = seconds + "s";


        if (time.isEmpty()) return "<green>Ready!";
        else return color + time;
    }

    public static String parseCooldown(long cooldown) {
        return parseCooldown(cooldown, "<aqua>");
    }

    public static String parseCooldown(String cooldow) {
        long cooldown = getCooldown(cooldow);
        return parseCooldown(cooldown);
    }

    public static String parseCooldown(String cooldow, String color) {
        long cooldown = getCooldown(cooldow);
        return parseCooldown(cooldown, color);
    }
}
