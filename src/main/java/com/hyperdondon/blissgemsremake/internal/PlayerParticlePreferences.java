package com.hyperdondon.blissgemsremake.internal;

import lombok.Getter;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.mineacademy.fo.Common;
import org.mineacademy.fo.collection.SerializedMap;
import org.mineacademy.fo.database.SimpleDatabase;

import java.sql.ResultSet;

public final class PlayerParticlePreferences extends SimpleDatabase {

    @Getter
    private static volatile PlayerParticlePreferences instance = new PlayerParticlePreferences();

    @Override
    protected void onConnected() {
        this.addVariable("table", "PlayerParticles");
        this.createTable(TableCreator.of("PlayerParticles")
                .addNotNull("UUID", "LONGTEXT")
                .add("Setting", "LONGTEXT")
                .setPrimaryColumn("UUID")
        );
    }


    public String get(Player p) {
        Common.runAsync(() -> {
            try {
                ResultSet data = this.query("SELECT * FROM PlayerParticles WHERE UUID='" + p.getUniqueId() + "'");
                Bukkit.broadcastMessage(data.getString("Setting").toString());
                return data.getString("Setting").toString();
            } catch(Throwable t) {
                Common.error(t, "Could not load data for " + p.getName());
            }
        });


        return "skibidi?";
    }

    public void put(Player p, String preference) {
        Common.runAsync(() -> {
            try {
                this.insert(SerializedMap.ofArray(
                        "UUID", "test",
                        "Setting", "test"
                ));
            } catch(Throwable t) {
                Common.error(t, "Could not load data for " + p.getName());
            }
        });
    }
}
