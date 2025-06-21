package com.hyperdondon.blissgemsremake.internal.gem.Strength;

import com.hyperdondon.blissgemsremake.BlissGems;
import com.hyperdondon.blissgemsremake.api.Gem;
import com.hyperdondon.blissgemsremake.api.SeasonSupport;
import com.hyperdondon.blissgemsremake.internal.powers.Power;
import lombok.Getter;
import net.kyori.adventure.text.Component;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.jetbrains.annotations.Nullable;

public final class ChadStrength extends Power {
    @Getter
    public volatile static ChadStrength instance = new ChadStrength();

    public ChadStrength() {
        super("Power-ChadStrength", BlissGems.miniMessageComponent("⚔" + " [cooldown]"), SeasonSupport.S1_S2_S3);
    }

    @Override
    public void activate(Player player, Gem gem, SeasonSupport seasonSupport, @Nullable Event event) {

    }

    @Override
    public void deactivate(Player player, Gem gem, SeasonSupport seasonSupport) {

    }
}
