package com.hyperdondon.blissgemsremake.internal;

import com.hyperdondon.blissgemsremake.internal.gems.Strength.Powers;
import lombok.Getter;
import org.bukkit.Bukkit;
import org.bukkit.NamespacedKey;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.persistence.PersistentDataType;
import org.mineacademy.fo.Common;
import org.mineacademy.fo.collection.SerializedMap;
import org.mineacademy.fo.database.SimpleDatabase;

import java.sql.ResultSet;
import java.util.Objects;
import java.util.UUID;
import java.util.function.Consumer;

public final class PlayerCooldownStorer extends SimpleDatabase {

    @Getter
    private static volatile PlayerCooldownStorer instance = new PlayerCooldownStorer();





    @Override
    protected void onConnected() {
        this.addVariable("table", "PlayerCooldowns");
        this.createTable(TableCreator.of("PlayerCooldowns")
                .addNotNull("UUID", "LONGTEXT")
                .add("Cooldown", "LONGTEXT")
                .setPrimaryColumn("UUID")
        );
    }


    public void get(String uuid, Consumer<String> consumer) {
        Common.runAsync(() -> {
            try {
                ResultSet data = this.query("SELECT * FROM PlayerCooldowns WHERE UUID='" + uuid + "'");
                consumer.accept(data.getString("Cooldown"));

            } catch(Throwable t) {
                Common.error(t, "Could not load data for " + uuid);
            }
        });
    }

    public void put(String uuid, String cooldown) {
        Common.runAsync(() -> {
            try {
                //Put Data
                ResultSet data = this.query("SELECT * FROM PlayerCooldowns WHERE UUID='" + uuid + "'");
                if (data.getString("Cooldown") == null) { //if it doesnt exist
                    this.insert(SerializedMap.ofArray(
                            "UUID", uuid,
                            "Cooldown", cooldown
                    ));
                }

                else { //if this data already exists: update it instead of inserting new data
                    this.update
                            (
                    "UPDATE PlayerCooldowns" +
                        " SET Cooldown = '" + cooldown + "'" +
                        " WHERE UUID = '" + uuid + "';"
                            );
                }


            } catch(Throwable t) {
                Common.error(t, "Could not load data for " + uuid);
            }
        });
    }

    public void updatesql(String command) {
        Common.runAsync(() -> {
            this.update
                    (
                        command

            );
        });
    }
}
