package com.hyperdondon.blissgemsremake.api;

import com.hyperdondon.blissgemsremake.blissgems;
import org.bukkit.Material;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.inventory.ItemStack;
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


    public static boolean getAutoUpdateGem() {
        YamlConfiguration config = YamlConfiguration.loadConfiguration(GetSettingsFile);
        boolean autoupdategem = config.getBoolean("autoupdategem");

        return autoupdategem;
    }

    public static boolean getAllowDrop() {
        YamlConfiguration config = YamlConfiguration.loadConfiguration(GetSettingsFile);
        boolean allowdrop = config.getBoolean("allowdrop");

        return allowdrop;
    }

    public static boolean getAllowRemove() {
        YamlConfiguration config = YamlConfiguration.loadConfiguration(GetSettingsFile);
        boolean allowremove = config.getBoolean("allowremove");

        return allowremove;
    }

    public static boolean getTexturePackLoading() {
        YamlConfiguration config = YamlConfiguration.loadConfiguration(GetSettingsFile);
        boolean allowremove = config.getBoolean("texturepackloading");

        return allowremove;
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

    public static void setAutoUpdateGem(boolean value) {

        YamlConfiguration config = YamlConfiguration.loadConfiguration(GetSettingsFile);
        config.set("autoupdategem", value);
        try {
            config.save(GetSettingsFile);
        }
        catch (Exception exc){
            Common.error(exc);
        }

    }

    public static void setAllowDrop(boolean value) {

        YamlConfiguration config = YamlConfiguration.loadConfiguration(GetSettingsFile);
        config.set("allowdrop", value);
        try {
            config.save(GetSettingsFile);
        }
        catch (Exception exc){
            Common.error(exc);
        }

    }

    public static void setAllowRemove(boolean value) {

        YamlConfiguration config = YamlConfiguration.loadConfiguration(GetSettingsFile);
        config.set("allowremove", value);
        try {
            config.save(GetSettingsFile);
        } catch (Exception exc) {
            Common.error(exc);
        }
    }

    public static void setTexturePackLoading(boolean value) {

        YamlConfiguration config = YamlConfiguration.loadConfiguration(GetSettingsFile);
        config.set("texturepackloading", value);
        try {
            config.save(GetSettingsFile);
        }
        catch (Exception exc){
            Common.error(exc);
        }
    }

}
