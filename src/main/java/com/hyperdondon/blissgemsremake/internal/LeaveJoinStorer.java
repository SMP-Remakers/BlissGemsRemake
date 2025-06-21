package com.hyperdondon.blissgemsremake.internal;

import com.hyperdondon.blissgemsremake.api.CooldownHandler;
import com.hyperdondon.blissgemsremake.api.Gem;
import com.hyperdondon.blissgemsremake.api.GemType;
import lombok.Getter;
import org.bukkit.Bukkit;
import org.bukkit.NamespacedKey;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.persistence.PersistentDataType;
import org.mineacademy.fo.annotation.AutoRegister;

import java.util.*;

@AutoRegister
public final class LeaveJoinStorer implements Listener {
    @Getter
    private static volatile LeaveJoinStorer instance = new LeaveJoinStorer();

    @EventHandler
    public void Store(PlayerQuitEvent e) {
        Player p = e.getPlayer();
        for (ItemStack gem : p.getInventory().getContents())
            if (Gem.isGem(gem)) {
                NamespacedKey idkey = new NamespacedKey("blissgems", "gem-id"); //will be used to get the gem id
                boolean HasID = gem.getItemMeta().getPersistentDataContainer().has(idkey, PersistentDataType.STRING);
                if (HasID) {
                    String id = gem.getItemMeta().getPersistentDataContainer().get(idkey, PersistentDataType.STRING);
                    Set<Map.Entry<String, Long>> set = new HashSet<>(CooldownHandler.getCooldowns().entrySet());
                    for (Map.Entry<String, Long> entry : set) {
                        assert id != null;
                        if (entry.getKey().contains(id)) SaveAndUnload(entry.getKey());
                    }
                } else
                    for (String power : GetPowers(Gem.fromGemItem(gem)))
                        SaveAndUnload(power + ":" + p.getUniqueId() + ": " + Gem.getGemType(gem).toString() + " Tier " + String.valueOf(Gem.getGemTier(gem)));
            }
    }

    @EventHandler
    public void Load(PlayerJoinEvent e) {
        Player p = e.getPlayer();
        for (ItemStack gem : p.getInventory().getContents())
            if (Gem.isGem(gem)) {
                NamespacedKey idkey = new NamespacedKey("blissgems", "gem-id"); //will be used to get the gem id
                boolean HasID = gem.getItemMeta().getPersistentDataContainer().has(idkey, PersistentDataType.STRING);
                String id = "";
                if (HasID)
                    id = gem.getItemMeta().getPersistentDataContainer().get(idkey, PersistentDataType.STRING);
                else
                    id = p.getUniqueId() + ": " + Gem.getGemType(gem).toString() + " Tier " + String.valueOf(Gem.getGemTier(gem));
                for (String power : GetPowers(Gem.fromGemItem(gem)))
                    LoadAndRemove(power + ":" + id);
            }
    }

    public static void SaveAndUnload(String name) {
        PlayerCooldownStorer.getInstance().put(name, CooldownHandler.getCooldown(name).toString());
        CooldownHandler.getCooldowns().remove(name);
    }

    public static void LoadAndRemove(String name) {

        PlayerCooldownStorer.getInstance().get(name, value ->
        {
            if (!Objects.isNull(value)) {
                CooldownHandler.setCooldown(name, Long.parseLong(value));
                PlayerCooldownStorer.getInstance().runSQL("DELETE FROM PlayerCooldowns" + " WHERE UUID='" + name + "';");
            }
        });
    }

    public static List<String> GetPowers(ItemStack gem) {
        return GetPowers(Gem.fromGemItem(gem));
    }

    public static List<String> GetPowers(Gem gem) {
        List<String> Powers = new ArrayList<String>();
        if (gem.getType() == GemType.Strength) {
            Powers.add("Power-Frailer");
            Powers.add("Power-Enchanting");
            Powers.add("Power-ChadStrength");
            if (gem.getSeason() > 2)
                Powers.add("Power-Bounty");
        }

        if (gem.getType() == GemType.Speed) {
            Powers.add("Power-SpeedStorm");
            Powers.add("Power-Enchanting");
            if (gem.getSeason() <= 2)
                Powers.add("Power-SlothsSedative");
            if (gem.getSeason() > 2) {
                Powers.add("Power-Blur");
                Powers.add("Power-TerminalVelocity");
            }
        }
        return Powers;
    }
}
