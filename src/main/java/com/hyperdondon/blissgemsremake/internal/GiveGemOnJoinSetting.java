package com.hyperdondon.blissgemsremake.internal;

import lombok.Getter;
import org.mineacademy.fo.settings.YamlStaticConfig;

public class GiveGemOnJoinSetting extends YamlStaticConfig {
    @Getter
    private static volatile GiveGemOnJoinSetting instance = new GiveGemOnJoinSetting();


    @Override
    protected void onLoad() throws Exception {
    }
}
