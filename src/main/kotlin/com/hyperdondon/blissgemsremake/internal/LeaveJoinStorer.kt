package com.hyperdondon.blissgemsremake.internal

import com.hyperdondon.blissgemsremake.api.CooldownHandler
import com.hyperdondon.blissgemsremake.api.Gem
import com.hyperdondon.blissgemsremake.api.GemType
import com.hyperdondon.blissgemsremake.internal.util.KotlinObjectAutoRegister
import org.bukkit.NamespacedKey
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerJoinEvent
import org.bukkit.event.player.PlayerQuitEvent
import org.bukkit.inventory.ItemStack
import org.bukkit.persistence.PersistentDataType
import java.util.*
import java.util.function.Consumer

@KotlinObjectAutoRegister
object LeaveJoinStorer : Listener {
    @EventHandler
    fun Store(e: PlayerQuitEvent) {
        val p = e.getPlayer()
        for (gem in p.inventory.contents)
            if (Gem.isGem(gem)) {
                val idkey = NamespacedKey("blissgems", "gem-id") //will be used to get the gem id
                val HasID = gem!!.itemMeta.persistentDataContainer.has(idkey, PersistentDataType.STRING)

                if (HasID) {
                    val id = gem.itemMeta.persistentDataContainer.get(idkey, PersistentDataType.STRING)
                    val set: MutableSet<MutableMap.MutableEntry<String?, Long?>> =
                        HashSet<MutableMap.MutableEntry<String?, Long?>>(CooldownHandler.cooldowns.entries)
                    for (entry in set) {
                        checkNotNull(id)
                        if (entry.key!!.contains(id)) SaveAndUnload(entry.key)
                    }
                } else
                    for (power in GetPowers(Gem.fromGemItem(gem)))
                        SaveAndUnload(
                            power + ":" + p.getUniqueId() + ": " + Gem.getGemType(gem)
                                .toString() + " Tier " + Gem.getGemTier(gem).toString()
                        )
            }
    }

    @EventHandler
    fun loadOnJoin(e: PlayerJoinEvent) {
        val p = e.getPlayer()
        for (gem in p.getInventory().getContents()) if (Gem.isGem(gem)) {
            val idkey = NamespacedKey("blissgems", "gem-id") //will be used to get the gem id
            val HasID =
                gem!!.getItemMeta().getPersistentDataContainer().has<String?, String?>(idkey, PersistentDataType.STRING)
            var id: String? = ""
            if (HasID) id =
                gem.getItemMeta().getPersistentDataContainer().get<String?, String?>(idkey, PersistentDataType.STRING)
            else id =
                p.getUniqueId().toString() + ": " + Gem.getGemType(gem).toString() + " Tier " + Gem.getGemTier(gem)
                    .toString()
            for (power in GetPowers(Gem.fromGemItem(gem))) LoadAndRemove(power + ":" + id)
        }
    }

    fun SaveAndUnload(name: String?) {
        PlayerCooldownStorer.put(name, CooldownHandler.getCooldown(name).toString())
        CooldownHandler.cooldowns.remove(name)
    }

    fun LoadAndRemove(name: String?) {
        PlayerCooldownStorer.get(name, Consumer { value: String? ->
            if (!Objects.isNull(value)) {
                CooldownHandler.setCooldown(name, value!!.toLong())
                PlayerCooldownStorer.runSQL("DELETE FROM PlayerCooldowns" + " WHERE UUID='" + name + "';")
            }
        })
    }

    fun GetPowers(gem: ItemStack): MutableList<String?> {
        return GetPowers(Gem.fromGemItem(gem))
    }

    fun GetPowers(gem: Gem): MutableList<String?> {
        val Powers: MutableList<String?> = ArrayList<String?>()
        if (gem.getType() == GemType.Strength) {
            Powers.add("Power-Frailer")
            Powers.add("Power-Enchanting")
            Powers.add("Power-ChadStrength")
            if (gem.getSeason() > 2) Powers.add("Power-Bounty")
        }

        if (gem.getType() == GemType.Speed) {
            Powers.add("Power-SpeedStorm")
            Powers.add("Power-Enchanting")
            if (gem.getSeason() <= 2) Powers.add("Power-SlothsSedative")
            if (gem.getSeason() > 2) {
                Powers.add("Power-Blur")
                Powers.add("Power-TerminalVelocity")
            }
        }
        return Powers
    }
}
