package com.hyperdondon.blissgemsremake.internal;

import lombok.Getter;
import org.mineacademy.fo.Common;
import org.mineacademy.fo.collection.SerializedMap;
import org.mineacademy.fo.database.SimpleDatabase;

import java.sql.ResultSet;
import java.util.function.Consumer;

public final class PlayerCooldownStorer extends SimpleDatabase {

    @Getter
    private static volatile PlayerCooldownStorer instance = new PlayerCooldownStorer();


    @Override
    protected void onConnected() {
        addVariable("table", "PlayerCooldowns");
        createTable(TableCreator.of("PlayerCooldowns")
                .addNotNull("UUID", "LONGTEXT")
                .add("Cooldown", "LONGTEXT")
                .setPrimaryColumn("UUID")
        );
    }


    public void get(String uuid, Consumer<String> consumer) {
        Common.runAsync(() -> {
            try {
                ResultSet data = query("SELECT * FROM PlayerCooldowns WHERE UUID='" + uuid + "'");
                consumer.accept(data.getString("Cooldown"));

            } catch (Throwable t) {
                Common.error(t, "Could not load data for " + uuid);
            }
        });
    }

    public void put(String uuid, String cooldown) {
        Common.runAsync(() -> {
            try {
                //Put Data
                ResultSet data = query("SELECT * FROM PlayerCooldowns WHERE UUID='" + uuid + "'");
                //if it doesnt exist
                //if this data already exists: update it instead of inserting new data
                if (data.getString("Cooldown") == null) insert(SerializedMap.ofArray(
                        "UUID", uuid,
                        "Cooldown", cooldown
                ));

                else update
                        (
                                "UPDATE PlayerCooldowns" +
                                        " SET Cooldown = '" + cooldown + "'" +
                                        " WHERE UUID = '" + uuid + "';"
                        );


            } catch (Throwable t) {
                Common.error(t, "Could not put data for " + uuid);
            }
        });
    }

    public void runSQL(String command) {
        Common.runAsync(() -> {
            update
                    (
                            command

                    );
        });
    }
}
