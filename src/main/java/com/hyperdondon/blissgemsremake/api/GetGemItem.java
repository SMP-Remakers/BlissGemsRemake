package com.hyperdondon.blissgemsremake.api;

import net.md_5.bungee.api.ChatColor;
import net.milkbowl.vault.chat.Chat;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataType;
import org.mineacademy.fo.Common;

import java.awt.*;
import java.util.Arrays;
import java.util.UUID;

public final class GetGemItem {
    public static ItemStack returngem(GemType gem, int tier, Energy energy, int quicknodrop, int quicknoremove, int season) {
        //Energy

        String energystage = "";
        if (energy == Energy.Pristine_5) {
            energystage = Common.colorize("#57FFC7") + "Pristine"
                    + ChatColor.WHITE + " + "
                    + Common.colorize("#96FFD9") + "5";
        } else if (energy == Energy.Pristine_4) {
            energystage = Common.colorize("#57FFC7") + "Pristine"
                    + ChatColor.WHITE + " + "
                    + Common.colorize("#96FFD9") + "4";
        } else if (energy == Energy.Pristine_3) {
            energystage = Common.colorize("#57FFC7") + "Pristine"
                    + ChatColor.WHITE + " + "
                    + Common.colorize("#96FFD9") + "3";
        } else if (energy == Energy.Pristine_2) {
            energystage = Common.colorize("#57FFC7") + "Pristine"
                    + ChatColor.WHITE + " + "
                    + Common.colorize("#96FFD9") + "2";
        } else if (energy == Energy.Pristine_1) {
            energystage = Common.colorize("#57FFC7") + "Pristine"
                    + ChatColor.WHITE + " + "
                    + Common.colorize("#96FFD9") + "1";
        } else if (energy == Energy.Pristine) {
            energystage = Common.colorize("#57FFC7") + "Pristine";
        } else if (energy == Energy.Scratched) {
            energystage = Common.colorize("#57FF8F") + "Scratched";
        } else if (energy == Energy.Cracked) {
            energystage = Common.colorize("#7958DB") + "Cracked";
        } else if (energy == Energy.Damaged) {
            energystage = Common.colorize("#FFC929") + "Damaged";
        } else if (energy == Energy.Ruined) {
            energystage = Common.colorize("#FF1111") + "Ruined";
        } else if (energy == Energy.Broken) {
            energystage = ChatColor.WHITE + "" + ChatColor.BOLD + "ᴜѕᴇʟᴇѕѕ";
        } else {
            energystage = ChatColor.WHITE + "" + ChatColor.BOLD + "ᴜѕᴇʟᴇѕѕ";
        }


        //Strength

        if (tier == 2) {
            if (gem == GemType.Strength) {

                if (season == 2) {


                    ItemStack item = new ItemStack(Material.PRISMARINE_SHARD, 1);
                    ItemMeta itemMeta = item.getItemMeta();


                    NamespacedKey idkey = new NamespacedKey("blissgems", "gem-id");
                    itemMeta.getPersistentDataContainer().set(idkey, PersistentDataType.STRING, String.valueOf(UUID.randomUUID()));

                    NamespacedKey tierkey = new NamespacedKey("blissgems", "gem-tier");
                    itemMeta.getPersistentDataContainer().set(tierkey, PersistentDataType.INTEGER, tier);

                    NamespacedKey typekey = new NamespacedKey("blissgems", "gem-type");
                    itemMeta.getPersistentDataContainer().set(typekey, PersistentDataType.STRING, "strength");

                    NamespacedKey quicknodropkey = new NamespacedKey("blissgems", "quick-no-drop");
                    itemMeta.getPersistentDataContainer().set(quicknodropkey, PersistentDataType.INTEGER, quicknodrop);

                    NamespacedKey quicknoremovekey = new NamespacedKey("blissgems", "quick-no-remove");
                    itemMeta.getPersistentDataContainer().set(quicknoremovekey, PersistentDataType.INTEGER, quicknoremove);


                    itemMeta.setDisplayName(Common.colorize("#F10303") + ChatColor.BOLD + "sᴛʀᴇɴɢᴛʜ" + " " + Common.colorize("#FFD773") + "ɢᴇᴍ");
                    itemMeta.setCustomModelData(10);
                    for (ItemFlag flag : ItemFlag.values()) {
                        itemMeta.addItemFlags(flag);
                    }

                    if (Gem.isPristineorHigher(energy)) {
                        itemMeta.setLore(Arrays.asList(

                                ChatColor.WHITE + "" + ChatColor.BOLD + "ʜᴀᴠᴇ ᴛʜᴇ sᴛʀᴇɴɢᴛʜ ᴏғ ᴀ ᴀʀᴍʏ",
                                ChatColor.of(new Color(255, 228, 171)) + "ᴘᴀssɪᴠᴇs",
                                energystage,
                                " " + Common.colorize("#F10303") + "\uD83D\uDD2E" + ChatColor.GRAY + " Strength 2,",
                                ChatColor.GRAY + " Auto enchants sharpness 5",
                                ChatColor.GRAY + " BloodThorns, deal more damage the",
                                ChatColor.GRAY + " lower in health you are",
                                "",
                                Common.colorize("#B8FFFB") + "" + ChatColor.BOLD + "ᴘᴏᴡᴇʀs",
                                ChatColor.GRAY + "-" + ChatColor.WHITE + "\uD83E\uDD3A " + ChatColor.GRAY + "" + ChatColor.BOLD + "ғʀᴀɪʟᴇʀ",
                                ChatColor.DARK_RED + " \uD83E\uDDD1\uD83C\uDFFB" + ChatColor.GRAY + " Clears potion effects",
                                ChatColor.GRAY + " gives weakness 1 for 20 seconds",
                                ChatColor.DARK_RED + " \uD83E\uDD3C" + ChatColor.GRAY + "  Clears potion effects",
                                ChatColor.GRAY + " and gives withering, " + ChatColor.WHITE + "40s, R5",
                                "",
                                ChatColor.GRAY + "-" + ChatColor.WHITE + "⚔ " + Common.colorize("#910D0D") + "ᴄʜᴀᴅ sᴛʀᴇɴɢᴛʜ " + ChatColor.WHITE + "R4 40s",
                                ChatColor.GREEN + " \uD83E\uDDD1\uD83C\uDFFB" + ChatColor.GRAY + " Every 3 crits charges a hit that deals 2x the dmg",
                                ChatColor.GREEN + " \uD83E\uDD3C" + ChatColor.GRAY + " Every 8 crits charges a hit that deals 2x the dmg"

                        ));
                            item.setItemMeta(itemMeta);
                            return item;
                        }
                    }
                }


                if (season == 3) {

                        ItemStack item = new ItemStack(Material.PRISMARINE_SHARD, 1);
                        ItemMeta itemMeta = item.getItemMeta();


                        NamespacedKey idkey = new NamespacedKey("blissgems", "gem-id");
                        itemMeta.getPersistentDataContainer().set(idkey, PersistentDataType.STRING, String.valueOf(UUID.randomUUID()));

                        NamespacedKey tierkey = new NamespacedKey("blissgems", "gem-tier");
                        itemMeta.getPersistentDataContainer().set(tierkey, PersistentDataType.INTEGER, tier);

                        NamespacedKey typekey = new NamespacedKey("blissgems", "gem-type");
                        itemMeta.getPersistentDataContainer().set(typekey, PersistentDataType.STRING, "strength");

                        NamespacedKey quicknodropkey = new NamespacedKey("blissgems", "quick-no-drop");
                        itemMeta.getPersistentDataContainer().set(quicknodropkey, PersistentDataType.INTEGER, quicknodrop);

                        NamespacedKey quicknoremovekey = new NamespacedKey("blissgems", "quick-no-remove");
                        itemMeta.getPersistentDataContainer().set(quicknoremovekey, PersistentDataType.INTEGER, quicknoremove);


                        itemMeta.setDisplayName(Common.colorize("#F10303") + ChatColor.BOLD + "sᴛʀᴇɴɢᴛʜ" + " " + Common.colorize("#FFD773") + "ɢᴇᴍ");
                        for (ItemFlag flag : ItemFlag.values()) {
                            itemMeta.addItemFlags(flag);
                        }

                        itemMeta.setLore(Arrays.asList(

                                ChatColor.WHITE + "" + ChatColor.BOLD + "ʜᴀᴠᴇ ᴛʜᴇ sᴛʀᴇɴɢᴛʜ ᴏғ ᴀ ᴀʀᴍʏ",
                                Common.colorize("&f(") + energystage + Common.colorize("&f)"),
                                "",
                                Common.colorize("#F10303") + "\uD83D\uDD2E" + " " + ChatColor.of(new Color(255, 228, 171)) + "ᴘᴀssɪᴠᴇs",
                                ChatColor.GRAY + "- Strength",
                                ChatColor.GRAY + "- Enchants Sharpness",
                                "",
                                Common.colorize("#F10303") + "\uD83D\uDD2E" + " " + Common.colorize("#82F3FF") + ChatColor.BOLD + "ᴀʙɪʟɪᴛʏ",
                                ChatColor.GRAY + "- " + Common.colorize("#F10303") + "Bounty Hunter",
                                "",
                                Common.colorize("#F10303") + "\uD83D\uDD2E " + Common.colorize("#B8FFFB") + ChatColor.BOLD + "ᴘᴏᴡᴇʀs",
                                ChatColor.GRAY + "- " + "\uD83E\uDD3A" + ChatColor.GRAY + " ꜰʀᴀɪʟᴇʀ " + ChatColor.DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                                ChatColor.GRAY + "- " + "\uD83E\uDD3A" + ChatColor.GRAY + " ɴᴜʟʟɪꜰʏ " + ChatColor.DARK_RED + "\uD83E\uDD3C",
                                "",
                                ChatColor.GRAY + "- " + ChatColor.WHITE + "⚔ " + Common.colorize("#910D0D") + "ᴄʜᴀᴅ sᴛʀᴇɴɢᴛʜ " + ChatColor.GREEN + "\uD83E\uDDD1\uD83C\uDFFB",
                                ChatColor.GRAY + "- " + ChatColor.WHITE + "⚔ " + Common.colorize("#910D0D") + "ᴄʜᴀᴅ sᴛʀᴇɴɢᴛʜ " + ChatColor.GREEN + "\uD83E\uDD3C"
                        ));
                        itemMeta.setCustomModelData(10);
                        item.setItemMeta(itemMeta);
                        return item;
                    }




            if (gem == GemType.Wealth) {

                ItemStack item = new ItemStack(Material.PRISMARINE_SHARD, 1);
                ItemMeta itemMeta = item.getItemMeta();


                NamespacedKey idkey = new NamespacedKey("blissgems", "gem-id");
                itemMeta.getPersistentDataContainer().set(idkey, PersistentDataType.STRING, String.valueOf(UUID.randomUUID()));

                NamespacedKey tierkey = new NamespacedKey("blissgems", "gem-tier");
                itemMeta.getPersistentDataContainer().set(tierkey, PersistentDataType.INTEGER, tier);

                NamespacedKey typekey = new NamespacedKey("blissgems", "gem-type");
                itemMeta.getPersistentDataContainer().set(typekey, PersistentDataType.STRING, "wealth");

                NamespacedKey quicknodropkey = new NamespacedKey("blissgems", "quick-no-drop");
                itemMeta.getPersistentDataContainer().set(quicknodropkey, PersistentDataType.INTEGER, quicknodrop);

                NamespacedKey quicknoremovekey = new NamespacedKey("blissgems", "quick-no-remove");
                itemMeta.getPersistentDataContainer().set(quicknoremovekey, PersistentDataType.INTEGER, quicknoremove);


                itemMeta.setDisplayName(ChatColor.of(new Color(14, 201, 18)) + "" + ChatColor.BOLD + "ᴡᴇᴀʟᴛʜ" + " " + Common.colorize("#FFD773") + "ɢᴇᴍ");
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


            if (gem == GemType.Speed) {

                ItemStack item = new ItemStack(Material.PRISMARINE_SHARD, 1);
                ItemMeta itemMeta = item.getItemMeta();


                NamespacedKey idkey = new NamespacedKey("blissgems", "gem-id");
                itemMeta.getPersistentDataContainer().set(idkey, PersistentDataType.STRING, String.valueOf(UUID.randomUUID()));

                NamespacedKey tierkey = new NamespacedKey("blissgems", "gem-tier");
                itemMeta.getPersistentDataContainer().set(tierkey, PersistentDataType.INTEGER, tier);

                NamespacedKey typekey = new NamespacedKey("blissgems", "gem-type");
                itemMeta.getPersistentDataContainer().set(typekey, PersistentDataType.STRING, "speed");

                NamespacedKey quicknodropkey = new NamespacedKey("blissgems", "quick-no-drop");
                itemMeta.getPersistentDataContainer().set(quicknodropkey, PersistentDataType.INTEGER, quicknodrop);

                NamespacedKey quicknoremovekey = new NamespacedKey("blissgems", "quick-no-remove");
                itemMeta.getPersistentDataContainer().set(quicknoremovekey, PersistentDataType.INTEGER, quicknoremove);


                itemMeta.setDisplayName(Common.colorize("#F10303") + ChatColor.BOLD + "sᴘᴇᴇᴅ" + " " + Common.colorize("#FFD773") + "ɢᴇᴍ");
                itemMeta.setCustomModelData(8);
                for (ItemFlag flag : ItemFlag.values()) {
                    itemMeta.addItemFlags(flag);
                }

                itemMeta.setLore(Arrays.asList(

                        ChatColor.WHITE + "" + ChatColor.BOLD + "ᴡᴀᴛᴄʜ ᴛʜᴇ ᴡᴏʀʟᴅ ᴀʀᴏᴜɴᴅ ʏᴏᴜ ᴛᴜʀɴ ɪɴᴛᴏ ᴀ ʙʟᴜʀ",
                        ChatColor.of(new Color(255, 228, 171)) + "ᴘᴀssɪᴠᴇs",
                        ChatColor.of(new Color(87, 255, 199)) + "Pristine",
                        " " + Common.colorize("#F10303") + "\uD83D\uDD2E" + ChatColor.GRAY + " Speed 3,Dolphins Grace",
                        ChatColor.GRAY + "and Immune to Soul Sand, Auto enchants Efficiency 5",
                        "",
                        ChatColor.of(new Color(164, 244, 254)) + "" + ChatColor.BOLD + "ᴘᴏᴡᴇʀs",
                        ChatColor.GRAY + "-" + ChatColor.WHITE + Common.colorize("&7-&r&e \uD83C\uDFAF&f") + ChatColor.GRAY + "" + ChatColor.BOLD + "sʟᴏᴛʜs sᴇᴅᴀᴛɪᴠᴇ",
                        ChatColor.DARK_RED + Common.colorize("Slowness 2, Mining Fatuge 3"),
                        ChatColor.GRAY + " gives weakness 1 for 20 seconds",
                        ChatColor.DARK_RED + " \uD83E\uDD3C" + ChatColor.GRAY + "  Clears potion effects",
                        ChatColor.GRAY + " and gives withering, " + ChatColor.WHITE + "40s, R5",
                        "",
                        ChatColor.GRAY + "-" + ChatColor.WHITE + "⚔ " + Common.colorize("#910D0D") + "ᴄʜᴀᴅ sᴛʀᴇɴɢᴛʜ " + ChatColor.WHITE + "R4 40s",
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
                //                    Common.colorize("#F10303") + "\uD83D\uDD2E" + " " + ChatColor.WHITE + ChatColor.BOLD + "required"
                //            ));


                //"Speed"
                item.setItemMeta(itemMeta);
                return item;
            }
        }
        return null;
    }
}

