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

    @Getter
    private static int season = config.getInt("season");
    @Getter
    private static int giveGemOnJoin = config.getInt("give_gem_on_first_join");
    @Getter
    private static int allowDrop = config.getInt("allow_gem_dropping");
    @Getter
    private static int allowRemove = config.getInt("allow_gem_removing");
    @Getter
    private static int texturePackLoading = config.getInt("texture_pack_loading");
    @Getter
    private static int unloadCooldowns = config.getInt("unload_player_cooldowns_on_leave");


    public static void updateConfig() {
        config = YamlConfiguration.loadConfiguration(SettingsFile);
        season = config.getInt("season");
        giveGemOnJoin = config.getInt("give_gem_on_first_join");
        allowDrop = config.getInt("allow_gem_dropping");
        allowRemove = config.getInt("allow_gem_removing");
        texturePackLoading = config.getInt("texture_pack_loading");
        unloadCooldowns = config.getInt("unload_player_cooldowns_on_leave");
    }

    public static void setSeason(int number) {
        config.set("season", number);
        try {
            config.save(SettingsFile);
            updateConfig();
        } catch (Exception exc) {
            Common.error(exc);
        }

    }

    public static void setGiveGemOnJoin(boolean value) {
        config.set("give_gem_on_first_join", value);
        try {
            config.save(SettingsFile);
            updateConfig();
        } catch (Exception exc) {
            Common.error(exc);
        }

    }

    public static void setAllowDrop(boolean value) {
        config.set("allow_gem_dropping", value);
        try {
            config.save(SettingsFile);
            updateConfig();
        } catch (Exception exc) {
            Common.error(exc);
        }

    }

    public static void setAllowRemove(boolean value) {
        config.set("allow_gem_removing", value);
        try {
            config.save(SettingsFile);
            updateConfig();
        } catch (Exception exc) {
            Common.error(exc);
        }
    }

    public static void setTexturePackLoading(boolean value) {
        config.set("texture_pack_loading", value);
        try {
            config.save(SettingsFile);
            updateConfig();
        } catch (Exception exc) {
            Common.error(exc);
        }
    }

    public static void setUnloadCooldowns(boolean value) {
        config.set("UnloadCooldowns", value);
        try {
            config.save(SettingsFile);
            updateConfig();
        } catch (Exception exc) {
            Common.error(exc);
        }
    }

}
