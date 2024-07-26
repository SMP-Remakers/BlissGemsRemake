package com.hyperdondon.blissgemsremake.api;

import com.hyperdondon.blissgemsremake.blissgems;
import org.bukkit.configuration.file.YamlConfiguration;
import org.mineacademy.fo.Common;

import java.io.File;

public final class Settings {

    public static File GetSettingsFile = new File(blissgems.plugin.getDataFolder(), "config.yml");


    public static int getSeason() {

        YamlConfiguration config = YamlConfiguration.loadConfiguration(GetSettingsFile);
        int season = config.getInt("season");

        return season;
    }

    public static boolean getGiveGemOnJoin() {

        YamlConfiguration config = YamlConfiguration.loadConfiguration(GetSettingsFile);
        boolean givegemonfirstjoin = config.getBoolean("givegemonfirstjoin");

        return givegemonfirstjoin;
    }


    public static void setSeason(int number) {

        YamlConfiguration config = YamlConfiguration.loadConfiguration(GetSettingsFile);
        config.set("season", number);
        try {
            config.save(GetSettingsFile);
        }
        catch (Exception exc){
            Common.error(exc);
        }

    }

    public static void setGiveGemOnJoin(boolean value) {

        YamlConfiguration config = YamlConfiguration.loadConfiguration(GetSettingsFile);
        config.set("givegemonfirstjoin", value);
        try {
            config.save(GetSettingsFile);
        }
        catch (Exception exc){
            Common.error(exc);
        }

    }
}
