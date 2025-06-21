package com.hyperdondon.blissgemsremake.internal.powers;

import com.hyperdondon.blissgemsremake.api.Gem;
import com.hyperdondon.blissgemsremake.api.SeasonSupport;
import lombok.Getter;
import net.kyori.adventure.text.Component;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;

import javax.annotation.Nullable;

@Getter
public abstract class Power {
    private final Component actionText;
    private final String id;
    private final SeasonSupport seasonSupport;

    public Power(String pId, Component pActionText, SeasonSupport pSeason) {
        actionText = pActionText;
        id = pId;
        seasonSupport = pSeason;
    }

    public void runTickTimer() {
    }

    public void runSecondTimer() {
    }

    public abstract void activate(Player player, Gem gem, SeasonSupport seasonSupport, @Nullable Event event);

    public abstract void deactivate(Player player, Gem gem, SeasonSupport seasonSupport);
}
