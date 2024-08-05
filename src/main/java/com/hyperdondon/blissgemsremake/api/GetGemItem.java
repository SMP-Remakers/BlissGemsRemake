package com.hyperdondon.blissgemsremake.api;

import com.hyperdondon.blissgemsremake.internal.VersionChecker;
import net.md_5.bungee.api.ChatColor;
import net.milkbowl.vault.chat.Chat;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataType;
import org.mineacademy.fo.Common;
import org.mineacademy.fo.MinecraftVersion;

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
            if (season == 2) {
                energystage = ChatColor.WHITE + "" + ChatColor.BOLD + "ᴜѕᴇʟᴇѕѕ";
            }
            if (season == 3) {
                energystage = ChatColor.RED + "BROKEN";
            }
        } else {
            if (season == 2) {
                energystage = ChatColor.WHITE + "" + ChatColor.BOLD + "ᴜѕᴇʟᴇѕѕ";
            }
            if (season == 3) {
                energystage = ChatColor.RED + "BROKEN";
            }
        }


        //Strength

        if (tier == 2) {
            if (gem == GemType.Strength) {

                if (season == 1) {
                    ItemStack item = new ItemStack(Material.PRISMARINE_SHARD, 1);
                    ItemMeta itemMeta = item.getItemMeta();


                    NamespacedKey idkey = new NamespacedKey("blissgems", "shard_id");
                    itemMeta.getPersistentDataContainer().set(idkey, PersistentDataType.STRING, UUID.randomUUID().toString());

                    itemMeta.setDisplayName(Common.colorize("#F10303") + "Strength " + Common.colorize("#FFD773") + "Gem");


                    // Set HideFlags to 127 if server is lower than 1.20.6, if yes: then hide all flags.
                    // this is due to the nbt change, it is not possible to make everything 1-1 for people using 1.20.6 and higher.

                    if (VersionChecker.OlderThanNBTChange()) {
                        itemMeta.addItemFlags(
                                ItemFlag.HIDE_ENCHANTS,
                                ItemFlag.HIDE_ATTRIBUTES,
                                ItemFlag.HIDE_UNBREAKABLE,
                                ItemFlag.HIDE_DESTROYS,
                                ItemFlag.HIDE_PLACED_ON,
                                ItemFlag.HIDE_POTION_EFFECTS,
                                ItemFlag.HIDE_DYE);
                    } else {
                        for (ItemFlag flag : ItemFlag.values()) {
                            itemMeta.addItemFlags(flag);
                        }
                    }


                    itemMeta.setCustomModelData(10);
                    itemMeta.setLore(Arrays.asList(

                            ChatColor.WHITE + "" + ChatColor.BOLD + "Have the strength of 5 men",
                            Common.colorize("#FFE4AB") + "Passives",
                            ChatColor.GRAY + " " + Common.colorize("#F10303") + "\uD83D\uDD2E " + ChatColor.GRAY + "Strength 2, Auto enchants all",
                            ChatColor.GRAY + " swords and axes with sharpness 5",
                            ChatColor.WHITE + " ",
                            Common.colorize("#B8FFFB") + ChatColor.BOLD + "Powers",
                            ChatColor.GRAY + "-" + ChatColor.WHITE + "\uD83E\uDD3A " + Common.colorize("#B5B5B5") + ChatColor.BOLD + "Frailer",
                            ChatColor.GRAY + " " + ChatColor.DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB " + ChatColor.GRAY + "Clears potion effects",
                            ChatColor.GRAY + " gives weakness 1 for 20 seconds",
                            ChatColor.GRAY + " " + ChatColor.DARK_RED + "\uD83E\uDD3C " + ChatColor.GRAY + " Clears potion effects",
                            ChatColor.GRAY + " and gives withering, " + ChatColor.WHITE + "40s, R5",
                            ChatColor.WHITE + "",
                            ChatColor.GRAY + "-" + ChatColor.WHITE + "⚔" + Common.colorize("#910D0D") + " Chad Strength " + ChatColor.WHITE + "R4 40s",
                            ChatColor.GRAY + " " + ChatColor.GREEN + "\uD83E\uDDD1\uD83C\uDFFB " + ChatColor.GRAY + "Every 3 crits charges a hit that deals 2x the dmg",
                            ChatColor.GRAY + " " + ChatColor.GREEN + "\uD83E\uDD3C " + ChatColor.GRAY + "Every 8 crits charges a hit that deals 2x the dmg"
                    ));

                    item.setItemMeta(itemMeta);
                    return item;
                }


                if (season == 2) {


                    ItemStack item = new ItemStack(Material.PRISMARINE_SHARD, 1);
                    ItemMeta itemMeta = item.getItemMeta();


                    NamespacedKey idkey = new NamespacedKey("blissgems", "gem-id");
                    itemMeta.getPersistentDataContainer().set(idkey, PersistentDataType.STRING, UUID.randomUUID().toString());

                    NamespacedKey tierkey = new NamespacedKey("blissgems", "gem-tier");
                    itemMeta.getPersistentDataContainer().set(tierkey, PersistentDataType.INTEGER, tier);

                    NamespacedKey typekey = new NamespacedKey("blissgems", "gem-type");
                    itemMeta.getPersistentDataContainer().set(typekey, PersistentDataType.STRING, "strength");

                    NamespacedKey quicknodropkey = new NamespacedKey("blissgems", "quick-no-drop");
                    itemMeta.getPersistentDataContainer().set(quicknodropkey, PersistentDataType.INTEGER, quicknodrop);

                    NamespacedKey quicknoremovekey = new NamespacedKey("blissgems", "quick-no-remove");
                    itemMeta.getPersistentDataContainer().set(quicknoremovekey, PersistentDataType.INTEGER, quicknoremove);


                    itemMeta.setDisplayName(Common.colorize("#F10303") + ChatColor.BOLD + "sᴛʀᴇɴɢᴛʜ " + Common.colorize("#FFD773") + "ɢᴇᴍ");
                    for (ItemFlag flag : ItemFlag.values()) {
                        itemMeta.addItemFlags(flag);
                    }

                    if (Gem.isPristineorHigher(energy)) {
                        if (energy == Energy.Pristine_5) {
                            itemMeta.addEnchant(Enchantment.DURABILITY, 1, true);
                        }

                        itemMeta.setCustomModelData(10);
                        itemMeta.setLore(Arrays.asList(
                                ChatColor.WHITE + "" + ChatColor.BOLD + "ʜᴀᴠᴇ ᴛʜᴇ sᴛʀᴇɴɢᴛʜ ᴏғ ᴀ ᴀʀᴍʏ",
                                Common.colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                energystage,
                                ChatColor.GRAY + " " + Common.colorize("#F10303") + "\uD83D\uDD2E " + ChatColor.GRAY + "Strength 2,",
                                ChatColor.GRAY + " Auto enchants sharpness 5",
                                ChatColor.GRAY + " BloodThorns, deal more damage the",
                                ChatColor.GRAY + " lower in health you are ",
                                ChatColor.GRAY + " ",
                                Common.colorize("#B8FFFB") + ChatColor.BOLD + "ᴘᴏᴡᴇʀs",
                                ChatColor.GRAY + "-" + ChatColor.WHITE + "\uD83E\uDD3A " + Common.colorize("#B5B5B5") + ChatColor.BOLD + "ғʀᴀɪʟᴇʀ",
                                ChatColor.GRAY + " " + ChatColor.DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB " + ChatColor.GRAY + "Clears potion effects",
                                ChatColor.GRAY + " gives weakness 1 for 20 seconds",
                                ChatColor.GRAY + " " + ChatColor.DARK_RED + "\uD83E\uDD3C " + ChatColor.GRAY + " Clears potion effects",
                                ChatColor.GRAY + " and gives withering, " + ChatColor.WHITE + "40s, R5",
                                ChatColor.WHITE + "",
                                ChatColor.GRAY + "-" + ChatColor.WHITE + "⚔" + Common.colorize("#910D0D") + " ᴄʜᴀᴅ sᴛʀᴇɴɢᴛʜ " + ChatColor.WHITE + "R4 40s",
                                ChatColor.GRAY + " " + ChatColor.GREEN + "\uD83E\uDDD1\uD83C\uDFFB " + ChatColor.GRAY + "Every 3 crits charges a hit that deals 2x the dmg",
                                ChatColor.GRAY + " " + ChatColor.GREEN + "\uD83E\uDD3C " + ChatColor.GRAY + "Every 8 crits charges a hit that deals 2x the dmg"
                        ));
                    }

                    if (energy == Energy.Scratched) {
                        itemMeta.setCustomModelData(30);
                        itemMeta.setLore(Arrays.asList(
                                ChatColor.WHITE + "" + ChatColor.BOLD + "ʜᴀᴠᴇ ᴛʜᴇ sᴛʀᴇɴɢᴛʜ ᴏғ ᴀ ᴀʀᴍʏ",
                                Common.colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                energystage,
                                ChatColor.GRAY + " " + Common.colorize("#F10303") + "\uD83D\uDD2E " + ChatColor.GRAY + "Strength 2,",
                                ChatColor.GRAY + " Auto enchants sharpness 4",
                                ChatColor.GRAY + " BloodThorns, deal more damage the",
                                ChatColor.GRAY + " lower in health you are",
                                ChatColor.GRAY + " ",
                                Common.colorize("#B8FFFB") + ChatColor.BOLD + "ᴘᴏᴡᴇʀs",
                                ChatColor.GRAY + "-" + ChatColor.WHITE + "\uD83E\uDD3A " + Common.colorize("#B5B5B5") + ChatColor.BOLD + "ғʀᴀɪʟᴇʀ",
                                ChatColor.GRAY + " " + ChatColor.DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB " + ChatColor.GRAY + "Clears potion effects",
                                ChatColor.GRAY + " gives weakness 1 for 20 seconds" + "",
                                ChatColor.GRAY + " " + ChatColor.DARK_RED + "\uD83E\uDD3C " + ChatColor.GRAY + " Clears potion effects",
                                ChatColor.GRAY + " and gives withering, " + ChatColor.WHITE + "40s, R5",
                                ChatColor.WHITE + "",
                                ChatColor.GRAY + "-" + ChatColor.WHITE + "⚔" + Common.colorize("#910D0D") + " ᴄʜᴀᴅ sᴛʀᴇɴɢᴛʜ " + ChatColor.WHITE + "R4 40s",
                                ChatColor.GRAY + " " + ChatColor.GREEN + "\uD83E\uDDD1\uD83C\uDFFB " + ChatColor.GRAY + "Every 3 crits charges a hit that deals 2x the dmg",
                                ChatColor.GRAY + " " + ChatColor.GREEN + "\uD83E\uDD3C " + ChatColor.GRAY + "Every 8 crits charges a hit that deals 2x the dmg"
                        ));
                    }

                    if (energy == Energy.Cracked) {
                        itemMeta.setCustomModelData(50);
                        itemMeta.setLore(Arrays.asList(
                                ChatColor.WHITE + "" + ChatColor.BOLD + "ʜᴀᴠᴇ ᴛʜᴇ sᴛʀᴇɴɢᴛʜ ᴏғ ᴀ ᴀʀᴍʏ",
                                Common.colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                energystage,
                                ChatColor.GRAY + " " + Common.colorize("#F10303") + "\uD83D\uDD2E " + ChatColor.GRAY + "Strength 2,",
                                ChatColor.GRAY + " Auto enchants sharpness 3",
                                ChatColor.GRAY + " ",
                                Common.colorize("#B8FFFB") + ChatColor.BOLD + "ᴘᴏᴡᴇʀs",
                                ChatColor.GRAY + "-" + ChatColor.WHITE + "\uD83E\uDD3A " + Common.colorize("#B5B5B5") + ChatColor.BOLD + "ғʀᴀɪʟᴇʀ",
                                ChatColor.GRAY + " " + ChatColor.DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB " + ChatColor.GRAY + "Clears potion effects",
                                ChatColor.GRAY + " gives weakness 1 for 20 seconds",
                                ChatColor.GRAY + " " + ChatColor.DARK_RED + "\uD83E\uDD3C " + ChatColor.GRAY + " Clears potion effects",
                                ChatColor.GRAY + " and gives withering, " + ChatColor.WHITE + "40s, R5",
                                ChatColor.WHITE + "",
                                ChatColor.GRAY + "-" + ChatColor.WHITE + "⚔" + Common.colorize("#910D0D") + " ᴄʜᴀᴅ sᴛʀᴇɴɢᴛʜ " + ChatColor.WHITE + "R4 40s",
                                ChatColor.GRAY + " " + ChatColor.GREEN + "\uD83E\uDDD1\uD83C\uDFFB " + ChatColor.GRAY + "Every 3 crits charges a hit that deals 2x the dmg",
                                ChatColor.GRAY + " " + ChatColor.GREEN + "\uD83E\uDD3C " + ChatColor.GRAY + "Every 8 crits charges a hit that deals 2x the dmg"
                        ));
                    }

                    if (energy == Energy.Damaged) {
                        itemMeta.setCustomModelData(70);
                        itemMeta.setLore(Arrays.asList(
                                ChatColor.WHITE + "" + ChatColor.BOLD + "ʜᴀᴠᴇ ᴛʜᴇ sᴛʀᴇɴɢᴛʜ ᴏғ ᴀ ᴀʀᴍʏ",
                                Common.colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                energystage,
                                ChatColor.GRAY + " " + Common.colorize("#F10303") + "\uD83D\uDD2E " + ChatColor.GRAY + "Auto enchants sharpness 2",
                                ChatColor.WHITE + " ",
                                Common.colorize("#B8FFFB") + ChatColor.BOLD + "ᴘᴏᴡᴇʀs",
                                ChatColor.GRAY + "-" + ChatColor.WHITE + "\uD83E\uDD3A " + Common.colorize("#B5B5B5") + ChatColor.BOLD + "ғʀᴀɪʟᴇʀ",
                                ChatColor.GRAY + " " + ChatColor.DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB " + ChatColor.GRAY + "Clears potion effects",
                                ChatColor.GRAY + " gives weakness 1 for 20 seconds",
                                ChatColor.GRAY + " " + ChatColor.DARK_RED + "\uD83E\uDD3C " + ChatColor.GRAY + " Clears potion effects",
                                ChatColor.GRAY + " and gives withering, " + ChatColor.WHITE + "40s, R5",
                                ChatColor.WHITE + "",
                                ChatColor.GRAY + "-" + ChatColor.WHITE + "⚔" + Common.colorize("#910D0D") + " ᴄʜᴀᴅ sᴛʀᴇɴɢᴛʜ " + ChatColor.WHITE + "R4 40s",
                                ChatColor.GRAY + " " + ChatColor.GREEN + "\uD83E\uDDD1\uD83C\uDFFB " + ChatColor.GRAY + "Every 3 crits charges a hit that deals 2x the dmg",
                                ChatColor.GRAY + " " + ChatColor.GREEN + "\uD83E\uDD3C " + ChatColor.GRAY + "Every 8 crits charges a hit that deals 2x the dmg"
                        ));
                    }

                    if (energy == Energy.Ruined) {
                        itemMeta.setCustomModelData(90);
                        itemMeta.setLore(Arrays.asList(
                                ChatColor.WHITE + "" + ChatColor.BOLD + "ʜᴀᴠᴇ ᴛʜᴇ sᴛʀᴇɴɢᴛʜ ᴏғ ᴀ ᴀʀᴍʏ",
                                Common.colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                energystage,
                                ChatColor.GRAY + " " + Common.colorize("#F10303") + "\uD83D\uDD2E " + ChatColor.GRAY + "No passives",
                                ChatColor.WHITE + " ",
                                Common.colorize("#B8FFFB") + ChatColor.BOLD + "ᴘᴏᴡᴇʀs",
                                ChatColor.GRAY + "-" + ChatColor.WHITE + "\uD83E\uDD3A " + Common.colorize("#B5B5B5") + ChatColor.BOLD + "ғʀᴀɪʟᴇʀ",
                                ChatColor.GRAY + " " + ChatColor.DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB " + ChatColor.GRAY + "Clears potion effects",
                                ChatColor.GRAY + " gives weakness 1 for 20 seconds",
                                ChatColor.GRAY + " " + ChatColor.DARK_RED + "\uD83E\uDD3C " + ChatColor.GRAY + " Clears potion effects",
                                ChatColor.GRAY + " and gives withering, " + ChatColor.WHITE + "40s, R5",
                                ChatColor.WHITE + "",
                                ChatColor.GRAY + "-" + ChatColor.WHITE + "⚔" + Common.colorize("#910D0D") + " ᴄʜᴀᴅ sᴛʀᴇɴɢᴛʜ " + ChatColor.WHITE + "R4 40s",
                                ChatColor.GRAY + " " + ChatColor.GREEN + "\uD83E\uDDD1\uD83C\uDFFB " + ChatColor.GRAY + "Every 3 crits charges a hit that deals 2x the dmg",
                                ChatColor.GRAY + " " + ChatColor.GREEN + "\uD83E\uDD3C " + ChatColor.GRAY + "Every 8 crits charges a hit that deals 2x the dmg"
                        ));
                    }


                    if (energy == Energy.Broken || energy == Energy.N_A) {
                        itemMeta.setCustomModelData(96);
                        itemMeta.setLore(Arrays.asList(
                                ChatColor.WHITE + "" + ChatColor.BOLD + "ᴜsᴇʟᴇss"
                        ));
                    }
                    item.setItemMeta(itemMeta);
                    return item;
                }
                if (season == 3) {

                    ItemStack item = new ItemStack(Material.PRISMARINE_SHARD, 1);
                    ItemMeta itemMeta = item.getItemMeta();


                    NamespacedKey idkey = new NamespacedKey("blissgems", "gem-id");
                    itemMeta.getPersistentDataContainer().set(idkey, PersistentDataType.STRING, UUID.randomUUID().toString());

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
                    if (Gem.isPristineorHigher(energy)) {
                        if (energy == Energy.Pristine_5) {
                            itemMeta.addEnchant(Enchantment.DURABILITY, 1, true);
                        }

                        itemMeta.setCustomModelData(10);
                        itemMeta.setLore(Arrays.asList(
                                ChatColor.WHITE + "" + ChatColor.BOLD + "ʜᴀᴠᴇ ᴛʜᴇ sᴛʀᴇɴɢᴛʜ ᴏғ ᴀ ᴀʀᴍʏ",
                                Common.colorize("&f(") + energystage + Common.colorize("&f)"),
                                ChatColor.GRAY + "",
                                Common.colorize("#F10303") + "\uD83D\uDD2E" + " " + Common.colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                ChatColor.GRAY + "- Strength",
                                ChatColor.GRAY + "- Enchants Sharpness",
                                ChatColor.GRAY + "",
                                Common.colorize("#F10303") + "\uD83D\uDD2E" + " " + Common.colorize("#82F3FF") + ChatColor.BOLD + "ᴀʙɪʟɪᴛʏ",
                                ChatColor.GRAY + "- " + Common.colorize("#F10303") + "Bounty Hunter",
                                ChatColor.GRAY + "",
                                Common.colorize("#F10303") + "\uD83D\uDD2E " + Common.colorize("#B8FFFB") + ChatColor.BOLD + "ᴘᴏᴡᴇʀs",
                                ChatColor.GRAY + "- " + "\uD83E\uDD3A " + ChatColor.GRAY + "ꜰʀᴀɪʟᴇʀ " + ChatColor.DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                                ChatColor.GRAY + "- " + "\uD83E\uDD3A " + ChatColor.GRAY + "ɴᴜʟʟɪꜰʏ " + ChatColor.DARK_RED + "\uD83E\uDD3C",
                                ChatColor.GRAY + "",
                                ChatColor.GRAY + "- " + ChatColor.WHITE + "⚔ " + Common.colorize("#910D0D") + "ᴄʜᴀᴅ sᴛʀᴇɴɢᴛʜ " + ChatColor.GREEN + "\uD83E\uDDD1\uD83C\uDFFB",
                                ChatColor.GRAY + "- " + ChatColor.WHITE + "⚔ " + Common.colorize("#910D0D") + "ᴄʜᴀᴅ sᴛʀᴇɴɢᴛʜ " + ChatColor.GREEN + "\uD83E\uDD3C"
                        ));
                    }

                    if (energy == Energy.Scratched) {
                        itemMeta.setCustomModelData(30);
                        itemMeta.setLore(Arrays.asList(
                                ChatColor.WHITE + "" + ChatColor.BOLD + "ʜᴀᴠᴇ ᴛʜᴇ sᴛʀᴇɴɢᴛʜ ᴏғ ᴀ ᴀʀᴍʏ",
                                Common.colorize("&f(") + energystage + Common.colorize("&f)"),
                                ChatColor.GRAY + "",
                                Common.colorize("#F10303") + "\uD83D\uDD2E" + " " + Common.colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                ChatColor.GRAY + "- Strength",
                                ChatColor.GRAY + "- Enchants Sharpness",
                                ChatColor.GRAY + "",
                                Common.colorize("#F10303") + "\uD83D\uDD2E" + " " + Common.colorize("#82F3FF") + ChatColor.BOLD + "ᴀʙɪʟɪᴛʏ",
                                ChatColor.GRAY + "- " + Common.colorize("#F10303") + "Bounty Hunter",
                                ChatColor.GRAY + "",
                                Common.colorize("#F10303") + "\uD83D\uDD2E " + Common.colorize("#B8FFFB") + ChatColor.BOLD + "ᴘᴏᴡᴇʀs",
                                ChatColor.GRAY + "- " + "\uD83E\uDD3A " + ChatColor.GRAY + "ꜰʀᴀɪʟᴇʀ " + ChatColor.DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                                ChatColor.GRAY + "- " + "\uD83E\uDD3A " + ChatColor.GRAY + "ɴᴜʟʟɪꜰʏ " + ChatColor.DARK_RED + "\uD83E\uDD3C",
                                ChatColor.GRAY + "",
                                ChatColor.GRAY + "- " + ChatColor.WHITE + "⚔ " + Common.colorize("#910D0D") + "ᴄʜᴀᴅ sᴛʀᴇɴɢᴛʜ " + ChatColor.GREEN + "\uD83E\uDDD1\uD83C\uDFFB",
                                ChatColor.GRAY + "- " + ChatColor.WHITE + "⚔ " + Common.colorize("#910D0D") + "ᴄʜᴀᴅ sᴛʀᴇɴɢᴛʜ " + ChatColor.GREEN + "\uD83E\uDD3C"
                        ));
                    }

                    if (energy == Energy.Cracked) {
                        itemMeta.setCustomModelData(50);
                        itemMeta.setLore(Arrays.asList(
                                ChatColor.WHITE + "" + ChatColor.BOLD + "ʜᴀᴠᴇ ᴛʜᴇ sᴛʀᴇɴɢᴛʜ ᴏғ ᴀ ᴀʀᴍʏ",
                                Common.colorize("&f(") + energystage + Common.colorize("&f)"),
                                ChatColor.GRAY + "",
                                Common.colorize("#F10303") + "\uD83D\uDD2E" + " " + Common.colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                ChatColor.GRAY + "- Strength",
                                ChatColor.GRAY + "- Enchants Sharpness",
                                ChatColor.GRAY + "",
                                Common.colorize("#F10303") + "\uD83D\uDD2E" + " " + Common.colorize("#82F3FF") + ChatColor.BOLD + "ᴀʙɪʟɪᴛʏ",
                                ChatColor.GRAY + "- " + Common.colorize("#F10303") + "Bounty Hunter",
                                ChatColor.GRAY + "",
                                Common.colorize("#F10303") + "\uD83D\uDD2E " + Common.colorize("#B8FFFB") + ChatColor.BOLD + "ᴘᴏᴡᴇʀs",
                                ChatColor.GRAY + "- " + "\uD83E\uDD3A " + ChatColor.GRAY + "ꜰʀᴀɪʟᴇʀ " + ChatColor.DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                                ChatColor.GRAY + "- " + "\uD83E\uDD3A " + ChatColor.GRAY + "ɴᴜʟʟɪꜰʏ " + ChatColor.DARK_RED + "\uD83E\uDD3C",
                                ChatColor.GRAY + "",
                                ChatColor.GRAY + "- " + ChatColor.WHITE + "⚔ " + Common.colorize("#910D0D") + "ᴄʜᴀᴅ sᴛʀᴇɴɢᴛʜ " + ChatColor.GREEN + "\uD83E\uDDD1\uD83C\uDFFB",
                                ChatColor.GRAY + "- " + ChatColor.WHITE + "⚔ " + Common.colorize("#910D0D") + "ᴄʜᴀᴅ sᴛʀᴇɴɢᴛʜ " + ChatColor.GREEN + "\uD83E\uDD3C"
                        ));
                    }

                    if (energy == Energy.Damaged) {
                        itemMeta.setCustomModelData(70);
                        itemMeta.setLore(Arrays.asList(
                                ChatColor.WHITE + "" + ChatColor.BOLD + "ʜᴀᴠᴇ ᴛʜᴇ sᴛʀᴇɴɢᴛʜ ᴏғ ᴀ ᴀʀᴍʏ",
                                Common.colorize("&f(") + energystage + Common.colorize("&f)"),
                                ChatColor.GRAY + "",
                                Common.colorize("#F10303") + "\uD83D\uDD2E" + " " + Common.colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                ChatColor.GRAY + "- Enchants Sharpness",
                                ChatColor.GRAY + "",
                                Common.colorize("#F10303") + "\uD83D\uDD2E" + " " + Common.colorize("#82F3FF") + ChatColor.BOLD + "ᴀʙɪʟɪᴛʏ",
                                ChatColor.GRAY + "- " + Common.colorize("#F10303") + "Bounty Hunter",
                                ChatColor.GRAY + "",
                                Common.colorize("#F10303") + "\uD83D\uDD2E " + Common.colorize("#B8FFFB") + ChatColor.BOLD + "ᴘᴏᴡᴇʀs",
                                ChatColor.GRAY + "- " + "\uD83E\uDD3A " + ChatColor.GRAY + "ꜰʀᴀɪʟᴇʀ " + ChatColor.DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                                ChatColor.GRAY + "- " + "\uD83E\uDD3A " + ChatColor.GRAY + "ɴᴜʟʟɪꜰʏ " + ChatColor.DARK_RED + "\uD83E\uDD3C",
                                ChatColor.GRAY + "",
                                ChatColor.GRAY + "- " + ChatColor.WHITE + "⚔ " + Common.colorize("#910D0D") + "ᴄʜᴀᴅ sᴛʀᴇɴɢᴛʜ " + ChatColor.GREEN + "\uD83E\uDDD1\uD83C\uDFFB",
                                ChatColor.GRAY + "- " + ChatColor.WHITE + "⚔ " + Common.colorize("#910D0D") + "ᴄʜᴀᴅ sᴛʀᴇɴɢᴛʜ " + ChatColor.GREEN + "\uD83E\uDD3C"
                        ));
                    }

                    if (energy == Energy.Ruined) {
                        itemMeta.setCustomModelData(90);
                        itemMeta.setLore(Arrays.asList(
                                ChatColor.WHITE + "" + ChatColor.BOLD + "ʜᴀᴠᴇ ᴛʜᴇ sᴛʀᴇɴɢᴛʜ ᴏғ ᴀ ᴀʀᴍʏ",
                                Common.colorize("&f(") + energystage + Common.colorize("&f)"),
                                ChatColor.GRAY + "",
                                Common.colorize("#F10303") + "\uD83D\uDD2E" + " " + Common.colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                ChatColor.GRAY + "No Passives",
                                ChatColor.GRAY + "",
                                Common.colorize("#F10303") + "\uD83D\uDD2E" + " " + Common.colorize("#82F3FF") + ChatColor.BOLD + "ᴀʙɪʟɪᴛʏ",
                                ChatColor.GRAY + "- " + Common.colorize("#F10303") + "Bounty Hunter",
                                ChatColor.GRAY + "",
                                Common.colorize("#F10303") + "\uD83D\uDD2E " + Common.colorize("#B8FFFB") + ChatColor.BOLD + "ᴘᴏᴡᴇʀs",
                                ChatColor.GRAY + "- " + "\uD83E\uDD3A " + ChatColor.GRAY + "ꜰʀᴀɪʟᴇʀ " + ChatColor.DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                                ChatColor.GRAY + "- " + "\uD83E\uDD3A " + ChatColor.GRAY + "ɴᴜʟʟɪꜰʏ " + ChatColor.DARK_RED + "\uD83E\uDD3C",
                                ChatColor.GRAY + "",
                                ChatColor.GRAY + "- " + ChatColor.WHITE + "⚔ " + Common.colorize("#910D0D") + "ᴄʜᴀᴅ sᴛʀᴇɴɢᴛʜ " + ChatColor.GREEN + "\uD83E\uDDD1\uD83C\uDFFB",
                                ChatColor.GRAY + "- " + ChatColor.WHITE + "⚔ " + Common.colorize("#910D0D") + "ᴄʜᴀᴅ sᴛʀᴇɴɢᴛʜ " + ChatColor.GREEN + "\uD83E\uDD3C"
                        ));
                    }


                    if (energy == Energy.Broken || energy == Energy.N_A) {
                        itemMeta.setCustomModelData(96);
                        itemMeta.setLore(Arrays.asList(
                                ChatColor.WHITE + "" + ChatColor.BOLD + "ᴜsᴇʟᴇss"
                        ));
                    }
                    item.setItemMeta(itemMeta);
                    return item;
                }
            }


            //Speed

            if (gem == GemType.Speed) {
                if (season == 1) {
                    ItemStack item = new ItemStack(Material.PRISMARINE_SHARD, 1);
                    ItemMeta itemMeta = item.getItemMeta();


                    NamespacedKey idkey = new NamespacedKey("blissgems", "shard_id");
                    itemMeta.getPersistentDataContainer().set(idkey, PersistentDataType.STRING, String.valueOf(UUID.randomUUID().toString()));

                    itemMeta.setDisplayName(Common.colorize("#FEFD17") + ChatColor.BOLD + "Speed " + Common.colorize("#FFD773") + "Gem");


                    // Set HideFlags to 127 if server is lower than 1.20.6, if yes: then hide all flags.
                    // this is due to the nbt change, it is not possible to make everything 1-1 for people using 1.20.6 and higher.

                    if (VersionChecker.OlderThanNBTChange()) {
                        itemMeta.addItemFlags(
                                ItemFlag.HIDE_ENCHANTS,
                                ItemFlag.HIDE_ATTRIBUTES,
                                ItemFlag.HIDE_UNBREAKABLE,
                                ItemFlag.HIDE_DESTROYS,
                                ItemFlag.HIDE_PLACED_ON,
                                ItemFlag.HIDE_POTION_EFFECTS,
                                ItemFlag.HIDE_DYE);
                    } else {
                        for (ItemFlag flag : ItemFlag.values()) {
                            itemMeta.addItemFlags(flag);
                        }
                    }


                    itemMeta.setCustomModelData(8);
                    itemMeta.setLore(Arrays.asList(
                            ChatColor.WHITE + "" + ChatColor.BOLD + "Feel the energy, the speed",
                            Common.colorize("#FFE4AB") + "Passives",
                            ChatColor.GRAY + " " + Common.colorize("#FEFD17") + "\uD83D\uDD2E " + ChatColor.GRAY + "Speed 3, Dolphines Grace",
                            ChatColor.GRAY + " and immune to soul sand",
                            ChatColor.WHITE + " ",
                            Common.colorize("#B8FFFB") + ChatColor.BOLD + "Powers",
                            ChatColor.GRAY + "- " + ChatColor.DARK_GRAY + "\uD83C\uDFAF" + ChatColor.WHITE + "Sloths Sedative",
                            ChatColor.GRAY + " " + ChatColor.DARK_RED + "\uD83E\uDD3C " + ChatColor.GRAY + "Slowness 2, mining fatigue 3",
                            ChatColor.GRAY + " Clears speed effects, 0.8x slower crits, " + ChatColor.WHITE + "30s, R4",
                            ChatColor.GRAY + " " + ChatColor.DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB" + ChatColor.GRAY + "Slowness 4, mining fatigue 3",
                            ChatColor.GRAY + " Clears speed effects, 0.5x slower crits, " + ChatColor.WHITE + "40s, R4",
                            ChatColor.WHITE + "",
                            ChatColor.GRAY + "-" + ChatColor.WHITE + "🌩 " + Common.colorize("#61FFEA") + "Speedy Storm " + ChatColor.WHITE + "40s R4",
                            ChatColor.GREEN + " \uD83E\uDDD1\uD83C\uDFFB" + ChatColor.GRAY + "Spawns a Thunder Storm with lightning strikes",
                            ChatColor.GRAY + " the caster gets constant 1.5x faster crits while",
                            ChatColor.GRAY + " the storm is active and speed 3 while in the storm.",
                            ChatColor.GRAY + " Trusted get 1.3x faster crits and speed 3 in the storm",
                            ChatColor.GRAY + " If trusted or caster get struck by thunder they get",
                            ChatColor.GRAY + " Speed 6 and 2.2x faster crits, If untrusted is struck",
                            ChatColor.GRAY + " by thunder they are stunned for 2s",
                            ChatColor.GREEN + " \uD83E\uDD3C" + ChatColor.GRAY + "Gives trusted 1.5x faster crits and speed 3."
                    ));

                    item.setItemMeta(itemMeta);
                    return item;
                }


                if (season == 2) {


                    ItemStack item = new ItemStack(Material.PRISMARINE_SHARD, 1);
                    ItemMeta itemMeta = item.getItemMeta();


                    NamespacedKey idkey = new NamespacedKey("blissgems", "gem-id");
                    itemMeta.getPersistentDataContainer().set(idkey, PersistentDataType.STRING, UUID.randomUUID().toString());

                    NamespacedKey tierkey = new NamespacedKey("blissgems", "gem-tier");
                    itemMeta.getPersistentDataContainer().set(tierkey, PersistentDataType.INTEGER, tier);

                    NamespacedKey typekey = new NamespacedKey("blissgems", "gem-type");
                    itemMeta.getPersistentDataContainer().set(typekey, PersistentDataType.STRING, "speed");

                    NamespacedKey quicknodropkey = new NamespacedKey("blissgems", "quick-no-drop");
                    itemMeta.getPersistentDataContainer().set(quicknodropkey, PersistentDataType.INTEGER, quicknodrop);

                    NamespacedKey quicknoremovekey = new NamespacedKey("blissgems", "quick-no-remove");
                    itemMeta.getPersistentDataContainer().set(quicknoremovekey, PersistentDataType.INTEGER, quicknoremove);


                    itemMeta.setDisplayName(Common.colorize("#FEFD17") + ChatColor.BOLD + "sᴘᴇᴇᴅ " + Common.colorize("#FFD773") + "ɢᴇᴍ");
                    for (ItemFlag flag : ItemFlag.values()) {
                        itemMeta.addItemFlags(flag);
                    }

                    if (Gem.isPristineorHigher(energy)) {
                        if (energy == Energy.Pristine_5) {
                            itemMeta.addEnchant(Enchantment.DURABILITY, 1, true);
                        }
                        itemMeta.setCustomModelData(8);
                        itemMeta.setLore(Arrays.asList(
                                ChatColor.WHITE + "" + ChatColor.BOLD + "ᴡᴀᴛᴄʜ ᴛʜᴇ ᴡᴏʀʟᴅ ᴀʀᴏᴜɴᴅ ʏᴏᴜ ᴛᴜʀɴ ɪɴᴛᴏ ᴀ ʙʟᴜʀ",
                                Common.colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                energystage,
                                ChatColor.GRAY + " " + Common.colorize("#FEFD17") + "\uD83D\uDD2E " + ChatColor.GRAY + "Speed 3, Dolphins Grace",
                                ChatColor.GRAY + " and Immune to soul sand, auto-enchants efficiency 5",
                                ChatColor.WHITE + " ",
                                Common.colorize("#B8FFFB") + ChatColor.BOLD + "ᴘᴏᴡᴇʀs",
                                ChatColor.GRAY + "- " + ChatColor.WHITE + "\uD83C\uDFAF" + ChatColor.WHITE + "sʟᴏᴛʜs sᴇᴅᴀᴛɪᴠᴇ",
                                ChatColor.GRAY + " " + ChatColor.DARK_RED + "\uD83E\uDD3C\uD83C\uDFFB" + ChatColor.GRAY + " Slowness 2, mining fatigue 3",
                                ChatColor.GRAY + " Clears speed effects, 0.8x slower crits, " + ChatColor.WHITE + "30s, R4",
                                ChatColor.GRAY + " " + ChatColor.DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB" + ChatColor.GRAY + "Slowness 4, mining fatigue 3",
                                ChatColor.GRAY + " Clears speed effect, 0.5x slower crits, " + ChatColor.WHITE + "40s, R4",
                                ChatColor.WHITE + "",
                                ChatColor.GRAY + "-" + ChatColor.WHITE + "🌩 " + Common.colorize("#61FFEA") + "sᴘᴇᴇᴅʏ sᴛᴏʀᴍ " + ChatColor.WHITE + "40s R4",
                                ChatColor.GRAY + " " + ChatColor.GREEN + "\uD83E\uDDD1\uD83C\uDFFB" + ChatColor.GRAY + "Spawns a Thunder Storm with lightning strikes",
                                ChatColor.GRAY + " the caster gets constant 1.5x faster crits while",
                                ChatColor.GRAY + " the storm is active and speed 3 while in the storm.",
                                ChatColor.GRAY + " Trusted get 1.3x faster crits and speed 3 in the storm",
                                ChatColor.GRAY + " If trusted or caster get struck by thunder they get",
                                ChatColor.GRAY + " Speed 6 and 2.2x faster crits, If untrusted is struck",
                                ChatColor.GRAY + " by thunder they are stuned for 2s",
                                ChatColor.GRAY + " " + ChatColor.GREEN + "\uD83E\uDD3C" + ChatColor.GRAY + "Gives trusted 1.5x faster crits and speed 3."
                        ));
                    }


                    if (energy == Energy.Scratched) {
                        itemMeta.setCustomModelData(28);
                        itemMeta.setLore(Arrays.asList(
                                ChatColor.WHITE + "" + ChatColor.BOLD + "ᴡᴀᴛᴄʜ ᴛʜᴇ ᴡᴏʀʟᴅ ᴀʀᴏᴜɴᴅ ʏᴏᴜ ᴛᴜʀɴ ɪɴᴛᴏ ᴀ ʙʟᴜʀ",
                                Common.colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                energystage,
                                ChatColor.GRAY + " " + Common.colorize("#FEFD17") + "\uD83D\uDD2E " + ChatColor.GRAY + "Speed 3, Immune to soul sand",
                                ChatColor.GRAY + " auto-enchants efficiency 4",
                                ChatColor.WHITE + " ",
                                Common.colorize("#B8FFFB") + ChatColor.BOLD + "ᴘᴏᴡᴇʀs",
                                ChatColor.GRAY + "- " + ChatColor.WHITE + "\uD83C\uDFAF" + ChatColor.WHITE + "sʟᴏᴛʜs sᴇᴅᴀᴛɪᴠᴇ",
                                ChatColor.GRAY + " " + ChatColor.DARK_RED + "\uD83E\uDD3C\uD83C\uDFFB" + ChatColor.GRAY + " Slowness 2, mining fatigue 3",
                                ChatColor.GRAY + " Clears speed effects, 0.8x slower crits, " + ChatColor.WHITE + "30s, R4",
                                ChatColor.GRAY + " " + ChatColor.DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB" + ChatColor.GRAY + "Slowness 4, mining fatigue 3",
                                ChatColor.GRAY + " Clears speed effect, 0.5x slower crits, " + ChatColor.WHITE + "40s, R4",
                                ChatColor.WHITE + "",
                                ChatColor.GRAY + "-" + ChatColor.WHITE + "🌩 " + Common.colorize("#61FFEA") + "sᴘᴇᴇᴅʏ sᴛᴏʀᴍ " + ChatColor.WHITE + "40s R4",
                                ChatColor.GRAY + " " + ChatColor.GREEN + "\uD83E\uDDD1\uD83C\uDFFB" + ChatColor.GRAY + "Spawns a Thunder Storm with lightning strikes",
                                ChatColor.GRAY + " the caster gets constant 1.5x faster crits while",
                                ChatColor.GRAY + " the storm is active and speed 3 while in the storm.",
                                ChatColor.GRAY + " Trusted get 1.3x faster crits and speed 3 in the storm",
                                ChatColor.GRAY + " If trusted or caster get struck by thunder they get",
                                ChatColor.GRAY + " Speed 6 and 2.2x faster crits, If untrusted is struck",
                                ChatColor.GRAY + " by thunder they are stuned for 2s",
                                ChatColor.GRAY + " " + ChatColor.GREEN + "\uD83E\uDD3C" + ChatColor.GRAY + "Gives trusted 1.5x faster crits and speed 3."
                        ));
                    }

                    if (energy == Energy.Cracked) {
                        itemMeta.setCustomModelData(48);
                        itemMeta.setLore(Arrays.asList(
                                ChatColor.WHITE + "" + ChatColor.BOLD + "ᴡᴀᴛᴄʜ ᴛʜᴇ ᴡᴏʀʟᴅ ᴀʀᴏᴜɴᴅ ʏᴏᴜ ᴛᴜʀɴ ɪɴᴛᴏ ᴀ ʙʟᴜʀ",
                                Common.colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                energystage,
                                ChatColor.GRAY + " " + Common.colorize("#FEFD17") + "\uD83D\uDD2E " + ChatColor.GRAY + "Speed 3, Immune to soul sand",
                                ChatColor.GRAY + " auto-enchants efficiency 3",
                                ChatColor.WHITE + " ",
                                Common.colorize("#B8FFFB") + ChatColor.BOLD + "ᴘᴏᴡᴇʀs",
                                ChatColor.GRAY + "- " + ChatColor.WHITE + "\uD83C\uDFAF" + ChatColor.WHITE + "sʟᴏᴛʜs sᴇᴅᴀᴛɪᴠᴇ",
                                ChatColor.GRAY + " " + ChatColor.DARK_RED + "\uD83E\uDD3C\uD83C\uDFFB" + ChatColor.GRAY + " Slowness 2, mining fatigue 3",
                                ChatColor.GRAY + " Clears speed effects, 0.8x slower crits, " + ChatColor.WHITE + "30s, R4",
                                ChatColor.GRAY + " " + ChatColor.DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB" + ChatColor.GRAY + "Slowness 4, mining fatigue 3",
                                ChatColor.GRAY + " Clears speed effect, 0.5x slower crits, " + ChatColor.WHITE + "40s, R4",
                                ChatColor.WHITE + "",
                                ChatColor.GRAY + "-" + ChatColor.WHITE + "🌩 " + Common.colorize("#61FFEA") + "sᴘᴇᴇᴅʏ sᴛᴏʀᴍ " + ChatColor.WHITE + "40s R4",
                                ChatColor.GRAY + " " + ChatColor.GREEN + "\uD83E\uDDD1\uD83C\uDFFB" + ChatColor.GRAY + "Spawns a Thunder Storm with lightning strikes",
                                ChatColor.GRAY + " the caster gets constant 1.5x faster crits while",
                                ChatColor.GRAY + " the storm is active and speed 3 while in the storm.",
                                ChatColor.GRAY + " Trusted get 1.3x faster crits and speed 3 in the storm",
                                ChatColor.GRAY + " If trusted or caster get struck by thunder they get",
                                ChatColor.GRAY + " Speed 6 and 2.2x faster crits, If untrusted is struck",
                                ChatColor.GRAY + " by thunder they are stuned for 2s",
                                ChatColor.GRAY + " " + ChatColor.GREEN + "\uD83E\uDD3C" + ChatColor.GRAY + "Gives trusted 1.5x faster crits and speed 3."
                        ));
                    }

                    if (energy == Energy.Damaged) {
                        itemMeta.setCustomModelData(68);
                        itemMeta.setLore(Arrays.asList(
                                ChatColor.WHITE + "" + ChatColor.BOLD + "ᴡᴀᴛᴄʜ ᴛʜᴇ ᴡᴏʀʟᴅ ᴀʀᴏᴜɴᴅ ʏᴏᴜ ᴛᴜʀɴ ɪɴᴛᴏ ᴀ ʙʟᴜʀ",
                                Common.colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                energystage,
                                ChatColor.GRAY + " " + Common.colorize("#FEFD17") + "\uD83D\uDD2E " + ChatColor.GRAY + "Immune to soul sand",
                                ChatColor.GRAY + " auto-enchants efficiency 2",
                                ChatColor.WHITE + " ",
                                Common.colorize("#B8FFFB") + ChatColor.BOLD + "ᴘᴏᴡᴇʀs",
                                ChatColor.GRAY + "- " + ChatColor.WHITE + "\uD83C\uDFAF" + ChatColor.WHITE + "sʟᴏᴛʜs sᴇᴅᴀᴛɪᴠᴇ",
                                ChatColor.GRAY + " " + ChatColor.DARK_RED + "\uD83E\uDD3C\uD83C\uDFFB" + ChatColor.GRAY + " Slowness 2, mining fatigue 3",
                                ChatColor.GRAY + " Clears speed effects, 0.8x slower crits, " + ChatColor.WHITE + "30s, R4",
                                ChatColor.GRAY + " " + ChatColor.DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB" + ChatColor.GRAY + "Slowness 4, mining fatigue 3",
                                ChatColor.GRAY + " Clears speed effect, 0.5x slower crits, " + ChatColor.WHITE + "40s, R4",
                                ChatColor.WHITE + "",
                                ChatColor.GRAY + "-" + ChatColor.WHITE + "🌩 " + Common.colorize("#61FFEA") + "sᴘᴇᴇᴅʏ sᴛᴏʀᴍ " + ChatColor.WHITE + "40s R4",
                                ChatColor.GRAY + " " + ChatColor.GREEN + "\uD83E\uDDD1\uD83C\uDFFB" + ChatColor.GRAY + "Spawns a Thunder Storm with lightning strikes",
                                ChatColor.GRAY + " the caster gets constant 1.5x faster crits while",
                                ChatColor.GRAY + " the storm is active and speed 3 while in the storm.",
                                ChatColor.GRAY + " Trusted get 1.3x faster crits and speed 3 in the storm",
                                ChatColor.GRAY + " If trusted or caster get struck by thunder they get",
                                ChatColor.GRAY + " Speed 6 and 2.2x faster crits, If untrusted is struck",
                                ChatColor.GRAY + " by thunder they are stuned for 2s",
                                ChatColor.GRAY + " " + ChatColor.GREEN + "\uD83E\uDD3C" + ChatColor.GRAY + "Gives trusted 1.5x faster crits and speed 3."
                        ));
                    }

                    if (energy == Energy.Ruined) {
                        itemMeta.setCustomModelData(88);
                        itemMeta.setLore(Arrays.asList(
                                ChatColor.WHITE + "" + ChatColor.BOLD + "ᴡᴀᴛᴄʜ ᴛʜᴇ ᴡᴏʀʟᴅ ᴀʀᴏᴜɴᴅ ʏᴏᴜ ᴛᴜʀɴ ɪɴᴛᴏ ᴀ ʙʟᴜʀ",
                                Common.colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                energystage,
                                ChatColor.GRAY + " " + Common.colorize("#FEFD17") + "\uD83D\uDD2E " + ChatColor.GRAY + "No passives",
                                ChatColor.WHITE + " ",
                                Common.colorize("#B8FFFB") + ChatColor.BOLD + "ᴘᴏᴡᴇʀs",
                                ChatColor.GRAY + "- " + ChatColor.WHITE + "\uD83C\uDFAF" + ChatColor.WHITE + "sʟᴏᴛʜs sᴇᴅᴀᴛɪᴠᴇ",
                                ChatColor.GRAY + " " + ChatColor.DARK_RED + "\uD83E\uDD3C\uD83C\uDFFB" + ChatColor.GRAY + " Slowness 2, mining fatigue 3",
                                ChatColor.GRAY + " Clears speed effects, 0.8x slower crits, " + ChatColor.WHITE + "30s, R4",
                                ChatColor.GRAY + " " + ChatColor.DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB" + ChatColor.GRAY + "Slowness 4, mining fatigue 3",
                                ChatColor.GRAY + " Clears speed effect, 0.5x slower crits, " + ChatColor.WHITE + "40s, R4",
                                ChatColor.WHITE + "",
                                ChatColor.GRAY + "-" + ChatColor.WHITE + "🌩 " + Common.colorize("#61FFEA") + "sᴘᴇᴇᴅʏ sᴛᴏʀᴍ " + ChatColor.WHITE + "40s R4",
                                ChatColor.GRAY + " " + ChatColor.GREEN + "\uD83E\uDDD1\uD83C\uDFFB" + ChatColor.GRAY + "Spawns a Thunder Storm with lightning strikes",
                                ChatColor.GRAY + " the caster gets constant 1.5x faster crits while",
                                ChatColor.GRAY + " the storm is active and speed 3 while in the storm.",
                                ChatColor.GRAY + " Trusted get 1.3x faster crits and speed 3 in the storm",
                                ChatColor.GRAY + " If trusted or caster get struck by thunder they get",
                                ChatColor.GRAY + " Speed 6 and 2.2x faster crits, If untrusted is struck",
                                ChatColor.GRAY + " by thunder they are stuned for 2s",
                                ChatColor.GRAY + " " + ChatColor.GREEN + "\uD83E\uDD3C" + ChatColor.GRAY + "Gives trusted 1.5x faster crits and speed 3."
                        ));
                    }


                    if (energy == Energy.Broken || energy == Energy.N_A) {
                        itemMeta.setCustomModelData(96);
                        itemMeta.setLore(Arrays.asList(
                                ChatColor.WHITE + "" + ChatColor.BOLD + "ᴜsᴇʟᴇss"
                        ));
                    }
                    item.setItemMeta(itemMeta);
                    return item;
                }


                if (season == 3) {

                    ItemStack item = new ItemStack(Material.PRISMARINE_SHARD, 1);
                    ItemMeta itemMeta = item.getItemMeta();


                    NamespacedKey idkey = new NamespacedKey("blissgems", "gem-id");
                    itemMeta.getPersistentDataContainer().set(idkey, PersistentDataType.STRING, UUID.randomUUID().toString());

                    NamespacedKey tierkey = new NamespacedKey("blissgems", "gem-tier");
                    itemMeta.getPersistentDataContainer().set(tierkey, PersistentDataType.INTEGER, tier);

                    NamespacedKey typekey = new NamespacedKey("blissgems", "gem-type");
                    itemMeta.getPersistentDataContainer().set(typekey, PersistentDataType.STRING, "speed");

                    NamespacedKey quicknodropkey = new NamespacedKey("blissgems", "quick-no-drop");
                    itemMeta.getPersistentDataContainer().set(quicknodropkey, PersistentDataType.INTEGER, quicknodrop);

                    NamespacedKey quicknoremovekey = new NamespacedKey("blissgems", "quick-no-remove");
                    itemMeta.getPersistentDataContainer().set(quicknoremovekey, PersistentDataType.INTEGER, quicknoremove);


                    itemMeta.setDisplayName(Common.colorize("#FEFD17") + ChatColor.BOLD + "sᴘᴇᴇᴅ " + Common.colorize("#FFD773") + "ɢᴇᴍ");
                    for (ItemFlag flag : ItemFlag.values()) {
                        itemMeta.addItemFlags(flag);
                    }
                    if (Gem.isPristineorHigher(energy)) {
                        if (energy == Energy.Pristine_5) {
                            itemMeta.addEnchant(Enchantment.DURABILITY, 1, true);
                        }

                        itemMeta.setCustomModelData(8);
                        itemMeta.setLore(Arrays.asList(
                                ChatColor.WHITE + "" + ChatColor.BOLD + "ᴡᴀᴛᴄʜ ᴛʜᴇ ᴡᴏʀʟᴅ ᴀʀᴏᴜɴᴅ ʏᴏᴜ ᴛᴜʀɴ ɪɴᴛᴏ ᴀ ʙʟᴜʀ",
                                Common.colorize("&f(") + energystage + Common.colorize("&f)"),
                                ChatColor.GRAY + "",
                                Common.colorize("#FEFD17") + "\uD83D\uDD2E" + " " + Common.colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                ChatColor.GRAY + "- Speed",
                                ChatColor.GRAY + "- Dolphins grace",
                                ChatColor.GRAY + "- Enchants Efficiency",
                                ChatColor.GRAY + "- Enchants Soul Speed",
                                ChatColor.GRAY + "",
                                Common.colorize("#FEFD17") + "\uD83D\uDD2E" + " " + Common.colorize("#82F3FF") + ChatColor.BOLD + "ᴀʙɪʟɪᴛʏ",
                                ChatColor.GRAY + "- " + Common.colorize("#FEFD17") + " Terminal Velocity",
                                ChatColor.GRAY + "",
                                Common.colorize("#FEFD17") + "\uD83D\uDD2E " + Common.colorize("#B8FFFB") + ChatColor.BOLD + "ᴘᴏᴡᴇʀs",
                                ChatColor.GRAY + "- " + "\uD83C\uDFAF " + Common.colorize("#FEFD17") + "ʙʟᴜʀ",
                                ChatColor.GRAY + "",
                                ChatColor.GRAY + "- " + ChatColor.WHITE + "\uD83C\uDF29 " + Common.colorize("#61FFEA") + "sᴘᴇᴇᴅʏ sᴛᴏʀᴍ " + ChatColor.DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                                ChatColor.GRAY + "- " + ChatColor.WHITE + "\uD83C\uDF29 " + Common.colorize("#61FFEA") + "sᴘᴇᴇᴅʏ sᴛᴏʀᴍ " + ChatColor.DARK_RED + "\uD83E\uDD3C"
                        ));
                    }

                    if (energy == Energy.Scratched) {
                        itemMeta.setCustomModelData(28);
                        itemMeta.setLore(Arrays.asList(
                                ChatColor.WHITE + "" + ChatColor.BOLD + "ᴡᴀᴛᴄʜ ᴛʜᴇ ᴡᴏʀʟᴅ ᴀʀᴏᴜɴᴅ ʏᴏᴜ ᴛᴜʀɴ ɪɴᴛᴏ ᴀ ʙʟᴜʀ",
                                Common.colorize("&f(") + energystage + Common.colorize("&f)"),
                                ChatColor.GRAY + "",
                                Common.colorize("#FEFD17") + "\uD83D\uDD2E" + " " + Common.colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                ChatColor.GRAY + "- Speed",
                                ChatColor.GRAY + "- Enchants Efficiency",
                                ChatColor.GRAY + "- Enchants Soul Speed",
                                ChatColor.GRAY + "",
                                Common.colorize("#FEFD17") + "\uD83D\uDD2E" + " " + Common.colorize("#82F3FF") + ChatColor.BOLD + "ᴀʙɪʟɪᴛʏ",
                                ChatColor.GRAY + "- " + Common.colorize("#FEFD17") + " Terminal Velocity",
                                ChatColor.GRAY + "",
                                Common.colorize("#FEFD17") + "\uD83D\uDD2E " + Common.colorize("#B8FFFB") + ChatColor.BOLD + "ᴘᴏᴡᴇʀs",
                                ChatColor.GRAY + "- " + "\uD83C\uDFAF " + Common.colorize("#FEFD17") + "ʙʟᴜʀ",
                                ChatColor.GRAY + "",
                                ChatColor.GRAY + "- " + ChatColor.WHITE + "\uD83C\uDF29 " + Common.colorize("#61FFEA") + "sᴘᴇᴇᴅʏ sᴛᴏʀᴍ " + ChatColor.DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                                ChatColor.GRAY + "- " + ChatColor.WHITE + "\uD83C\uDF29 " + Common.colorize("#61FFEA") + "sᴘᴇᴇᴅʏ sᴛᴏʀᴍ " + ChatColor.DARK_RED + "\uD83E\uDD3C"
                        ));
                    }

                    if (energy == Energy.Cracked) {
                        itemMeta.setCustomModelData(48);
                        itemMeta.setLore(Arrays.asList(
                                ChatColor.WHITE + "" + ChatColor.BOLD + "ᴡᴀᴛᴄʜ ᴛʜᴇ ᴡᴏʀʟᴅ ᴀʀᴏᴜɴᴅ ʏᴏᴜ ᴛᴜʀɴ ɪɴᴛᴏ ᴀ ʙʟᴜʀ",
                                Common.colorize("&f(") + energystage + Common.colorize("&f)"),
                                ChatColor.GRAY + "",
                                Common.colorize("#FEFD17") + "\uD83D\uDD2E" + " " + Common.colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                ChatColor.GRAY + "- Speed",
                                ChatColor.GRAY + "- Enchants Efficiency",
                                ChatColor.GRAY + "- Enchants Soul Speed",
                                ChatColor.GRAY + "",
                                Common.colorize("#FEFD17") + "\uD83D\uDD2E" + " " + Common.colorize("#82F3FF") + ChatColor.BOLD + "ᴀʙɪʟɪᴛʏ",
                                ChatColor.GRAY + "- " + Common.colorize("#FEFD17") + " Terminal Velocity",
                                ChatColor.GRAY + "",
                                Common.colorize("#FEFD17") + "\uD83D\uDD2E " + Common.colorize("#B8FFFB") + ChatColor.BOLD + "ᴘᴏᴡᴇʀs",
                                ChatColor.GRAY + "- " + "\uD83C\uDFAF " + Common.colorize("#FEFD17") + "ʙʟᴜʀ",
                                ChatColor.GRAY + "",
                                ChatColor.GRAY + "- " + ChatColor.WHITE + "\uD83C\uDF29 " + Common.colorize("#61FFEA") + "sᴘᴇᴇᴅʏ sᴛᴏʀᴍ " + ChatColor.DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                                ChatColor.GRAY + "- " + ChatColor.WHITE + "\uD83C\uDF29 " + Common.colorize("#61FFEA") + "sᴘᴇᴇᴅʏ sᴛᴏʀᴍ " + ChatColor.DARK_RED + "\uD83E\uDD3C"
                        ));
                    }

                    if (energy == Energy.Damaged) {
                        itemMeta.setCustomModelData(68);
                        itemMeta.setLore(Arrays.asList(
                                ChatColor.WHITE + "" + ChatColor.BOLD + "ᴡᴀᴛᴄʜ ᴛʜᴇ ᴡᴏʀʟᴅ ᴀʀᴏᴜɴᴅ ʏᴏᴜ ᴛᴜʀɴ ɪɴᴛᴏ ᴀ ʙʟᴜʀ",
                                Common.colorize("&f(") + energystage + Common.colorize("&f)"),
                                ChatColor.GRAY + "",
                                Common.colorize("#FEFD17") + "\uD83D\uDD2E" + " " + Common.colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                ChatColor.GRAY + "- Enchants Efficiency",
                                ChatColor.GRAY + "- Enchants Soul Speed",
                                ChatColor.GRAY + "",
                                Common.colorize("#FEFD17") + "\uD83D\uDD2E" + " " + Common.colorize("#82F3FF") + ChatColor.BOLD + "ᴀʙɪʟɪᴛʏ",
                                ChatColor.GRAY + "- " + Common.colorize("#FEFD17") + " Terminal Velocity",
                                ChatColor.GRAY + "",
                                Common.colorize("#FEFD17") + "\uD83D\uDD2E " + Common.colorize("#B8FFFB") + ChatColor.BOLD + "ᴘᴏᴡᴇʀs",
                                ChatColor.GRAY + "- " + "\uD83C\uDFAF " + Common.colorize("#FEFD17") + "ʙʟᴜʀ",
                                ChatColor.GRAY + "",
                                ChatColor.GRAY + "- " + ChatColor.WHITE + "\uD83C\uDF29 " + Common.colorize("#61FFEA") + "sᴘᴇᴇᴅʏ sᴛᴏʀᴍ " + ChatColor.DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                                ChatColor.GRAY + "- " + ChatColor.WHITE + "\uD83C\uDF29 " + Common.colorize("#61FFEA") + "sᴘᴇᴇᴅʏ sᴛᴏʀᴍ " + ChatColor.DARK_RED + "\uD83E\uDD3C"
                        ));
                    }

                    if (energy == Energy.Ruined) {
                        itemMeta.setCustomModelData(88);
                        itemMeta.setLore(Arrays.asList(
                                ChatColor.WHITE + "" + ChatColor.BOLD + "ᴡᴀᴛᴄʜ ᴛʜᴇ ᴡᴏʀʟᴅ ᴀʀᴏᴜɴᴅ ʏᴏᴜ ᴛᴜʀɴ ɪɴᴛᴏ ᴀ ʙʟᴜʀ",
                                Common.colorize("&f(") + energystage + Common.colorize("&f)"),
                                ChatColor.GRAY + "",
                                Common.colorize("#FEFD17") + "\uD83D\uDD2E" + " " + Common.colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                ChatColor.GRAY + "- No Passives",
                                ChatColor.GRAY + "",
                                Common.colorize("#FEFD17") + "\uD83D\uDD2E" + " " + Common.colorize("#82F3FF") + ChatColor.BOLD + "ᴀʙɪʟɪᴛʏ",
                                ChatColor.GRAY + "- " + Common.colorize("#FEFD17") + " Terminal Velocity",
                                ChatColor.GRAY + "",
                                Common.colorize("#FEFD17") + "\uD83D\uDD2E " + Common.colorize("#B8FFFB") + ChatColor.BOLD + "ᴘᴏᴡᴇʀs",
                                ChatColor.GRAY + "- " + "\uD83C\uDFAF " + Common.colorize("#FEFD17") + "ʙʟᴜʀ",
                                ChatColor.GRAY + "",
                                ChatColor.GRAY + "- " + ChatColor.WHITE + "\uD83C\uDF29 " + Common.colorize("#61FFEA") + "sᴘᴇᴇᴅʏ sᴛᴏʀᴍ " + ChatColor.DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                                ChatColor.GRAY + "- " + ChatColor.WHITE + "\uD83C\uDF29 " + Common.colorize("#61FFEA") + "sᴘᴇᴇᴅʏ sᴛᴏʀᴍ " + ChatColor.DARK_RED + "\uD83E\uDD3C"
                        ));
                    }


                    if (energy == Energy.Broken || energy == Energy.N_A) {
                        itemMeta.setCustomModelData(96);
                        itemMeta.setLore(Arrays.asList(
                                ChatColor.WHITE + "" + ChatColor.BOLD + "ᴜsᴇʟᴇss"
                        ));
                    }
                    item.setItemMeta(itemMeta);
                    return item;
                }
            }



            //Life

            if (gem == GemType.Life) {
                if (season == 1) {
                    ItemStack item = new ItemStack(Material.PRISMARINE_SHARD, 1);
                    ItemMeta itemMeta = item.getItemMeta();


                    NamespacedKey idkey = new NamespacedKey("blissgems", "shard_id");
                    itemMeta.getPersistentDataContainer().set(idkey, PersistentDataType.STRING, String.valueOf(UUID.randomUUID().toString()));

                    itemMeta.setDisplayName(Common.colorize("#FE04B4") + ChatColor.BOLD + "Life " + Common.colorize("#FFD773") + "Gem");


                    // Set HideFlags to 127 if server is lower than 1.20.6, if yes: then hide all flags.
                    // this is due to the nbt change, it is not possible to make everything 1-1 for people using 1.20.6 and higher.

                    if (VersionChecker.OlderThanNBTChange()) {
                        itemMeta.addItemFlags(
                                ItemFlag.HIDE_ENCHANTS,
                                ItemFlag.HIDE_ATTRIBUTES,
                                ItemFlag.HIDE_UNBREAKABLE,
                                ItemFlag.HIDE_DESTROYS,
                                ItemFlag.HIDE_PLACED_ON,
                                ItemFlag.HIDE_POTION_EFFECTS,
                                ItemFlag.HIDE_DYE);
                    } else {
                        for (ItemFlag flag : ItemFlag.values()) {
                            itemMeta.addItemFlags(flag);
                        }
                    }


                    itemMeta.setCustomModelData(4);
                    itemMeta.setLore(Arrays.asList(
                            ChatColor.WHITE + "" + ChatColor.BOLD + "Control life itself",
                            Common.colorize("#FFE4AB") + "Passives",
                            ChatColor.GRAY + " " + Common.colorize("#FE04B4") + "\uD83D\uDD2E " + ChatColor.GRAY + "Feed animals and grow plants",
                            ChatColor.GRAY + " by crouch clicking with bare hand, 3x dmg",
                            ChatColor.GRAY + " to undead mobs, 2x the saturation capacity",
                            ChatColor.GRAY + " Immune to withering, heal half a heart ever 5 seconds",
                            ChatColor.GRAY + " 2 more hearts from gapples, and 90% chance totems work",
                            ChatColor.WHITE + " ",
                            Common.colorize("#FFE4AB") + "Powers",
                            ChatColor.GRAY + "-" + Common.colorize("#910D0D") + "\uD83D\uDC98 " + Common.colorize("#FE04B4") + "Heart Drainer", //emoji color is not accurate, i dont have the color for it
                            ChatColor.GRAY + " " + ChatColor.DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB " + ChatColor.GRAY + "Removes 30% of players hearts " + ChatColor.WHITE + "20s",
                            ChatColor.GRAY + " " + ChatColor.DARK_RED + "\uD83E\uDD3C " + ChatColor.GRAY + "Removes 15% of players hearts " + ChatColor.WHITE + "R4, 1m",
                            ChatColor.WHITE + "",
                            ChatColor.GRAY + "-" + ChatColor.WHITE + "\uD83D\uDC96 " + Common.colorize("#B8FFFA") + "Privilege Precinct",
                            ChatColor.GREEN + "\uD83E\uDDD1\uD83C\uDFFB " + ChatColor.GRAY + "Summons a 8 block wide zone that follows you",
                            ChatColor.GRAY + " Gives trusted +3, Untrusted -3 hearts",
                            ChatColor.GRAY + " slowly mends armour and tools if trusted",
                            ChatColor.GRAY + " caster only can steal health while zone is active",
                            ChatColor.GREEN + "\uD83E\uDD3C " + ChatColor.GRAY + "Gives trusted players +3 hearts for " + ChatColor.WHITE + "1m 30s, R4"
                    ));

                    item.setItemMeta(itemMeta);
                    return item;
                }


                if (season == 2) {


                    ItemStack item = new ItemStack(Material.PRISMARINE_SHARD, 1);
                    ItemMeta itemMeta = item.getItemMeta();


                    NamespacedKey idkey = new NamespacedKey("blissgems", "gem-id");
                    itemMeta.getPersistentDataContainer().set(idkey, PersistentDataType.STRING, "68e42971-2824-48c2-8df2-3647a5783cb6");

                    NamespacedKey tierkey = new NamespacedKey("blissgems", "gem-tier");
                    itemMeta.getPersistentDataContainer().set(tierkey, PersistentDataType.INTEGER, tier);

                    NamespacedKey typekey = new NamespacedKey("blissgems", "gem-type");
                    itemMeta.getPersistentDataContainer().set(typekey, PersistentDataType.STRING, "life");

                    NamespacedKey quicknodropkey = new NamespacedKey("blissgems", "quick-no-drop");
                    itemMeta.getPersistentDataContainer().set(quicknodropkey, PersistentDataType.INTEGER, quicknodrop);

                    NamespacedKey quicknoremovekey = new NamespacedKey("blissgems", "quick-no-remove");
                    itemMeta.getPersistentDataContainer().set(quicknoremovekey, PersistentDataType.INTEGER, quicknoremove);


                    itemMeta.setDisplayName(Common.colorize("#FE04B4") + ChatColor.BOLD + "ʟɪғᴇ " + Common.colorize("#FFD773") + "ɢᴇᴍ");
                    for (ItemFlag flag : ItemFlag.values()) {
                        itemMeta.addItemFlags(flag);
                    }

                    if (Gem.isPristineorHigher(energy)) {
                        if (energy == Energy.Pristine_5) {
                            itemMeta.addEnchant(Enchantment.DURABILITY, 1, true);
                        }
                        itemMeta.setCustomModelData(4);
                        itemMeta.setLore(Arrays.asList(
                                ChatColor.WHITE + "" + ChatColor.BOLD + "ᴄᴏɴᴛʀᴏʟ ᴛʜᴇ ʙᴀʟᴀɴᴄᴇ ᴏғ ʟɪғᴇ",
                                Common.colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                energystage,
                                ChatColor.GRAY + " " + Common.colorize("#FE04B4") + "\uD83D\uDD2E" + ChatColor.GRAY + " " + ChatColor.GRAY + "Feed animals and grow plants",
                                ChatColor.GRAY + " by crouch clicking with bare hand. 3x dmg",
                                ChatColor.GRAY + " to undead mobs. 2x saturation",
                                ChatColor.GRAY + " Immune to withering. Heal half a heart ever 5 seconds",
                                ChatColor.GRAY + " 2 more hearts from gapples.",
                                ChatColor.WHITE + " ",
                                Common.colorize("#FFE4AB") + "ᴘᴏᴡᴇʀs ",
                                ChatColor.GRAY + "-" + ChatColor.WHITE + "\uD83D\uDC98" + Common.colorize("#FF429A") + " ʜᴇᴀʀᴛ ᴅʀᴀɪɴᴇʀ", //emoji color is not accurate, i dont have the color for it
                                ChatColor.GRAY + " " + ChatColor.DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB " + ChatColor.GRAY + "Removes 4 hearts " + ChatColor.WHITE + "20s",
                                ChatColor.GRAY + " " + ChatColor.DARK_RED + "\uD83E\uDD3C " + ChatColor.GRAY + "Removes 2 hearts " + ChatColor.WHITE + "R4, 1m",
                                ChatColor.WHITE + "",
                                ChatColor.GRAY + "-" + ChatColor.WHITE + "\uD83D\uDC96" + Common.colorize("#B8FFFA") + " ᴄɪʀᴄʟᴇ ᴏғ ʟɪғᴇ",
                                ChatColor.GREEN + "\uD83E\uDDD1\uD83C\uDFFB " + ChatColor.GRAY + "Summons a 8 block wide zone that follows you",
                                ChatColor.GRAY + " Gives trusted +4, Untrusted -4 hearts",
                                ChatColor.GRAY + " slowly mends armour and tools if trusted",
                                ChatColor.GRAY + " caster only can steal health while zone is active",
                                ChatColor.GREEN + "\uD83E\uDD3C " + ChatColor.GRAY + "Gives trusted players +5 hearts for " + ChatColor.WHITE + "1m 30s, R4"
                        ));
                    }


                    if (energy == Energy.Scratched) {
                        itemMeta.setCustomModelData(24);
                        itemMeta.setLore(Arrays.asList(
                                ChatColor.WHITE + "" + ChatColor.BOLD + "ᴄᴏɴᴛʀᴏʟ ᴛʜᴇ ʙᴀʟᴀɴᴄᴇ ᴏғ ʟɪғᴇ",
                                Common.colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                energystage,
                                ChatColor.GRAY + " " + Common.colorize("#FE04B4") + "\uD83D\uDD2E" + ChatColor.GRAY + " " + ChatColor.GRAY + "Feed animals and grow plants",
                                ChatColor.GRAY + " by crouch clicking with bare hand. 3x dmg",
                                ChatColor.GRAY + " to undead mobs. Immune to withering",
                                ChatColor.GRAY + " Heal half a heart ever 5 seconds",
                                ChatColor.WHITE + " ",
                                Common.colorize("#FFE4AB") + "ᴘᴏᴡᴇʀs ",
                                ChatColor.GRAY + "-" + ChatColor.WHITE + "\uD83D\uDC98" + Common.colorize("#FF429A") + " ʜᴇᴀʀᴛ ᴅʀᴀɪɴᴇʀ", //emoji color is not accurate, i dont have the color for it
                                ChatColor.GRAY + " " + ChatColor.DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB " + ChatColor.GRAY + "Removes 4 hearts " + ChatColor.WHITE + "20s",
                                ChatColor.GRAY + " " + ChatColor.DARK_RED + "\uD83E\uDD3C " + ChatColor.GRAY + "Removes 2 hearts " + ChatColor.WHITE + "R4, 1m",
                                ChatColor.WHITE + "",
                                ChatColor.GRAY + "-" + ChatColor.WHITE + "\uD83D\uDC96" + Common.colorize("#B8FFFA") + " ᴄɪʀᴄʟᴇ ᴏғ ʟɪғᴇ",
                                ChatColor.GREEN + "\uD83E\uDDD1\uD83C\uDFFB " + ChatColor.GRAY + "Summons a 8 block wide zone that follows you",
                                ChatColor.GRAY + " Gives trusted +4, Untrusted -4 hearts",
                                ChatColor.GRAY + " slowly mends armour and tools if trusted",
                                ChatColor.GRAY + " caster only can steal health while zone is active",
                                ChatColor.GREEN + "\uD83E\uDD3C " + ChatColor.GRAY + "Gives trusted players +5 hearts for " + ChatColor.WHITE + "1m 30s, R4"
                        ));
                    }

                    if (energy == Energy.Cracked) {
                        itemMeta.setCustomModelData(44);
                        itemMeta.setLore(Arrays.asList(
                                ChatColor.WHITE + "" + ChatColor.BOLD + "ᴄᴏɴᴛʀᴏʟ ᴛʜᴇ ʙᴀʟᴀɴᴄᴇ ᴏғ ʟɪғᴇ",
                                Common.colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                energystage,
                                ChatColor.GRAY + " " + Common.colorize("#FE04B4") + "\uD83D\uDD2E" + ChatColor.GRAY + " " + ChatColor.GRAY + "Feed animals by crouch",
                                ChatColor.GRAY + " clicking with bare hand. Immune to withering.",
                                ChatColor.GRAY + " Heal half a heart ever 5 seconds",
                                ChatColor.WHITE + " ",
                                Common.colorize("#FFE4AB") + "ᴘᴏᴡᴇʀs ",
                                ChatColor.GRAY + "-" + ChatColor.WHITE + "\uD83D\uDC98" + Common.colorize("#FF429A") + " ʜᴇᴀʀᴛ ᴅʀᴀɪɴᴇʀ", //emoji color is not accurate, i dont have the color for it
                                ChatColor.GRAY + " " + ChatColor.DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB " + ChatColor.GRAY + "Removes 4 hearts " + ChatColor.WHITE + "20s",
                                ChatColor.GRAY + " " + ChatColor.DARK_RED + "\uD83E\uDD3C " + ChatColor.GRAY + "Removes 2 hearts " + ChatColor.WHITE + "R4, 1m",
                                ChatColor.WHITE + "",
                                ChatColor.GRAY + "-" + ChatColor.WHITE + "\uD83D\uDC96" + Common.colorize("#B8FFFA") + " ᴄɪʀᴄʟᴇ ᴏғ ʟɪғᴇ",
                                ChatColor.GREEN + "\uD83E\uDDD1\uD83C\uDFFB " + ChatColor.GRAY + "Summons a 8 block wide zone that follows you",
                                ChatColor.GRAY + " Gives trusted +4, Untrusted -4 hearts",
                                ChatColor.GRAY + " slowly mends armour and tools if trusted",
                                ChatColor.GRAY + " caster only can steal health while zone is active",
                                ChatColor.GREEN + "\uD83E\uDD3C " + ChatColor.GRAY + "Gives trusted players +5 hearts for " + ChatColor.WHITE + "1m 30s, R4"
                        ));
                    }

                    if (energy == Energy.Damaged) {
                        itemMeta.setCustomModelData(64);
                        itemMeta.setLore(Arrays.asList(
                                ChatColor.WHITE + "" + ChatColor.BOLD + "ᴄᴏɴᴛʀᴏʟ ᴛʜᴇ ʙᴀʟᴀɴᴄᴇ ᴏғ ʟɪғᴇ",
                                Common.colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                energystage,
                                ChatColor.GRAY + " " + Common.colorize("#FE04B4") + "\uD83D\uDD2E" + ChatColor.GRAY + " " + ChatColor.GRAY + " Heal half a heart ever 5 seconds",
                                ChatColor.WHITE + " ",
                                Common.colorize("#FFE4AB") + "ᴘᴏᴡᴇʀs ",
                                ChatColor.GRAY + "-" + ChatColor.WHITE + "\uD83D\uDC98" + Common.colorize("#FF429A") + " ʜᴇᴀʀᴛ ᴅʀᴀɪɴᴇʀ", //emoji color is not accurate, i dont have the color for it
                                ChatColor.GRAY + " " + ChatColor.DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB " + ChatColor.GRAY + "Removes 4 hearts " + ChatColor.WHITE + "20s",
                                ChatColor.GRAY + " " + ChatColor.DARK_RED + "\uD83E\uDD3C " + ChatColor.GRAY + "Removes 2 hearts " + ChatColor.WHITE + "R4, 1m",
                                ChatColor.WHITE + "",
                                ChatColor.GRAY + "-" + ChatColor.WHITE + "\uD83D\uDC96" + Common.colorize("#B8FFFA") + " ᴄɪʀᴄʟᴇ ᴏғ ʟɪғᴇ",
                                ChatColor.GREEN + "\uD83E\uDDD1\uD83C\uDFFB " + ChatColor.GRAY + "Summons a 8 block wide zone that follows you",
                                ChatColor.GRAY + " Gives trusted +4, Untrusted -4 hearts",
                                ChatColor.GRAY + " slowly mends armour and tools if trusted",
                                ChatColor.GRAY + " caster only can steal health while zone is active",
                                ChatColor.GREEN + "\uD83E\uDD3C " + ChatColor.GRAY + "Gives trusted players +5 hearts for " + ChatColor.WHITE + "1m 30s, R4"
                        ));
                    }

                    if (energy == Energy.Ruined) {
                        itemMeta.setCustomModelData(84);
                        itemMeta.setLore(Arrays.asList(
                                ChatColor.WHITE + "" + ChatColor.BOLD + "ᴄᴏɴᴛʀᴏʟ ᴛʜᴇ ʙᴀʟᴀɴᴄᴇ ᴏғ ʟɪғᴇ",
                                Common.colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                energystage,
                                ChatColor.GRAY + " " + Common.colorize("#FE04B4") + "\uD83D\uDD2E" + ChatColor.GRAY + " No passives",
                                ChatColor.WHITE + " ",
                                Common.colorize("#FFE4AB") + "ᴘᴏᴡᴇʀs ",
                                ChatColor.GRAY + "-" + ChatColor.WHITE + "\uD83D\uDC98" + Common.colorize("#FF429A") + " ʜᴇᴀʀᴛ ᴅʀᴀɪɴᴇʀ", //emoji color is not accurate, i dont have the color for it
                                ChatColor.GRAY + " " + ChatColor.DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB " + ChatColor.GRAY + "Removes 4 hearts " + ChatColor.WHITE + "20s",
                                ChatColor.GRAY + " " + ChatColor.DARK_RED + "\uD83E\uDD3C " + ChatColor.GRAY + "Removes 2 hearts " + ChatColor.WHITE + "R4, 1m",
                                ChatColor.WHITE + "",
                                ChatColor.GRAY + "-" + ChatColor.WHITE + "\uD83D\uDC96" + Common.colorize("#B8FFFA") + " ᴄɪʀᴄʟᴇ ᴏғ ʟɪғᴇ",
                                ChatColor.GREEN + "\uD83E\uDDD1\uD83C\uDFFB " + ChatColor.GRAY + "Summons a 8 block wide zone that follows you",
                                ChatColor.GRAY + " Gives trusted +4, Untrusted -4 hearts",
                                ChatColor.GRAY + " slowly mends armour and tools if trusted",
                                ChatColor.GRAY + " caster only can steal health while zone is active",
                                ChatColor.GREEN + "\uD83E\uDD3C " + ChatColor.GRAY + "Gives trusted players +5 hearts for " + ChatColor.WHITE + "1m 30s, R4"
                        ));
                    }


                    if (energy == Energy.Broken || energy == Energy.N_A) {
                        itemMeta.setCustomModelData(96);
                        itemMeta.setLore(Arrays.asList(
                                ChatColor.WHITE + "" + ChatColor.BOLD + "ᴜsᴇʟᴇss"
                        ));
                    }
                    item.setItemMeta(itemMeta);
                    return item;
                }




                if (season == 3) {

                    ItemStack item = new ItemStack(Material.PRISMARINE_SHARD, 1);
                    ItemMeta itemMeta = item.getItemMeta();


                    NamespacedKey idkey = new NamespacedKey("blissgems", "gem-id");
                    itemMeta.getPersistentDataContainer().set(idkey, PersistentDataType.STRING, UUID.randomUUID().toString());

                    NamespacedKey tierkey = new NamespacedKey("blissgems", "gem-tier");
                    itemMeta.getPersistentDataContainer().set(tierkey, PersistentDataType.INTEGER, tier);

                    NamespacedKey typekey = new NamespacedKey("blissgems", "gem-type");
                    itemMeta.getPersistentDataContainer().set(typekey, PersistentDataType.STRING, "life");

                    NamespacedKey quicknodropkey = new NamespacedKey("blissgems", "quick-no-drop");
                    itemMeta.getPersistentDataContainer().set(quicknodropkey, PersistentDataType.INTEGER, quicknodrop);

                    NamespacedKey quicknoremovekey = new NamespacedKey("blissgems", "quick-no-remove");
                    itemMeta.getPersistentDataContainer().set(quicknoremovekey, PersistentDataType.INTEGER, quicknoremove);


                    itemMeta.setDisplayName(Common.colorize("#FEFD17") + ChatColor.BOLD + "sᴘᴇᴇᴅ " + Common.colorize("#FFD773") + "ɢᴇᴍ");
                    for (ItemFlag flag : ItemFlag.values()) {
                        itemMeta.addItemFlags(flag);
                    }
                    if (Gem.isPristineorHigher(energy)) {
                        if (energy == Energy.Pristine_5) {
                            itemMeta.addEnchant(Enchantment.DURABILITY, 1, true);
                        }

                        itemMeta.setCustomModelData(8);
                        itemMeta.setLore(Arrays.asList(
                                ChatColor.WHITE + "" + ChatColor.BOLD + "ᴡᴀᴛᴄʜ ᴛʜᴇ ᴡᴏʀʟᴅ ᴀʀᴏᴜɴᴅ ʏᴏᴜ ᴛᴜʀɴ ɪɴᴛᴏ ᴀ ʙʟᴜʀ",
                                Common.colorize("&f(") + energystage + Common.colorize("&f)"),
                                ChatColor.GRAY + "",
                                Common.colorize("#FEFD17") + "\uD83D\uDD2E" + " " + Common.colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                ChatColor.GRAY + "- Speed",
                                ChatColor.GRAY + "- Dolphins grace",
                                ChatColor.GRAY + "- Enchants Efficiency",
                                ChatColor.GRAY + "- Enchants Soul Speed",
                                ChatColor.GRAY + "",
                                Common.colorize("#FEFD17") + "\uD83D\uDD2E" + " " + Common.colorize("#82F3FF") + ChatColor.BOLD + "ᴀʙɪʟɪᴛʏ",
                                ChatColor.GRAY + "- " + Common.colorize("#FEFD17") + " Terminal Velocity",
                                ChatColor.GRAY + "",
                                Common.colorize("#FEFD17") + "\uD83D\uDD2E " + Common.colorize("#B8FFFB") + ChatColor.BOLD + "ᴘᴏᴡᴇʀs",
                                ChatColor.GRAY + "- " + "\uD83C\uDFAF " + Common.colorize("#FEFD17") + "ʙʟᴜʀ",
                                ChatColor.GRAY + "",
                                ChatColor.GRAY + "- " + ChatColor.WHITE + "\uD83C\uDF29 " + Common.colorize("#61FFEA") + "sᴘᴇᴇᴅʏ sᴛᴏʀᴍ " + ChatColor.DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                                ChatColor.GRAY + "- " + ChatColor.WHITE + "\uD83C\uDF29 " + Common.colorize("#61FFEA") + "sᴘᴇᴇᴅʏ sᴛᴏʀᴍ " + ChatColor.DARK_RED + "\uD83E\uDD3C"
                        ));
                    }

                    if (energy == Energy.Scratched) {
                        itemMeta.setCustomModelData(28);
                        itemMeta.setLore(Arrays.asList(
                                ChatColor.WHITE + "" + ChatColor.BOLD + "ᴡᴀᴛᴄʜ ᴛʜᴇ ᴡᴏʀʟᴅ ᴀʀᴏᴜɴᴅ ʏᴏᴜ ᴛᴜʀɴ ɪɴᴛᴏ ᴀ ʙʟᴜʀ",
                                Common.colorize("&f(") + energystage + Common.colorize("&f)"),
                                ChatColor.GRAY + "",
                                Common.colorize("#FEFD17") + "\uD83D\uDD2E" + " " + Common.colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                ChatColor.GRAY + "- Speed",
                                ChatColor.GRAY + "- Enchants Efficiency",
                                ChatColor.GRAY + "- Enchants Soul Speed",
                                ChatColor.GRAY + "",
                                Common.colorize("#FEFD17") + "\uD83D\uDD2E" + " " + Common.colorize("#82F3FF") + ChatColor.BOLD + "ᴀʙɪʟɪᴛʏ",
                                ChatColor.GRAY + "- " + Common.colorize("#FEFD17") + " Terminal Velocity",
                                ChatColor.GRAY + "",
                                Common.colorize("#FEFD17") + "\uD83D\uDD2E " + Common.colorize("#B8FFFB") + ChatColor.BOLD + "ᴘᴏᴡᴇʀs",
                                ChatColor.GRAY + "- " + "\uD83C\uDFAF " + Common.colorize("#FEFD17") + "ʙʟᴜʀ",
                                ChatColor.GRAY + "",
                                ChatColor.GRAY + "- " + ChatColor.WHITE + "\uD83C\uDF29 " + Common.colorize("#61FFEA") + "sᴘᴇᴇᴅʏ sᴛᴏʀᴍ " + ChatColor.DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                                ChatColor.GRAY + "- " + ChatColor.WHITE + "\uD83C\uDF29 " + Common.colorize("#61FFEA") + "sᴘᴇᴇᴅʏ sᴛᴏʀᴍ " + ChatColor.DARK_RED + "\uD83E\uDD3C"
                        ));
                    }

                    if (energy == Energy.Cracked) {
                        itemMeta.setCustomModelData(48);
                        itemMeta.setLore(Arrays.asList(
                                ChatColor.WHITE + "" + ChatColor.BOLD + "ᴡᴀᴛᴄʜ ᴛʜᴇ ᴡᴏʀʟᴅ ᴀʀᴏᴜɴᴅ ʏᴏᴜ ᴛᴜʀɴ ɪɴᴛᴏ ᴀ ʙʟᴜʀ",
                                Common.colorize("&f(") + energystage + Common.colorize("&f)"),
                                ChatColor.GRAY + "",
                                Common.colorize("#FEFD17") + "\uD83D\uDD2E" + " " + Common.colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                ChatColor.GRAY + "- Speed",
                                ChatColor.GRAY + "- Enchants Efficiency",
                                ChatColor.GRAY + "- Enchants Soul Speed",
                                ChatColor.GRAY + "",
                                Common.colorize("#FEFD17") + "\uD83D\uDD2E" + " " + Common.colorize("#82F3FF") + ChatColor.BOLD + "ᴀʙɪʟɪᴛʏ",
                                ChatColor.GRAY + "- " + Common.colorize("#FEFD17") + " Terminal Velocity",
                                ChatColor.GRAY + "",
                                Common.colorize("#FEFD17") + "\uD83D\uDD2E " + Common.colorize("#B8FFFB") + ChatColor.BOLD + "ᴘᴏᴡᴇʀs",
                                ChatColor.GRAY + "- " + "\uD83C\uDFAF " + Common.colorize("#FEFD17") + "ʙʟᴜʀ",
                                ChatColor.GRAY + "",
                                ChatColor.GRAY + "- " + ChatColor.WHITE + "\uD83C\uDF29 " + Common.colorize("#61FFEA") + "sᴘᴇᴇᴅʏ sᴛᴏʀᴍ " + ChatColor.DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                                ChatColor.GRAY + "- " + ChatColor.WHITE + "\uD83C\uDF29 " + Common.colorize("#61FFEA") + "sᴘᴇᴇᴅʏ sᴛᴏʀᴍ " + ChatColor.DARK_RED + "\uD83E\uDD3C"
                        ));
                    }

                    if (energy == Energy.Damaged) {
                        itemMeta.setCustomModelData(68);
                        itemMeta.setLore(Arrays.asList(
                                ChatColor.WHITE + "" + ChatColor.BOLD + "ᴡᴀᴛᴄʜ ᴛʜᴇ ᴡᴏʀʟᴅ ᴀʀᴏᴜɴᴅ ʏᴏᴜ ᴛᴜʀɴ ɪɴᴛᴏ ᴀ ʙʟᴜʀ",
                                Common.colorize("&f(") + energystage + Common.colorize("&f)"),
                                ChatColor.GRAY + "",
                                Common.colorize("#FEFD17") + "\uD83D\uDD2E" + " " + Common.colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                ChatColor.GRAY + "- Enchants Efficiency",
                                ChatColor.GRAY + "- Enchants Soul Speed",
                                ChatColor.GRAY + "",
                                Common.colorize("#FEFD17") + "\uD83D\uDD2E" + " " + Common.colorize("#82F3FF") + ChatColor.BOLD + "ᴀʙɪʟɪᴛʏ",
                                ChatColor.GRAY + "- " + Common.colorize("#FEFD17") + " Terminal Velocity",
                                ChatColor.GRAY + "",
                                Common.colorize("#FEFD17") + "\uD83D\uDD2E " + Common.colorize("#B8FFFB") + ChatColor.BOLD + "ᴘᴏᴡᴇʀs",
                                ChatColor.GRAY + "- " + "\uD83C\uDFAF " + Common.colorize("#FEFD17") + "ʙʟᴜʀ",
                                ChatColor.GRAY + "",
                                ChatColor.GRAY + "- " + ChatColor.WHITE + "\uD83C\uDF29 " + Common.colorize("#61FFEA") + "sᴘᴇᴇᴅʏ sᴛᴏʀᴍ " + ChatColor.DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                                ChatColor.GRAY + "- " + ChatColor.WHITE + "\uD83C\uDF29 " + Common.colorize("#61FFEA") + "sᴘᴇᴇᴅʏ sᴛᴏʀᴍ " + ChatColor.DARK_RED + "\uD83E\uDD3C"
                        ));
                    }

                    if (energy == Energy.Ruined) {
                        itemMeta.setCustomModelData(88);
                        itemMeta.setLore(Arrays.asList(
                                ChatColor.WHITE + "" + ChatColor.BOLD + "ᴡᴀᴛᴄʜ ᴛʜᴇ ᴡᴏʀʟᴅ ᴀʀᴏᴜɴᴅ ʏᴏᴜ ᴛᴜʀɴ ɪɴᴛᴏ ᴀ ʙʟᴜʀ",
                                Common.colorize("&f(") + energystage + Common.colorize("&f)"),
                                ChatColor.GRAY + "",
                                Common.colorize("#FEFD17") + "\uD83D\uDD2E" + " " + Common.colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                ChatColor.GRAY + "- No Passives",
                                ChatColor.GRAY + "",
                                Common.colorize("#FEFD17") + "\uD83D\uDD2E" + " " + Common.colorize("#82F3FF") + ChatColor.BOLD + "ᴀʙɪʟɪᴛʏ",
                                ChatColor.GRAY + "- " + Common.colorize("#FEFD17") + " Terminal Velocity",
                                ChatColor.GRAY + "",
                                Common.colorize("#FEFD17") + "\uD83D\uDD2E " + Common.colorize("#B8FFFB") + ChatColor.BOLD + "ᴘᴏᴡᴇʀs",
                                ChatColor.GRAY + "- " + "\uD83C\uDFAF " + Common.colorize("#FEFD17") + "ʙʟᴜʀ",
                                ChatColor.GRAY + "",
                                ChatColor.GRAY + "- " + ChatColor.WHITE + "\uD83C\uDF29 " + Common.colorize("#61FFEA") + "sᴘᴇᴇᴅʏ sᴛᴏʀᴍ " + ChatColor.DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                                ChatColor.GRAY + "- " + ChatColor.WHITE + "\uD83C\uDF29 " + Common.colorize("#61FFEA") + "sᴘᴇᴇᴅʏ sᴛᴏʀᴍ " + ChatColor.DARK_RED + "\uD83E\uDD3C"
                        ));
                    }


                    if (energy == Energy.Broken || energy == Energy.N_A) {
                        itemMeta.setCustomModelData(96);
                        itemMeta.setLore(Arrays.asList(
                                ChatColor.WHITE + "" + ChatColor.BOLD + "ᴜsᴇʟᴇss"
                        ));
                    }
                    item.setItemMeta(itemMeta);
                    return item;
                }
        }

        }
        return null;
    }
}

