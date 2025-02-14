package com.hyperdondon.blissgemsremake.internal;

import com.hyperdondon.blissgemsremake.api.Energy;
import com.hyperdondon.blissgemsremake.api.Gem;
import com.hyperdondon.blissgemsremake.api.GemType;
import com.hyperdondon.blissgemsremake.api.Settings;
import lombok.Getter;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import java.util.Random;

public final class GemGiver implements Listener {
    @Getter
    private static volatile GemGiver instance = new GemGiver();


    @EventHandler
    public void givegem(PlayerJoinEvent e) {
        if (!e.getPlayer().hasPlayedBefore() && Settings.isGiveGemOnJoinAllowed()) {
            GemType type = null;
            int randomNumber = 0;
            if (Settings.getSeason() == 1) {
                Random random = new Random();
                randomNumber = random.nextInt(6) + 1;
            }

            if (Settings.getSeason() == 2) {
                Random random = new Random();
                randomNumber = random.nextInt(7) + 1;
            }

            if (Settings.getSeason() == 3) {
                Random random = new Random();
                randomNumber = random.nextInt(8) + 1;
            }


            //randomNumber = 2;
            if (randomNumber == 1) type = GemType.Life;

            if (randomNumber == 2) type = GemType.Strength;

            if (randomNumber == 3) type = GemType.Fire;

            if (randomNumber == 4) type = GemType.Speed;

            if (randomNumber == 5) type = GemType.Wealth;

            if (randomNumber == 6) type = GemType.Wealth;

            if (randomNumber == 7) type = GemType.Astra;

            if (randomNumber == 8) type = GemType.Flux;

            //Settings.setSeason(2);
            Gem g = new Gem(type, 1, Energy.Pristine);
            e.getPlayer().getInventory().addItem(g.toItemStack());

        }
    }
}
