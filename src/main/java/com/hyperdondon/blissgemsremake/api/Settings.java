package com.hyperdondon.blissgemsremake.api;

import com.hyperdondon.blissgemsremake.blissgems;
import lombok.Getter;
import org.bukkit.configuration.file.YamlConfiguration;
import org.mineacademy.fo.Common;

import java.io.File;

@Getter
public final class Settings {

    public static File SettingsFile = new File(blissgems.plugin.getDataFolder(), "config.yml");
    public static YamlConfiguration config = YamlConfiguration.loadConfiguration(SettingsFile);

    @Getter
    private static int season = config.getInt("season");
    @Getter
    private static boolean giveGemOnJoinAllowed = config.getBoolean("give_gem_on_first_join");
    @Getter
    private static boolean droppingAllowed = config.getBoolean("allow_gem_dropping");
    @Getter
    private static boolean removingAllowed = config.getBoolean("allow_gem_removing");
    @Getter
    private static boolean texturePackLoadingAllowed = config.getBoolean("texture_pack_loading");
    @Getter
    private static boolean unloadCooldowns = config.getBoolean("unload_player_cooldowns_on_leave");
    @Getter
    private static boolean metrics = config.getBoolean("metrics");

    public static void updateConfig() {
        config = YamlConfiguration.loadConfiguration(SettingsFile);
        season = config.getInt("season");
        giveGemOnJoinAllowed = config.getBoolean("give_gem_on_first_join");
        droppingAllowed = config.getBoolean("allow_gem_dropping");
        removingAllowed = config.getBoolean("allow_gem_removing");
        texturePackLoadingAllowed = config.getBoolean("texture_pack_loading");
        unloadCooldowns = config.getBoolean("unload_player_cooldowns_on_leave");
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

    public static void setdropAllowed(boolean value) {
        config.set("allow_gem_dropping", value);
        try {
            config.save(SettingsFile);
            updateConfig();
        } catch (Exception exc) {
            Common.error(exc);
        }

    }

    public static void setdropUnallowed(boolean value) {
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
        config.set("unload_player_cooldowns_on_leave", value);
        try {
            config.save(SettingsFile);
            updateConfig();
        } catch (Exception exc) {
            Common.error(exc);
        }
    }

    public static void setMetrics(boolean value) {
        config.set("metrics", value);
        try {
            config.save(SettingsFile);
            updateConfig();
        } catch (Exception exc) {
            Common.error(exc);
        }
    }

}
