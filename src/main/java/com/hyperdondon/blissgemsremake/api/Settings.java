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

        int season = config.getInt("season");

        return season;
    }

    public static boolean getGiveGemOnJoin() {
        boolean givegemonfirstjoin = config.getBoolean("givegemonfirstjoin");

        return givegemonfirstjoin;
    }


    public static boolean getAutoUpdateGem() {
        boolean autoupdategem = config.getBoolean("autoupdategem");

        return autoupdategem;
    }

    public static boolean getAllowDrop() {
        boolean allowdrop = config.getBoolean("allowdrop");

        return allowdrop;
    }

    public static boolean getAllowRemove() {
        boolean allowremove = config.getBoolean("allowremove");

        return allowremove;
    }

    public static boolean getTexturePackLoading() {
        boolean allowremove = config.getBoolean("texturepackloading");

        return allowremove;
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

        config.set("givegemonfirstjoin", value);
        try {
            config.save(SettingsFile);
        } catch (Exception exc) {
            Common.error(exc);
        }

    }

    public static void setAutoUpdateGem(boolean value) {

        config.set("autoupdategem", value);
        try {
            config.save(SettingsFile);
        } catch (Exception exc) {
            Common.error(exc);
        }

    }

    public static void setAllowDrop(boolean value) {

        config.set("allowdrop", value);
        try {
            config.save(SettingsFile);
        } catch (Exception exc) {
            Common.error(exc);
        }

    }

    public static void setAllowRemove(boolean value) {

        config.set("allowremove", value);
        try {
            config.save(SettingsFile);
        } catch (Exception exc) {
            Common.error(exc);
        }
    }

    public static void setTexturePackLoading(boolean value) {

        config.set("texturepackloading", value);
        try {
            config.save(SettingsFile);
        } catch (Exception exc) {
            Common.error(exc);
        }
    }

}
