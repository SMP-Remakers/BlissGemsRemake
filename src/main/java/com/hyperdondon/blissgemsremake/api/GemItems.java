package com.hyperdondon.blissgemsremake.api;

import com.hyperdondon.blissgemsremake.blissgems;
import com.hyperdondon.blissgemsremake.internal.VersionChecker;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataType;
//skibidi
import java.util.Arrays;
import java.util.UUID;

import static net.md_5.bungee.api.ChatColor.*;

public final class GemItems {
    public static ItemStack getGemItem(GemType gem, int tier, Energy energy, int quicknodrop, int quicknoremove, int season) {
        //Energy


        String energystage = "";

        if (season != 1) if (energy == Energy.Pristine_5) energystage = blissgems.colorize("#57FFC7") + "Pristine"
                + WHITE + " + "
                + blissgems.colorize("#96FFD9") + "5";
        else if (energy == Energy.Pristine_4) energystage = blissgems.colorize("#57FFC7") + "Pristine"
                + WHITE + " + "
                + blissgems.colorize("#96FFD9") + "4";
        else if (energy == Energy.Pristine_3) energystage = blissgems.colorize("#57FFC7") + "Pristine"
                + WHITE + " + "
                + blissgems.colorize("#96FFD9") + "3";
        else if (energy == Energy.Pristine_2) energystage = blissgems.colorize("#57FFC7") + "Pristine"
                + WHITE + " + "
                + blissgems.colorize("#96FFD9") + "2";
        else if (energy == Energy.Pristine_1) energystage = blissgems.colorize("#57FFC7") + "Pristine"
                + WHITE + " + "
                + blissgems.colorize("#96FFD9") + "1";
        else if (energy == Energy.Pristine || energy == Energy.N_A)
            energystage = blissgems.colorize("#57FFC7") + "Pristine";
        else if (energy == Energy.Scratched) energystage = blissgems.colorize("#57FF8F") + "Scratched";
        else if (energy == Energy.Cracked) energystage = blissgems.colorize("#7958DB") + "Cracked";
        else if (energy == Energy.Damaged) energystage = blissgems.colorize("#FFC929") + "Damaged";
        else if (energy == Energy.Ruined) energystage = blissgems.colorize("#FF1111") + "Ruined";
        else if (energy == Energy.Broken) energystage = WHITE + "" + BOLD + "ᴜsᴇʟᴇss";
        else energystage = WHITE + "" + BOLD + "ᴜsᴇʟᴇss";


        //Strength

        if (tier == 2) {
            if (gem == GemType.Strength) {

                if (season == 1) {
                    ItemStack item = new ItemStack(Material.PRISMARINE_SHARD, 1);
                    ItemMeta itemMeta = item.getItemMeta();


                    NamespacedKey idkey = new NamespacedKey(blissgems.getInstance(), "shard_id");
                    itemMeta.getPersistentDataContainer().set(idkey, PersistentDataType.STRING, UUID.randomUUID().toString());
                    itemMeta.setDisplayName(blissgems.colorize("#F10303") + "Strength " + blissgems.colorize("#FFD773") + "Gem");
                    itemMeta.getPersistentDataContainer().has(idkey, PersistentDataType.STRING);

                    // Set HideFlags to 127 if server is lower than 1.20.6, if yes: then hide all flags.
                    // due to the nbt change, it is not possible to make everything 1-1 for people using 1.20.6 and higher.

                    if (VersionChecker.OlderThanNBTChange()) itemMeta.addItemFlags(
                            ItemFlag.HIDE_ENCHANTS,
                            ItemFlag.HIDE_ATTRIBUTES,
                            ItemFlag.HIDE_UNBREAKABLE,
                            ItemFlag.HIDE_DESTROYS,
                            ItemFlag.HIDE_PLACED_ON,
                            ItemFlag.HIDE_POTION_EFFECTS,
                            ItemFlag.HIDE_DYE);
                    else for (ItemFlag flag : ItemFlag.values()) itemMeta.addItemFlags(flag);


                    itemMeta.setCustomModelData(10);
                    itemMeta.setLore(Arrays.asList(

                            WHITE + "" + BOLD + "Have the strength of 5 men",
                            blissgems.colorize("#FFE4AB") + "Passives",
                            GRAY + " " + blissgems.colorize("#F10303") + "🔮 " + GRAY + "Strength 2, Auto enchants all",
                            GRAY + " swords and axes with sharpness 5",
                            WHITE + " ",
                            blissgems.colorize("#B8FFFB") + BOLD + "Powers",
                            GRAY + "-" + WHITE + "\uD83E\uDD3A " + blissgems.colorize("#B5B5B5") + BOLD + "Frailer",
                            GRAY + " " + DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB " + GRAY + "Clears potion effects",
                            GRAY + " gives weakness 1 for 20 seconds",
                            GRAY + " " + DARK_RED + "\uD83E\uDD3C " + GRAY + " Clears potion effects",
                            GRAY + " and gives withering, " + WHITE + "40s, R5",
                            WHITE + " ",
                            GRAY + "-" + WHITE + "⚔" + blissgems.colorize("#910D0D") + " Chad Strength " + WHITE + "R4 40s",
                            GRAY + " " + GREEN + "\uD83E\uDDD1\uD83C\uDFFB " + GRAY + "Every 3 crits charges a hit that deals 2x the dmg",
                            GRAY + " " + GREEN + "\uD83E\uDD3C " + GRAY + "Every 8 crits charges a hit that deals 2x the dmg"
                    ));

                    item.setItemMeta(itemMeta);
                    return item;
                }


                if (season == 2) {


                    ItemStack item = new ItemStack(Material.PRISMARINE_SHARD, 1);
                    ItemMeta itemMeta = item.getItemMeta();


                    NamespacedKey idkey = new NamespacedKey(blissgems.getInstance(), "gem-id");
                    itemMeta.getPersistentDataContainer().set(idkey, PersistentDataType.STRING, UUID.randomUUID().toString());

                    NamespacedKey tierkey = new NamespacedKey(blissgems.getInstance(), "gem-tier");
                    itemMeta.getPersistentDataContainer().set(tierkey, PersistentDataType.INTEGER, tier);

                    NamespacedKey typekey = new NamespacedKey(blissgems.getInstance(), "gem-type");
                    itemMeta.getPersistentDataContainer().set(typekey, PersistentDataType.STRING, "strength");

                    NamespacedKey quicknodropkey = new NamespacedKey(blissgems.getInstance(), "quick-no-drop");
                    itemMeta.getPersistentDataContainer().set(quicknodropkey, PersistentDataType.INTEGER, quicknodrop);

                    NamespacedKey quicknoremovekey = new NamespacedKey(blissgems.getInstance(), "quick-no-remove");
                    itemMeta.getPersistentDataContainer().set(quicknoremovekey, PersistentDataType.INTEGER, quicknoremove);


                    itemMeta.setDisplayName(blissgems.colorize("#F10303") + BOLD + "sᴛʀᴇɴɢᴛʜ " + blissgems.colorize("#FFD773") + "ɢᴇᴍ");
                    for (ItemFlag flag : ItemFlag.values()) itemMeta.addItemFlags(flag);

                    if (Gem.isPristineorHigher(energy)) {
                        if (energy == Energy.Pristine_5) itemMeta.addEnchant(Enchantment.DURABILITY, 1, true);

                        itemMeta.setCustomModelData(10);
                        itemMeta.setLore(Arrays.asList(
                                WHITE + "" + BOLD + "ʜᴀᴠᴇ ᴛʜᴇ sᴛʀᴇɴɢᴛʜ ᴏғ ᴀ ᴀʀᴍʏ",
                                blissgems.colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                energystage,
                                GRAY + " " + blissgems.colorize("#F10303") + "🔮 " + GRAY + "Strength 2,",
                                GRAY + " Auto enchants sharpness 5",
                                GRAY + " BloodThorns, deal more damage the",
                                GRAY + " lower in health you are ",
                                GRAY + " ",
                                blissgems.colorize("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                                GRAY + "-" + WHITE + "\uD83E\uDD3A " + blissgems.colorize("#B5B5B5") + BOLD + "ғʀᴀɪʟᴇʀ",
                                GRAY + " " + DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB " + GRAY + "Clears potion effects",
                                GRAY + " gives weakness 1 for 20 seconds",
                                GRAY + " " + DARK_RED + "\uD83E\uDD3C " + GRAY + " Clears potion effects",
                                GRAY + " and gives withering, " + WHITE + "40s, R5",
                                WHITE + "",
                                GRAY + "-" + WHITE + "⚔" + blissgems.colorize("#910D0D") + " ᴄʜᴀᴅ sᴛʀᴇɴɢᴛʜ " + WHITE + "R4 40s",
                                GRAY + " " + GREEN + "\uD83E\uDDD1\uD83C\uDFFB " + GRAY + "Every 3 crits charges a hit that deals 2x the dmg",
                                GRAY + " " + GREEN + "\uD83E\uDD3C " + GRAY + "Every 8 crits charges a hit that deals 2x the dmg"
                        ));
                    }

                    if (energy == Energy.Scratched) {
                        itemMeta.setCustomModelData(30);
                        itemMeta.setLore(Arrays.asList(
                                WHITE + "" + BOLD + "ʜᴀᴠᴇ ᴛʜᴇ sᴛʀᴇɴɢᴛʜ ᴏғ ᴀ ᴀʀᴍʏ",
                                blissgems.colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                energystage,
                                GRAY + " " + blissgems.colorize("#F10303") + "🔮 " + GRAY + "Strength 2,",
                                GRAY + " Auto enchants sharpness 4",
                                GRAY + " BloodThorns, deal more damage the",
                                GRAY + " lower in health you are",
                                GRAY + " ",
                                blissgems.colorize("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                                GRAY + "-" + WHITE + "\uD83E\uDD3A " + blissgems.colorize("#B5B5B5") + BOLD + "ғʀᴀɪʟᴇʀ",
                                GRAY + " " + DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB " + GRAY + "Clears potion effects",
                                GRAY + " gives weakness 1 for 20 seconds",
                                GRAY + " " + DARK_RED + "\uD83E\uDD3C " + GRAY + " Clears potion effects",
                                GRAY + " and gives withering, " + WHITE + "40s, R5",
                                WHITE + "",
                                GRAY + "-" + WHITE + "⚔" + blissgems.colorize("#910D0D") + " ᴄʜᴀᴅ sᴛʀᴇɴɢᴛʜ " + WHITE + "R4 40s",
                                GRAY + " " + GREEN + "\uD83E\uDDD1\uD83C\uDFFB " + GRAY + "Every 3 crits charges a hit that deals 2x the dmg",
                                GRAY + " " + GREEN + "\uD83E\uDD3C " + GRAY + "Every 8 crits charges a hit that deals 2x the dmg"
                        ));
                    }

                    if (energy == Energy.Cracked) {
                        itemMeta.setCustomModelData(50);
                        itemMeta.setLore(Arrays.asList(
                                WHITE + "" + BOLD + "ʜᴀᴠᴇ ᴛʜᴇ sᴛʀᴇɴɢᴛʜ ᴏғ ᴀ ᴀʀᴍʏ",
                                blissgems.colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                energystage,
                                GRAY + " " + blissgems.colorize("#F10303") + "🔮 " + GRAY + "Strength 2,",
                                GRAY + " Auto enchants sharpness 3",
                                GRAY + " ",
                                blissgems.colorize("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                                GRAY + "-" + WHITE + "\uD83E\uDD3A " + blissgems.colorize("#B5B5B5") + BOLD + "ғʀᴀɪʟᴇʀ",
                                GRAY + " " + DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB " + GRAY + "Clears potion effects",
                                GRAY + " gives weakness 1 for 20 seconds",
                                GRAY + " " + DARK_RED + "\uD83E\uDD3C " + GRAY + " Clears potion effects",
                                GRAY + " and gives withering, " + WHITE + "40s, R5",
                                WHITE + "",
                                GRAY + "-" + WHITE + "⚔" + blissgems.colorize("#910D0D") + " ᴄʜᴀᴅ sᴛʀᴇɴɢᴛʜ " + WHITE + "R4 40s",
                                GRAY + " " + GREEN + "\uD83E\uDDD1\uD83C\uDFFB " + GRAY + "Every 3 crits charges a hit that deals 2x the dmg",
                                GRAY + " " + GREEN + "\uD83E\uDD3C " + GRAY + "Every 8 crits charges a hit that deals 2x the dmg"
                        ));
                    }

                    if (energy == Energy.Damaged) {
                        itemMeta.setCustomModelData(70);
                        itemMeta.setLore(Arrays.asList(
                                WHITE + "" + BOLD + "ʜᴀᴠᴇ ᴛʜᴇ sᴛʀᴇɴɢᴛʜ ᴏғ ᴀ ᴀʀᴍʏ",
                                blissgems.colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                energystage,
                                GRAY + " " + blissgems.colorize("#F10303") + "🔮 " + GRAY + "Auto enchants sharpness 2",
                                WHITE + " ",
                                blissgems.colorize("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                                GRAY + "-" + WHITE + "\uD83E\uDD3A " + blissgems.colorize("#B5B5B5") + BOLD + "ғʀᴀɪʟᴇʀ",
                                GRAY + " " + DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB " + GRAY + "Clears potion effects",
                                GRAY + " gives weakness 1 for 20 seconds",
                                GRAY + " " + DARK_RED + "\uD83E\uDD3C " + GRAY + " Clears potion effects",
                                GRAY + " and gives withering, " + WHITE + "40s, R5",
                                WHITE + "",
                                GRAY + "-" + WHITE + "⚔" + blissgems.colorize("#910D0D") + " ᴄʜᴀᴅ sᴛʀᴇɴɢᴛʜ " + WHITE + "R4 40s",
                                GRAY + " " + GREEN + "\uD83E\uDDD1\uD83C\uDFFB " + GRAY + "Every 3 crits charges a hit that deals 2x the dmg",
                                GRAY + " " + GREEN + "\uD83E\uDD3C " + GRAY + "Every 8 crits charges a hit that deals 2x the dmg"
                        ));
                    }

                    if (energy == Energy.Ruined) {
                        itemMeta.setCustomModelData(90);
                        itemMeta.setLore(Arrays.asList(
                                WHITE + "" + BOLD + "ʜᴀᴠᴇ ᴛʜᴇ sᴛʀᴇɴɢᴛʜ ᴏғ ᴀ ᴀʀᴍʏ",
                                blissgems.colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                energystage,
                                GRAY + " " + blissgems.colorize("#F10303") + "🔮 " + GRAY + "No passives",
                                WHITE + " ",
                                blissgems.colorize("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                                GRAY + "-" + WHITE + "\uD83E\uDD3A " + blissgems.colorize("#B5B5B5") + BOLD + "ғʀᴀɪʟᴇʀ",
                                GRAY + " " + DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB " + GRAY + "Clears potion effects",
                                GRAY + " gives weakness 1 for 20 seconds",
                                GRAY + " " + DARK_RED + "\uD83E\uDD3C " + GRAY + " Clears potion effects",
                                GRAY + " and gives withering, " + WHITE + "40s, R5",
                                WHITE + "",
                                GRAY + "-" + WHITE + "⚔" + blissgems.colorize("#910D0D") + " ᴄʜᴀᴅ sᴛʀᴇɴɢᴛʜ " + WHITE + "R4 40s",
                                GRAY + " " + GREEN + "\uD83E\uDDD1\uD83C\uDFFB " + GRAY + "Every 3 crits charges a hit that deals 2x the dmg",
                                GRAY + " " + GREEN + "\uD83E\uDD3C " + GRAY + "Every 8 crits charges a hit that deals 2x the dmg"
                        ));
                    }


                    if (energy == Energy.Broken) {
                        itemMeta.setCustomModelData(96);
                        itemMeta.setLore(Arrays.asList(
                                WHITE + "" + BOLD + "ᴜsᴇʟᴇss"
                        ));
                    }
                    item.setItemMeta(itemMeta);
                    return item;
                }
                if (season == 3) {

                    ItemStack item = new ItemStack(Material.PRISMARINE_SHARD, 1);
                    ItemMeta itemMeta = item.getItemMeta();


                    NamespacedKey idkey = new NamespacedKey(blissgems.getInstance(), "gem-id");
                    itemMeta.getPersistentDataContainer().set(idkey, PersistentDataType.STRING, "9f969b5e-8b9a-4dd5-b5bc-9a23774721b4");

                    NamespacedKey tierkey = new NamespacedKey(blissgems.getInstance(), "gem-tier");
                    itemMeta.getPersistentDataContainer().set(tierkey, PersistentDataType.INTEGER, tier);

                    NamespacedKey typekey = new NamespacedKey(blissgems.getInstance(), "gem-type");
                    itemMeta.getPersistentDataContainer().set(typekey, PersistentDataType.STRING, "strength");

                    NamespacedKey quicknodropkey = new NamespacedKey(blissgems.getInstance(), "quick-no-drop");
                    itemMeta.getPersistentDataContainer().set(quicknodropkey, PersistentDataType.INTEGER, quicknodrop);

                    NamespacedKey quicknoremovekey = new NamespacedKey(blissgems.getInstance(), "quick-no-remove");
                    itemMeta.getPersistentDataContainer().set(quicknoremovekey, PersistentDataType.INTEGER, quicknoremove);


                    for (ItemFlag flag : ItemFlag.values()) itemMeta.addItemFlags(flag);

                    itemMeta.setDisplayName(blissgems.colorize("#F10303") + BOLD + "sᴛʀᴇɴɢᴛʜ " + blissgems.colorize("#FFD773") + "ɢᴇᴍ");
                    if (Gem.isPristineorHigher(energy)) {
                        if (energy == Energy.Pristine_5) itemMeta.addEnchant(Enchantment.DURABILITY, 1, true);

                        itemMeta.setCustomModelData(10);

                        String ending = blissgems.colorize("&f)");
                        if (energy == Energy.Pristine_1 || energy == Energy.Pristine_2 || energy == Energy.Pristine_3 || energy == Energy.Pristine_4 || energy == Energy.Pristine_5)
                            ending = ")";

                        itemMeta.setLore(Arrays.asList(
                                WHITE + "" + BOLD + "ʜᴀᴠᴇ ᴛʜᴇ sᴛʀᴇɴɢᴛʜ ᴏғ ᴀ ᴀʀᴍʏ",
                                blissgems.colorize("&f(") + energystage + ending,
                                WHITE + " ",
                                blissgems.colorize("#F10303") + "🔮" + " " + blissgems.colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                GRAY + "- " + GRAY + "Strength",
                                GRAY + "- Enchants Sharpness",
                                WHITE + " ",
                                blissgems.colorize("#F10303") + "🔮" + " " + blissgems.colorize("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                                GRAY + "- " + blissgems.colorize("#F10303") + "Bounty Hunter",
                                WHITE + " ",
                                blissgems.colorize("#F10303") + "🔮 " + blissgems.colorize("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                                GRAY + "- " + WHITE + "\uD83E\uDD3A " + blissgems.colorize("#B5B5B5") + "ғʀᴀɪʟᴇʀ " + DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                                GRAY + "- " + WHITE + "\uD83E\uDD3A " + blissgems.colorize("#B5B5B5") + "ɴᴜʟʟɪғʏ " + DARK_RED + "\uD83E\uDD3C",
                                WHITE + "",
                                GRAY + "- " + WHITE + "⚔" + blissgems.colorize("#910D0D") + " ᴄʜᴀᴅ sᴛʀᴇɴɢᴛʜ " + GREEN + "\uD83E\uDDD1\uD83C\uDFFB",
                                GRAY + "- " + WHITE + "⚔" + blissgems.colorize("#910D0D") + " ᴄʜᴀᴅ sᴛʀᴇɴɢᴛʜ " + GREEN + "\uD83E\uDD3C"
                        ));
                    }


                    if (energy == Energy.Scratched) {
                        itemMeta.setCustomModelData(30);
                        itemMeta.setLore(Arrays.asList(
                                WHITE + "" + BOLD + "ʜᴀᴠᴇ ᴛʜᴇ sᴛʀᴇɴɢᴛʜ ᴏғ ᴀ ᴀʀᴍʏ",
                                blissgems.colorize("&f(") + energystage + blissgems.colorize("&f)"),
                                WHITE + " ",
                                blissgems.colorize("#F10303") + "🔮" + " " + blissgems.colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                GRAY + "- " + GRAY + "Strength",
                                GRAY + "- Enchants Sharpness",
                                GRAY + "- " + GRAY + "Bloodthorns",
                                WHITE + " ",
                                blissgems.colorize("#F10303") + "🔮" + " " + blissgems.colorize("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                                GRAY + "- " + blissgems.colorize("#F10303") + "Bounty Hunter",
                                WHITE + " ",
                                blissgems.colorize("#F10303") + "🔮 " + blissgems.colorize("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                                GRAY + "- " + WHITE + "\uD83E\uDD3A " + blissgems.colorize("#B5B5B5") + "ғʀᴀɪʟᴇʀ " + DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                                GRAY + "- " + WHITE + "\uD83E\uDD3A " + blissgems.colorize("#B5B5B5") + "ɴᴜʟʟɪғʏ " + DARK_RED + "\uD83E\uDD3C",
                                WHITE + "",
                                GRAY + "- " + WHITE + "⚔" + blissgems.colorize("#910D0D") + " ᴄʜᴀᴅ sᴛʀᴇɴɢᴛʜ " + GREEN + "\uD83E\uDDD1\uD83C\uDFFB",
                                GRAY + "- " + WHITE + "⚔" + blissgems.colorize("#910D0D") + " ᴄʜᴀᴅ sᴛʀᴇɴɢᴛʜ " + GREEN + "\uD83E\uDD3C"
                        ));
                    }

                    if (energy == Energy.Cracked) {
                        itemMeta.setCustomModelData(50);

                        itemMeta.setLore(Arrays.asList(
                                WHITE + "" + BOLD + "ʜᴀᴠᴇ ᴛʜᴇ sᴛʀᴇɴɢᴛʜ ᴏғ ᴀ ᴀʀᴍʏ",
                                blissgems.colorize("&f(") + energystage + blissgems.colorize("&f)"),
                                WHITE + " ",
                                blissgems.colorize("#F10303") + "🔮" + " " + blissgems.colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                GRAY + "- " + GRAY + "Strength",
                                GRAY + "- Enchants Sharpness",
                                WHITE + " ",
                                blissgems.colorize("#F10303") + "🔮" + " " + blissgems.colorize("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                                GRAY + "- " + blissgems.colorize("#F10303") + "Bounty Hunter",
                                WHITE + " ",
                                blissgems.colorize("#F10303") + "🔮 " + blissgems.colorize("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                                GRAY + "- " + WHITE + "\uD83E\uDD3A " + blissgems.colorize("#B5B5B5") + "ғʀᴀɪʟᴇʀ " + DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                                GRAY + "- " + WHITE + "\uD83E\uDD3A " + blissgems.colorize("#B5B5B5") + "ɴᴜʟʟɪғʏ " + DARK_RED + "\uD83E\uDD3C",
                                WHITE + "",
                                GRAY + "- " + WHITE + "⚔" + blissgems.colorize("#910D0D") + " ᴄʜᴀᴅ sᴛʀᴇɴɢᴛʜ " + GREEN + "\uD83E\uDDD1\uD83C\uDFFB",
                                GRAY + "- " + WHITE + "⚔" + blissgems.colorize("#910D0D") + " ᴄʜᴀᴅ sᴛʀᴇɴɢᴛʜ " + GREEN + "\uD83E\uDD3C"
                        ));
                    }


                    if (energy == Energy.Damaged) {
                        itemMeta.setCustomModelData(70);

                        itemMeta.setLore(Arrays.asList(
                                WHITE + "" + BOLD + "ʜᴀᴠᴇ ᴛʜᴇ sᴛʀᴇɴɢᴛʜ ᴏғ ᴀ ᴀʀᴍʏ",
                                blissgems.colorize("&f(") + energystage + blissgems.colorize("&f)"),
                                WHITE + " ",
                                blissgems.colorize("#F10303") + "🔮" + " " + blissgems.colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                GRAY + "- " + GRAY + "Strength",
                                GRAY + "- Enchants Sharpness",
                                WHITE + " ",
                                blissgems.colorize("#F10303") + "🔮" + " " + blissgems.colorize("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                                GRAY + "- " + blissgems.colorize("#F10303") + "Bounty Hunter",
                                WHITE + " ",
                                blissgems.colorize("#F10303") + "🔮 " + blissgems.colorize("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                                GRAY + "- " + WHITE + "\uD83E\uDD3A " + blissgems.colorize("#B5B5B5") + "ғʀᴀɪʟᴇʀ " + DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                                GRAY + "- " + WHITE + "\uD83E\uDD3A " + blissgems.colorize("#B5B5B5") + "ɴᴜʟʟɪғʏ " + DARK_RED + "\uD83E\uDD3C",
                                WHITE + "",
                                GRAY + "- " + WHITE + "⚔" + blissgems.colorize("#910D0D") + " ᴄʜᴀᴅ sᴛʀᴇɴɢᴛʜ " + GREEN + "\uD83E\uDDD1\uD83C\uDFFB",
                                GRAY + "- " + WHITE + "⚔" + blissgems.colorize("#910D0D") + " ᴄʜᴀᴅ sᴛʀᴇɴɢᴛʜ " + GREEN + "\uD83E\uDD3C"
                        ));
                    }

                    if (energy == Energy.Ruined) {
                        itemMeta.setCustomModelData(90);

                        itemMeta.setLore(Arrays.asList(
                                WHITE + "" + BOLD + "ʜᴀᴠᴇ ᴛʜᴇ sᴛʀᴇɴɢᴛʜ ᴏғ ᴀ ᴀʀᴍʏ",
                                blissgems.colorize("&f(") + energystage + blissgems.colorize("&f)"),
                                WHITE + " ",
                                blissgems.colorize("#F10303") + "🔮" + " " + blissgems.colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                GRAY + "No Passives",
                                WHITE + " ",
                                blissgems.colorize("#F10303") + "🔮" + " " + blissgems.colorize("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                                GRAY + "- " + blissgems.colorize("#F10303") + "Bounty Hunter",
                                WHITE + " ",
                                blissgems.colorize("#F10303") + "🔮 " + blissgems.colorize("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                                GRAY + "- " + WHITE + "\uD83E\uDD3A " + blissgems.colorize("#B5B5B5") + "ғʀᴀɪʟᴇʀ " + DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                                GRAY + "- " + WHITE + "\uD83E\uDD3A " + blissgems.colorize("#B5B5B5") + "ɴᴜʟʟɪғʏ " + DARK_RED + "\uD83E\uDD3C",
                                WHITE + "",
                                GRAY + "- " + WHITE + "⚔" + blissgems.colorize("#910D0D") + " ᴄʜᴀᴅ sᴛʀᴇɴɢᴛʜ " + GREEN + "\uD83E\uDDD1\uD83C\uDFFB",
                                GRAY + "- " + WHITE + "⚔" + blissgems.colorize("#910D0D") + " ᴄʜᴀᴅ sᴛʀᴇɴɢᴛʜ " + GREEN + "\uD83E\uDD3C"
                        ));
                    }


                    if (energy == Energy.Broken) {
                        itemMeta.setCustomModelData(100);
                        itemMeta.setLore(Arrays.asList(
                                energystage
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


                    NamespacedKey idkey = new NamespacedKey(blissgems.getInstance(), "shard_id");
                    itemMeta.getPersistentDataContainer().set(idkey, PersistentDataType.STRING, String.valueOf(UUID.randomUUID().toString()));

                    itemMeta.setDisplayName(blissgems.colorize("#FEFD17") + BOLD + "Speed " + blissgems.colorize("#FFD773") + "Gem");


                    // Set HideFlags to 127 if server is lower than 1.20.6, if yes: then hide all flags.
                    // due to the nbt change, it is not possible to make everything 1-1 for people using 1.20.6 and higher.

                    if (VersionChecker.OlderThanNBTChange()) itemMeta.addItemFlags(
                            ItemFlag.HIDE_ENCHANTS,
                            ItemFlag.HIDE_ATTRIBUTES,
                            ItemFlag.HIDE_UNBREAKABLE,
                            ItemFlag.HIDE_DESTROYS,
                            ItemFlag.HIDE_PLACED_ON,
                            ItemFlag.HIDE_POTION_EFFECTS,
                            ItemFlag.HIDE_DYE);
                    else for (ItemFlag flag : ItemFlag.values()) itemMeta.addItemFlags(flag);


                    itemMeta.setCustomModelData(8);
                    itemMeta.setLore(Arrays.asList(
                            WHITE + "" + BOLD + "Feel the energy, the speed",
                            blissgems.colorize("#FFE4AB") + "Passives",
                            GRAY + " " + blissgems.colorize("#FEFD17") + "🔮 " + GRAY + "Speed 3, Dolphines Grace",
                            GRAY + " and immune to soul sand",
                            WHITE + " ",
                            blissgems.colorize("#B8FFFB") + BOLD + "Powers",
                            GRAY + "- " + DARK_GRAY + "\uD83C\uDFAF" + WHITE + "Sloths Sedative",
                            GRAY + " " + DARK_RED + "\uD83E\uDD3C " + GRAY + "Slowness 2, mining fatigue 3",
                            GRAY + " Clears speed effects, 0.8x slower crits, " + WHITE + "30s, R4",
                            GRAY + " " + DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB" + GRAY + "Slowness 4, mining fatigue 3",
                            GRAY + " Clears speed effects, 0.5x slower crits, " + WHITE + "40s, R4",
                            WHITE + "",
                            GRAY + "-" + WHITE + "🌩 " + blissgems.colorize("#61FFEA") + "Speedy Storm " + WHITE + "40s R4",
                            GREEN + " \uD83E\uDDD1\uD83C\uDFFB" + GRAY + "Spawns a Thunder Storm with lightning strikes",
                            GRAY + " the caster gets constant 1.5x faster crits while",
                            GRAY + " the storm is active and speed 3 while in the storm.",
                            GRAY + " Trusted get 1.3x faster crits and speed 3 in the storm",
                            GRAY + " If trusted or caster get struck by thunder they get",
                            GRAY + " Speed 6 and 2.2x faster crits, If untrusted is struck",
                            GRAY + " by thunder they are stunned for 2s",
                            GREEN + " \uD83E\uDD3C" + GRAY + "Gives trusted 1.5x faster crits and speed 3."
                    ));

                    item.setItemMeta(itemMeta);
                    return item;
                }


                if (season == 2) {


                    ItemStack item = new ItemStack(Material.PRISMARINE_SHARD, 1);
                    ItemMeta itemMeta = item.getItemMeta();


                    NamespacedKey idkey = new NamespacedKey(blissgems.getInstance(), "gem-id");
                    itemMeta.getPersistentDataContainer().set(idkey, PersistentDataType.STRING, UUID.randomUUID().toString());

                    NamespacedKey tierkey = new NamespacedKey(blissgems.getInstance(), "gem-tier");
                    itemMeta.getPersistentDataContainer().set(tierkey, PersistentDataType.INTEGER, tier);

                    NamespacedKey typekey = new NamespacedKey(blissgems.getInstance(), "gem-type");
                    itemMeta.getPersistentDataContainer().set(typekey, PersistentDataType.STRING, "speed");

                    NamespacedKey quicknodropkey = new NamespacedKey(blissgems.getInstance(), "quick-no-drop");
                    itemMeta.getPersistentDataContainer().set(quicknodropkey, PersistentDataType.INTEGER, quicknodrop);

                    NamespacedKey quicknoremovekey = new NamespacedKey(blissgems.getInstance(), "quick-no-remove");
                    itemMeta.getPersistentDataContainer().set(quicknoremovekey, PersistentDataType.INTEGER, quicknoremove);


                    itemMeta.setDisplayName(blissgems.colorize("#FEFD17") + BOLD + "sᴘᴇᴇᴅ " + blissgems.colorize("#FFD773") + "ɢᴇᴍ");
                    for (ItemFlag flag : ItemFlag.values()) itemMeta.addItemFlags(flag);

                    if (Gem.isPristineorHigher(energy)) {
                        if (energy == Energy.Pristine_5) itemMeta.addEnchant(Enchantment.DURABILITY, 1, true);
                        itemMeta.setCustomModelData(8);
                        itemMeta.setLore(Arrays.asList(
                                WHITE + "" + BOLD + "ᴡᴀᴛᴄʜ ᴛʜᴇ ᴡᴏʀʟᴅ ᴀʀᴏᴜɴᴅ ʏᴏᴜ ᴛᴜʀɴ ɪɴᴛᴏ ᴀ ʙʟᴜʀ",
                                blissgems.colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                energystage,
                                GRAY + " " + blissgems.colorize("#FEFD17") + "🔮 " + GRAY + "Speed 3, Dolphins Grace",
                                GRAY + " and Immune to soul sand, auto-enchants efficiency 5",
                                WHITE + " ",
                                blissgems.colorize("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                                GRAY + "- " + WHITE + "\uD83C\uDFAF" + WHITE + "sʟᴏᴛʜs sᴇᴅᴀᴛɪᴠᴇ",
                                GRAY + " " + DARK_RED + "\uD83E\uDD3C\uD83C\uDFFB" + GRAY + " Slowness 2, mining fatigue 3",
                                GRAY + " Clears speed effects, 0.8x slower crits, " + WHITE + "30s, R4",
                                GRAY + " " + DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB" + GRAY + "Slowness 4, mining fatigue 3",
                                GRAY + " Clears speed effect, 0.5x slower crits, " + WHITE + "40s, R4",
                                WHITE + "",
                                GRAY + "-" + WHITE + "🌩 " + blissgems.colorize("#61FFEA") + "sᴘᴇᴇᴅʏ sᴛᴏʀᴍ " + WHITE + "40s R4",
                                GRAY + " " + GREEN + "\uD83E\uDDD1\uD83C\uDFFB" + GRAY + "Spawns a Thunder Storm with lightning strikes",
                                GRAY + " the caster gets constant 1.5x faster crits while",
                                GRAY + " the storm is active and speed 3 while in the storm.",
                                GRAY + " Trusted get 1.3x faster crits and speed 3 in the storm",
                                GRAY + " If trusted or caster get struck by thunder they get",
                                GRAY + " Speed 6 and 2.2x faster crits, If untrusted is struck",
                                GRAY + " by thunder they are stuned for 2s",
                                GRAY + " " + GREEN + "\uD83E\uDD3C" + GRAY + "Gives trusted 1.5x faster crits and speed 3."
                        ));
                    }


                    if (energy == Energy.Scratched) {
                        itemMeta.setCustomModelData(28);
                        itemMeta.setLore(Arrays.asList(
                                WHITE + "" + BOLD + "ᴡᴀᴛᴄʜ ᴛʜᴇ ᴡᴏʀʟᴅ ᴀʀᴏᴜɴᴅ ʏᴏᴜ ᴛᴜʀɴ ɪɴᴛᴏ ᴀ ʙʟᴜʀ",
                                blissgems.colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                energystage,
                                GRAY + " " + blissgems.colorize("#FEFD17") + "🔮 " + GRAY + "Speed 3, Immune to soul sand",
                                GRAY + " auto-enchants efficiency 4",
                                WHITE + " ",
                                blissgems.colorize("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                                GRAY + "- " + WHITE + "\uD83C\uDFAF" + WHITE + "sʟᴏᴛʜs sᴇᴅᴀᴛɪᴠᴇ",
                                GRAY + " " + DARK_RED + "\uD83E\uDD3C\uD83C\uDFFB" + GRAY + " Slowness 2, mining fatigue 3",
                                GRAY + " Clears speed effects, 0.8x slower crits, " + WHITE + "30s, R4",
                                GRAY + " " + DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB" + GRAY + "Slowness 4, mining fatigue 3",
                                GRAY + " Clears speed effect, 0.5x slower crits, " + WHITE + "40s, R4",
                                WHITE + "",
                                GRAY + "-" + WHITE + "🌩 " + blissgems.colorize("#61FFEA") + "sᴘᴇᴇᴅʏ sᴛᴏʀᴍ " + WHITE + "40s R4",
                                GRAY + " " + GREEN + "\uD83E\uDDD1\uD83C\uDFFB" + GRAY + "Spawns a Thunder Storm with lightning strikes",
                                GRAY + " the caster gets constant 1.5x faster crits while",
                                GRAY + " the storm is active and speed 3 while in the storm.",
                                GRAY + " Trusted get 1.3x faster crits and speed 3 in the storm",
                                GRAY + " If trusted or caster get struck by thunder they get",
                                GRAY + " Speed 6 and 2.2x faster crits, If untrusted is struck",
                                GRAY + " by thunder they are stuned for 2s",
                                GRAY + " " + GREEN + "\uD83E\uDD3C" + GRAY + "Gives trusted 1.5x faster crits and speed 3."
                        ));
                    }

                    if (energy == Energy.Cracked) {
                        itemMeta.setCustomModelData(48);
                        itemMeta.setLore(Arrays.asList(
                                WHITE + "" + BOLD + "ᴡᴀᴛᴄʜ ᴛʜᴇ ᴡᴏʀʟᴅ ᴀʀᴏᴜɴᴅ ʏᴏᴜ ᴛᴜʀɴ ɪɴᴛᴏ ᴀ ʙʟᴜʀ",
                                blissgems.colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                energystage,
                                GRAY + " " + blissgems.colorize("#FEFD17") + "🔮 " + GRAY + "Speed 3, Immune to soul sand",
                                GRAY + " auto-enchants efficiency 3",
                                WHITE + " ",
                                blissgems.colorize("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                                GRAY + "- " + WHITE + "\uD83C\uDFAF" + WHITE + "sʟᴏᴛʜs sᴇᴅᴀᴛɪᴠᴇ",
                                GRAY + " " + DARK_RED + "\uD83E\uDD3C\uD83C\uDFFB" + GRAY + " Slowness 2, mining fatigue 3",
                                GRAY + " Clears speed effects, 0.8x slower crits, " + WHITE + "30s, R4",
                                GRAY + " " + DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB" + GRAY + "Slowness 4, mining fatigue 3",
                                GRAY + " Clears speed effect, 0.5x slower crits, " + WHITE + "40s, R4",
                                WHITE + "",
                                GRAY + "-" + WHITE + "🌩 " + blissgems.colorize("#61FFEA") + "sᴘᴇᴇᴅʏ sᴛᴏʀᴍ " + WHITE + "40s R4",
                                GRAY + " " + GREEN + "\uD83E\uDDD1\uD83C\uDFFB" + GRAY + "Spawns a Thunder Storm with lightning strikes",
                                GRAY + " the caster gets constant 1.5x faster crits while",
                                GRAY + " the storm is active and speed 3 while in the storm.",
                                GRAY + " Trusted get 1.3x faster crits and speed 3 in the storm",
                                GRAY + " If trusted or caster get struck by thunder they get",
                                GRAY + " Speed 6 and 2.2x faster crits, If untrusted is struck",
                                GRAY + " by thunder they are stuned for 2s",
                                GRAY + " " + GREEN + "\uD83E\uDD3C" + GRAY + "Gives trusted 1.5x faster crits and speed 3."
                        ));
                    }

                    if (energy == Energy.Damaged) {
                        itemMeta.setCustomModelData(68);
                        itemMeta.setLore(Arrays.asList(
                                WHITE + "" + BOLD + "ᴡᴀᴛᴄʜ ᴛʜᴇ ᴡᴏʀʟᴅ ᴀʀᴏᴜɴᴅ ʏᴏᴜ ᴛᴜʀɴ ɪɴᴛᴏ ᴀ ʙʟᴜʀ",
                                blissgems.colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                energystage,
                                GRAY + " " + blissgems.colorize("#FEFD17") + "🔮 " + GRAY + "Immune to soul sand",
                                GRAY + " auto-enchants efficiency 2",
                                WHITE + " ",
                                blissgems.colorize("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                                GRAY + "- " + WHITE + "\uD83C\uDFAF" + WHITE + "sʟᴏᴛʜs sᴇᴅᴀᴛɪᴠᴇ",
                                GRAY + " " + DARK_RED + "\uD83E\uDD3C\uD83C\uDFFB" + GRAY + " Slowness 2, mining fatigue 3",
                                GRAY + " Clears speed effects, 0.8x slower crits, " + WHITE + "30s, R4",
                                GRAY + " " + DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB" + GRAY + "Slowness 4, mining fatigue 3",
                                GRAY + " Clears speed effect, 0.5x slower crits, " + WHITE + "40s, R4",
                                WHITE + "",
                                GRAY + "-" + WHITE + "🌩 " + blissgems.colorize("#61FFEA") + "sᴘᴇᴇᴅʏ sᴛᴏʀᴍ " + WHITE + "40s R4",
                                GRAY + " " + GREEN + "\uD83E\uDDD1\uD83C\uDFFB" + GRAY + "Spawns a Thunder Storm with lightning strikes",
                                GRAY + " the caster gets constant 1.5x faster crits while",
                                GRAY + " the storm is active and speed 3 while in the storm.",
                                GRAY + " Trusted get 1.3x faster crits and speed 3 in the storm",
                                GRAY + " If trusted or caster get struck by thunder they get",
                                GRAY + " Speed 6 and 2.2x faster crits, If untrusted is struck",
                                GRAY + " by thunder they are stuned for 2s",
                                GRAY + " " + GREEN + "\uD83E\uDD3C" + GRAY + "Gives trusted 1.5x faster crits and speed 3."
                        ));
                    }

                    if (energy == Energy.Ruined) {
                        itemMeta.setCustomModelData(88);
                        itemMeta.setLore(Arrays.asList(
                                WHITE + "" + BOLD + "ᴡᴀᴛᴄʜ ᴛʜᴇ ᴡᴏʀʟᴅ ᴀʀᴏᴜɴᴅ ʏᴏᴜ ᴛᴜʀɴ ɪɴᴛᴏ ᴀ ʙʟᴜʀ",
                                blissgems.colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                energystage,
                                GRAY + " " + blissgems.colorize("#FEFD17") + "🔮 " + GRAY + "No passives",
                                WHITE + " ",
                                blissgems.colorize("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                                GRAY + "- " + WHITE + "\uD83C\uDFAF" + WHITE + "sʟᴏᴛʜs sᴇᴅᴀᴛɪᴠᴇ",
                                GRAY + " " + DARK_RED + "\uD83E\uDD3C\uD83C\uDFFB" + GRAY + " Slowness 2, mining fatigue 3",
                                GRAY + " Clears speed effects, 0.8x slower crits, " + WHITE + "30s, R4",
                                GRAY + " " + DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB" + GRAY + "Slowness 4, mining fatigue 3",
                                GRAY + " Clears speed effect, 0.5x slower crits, " + WHITE + "40s, R4",
                                WHITE + "",
                                GRAY + "-" + WHITE + "🌩 " + blissgems.colorize("#61FFEA") + "sᴘᴇᴇᴅʏ sᴛᴏʀᴍ " + WHITE + "40s R4",
                                GRAY + " " + GREEN + "\uD83E\uDDD1\uD83C\uDFFB" + GRAY + "Spawns a Thunder Storm with lightning strikes",
                                GRAY + " the caster gets constant 1.5x faster crits while",
                                GRAY + " the storm is active and speed 3 while in the storm.",
                                GRAY + " Trusted get 1.3x faster crits and speed 3 in the storm",
                                GRAY + " If trusted or caster get struck by thunder they get",
                                GRAY + " Speed 6 and 2.2x faster crits, If untrusted is struck",
                                GRAY + " by thunder they are stuned for 2s",
                                GRAY + " " + GREEN + "\uD83E\uDD3C" + GRAY + "Gives trusted 1.5x faster crits and speed 3."
                        ));
                    }


                    if (energy == Energy.Broken) {
                        itemMeta.setCustomModelData(96);
                        itemMeta.setLore(Arrays.asList(
                                WHITE + "" + BOLD + "ᴜsᴇʟᴇss"
                        ));
                    }
                    item.setItemMeta(itemMeta);
                    return item;
                }


                if (season == 3) {

                    ItemStack item = new ItemStack(Material.PRISMARINE_SHARD, 1);
                    ItemMeta itemMeta = item.getItemMeta();


                    NamespacedKey idkey = new NamespacedKey(blissgems.getInstance(), "gem-id");
                    itemMeta.getPersistentDataContainer().set(idkey, PersistentDataType.STRING, "a95b1359-cdd0-4e74-b4d4-76fb2e256c7d");

                    NamespacedKey tierkey = new NamespacedKey(blissgems.getInstance(), "gem-tier");
                    itemMeta.getPersistentDataContainer().set(tierkey, PersistentDataType.INTEGER, tier);

                    NamespacedKey typekey = new NamespacedKey(blissgems.getInstance(), "gem-type");
                    itemMeta.getPersistentDataContainer().set(typekey, PersistentDataType.STRING, "speed");

                    NamespacedKey quicknodropkey = new NamespacedKey(blissgems.getInstance(), "quick-no-drop");
                    itemMeta.getPersistentDataContainer().set(quicknodropkey, PersistentDataType.INTEGER, quicknodrop);

                    NamespacedKey quicknoremovekey = new NamespacedKey(blissgems.getInstance(), "quick-no-remove");
                    itemMeta.getPersistentDataContainer().set(quicknoremovekey, PersistentDataType.INTEGER, quicknoremove);


                    itemMeta.setDisplayName(blissgems.colorize("#FEFD17") + BOLD + "sᴘᴇᴇᴅ " + blissgems.colorize("#FFD773") + "ɢᴇᴍ");
                    if (Gem.isPristineorHigher(energy) || energy == Energy.Scratched) {
                        if (energy == Energy.Pristine_5) itemMeta.addEnchant(Enchantment.DURABILITY, 1, true);
                        itemMeta.setCustomModelData(8);
                        if (energy == Energy.Scratched)
                            itemMeta.setCustomModelData(28);
                        for (ItemFlag flag : ItemFlag.values()) itemMeta.addItemFlags(flag);

                        String ending = blissgems.colorize("&f)");
                        if (energy == Energy.Pristine_1 || energy == Energy.Pristine_2 || energy == Energy.Pristine_3 || energy == Energy.Pristine_4 || energy == Energy.Pristine_5)
                            ending = ")";

                        itemMeta.setLore(Arrays.asList(
                                WHITE + "" + BOLD + "ᴡᴀᴛᴄʜ ᴛʜᴇ ᴡᴏʀʟᴅ ᴀʀᴏᴜɴᴅ ʏᴏᴜ ᴛᴜʀɴ ɪɴᴛᴏ ᴀ ʙʟᴜʀ ",
                                blissgems.colorize("&f(") + energystage + ending,
                                WHITE + "",
                                blissgems.colorize("#FEFD17") + "🔮" + " " + blissgems.colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                GRAY + "- Speed",
                                GRAY + "- Dolphins grace",
                                GRAY + "- Enchants Efficiency",
                                GRAY + "- Enchants Soul Speed",
                                WHITE + "",
                                blissgems.colorize("#FEFD17") + "🔮" + " " + blissgems.colorize("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                                GRAY + "- " + blissgems.colorize("#FEFD17") + " Terminal Velocity",
                                WHITE + "",
                                blissgems.colorize("#FEFD17") + "🔮 " + blissgems.colorize("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                                GRAY + "- " + WHITE + "\uD83C\uDFAF " + blissgems.colorize("#FFE86E") + "ʙʟᴜʀ",
                                WHITE + "",
                                GRAY + "- " + WHITE + "\uD83C\uDF29 " + blissgems.colorize("#61FFEA") + "sᴘᴇᴇᴅʏ sᴛᴏʀᴍ " + DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                                GRAY + "- " + WHITE + "\uD83C\uDF29 " + blissgems.colorize("#61FFEA") + "sᴘᴇᴇᴅʏ sᴛᴏʀᴍ " + DARK_RED + "\uD83E\uDD3C"
                        ));
                    }

                    if (energy == Energy.Cracked) {
                        itemMeta.setCustomModelData(48);
                        for (ItemFlag flag : ItemFlag.values()) itemMeta.addItemFlags(flag);
                        itemMeta.setLore(Arrays.asList(
                                WHITE + "" + BOLD + "ᴡᴀᴛᴄʜ ᴛʜᴇ ᴡᴏʀʟᴅ ᴀʀᴏᴜɴᴅ ʏᴏᴜ ᴛᴜʀɴ ɪɴᴛᴏ ᴀ ʙʟᴜʀ ",
                                blissgems.colorize("&f(") + energystage + blissgems.colorize("&f)"),
                                WHITE + "",
                                blissgems.colorize("#FEFD17") + "🔮" + " " + blissgems.colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                GRAY + "- Speed",
                                GRAY + "- Enchants Efficiency",
                                GRAY + "- Enchants Soul Speed",
                                WHITE + "",
                                blissgems.colorize("#FEFD17") + "🔮" + " " + blissgems.colorize("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                                GRAY + "- " + blissgems.colorize("#FEFD17") + " Terminal Velocity",
                                WHITE + "",
                                blissgems.colorize("#FEFD17") + "🔮 " + blissgems.colorize("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                                GRAY + "- " + WHITE + "\uD83C\uDFAF " + blissgems.colorize("#FFE86E") + "ʙʟᴜʀ",
                                WHITE + "",
                                GRAY + "- " + WHITE + "\uD83C\uDF29 " + blissgems.colorize("#61FFEA") + "sᴘᴇᴇᴅʏ sᴛᴏʀᴍ " + DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                                GRAY + "- " + WHITE + "\uD83C\uDF29 " + blissgems.colorize("#61FFEA") + "sᴘᴇᴇᴅʏ sᴛᴏʀᴍ " + DARK_RED + "\uD83E\uDD3C"
                        ));
                    }

                    if (energy == Energy.Damaged) {
                        itemMeta.setCustomModelData(68);
                        for (ItemFlag flag : ItemFlag.values()) itemMeta.addItemFlags(flag);
                        itemMeta.setLore(Arrays.asList(
                                WHITE + "" + BOLD + "ᴡᴀᴛᴄʜ ᴛʜᴇ ᴡᴏʀʟᴅ ᴀʀᴏᴜɴᴅ ʏᴏᴜ ᴛᴜʀɴ ɪɴᴛᴏ ᴀ ʙʟᴜʀ ",
                                blissgems.colorize("&f(") + energystage + blissgems.colorize("&f)"),
                                WHITE + "",
                                blissgems.colorize("#FEFD17") + "🔮" + " " + blissgems.colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                GRAY + "- Speed",
                                GRAY + "- Dolphins grace",
                                GRAY + "- Enchants Efficiency",
                                WHITE + "",
                                blissgems.colorize("#FEFD17") + "🔮" + " " + blissgems.colorize("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                                GRAY + "- " + blissgems.colorize("#FEFD17") + " Terminal Velocity",
                                WHITE + "",
                                blissgems.colorize("#FEFD17") + "🔮 " + blissgems.colorize("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                                GRAY + "- " + WHITE + "\uD83C\uDFAF " + blissgems.colorize("#FFE86E") + "ʙʟᴜʀ",
                                WHITE + "",
                                GRAY + "- " + WHITE + "\uD83C\uDF29 " + blissgems.colorize("#61FFEA") + "sᴘᴇᴇᴅʏ sᴛᴏʀᴍ " + DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                                GRAY + "- " + WHITE + "\uD83C\uDF29 " + blissgems.colorize("#61FFEA") + "sᴘᴇᴇᴅʏ sᴛᴏʀᴍ " + DARK_RED + "\uD83E\uDD3C"
                        ));
                    }


                    if (energy == Energy.Ruined) {
                        itemMeta.setCustomModelData(88);
                        for (ItemFlag flag : ItemFlag.values()) itemMeta.addItemFlags(flag);
                        itemMeta.setLore(Arrays.asList(
                                WHITE + "" + BOLD + "ᴡᴀᴛᴄʜ ᴛʜᴇ ᴡᴏʀʟᴅ ᴀʀᴏᴜɴᴅ ʏᴏᴜ ᴛᴜʀɴ ɪɴᴛᴏ ᴀ ʙʟᴜʀ ",
                                blissgems.colorize("&f(") + energystage + blissgems.colorize("&f)"),
                                WHITE + "",
                                blissgems.colorize("#FEFD17") + "🔮" + " " + blissgems.colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                GRAY + "No Passives",
                                WHITE + "",
                                blissgems.colorize("#FEFD17") + "🔮" + " " + blissgems.colorize("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                                GRAY + "- " + blissgems.colorize("#FEFD17") + " Terminal Velocity",
                                WHITE + "",
                                blissgems.colorize("#FEFD17") + "🔮 " + blissgems.colorize("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                                GRAY + "- " + WHITE + "\uD83C\uDFAF " + blissgems.colorize("#FFE86E") + "ʙʟᴜʀ",
                                WHITE + "",
                                GRAY + "- " + WHITE + "\uD83C\uDF29 " + blissgems.colorize("#61FFEA") + "sᴘᴇᴇᴅʏ sᴛᴏʀᴍ " + DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                                GRAY + "- " + WHITE + "\uD83C\uDF29 " + blissgems.colorize("#61FFEA") + "sᴘᴇᴇᴅʏ sᴛᴏʀᴍ " + DARK_RED + "\uD83E\uDD3C"
                        ));
                    }


                    if (energy == Energy.Broken) {
                        itemMeta.setCustomModelData(100);
                        for (ItemFlag flag : ItemFlag.values()) itemMeta.addItemFlags(flag);
                        itemMeta.setLore(Arrays.asList(
                                WHITE + "" + BOLD + "ᴜsᴇʟᴇss"
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


                    NamespacedKey idkey = new NamespacedKey(blissgems.getInstance(), "shard_id");
                    itemMeta.getPersistentDataContainer().set(idkey, PersistentDataType.STRING, String.valueOf(UUID.randomUUID().toString()));

                    itemMeta.setDisplayName(blissgems.colorize("#FE04B4") + BOLD + "Life " + blissgems.colorize("#FFD773") + "Gem");


                    // Set HideFlags to 127 if server is lower than 1.20.6, if yes: then hide all flags.
                    // due to the nbt change, it is not possible to make everything 1-1 for people using 1.20.6 and higher.

                    if (VersionChecker.OlderThanNBTChange()) itemMeta.addItemFlags(
                            ItemFlag.HIDE_ENCHANTS,
                            ItemFlag.HIDE_ATTRIBUTES,
                            ItemFlag.HIDE_UNBREAKABLE,
                            ItemFlag.HIDE_DESTROYS,
                            ItemFlag.HIDE_PLACED_ON,
                            ItemFlag.HIDE_POTION_EFFECTS,
                            ItemFlag.HIDE_DYE);
                    else for (ItemFlag flag : ItemFlag.values()) itemMeta.addItemFlags(flag);


                    itemMeta.setCustomModelData(4);
                    itemMeta.setLore(Arrays.asList(
                            WHITE + "" + BOLD + "Control life itself",
                            blissgems.colorize("#FFE4AB") + "Passives",
                            GRAY + " " + blissgems.colorize("#FE04B4") + "🔮 " + GRAY + "Feed animals and grow plants",
                            GRAY + " by crouch clicking with bare hand, 3x dmg",
                            GRAY + " to undead mobs, 2x the saturation capacity",
                            GRAY + " Immune to withering, heal half a heart ever 5 seconds",
                            GRAY + " 2 more hearts from gapples, and 90% chance totems work",
                            WHITE + " ",
                            blissgems.colorize("#FFE4AB") + "Powers",
                            GRAY + "-" + blissgems.colorize("#910D0D") + "\uD83D\uDC98 " + blissgems.colorize("#FE04B4") + "Heart Drainer", //emoji color is not accurate, i dont have the color for it
                            GRAY + " " + DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB " + GRAY + "Removes 30% of players hearts " + WHITE + "20s",
                            GRAY + " " + DARK_RED + "\uD83E\uDD3C " + GRAY + "Removes 15% of players hearts " + WHITE + "R4, 1m",
                            WHITE + "",
                            GRAY + "-" + WHITE + "\uD83D\uDC96 " + blissgems.colorize("#B8FFFA") + "Privilege Precinct",
                            GREEN + "\uD83E\uDDD1\uD83C\uDFFB " + GRAY + "Summons a 8 block wide zone that follows you",
                            GRAY + " Gives trusted +3, Untrusted -3 hearts",
                            GRAY + " slowly mends armour and tools if trusted",
                            GRAY + " caster only can steal health while zone is active",
                            GREEN + "\uD83E\uDD3C " + GRAY + "Gives trusted players +3 hearts for " + WHITE + "1m 30s, R4"
                    ));

                    item.setItemMeta(itemMeta);
                    return item;
                }


                if (season == 2) {


                    ItemStack item = new ItemStack(Material.PRISMARINE_SHARD, 1);
                    ItemMeta itemMeta = item.getItemMeta();


                    NamespacedKey idkey = new NamespacedKey(blissgems.getInstance(), "gem-id");
                    itemMeta.getPersistentDataContainer().set(idkey, PersistentDataType.STRING, UUID.randomUUID().toString());

                    NamespacedKey tierkey = new NamespacedKey(blissgems.getInstance(), "gem-tier");
                    itemMeta.getPersistentDataContainer().set(tierkey, PersistentDataType.INTEGER, tier);

                    NamespacedKey typekey = new NamespacedKey(blissgems.getInstance(), "gem-type");
                    itemMeta.getPersistentDataContainer().set(typekey, PersistentDataType.STRING, "life");

                    NamespacedKey quicknodropkey = new NamespacedKey(blissgems.getInstance(), "quick-no-drop");
                    itemMeta.getPersistentDataContainer().set(quicknodropkey, PersistentDataType.INTEGER, quicknodrop);

                    NamespacedKey quicknoremovekey = new NamespacedKey(blissgems.getInstance(), "quick-no-remove");
                    itemMeta.getPersistentDataContainer().set(quicknoremovekey, PersistentDataType.INTEGER, quicknoremove);


                    itemMeta.setDisplayName(blissgems.colorize("#FE04B4") + BOLD + "ʟɪғᴇ " + blissgems.colorize("#FFD773") + "ɢᴇᴍ");
                    for (ItemFlag flag : ItemFlag.values()) itemMeta.addItemFlags(flag);

                    if (Gem.isPristineorHigher(energy)) {
                        if (energy == Energy.Pristine_5) itemMeta.addEnchant(Enchantment.DURABILITY, 1, true);
                        itemMeta.setCustomModelData(4);
                        itemMeta.setLore(Arrays.asList(
                                WHITE + "" + BOLD + "ᴄᴏɴᴛʀᴏʟ ᴛʜᴇ ʙᴀʟᴀɴᴄᴇ ᴏғ ʟɪғᴇ",
                                blissgems.colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                energystage,
                                GRAY + " " + blissgems.colorize("#FE04B4") + "🔮" + GRAY + " " + GRAY + "Feed animals and grow plants",
                                GRAY + " by crouch clicking with bare hand. 3x dmg",
                                GRAY + " to undead mobs. 2x saturation",
                                GRAY + " Immune to withering. Heal half a heart ever 5 seconds",
                                GRAY + " 2 more hearts from gapples.",
                                WHITE + " ",
                                blissgems.colorize("#FFE4AB") + "ᴘᴏᴡᴇʀs ",
                                GRAY + "-" + WHITE + "\uD83D\uDC98" + blissgems.colorize("#FF429A") + " ʜᴇᴀʀᴛ ᴅʀᴀɪɴᴇʀ", //emoji color is not accurate, i dont have the color for it
                                GRAY + " " + DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB " + GRAY + "Removes 4 hearts " + WHITE + "20s",
                                GRAY + " " + DARK_RED + "\uD83E\uDD3C " + GRAY + "Removes 2 hearts " + WHITE + "R4, 1m",
                                WHITE + "",
                                GRAY + "-" + WHITE + "\uD83D\uDC96" + blissgems.colorize("#B8FFFA") + " ᴄɪʀᴄʟᴇ ᴏғ ʟɪғᴇ",
                                GREEN + "\uD83E\uDDD1\uD83C\uDFFB " + GRAY + "Summons a 8 block wide zone that follows you",
                                GRAY + " Gives trusted +4, Untrusted -4 hearts",
                                GRAY + " slowly mends armour and tools if trusted",
                                GRAY + " caster only can steal health while zone is active",
                                GREEN + "\uD83E\uDD3C " + GRAY + "Gives trusted players +5 hearts for " + WHITE + "1m 30s, R4"
                        ));
                    }


                    if (energy == Energy.Scratched) {
                        itemMeta.setCustomModelData(24);
                        itemMeta.setLore(Arrays.asList(
                                WHITE + "" + BOLD + "ᴄᴏɴᴛʀᴏʟ ᴛʜᴇ ʙᴀʟᴀɴᴄᴇ ᴏғ ʟɪғᴇ",
                                blissgems.colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                energystage,
                                GRAY + " " + blissgems.colorize("#FE04B4") + "🔮" + GRAY + " " + GRAY + "Feed animals and grow plants",
                                GRAY + " by crouch clicking with bare hand. 3x dmg",
                                GRAY + " to undead mobs. Immune to withering",
                                GRAY + " Heal half a heart ever 5 seconds",
                                WHITE + " ",
                                blissgems.colorize("#FFE4AB") + "ᴘᴏᴡᴇʀs ",
                                GRAY + "-" + WHITE + "\uD83D\uDC98" + blissgems.colorize("#FF429A") + " ʜᴇᴀʀᴛ ᴅʀᴀɪɴᴇʀ", //emoji color is not accurate, i dont have the color for it
                                GRAY + " " + DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB " + GRAY + "Removes 4 hearts " + WHITE + "20s",
                                GRAY + " " + DARK_RED + "\uD83E\uDD3C " + GRAY + "Removes 2 hearts " + WHITE + "R4, 1m",
                                WHITE + "",
                                GRAY + "-" + WHITE + "\uD83D\uDC96" + blissgems.colorize("#B8FFFA") + " ᴄɪʀᴄʟᴇ ᴏғ ʟɪғᴇ",
                                GREEN + "\uD83E\uDDD1\uD83C\uDFFB " + GRAY + "Summons a 8 block wide zone that follows you",
                                GRAY + " Gives trusted +4, Untrusted -4 hearts",
                                GRAY + " slowly mends armour and tools if trusted",
                                GRAY + " caster only can steal health while zone is active",
                                GREEN + "\uD83E\uDD3C " + GRAY + "Gives trusted players +5 hearts for " + WHITE + "1m 30s, R4"
                        ));
                    }

                    if (energy == Energy.Cracked) {
                        itemMeta.setCustomModelData(44);
                        itemMeta.setLore(Arrays.asList(
                                WHITE + "" + BOLD + "ᴄᴏɴᴛʀᴏʟ ᴛʜᴇ ʙᴀʟᴀɴᴄᴇ ᴏғ ʟɪғᴇ",
                                blissgems.colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                energystage,
                                GRAY + " " + blissgems.colorize("#FE04B4") + "🔮" + GRAY + " " + GRAY + "Feed animals by crouch",
                                GRAY + " clicking with bare hand. Immune to withering.",
                                GRAY + " Heal half a heart ever 5 seconds",
                                WHITE + " ",
                                blissgems.colorize("#FFE4AB") + "ᴘᴏᴡᴇʀs ",
                                GRAY + "-" + WHITE + "\uD83D\uDC98" + blissgems.colorize("#FF429A") + " ʜᴇᴀʀᴛ ᴅʀᴀɪɴᴇʀ", //emoji color is not accurate, i dont have the color for it
                                GRAY + " " + DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB " + GRAY + "Removes 4 hearts " + WHITE + "20s",
                                GRAY + " " + DARK_RED + "\uD83E\uDD3C " + GRAY + "Removes 2 hearts " + WHITE + "R4, 1m",
                                WHITE + "",
                                GRAY + "-" + WHITE + "\uD83D\uDC96" + blissgems.colorize("#B8FFFA") + " ᴄɪʀᴄʟᴇ ᴏғ ʟɪғᴇ",
                                GREEN + "\uD83E\uDDD1\uD83C\uDFFB " + GRAY + "Summons a 8 block wide zone that follows you",
                                GRAY + " Gives trusted +4, Untrusted -4 hearts",
                                GRAY + " slowly mends armour and tools if trusted",
                                GRAY + " caster only can steal health while zone is active",
                                GREEN + "\uD83E\uDD3C " + GRAY + "Gives trusted players +5 hearts for " + WHITE + "1m 30s, R4"
                        ));
                    }

                    if (energy == Energy.Damaged) {
                        itemMeta.setCustomModelData(64);
                        itemMeta.setLore(Arrays.asList(
                                WHITE + "" + BOLD + "ᴄᴏɴᴛʀᴏʟ ᴛʜᴇ ʙᴀʟᴀɴᴄᴇ ᴏғ ʟɪғᴇ",
                                blissgems.colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                energystage,
                                GRAY + " " + blissgems.colorize("#FE04B4") + "🔮" + GRAY + " " + GRAY + " Heal half a heart ever 5 seconds",
                                WHITE + " ",
                                blissgems.colorize("#FFE4AB") + "ᴘᴏᴡᴇʀs ",
                                GRAY + "-" + WHITE + "\uD83D\uDC98" + blissgems.colorize("#FF429A") + " ʜᴇᴀʀᴛ ᴅʀᴀɪɴᴇʀ", //emoji color is not accurate, i dont have the color for it
                                GRAY + " " + DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB " + GRAY + "Removes 4 hearts " + WHITE + "20s",
                                GRAY + " " + DARK_RED + "\uD83E\uDD3C " + GRAY + "Removes 2 hearts " + WHITE + "R4, 1m",
                                WHITE + "",
                                GRAY + "-" + WHITE + "\uD83D\uDC96" + blissgems.colorize("#B8FFFA") + " ᴄɪʀᴄʟᴇ ᴏғ ʟɪғᴇ",
                                GREEN + "\uD83E\uDDD1\uD83C\uDFFB " + GRAY + "Summons a 8 block wide zone that follows you",
                                GRAY + " Gives trusted +4, Untrusted -4 hearts",
                                GRAY + " slowly mends armour and tools if trusted",
                                GRAY + " caster only can steal health while zone is active",
                                GREEN + "\uD83E\uDD3C " + GRAY + "Gives trusted players +5 hearts for " + WHITE + "1m 30s, R4"
                        ));
                    }

                    if (energy == Energy.Ruined) {
                        itemMeta.setCustomModelData(84);
                        itemMeta.setLore(Arrays.asList(
                                WHITE + "" + BOLD + "ᴄᴏɴᴛʀᴏʟ ᴛʜᴇ ʙᴀʟᴀɴᴄᴇ ᴏғ ʟɪғᴇ",
                                blissgems.colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                energystage,
                                GRAY + " " + blissgems.colorize("#FE04B4") + "🔮" + GRAY + " No passives",
                                WHITE + " ",
                                blissgems.colorize("#FFE4AB") + "ᴘᴏᴡᴇʀs ",
                                GRAY + "-" + WHITE + "\uD83D\uDC98" + blissgems.colorize("#FF429A") + " ʜᴇᴀʀᴛ ᴅʀᴀɪɴᴇʀ", //emoji color is not accurate, i dont have the color for it
                                GRAY + " " + DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB " + GRAY + "Removes 4 hearts " + WHITE + "20s",
                                GRAY + " " + DARK_RED + "\uD83E\uDD3C " + GRAY + "Removes 2 hearts " + WHITE + "R4, 1m",
                                WHITE + "",
                                GRAY + "-" + WHITE + "\uD83D\uDC96" + blissgems.colorize("#B8FFFA") + " ᴄɪʀᴄʟᴇ ᴏғ ʟɪғᴇ",
                                GREEN + "\uD83E\uDDD1\uD83C\uDFFB " + GRAY + "Summons a 8 block wide zone that follows you",
                                GRAY + " Gives trusted +4, Untrusted -4 hearts",
                                GRAY + " slowly mends armour and tools if trusted",
                                GRAY + " caster only can steal health while zone is active",
                                GREEN + "\uD83E\uDD3C " + GRAY + "Gives trusted players +5 hearts for " + WHITE + "1m 30s, R4"
                        ));
                    }


                    if (energy == Energy.Broken) {
                        itemMeta.setCustomModelData(96);
                        itemMeta.setLore(Arrays.asList(
                                WHITE + "" + BOLD + "ᴜsᴇʟᴇss"
                        ));
                    }
                    item.setItemMeta(itemMeta);
                    return item;
                }


                if (season == 3) {


                    ItemStack item = new ItemStack(Material.PRISMARINE_SHARD, 1);
                    ItemMeta itemMeta = item.getItemMeta();


                    NamespacedKey idkey = new NamespacedKey(blissgems.getInstance(), "gem-id");
                    itemMeta.getPersistentDataContainer().set(idkey, PersistentDataType.STRING, "d9a2dbb6-3647-4a35-ba85-d4b58ded6e94");

                    NamespacedKey tierkey = new NamespacedKey(blissgems.getInstance(), "gem-tier");
                    itemMeta.getPersistentDataContainer().set(tierkey, PersistentDataType.INTEGER, tier);

                    NamespacedKey typekey = new NamespacedKey(blissgems.getInstance(), "gem-type");
                    itemMeta.getPersistentDataContainer().set(typekey, PersistentDataType.STRING, "life");

                    NamespacedKey quicknodropkey = new NamespacedKey(blissgems.getInstance(), "quick-no-drop");
                    itemMeta.getPersistentDataContainer().set(quicknodropkey, PersistentDataType.INTEGER, quicknodrop);

                    NamespacedKey quicknoremovekey = new NamespacedKey(blissgems.getInstance(), "quick-no-remove");
                    itemMeta.getPersistentDataContainer().set(quicknoremovekey, PersistentDataType.INTEGER, quicknoremove);


                    itemMeta.setDisplayName(blissgems.colorize("#FE04B4") + BOLD + "ʟɪғᴇ " + blissgems.colorize("#FFD773") + "ɢᴇᴍ");
                    for (ItemFlag flag : ItemFlag.values()) itemMeta.addItemFlags(flag);

                    if (Gem.isPristineorHigher(energy)) {
                        if (energy == Energy.Pristine_5) itemMeta.addEnchant(Enchantment.DURABILITY, 1, true);
                        itemMeta.setCustomModelData(4);

                        String ending = blissgems.colorize("&f)");
                        if (energy == Energy.Pristine_1 || energy == Energy.Pristine_2 || energy == Energy.Pristine_3 || energy == Energy.Pristine_4 || energy == Energy.Pristine_5)
                            ending = ")";

                        itemMeta.setLore(Arrays.asList(
                                WHITE + "" + BOLD + "ᴄᴏɴᴛʀᴏʟ ᴛʜᴇ ʙᴀʟᴀɴᴄᴇ ᴏғ ʟɪғᴇ",
                                blissgems.colorize("&f(") + energystage + ending,
                                WHITE + " ",
                                blissgems.colorize("#FE04B4") + "🔮 " + blissgems.colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                GRAY + "- Green Thumb",
                                GRAY + "- Radiant Fist",
                                GRAY + "- Bonus Saturation",
                                GRAY + "- Bonus Absorption",
                                GRAY + "- Wither Immune",
                                WHITE + " ",
                                blissgems.colorize("#FE04B4") + "🔮" + " " + blissgems.colorize("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                                GRAY + "- " + blissgems.colorize("#FE04B4") + "Vitalaty Vortex",
                                WHITE + " ",
                                blissgems.colorize("#FE04B4") + "🔮 " + blissgems.colorize("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                                GRAY + "- " + WHITE + "\uD83D\uDC98" + blissgems.colorize("#FF429A") + " ʜᴇᴀʀᴛ ᴅʀᴀɪɴᴇʀ " + DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                                GRAY + "- " + WHITE + "\uD83D\uDC98" + blissgems.colorize("#FF429A") + " ʜᴇᴀʀᴛʟᴏᴄᴋ " + DARK_RED + "\uD83E\uDD3C",
                                WHITE + "",
                                GRAY + "- " + WHITE + "\uD83D\uDC96" + blissgems.colorize("#B8FFFA") + " ᴄɪʀᴄʟᴇ ᴏғ ʟɪғᴇ " + GREEN + "\uD83E\uDDD1\uD83C\uDFFB",
                                GRAY + "- " + WHITE + "\uD83D\uDC96" + blissgems.colorize("#B8FFFA") + " ᴄɪʀᴄʟᴇ ᴏғ ʟɪғᴇ " + GREEN + "\uD83E\uDD3C"
                        ));
                    }


                    if (energy == Energy.Scratched) {
                        itemMeta.setCustomModelData(24);
                        itemMeta.setLore(Arrays.asList(
                                WHITE + "" + BOLD + "ᴄᴏɴᴛʀᴏʟ ᴛʜᴇ ʙᴀʟᴀɴᴄᴇ ᴏғ ʟɪғᴇ",
                                blissgems.colorize("&f(") + energystage + blissgems.colorize("&f)"),
                                WHITE + " ",
                                blissgems.colorize("#FE04B4") + "🔮 " + blissgems.colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                GRAY + "- Green Thumb",
                                GRAY + "- Bonus Saturation",
                                GRAY + "- Bonus Absorption",
                                GRAY + "- Wither Immune",
                                WHITE + " ",
                                blissgems.colorize("#FE04B4") + "🔮" + " " + blissgems.colorize("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                                GRAY + "- " + blissgems.colorize("#FE04B4") + "Vitalaty Vortex",
                                WHITE + " ",
                                blissgems.colorize("#FE04B4") + "🔮 " + blissgems.colorize("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                                GRAY + "- " + WHITE + "\uD83D\uDC98" + blissgems.colorize("#FF429A") + " ʜᴇᴀʀᴛ ᴅʀᴀɪɴᴇʀ " + DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                                GRAY + "- " + WHITE + "\uD83D\uDC98" + blissgems.colorize("#FF429A") + " ʜᴇᴀʀᴛʟᴏᴄᴋ " + DARK_RED + "\uD83E\uDD3C",
                                WHITE + "",
                                GRAY + "- " + WHITE + "\uD83D\uDC96" + blissgems.colorize("#B8FFFA") + " ᴄɪʀᴄʟᴇ ᴏғ ʟɪғᴇ " + GREEN + "\uD83E\uDDD1\uD83C\uDFFB",
                                GRAY + "- " + WHITE + "\uD83D\uDC96" + blissgems.colorize("#B8FFFA") + " ᴄɪʀᴄʟᴇ ᴏғ ʟɪғᴇ " + GREEN + "\uD83E\uDD3C"
                        ));
                    }

                    if (energy == Energy.Cracked) {
                        itemMeta.setCustomModelData(44);
                        itemMeta.setLore(Arrays.asList(
                                WHITE + "" + BOLD + "ᴄᴏɴᴛʀᴏʟ ᴛʜᴇ ʙᴀʟᴀɴᴄᴇ ᴏғ ʟɪғᴇ",
                                blissgems.colorize("&f(") + energystage + blissgems.colorize("&f)"),
                                WHITE + " ",
                                blissgems.colorize("#FE04B4") + "🔮 " + blissgems.colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                GRAY + "- Green Thumb",
                                GRAY + "- Bonus Saturation",
                                WHITE + " ",
                                blissgems.colorize("#FE04B4") + "🔮" + " " + blissgems.colorize("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                                GRAY + "- " + blissgems.colorize("#FE04B4") + "Vitalaty Vortex",
                                WHITE + " ",
                                blissgems.colorize("#FE04B4") + "🔮 " + blissgems.colorize("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                                GRAY + "- " + WHITE + "\uD83D\uDC98" + blissgems.colorize("#FF429A") + " ʜᴇᴀʀᴛ ᴅʀᴀɪɴᴇʀ " + DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                                GRAY + "- " + WHITE + "\uD83D\uDC98" + blissgems.colorize("#FF429A") + " ʜᴇᴀʀᴛʟᴏᴄᴋ " + DARK_RED + "\uD83E\uDD3C",
                                WHITE + "",
                                GRAY + "- " + WHITE + "\uD83D\uDC96" + blissgems.colorize("#B8FFFA") + " ᴄɪʀᴄʟᴇ ᴏғ ʟɪғᴇ " + GREEN + "\uD83E\uDDD1\uD83C\uDFFB",
                                GRAY + "- " + WHITE + "\uD83D\uDC96" + blissgems.colorize("#B8FFFA") + " ᴄɪʀᴄʟᴇ ᴏғ ʟɪғᴇ " + GREEN + "\uD83E\uDD3C"
                        ));
                    }

                    if (energy == Energy.Damaged) {
                        itemMeta.setCustomModelData(64);
                        itemMeta.setLore(Arrays.asList(
                                WHITE + "" + BOLD + "ᴄᴏɴᴛʀᴏʟ ᴛʜᴇ ʙᴀʟᴀɴᴄᴇ ᴏғ ʟɪғᴇ",
                                blissgems.colorize("&f(") + energystage + blissgems.colorize("&f)"),
                                WHITE + " ",
                                blissgems.colorize("#FE04B4") + "🔮 " + blissgems.colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                GRAY + "- Green Thumb",
                                WHITE + " ",
                                blissgems.colorize("#FE04B4") + "🔮" + " " + blissgems.colorize("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                                GRAY + "- " + blissgems.colorize("#FE04B4") + "Vitalaty Vortex",
                                WHITE + " ",
                                blissgems.colorize("#FE04B4") + "🔮 " + blissgems.colorize("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                                GRAY + "- " + WHITE + "\uD83D\uDC98" + blissgems.colorize("#FF429A") + " ʜᴇᴀʀᴛ ᴅʀᴀɪɴᴇʀ " + DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                                GRAY + "- " + WHITE + "\uD83D\uDC98" + blissgems.colorize("#FF429A") + " ʜᴇᴀʀᴛʟᴏᴄᴋ " + DARK_RED + "\uD83E\uDD3C",
                                WHITE + "",
                                GRAY + "- " + WHITE + "\uD83D\uDC96" + blissgems.colorize("#B8FFFA") + " ᴄɪʀᴄʟᴇ ᴏғ ʟɪғᴇ " + GREEN + "\uD83E\uDDD1\uD83C\uDFFB",
                                GRAY + "- " + WHITE + "\uD83D\uDC96" + blissgems.colorize("#B8FFFA") + " ᴄɪʀᴄʟᴇ ᴏғ ʟɪғᴇ " + GREEN + "\uD83E\uDD3C"
                        ));
                    }

                    if (energy == Energy.Ruined) {
                        itemMeta.setCustomModelData(84);
                        itemMeta.setLore(Arrays.asList(
                                WHITE + "" + BOLD + "ᴄᴏɴᴛʀᴏʟ ᴛʜᴇ ʙᴀʟᴀɴᴄᴇ ᴏғ ʟɪғᴇ",
                                blissgems.colorize("&f(") + energystage + blissgems.colorize("&f)"),
                                WHITE + " ",
                                blissgems.colorize("#FE04B4") + "🔮 " + blissgems.colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                GRAY + "No Passives",
                                WHITE + " ",
                                blissgems.colorize("#FE04B4") + "🔮" + " " + blissgems.colorize("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                                GRAY + "- " + blissgems.colorize("#FE04B4") + "Vitalaty Vortex",
                                WHITE + " ",
                                blissgems.colorize("#FE04B4") + "🔮 " + blissgems.colorize("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                                GRAY + "- " + WHITE + "\uD83D\uDC98" + blissgems.colorize("#FF429A") + " ʜᴇᴀʀᴛ ᴅʀᴀɪɴᴇʀ " + DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                                GRAY + "- " + WHITE + "\uD83D\uDC98" + blissgems.colorize("#FF429A") + " ʜᴇᴀʀᴛʟᴏᴄᴋ " + DARK_RED + "\uD83E\uDD3C",
                                WHITE + "",
                                GRAY + "- " + WHITE + "\uD83D\uDC96" + blissgems.colorize("#B8FFFA") + " ᴄɪʀᴄʟᴇ ᴏғ ʟɪғᴇ " + GREEN + "\uD83E\uDDD1\uD83C\uDFFB",
                                GRAY + "- " + WHITE + "\uD83D\uDC96" + blissgems.colorize("#B8FFFA") + " ᴄɪʀᴄʟᴇ ᴏғ ʟɪғᴇ " + GREEN + "\uD83E\uDD3C"
                        ));
                    }


                    if (energy == Energy.Broken) {
                        itemMeta.setCustomModelData(100);
                        for (ItemFlag flag : ItemFlag.values()) itemMeta.addItemFlags(flag);
                        itemMeta.setLore(Arrays.asList(
                                WHITE + "" + BOLD + "ᴜsᴇʟᴇss"
                        ));
                    }
                    item.setItemMeta(itemMeta);
                    return item;
                }
            }


            //Puff

            if (gem == GemType.Puff) {
                if (season == 1) {
                    ItemStack item = new ItemStack(Material.PRISMARINE_SHARD, 1);
                    ItemMeta itemMeta = item.getItemMeta();


                    NamespacedKey idkey = new NamespacedKey(blissgems.getInstance(), "shard_id");
                    itemMeta.getPersistentDataContainer().set(idkey, PersistentDataType.STRING, String.valueOf(UUID.randomUUID().toString()));

                    itemMeta.setDisplayName(WHITE + "" + BOLD + "Puff Gem");


                    // Set HideFlags to 127 if server is lower than 1.20.6, if yes: then hide all flags.
                    // due to the nbt change, it is not possible to make everything 1-1 for people using 1.20.6 and higher.

                    if (VersionChecker.OlderThanNBTChange()) itemMeta.addItemFlags(
                            ItemFlag.HIDE_ENCHANTS,
                            ItemFlag.HIDE_ATTRIBUTES,
                            ItemFlag.HIDE_UNBREAKABLE,
                            ItemFlag.HIDE_DESTROYS,
                            ItemFlag.HIDE_PLACED_ON,
                            ItemFlag.HIDE_POTION_EFFECTS,
                            ItemFlag.HIDE_DYE);
                    else for (ItemFlag flag : ItemFlag.values()) itemMeta.addItemFlags(flag);


                    itemMeta.setCustomModelData(6);
                    itemMeta.setLore(Arrays.asList(
                            WHITE + "" + BOLD + "Be free like the wind",
                            blissgems.colorize("#FFE4AB") + "Passives",
                            GRAY + " " + WHITE + "🔮 " + GRAY + "No fall damage, double jump",
                            GRAY + " and bows get Power 5 and Punch 2",
                            WHITE + " ",
                            WHITE + " ",
                            GRAY + "-" + WHITE + "☁ " + blissgems.colorize("#FAE7E6") + "Breezy Bash",
                            GRAY + " " + DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB " + GRAY + "Lifts player 35 blocks and smashes",
                            GRAY + " them down at a high velocity",
                            GRAY + " " + DARK_RED + "\uD83E\uDD3C " + GRAY + "Levitates enemies " + WHITE + "R4, 25s",
                            WHITE + "",
                            GRAY + "-" + WHITE + "⏫ " + WHITE + "Dash",
                            GRAY + " Dashes you in the direction you are looking",
                            GRAY + " deals 2 hearts of damage regardless the protection",
                            GRAY + " to players and mobs upon contact"
                    ));

                    item.setItemMeta(itemMeta);
                    return item;
                }


                if (season == 2) {


                    ItemStack item = new ItemStack(Material.PRISMARINE_SHARD, 1);
                    ItemMeta itemMeta = item.getItemMeta();


                    NamespacedKey idkey = new NamespacedKey(blissgems.getInstance(), "gem-id");
                    itemMeta.getPersistentDataContainer().set(idkey, PersistentDataType.STRING, UUID.randomUUID().toString());

                    NamespacedKey tierkey = new NamespacedKey(blissgems.getInstance(), "gem-tier");
                    itemMeta.getPersistentDataContainer().set(tierkey, PersistentDataType.INTEGER, tier);

                    NamespacedKey typekey = new NamespacedKey(blissgems.getInstance(), "gem-type");
                    itemMeta.getPersistentDataContainer().set(typekey, PersistentDataType.STRING, "puff");

                    NamespacedKey quicknodropkey = new NamespacedKey(blissgems.getInstance(), "quick-no-drop");
                    itemMeta.getPersistentDataContainer().set(quicknodropkey, PersistentDataType.INTEGER, quicknodrop);

                    NamespacedKey quicknoremovekey = new NamespacedKey(blissgems.getInstance(), "quick-no-remove");
                    itemMeta.getPersistentDataContainer().set(quicknoremovekey, PersistentDataType.INTEGER, quicknoremove);


                    itemMeta.setDisplayName(blissgems.colorize("#EFEFEF") + BOLD + "ᴘᴜғғ " + blissgems.colorize("#FFD773") + "ɢᴇᴍ");
                    for (ItemFlag flag : ItemFlag.values()) itemMeta.addItemFlags(flag);

                    if (Gem.isPristineorHigher(energy)) {
                        if (energy == Energy.Pristine_5) itemMeta.addEnchant(Enchantment.DURABILITY, 1, true);
                        itemMeta.setCustomModelData(6);
                        itemMeta.setLore(Arrays.asList(
                                WHITE + "" + BOLD + "ʙᴇ ᴛʜᴇ ʙɪɢɢᴇsᴛ ʙɪʀᴅ",
                                blissgems.colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                energystage,
                                GRAY + " " + WHITE + "🔮" + GRAY + "No fall damage, double jump",
                                GRAY + " Auto enchant Power 5 and Punch 2",
                                GRAY + " and feather falling 4",
                                WHITE + " ",
                                blissgems.colorize("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                                GRAY + "-" + WHITE + "☁" + blissgems.colorize("#FAE7E6") + "ʙʀᴇᴇᴢʏ ʙᴀsʜ",
                                GRAY + " " + DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB " + GRAY + "Lifts player 35 blocks and smashes",
                                GRAY + " them down at a high velocity",
                                GRAY + " " + DARK_RED + "\uD83E\uDD3C " + GRAY + "Pushes enemies away from you",
                                WHITE + "",
                                GRAY + "-" + WHITE + "⏫ " + blissgems.colorize("#EFEFEF") + "ᴅᴀsʜ",
                                GRAY + " Dashes you in the direction you are looking",
                                GRAY + " deals 2 hearts of damage regardless the protection",
                                GRAY + " to players and mobs upon contact"
                        ));
                    }


                    if (energy == Energy.Scratched) {
                        itemMeta.setCustomModelData(26);
                        itemMeta.setLore(Arrays.asList(
                                WHITE + "" + BOLD + "ʙᴇ ᴛʜᴇ ʙɪɢɢᴇsᴛ ʙɪʀᴅ",
                                blissgems.colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                energystage,
                                GRAY + " " + WHITE + "🔮" + GRAY + "No fall damage, double jump",
                                GRAY + " Auto enchant Power 4 and Punch",
                                GRAY + " and feather falling 3",
                                WHITE + " ",
                                blissgems.colorize("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                                GRAY + "-" + WHITE + "☁" + blissgems.colorize("#FAE7E6") + "ʙʀᴇᴇᴢʏ ʙᴀsʜ",
                                GRAY + " " + DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB " + GRAY + "Lifts player 35 blocks and smashes",
                                GRAY + " them down at a high velocity",
                                GRAY + " " + DARK_RED + "\uD83E\uDD3C " + GRAY + "Pushes enemies away from you",
                                WHITE + "",
                                GRAY + "-" + WHITE + "⏫ " + blissgems.colorize("#EFEFEF") + "ᴅᴀsʜ",
                                GRAY + " Dashes you in the direction you are looking",
                                GRAY + " deals 2 hearts of damage regardless the protection",
                                GRAY + " to players and mobs upon contact"
                        ));
                    }

                    if (energy == Energy.Cracked) {
                        itemMeta.setCustomModelData(46);
                        itemMeta.setLore(Arrays.asList(
                                WHITE + "" + BOLD + "ʙᴇ ᴛʜᴇ ʙɪɢɢᴇsᴛ ʙɪʀᴅ",
                                blissgems.colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                energystage,
                                GRAY + " " + WHITE + "🔮" + GRAY + "Double jump",
                                GRAY + " Auto enchant Power 3 and Punch",
                                GRAY + " and feather falling 2",
                                WHITE + " ",
                                blissgems.colorize("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                                GRAY + "-" + WHITE + "☁" + blissgems.colorize("#FAE7E6") + "ʙʀᴇᴇᴢʏ ʙᴀsʜ",
                                GRAY + " " + DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB " + GRAY + "Lifts player 35 blocks and smashes",
                                GRAY + " them down at a high velocity",
                                GRAY + " " + DARK_RED + "\uD83E\uDD3C " + GRAY + "Pushes enemies away from you",
                                WHITE + "",
                                GRAY + "-" + WHITE + "⏫ " + blissgems.colorize("#EFEFEF") + "ᴅᴀsʜ",
                                GRAY + " Dashes you in the direction you are looking",
                                GRAY + " deals 2 hearts of damage regardless the protection",
                                GRAY + " to players and mobs upon contact"
                        ));
                    }

                    if (energy == Energy.Damaged) {
                        itemMeta.setCustomModelData(66);
                        itemMeta.setLore(Arrays.asList(
                                WHITE + "" + BOLD + "ʙᴇ ᴛʜᴇ ʙɪɢɢᴇsᴛ ʙɪʀᴅ",
                                blissgems.colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                energystage,
                                WHITE + "🔮" + GRAY + "Auto enchant Power 2",
                                GRAY + " and feather falling 1",
                                WHITE + " ",
                                blissgems.colorize("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                                GRAY + "-" + WHITE + "☁" + blissgems.colorize("#FAE7E6") + "ʙʀᴇᴇᴢʏ ʙᴀsʜ",
                                GRAY + " " + DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB " + GRAY + "Lifts player 35 blocks and smashes",
                                GRAY + " them down at a high velocity",
                                GRAY + " " + DARK_RED + "\uD83E\uDD3C " + GRAY + "Pushes enemies away from you",
                                WHITE + "",
                                GRAY + "-" + WHITE + "⏫ " + blissgems.colorize("#EFEFEF") + "ᴅᴀsʜ",
                                GRAY + " Dashes you in the direction you are looking",
                                GRAY + " deals 2 hearts of damage regardless the protection",
                                GRAY + " to players and mobs upon contact"
                        ));
                    }

                    if (energy == Energy.Ruined) {
                        itemMeta.setCustomModelData(86);
                        itemMeta.setLore(Arrays.asList(
                                WHITE + "" + BOLD + "ʙᴇ ᴛʜᴇ ʙɪɢɢᴇsᴛ ʙɪʀᴅ",
                                blissgems.colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                energystage,
                                WHITE + "🔮" + GRAY + "No passives",
                                WHITE + " ",
                                blissgems.colorize("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                                GRAY + "-" + WHITE + "☁" + blissgems.colorize("#FAE7E6") + "ʙʀᴇᴇᴢʏ ʙᴀsʜ",
                                GRAY + " " + DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB " + GRAY + "Lifts player 35 blocks and smashes",
                                GRAY + " them down at a high velocity",
                                GRAY + " " + DARK_RED + "\uD83E\uDD3C " + GRAY + "Pushes enemies away from you",
                                WHITE + "",
                                GRAY + "-" + WHITE + "⏫ " + blissgems.colorize("#EFEFEF") + "ᴅᴀsʜ",
                                GRAY + " Dashes you in the direction you are looking",
                                GRAY + " deals 2 hearts of damage regardless the protection",
                                GRAY + " to players and mobs upon contact"
                        ));
                    }


                    if (energy == Energy.Broken) {
                        itemMeta.setCustomModelData(96);
                        itemMeta.setLore(Arrays.asList(
                                WHITE + "" + BOLD + "ᴜsᴇʟᴇss"
                        ));
                    }
                    item.setItemMeta(itemMeta);
                    return item;
                }


                if (season == 3) {


                    ItemStack item = new ItemStack(Material.PRISMARINE_SHARD, 1);
                    ItemMeta itemMeta = item.getItemMeta();

                    NamespacedKey idkey = new NamespacedKey(blissgems.getInstance(), "gem-id");
                    itemMeta.getPersistentDataContainer().set(idkey, PersistentDataType.STRING, "a6a2db68-e82e-4ab8-b883-0fe5f3ad3def");

                    NamespacedKey tierkey = new NamespacedKey(blissgems.getInstance(), "gem-tier");
                    itemMeta.getPersistentDataContainer().set(tierkey, PersistentDataType.INTEGER, tier);

                    NamespacedKey typekey = new NamespacedKey(blissgems.getInstance(), "gem-type");
                    itemMeta.getPersistentDataContainer().set(typekey, PersistentDataType.STRING, "puff");

                    NamespacedKey quicknodropkey = new NamespacedKey(blissgems.getInstance(), "quick-no-drop");
                    itemMeta.getPersistentDataContainer().set(quicknodropkey, PersistentDataType.INTEGER, quicknodrop);

                    NamespacedKey quicknoremovekey = new NamespacedKey(blissgems.getInstance(), "quick-no-remove");
                    itemMeta.getPersistentDataContainer().set(quicknoremovekey, PersistentDataType.INTEGER, quicknoremove);

                    itemMeta.setDisplayName(blissgems.colorize("#EFEFEF") + BOLD + "ᴘᴜғғ " + blissgems.colorize("#FFD773") + "ɢᴇᴍ");
                    for (ItemFlag flag : ItemFlag.values()) itemMeta.addItemFlags(flag);

                    if (Gem.isPristineorHigher(energy)) {
                        if (energy == Energy.Pristine_5) itemMeta.addEnchant(Enchantment.DURABILITY, 1, true);
                        itemMeta.setCustomModelData(6);
                        String ending = blissgems.colorize("&f)");
                        if (energy == Energy.Pristine_1 || energy == Energy.Pristine_2 || energy == Energy.Pristine_3 || energy == Energy.Pristine_4 || energy == Energy.Pristine_5)
                            ending = ")";

                        itemMeta.setLore(Arrays.asList(
                                WHITE + "" + BOLD + "ʙᴇ ᴛʜᴇ ʙɪɢɢᴇsᴛ ʙɪʀᴅ",
                                blissgems.colorize("&f(") + energystage + ending,
                                WHITE + " ",
                                WHITE + "🔮 " + blissgems.colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                GRAY + "- Fall Damage immunity",
                                GRAY + "- Enchants Power",
                                GRAY + "- Enchants Punch",
                                GRAY + "- Sculk Silence",
                                GRAY + "- Crop Tramp-Less",
                                WHITE + " ",
                                WHITE + "🔮 " + blissgems.colorize("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                                GRAY + "- " + WHITE + "Double Jump",
                                WHITE + " ",
                                WHITE + "🔮 " + blissgems.colorize("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                                GRAY + "- " + WHITE + "☁" + blissgems.colorize("#FAE7E6") + " ʙʀᴇᴇᴢʏ ʙᴀsʜ " + DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                                GRAY + "- " + WHITE + "☁" + blissgems.colorize("#FAE7E6") + " ʙʀᴇᴇᴢʏ ʙᴀsʜ " + DARK_RED + "\uD83E\uDD3C",
                                WHITE + "",
                                GRAY + "- " + WHITE + "⏫" + blissgems.colorize("#EFEFEF") + " ᴅᴀsʜ"
                        ));
                    }


                    if (energy == Energy.Scratched) {
                        itemMeta.setCustomModelData(26);
                        itemMeta.setLore(Arrays.asList(
                                WHITE + "" + BOLD + "ʙᴇ ᴛʜᴇ ʙɪɢɢᴇsᴛ ʙɪʀᴅ",
                                blissgems.colorize("&f(") + energystage + blissgems.colorize("&f)"),
                                WHITE + " ",
                                WHITE + "🔮 " + blissgems.colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                GRAY + "- Fall Damage immunity",
                                GRAY + "- Enchants Power",
                                GRAY + "- Enchants Punch",
                                GRAY + "- Crop Tramp-Less",
                                WHITE + " ",
                                WHITE + "🔮 " + blissgems.colorize("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                                GRAY + "- " + WHITE + "Double Jump",
                                WHITE + " ",
                                WHITE + "🔮 " + blissgems.colorize("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                                GRAY + "- " + WHITE + "☁" + blissgems.colorize("#FAE7E6") + " ʙʀᴇᴇᴢʏ ʙᴀsʜ " + DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                                GRAY + "- " + WHITE + "☁" + blissgems.colorize("#FAE7E6") + " ʙʀᴇᴇᴢʏ ʙᴀsʜ " + DARK_RED + "\uD83E\uDD3C",
                                WHITE + "",
                                GRAY + "- " + WHITE + "⏫" + blissgems.colorize("#EFEFEF") + " ᴅᴀsʜ"
                        ));
                    }

                    if (energy == Energy.Cracked) {
                        itemMeta.setCustomModelData(46);
                        itemMeta.setLore(Arrays.asList(
                                WHITE + "" + BOLD + "ʙᴇ ᴛʜᴇ ʙɪɢɢᴇsᴛ ʙɪʀᴅ",
                                blissgems.colorize("&f(") + energystage + blissgems.colorize("&f)"),
                                WHITE + " ",
                                WHITE + "🔮 " + blissgems.colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                GRAY + "- Fall Damage immunity",
                                GRAY + "- Enchants Punch",
                                GRAY + "- Crop Tramp-Less",
                                WHITE + " ",
                                WHITE + "🔮 " + blissgems.colorize("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                                GRAY + "- " + WHITE + "Double Jump",
                                WHITE + " ",
                                WHITE + "🔮 " + blissgems.colorize("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                                GRAY + "- " + WHITE + "☁" + blissgems.colorize("#FAE7E6") + " ʙʀᴇᴇᴢʏ ʙᴀsʜ " + DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                                GRAY + "- " + WHITE + "☁" + blissgems.colorize("#FAE7E6") + " ʙʀᴇᴇᴢʏ ʙᴀsʜ " + DARK_RED + "\uD83E\uDD3C",
                                WHITE + "",
                                GRAY + "- " + WHITE + "⏫" + blissgems.colorize("#EFEFEF") + " ᴅᴀsʜ"
                        ));
                    }

                    if (energy == Energy.Damaged) {
                        itemMeta.setCustomModelData(66);
                        itemMeta.setLore(Arrays.asList(
                                WHITE + "" + BOLD + "ʙᴇ ᴛʜᴇ ʙɪɢɢᴇsᴛ ʙɪʀᴅ",
                                blissgems.colorize("&f(") + energystage + blissgems.colorize("&f)"),
                                WHITE + " ",
                                WHITE + "🔮 " + blissgems.colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                GRAY + "- Fall Damage immunity",
                                GRAY + "  - (Not Dripstone Immune)",
                                GRAY + "- Crop Tramp-Less",
                                WHITE + " ",
                                WHITE + "🔮 " + blissgems.colorize("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                                GRAY + "- " + WHITE + "Double Jump",
                                WHITE + " ",
                                WHITE + "🔮 " + blissgems.colorize("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                                GRAY + "- " + WHITE + "☁" + blissgems.colorize("#FAE7E6") + " ʙʀᴇᴇᴢʏ ʙᴀsʜ " + DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                                GRAY + "- " + WHITE + "☁" + blissgems.colorize("#FAE7E6") + " ʙʀᴇᴇᴢʏ ʙᴀsʜ " + DARK_RED + "\uD83E\uDD3C",
                                WHITE + "",
                                GRAY + "- " + WHITE + "⏫" + blissgems.colorize("#EFEFEF") + " ᴅᴀsʜ"
                        ));
                    }

                    if (energy == Energy.Ruined) {
                        itemMeta.setCustomModelData(86);
                        itemMeta.setLore(Arrays.asList(
                                WHITE + "" + BOLD + "ʙᴇ ᴛʜᴇ ʙɪɢɢᴇsᴛ ʙɪʀᴅ",
                                blissgems.colorize("&f(") + energystage + blissgems.colorize("&f)"),
                                WHITE + " ",
                                WHITE + "🔮 " + blissgems.colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                GRAY + "No Passives",
                                WHITE + " ",
                                WHITE + "🔮 " + blissgems.colorize("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                                GRAY + "- " + WHITE + "Double Jump",
                                WHITE + " ",
                                WHITE + "🔮 " + blissgems.colorize("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                                GRAY + "- " + WHITE + "☁" + blissgems.colorize("#FAE7E6") + " ʙʀᴇᴇᴢʏ ʙᴀsʜ " + DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                                GRAY + "- " + WHITE + "☁" + blissgems.colorize("#FAE7E6") + " ʙʀᴇᴇᴢʏ ʙᴀsʜ " + DARK_RED + "\uD83E\uDD3C",
                                WHITE + "",
                                GRAY + "- " + WHITE + "⏫" + blissgems.colorize("#EFEFEF") + " ᴅᴀsʜ"
                        ));
                    }


                    if (energy == Energy.Broken) {
                        itemMeta.setCustomModelData(100);
                        for (ItemFlag flag : ItemFlag.values()) itemMeta.addItemFlags(flag);
                        itemMeta.setLore(Arrays.asList(
                                WHITE + "" + BOLD + "ᴜsᴇʟᴇss"
                        ));
                    }
                    item.setItemMeta(itemMeta);
                    return item;
                }
            }


            //Astra

            if (gem == GemType.Astra) {
                if (season == 2) {


                    ItemStack item = new ItemStack(Material.PRISMARINE_SHARD, 1);
                    ItemMeta itemMeta = item.getItemMeta();


                    NamespacedKey idkey = new NamespacedKey(blissgems.getInstance(), "gem-id");
                    itemMeta.getPersistentDataContainer().set(idkey, PersistentDataType.STRING, UUID.randomUUID().toString());

                    NamespacedKey tierkey = new NamespacedKey(blissgems.getInstance(), "gem-tier");
                    itemMeta.getPersistentDataContainer().set(tierkey, PersistentDataType.INTEGER, tier);

                    NamespacedKey typekey = new NamespacedKey(blissgems.getInstance(), "gem-type");
                    itemMeta.getPersistentDataContainer().set(typekey, PersistentDataType.STRING, "astra");

                    NamespacedKey quicknodropkey = new NamespacedKey(blissgems.getInstance(), "quick-no-drop");
                    itemMeta.getPersistentDataContainer().set(quicknodropkey, PersistentDataType.INTEGER, quicknodrop);

                    NamespacedKey quicknoremovekey = new NamespacedKey(blissgems.getInstance(), "quick-no-remove");
                    itemMeta.getPersistentDataContainer().set(quicknoremovekey, PersistentDataType.INTEGER, quicknoremove);


                    itemMeta.setDisplayName(blissgems.colorize("#A01FFF") + BOLD + "ᴀsᴛʀᴀ " + blissgems.colorize("#FFD773") + "ɢᴇᴍ");
                    for (ItemFlag flag : ItemFlag.values()) itemMeta.addItemFlags(flag);

                    if (Gem.isPristineorHigher(energy)) {
                        if (energy == Energy.Pristine_5) itemMeta.addEnchant(Enchantment.DURABILITY, 1, true);
                        itemMeta.setCustomModelData(14);
                        itemMeta.setLore(Arrays.asList(
                                WHITE + "" + BOLD + "ᴍᴀɴᴀɢᴇ ᴛʜᴇ ᴛɪᴅᴇs ᴏғ ᴛʜᴇ ᴄᴏsᴍᴏs",
                                blissgems.colorize("#A01FFF") + " ",
                                GRAY + " ",
                                blissgems.colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                energystage,
                                GRAY + " " + blissgems.colorize("#A01FFF") + "🔮 " + GRAY + "10% of attacks will phase",
                                GRAY + " through you. Absorbing souls will heal you 2.5 hearts",
                                GRAY + " if mob, and 5 if player.",
                                GRAY + " Capture 2 mobs inside your gem, releasing ",
                                GRAY + " them in the opposite order they were captured.",
                                WHITE + "",
                                blissgems.colorize("#A01FFF") + BOLD + "ᴘᴏᴡᴇʀs",
                                WHITE + "\uD83D\uDD2A " + blissgems.colorize("#BFB8B8") + "ᴅᴀɢɢᴇʀs",
                                GRAY + "Shoot 5 daggers, if a player is hit with one ",
                                GRAY + " they take 3 hearts of damage and their gem is ",
                                GRAY + " disabled for 10 seconds for every dagger they're hit with.",
                                DARK_RED + "\uD83E\uDD3C " + GRAY + "Enter the body of that player, exit by crouching or",
                                GRAY + " when that player receives damage. Leaving the body",
                                GRAY + " will haunt them, disabling their gem for 10 seconds",
                                WHITE + "",
                                GRAY + "-" + WHITE + "\uD83D\uDC7B " + blissgems.colorize("#AABBBF") + "ᴀsᴛʀᴀʟ ᴘʀᴏᴊᴇᴄᴛɪᴏɴ",
                                GRAY + " Become a projection and explore in a 150 block ",
                                GRAY + " radius. Spook players by left clicking with your gem,",
                                GRAY + " or tag them with right click, tagging makes that player glow for you, ",
                                GRAY + " and everyone in your trust list.",
                                GRAY + " You exit the Astral state if your npc is hit,",
                                GRAY + " or you click the air with an empty hand"
                        ));
                    }


                    if (energy == Energy.Scratched) {
                        itemMeta.setCustomModelData(34);
                        itemMeta.setLore(Arrays.asList(
                                WHITE + "" + BOLD + "ᴍᴀɴᴀɢᴇ ᴛʜᴇ ᴛɪᴅᴇs ᴏғ ᴛʜᴇ ᴄᴏsᴍᴏs",
                                blissgems.colorize("#A01FFF") + " ",
                                GRAY + " ",
                                blissgems.colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                energystage,
                                GRAY + " " + blissgems.colorize("#A01FFF") + "🔮 " + GRAY + "10% of attacks will phase",
                                GRAY + " through you. Absorbing souls will heal you 2.5 hearts",
                                GRAY + " if mob, and 5 if player.",
                                GRAY + " Capture 2 mobs inside your gem, releasing ",
                                GRAY + " them in the opposite order they were captured.",
                                WHITE + "",
                                blissgems.colorize("#A01FFF") + BOLD + "ᴘᴏᴡᴇʀs",
                                WHITE + "\uD83D\uDD2A " + blissgems.colorize("#BFB8B8") + "ᴅᴀɢɢᴇʀs",
                                GRAY + "Shoot 5 daggers, if a player is hit with one ",
                                GRAY + " they take 3 hearts of damage and their gem is ",
                                GRAY + " disabled for 10 seconds for every dagger they're hit with.",
                                DARK_RED + "\uD83E\uDD3C " + GRAY + "Enter the body of that player, exit by crouching or",
                                GRAY + " when that player receives damage. Leaving the body",
                                GRAY + " will haunt them, disabling their gem for 10 seconds",
                                WHITE + "",
                                GRAY + "-" + WHITE + "\uD83D\uDC7B " + blissgems.colorize("#AABBBF") + "ᴀsᴛʀᴀʟ ᴘʀᴏᴊᴇᴄᴛɪᴏɴ",
                                GRAY + " Become a projection and explore in a 150 block ",
                                GRAY + " radius. Spook players by left clicking with your gem,",
                                GRAY + " or tag them with right click, tagging makes that player glow for you, ",
                                GRAY + " and everyone in your trust list.",
                                GRAY + " You exit the Astral state if your npc is hit,",
                                GRAY + " or you click the air with an empty hand"
                        ));
                    }

                    if (energy == Energy.Cracked) {
                        itemMeta.setCustomModelData(54);
                        itemMeta.setLore(Arrays.asList(
                                WHITE + "" + BOLD + "ᴍᴀɴᴀɢᴇ ᴛʜᴇ ᴛɪᴅᴇs ᴏғ ᴛʜᴇ ᴄᴏsᴍᴏs",
                                blissgems.colorize("#A01FFF") + " ",
                                GRAY + " ",
                                blissgems.colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                energystage,
                                GRAY + " " + blissgems.colorize("#A01FFF") + "🔮 " + "Absorbing souls will heal",
                                GRAY + " you 2.5 hearts if mob, 5 if player.",
                                GRAY + " Capture 2 mobs inside your gem, releasing ",
                                GRAY + " them in the opposite order they were captured.",
                                WHITE + "",
                                blissgems.colorize("#A01FFF") + BOLD + "ᴘᴏᴡᴇʀs",
                                WHITE + "\uD83D\uDD2A " + blissgems.colorize("#BFB8B8") + "ᴅᴀɢɢᴇʀs",
                                GRAY + "Shoot 5 daggers, if a player is hit with one ",
                                GRAY + " they take 3 hearts of damage and their gem is ",
                                GRAY + " disabled for 10 seconds for every dagger they're hit with.",
                                DARK_RED + "\uD83E\uDD3C " + GRAY + "Enter the body of that player, exit by crouching or",
                                GRAY + " when that player receives damage. Leaving the body",
                                GRAY + " will haunt them, disabling their gem for 10 seconds",
                                WHITE + "",
                                GRAY + "-" + WHITE + "\uD83D\uDC7B " + blissgems.colorize("#AABBBF") + "ᴀsᴛʀᴀʟ ᴘʀᴏᴊᴇᴄᴛɪᴏɴ",
                                GRAY + " Become a projection and explore in a 150 block ",
                                GRAY + " radius. Spook players by left clicking with your gem,",
                                GRAY + " or tag them with right click, tagging makes that player glow for you, ",
                                GRAY + " You exit the Astral state if your npc is hit,",
                                GRAY + " or you click the air with an empty hand"
                        ));
                    }

                    if (energy == Energy.Damaged) {
                        itemMeta.setCustomModelData(74);
                        itemMeta.setLore(Arrays.asList(
                                WHITE + "" + BOLD + "ᴍᴀɴᴀɢᴇ ᴛʜᴇ ᴛɪᴅᴇs ᴏғ ᴛʜᴇ ᴄᴏsᴍᴏs",
                                blissgems.colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                energystage,
                                GRAY + " " + blissgems.colorize("#A01FFF") + "🔮 " + GRAY + "No passives",
                                WHITE + "",
                                blissgems.colorize("#A01FFF") + BOLD + "ᴘᴏᴡᴇʀs",
                                WHITE + "\uD83D\uDD2A " + blissgems.colorize("#BFB8B8") + "ᴅᴀɢɢᴇʀs",
                                GRAY + "Shoot 5 daggers, if a player is hit with one ",
                                GRAY + " they take 3 hearts of damage and their gem is ",
                                GRAY + " disabled for 10 seconds for every dagger they're hit with.",
                                DARK_RED + "\uD83E\uDD3C " + GRAY + "Enter the body of that player, exit by crouching or",
                                GRAY + " when that player receives damage. Leaving the body",
                                GRAY + " will haunt them disabling their gem for 10 seconds",
                                WHITE + "",
                                GRAY + "-" + WHITE + "\uD83D\uDC7B " + blissgems.colorize("#AABBBF") + "ᴀsᴛʀᴀʟ ᴘʀᴏᴊᴇᴄᴛɪᴏɴ",
                                GRAY + " Become a projection and explore in a 150 block ",
                                GRAY + " radius. Spook players by left clicking with your gem,",
                                GRAY + " or tag them with right click, tagging makes that player glow for you, ",
                                GRAY + " You exit the Astral state if your npc is hit,",
                                GRAY + " or you click the air with an empty hand"
                        ));
                    }

                    if (energy == Energy.Ruined) {
                        itemMeta.setCustomModelData(94);
                        itemMeta.setLore(Arrays.asList(
                                WHITE + "" + BOLD + "ᴍᴀɴᴀɢᴇ ᴛʜᴇ ᴛɪᴅᴇs ᴏғ ᴛʜᴇ ᴄᴏsᴍᴏs",
                                blissgems.colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                energystage,
                                GRAY + " " + blissgems.colorize("#A01FFF") + "🔮 " + GRAY + "No passives",
                                WHITE + "",
                                blissgems.colorize("#A01FFF") + BOLD + "ᴘᴏᴡᴇʀs",
                                WHITE + "\uD83D\uDD2A " + blissgems.colorize("#BFB8B8") + "ᴅᴀɢɢᴇʀs",
                                GRAY + "Shoot 5 daggers, if a player is hit with one ",
                                GRAY + " they take 3 hearts of damage and their gem is ",
                                GRAY + " disabled for 10 seconds for every dagger they're hit with.",
                                DARK_RED + "\uD83E\uDD3C " + GRAY + "Enter the body of that player, exit by crouching or",
                                GRAY + " when that player receives damage. Leaving the body",
                                GRAY + " will haunt them disabling their gem for 10 seconds",
                                WHITE + "",
                                GRAY + "-" + WHITE + "\uD83D\uDC7B " + blissgems.colorize("#AABBBF") + "ᴀsᴛʀᴀʟ ᴘʀᴏᴊᴇᴄᴛɪᴏɴ",
                                GRAY + " Become a projection and explore in a 150 block ",
                                GRAY + " radius. Spook players by left clicking with your gem,",
                                GRAY + " or tag them with right click, tagging makes that player glow for you, ",
                                GRAY + " You exit the Astral state if your npc is hit,",
                                GRAY + " or you click the air with an empty hand"
                        ));
                    }


                    if (energy == Energy.Broken) {
                        itemMeta.setCustomModelData(96);
                        itemMeta.setLore(Arrays.asList(
                                WHITE + "" + BOLD + "ᴜsᴇʟᴇss"
                        ));
                    }
                    item.setItemMeta(itemMeta);
                    return item;
                }


                if (season == 3) {


                    ItemStack item = new ItemStack(Material.PRISMARINE_SHARD, 1);
                    ItemMeta itemMeta = item.getItemMeta();


                    NamespacedKey idkey = new NamespacedKey(blissgems.getInstance(), "gem-id");
                    itemMeta.getPersistentDataContainer().set(idkey, PersistentDataType.STRING, "035f2f4a-0070-40d2-9bb2-3b38c4208bcf");

                    NamespacedKey tierkey = new NamespacedKey(blissgems.getInstance(), "gem-tier");
                    itemMeta.getPersistentDataContainer().set(tierkey, PersistentDataType.INTEGER, tier);

                    NamespacedKey typekey = new NamespacedKey(blissgems.getInstance(), "gem-type");
                    itemMeta.getPersistentDataContainer().set(typekey, PersistentDataType.STRING, "astra");

                    NamespacedKey quicknodropkey = new NamespacedKey(blissgems.getInstance(), "quick-no-drop");
                    itemMeta.getPersistentDataContainer().set(quicknodropkey, PersistentDataType.INTEGER, quicknodrop);

                    NamespacedKey quicknoremovekey = new NamespacedKey(blissgems.getInstance(), "quick-no-remove");
                    itemMeta.getPersistentDataContainer().set(quicknoremovekey, PersistentDataType.INTEGER, quicknoremove);


                    itemMeta.setDisplayName(blissgems.colorize("#A01FFF") + BOLD + "ᴀsᴛʀᴀ " + blissgems.colorize("#FFD773") + "ɢᴇᴍ");
                    for (ItemFlag flag : ItemFlag.values()) itemMeta.addItemFlags(flag);

                    if (Gem.isPristineorHigher(energy) || energy == Energy.Scratched) {
                        if (energy == Energy.Pristine_5) itemMeta.addEnchant(Enchantment.DURABILITY, 1, true);
                        if (energy == Energy.Scratched) itemMeta.setCustomModelData(34);
                        else itemMeta.setCustomModelData(14);
                        String gemthingylols = "🔮 ";
                        if (energy == Energy.Scratched)
                            gemthingylols = "\uD83D\uDD3A ";
                        itemMeta.setLore(Arrays.asList(
                                WHITE + "" + BOLD + "ᴍᴀɴᴀɢᴇ ᴛʜᴇ ᴛɪᴅᴇs ᴏғ ᴛʜᴇ ᴄᴏsᴍᴏs ",
                                blissgems.colorize("&f(") + energystage + blissgems.colorize("&7)"),
                                blissgems.colorize("#A01FFF") + gemthingylols + blissgems.colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                GRAY + "- Phasing",
                                GRAY + "- Soul Healing",
                                GRAY + "- Soul Capture",
                                blissgems.colorize("#A01FFF") + " ",
                                GRAY + " ",
                                blissgems.colorize("#A01FFF") + "🔮" + " " + blissgems.colorize("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                                GRAY + "- " + blissgems.colorize("#A01FFF") + "Dimensional Drift",
                                WHITE + "",
                                blissgems.colorize("#A01FFF") + "🔮 " + blissgems.colorize("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                                GRAY + "- " + WHITE + "🔪 " + blissgems.colorize("#BFB8B8") + "ᴅᴀɢɢᴇʀs " + DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                                GRAY + "- " + WHITE + "🔪 " + GRAY + "ᴜɴʙᴏᴜɴᴅᴇᴅ " + DARK_RED + "\uD83E\uDD3C",
                                WHITE + "",
                                GRAY + "- " + WHITE + "👻 " + blissgems.colorize("#AABBBF") + "ᴀsᴛʀᴀʟ ᴘʀᴏᴊᴇᴄᴛɪᴏɴ " + GREEN + "\uD83E\uDDD1\uD83C\uDFFB",
                                GRAY + "- " + WHITE + "👻 " + blissgems.colorize("#AABBBF") + "ᴀsᴛʀᴀʟ ᴠᴏɪᴅ " + GREEN + "\uD83E\uDD3C"
                        ));
                    }

                    if (energy == Energy.Cracked) {
                        itemMeta.setCustomModelData(54);
                        itemMeta.setLore(Arrays.asList(
                                WHITE + "" + BOLD + "ᴍᴀɴᴀɢᴇ ᴛʜᴇ ᴛɪᴅᴇs ᴏғ ᴛʜᴇ ᴄᴏsᴍᴏs ",
                                blissgems.colorize("&f(") + energystage + blissgems.colorize("&7)"),
                                blissgems.colorize("#A01FFF") + "🔮 " + blissgems.colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                GRAY + "- Soul Healing",
                                GRAY + "- Soul Capture",
                                blissgems.colorize("#A01FFF") + " ",
                                GRAY + " ",
                                blissgems.colorize("#A01FFF") + "🔮" + " " + blissgems.colorize("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                                GRAY + "- " + blissgems.colorize("#A01FFF") + "Dimensional Drift",
                                WHITE + "",
                                blissgems.colorize("#A01FFF") + "🔮 " + blissgems.colorize("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                                GRAY + "- " + WHITE + "🔪 " + blissgems.colorize("#BFB8B8") + "ᴅᴀɢɢᴇʀs " + DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                                GRAY + "- " + WHITE + "🔪 " + GRAY + "ᴜɴʙᴏᴜɴᴅᴇᴅ " + DARK_RED + "\uD83E\uDD3C",
                                WHITE + "",
                                GRAY + "- " + WHITE + "👻 " + blissgems.colorize("#AABBBF") + "ᴀsᴛʀᴀʟ ᴘʀᴏᴊᴇᴄᴛɪᴏɴ " + GREEN + "\uD83E\uDDD1\uD83C\uDFFB",
                                GRAY + "- " + WHITE + "👻 " + blissgems.colorize("#AABBBF") + "ᴀsᴛʀᴀʟ ᴠᴏɪᴅ " + GREEN + "\uD83E\uDD3C"
                        ));
                    }

                    if (energy == Energy.Damaged) {
                        itemMeta.setCustomModelData(74);
                        itemMeta.setLore(Arrays.asList(
                                WHITE + "" + BOLD + "ᴍᴀɴᴀɢᴇ ᴛʜᴇ ᴛɪᴅᴇs ᴏғ ᴛʜᴇ ᴄᴏsᴍᴏs ",
                                blissgems.colorize("&f(") + energystage + blissgems.colorize("&7)"),
                                blissgems.colorize("#A01FFF") + " ",
                                blissgems.colorize("#A01FFF") + "\uD83D\uDD3A " + blissgems.colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                GRAY + "- Phasing",
                                GRAY + "- Soul Healing",
                                GRAY + " ",
                                blissgems.colorize("#A01FFF") + "🔮" + " " + blissgems.colorize("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                                GRAY + "- " + blissgems.colorize("#A01FFF") + "Dimensional Drift",
                                WHITE + "",
                                blissgems.colorize("#A01FFF") + "🔮 " + blissgems.colorize("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                                GRAY + "- " + WHITE + "🔪 " + blissgems.colorize("#BFB8B8") + "ᴅᴀɢɢᴇʀs " + DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                                GRAY + "- " + WHITE + "🔪 " + GRAY + "ᴜɴʙᴏᴜɴᴅᴇᴅ " + DARK_RED + "\uD83E\uDD3C",
                                WHITE + "",
                                GRAY + "- " + WHITE + "👻 " + blissgems.colorize("#AABBBF") + "ᴀsᴛʀᴀʟ ᴘʀᴏᴊᴇᴄᴛɪᴏɴ " + GREEN + "\uD83E\uDDD1\uD83C\uDFFB",
                                GRAY + "- " + WHITE + "👻 " + blissgems.colorize("#AABBBF") + "ᴀsᴛʀᴀʟ ᴠᴏɪᴅ " + GREEN + "\uD83E\uDD3C"
                        ));
                    }

                    if (energy == Energy.Ruined) {
                        itemMeta.setCustomModelData(94);
                        itemMeta.setLore(Arrays.asList(
                                WHITE + "" + BOLD + "ᴍᴀɴᴀɢᴇ ᴛʜᴇ ᴛɪᴅᴇs ᴏғ ᴛʜᴇ ᴄᴏsᴍᴏs ",
                                blissgems.colorize("&f(") + energystage + blissgems.colorize("&7)"),
                                blissgems.colorize("#A01FFF") + " ",
                                blissgems.colorize("#A01FFF") + "🔮 " + blissgems.colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                GRAY + "No Passives",
                                GRAY + " ",
                                blissgems.colorize("#A01FFF") + "🔮" + " " + blissgems.colorize("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                                GRAY + "- " + blissgems.colorize("#A01FFF") + "Dimensional Drift",
                                WHITE + "",
                                blissgems.colorize("#A01FFF") + "🔮 " + blissgems.colorize("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                                GRAY + "- " + WHITE + "🔪 " + blissgems.colorize("#BFB8B8") + "ᴅᴀɢɢᴇʀs " + DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                                GRAY + "- " + WHITE + "🔪 " + GRAY + "ᴜɴʙᴏᴜɴᴅᴇᴅ " + DARK_RED + "\uD83E\uDD3C",
                                WHITE + "",
                                GRAY + "- " + WHITE + "👻 " + blissgems.colorize("#AABBBF") + "ᴀsᴛʀᴀʟ ᴘʀᴏᴊᴇᴄᴛɪᴏɴ " + GREEN + "\uD83E\uDDD1\uD83C\uDFFB",
                                GRAY + "- " + WHITE + "👻 " + blissgems.colorize("#AABBBF") + "ᴀsᴛʀᴀʟ ᴠᴏɪᴅ " + GREEN + "\uD83E\uDD3C"
                        ));
                    }


                    if (energy == Energy.Broken) {
                        itemMeta.setCustomModelData(100);
                        for (ItemFlag flag : ItemFlag.values()) itemMeta.addItemFlags(flag);
                        itemMeta.setLore(Arrays.asList(
                                WHITE + "" + BOLD + "ᴜsᴇʟᴇss"
                        ));
                    }
                    item.setItemMeta(itemMeta);
                    return item;
                }
            }


            //Flux

            if (gem == GemType.Flux) if (season == 3) {


                ItemStack item = new ItemStack(Material.PRISMARINE_SHARD, 1);
                ItemMeta itemMeta = item.getItemMeta();


                NamespacedKey idkey = new NamespacedKey(blissgems.getInstance(), "gem-id");
                itemMeta.getPersistentDataContainer().set(idkey, PersistentDataType.STRING, "fb1c4eab-dfae-4302-9441-47026b6d33ae");

                NamespacedKey tierkey = new NamespacedKey(blissgems.getInstance(), "gem-tier");
                itemMeta.getPersistentDataContainer().set(tierkey, PersistentDataType.INTEGER, tier);

                NamespacedKey typekey = new NamespacedKey(blissgems.getInstance(), "gem-type");
                itemMeta.getPersistentDataContainer().set(typekey, PersistentDataType.STRING, "flux");

                NamespacedKey quicknodropkey = new NamespacedKey(blissgems.getInstance(), "quick-no-drop");
                itemMeta.getPersistentDataContainer().set(quicknodropkey, PersistentDataType.INTEGER, quicknodrop);

                NamespacedKey quicknoremovekey = new NamespacedKey(blissgems.getInstance(), "quick-no-remove");
                itemMeta.getPersistentDataContainer().set(quicknoremovekey, PersistentDataType.INTEGER, quicknoremove);


                itemMeta.setDisplayName(blissgems.colorize("#5ED7FF") + BOLD + "ғʟᴜx " + blissgems.colorize("#FFD773") + "ɢᴇᴍ");
                for (ItemFlag flag : ItemFlag.values()) itemMeta.addItemFlags(flag);

                if (Gem.isPristineorHigher(energy)) {
                    if (energy == Energy.Pristine_5) itemMeta.addEnchant(Enchantment.DURABILITY, 1, true);

                    itemMeta.setCustomModelData(16);
                    itemMeta.setLore(Arrays.asList(
                            WHITE + "" + BOLD + "ᴇᴠᴇʀʏᴛʜɪɴɢ ɪs ᴀ ғʟᴜᴄᴛᴜᴀᴛɪᴏɴ",
                            blissgems.colorize("&f(") + energystage + blissgems.colorize("&7) "),
                            blissgems.colorize("#03EAFF") + "🔮 " + blissgems.colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                            GRAY + "- Flow State",
                            GRAY + "- Shocking Chance",
                            GRAY + "- Tireless",
                            GRAY + "- Conduction",
                            GRAY + "- Charged",
                            WHITE + " ",
                            blissgems.colorize("#03EAFF") + "🔮 " + blissgems.colorize("#82F3FF") + BOLD + " ᴀʙɪʟɪᴛʏ",
                            GRAY + "- " + blissgems.colorize("#03EAFF") + "Kinetic Burst",
                            WHITE + "",
                            blissgems.colorize("#03EAFF") + "🔮 " + blissgems.colorize("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                            GRAY + "- ☄ " + blissgems.colorize("#03EAFF") + "ᴇɴᴇʀɢʏ ʙᴇᴀᴍ " + DARK_RED + "🧑🏻",
                            GRAY + "- ☄ " + blissgems.colorize("#03EAFF") + "ɢʀᴏᴜɴᴅ " + GRAY + " " + DARK_RED + "🤼",
                            WHITE + "",
                            GRAY + "- 🌀 " + blissgems.colorize("#03EAFF") + "Kinetic Overdrive " + GREEN + "🤼"
                    ));
                }

                if (energy == Energy.Scratched) {
                    itemMeta.setCustomModelData(36);
                    itemMeta.setLore(Arrays.asList(
                            WHITE + "" + BOLD + "ᴇᴠᴇʀʏᴛʜɪɴɢ ɪs ᴀ ғʟᴜᴄᴛᴜᴀᴛɪᴏɴ",
                            blissgems.colorize("&f(") + energystage + blissgems.colorize("&7) "),
                            blissgems.colorize("#03EAFF") + "🔮 " + blissgems.colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                            GRAY + "- Flow State",
                            GRAY + "- Shocking Chance",
                            GRAY + "- Conduction",
                            WHITE + " ",
                            blissgems.colorize("#03EAFF") + "🔮 " + blissgems.colorize("#82F3FF") + BOLD + " ᴀʙɪʟɪᴛʏ",
                            GRAY + "- " + blissgems.colorize("#03EAFF") + "Kinetic Burst",
                            WHITE + "",
                            blissgems.colorize("#03EAFF") + "🔮 " + blissgems.colorize("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                            GRAY + "- ☄ " + blissgems.colorize("#03EAFF") + "ᴇɴᴇʀɢʏ ʙᴇᴀᴍ " + DARK_RED + "🧑🏻",
                            GRAY + "- ☄ " + blissgems.colorize("#03EAFF") + "ɢʀᴏᴜɴᴅ " + GRAY + " " + DARK_RED + "🤼",
                            WHITE + "",
                            GRAY + "- 🌀 " + blissgems.colorize("#03EAFF") + "Kinetic Overdrive " + GREEN + "🤼"
                    ));
                }

                if (energy == Energy.Cracked) {
                    itemMeta.setCustomModelData(56);
                    itemMeta.setLore(Arrays.asList(
                            WHITE + "" + BOLD + "ᴇᴠᴇʀʏᴛʜɪɴɢ ɪs ᴀ ғʟᴜᴄᴛᴜᴀᴛɪᴏɴ",
                            blissgems.colorize("&f(") + energystage + blissgems.colorize("&7) "),
                            blissgems.colorize("#03EAFF") + "🔮 " + blissgems.colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                            GRAY + "- Flow State",
                            GRAY + "- Shocking Chance",
                            WHITE + " ",
                            blissgems.colorize("#03EAFF") + "🔮 " + blissgems.colorize("#82F3FF") + BOLD + " ᴀʙɪʟɪᴛʏ",
                            GRAY + "- " + blissgems.colorize("#03EAFF") + "Kinetic Burst",
                            WHITE + "",
                            blissgems.colorize("#03EAFF") + "🔮 " + blissgems.colorize("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                            GRAY + "- ☄ " + blissgems.colorize("#03EAFF") + "ᴇɴᴇʀɢʏ ʙᴇᴀᴍ " + DARK_RED + "🧑🏻",
                            GRAY + "- ☄ " + blissgems.colorize("#03EAFF") + "ɢʀᴏᴜɴᴅ " + GRAY + " " + DARK_RED + "🤼",
                            WHITE + "",
                            GRAY + "- 🌀 " + blissgems.colorize("#03EAFF") + "Kinetic Overdrive " + GREEN + "🤼"
                    ));
                }

                if (energy == Energy.Damaged) {
                    itemMeta.setCustomModelData(76);
                    itemMeta.setLore(Arrays.asList(
                            WHITE + "" + BOLD + "ᴇᴠᴇʀʏᴛʜɪɴɢ ɪs ᴀ ғʟᴜᴄᴛᴜᴀᴛɪᴏɴ",
                            blissgems.colorize("&f(") + energystage + blissgems.colorize("&7) "),
                            blissgems.colorize("#03EAFF") + "🔮 " + blissgems.colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                            GRAY + "- Flow State",
                            WHITE + " ",
                            blissgems.colorize("#03EAFF") + "🔮 " + blissgems.colorize("#82F3FF") + BOLD + " ᴀʙɪʟɪᴛʏ",
                            GRAY + "- " + blissgems.colorize("#03EAFF") + "Kinetic Burst",
                            WHITE + "",
                            blissgems.colorize("#03EAFF") + "🔮 " + blissgems.colorize("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                            GRAY + "- ☄ " + blissgems.colorize("#03EAFF") + "ᴇɴᴇʀɢʏ ʙᴇᴀᴍ " + DARK_RED + "🧑🏻",
                            GRAY + "- ☄ " + blissgems.colorize("#03EAFF") + "ɢʀᴏᴜɴᴅ " + GRAY + " " + DARK_RED + "🤼",
                            WHITE + "",
                            GRAY + "- 🌀 " + blissgems.colorize("#03EAFF") + "Kinetic Overdrive " + GREEN + "🤼"
                    ));
                }

                if (energy == Energy.Ruined) {
                    itemMeta.setCustomModelData(96);
                    itemMeta.setLore(Arrays.asList(
                            WHITE + "" + BOLD + "ᴇᴠᴇʀʏᴛʜɪɴɢ ɪs ᴀ ғʟᴜᴄᴛᴜᴀᴛɪᴏɴ",
                            blissgems.colorize("&f(") + energystage + blissgems.colorize("&7) "),
                            blissgems.colorize("#03EAFF") + "🔮 " + blissgems.colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                            GRAY + "No Passives",
                            WHITE + " ",
                            blissgems.colorize("#03EAFF") + "🔮 " + blissgems.colorize("#82F3FF") + BOLD + " ᴀʙɪʟɪᴛʏ",
                            GRAY + "- " + blissgems.colorize("#03EAFF") + "Kinetic Burst",
                            WHITE + "",
                            blissgems.colorize("#03EAFF") + "🔮 " + blissgems.colorize("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                            GRAY + "- ☄ " + blissgems.colorize("#03EAFF") + "ᴇɴᴇʀɢʏ ʙᴇᴀᴍ " + DARK_RED + "🧑🏻",
                            GRAY + "- ☄ " + blissgems.colorize("#03EAFF") + "ɢʀᴏᴜɴᴅ " + GRAY + " " + DARK_RED + "🤼",
                            WHITE + "",
                            GRAY + "- 🌀 " + blissgems.colorize("#03EAFF") + "Kinetic Overdrive " + GREEN + "🤼"
                    ));
                }


                if (energy == Energy.Broken) {
                    itemMeta.setCustomModelData(100);
                    for (ItemFlag flag : ItemFlag.values()) itemMeta.addItemFlags(flag);
                    itemMeta.setLore(Arrays.asList(
                            WHITE + "" + BOLD + "ᴜsᴇʟᴇss"
                    ));
                }
                item.setItemMeta(itemMeta);
                return item;
            }

            if (gem == GemType.Fire) {
                if (season == 1) {
                    ItemStack item = new ItemStack(Material.PRISMARINE_SHARD, 1);
                    ItemMeta itemMeta = item.getItemMeta();


                    NamespacedKey idkey = new NamespacedKey(blissgems.getInstance(), "shard_id");
                    itemMeta.getPersistentDataContainer().set(idkey, PersistentDataType.STRING, UUID.randomUUID().toString());

                    itemMeta.setDisplayName(blissgems.colorize("#FE8120") + BOLD + "Fire " + blissgems.colorize("#FFD773") + "Gem");


                    // Set HideFlags to 127 if server is lower than 1.20.6, if yes: then hide all flags.
                    // due to the nbt change, it is not possible to make everything 1-1 for people using 1.20.6 and higher.

                    if (VersionChecker.OlderThanNBTChange()) itemMeta.addItemFlags(
                            ItemFlag.HIDE_ENCHANTS,
                            ItemFlag.HIDE_ATTRIBUTES,
                            ItemFlag.HIDE_UNBREAKABLE,
                            ItemFlag.HIDE_DESTROYS,
                            ItemFlag.HIDE_PLACED_ON,
                            ItemFlag.HIDE_POTION_EFFECTS,
                            ItemFlag.HIDE_DYE);
                    else for (ItemFlag flag : ItemFlag.values()) itemMeta.addItemFlags(flag);


                    itemMeta.setCustomModelData(2);
                    itemMeta.setLore(Arrays.asList(

                            WHITE + "" + BOLD + "Control fire and become fire",
                            blissgems.colorize("#FFE4AB") + "Passives",
                            GRAY + " " + blissgems.colorize("#FE8120") + "🔮 Auto Smelting Longer FireThorns",
                            GRAY + " Fire Aspect 2, Flame",
                            WHITE + " ",
                            blissgems.colorize("#B8FFFB") + BOLD + "Powers",
                            GRAY + "-" + WHITE + "\uD83E\uDDE8 " + blissgems.colorize("#FF5F33") + "Fireball",
                            GRAY + " Spawns a fireball that charges up",
                            GRAY + " when on obsidian, lava, fire, netherack",
                            GRAY + " and magma, when fully charged can one shot",
                            GRAY + " protection 4 netherite players",
                            WHITE + "",
                            GRAY + "-" + WHITE + "\uD83E\uDD7E " + blissgems.colorize("#248FD1") + "Cozy Campfire",
                            GRAY + " Spawns a campfire that heals when near it"
                    ));

                    item.setItemMeta(itemMeta);
                    return item;
                }


                if (season == 2) {


                    ItemStack item = new ItemStack(Material.PRISMARINE_SHARD, 1);
                    ItemMeta itemMeta = item.getItemMeta();


                    NamespacedKey idkey = new NamespacedKey(blissgems.getInstance(), "gem-id");
                    itemMeta.getPersistentDataContainer().set(idkey, PersistentDataType.STRING, UUID.randomUUID().toString());

                    NamespacedKey tierkey = new NamespacedKey(blissgems.getInstance(), "gem-tier");
                    itemMeta.getPersistentDataContainer().set(tierkey, PersistentDataType.INTEGER, tier);

                    NamespacedKey typekey = new NamespacedKey(blissgems.getInstance(), "gem-type");
                    itemMeta.getPersistentDataContainer().set(typekey, PersistentDataType.STRING, "fire");

                    NamespacedKey quicknodropkey = new NamespacedKey(blissgems.getInstance(), "quick-no-drop");
                    itemMeta.getPersistentDataContainer().set(quicknodropkey, PersistentDataType.INTEGER, quicknodrop);

                    NamespacedKey quicknoremovekey = new NamespacedKey(blissgems.getInstance(), "quick-no-remove");
                    itemMeta.getPersistentDataContainer().set(quicknoremovekey, PersistentDataType.INTEGER, quicknoremove);


                    itemMeta.setDisplayName(blissgems.colorize("#FE8120") + BOLD + "ғɪʀᴇ " + blissgems.colorize("#FFD773") + "ɢᴇᴍ");
                    for (ItemFlag flag : ItemFlag.values()) itemMeta.addItemFlags(flag);

                    if (Gem.isPristineorHigher(energy)) {
                        if (energy == Energy.Pristine_5) itemMeta.addEnchant(Enchantment.DURABILITY, 1, true);

                        itemMeta.setCustomModelData(2);
                        itemMeta.setLore(Arrays.asList(
                                WHITE + "" + BOLD + "ᴍᴀɴɪᴘᴜʟᴀᴛᴇ ғɪʀᴇ",
                                blissgems.colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                energystage,
                                GRAY + " " + blissgems.colorize("#FE8120") + "🔮 " + GRAY + "Auto Smelting. Longer FireThorns.",
                                GRAY + " Auto Enchant Flame & Fire Aspect 2",
                                WHITE + " ",
                                blissgems.colorize("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                                GRAY + "-" + WHITE + "\uD83E\uDDE8" + blissgems.colorize("#FF5F33") + " ғɪʀᴇʙᴀʟʟ",
                                GRAY + " Spawn a fireball that charges up passively,",
                                GRAY + " while standing on fire blocks, charge 2x faster.",
                                GRAY + " Deals more damage the more you charge it.",
                                WHITE + "",
                                GRAY + "-" + WHITE + "\uD83E\uDD7E " + blissgems.colorize("#248FD1") + "ᴄᴏᴢʏ Cᴀᴍᴘғɪʀᴇ",
                                GRAY + " Spawn a campfire that heals 2 hearts and hunger",
                                GRAY + " a second in a 4 block radius"
                        ));
                    }

                    if (energy == Energy.Scratched) {
                        itemMeta.setCustomModelData(22);
                        itemMeta.setLore(Arrays.asList(
                                WHITE + "" + BOLD + "ᴍᴀɴɪᴘᴜʟᴀᴛᴇ ғɪʀᴇ",
                                blissgems.colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                energystage,
                                GRAY + " " + blissgems.colorize("#FE8120") + "🔮 " + "Longer FireThorns. Fire Res.",
                                GRAY + " Auto Enchant Flame & Fire Aspect 2",
                                WHITE + " ",
                                blissgems.colorize("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                                GRAY + "-" + WHITE + "\uD83E\uDDE8" + blissgems.colorize("#FF5F33") + " ғɪʀᴇʙᴀʟʟ",
                                GRAY + " Spawn a fireball that charges up passively,",
                                GRAY + " while standing on fire blocks charge 2x faster.",
                                GRAY + " Deals more damage the more you charge it.",
                                WHITE + "",
                                GRAY + "-" + WHITE + "\uD83E\uDD7E " + blissgems.colorize("#248FD1") + "ᴄᴏᴢʏ Cᴀᴍᴘғɪʀᴇ",
                                GRAY + " Spawn a campfire that heals 2 hearts and hunger",
                                GRAY + " a second in a 4 block radius"
                        ));
                    }

                    if (energy == Energy.Cracked) {
                        itemMeta.setCustomModelData(42);
                        itemMeta.setLore(Arrays.asList(
                                WHITE + "" + BOLD + "ᴍᴀɴɪᴘᴜʟᴀᴛᴇ ғɪʀᴇ",
                                blissgems.colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                energystage,
                                GRAY + " " + blissgems.colorize("#FE8120") + "🔮 " + "Fire Res.",
                                GRAY + " Auto Enchant Flame & Fire Aspect",
                                WHITE + " ",
                                blissgems.colorize("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                                GRAY + "-" + WHITE + "\uD83E\uDDE8" + blissgems.colorize("#FF5F33") + " ғɪʀᴇʙᴀʟʟ",
                                GRAY + " Spawn a fireball that charges up passively,",
                                GRAY + " while standing on fire blocks charge 2x faster.",
                                GRAY + " Deals more damage the more you charge it.",
                                WHITE + "",
                                GRAY + "-" + WHITE + "\uD83E\uDD7E " + blissgems.colorize("#248FD1") + "ᴄᴏᴢʏ Cᴀᴍᴘғɪʀᴇ",
                                GRAY + " Spawn a campfire that heals 2 hearts and hunger",
                                GRAY + " a second in a 4 block radius"
                        ));
                    }

                    if (energy == Energy.Damaged) {
                        itemMeta.setCustomModelData(62);
                        itemMeta.setLore(Arrays.asList(
                                WHITE + "" + BOLD + "ᴍᴀɴɪᴘᴜʟᴀᴛᴇ ғɪʀᴇ",
                                blissgems.colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                energystage,
                                GRAY + " " + blissgems.colorize("#FE8120") + "🔮 " + "Auto Enchant Flame",
                                WHITE + " ",
                                blissgems.colorize("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                                GRAY + "-" + WHITE + "\uD83E\uDDE8" + blissgems.colorize("#FF5F33") + " ғɪʀᴇʙᴀʟʟ",
                                GRAY + " Spawn a fireball that charges up passively,",
                                GRAY + " while standing on fire blocks charge 2x faster.",
                                GRAY + " Deals more damage the more you charge it",
                                WHITE + "",
                                GRAY + "-" + WHITE + "\uD83E\uDD7E " + blissgems.colorize("#248FD1") + "ᴄᴏᴢʏ Cᴀᴍᴘғɪʀᴇ",
                                GRAY + " Spawn a campfire that heals 2 hearts and hunger",
                                GRAY + " a second in a 4 block radius"
                        ));
                    }

                    if (energy == Energy.Ruined) {
                        itemMeta.setCustomModelData(82);
                        itemMeta.setLore(Arrays.asList(
                                WHITE + "" + BOLD + "ᴍᴀɴɪᴘᴜʟᴀᴛᴇ ғɪʀᴇ",
                                blissgems.colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                energystage,
                                GRAY + " " + blissgems.colorize("#FE8120") + "🔮 " + "No passives",
                                WHITE + " ",
                                blissgems.colorize("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                                GRAY + "-" + WHITE + "\uD83E\uDDE8" + blissgems.colorize("#FF5F33") + " ғɪʀᴇʙᴀʟʟ",
                                GRAY + " Spawn a fireball that charges up passively,",
                                GRAY + " while standing on fire blocks charge 2x faster.",
                                GRAY + " Deals more damage the more you charge it",
                                WHITE + "",
                                GRAY + "-" + WHITE + "\uD83E\uDD7E " + blissgems.colorize("#248FD1") + "ᴄᴏᴢʏ Cᴀᴍᴘғɪʀᴇ",
                                GRAY + " Spawn a campfire that heals 2 hearts and hunger",
                                GRAY + " a second in a 4 block radius"
                        ));
                    }


                    if (energy == Energy.Broken) {
                        itemMeta.setCustomModelData(96);
                        itemMeta.setLore(Arrays.asList(
                                WHITE + "" + BOLD + "ᴜsᴇʟᴇss"
                        ));
                    }
                    item.setItemMeta(itemMeta);
                    return item;
                }
                if (season == 3) {

                    ItemStack item = new ItemStack(Material.PRISMARINE_SHARD, 1);
                    ItemMeta itemMeta = item.getItemMeta();


                    NamespacedKey idkey = new NamespacedKey(blissgems.getInstance(), "gem-id");
                    itemMeta.getPersistentDataContainer().set(idkey, PersistentDataType.STRING, "f3580015-6d14-4cfb-bd46-2eef14ce75e7");

                    NamespacedKey tierkey = new NamespacedKey(blissgems.getInstance(), "gem-tier");
                    itemMeta.getPersistentDataContainer().set(tierkey, PersistentDataType.INTEGER, tier);

                    NamespacedKey typekey = new NamespacedKey(blissgems.getInstance(), "gem-type");
                    itemMeta.getPersistentDataContainer().set(typekey, PersistentDataType.STRING, "fire");

                    NamespacedKey quicknodropkey = new NamespacedKey(blissgems.getInstance(), "quick-no-drop");
                    itemMeta.getPersistentDataContainer().set(quicknodropkey, PersistentDataType.INTEGER, quicknodrop);

                    NamespacedKey quicknoremovekey = new NamespacedKey(blissgems.getInstance(), "quick-no-remove");
                    itemMeta.getPersistentDataContainer().set(quicknoremovekey, PersistentDataType.INTEGER, quicknoremove);

                    for (ItemFlag flag : ItemFlag.values()) itemMeta.addItemFlags(flag);
                    itemMeta.setDisplayName(blissgems.colorize("#FE8120") + BOLD + "ғɪʀᴇ " + blissgems.colorize("#FFD773") + "ɢᴇᴍ");
                    if (Gem.isPristineorHigher(energy)) {
                        if (energy == Energy.Pristine_5) itemMeta.addEnchant(Enchantment.DURABILITY, 1, true);

                        itemMeta.setCustomModelData(2);

                        String ending = blissgems.colorize("&f)");
                        if (energy == Energy.Pristine_1 || energy == Energy.Pristine_2 || energy == Energy.Pristine_3 || energy == Energy.Pristine_4 || energy == Energy.Pristine_5)
                            ending = ")";

                        itemMeta.setLore(Arrays.asList(
                                WHITE + "" + BOLD + "ᴍᴀɴɪᴘᴜʟᴀᴛᴇ ғɪʀᴇ",
                                blissgems.colorize("&f(") + energystage + ending,
                                WHITE + "",
                                blissgems.colorize("#FE8120") + "🔮 " + blissgems.colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                GRAY + "- Fire Resistance",
                                GRAY + "- Autosmelt",
                                GRAY + "- Flamestrike",
                                GRAY + "- Fireshot",
                                WHITE + " ",
                                blissgems.colorize("#FE8120") + "🔮 " + blissgems.colorize("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                                GRAY + "- " + blissgems.colorize("#FE8120") + "Crisp",
                                WHITE + "",
                                blissgems.colorize("#FE8120") + "🔮 " + blissgems.colorize("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                                GRAY + "-" + WHITE + "🧨" + blissgems.colorize("#FF5F33") + " ғɪʀᴇʙᴀʟʟ " + DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                                GRAY + "-" + WHITE + "🧨" + blissgems.colorize("#FF5F33") + " ᴍᴇᴛᴇᴏʀ sʜᴏᴡᴇʀ " + DARK_RED + "\uD83E\uDD3C",
                                WHITE + "",
                                GRAY + "-" + WHITE + "🥾 " + blissgems.colorize("#248FD1") + "ᴄᴏᴢʏ Cᴀᴍᴘғɪʀᴇ"
                        ));
                    }


                    if (energy == Energy.Scratched) {
                        itemMeta.setCustomModelData(22);
                        itemMeta.setLore(Arrays.asList(
                                WHITE + "" + BOLD + "ᴍᴀɴɪᴘᴜʟᴀᴛᴇ ғɪʀᴇ",
                                blissgems.colorize("&f(") + energystage + blissgems.colorize("&f)"),
                                WHITE + "",
                                blissgems.colorize("#FE8120") + "🔮 " + blissgems.colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                GRAY + "- Fire Resistance",
                                GRAY + "- Flamestrike",
                                GRAY + "- Fireshot",
                                WHITE + " ",
                                blissgems.colorize("#FE8120") + "🔮 " + blissgems.colorize("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                                GRAY + "- " + blissgems.colorize("#FE8120") + "Crisp",
                                WHITE + "",
                                blissgems.colorize("#FE8120") + "🔮 " + blissgems.colorize("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                                GRAY + "-" + WHITE + "🧨" + blissgems.colorize("#FF5F33") + " ғɪʀᴇʙᴀʟʟ " + DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                                GRAY + "-" + WHITE + "🧨" + blissgems.colorize("#FF5F33") + " ᴍᴇᴛᴇᴏʀ sʜᴏᴡᴇʀ " + DARK_RED + "\uD83E\uDD3C",
                                WHITE + "",
                                GRAY + "-" + WHITE + "🥾 " + blissgems.colorize("#248FD1") + "ᴄᴏᴢʏ Cᴀᴍᴘғɪʀᴇ"
                        ));
                    }

                    if (energy == Energy.Cracked) {
                        itemMeta.setCustomModelData(42);
                        itemMeta.setLore(Arrays.asList(
                                WHITE + "" + BOLD + "ᴍᴀɴɪᴘᴜʟᴀᴛᴇ ғɪʀᴇ",
                                blissgems.colorize("&f(") + energystage + blissgems.colorize("&f)"),
                                WHITE + "",
                                blissgems.colorize("#FE8120") + "🔮 " + blissgems.colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                GRAY + "- Fire Resistance",
                                GRAY + "- Flamestrike",
                                GRAY + "- Fireshot",
                                WHITE + " ",
                                blissgems.colorize("#FE8120") + "🔮 " + blissgems.colorize("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                                GRAY + "- " + blissgems.colorize("#FE8120") + "Crisp",
                                WHITE + "",
                                blissgems.colorize("#FE8120") + "🔮 " + blissgems.colorize("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                                GRAY + "-" + WHITE + "🧨" + blissgems.colorize("#FF5F33") + " ғɪʀᴇʙᴀʟʟ " + DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                                GRAY + "-" + WHITE + "🧨" + blissgems.colorize("#FF5F33") + " ᴍᴇᴛᴇᴏʀ sʜᴏᴡᴇʀ " + DARK_RED + "\uD83E\uDD3C",
                                WHITE + "",
                                GRAY + "-" + WHITE + "🥾 " + blissgems.colorize("#248FD1") + "ᴄᴏᴢʏ Cᴀᴍᴘғɪʀᴇ"
                        ));
                    }


                    if (energy == Energy.Damaged) {
                        itemMeta.setCustomModelData(62);
                        itemMeta.setLore(Arrays.asList(
                                WHITE + "" + BOLD + "ᴍᴀɴɪᴘᴜʟᴀᴛᴇ ғɪʀᴇ",
                                blissgems.colorize("&f(") + energystage + blissgems.colorize("&f)"),
                                WHITE + "",
                                blissgems.colorize("#FE8120") + "🔮 " + blissgems.colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                GRAY + "- Fire Resistance",
                                GRAY + "- Flamestrike",
                                WHITE + " ",
                                blissgems.colorize("#FE8120") + "🔮 " + blissgems.colorize("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                                GRAY + "- " + blissgems.colorize("#FE8120") + "Crisp",
                                WHITE + "",
                                blissgems.colorize("#FE8120") + "🔮 " + blissgems.colorize("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                                GRAY + "-" + WHITE + "🧨" + blissgems.colorize("#FF5F33") + " ғɪʀᴇʙᴀʟʟ " + DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                                GRAY + "-" + WHITE + "🧨" + blissgems.colorize("#FF5F33") + " ᴍᴇᴛᴇᴏʀ sʜᴏᴡᴇʀ " + DARK_RED + "\uD83E\uDD3C",
                                WHITE + "",
                                GRAY + "-" + WHITE + "🥾 " + blissgems.colorize("#248FD1") + "ᴄᴏᴢʏ Cᴀᴍᴘғɪʀᴇ"
                        ));
                    }

                    if (energy == Energy.Ruined) {
                        itemMeta.setCustomModelData(82);
                        itemMeta.setLore(Arrays.asList(
                                WHITE + "" + BOLD + "ᴍᴀɴɪᴘᴜʟᴀᴛᴇ ғɪʀᴇ",
                                blissgems.colorize("&f(") + energystage + blissgems.colorize("&f)"),
                                WHITE + "",
                                blissgems.colorize("#FE8120") + "🔮 " + blissgems.colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                GRAY + "No Passives",
                                WHITE + " ",
                                blissgems.colorize("#FE8120") + "🔮 " + blissgems.colorize("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                                GRAY + "- " + blissgems.colorize("#FE8120") + "Crisp",
                                WHITE + "",
                                blissgems.colorize("#FE8120") + "🔮 " + blissgems.colorize("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                                GRAY + "-" + WHITE + "🧨" + blissgems.colorize("#FF5F33") + " ғɪʀᴇʙᴀʟʟ " + DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                                GRAY + "-" + WHITE + "🧨" + blissgems.colorize("#FF5F33") + " ᴍᴇᴛᴇᴏʀ sʜᴏᴡᴇʀ " + DARK_RED + "\uD83E\uDD3C",
                                WHITE + "",
                                GRAY + "-" + WHITE + "🥾 " + blissgems.colorize("#248FD1") + "ᴄᴏᴢʏ Cᴀᴍᴘғɪʀᴇ"
                        ));
                    }


                    if (energy == Energy.Broken) {
                        itemMeta.setCustomModelData(100);
                        itemMeta.setLore(Arrays.asList(
                                energystage
                        ));
                    }
                    item.setItemMeta(itemMeta);
                    return item;
                }
            }


            if (gem == GemType.Wealth) {
                if (season == 1) {
                    ItemStack item = new ItemStack(Material.PRISMARINE_SHARD, 1);
                    ItemMeta itemMeta = item.getItemMeta();


                    NamespacedKey idkey = new NamespacedKey(blissgems.getInstance(), "shard_id");
                    itemMeta.getPersistentDataContainer().set(idkey, PersistentDataType.STRING, UUID.randomUUID().toString());

                    itemMeta.setDisplayName(blissgems.colorize("#0EC912") + BOLD + "Wealth " + blissgems.colorize("#FFD773") + "Gem");


                    // Set HideFlags to 127 if server is lower than 1.20.6, if yes: then hide all flags.
                    // due to the nbt change, it is not possible to make everything 1-1 for people using 1.20.6 and higher.

                    /*NBTItem nbtItem = new NBTItem(item);
                        nbtItem.setInteger("HideFlags", 127);
                        item = nbtItem.getItem();*/
                    if (VersionChecker.OlderThanNBTChange()) itemMeta.addItemFlags(
                            ItemFlag.HIDE_ENCHANTS,
                            ItemFlag.HIDE_ATTRIBUTES,
                            ItemFlag.HIDE_UNBREAKABLE,
                            ItemFlag.HIDE_DESTROYS,
                            ItemFlag.HIDE_PLACED_ON,
                            ItemFlag.HIDE_POTION_EFFECTS,
                            ItemFlag.HIDE_DYE);
                    else for (ItemFlag flag : ItemFlag.values()) itemMeta.addItemFlags(flag);


                    itemMeta.setCustomModelData(12);
                    itemMeta.setLore(Arrays.asList(
                            WHITE + "" + BOLD + "Become wealthier than elon musk",
                            blissgems.colorize("#FFE4AB") + "Passives",
                            GRAY + " " + blissgems.colorize("#0EC912") + "🔮 " + GRAY + "Even cheaper villager trades, Auto enchants all",
                            GRAY + " swords with looting 3, and all pickaxes with fortune 3",
                            GRAY + " get two more ore for every 3 ores mined",
                            GRAY + " 2x the netherite scrap when taken out of furnace",
                            WHITE + " ",
                            blissgems.colorize("#B8FFFB") + BOLD + "Powers",
                            GRAY + "-" + WHITE + "\uD83C\uDF40 " + RED + "Unfortune",
                            GRAY + " " + DARK_RED + "\uD83E\uDD3C " + GRAY + "1/3 of actions canceled " + WHITE + "40s, R2",
                            GRAY + " " + DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB " + GRAY + "1/2 of actions canceled " + WHITE + "40s",
                            WHITE + "",
                            GRAY + "-" + WHITE + "\uD83E\uDD7E " + blissgems.colorize("#248FD1") + "Cozy Campfire",
                            GRAY + " Spawns a campfire that heals when near it 432423"
                    ));

                    item.setItemMeta(itemMeta);
                    return item;
                }


                if (season == 2) {


                    ItemStack item = new ItemStack(Material.PRISMARINE_SHARD, 1);
                    ItemMeta itemMeta = item.getItemMeta();


                    NamespacedKey idkey = new NamespacedKey(blissgems.getInstance(), "gem-id");
                    itemMeta.getPersistentDataContainer().set(idkey, PersistentDataType.STRING, UUID.randomUUID().toString());

                    NamespacedKey tierkey = new NamespacedKey(blissgems.getInstance(), "gem-tier");
                    itemMeta.getPersistentDataContainer().set(tierkey, PersistentDataType.INTEGER, tier);

                    NamespacedKey typekey = new NamespacedKey(blissgems.getInstance(), "gem-type");
                    itemMeta.getPersistentDataContainer().set(typekey, PersistentDataType.STRING, "fire");

                    NamespacedKey quicknodropkey = new NamespacedKey(blissgems.getInstance(), "quick-no-drop");
                    itemMeta.getPersistentDataContainer().set(quicknodropkey, PersistentDataType.INTEGER, quicknodrop);

                    NamespacedKey quicknoremovekey = new NamespacedKey(blissgems.getInstance(), "quick-no-remove");
                    itemMeta.getPersistentDataContainer().set(quicknoremovekey, PersistentDataType.INTEGER, quicknoremove);


                    itemMeta.setDisplayName(blissgems.colorize("#FE8120") + BOLD + "ғɪʀᴇ " + blissgems.colorize("#FFD773") + "ɢᴇᴍ");
                    for (ItemFlag flag : ItemFlag.values()) itemMeta.addItemFlags(flag);

                    if (Gem.isPristineorHigher(energy)) {
                        if (energy == Energy.Pristine_5) itemMeta.addEnchant(Enchantment.DURABILITY, 1, true);

                        itemMeta.setCustomModelData(2);
                        itemMeta.setLore(Arrays.asList(
                                WHITE + "" + BOLD + "ᴍᴀɴɪᴘᴜʟᴀᴛᴇ ғɪʀᴇ",
                                blissgems.colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                energystage,
                                GRAY + " " + blissgems.colorize("#FE8120") + "🔮 " + GRAY + "Auto Smelting. Longer FireThorns.",
                                GRAY + " Auto Enchant Flame & Fire Aspect 2",
                                WHITE + " ",
                                blissgems.colorize("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                                GRAY + "-" + WHITE + "\uD83E\uDDE8" + blissgems.colorize("#FF5F33") + " ғɪʀᴇʙᴀʟʟ",
                                GRAY + " Spawn a fireball that charges up passively,",
                                GRAY + " while standing on fire blocks, charge 2x faster.",
                                GRAY + " Deals more damage the more you charge it.",
                                WHITE + "",
                                GRAY + "-" + WHITE + "\uD83E\uDD7E " + blissgems.colorize("#248FD1") + "ᴄᴏᴢʏ Cᴀᴍᴘғɪʀᴇ",
                                GRAY + " Spawn a campfire that heals 2 hearts and hunger",
                                GRAY + " a second in a 4 block radius"
                        ));
                    }

                    if (energy == Energy.Scratched) {
                        itemMeta.setCustomModelData(22);
                        itemMeta.setLore(Arrays.asList(
                                WHITE + "" + BOLD + "ᴍᴀɴɪᴘᴜʟᴀᴛᴇ ғɪʀᴇ",
                                blissgems.colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                energystage,
                                GRAY + " " + blissgems.colorize("#FE8120") + "🔮 " + "Longer FireThorns. Fire Res.",
                                GRAY + " Auto Enchant Flame & Fire Aspect 2",
                                WHITE + " ",
                                blissgems.colorize("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                                GRAY + "-" + WHITE + "\uD83E\uDDE8" + blissgems.colorize("#FF5F33") + " ғɪʀᴇʙᴀʟʟ",
                                GRAY + " Spawn a fireball that charges up passively,",
                                GRAY + " while standing on fire blocks charge 2x faster.",
                                GRAY + " Deals more damage the more you charge it.",
                                WHITE + "",
                                GRAY + "-" + WHITE + "\uD83E\uDD7E " + blissgems.colorize("#248FD1") + "ᴄᴏᴢʏ Cᴀᴍᴘғɪʀᴇ",
                                GRAY + " Spawn a campfire that heals 2 hearts and hunger",
                                GRAY + " a second in a 4 block radius"
                        ));
                    }

                    if (energy == Energy.Cracked) {
                        itemMeta.setCustomModelData(42);
                        itemMeta.setLore(Arrays.asList(
                                WHITE + "" + BOLD + "ᴍᴀɴɪᴘᴜʟᴀᴛᴇ ғɪʀᴇ",
                                blissgems.colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                energystage,
                                GRAY + " " + blissgems.colorize("#FE8120") + "🔮 " + "Fire Res.",
                                GRAY + " Auto Enchant Flame & Fire Aspect",
                                WHITE + " ",
                                blissgems.colorize("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                                GRAY + "-" + WHITE + "\uD83E\uDDE8" + blissgems.colorize("#FF5F33") + " ғɪʀᴇʙᴀʟʟ",
                                GRAY + " Spawn a fireball that charges up passively,",
                                GRAY + " while standing on fire blocks charge 2x faster.",
                                GRAY + " Deals more damage the more you charge it.",
                                WHITE + "",
                                GRAY + "-" + WHITE + "\uD83E\uDD7E " + blissgems.colorize("#248FD1") + "ᴄᴏᴢʏ Cᴀᴍᴘғɪʀᴇ",
                                GRAY + " Spawn a campfire that heals 2 hearts and hunger",
                                GRAY + " a second in a 4 block radius"
                        ));
                    }

                    if (energy == Energy.Damaged) {
                        itemMeta.setCustomModelData(62);
                        itemMeta.setLore(Arrays.asList(
                                WHITE + "" + BOLD + "ᴍᴀɴɪᴘᴜʟᴀᴛᴇ ғɪʀᴇ",
                                blissgems.colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                energystage,
                                GRAY + " " + blissgems.colorize("#FE8120") + "🔮 " + "Auto Enchant Flame",
                                WHITE + " ",
                                blissgems.colorize("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                                GRAY + "-" + WHITE + "\uD83E\uDDE8" + blissgems.colorize("#FF5F33") + " ғɪʀᴇʙᴀʟʟ",
                                GRAY + " Spawn a fireball that charges up passively,",
                                GRAY + " while standing on fire blocks charge 2x faster.",
                                GRAY + " Deals more damage the more you charge it",
                                WHITE + "",
                                GRAY + "-" + WHITE + "\uD83E\uDD7E " + blissgems.colorize("#248FD1") + "ᴄᴏᴢʏ Cᴀᴍᴘғɪʀᴇ",
                                GRAY + " Spawn a campfire that heals 2 hearts and hunger",
                                GRAY + " a second in a 4 block radius"
                        ));
                    }

                    if (energy == Energy.Ruined) {
                        itemMeta.setCustomModelData(82);
                        itemMeta.setLore(Arrays.asList(
                                WHITE + "" + BOLD + "ᴍᴀɴɪᴘᴜʟᴀᴛᴇ ғɪʀᴇ",
                                blissgems.colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                energystage,
                                GRAY + " " + blissgems.colorize("#FE8120") + "🔮 " + "No passives",
                                WHITE + " ",
                                blissgems.colorize("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                                GRAY + "-" + WHITE + "\uD83E\uDDE8" + blissgems.colorize("#FF5F33") + " ғɪʀᴇʙᴀʟʟ",
                                GRAY + " Spawn a fireball that charges up passively,",
                                GRAY + " while standing on fire blocks charge 2x faster.",
                                GRAY + " Deals more damage the more you charge it",
                                WHITE + "",
                                GRAY + "-" + WHITE + "\uD83E\uDD7E " + blissgems.colorize("#248FD1") + "ᴄᴏᴢʏ Cᴀᴍᴘғɪʀᴇ",
                                GRAY + " Spawn a campfire that heals 2 hearts and hunger",
                                GRAY + " a second in a 4 block radius"
                        ));
                    }


                    if (energy == Energy.Broken) {
                        itemMeta.setCustomModelData(96);
                        itemMeta.setLore(Arrays.asList(
                                WHITE + "" + BOLD + "ᴜsᴇʟᴇss"
                        ));
                    }
                    item.setItemMeta(itemMeta);
                    return item;
                }
                if (season == 3) {

                    ItemStack item = new ItemStack(Material.PRISMARINE_SHARD, 1);
                    ItemMeta itemMeta = item.getItemMeta();


                    NamespacedKey idkey = new NamespacedKey(blissgems.getInstance(), "gem-id");
                    itemMeta.getPersistentDataContainer().set(idkey, PersistentDataType.STRING, "f3580015-6d14-4cfb-bd46-2eef14ce75e7");

                    NamespacedKey tierkey = new NamespacedKey(blissgems.getInstance(), "gem-tier");
                    itemMeta.getPersistentDataContainer().set(tierkey, PersistentDataType.INTEGER, tier);

                    NamespacedKey typekey = new NamespacedKey(blissgems.getInstance(), "gem-type");
                    itemMeta.getPersistentDataContainer().set(typekey, PersistentDataType.STRING, "fire");

                    NamespacedKey quicknodropkey = new NamespacedKey(blissgems.getInstance(), "quick-no-drop");
                    itemMeta.getPersistentDataContainer().set(quicknodropkey, PersistentDataType.INTEGER, quicknodrop);

                    NamespacedKey quicknoremovekey = new NamespacedKey(blissgems.getInstance(), "quick-no-remove");
                    itemMeta.getPersistentDataContainer().set(quicknoremovekey, PersistentDataType.INTEGER, quicknoremove);

                    for (ItemFlag flag : ItemFlag.values()) itemMeta.addItemFlags(flag);
                    itemMeta.setDisplayName(blissgems.colorize("#FE8120") + BOLD + "ғɪʀᴇ " + blissgems.colorize("#FFD773") + "ɢᴇᴍ");
                    if (Gem.isPristineorHigher(energy)) {
                        if (energy == Energy.Pristine_5) itemMeta.addEnchant(Enchantment.DURABILITY, 1, true);

                        itemMeta.setCustomModelData(2);

                        String ending = blissgems.colorize("&f)");
                        if (energy == Energy.Pristine_1 || energy == Energy.Pristine_2 || energy == Energy.Pristine_3 || energy == Energy.Pristine_4 || energy == Energy.Pristine_5)
                            ending = ")";

                        itemMeta.setLore(Arrays.asList(
                                WHITE + "" + BOLD + "ᴍᴀɴɪᴘᴜʟᴀᴛᴇ ғɪʀᴇ",
                                blissgems.colorize("&f(") + energystage + ending,
                                WHITE + "",
                                blissgems.colorize("#FE8120") + "🔮 " + blissgems.colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                GRAY + "- Fire Resistance",
                                GRAY + "- Autosmelt",
                                GRAY + "- Flamestrike",
                                GRAY + "- Fireshot",
                                WHITE + " ",
                                blissgems.colorize("#FE8120") + "🔮 " + blissgems.colorize("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                                GRAY + "- " + blissgems.colorize("#FE8120") + "Crisp",
                                WHITE + "",
                                blissgems.colorize("#FE8120") + "🔮 " + blissgems.colorize("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                                GRAY + "-" + WHITE + "🧨" + blissgems.colorize("#FF5F33") + " ғɪʀᴇʙᴀʟʟ " + DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                                GRAY + "-" + WHITE + "🧨" + blissgems.colorize("#FF5F33") + " ᴍᴇᴛᴇᴏʀ sʜᴏᴡᴇʀ " + DARK_RED + "\uD83E\uDD3C",
                                WHITE + "",
                                GRAY + "-" + WHITE + "🥾 " + blissgems.colorize("#248FD1") + "ᴄᴏᴢʏ Cᴀᴍᴘғɪʀᴇ"
                        ));
                    }


                    if (energy == Energy.Scratched) {
                        itemMeta.setCustomModelData(22);
                        itemMeta.setLore(Arrays.asList(
                                WHITE + "" + BOLD + "ᴍᴀɴɪᴘᴜʟᴀᴛᴇ ғɪʀᴇ",
                                blissgems.colorize("&f(") + energystage + blissgems.colorize("&f)"),
                                WHITE + "",
                                blissgems.colorize("#FE8120") + "🔮 " + blissgems.colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                GRAY + "- Fire Resistance",
                                GRAY + "- Flamestrike",
                                GRAY + "- Fireshot",
                                WHITE + " ",
                                blissgems.colorize("#FE8120") + "🔮 " + blissgems.colorize("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                                GRAY + "- " + blissgems.colorize("#FE8120") + "Crisp",
                                WHITE + "",
                                blissgems.colorize("#FE8120") + "🔮 " + blissgems.colorize("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                                GRAY + "-" + WHITE + "🧨" + blissgems.colorize("#FF5F33") + " ғɪʀᴇʙᴀʟʟ " + DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                                GRAY + "-" + WHITE + "🧨" + blissgems.colorize("#FF5F33") + " ᴍᴇᴛᴇᴏʀ sʜᴏᴡᴇʀ " + DARK_RED + "\uD83E\uDD3C",
                                WHITE + "",
                                GRAY + "-" + WHITE + "🥾 " + blissgems.colorize("#248FD1") + "ᴄᴏᴢʏ Cᴀᴍᴘғɪʀᴇ"
                        ));
                    }

                    if (energy == Energy.Cracked) {
                        itemMeta.setCustomModelData(42);
                        itemMeta.setLore(Arrays.asList(
                                WHITE + "" + BOLD + "ᴍᴀɴɪᴘᴜʟᴀᴛᴇ ғɪʀᴇ",
                                blissgems.colorize("&f(") + energystage + blissgems.colorize("&f)"),
                                WHITE + "",
                                blissgems.colorize("#FE8120") + "🔮 " + blissgems.colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                GRAY + "- Fire Resistance",
                                GRAY + "- Flamestrike",
                                GRAY + "- Fireshot",
                                WHITE + " ",
                                blissgems.colorize("#FE8120") + "🔮 " + blissgems.colorize("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                                GRAY + "- " + blissgems.colorize("#FE8120") + "Crisp",
                                WHITE + "",
                                blissgems.colorize("#FE8120") + "🔮 " + blissgems.colorize("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                                GRAY + "-" + WHITE + "🧨" + blissgems.colorize("#FF5F33") + " ғɪʀᴇʙᴀʟʟ " + DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                                GRAY + "-" + WHITE + "🧨" + blissgems.colorize("#FF5F33") + " ᴍᴇᴛᴇᴏʀ sʜᴏᴡᴇʀ " + DARK_RED + "\uD83E\uDD3C",
                                WHITE + "",
                                GRAY + "-" + WHITE + "🥾 " + blissgems.colorize("#248FD1") + "ᴄᴏᴢʏ Cᴀᴍᴘғɪʀᴇ"
                        ));
                    }


                    if (energy == Energy.Damaged) {
                        itemMeta.setCustomModelData(62);
                        itemMeta.setLore(Arrays.asList(
                                WHITE + "" + BOLD + "ᴍᴀɴɪᴘᴜʟᴀᴛᴇ ғɪʀᴇ",
                                blissgems.colorize("&f(") + energystage + blissgems.colorize("&f)"),
                                WHITE + "",
                                blissgems.colorize("#FE8120") + "🔮 " + blissgems.colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                GRAY + "- Fire Resistance",
                                GRAY + "- Flamestrike",
                                WHITE + " ",
                                blissgems.colorize("#FE8120") + "🔮 " + blissgems.colorize("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                                GRAY + "- " + blissgems.colorize("#FE8120") + "Crisp",
                                WHITE + "",
                                blissgems.colorize("#FE8120") + "🔮 " + blissgems.colorize("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                                GRAY + "-" + WHITE + "🧨" + blissgems.colorize("#FF5F33") + " ғɪʀᴇʙᴀʟʟ " + DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                                GRAY + "-" + WHITE + "🧨" + blissgems.colorize("#FF5F33") + " ᴍᴇᴛᴇᴏʀ sʜᴏᴡᴇʀ " + DARK_RED + "\uD83E\uDD3C",
                                WHITE + "",
                                GRAY + "-" + WHITE + "🥾 " + blissgems.colorize("#248FD1") + "ᴄᴏᴢʏ Cᴀᴍᴘғɪʀᴇ"
                        ));
                    }

                    if (energy == Energy.Ruined) {
                        itemMeta.setCustomModelData(82);
                        itemMeta.setLore(Arrays.asList(
                                WHITE + "" + BOLD + "ᴍᴀɴɪᴘᴜʟᴀᴛᴇ ғɪʀᴇ",
                                blissgems.colorize("&f(") + energystage + blissgems.colorize("&f)"),
                                WHITE + "",
                                blissgems.colorize("#FE8120") + "🔮 " + blissgems.colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                GRAY + "No Passives",
                                WHITE + " ",
                                blissgems.colorize("#FE8120") + "🔮 " + blissgems.colorize("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                                GRAY + "- " + blissgems.colorize("#FE8120") + "Crisp",
                                WHITE + "",
                                blissgems.colorize("#FE8120") + "🔮 " + blissgems.colorize("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                                GRAY + "-" + WHITE + "🧨" + blissgems.colorize("#FF5F33") + " ғɪʀᴇʙᴀʟʟ " + DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                                GRAY + "-" + WHITE + "🧨" + blissgems.colorize("#FF5F33") + " ᴍᴇᴛᴇᴏʀ sʜᴏᴡᴇʀ " + DARK_RED + "\uD83E\uDD3C",
                                WHITE + "",
                                GRAY + "-" + WHITE + "🥾 " + blissgems.colorize("#248FD1") + "ᴄᴏᴢʏ Cᴀᴍᴘғɪʀᴇ"
                        ));
                    }


                    if (energy == Energy.Broken) {
                        itemMeta.setCustomModelData(100);
                        itemMeta.setLore(Arrays.asList(
                                energystage
                        ));
                    }
                    item.setItemMeta(itemMeta);
                    return item;
                }
            }
        }

        if (tier == 1) if (gem == GemType.Strength) {
            if (season == 1) {
                ItemStack item = new ItemStack(Material.AMETHYST_SHARD, 1);
                ItemMeta itemMeta = item.getItemMeta();


                NamespacedKey idkey = new NamespacedKey(blissgems.getInstance(), "shard_id");
                itemMeta.getPersistentDataContainer().set(idkey, PersistentDataType.STRING, UUID.randomUUID().toString());

                itemMeta.setDisplayName(blissgems.colorize("#F10303") + BOLD + "Strength " + blissgems.colorize("#C7C7C7") + "Gem");


                // Set HideFlags to 127 if server is lower than 1.20.6, if yes: then hide all flags.
                // due to the nbt change, it is not possible to make everything 1-1 for people using 1.20.6 and higher.

                if (VersionChecker.OlderThanNBTChange()) itemMeta.addItemFlags(
                        ItemFlag.HIDE_ENCHANTS,
                        ItemFlag.HIDE_ATTRIBUTES,
                        ItemFlag.HIDE_UNBREAKABLE,
                        ItemFlag.HIDE_DESTROYS,
                        ItemFlag.HIDE_PLACED_ON,
                        ItemFlag.HIDE_POTION_EFFECTS,
                        ItemFlag.HIDE_DYE);
                else for (ItemFlag flag : ItemFlag.values()) itemMeta.addItemFlags(flag);


                itemMeta.setCustomModelData(9);
                itemMeta.setLore(Arrays.asList(
                        WHITE + "" + BOLD + "Have the strength of 5 men",
                        blissgems.colorize("#FFE4AB") + "Passives",
                        GRAY + " " + blissgems.colorize("#F10303") + "🔺 " + GRAY + "Strength 1, Auto enchants all",
                        GRAY + " swords and axes with sharpness 2",
                        WHITE + " ",
                        blissgems.colorize("#B8FFFB") + BOLD + "Powers",
                        blissgems.colorize("#F10303") + "🔮 " + WHITE + BOLD + "required"
                ));

                item.setItemMeta(itemMeta);
                return item;
            }


            if (season == 2) {


                ItemStack item = new ItemStack(Material.AMETHYST_SHARD, 1);
                ItemMeta itemMeta = item.getItemMeta();


                NamespacedKey idkey = new NamespacedKey(blissgems.getInstance(), "gem-id");
                itemMeta.getPersistentDataContainer().set(idkey, PersistentDataType.STRING, "166c9cee-5354-4a29-a33b-fc49080eecc1");

                NamespacedKey tierkey = new NamespacedKey(blissgems.getInstance(), "gem-tier");
                itemMeta.getPersistentDataContainer().set(tierkey, PersistentDataType.INTEGER, tier);

                NamespacedKey typekey = new NamespacedKey(blissgems.getInstance(), "gem-type");
                itemMeta.getPersistentDataContainer().set(typekey, PersistentDataType.STRING, "strength");

                NamespacedKey quicknodropkey = new NamespacedKey(blissgems.getInstance(), "quick-no-drop");
                itemMeta.getPersistentDataContainer().set(quicknodropkey, PersistentDataType.INTEGER, quicknodrop);

                NamespacedKey quicknoremovekey = new NamespacedKey(blissgems.getInstance(), "quick-no-remove");
                itemMeta.getPersistentDataContainer().set(quicknoremovekey, PersistentDataType.INTEGER, quicknoremove);


                itemMeta.setDisplayName(blissgems.colorize("#F10303") + BOLD + "sᴛʀᴇɴɢᴛʜ " + blissgems.colorize("#FFD773") + "ɢᴇᴍ");
                for (ItemFlag flag : ItemFlag.values()) itemMeta.addItemFlags(flag);

                if (Gem.isPristineorHigher(energy) || energy == Energy.Scratched) {
                    if (energy == Energy.Pristine_5) itemMeta.addEnchant(Enchantment.DURABILITY, 1, true);

                    if ((energy) == Energy.Scratched) itemMeta.setCustomModelData(29);
                    else itemMeta.setCustomModelData(9);
                    itemMeta.setLore(Arrays.asList(
                            WHITE + "" + BOLD + "ʜᴀᴠᴇ ᴛʜᴇ sᴛʀᴇɴɢᴛʜ ᴏғ ᴀ ᴀʀᴍʏ",
                            blissgems.colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                            energystage,
                            GRAY + " " + blissgems.colorize("#F10303") + "🔺 " + GRAY + "Strength 1, Auto enchants all",
                            GRAY + " swords and axes with sharpness 2",
                            GRAY + " Deal more damage the lower you are",
                            WHITE + " ",
                            blissgems.colorize("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                            blissgems.colorize("#F10303") + "🔮 " + WHITE + BOLD + "required"
                    ));
                }

                if (energy == Energy.Cracked) {
                    itemMeta.setCustomModelData(49);
                    itemMeta.setLore(Arrays.asList(
                            WHITE + "" + BOLD + "ʜᴀᴠᴇ ᴛʜᴇ sᴛʀᴇɴɢᴛʜ ᴏғ ᴀ ᴀʀᴍʏ",
                            blissgems.colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                            energystage,
                            GRAY + " " + blissgems.colorize("#F10303") + "🔺 " + "Strength 1",
                            GRAY + " Auto Enchant sharpness 1",
                            WHITE + " ",
                            blissgems.colorize("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                            blissgems.colorize("#F10303") + "🔮 " + WHITE + BOLD + "required"
                    ));
                }

                if (energy == Energy.Damaged) {
                    itemMeta.setCustomModelData(70);
                    itemMeta.setLore(Arrays.asList(
                            WHITE + "" + BOLD + "ʜᴀᴠᴇ ᴛʜᴇ sᴛʀᴇɴɢᴛʜ ᴏғ ᴀ ᴀʀᴍʏ",
                            blissgems.colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                            energystage,
                            GRAY + " " + blissgems.colorize("#F10303") + "🔮 " + GRAY + "Auto enchants sharpness 2",
                            WHITE + " ",
                            blissgems.colorize("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                            GRAY + "-" + WHITE + "\uD83E\uDD3A " + blissgems.colorize("#B5B5B5") + BOLD + "ғʀᴀɪʟᴇʀ",
                            GRAY + " " + DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB " + GRAY + "Clears potion effects",
                            GRAY + " gives weakness 1 for 20 seconds",
                            GRAY + " " + DARK_RED + "\uD83E\uDD3C " + GRAY + " Clears potion effects",
                            GRAY + " and gives withering, " + WHITE + "40s, R5",
                            WHITE + "",
                            GRAY + "-" + WHITE + "⚔" + blissgems.colorize("#910D0D") + " ᴄʜᴀᴅ sᴛʀᴇɴɢᴛʜ " + WHITE + "R4 40s",
                            GRAY + " " + GREEN + "\uD83E\uDDD1\uD83C\uDFFB " + GRAY + "Every 3 crits charges a hit that deals 2x the dmg",
                            GRAY + " " + GREEN + "\uD83E\uDD3C " + GRAY + "Every 8 crits charges a hit that deals 2x the dmg"
                    ));
                }

                if (energy == Energy.Ruined) {
                    itemMeta.setCustomModelData(90);
                    itemMeta.setLore(Arrays.asList(
                            WHITE + "" + BOLD + "ʜᴀᴠᴇ ᴛʜᴇ sᴛʀᴇɴɢᴛʜ ᴏғ ᴀ ᴀʀᴍʏ",
                            blissgems.colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                            energystage,
                            GRAY + " " + blissgems.colorize("#F10303") + "🔮 " + GRAY + "No passives",
                            WHITE + " ",
                            blissgems.colorize("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                            GRAY + "-" + WHITE + "\uD83E\uDD3A " + blissgems.colorize("#B5B5B5") + BOLD + "ғʀᴀɪʟᴇʀ",
                            GRAY + " " + DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB " + GRAY + "Clears potion effects",
                            GRAY + " gives weakness 1 for 20 seconds",
                            GRAY + " " + DARK_RED + "\uD83E\uDD3C " + GRAY + " Clears potion effects",
                            GRAY + " and gives withering, " + WHITE + "40s, R5",
                            WHITE + "",
                            GRAY + "-" + WHITE + "⚔" + blissgems.colorize("#910D0D") + " ᴄʜᴀᴅ sᴛʀᴇɴɢᴛʜ " + WHITE + "R4 40s",
                            GRAY + " " + GREEN + "\uD83E\uDDD1\uD83C\uDFFB " + GRAY + "Every 3 crits charges a hit that deals 2x the dmg",
                            GRAY + " " + GREEN + "\uD83E\uDD3C " + GRAY + "Every 8 crits charges a hit that deals 2x the dmg"
                    ));
                }


                if (energy == Energy.Broken) {
                    itemMeta.setCustomModelData(96);
                    itemMeta.setLore(Arrays.asList(
                            WHITE + "" + BOLD + "ᴜsᴇʟᴇss"
                    ));
                }
                item.setItemMeta(itemMeta);
                return item;
            }
            if (season == 3) {

                ItemStack item = new ItemStack(Material.PRISMARINE_SHARD, 1);
                ItemMeta itemMeta = item.getItemMeta();


                NamespacedKey idkey = new NamespacedKey(blissgems.getInstance(), "gem-id");
                itemMeta.getPersistentDataContainer().set(idkey, PersistentDataType.STRING, "9f969b5e-8b9a-4dd5-b5bc-9a23774721b4");

                NamespacedKey tierkey = new NamespacedKey(blissgems.getInstance(), "gem-tier");
                itemMeta.getPersistentDataContainer().set(tierkey, PersistentDataType.INTEGER, tier);

                NamespacedKey typekey = new NamespacedKey(blissgems.getInstance(), "gem-type");
                itemMeta.getPersistentDataContainer().set(typekey, PersistentDataType.STRING, "strength");

                NamespacedKey quicknodropkey = new NamespacedKey(blissgems.getInstance(), "quick-no-drop");
                itemMeta.getPersistentDataContainer().set(quicknodropkey, PersistentDataType.INTEGER, quicknodrop);

                NamespacedKey quicknoremovekey = new NamespacedKey(blissgems.getInstance(), "quick-no-remove");
                itemMeta.getPersistentDataContainer().set(quicknoremovekey, PersistentDataType.INTEGER, quicknoremove);


                for (ItemFlag flag : ItemFlag.values()) itemMeta.addItemFlags(flag);

                itemMeta.setDisplayName(blissgems.colorize("#F10303") + BOLD + "sᴛʀᴇɴɢᴛʜ " + blissgems.colorize("#FFD773") + "ɢᴇᴍ");
                if (Gem.isPristineorHigher(energy)) {
                    if (energy == Energy.Pristine_5) itemMeta.addEnchant(Enchantment.DURABILITY, 1, true);

                    itemMeta.setCustomModelData(10);

                    String ending = blissgems.colorize("&f)");
                    if (energy == Energy.Pristine_1 || energy == Energy.Pristine_2 || energy == Energy.Pristine_3 || energy == Energy.Pristine_4 || energy == Energy.Pristine_5)
                        ending = ")";

                    itemMeta.setLore(Arrays.asList(
                            WHITE + "" + BOLD + "ʜᴀᴠᴇ ᴛʜᴇ sᴛʀᴇɴɢᴛʜ ᴏғ ᴀ ᴀʀᴍʏ",
                            blissgems.colorize("&f(") + energystage + ending,
                            WHITE + " ",
                            blissgems.colorize("#F10303") + "🔮" + " " + blissgems.colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                            GRAY + "- " + GRAY + "Strength",
                            GRAY + "- Enchants Sharpness",
                            WHITE + " ",
                            blissgems.colorize("#F10303") + "🔮" + " " + blissgems.colorize("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                            GRAY + "- " + blissgems.colorize("#F10303") + "Bounty Hunter",
                            WHITE + " ",
                            blissgems.colorize("#F10303") + "🔮 " + blissgems.colorize("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                            GRAY + "- " + WHITE + "\uD83E\uDD3A " + blissgems.colorize("#B5B5B5") + "ғʀᴀɪʟᴇʀ " + DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                            GRAY + "- " + WHITE + "\uD83E\uDD3A " + blissgems.colorize("#B5B5B5") + "ɴᴜʟʟɪғʏ " + DARK_RED + "\uD83E\uDD3C",
                            WHITE + "",
                            GRAY + "- " + WHITE + "⚔" + blissgems.colorize("#910D0D") + " ᴄʜᴀᴅ sᴛʀᴇɴɢᴛʜ " + GREEN + "\uD83E\uDDD1\uD83C\uDFFB",
                            GRAY + "- " + WHITE + "⚔" + blissgems.colorize("#910D0D") + " ᴄʜᴀᴅ sᴛʀᴇɴɢᴛʜ " + GREEN + "\uD83E\uDD3C"
                    ));
                }


                if (energy == Energy.Scratched) {
                    itemMeta.setCustomModelData(30);
                    itemMeta.setLore(Arrays.asList(
                            WHITE + "" + BOLD + "ʜᴀᴠᴇ ᴛʜᴇ sᴛʀᴇɴɢᴛʜ ᴏғ ᴀ ᴀʀᴍʏ",
                            blissgems.colorize("&f(") + energystage + blissgems.colorize("&f)"),
                            WHITE + " ",
                            blissgems.colorize("#F10303") + "🔮" + " " + blissgems.colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                            GRAY + "- " + GRAY + "Strength",
                            GRAY + "- Enchants Sharpness",
                            GRAY + "- " + GRAY + "Bloodthorns",
                            WHITE + " ",
                            blissgems.colorize("#F10303") + "🔮" + " " + blissgems.colorize("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                            GRAY + "- " + blissgems.colorize("#F10303") + "Bounty Hunter",
                            WHITE + " ",
                            blissgems.colorize("#F10303") + "🔮 " + blissgems.colorize("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                            GRAY + "- " + WHITE + "\uD83E\uDD3A " + blissgems.colorize("#B5B5B5") + "ғʀᴀɪʟᴇʀ " + DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                            GRAY + "- " + WHITE + "\uD83E\uDD3A " + blissgems.colorize("#B5B5B5") + "ɴᴜʟʟɪғʏ " + DARK_RED + "\uD83E\uDD3C",
                            WHITE + "",
                            GRAY + "- " + WHITE + "⚔" + blissgems.colorize("#910D0D") + " ᴄʜᴀᴅ sᴛʀᴇɴɢᴛʜ " + GREEN + "\uD83E\uDDD1\uD83C\uDFFB",
                            GRAY + "- " + WHITE + "⚔" + blissgems.colorize("#910D0D") + " ᴄʜᴀᴅ sᴛʀᴇɴɢᴛʜ " + GREEN + "\uD83E\uDD3C"
                    ));
                }

                if (energy == Energy.Cracked) {
                    itemMeta.setCustomModelData(50);

                    itemMeta.setLore(Arrays.asList(
                            WHITE + "" + BOLD + "ʜᴀᴠᴇ ᴛʜᴇ sᴛʀᴇɴɢᴛʜ ᴏғ ᴀ ᴀʀᴍʏ",
                            blissgems.colorize("&f(") + energystage + blissgems.colorize("&f)"),
                            WHITE + " ",
                            blissgems.colorize("#F10303") + "🔮" + " " + blissgems.colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                            GRAY + "- " + GRAY + "Strength",
                            GRAY + "- Enchants Sharpness",
                            WHITE + " ",
                            blissgems.colorize("#F10303") + "🔮" + " " + blissgems.colorize("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                            GRAY + "- " + blissgems.colorize("#F10303") + "Bounty Hunter",
                            WHITE + " ",
                            blissgems.colorize("#F10303") + "🔮 " + blissgems.colorize("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                            GRAY + "- " + WHITE + "\uD83E\uDD3A " + blissgems.colorize("#B5B5B5") + "ғʀᴀɪʟᴇʀ " + DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                            GRAY + "- " + WHITE + "\uD83E\uDD3A " + blissgems.colorize("#B5B5B5") + "ɴᴜʟʟɪғʏ " + DARK_RED + "\uD83E\uDD3C",
                            WHITE + "",
                            GRAY + "- " + WHITE + "⚔" + blissgems.colorize("#910D0D") + " ᴄʜᴀᴅ sᴛʀᴇɴɢᴛʜ " + GREEN + "\uD83E\uDDD1\uD83C\uDFFB",
                            GRAY + "- " + WHITE + "⚔" + blissgems.colorize("#910D0D") + " ᴄʜᴀᴅ sᴛʀᴇɴɢᴛʜ " + GREEN + "\uD83E\uDD3C"
                    ));
                }


                if (energy == Energy.Damaged) {
                    itemMeta.setCustomModelData(70);

                    itemMeta.setLore(Arrays.asList(
                            WHITE + "" + BOLD + "ʜᴀᴠᴇ ᴛʜᴇ sᴛʀᴇɴɢᴛʜ ᴏғ ᴀ ᴀʀᴍʏ",
                            blissgems.colorize("&f(") + energystage + blissgems.colorize("&f)"),
                            WHITE + " ",
                            blissgems.colorize("#F10303") + "🔮" + " " + blissgems.colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                            GRAY + "- " + GRAY + "Strength",
                            GRAY + "- Enchants Sharpness",
                            WHITE + " ",
                            blissgems.colorize("#F10303") + "🔮" + " " + blissgems.colorize("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                            GRAY + "- " + blissgems.colorize("#F10303") + "Bounty Hunter",
                            WHITE + " ",
                            blissgems.colorize("#F10303") + "🔮 " + blissgems.colorize("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                            GRAY + "- " + WHITE + "\uD83E\uDD3A " + blissgems.colorize("#B5B5B5") + "ғʀᴀɪʟᴇʀ " + DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                            GRAY + "- " + WHITE + "\uD83E\uDD3A " + blissgems.colorize("#B5B5B5") + "ɴᴜʟʟɪғʏ " + DARK_RED + "\uD83E\uDD3C",
                            WHITE + "",
                            GRAY + "- " + WHITE + "⚔" + blissgems.colorize("#910D0D") + " ᴄʜᴀᴅ sᴛʀᴇɴɢᴛʜ " + GREEN + "\uD83E\uDDD1\uD83C\uDFFB",
                            GRAY + "- " + WHITE + "⚔" + blissgems.colorize("#910D0D") + " ᴄʜᴀᴅ sᴛʀᴇɴɢᴛʜ " + GREEN + "\uD83E\uDD3C"
                    ));
                }

                if (energy == Energy.Ruined) {
                    itemMeta.setCustomModelData(90);

                    itemMeta.setLore(Arrays.asList(
                            WHITE + "" + BOLD + "ʜᴀᴠᴇ ᴛʜᴇ sᴛʀᴇɴɢᴛʜ ᴏғ ᴀ ᴀʀᴍʏ",
                            blissgems.colorize("&f(") + energystage + blissgems.colorize("&f)"),
                            WHITE + " ",
                            blissgems.colorize("#F10303") + "🔮" + " " + blissgems.colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                            GRAY + "No Passives",
                            WHITE + " ",
                            blissgems.colorize("#F10303") + "🔮" + " " + blissgems.colorize("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                            GRAY + "- " + blissgems.colorize("#F10303") + "Bounty Hunter",
                            WHITE + " ",
                            blissgems.colorize("#F10303") + "🔮 " + blissgems.colorize("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                            GRAY + "- " + WHITE + "\uD83E\uDD3A " + blissgems.colorize("#B5B5B5") + "ғʀᴀɪʟᴇʀ " + DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                            GRAY + "- " + WHITE + "\uD83E\uDD3A " + blissgems.colorize("#B5B5B5") + "ɴᴜʟʟɪғʏ " + DARK_RED + "\uD83E\uDD3C",
                            WHITE + "",
                            GRAY + "- " + WHITE + "⚔" + blissgems.colorize("#910D0D") + " ᴄʜᴀᴅ sᴛʀᴇɴɢᴛʜ " + GREEN + "\uD83E\uDDD1\uD83C\uDFFB",
                            GRAY + "- " + WHITE + "⚔" + blissgems.colorize("#910D0D") + " ᴄʜᴀᴅ sᴛʀᴇɴɢᴛʜ " + GREEN + "\uD83E\uDD3C"
                    ));
                }


                if (energy == Energy.Broken) {
                    itemMeta.setCustomModelData(100);
                    itemMeta.setLore(Arrays.asList(
                            energystage
                    ));
                }
                item.setItemMeta(itemMeta);
                return item;
            }
        }

        return null;
    }
}

