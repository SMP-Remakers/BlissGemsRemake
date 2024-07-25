package com.hyperdondon.blissgemsremake.internal;

import lombok.Getter;
import org.mineacademy.fo.settings.YamlStaticConfig;

public final class Settings extends YamlStaticConfig {


    public static int SEASON;
    public static int MODE;
    public static boolean givegemonfirstjoin;

    @Getter
    private static volatile Settings instance = new Settings();





    @Override
    protected void onLoad() throws Exception {
        String path = "config.yml";
        instance.loadConfiguration("config.yml");
    }
}
