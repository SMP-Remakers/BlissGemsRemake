package com.hyperdondon.blissgemsremake.api;

import com.hyperdondon.blissgemsremake.blissgems;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;
import de.tr7zw.nbtapi.NBTItem;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;
import org.bukkit.persistence.PersistentDataType;
import org.mineacademy.fo.Common;
import org.mineacademy.fo.menu.model.ItemCreator;
import org.mineacademy.fo.remain.CompMaterial;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.UUID;

public final class BlissItems {
    public static ItemStack getItem(BlissItemType itemType, String id, String energysource, int season) {
        if (itemType == BlissItemType.Trader) {
            ItemStack item =
                    ItemCreator.of(CompMaterial.PLAYER_HEAD)
                            .name(blissgems.colorize("#E9C2FF") + ChatColor.BOLD + "ᴛʀᴀᴅᴇʀ")
                            //.skullUrl("http://textures.minecraft.net/texture/bf624a44e77b95dbe1cc735536953e840ba6c19b0157c549d9b82534648c8ce4")
                            //.skullOwner("Bliss_SMP")
                            .make();

            ItemMeta itemMeta = item.getItemMeta();
            NamespacedKey idkey = new NamespacedKey(blissgems.getInstance(), "trade_item");
            itemMeta.getPersistentDataContainer().set(idkey, PersistentDataType.INTEGER, 1);

            itemMeta.setCustomModelData(0);
            if (season == 2 || season == 3)
                itemMeta.setLore(Arrays.asList(
                        ChatColor.GRAY + "ʀɪɢʜᴛ-ᴄʟɪᴄᴋ ᴛᴏ ᴄʜᴀɴɢᴇ ʏᴏᴜʀ ɢᴇᴍ ᴛʏᴘᴇ",
                        ChatColor.GRAY + "ʏᴏᴜ ᴡɪʟʟ ʀᴇᴄᴇɪᴠᴇ ᴀ ʀᴀɴᴅᴏᴍ ᴛɪᴇʀ ᴏɴᴇ ɢᴇᴍ",
                        ChatColor.WHITE + "",
                        ChatColor.RED + "ᴡᴀʀɴɪɴɢ: ᴜsɪɴɢ ᴛʜɪs ᴡɪʟʟ ʟᴏsᴇ ʏᴏᴜʀ ᴄᴜʀʀᴇɴᴛ ɢᴇᴍ"
                ));
            else
                itemMeta.setLore(Arrays.asList(
                        ChatColor.GRAY + "ʀɪɢʜᴛ-ᴄʟɪᴄᴋ ᴛᴏ ᴄʜᴀɴɢᴇ ʏᴏᴜʀ ɢᴇᴍ ᴛʏᴘᴇ",
                        ChatColor.GRAY + "ʏᴏᴜ ᴡɪʟʟ ʀᴇᴄᴇɪᴠᴇ ᴀ ʀᴀɴᴅᴏᴍ ᴛɪᴇʀ ᴏɴᴇ ɢᴇᴍ",
                        ChatColor.WHITE + "",
                        ChatColor.RED + "ᴡᴀʀɴɪɴɢ: ᴜsɪɴɢ ᴛʜɪs ᴡɪʟʟ ʟᴏsᴇ ʏᴏᴜʀ ᴄᴜʀʀᴇɴᴛ ɢᴇᴍ"
                ));

            itemMeta.addEnchant(Enchantment.DURABILITY, 1, true);

            item.setItemMeta(itemMeta);
            //W CHATGPT
            //recreates the id inside the trader for s3
            // Your integers

            int id1 = -2041578254; // First part
            int id2 = -1379710610; // Second part
            int id3 = -1313167349; // Third part
            int id4 = 221204661;    // Fourth part

            if (season == 2) {
                id1 = -256801287; // First part
                id2 = -349680943; // Second part
                id3 = -1707885155; // Third part
                id4 = -1812836215;    // Fourth part
            }

            // Combine the two halves into a UUID
            long msb = ((long) id1 << 32) | (id2 & 0xFFFFFFFFL); // MSB
            long lsb = ((long) id3 << 32) | (id4 & 0xFFFFFFFFL); // LSB

            UUID uuid = new UUID(msb, lsb);
            SkullMeta skullMeta = (SkullMeta) item.getItemMeta();
            GameProfile profile = new GameProfile(uuid, "Bliss_SMP");

            profile.getProperties().put("textures", new Property("textures", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYmY2MjRhNDRlNzdiOTVkYmUxY2M3MzU1MzY5NTNlODQwYmE2YzE5YjAxNTdjNTQ5ZDliODI1MzQ2NDhjOGNlNCJ9fX0="));

            try {
                Field profileField = skullMeta.getClass().getDeclaredField("profile");
                profileField.setAccessible(true);
                profileField.set(skullMeta, profile);

            } catch (Exception e) {
                Common.error(e, "Base64 Encoding for Trader Head encountered an exception. This could also happen because your server is in offline mode.");
            }

            item.setItemMeta(skullMeta);

            NBTItem nbtItem = new NBTItem(item);
            nbtItem.setInteger("HideFlags", 255);

            item = nbtItem.getItem();

            return item;
        }


        return null;
    }
}
