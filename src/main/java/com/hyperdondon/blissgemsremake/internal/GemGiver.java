package com.hyperdondon.blissgemsremake.internal;

import lombok.Getter;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public final class GemGiver implements Listener {
    @Getter
    private static volatile GemGiver instance = new GemGiver();

    public void OnJoin(PlayerJoinEvent e) {
        if (!e.getPlayer().hasPlayedBefore()) {
            
        }
    }
}
