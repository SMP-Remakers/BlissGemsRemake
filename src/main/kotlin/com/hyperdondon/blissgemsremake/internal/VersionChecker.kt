package com.hyperdondon.blissgemsremake.internal

import org.bukkit.Bukkit
import org.mineacademy.fo.MinecraftVersion

object VersionChecker {
    @JvmStatic
    fun OlderThanNBTChange(): Boolean {
        //return true; //for testing
        if (MinecraftVersion.olderThan(MinecraftVersion.V.v1_20)) return true
        else return Bukkit.getBukkitVersion().contains("1.20.1") ||
                Bukkit.getBukkitVersion().contains("1.20.2") ||
                Bukkit.getBukkitVersion().contains("1.20.3") ||
                Bukkit.getBukkitVersion().contains("1.20.4")
    }
}
