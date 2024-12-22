package com.hyperdondon.blissgemsremake.api;

import com.hyperdondon.blissgemsremake.blissgems;
import lombok.Getter;
import org.bukkit.Material;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.inventory.ItemStack;
import org.mineacademy.fo.Common;

import java.io.File;

@Getter
public final class Settings {

    public static File SettingsFile = new File(blissgems.plugin.getDataFolder(), "config.yml");
    public static YamlConfiguration config = YamlConfiguration.loadConfiguration(SettingsFile);


    public static int getSeason() {
        return config.getInt("season");
    }

    public static boolean getGiveGemOnJoin() {
        return config.getBoolean("give_gem_on_first_join");
    }

    public static boolean getAllowDrop() {
        return config.getBoolean("allow_gem_dropping");
    }

    public static boolean getAllowRemove() {
        return config.getBoolean("allow_gem_removing");
    }

    public static boolean getTexturePackLoading() {
        return config.getBoolean("texture_pack_loading");
    }

    public static boolean getUnloadCooldowns() {
        return config.getBoolean("unload_player_cooldowns_on_leave");
    }


    public static void setSeason(int number) {
        config.set("season", number);
        try {
            config.save(SettingsFile);
        } catch (Exception exc) {
            Common.error(exc);
        }

    }

    public static void setGiveGemOnJoin(boolean value) {
        config.set("give_gem_on_first_join", value);
        try {
            config.save(SettingsFile);
        } catch (Exception exc) {
            Common.error(exc);
        }

    }

    public static void setAllowDrop(boolean value) {
        config.set("allow_gem_dropping", value);
        try {
            config.save(SettingsFile);
        } catch (Exception exc) {
            Common.error(exc);
        }

    }

    public static void setAllowRemove(boolean value) {
        config.set("allow_gem_removing", value);
        try {
            config.save(SettingsFile);
        } catch (Exception exc) {
            Common.error(exc);
        }
    }

    public static void setTexturePackLoading(boolean value) {
        config.set("texture_pack_loading", value);
        try {
            config.save(SettingsFile);
        } catch (Exception exc) {
            Common.error(exc);
        }
    }

    public static void setUnloadCooldowns(boolean value) {
        config.set("UnloadCooldowns", value);
        try {
            config.save(SettingsFile);
        } catch (Exception exc) {
            Common.error(exc);
        }
    }

}
