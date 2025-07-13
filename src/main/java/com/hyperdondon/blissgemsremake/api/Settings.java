package com.hyperdondon.blissgemsremake.api;

import com.hyperdondon.blissgemsremake.BlissGems;
import org.bukkit.configuration.file.YamlConfiguration;
import org.mineacademy.fo.Common;

import java.io.File;

public final class Settings {

    public static File settingsFile = new File(BlissGems.getInstance().getDataFolder(), "config.yml");
    public static YamlConfiguration config = YamlConfiguration.loadConfiguration(settingsFile);

    public static int season = config.getInt("season");

    public static boolean giveGemOnJoinAllowed = config.getBoolean("give_gem_on_first_join");

    public static boolean droppingAllowed = config.getBoolean("allow_gem_dropping");

    public static boolean removingAllowed = config.getBoolean("allow_gem_removing");

    public static boolean texturePackLoadingAllowed = config.getBoolean("texture_pack_loading");

    public static boolean unloadCooldowns = config.getBoolean("unload_player_cooldowns_on_leave");

    public static boolean metrics = config.getBoolean("metrics");

    public static void updateConfig() {
        config = YamlConfiguration.loadConfiguration(settingsFile);
        season = config.getInt("season");
        giveGemOnJoinAllowed = config.getBoolean("give_gem_on_first_join");
        droppingAllowed = config.getBoolean("allow_gem_dropping");
        removingAllowed = config.getBoolean("allow_gem_removing");
        texturePackLoadingAllowed = config.getBoolean("texture_pack_loading");
        unloadCooldowns = config.getBoolean("unload_player_cooldowns_on_leave");
        metrics = config.getBoolean("metrics");
    }

    public static void setSeason(int number) {
        config.set("season", number);
        try {
            config.save(settingsFile);
            updateConfig();
        } catch (Exception exc) {
            Common.error(exc);
        }

    }

    public static void setGiveGemOnJoin(boolean value) {
        config.set("give_gem_on_first_join", value);
        try {
            config.save(settingsFile);
            updateConfig();
        } catch (Exception exc) {
            Common.error(exc);
        }

    }

    public static void setdropAllowed(boolean value) {
        config.set("allow_gem_dropping", value);
        try {
            config.save(settingsFile);
            updateConfig();
        } catch (Exception exc) {
            Common.error(exc);
        }

    }

    public static void setdropUnallowed(boolean value) {
        config.set("allow_gem_removing", value);
        try {
            config.save(settingsFile);
            updateConfig();
        } catch (Exception exc) {
            Common.error(exc);
        }
    }

    public static void setTexturePackLoading(boolean value) {
        config.set("texture_pack_loading", value);
        try {
            config.save(settingsFile);
            updateConfig();
        } catch (Exception exc) {
            Common.error(exc);
        }
    }

    public static void setUnloadCooldowns(boolean value) {
        config.set("unload_player_cooldowns_on_leave", value);
        try {
            config.save(settingsFile);
            updateConfig();
        } catch (Exception exc) {
            Common.error(exc);
        }
    }

    public static void setMetrics(boolean value) {
        config.set("metrics", value);
        try {
            config.save(settingsFile);
            updateConfig();
        } catch (Exception exc) {
            Common.error(exc);
        }
    }

}
