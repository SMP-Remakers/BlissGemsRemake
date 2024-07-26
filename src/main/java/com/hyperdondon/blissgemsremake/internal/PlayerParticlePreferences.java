package com.hyperdondon.blissgemsremake.internal;

import lombok.Getter;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerQuitEvent;
import org.mineacademy.fo.Common;
import org.mineacademy.fo.collection.SerializedMap;
import org.mineacademy.fo.database.SimpleDatabase;

import java.sql.ResultSet;
import java.util.function.Consumer;

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


    public void get(Player p, Consumer<String> consumer) {
        Common.runAsync(() -> {
            try {
                ResultSet data = this.query("SELECT * FROM PlayerParticles WHERE UUID='" + p.getUniqueId() + "'");
                consumer.accept(data.getString("Setting"));

            } catch(Throwable t) {
                Common.error(t, "Could not load data for " + p.getName());
            }
        });
    }

    public void put(Player p, String preference) {
        Common.runAsync(() -> {
            try {
                //Put Data
                ResultSet data = this.query("SELECT * FROM PlayerParticles WHERE UUID='" + p.getUniqueId() + "'");
                if (data.getString("Setting") == null) { //if it doesnt exist
                    this.insert(SerializedMap.ofArray(
                            "UUID", p.getUniqueId().toString(),
                            "Setting", preference
                    ));
                }

                else { //if this data already exists: update it instead of inserting new data
                    this.update
                            (
                    "UPDATE PlayerParticles" +
                        " SET Setting = '" + preference + "'" +
                        " WHERE UUID = '" + p.getUniqueId() + "';"
                            );
                }


            } catch(Throwable t) {
                Common.error(t, "Could not load data for " + p.getName());
            }
        });
    }
}
