package com.hyperdondon.blissgemsremake.internal.gem.Strength;

import com.hyperdondon.blissgemsremake.BlissGems;
import com.hyperdondon.blissgemsremake.api.Gem;
import com.hyperdondon.blissgemsremake.api.SeasonSupport;
import com.hyperdondon.blissgemsremake.internal.powers.Power;
import com.hyperdondon.blissgemsremake.internal.powers.PowerHandler;
import net.kyori.adventure.text.Component;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;

import javax.annotation.Nullable;

public final class Frailer extends Power {
    public Frailer() {
        super("Power-Frailer", BlissGems.miniMessageComponent("<#F10303>" + "🤺"), SeasonSupport.S1_S2, StrengthPowerHandler.getInstance());
    }

    @Override
    public void activate(Player player, Gem gem, int season, @Nullable Event event) {

    }

    @Override
    public void deactivate(Player player, Gem gem, int season) {
    }
}
