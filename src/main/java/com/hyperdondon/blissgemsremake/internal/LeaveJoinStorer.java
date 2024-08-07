package com.hyperdondon.blissgemsremake.internal;

import com.hyperdondon.blissgemsremake.internal.gems.Strength.Powers;
import lombok.Getter;
import org.bukkit.NamespacedKey;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.persistence.PersistentDataType;

import java.util.Objects;
import java.util.UUID;

public class LeaveJoinStorer implements Listener {
    @Getter
    private static volatile LeaveJoinStorer instance = new LeaveJoinStorer();

    //@EventHandler disable this shit
    public void Store(PlayerQuitEvent e) {
        Player p = e.getPlayer();
        for (ItemStack i : p.getInventory().getContents()) {
            if (p.getInventory().getItemInMainHand().hasItemMeta()) {


                ItemStack gem = p.getInventory().getItemInMainHand();

                NamespacedKey typekey = new NamespacedKey("blissgems", "gem-type"); //will be used to check and get the gem type

                NamespacedKey idkey = new NamespacedKey("blissgems", "gem-id"); //will be used to get the gem id

                if (p.getInventory().getItemInMainHand().getItemMeta().getPersistentDataContainer().has(typekey, PersistentDataType.STRING)) {

                    if (Powers.Frailer.containsKey(UUID.fromString(Objects.requireNonNull(i.getItemMeta().getPersistentDataContainer().get(idkey, PersistentDataType.STRING))))) {

                        PlayerCooldownStorer.getInstance().put(
                                i.getItemMeta().getPersistentDataContainer().get(idkey, PersistentDataType.STRING)
                                ,
                                String.valueOf(
                                        Powers.Frailer.get(
                                                UUID.fromString
                                                        (Objects.requireNonNull(
                                                                i.getItemMeta().getPersistentDataContainer().get(idkey, PersistentDataType.STRING))))));
                        Powers.Frailer.remove(
                                UUID.fromString(
                                        Objects.requireNonNull(
                                                i.getItemMeta().getPersistentDataContainer().get(idkey, PersistentDataType.STRING)))
                        );
                    }
                }
            }
        }
    }

    //@EventHandler disable this shit
    public void Load(PlayerJoinEvent e) {
        Player p = e.getPlayer();
        for (ItemStack i : p.getInventory().getContents()) {
            if (p.getInventory().getItemInMainHand().hasItemMeta()) {


                ItemStack gem = p.getInventory().getItemInMainHand();

                NamespacedKey typekey = new NamespacedKey("blissgems", "gem-type"); //will be used to check and get the gem type

                NamespacedKey idkey = new NamespacedKey("blissgems", "gem-id"); //will be used to get the gem id

                if (p.getInventory().getItemInMainHand().getItemMeta().getPersistentDataContainer().has(typekey, PersistentDataType.STRING)) {

                    if (Powers.Frailer.containsKey(UUID.fromString(Objects.requireNonNull(i.getItemMeta().getPersistentDataContainer().get(idkey, PersistentDataType.STRING))))) {


                        //this.get(i.getItemMeta().getPersistentDataContainer().get(idkey, PersistentDataType.STRING), );


                        UUID id =
                                UUID.fromString(
                                Objects.requireNonNull(
                                        i.getItemMeta().getPersistentDataContainer().get(
                                                idkey, PersistentDataType.STRING)));

                        PlayerCooldownStorer.getInstance().get(p.getUniqueId().toString(), (cooldown2 -> {
                            Powers.Frailer.put(
                                    id
                                    ,
                                    Long.valueOf(cooldown2));
                        }));

                        PlayerCooldownStorer.getInstance().updatesql(
                                "DELETE FROM PlayerCooldowns" +
                                " WHERE UUID='" + id.toString() + "';");
                    }
                }
            }
        }
    }

}
