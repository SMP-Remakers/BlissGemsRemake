package com.hyperdondon.blissgemsremake.internal

import org.mineacademy.fo.Common
import org.mineacademy.fo.collection.SerializedMap
import org.mineacademy.fo.database.SimpleDatabase
import java.util.function.Consumer

object PlayerCooldownStorer : SimpleDatabase() {
    override fun onConnected() {
        addVariable("table", "PlayerCooldowns")
        createTable(
            TableCreator.of("PlayerCooldowns")
                .addNotNull("UUID", "LONGTEXT")
                .add("Cooldown", "LONGTEXT")
                .setPrimaryColumn("UUID")
        )
    }


    fun get(uuid: String?, consumer: Consumer<String?>) {
        Common.runAsync(Runnable {
            try {
                val data = query("SELECT * FROM PlayerCooldowns WHERE UUID='" + uuid + "'")
                consumer.accept(data.getString("Cooldown"))
            } catch (t: Throwable) {
                Common.error(t, "Could not load data for " + uuid)
            }
        })
    }

    fun put(uuid: String?, cooldown: String?) {
        Common.runAsync(Runnable {
            try {
                //Put Data
                val data = query("SELECT * FROM PlayerCooldowns WHERE UUID='" + uuid + "'")
                //if it doesnt exist
                //if this data already exists: update it instead of inserting new data
                if (data.getString("Cooldown") == null) insert(
                    SerializedMap.ofArray(
                        "UUID", uuid,
                        "Cooldown", cooldown
                    )
                )
                else update(
                    "UPDATE PlayerCooldowns" +
                            " SET Cooldown = '" + cooldown + "'" +
                            " WHERE UUID = '" + uuid + "';"
                )
            } catch (t: Throwable) {
                Common.error(t, "Could not put data for " + uuid)
            }
        })
    }

    fun runSQL(command: String) {
        Common.runAsync(Runnable {
            update(
                command

            )
        })
    }
}
