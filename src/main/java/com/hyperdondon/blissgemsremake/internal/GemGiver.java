package com.hyperdondon.blissgemsremake.internal;

import com.hyperdondon.blissgemsremake.api.Settings;
import lombok.Getter;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import java.util.Random;

public final class GemGiver implements Listener {
    @Getter
    private static volatile GemGiver instance = new GemGiver();

    public void OnJoin(PlayerJoinEvent e) {
        if (!e.getPlayer().hasPlayedBefore()) {
            if (Settings.getGiveGemOnJoin()) {
                int randomNumber;
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

                
            }
        }
    }
}
