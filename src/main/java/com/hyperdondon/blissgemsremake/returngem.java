package com.hyperdondon.blissgemsremake;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataType;
import org.mineacademy.fo.Common;

import java.awt.*;
import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;

public final class returngem {
    public static ItemStack returngem(String gem, int tier, int energy, int quicknodrop, int quicknoremove) {

        //Strength

        if (Objects.equals(gem, "strength")) {

            ItemStack item = new ItemStack(Material.PRISMARINE_SHARD, 1);
            ItemMeta itemMeta = item.getItemMeta();


            NamespacedKey idkey = new NamespacedKey("blissgems", "gem-id");
            itemMeta.getPersistentDataContainer().set(idkey, PersistentDataType.STRING, String.valueOf(UUID.randomUUID()));

            NamespacedKey tierkey = new NamespacedKey("blissgems", "gem-tier");
            itemMeta.getPersistentDataContainer().set(tierkey, PersistentDataType.INTEGER, tier);

            NamespacedKey typekey = new NamespacedKey("blissgems", "gem-type");
            itemMeta.getPersistentDataContainer().set(typekey, PersistentDataType.STRING, gem);

            NamespacedKey quicknodropkey = new NamespacedKey("blissgems", "quick-no-drop");
            itemMeta.getPersistentDataContainer().set(quicknodropkey, PersistentDataType.INTEGER, quicknodrop);

            NamespacedKey quicknoremovekey = new NamespacedKey("blissgems", "quick-no-remove");
            itemMeta.getPersistentDataContainer().set(quicknoremovekey, PersistentDataType.INTEGER, quicknoremove);


            itemMeta.setDisplayName(ChatColor.of(new Color(241, 3, 3)) + "" + ChatColor.BOLD + "sᴛʀᴇɴɢᴛʜ" + " " + ChatColor.of(new Color(255, 215, 115)) + "ɢᴇᴍ");
            itemMeta.setCustomModelData(10);
            for (ItemFlag flag : ItemFlag.values()) {
                itemMeta.addItemFlags(flag);
            }

            itemMeta.setLore(Arrays.asList(

                    ChatColor.WHITE + "" + ChatColor.BOLD + "ʜᴀᴠᴇ ᴛʜᴇ sᴛʀᴇɴɢᴛʜ ᴏғ ᴀ ᴀʀᴍʏ",
                    ChatColor.of(new Color(255, 228, 171)) + "ᴘᴀssɪᴠᴇs",
                    ChatColor.of(new Color(87, 255, 199)) + "Pristine",
                    " " + ChatColor.of(new Color(241, 3, 3)) + "\uD83D\uDD2E" + ChatColor.GRAY + " Strength 2,",
                    ChatColor.GRAY + " Auto enchants sharpness 5",
                    ChatColor.GRAY + " BloodThorns, deal more damage the",
                    ChatColor.GRAY + " lower in health you are",
                    "",
                    ChatColor.of(new Color(164, 244, 254)) + "" + ChatColor.BOLD + "ᴘᴏᴡᴇʀs",
                    ChatColor.GRAY + "-" + ChatColor.WHITE + "\uD83E\uDD3A " + ChatColor.GRAY + "" + ChatColor.BOLD + "ғʀᴀɪʟᴇʀ",
                    ChatColor.DARK_RED + " \uD83E\uDDD1\uD83C\uDFFB" + ChatColor.GRAY + " Clears potion effects",
                    ChatColor.GRAY + " gives weakness 1 for 20 seconds",
                    ChatColor.DARK_RED + " \uD83E\uDD3C" + ChatColor.GRAY + "  Clears potion effects",
                    ChatColor.GRAY + " and gives withering, " + ChatColor.WHITE + "40s, R5",
                    "",
                    ChatColor.GRAY + "-" + ChatColor.WHITE + "⚔ " + ChatColor.of(new Color(145, 13, 13)) + "ᴄʜᴀᴅ sᴛʀᴇɴɢᴛʜ " + ChatColor.WHITE + "R4 40s",
                    ChatColor.GREEN + " \uD83E\uDDD1\uD83C\uDFFB" + ChatColor.GRAY + " Every 3 crits charges a hit that deals 2x the dmg",
                    ChatColor.GREEN + " \uD83E\uDD3C" + ChatColor.GRAY + " Every 8 crits charges a hit that deals 2x the dmg"

            ));




            item.setItemMeta(itemMeta);
            return item;
        }














        if (Objects.equals(gem, "wealth")) {

            ItemStack item = new ItemStack(Material.PRISMARINE_SHARD, 1);
            ItemMeta itemMeta = item.getItemMeta();


            NamespacedKey idkey = new NamespacedKey("blissgems", "gem-id");
            itemMeta.getPersistentDataContainer().set(idkey, PersistentDataType.STRING, String.valueOf(UUID.randomUUID()));

            NamespacedKey tierkey = new NamespacedKey("blissgems", "gem-tier");
            itemMeta.getPersistentDataContainer().set(tierkey, PersistentDataType.INTEGER, tier);

            NamespacedKey typekey = new NamespacedKey("blissgems", "gem-type");
            itemMeta.getPersistentDataContainer().set(typekey, PersistentDataType.STRING, gem);

            NamespacedKey quicknodropkey = new NamespacedKey("blissgems", "quick-no-drop");
            itemMeta.getPersistentDataContainer().set(quicknodropkey, PersistentDataType.INTEGER, quicknodrop);

            NamespacedKey quicknoremovekey = new NamespacedKey("blissgems", "quick-no-remove");
            itemMeta.getPersistentDataContainer().set(quicknoremovekey, PersistentDataType.INTEGER, quicknoremove);


            itemMeta.setDisplayName(ChatColor.of(new Color(14, 201, 18)) + "" + ChatColor.BOLD + "ᴡᴇᴀʟᴛʜ" + " " + ChatColor.of(new Color(255, 215, 115)) + "ɢᴇᴍ");
            itemMeta.setCustomModelData(12);
            for (ItemFlag flag : ItemFlag.values()) {
                itemMeta.addItemFlags(flag);
            }

            itemMeta.setLore(Arrays.asList(

                    "" + ChatColor.BOLD +
                            "ғᴜᴇʟ ᴀ ᴇᴍᴘɪʀᴇ",

                    ChatColor.of(new Color(255, 228, 171)) +
                            "ᴘᴀssɪᴠᴇs",

                    ChatColor.of(new Color(87, 255, 199)) +
                            "Pristine",

                    ChatColor.of(new Color(14, 201, 18)) +
                            "\uD83D\uDD2E" +

                            Common.colorize("&7") +
                            "Even cheaper villager trades, Luck",

                    Common.colorize(" &7") +
                            "Auto enchants looting"

            ));


            //"wealth"
            item.setItemMeta(itemMeta);
            return item;
        }













        if (Objects.equals(gem, "speed")) {

            ItemStack item = new ItemStack(Material.PRISMARINE_SHARD, 1);
            ItemMeta itemMeta = item.getItemMeta();


            NamespacedKey idkey = new NamespacedKey("blissgems", "gem-id");
            itemMeta.getPersistentDataContainer().set(idkey, PersistentDataType.STRING, String.valueOf(UUID.randomUUID()));

            NamespacedKey tierkey = new NamespacedKey("blissgems", "gem-tier");
            itemMeta.getPersistentDataContainer().set(tierkey, PersistentDataType.INTEGER, tier);

            NamespacedKey typekey = new NamespacedKey("blissgems", "gem-type");
            itemMeta.getPersistentDataContainer().set(typekey, PersistentDataType.STRING, gem);

            NamespacedKey quicknodropkey = new NamespacedKey("blissgems", "quick-no-drop");
            itemMeta.getPersistentDataContainer().set(quicknodropkey, PersistentDataType.INTEGER, quicknodrop);

            NamespacedKey quicknoremovekey = new NamespacedKey("blissgems", "quick-no-remove");
            itemMeta.getPersistentDataContainer().set(quicknoremovekey, PersistentDataType.INTEGER, quicknoremove);


            itemMeta.setDisplayName(ChatColor.of(new Color(241, 3, 3)) + "" + ChatColor.BOLD + "sᴘᴇᴇᴅ" + " " + ChatColor.of(new Color(255, 215, 115)) + "ɢᴇᴍ");
            itemMeta.setCustomModelData(8);
            for (ItemFlag flag : ItemFlag.values()) {
                itemMeta.addItemFlags(flag);
            }

            itemMeta.setLore(Arrays.asList(

                    ChatColor.WHITE + "" + ChatColor.BOLD + "ᴡᴀᴛᴄʜ ᴛʜᴇ ᴡᴏʀʟᴅ ᴀʀᴏᴜɴᴅ ʏᴏᴜ ᴛᴜʀɴ ɪɴᴛᴏ ᴀ ʙʟᴜʀ",
                    ChatColor.of(new Color(255, 228, 171)) + "ᴘᴀssɪᴠᴇs",
                    ChatColor.of(new Color(87, 255, 199)) + "Pristine",
                    " " + ChatColor.of(new Color(241, 3, 3)) + "\uD83D\uDD2E" + ChatColor.GRAY + " Speed 3,Dolphins Grace",
                    ChatColor.GRAY + "and Immune to Soul Sand, Auto enchants Efficiency 5",
                    "",
                    ChatColor.of(new Color(164, 244, 254)) + "" + ChatColor.BOLD + "ᴘᴏᴡᴇʀs",
                    ChatColor.GRAY + "-" + ChatColor.WHITE + Common.colorize("&7-&r&e \uD83C\uDFAF&f") + ChatColor.GRAY + "" + ChatColor.BOLD + "sʟᴏᴛʜs sᴇᴅᴀᴛɪᴠᴇ",
                    ChatColor.DARK_RED + Common.colorize("Slowness 2, Mining Fatuge 3"),
                    ChatColor.GRAY + " gives weakness 1 for 20 seconds",
                    ChatColor.DARK_RED + " \uD83E\uDD3C" + ChatColor.GRAY + "  Clears potion effects",
                    ChatColor.GRAY + " and gives withering, " + ChatColor.WHITE + "40s, R5",
                    "",
                    ChatColor.GRAY + "-" + ChatColor.WHITE + "⚔ " + ChatColor.of(new Color(145, 13, 13)) + "ᴄʜᴀᴅ sᴛʀᴇɴɢᴛʜ " + ChatColor.WHITE + "R4 40s",
                    ChatColor.GREEN + " \uD83E\uDDD1\uD83C\uDFFB" + ChatColor.GRAY + " Every 3 crits charges a hit that deals 2x the dmg",
                    ChatColor.GREEN + " \uD83E\uDD3C" + ChatColor.GRAY + " Every 8 crits charges a hit that deals 2x the dmg"

            ));

            //    itemMeta.setLore(Arrays.asList(
            //
            //                    ChatColor.WHITE + "" + ChatColor.BOLD + "ᴛᴜʀɴ ɪɴᴛᴏ ᴀ ʙʟᴜʀ",
            //                    ChatColor.of(new Color(255, 228, 171)) + "ᴘᴀssɪᴠᴇs",
            //                    ChatColor.of(new Color(87, 255, 199)) + "Pristine",
            //                    " " + ChatColor.of(new Color(254, 253, 23)) + "\uD83D\uDD2E" + ChatColor.GRAY + " Speed 2, Immune to soul sand",
            //                    ChatColor.GRAY + " Auto enchant efficiency 2",
            //                    "",
            //                    ChatColor.of(new Color(150, 184, 255)) + "" + ChatColor.BOLD + "ᴀʙɪʟɪᴛʏ",
            //                    ChatColor.of(new Color(254, 253, 23)) + "Terminal Acceleration" + ChatColor.GRAY + ": Eating food, crits and",
            //                    " " + ChatColor.GRAY + "by using that players items to feed the tracking",
            //                    "",
            //                    ChatColor.of(new Color(164, 244, 254)) + "" + ChatColor.BOLD + "ᴘᴏᴡᴇʀs",
            //                    ChatColor.of(new Color(241, 3, 3)) + "\uD83D\uDD2E" + " " + ChatColor.WHITE + ChatColor.BOLD + "required"
            //            ));



            //"Speed"
            item.setItemMeta(itemMeta);
            return item;
        }

        return null;
    }
}
