package com.hyperdondon.blissgemsremake.internal

import org.bukkit.entity.Player
import org.mineacademy.fo.Common
import org.mineacademy.fo.collection.SerializedMap
import org.mineacademy.fo.database.SimpleDatabase
import java.util.function.Consumer

object PlayerParticlePreferences : SimpleDatabase() {
    override fun onConnected() {
        this.addVariable("table", "PlayerParticles")
        this.createTable(
            TableCreator.of("PlayerParticles")
                .addNotNull("UUID", "LONGTEXT")
                .add("Setting", "LONGTEXT")
                .setPrimaryColumn("UUID")
        )
    }


    fun get(p: Player, consumer: Consumer<String?>) {
        Common.runAsync(Runnable {
            try {
                val data = this.query("SELECT * FROM PlayerParticles WHERE UUID='" + p.getUniqueId() + "'")
                consumer.accept(data.getString("Setting"))
            } catch (t: Throwable) {
                Common.error(t, "Could not load data for " + p.getName())
            }
        })
    }

    fun put(p: Player, preference: String?) {
        Common.runAsync(Runnable {
            try {
                //Put Data
                val data = this.query("SELECT * FROM PlayerParticles WHERE UUID='" + p.getUniqueId() + "'")
                if (data.getString("Setting") == null) { //if it doesnt exist
                    this.insert(
                        SerializedMap.ofArray(
                            "UUID", p.getUniqueId().toString(),
                            "Setting", preference
                        )
                    )
                } else { //if this data already exists: update it instead of inserting new data
                    this.update(
                        "UPDATE PlayerParticles" +
                                " SET Setting = '" + preference + "'" +
                                " WHERE UUID = '" + p.getUniqueId() + "';"
                    )
                }
            } catch (t: Throwable) {
                Common.error(t, "Could not load data for " + p.getName())
            }
        })
    }
}
