package com.hyperdondon.blissgemsremake.internal;

import com.hyperdondon.blissgemsremake.api.CooldownHandler;
import com.hyperdondon.blissgemsremake.api.Gem;
import lombok.Getter;
import org.bukkit.NamespacedKey;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.persistence.PersistentDataType;

import java.util.Map;
import java.util.Objects;
import java.util.UUID;

public class LeaveJoinStorer implements Listener {
    @Getter
    private static volatile LeaveJoinStorer instance = new LeaveJoinStorer();

    //@EventHandler disable this shit
    public void Store(PlayerQuitEvent e) {
        Player p = e.getPlayer();
        for (ItemStack gem : p.getInventory().getContents())
            if (Gem.IsGem(gem)) {
                NamespacedKey idkey = new NamespacedKey("blissgems", "gem-id"); //will be used to get the gem id
                boolean HasID = gem.getItemMeta().getPersistentDataContainer().has(idkey, PersistentDataType.STRING);
                String id = "";
                if (HasID)
                    id = gem.getItemMeta().getPersistentDataContainer().get(idkey, PersistentDataType.STRING);
                if (HasID) {
                    for (Map.Entry<String, Long> entry : CooldownHandler.getCooldowns().entrySet())
                        if (entry.getKey().contains(id))
                            SaveAndUnload(entry.getKey());
                } else
                    SaveAndUnload(p.getUniqueId() + ": " + Gem.GetGemType(gem).toString() + " Tier " + String.valueOf(Gem.GetGemTier(gem)));
            }
    }

    //@EventHandler disable this shit
    public void Load(PlayerJoinEvent e) {
        Player p = e.getPlayer();
        for (ItemStack gem : p.getInventory().getContents())
            if (Gem.IsGem(gem)) {
                NamespacedKey idkey = new NamespacedKey("blissgems", "gem-id"); //will be used to get the gem id
                boolean HasID = gem.getItemMeta().getPersistentDataContainer().has(idkey, PersistentDataType.STRING);
                String id = "";
                if (HasID)
                    id = gem.getItemMeta().getPersistentDataContainer().get(idkey, PersistentDataType.STRING);
                if (HasID) LoadAndRemove(id); //Need to change this, flawed
                else
                    LoadAndRemove(p.getUniqueId() + ": " + Gem.GetGemType(gem).toString() + " Tier " + String.valueOf(Gem.GetGemTier(gem)));
            }
    }

    public static void SaveAndUnload(String name) {
        PlayerCooldownStorer.getInstance().put(name, CooldownHandler.getCooldown(name).toString());
        CooldownHandler.getCooldowns().remove(name);
    }

    public static void LoadAndRemove(String name) {
        PlayerCooldownStorer.getInstance().get(name, value -> CooldownHandler.setCooldown(name, Long.valueOf(value)));
        PlayerCooldownStorer.getInstance().updatesql("DELETE FROM PlayerCooldowns" + " WHERE UUID='" + name + "';");
    }
}
