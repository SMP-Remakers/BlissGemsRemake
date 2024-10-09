package com.hyperdondon.blissgemsremake;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.mineacademy.fo.plugin.SimplePlugin;
import org.mineacademy.fo.remain.CompChatColor;
import org.mineacademy.fo.settings.SimpleLocalization;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static net.md_5.bungee.api.ChatColor.*;


public class skib1 {
    public ItemStack WealthP5T2() {
        ItemStack Gem = new ItemStack(Material.PRISMARINE_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.setDisplayName(ChatColor.of("#0EC912") + "" + BOLD + "ᴡᴇᴀʟᴛʜ " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.addEnchant(Enchantment.DURABILITY, 1, true);
        GemMEta.setLore(Arrays.asList(
                WHITE + "" + BOLD + "ғᴜᴇʟ ᴀ             if (item.getItemMeta().getDisplayName().contains(ChatColor.of(\"#A01FFF\") + \"\" + BOLD + \"ᴀsᴛʀᴀ \"))\n" +
                        "                currentgem = \"astra\";ᴇᴍᴘɪʀᴇ",
                WHITE + "(" + ChatColor.of("#57FFC7") + "Pristine"
                        + WHITE + " + "
                        + ChatColor.of("#96FFD9") + "5" + ")",
                WHITE + "",
                ChatColor.of("#0EC912") + "🔮 " + ChatColor.of("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                GRAY + "- Hero ChatColor.of the village",
                GRAY + "- Luck",
                GRAY + "- Enchants Mending",
                GRAY + "- Enchants Fortune",
                GRAY + "- Enchants Looting",
                GRAY + "- Bonus Ores",
                GRAY + "- Extra EXP",
                GRAY + "- Durability Chip",
                GRAY + "- Double Debris",
                WHITE + " ",
                ChatColor.of("#0EC912") + "🔮 " + ChatColor.of("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                GRAY + "- " + ChatColor.of("#0EC912") + "Pockets",
                WHITE + "",
                ChatColor.of("#0EC912") + "🔮 " + ChatColor.of("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                GRAY + "-" + WHITE + "\uD83C\uDF40 " + ChatColor.of("#FFC642") + "ᴜɴғᴏʀᴛᴜɴᴇ " + DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                GRAY + "-" + WHITE + "\uD83C\uDF40 " + ChatColor.of("#FFC642") + "ɪᴛᴇᴍ ʟᴏᴄᴋ " + DARK_RED + "\uD83E\uDD3C",
                WHITE + "",
                GRAY + "-" + WHITE + "\uD83D\uDCB8 " + ChatColor.of("#FFC642") + "ʀɪᴄʜ ʀᴜsʜ" + GREEN + "\uD83E\uDDD1\uD83C\uDFFB",
                GRAY + "-" + WHITE + "\uD83D\uDCB8 " + ChatColor.of("#FFC642") + "ᴀᴍʟɪғɪᴄᴀᴛɪᴏɴ" + GREEN + "\uD83E\uDD3C"
        ));
        GemMEta.setCustomModelData(12);
        Gem.setItemMeta(GemMEta);
        return Gem;
    }

    public ItemStack WealthP4T2() {
        ItemStack Gem = new ItemStack(Material.PRISMARINE_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.setDisplayName(ChatColor.of("#0EC912") + "" + BOLD + "ᴡᴇᴀʟᴛʜ " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(Arrays.asList(
                WHITE + "" + BOLD + "ғᴜᴇʟ ᴀ ᴇᴍᴘɪʀᴇ",
                WHITE + "(" + ChatColor.of("#57FFC7") + "Pristine"
                        + WHITE + " + "
                        + ChatColor.of("#96FFD9") + "4" + ")",
                WHITE + "",
                ChatColor.of("#0EC912") + "🔮 " + ChatColor.of("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                GRAY + "- Hero ChatColor.of the village",
                GRAY + "- Luck",
                GRAY + "- Enchants Mending",
                GRAY + "- Enchants Fortune",
                GRAY + "- Enchants Looting",
                GRAY + "- Bonus Ores",
                GRAY + "- Extra EXP",
                GRAY + "- Durability Chip",
                GRAY + "- Double Debris",
                WHITE + " ",
                ChatColor.of("#0EC912") + "🔮 " + ChatColor.of("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                GRAY + "- " + ChatColor.of("#0EC912") + "Pockets",
                WHITE + "",
                ChatColor.of("#0EC912") + "🔮 " + ChatColor.of("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                GRAY + "-" + WHITE + "\uD83C\uDF40 " + ChatColor.of("#FFC642") + "ᴜɴғᴏʀᴛᴜɴᴇ " + DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                GRAY + "-" + WHITE + "\uD83C\uDF40 " + ChatColor.of("#FFC642") + "ɪᴛᴇᴍ ʟᴏᴄᴋ " + DARK_RED + "\uD83E\uDD3C",
                WHITE + "",
                GRAY + "-" + WHITE + "\uD83D\uDCB8 " + ChatColor.of("#FFC642") + "ʀɪᴄʜ ʀᴜsʜ" + GREEN + "\uD83E\uDDD1\uD83C\uDFFB",
                GRAY + "-" + WHITE + "\uD83D\uDCB8 " + ChatColor.of("#FFC642") + "ᴀᴍʟɪғɪᴄᴀᴛɪᴏɴ" + GREEN + "\uD83E\uDD3C"
        ));
        GemMEta.setCustomModelData(12);
        Gem.setItemMeta(GemMEta);
        return Gem;
    }

    public ItemStack WealthP3T2() {
        ItemStack Gem = new ItemStack(Material.PRISMARINE_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.setDisplayName(ChatColor.of("#0EC912") + "" + BOLD + "ᴡᴇᴀʟᴛʜ " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(Arrays.asList(
                WHITE + "" + BOLD + "ғᴜᴇʟ ᴀ ᴇᴍᴘɪʀᴇ",
                WHITE + "(" + ChatColor.of("#57FFC7") + "Pristine"
                        + WHITE + " + "
                        + ChatColor.of("#96FFD9") + "3" + ")",
                WHITE + "",
                ChatColor.of("#0EC912") + "🔮 " + ChatColor.of("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                GRAY + "- Hero ChatColor.of the village",
                GRAY + "- Luck",
                GRAY + "- Enchants Mending",
                GRAY + "- Enchants Fortune",
                GRAY + "- Enchants Looting",
                GRAY + "- Bonus Ores",
                GRAY + "- Extra EXP",
                GRAY + "- Durability Chip",
                GRAY + "- Double Debris",
                WHITE + " ",
                ChatColor.of("#0EC912") + "🔮 " + ChatColor.of("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                GRAY + "- " + ChatColor.of("#0EC912") + "Pockets",
                WHITE + "",
                ChatColor.of("#0EC912") + "🔮 " + ChatColor.of("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                GRAY + "-" + WHITE + "\uD83C\uDF40 " + ChatColor.of("#FFC642") + "ᴜɴғᴏʀᴛᴜɴᴇ " + DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                GRAY + "-" + WHITE + "\uD83C\uDF40 " + ChatColor.of("#FFC642") + "ɪᴛᴇᴍ ʟᴏᴄᴋ " + DARK_RED + "\uD83E\uDD3C",
                WHITE + "",
                GRAY + "-" + WHITE + "\uD83D\uDCB8 " + ChatColor.of("#FFC642") + "ʀɪᴄʜ ʀᴜsʜ" + GREEN + "\uD83E\uDDD1\uD83C\uDFFB",
                GRAY + "-" + WHITE + "\uD83D\uDCB8 " + ChatColor.of("#FFC642") + "ᴀᴍʟɪғɪᴄᴀᴛɪᴏɴ" + GREEN + "\uD83E\uDD3C"
        ));
        GemMEta.setCustomModelData(12);
        Gem.setItemMeta(GemMEta);
        return Gem;
    }

    public ItemStack WealthP2T2() {
        ItemStack Gem = new ItemStack(Material.PRISMARINE_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.setDisplayName(ChatColor.of("#0EC912") + "" + BOLD + "ᴡᴇᴀʟᴛʜ " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(Arrays.asList(
                WHITE + "" + BOLD + "ғᴜᴇʟ ᴀ ᴇᴍᴘɪʀᴇ",
                WHITE + "(" + ChatColor.of("#57FFC7") + "Pristine"
                        + WHITE + " + "
                        + ChatColor.of("#96FFD9") + "2" + ")",
                WHITE + "",
                ChatColor.of("#0EC912") + "🔮 " + ChatColor.of("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                GRAY + "- Hero ChatColor.of the village",
                GRAY + "- Luck",
                GRAY + "- Enchants Mending",
                GRAY + "- Enchants Fortune",
                GRAY + "- Enchants Looting",
                GRAY + "- Bonus Ores",
                GRAY + "- Extra EXP",
                GRAY + "- Durability Chip",
                GRAY + "- Double Debris",
                WHITE + " ",
                ChatColor.of("#0EC912") + "🔮 " + ChatColor.of("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                GRAY + "- " + ChatColor.of("#0EC912") + "Pockets",
                WHITE + "",
                ChatColor.of("#0EC912") + "🔮 " + ChatColor.of("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                GRAY + "-" + WHITE + "\uD83C\uDF40 " + ChatColor.of("#FFC642") + "ᴜɴғᴏʀᴛᴜɴᴇ " + DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                GRAY + "-" + WHITE + "\uD83C\uDF40 " + ChatColor.of("#FFC642") + "ɪᴛᴇᴍ ʟᴏᴄᴋ " + DARK_RED + "\uD83E\uDD3C",
                WHITE + "",
                GRAY + "-" + WHITE + "\uD83D\uDCB8 " + ChatColor.of("#FFC642") + "ʀɪᴄʜ ʀᴜsʜ" + GREEN + "\uD83E\uDDD1\uD83C\uDFFB",
                GRAY + "-" + WHITE + "\uD83D\uDCB8 " + ChatColor.of("#FFC642") + "ᴀᴍʟɪғɪᴄᴀᴛɪᴏɴ" + GREEN + "\uD83E\uDD3C"
        ));
        GemMEta.setCustomModelData(12);
        Gem.setItemMeta(GemMEta);
        return Gem;
    }

    public ItemStack WealthP1T2() {
        ItemStack Gem = new ItemStack(Material.PRISMARINE_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.setDisplayName(ChatColor.of("#0EC912") + "" + BOLD + "ᴡᴇᴀʟᴛʜ " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(Arrays.asList(
                WHITE + "" + BOLD + "ғᴜᴇʟ ᴀ ᴇᴍᴘɪʀᴇ",
                WHITE + "(" + ChatColor.of("#57FFC7") + "Pristine"
                        + WHITE + " + "
                        + ChatColor.of("#96FFD9") + "1" + ")",
                WHITE + "",
                ChatColor.of("#0EC912") + "🔮 " + ChatColor.of("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                GRAY + "- Hero ChatColor.of the village",
                GRAY + "- Luck",
                GRAY + "- Enchants Mending",
                GRAY + "- Enchants Fortune",
                GRAY + "- Enchants Looting",
                GRAY + "- Bonus Ores",
                GRAY + "- Extra EXP",
                GRAY + "- Durability Chip",
                GRAY + "- Double Debris",
                WHITE + " ",
                ChatColor.of("#0EC912") + "🔮 " + ChatColor.of("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                GRAY + "- " + ChatColor.of("#0EC912") + "Pockets",
                WHITE + "",
                ChatColor.of("#0EC912") + "🔮 " + ChatColor.of("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                GRAY + "-" + WHITE + "\uD83C\uDF40 " + ChatColor.of("#FFC642") + "ᴜɴғᴏʀᴛᴜɴᴇ " + DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                GRAY + "-" + WHITE + "\uD83C\uDF40 " + ChatColor.of("#FFC642") + "ɪᴛᴇᴍ ʟᴏᴄᴋ " + DARK_RED + "\uD83E\uDD3C",
                WHITE + "",
                GRAY + "-" + WHITE + "\uD83D\uDCB8 " + ChatColor.of("#FFC642") + "ʀɪᴄʜ ʀᴜsʜ" + GREEN + "\uD83E\uDDD1\uD83C\uDFFB",
                GRAY + "-" + WHITE + "\uD83D\uDCB8 " + ChatColor.of("#FFC642") + "ᴀᴍʟɪғɪᴄᴀᴛɪᴏɴ" + GREEN + "\uD83E\uDD3C"
        ));
        GemMEta.setCustomModelData(12);
        Gem.setItemMeta(GemMEta);
        return Gem;
    }

    public ItemStack WealthPT2() {
        ItemStack Gem = new ItemStack(Material.PRISMARINE_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.setDisplayName(ChatColor.of("#0EC912") + "" + BOLD + "ᴡᴇᴀʟᴛʜ " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(Arrays.asList(
                WHITE + "" + BOLD + "ғᴜᴇʟ ᴀ ᴇᴍᴘɪʀᴇ",
                WHITE + "(" + ChatColor.of("#57FFC7") + "Pristine" + WHITE + ")",
                WHITE + "",
                ChatColor.of("#0EC912") + "🔮 " + ChatColor.of("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                GRAY + "- Hero ChatColor.of the village",
                GRAY + "- Luck",
                GRAY + "- Enchants Mending",
                GRAY + "- Enchants Fortune",
                GRAY + "- Enchants Looting",
                GRAY + "- Bonus Ores",
                GRAY + "- Extra EXP",
                GRAY + "- Durability Chip",
                GRAY + "- Double Debris",
                WHITE + " ",
                ChatColor.of("#0EC912") + "🔮 " + ChatColor.of("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                GRAY + "- " + ChatColor.of("#0EC912") + "Pockets",
                WHITE + "",
                ChatColor.of("#0EC912") + "🔮 " + ChatColor.of("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                GRAY + "-" + WHITE + "\uD83C\uDF40 " + ChatColor.of("#FFC642") + "ᴜɴғᴏʀᴛᴜɴᴇ " + DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                GRAY + "-" + WHITE + "\uD83C\uDF40 " + ChatColor.of("#FFC642") + "ɪᴛᴇᴍ ʟᴏᴄᴋ " + DARK_RED + "\uD83E\uDD3C",
                WHITE + "",
                GRAY + "-" + WHITE + "\uD83D\uDCB8 " + ChatColor.of("#FFC642") + "ʀɪᴄʜ ʀᴜsʜ" + GREEN + "\uD83E\uDDD1\uD83C\uDFFB",
                GRAY + "-" + WHITE + "\uD83D\uDCB8 " + ChatColor.of("#FFC642") + "ᴀᴍʟɪғɪᴄᴀᴛɪᴏɴ" + GREEN + "\uD83E\uDD3C"
        ));
        GemMEta.setCustomModelData(12);
        Gem.setItemMeta(GemMEta);
        return Gem;
    }

    public ItemStack WealthST2() {
        ItemStack Gem = new ItemStack(Material.PRISMARINE_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.setDisplayName(ChatColor.of("#0EC912") + "" + BOLD + "ᴡᴇᴀʟᴛʜ " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(Arrays.asList(
                WHITE + "" + BOLD + "ғᴜᴇʟ ᴀ ᴇᴍᴘɪʀᴇ",
                WHITE + "(" + ChatColor.of("#57FF8F") + "Scratched" + WHITE + ")",
                WHITE + "",
                ChatColor.of("#0EC912") + "🔮 " + ChatColor.of("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                GRAY + "- Hero ChatColor.of the village",
                GRAY + "- Enchants Mending",
                GRAY + "- Enchants Looting",
                GRAY + "- Bonus Ores",
                GRAY + "- Durability Chip",
                WHITE + " ",
                ChatColor.of("#0EC912") + "🔮 " + ChatColor.of("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                GRAY + "- " + ChatColor.of("#0EC912") + "Pockets",
                WHITE + "",
                ChatColor.of("#0EC912") + "🔮 " + ChatColor.of("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                GRAY + "-" + WHITE + "\uD83C\uDF40 " + ChatColor.of("#FFC642") + "ᴜɴғᴏʀᴛᴜɴᴇ " + DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                GRAY + "-" + WHITE + "\uD83C\uDF40 " + ChatColor.of("#FFC642") + "ɪᴛᴇᴍ ʟᴏᴄᴋ " + DARK_RED + "\uD83E\uDD3C",
                WHITE + "",
                GRAY + "-" + WHITE + "\uD83D\uDCB8 " + ChatColor.of("#FFC642") + "ʀɪᴄʜ ʀᴜsʜ" + GREEN + "\uD83E\uDDD1\uD83C\uDFFB",
                GRAY + "-" + WHITE + "\uD83D\uDCB8 " + ChatColor.of("#FFC642") + "ᴀᴍʟɪғɪᴄᴀᴛɪᴏɴ" + GREEN + "\uD83E\uDD3C"
        ));
        GemMEta.setCustomModelData(32);
        Gem.setItemMeta(GemMEta);
        return Gem;
    }

    public ItemStack WealthCT2() {
        ItemStack Gem = new ItemStack(Material.PRISMARINE_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.setDisplayName(ChatColor.of("#0EC912") + "" + BOLD + "ᴡᴇᴀʟᴛʜ " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(Arrays.asList(
                WHITE + "" + BOLD + "ғᴜᴇʟ ᴀ ᴇᴍᴘɪʀᴇ",
                WHITE + "(" + ChatColor.of("#7958DB") + "Cracked" + WHITE + ")",
                WHITE + "",
                ChatColor.of("#0EC912") + "🔮 " + ChatColor.of("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                GRAY + "- Enchants Looting",
                GRAY + "- Bonus Ores",
                GRAY + "- Durability Chip",
                WHITE + " ",
                ChatColor.of("#0EC912") + "🔮 " + ChatColor.of("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                GRAY + "- " + ChatColor.of("#0EC912") + "Pockets",
                WHITE + "",
                ChatColor.of("#0EC912") + "🔮 " + ChatColor.of("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                GRAY + "-" + WHITE + "\uD83C\uDF40 " + ChatColor.of("#FFC642") + "ᴜɴғᴏʀᴛᴜɴᴇ " + DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                GRAY + "-" + WHITE + "\uD83C\uDF40 " + ChatColor.of("#FFC642") + "ɪᴛᴇᴍ ʟᴏᴄᴋ " + DARK_RED + "\uD83E\uDD3C",
                WHITE + "",
                GRAY + "-" + WHITE + "\uD83D\uDCB8 " + ChatColor.of("#FFC642") + "ʀɪᴄʜ ʀᴜsʜ" + GREEN + "\uD83E\uDDD1\uD83C\uDFFB",
                GRAY + "-" + WHITE + "\uD83D\uDCB8 " + ChatColor.of("#FFC642") + "ᴀᴍʟɪғɪᴄᴀᴛɪᴏɴ" + GREEN + "\uD83E\uDD3C"
        ));
        GemMEta.setCustomModelData(52);
        Gem.setItemMeta(GemMEta);
        return Gem;
    }

    public ItemStack WealthDT2() {
        ItemStack Gem = new ItemStack(Material.PRISMARINE_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.setDisplayName(ChatColor.of("#0EC912") + "" + BOLD + "ᴡᴇᴀʟᴛʜ " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(Arrays.asList(
                WHITE + "" + BOLD + "ғᴜᴇʟ ᴀ ᴇᴍᴘɪʀᴇ",
                WHITE + "(" + ChatColor.of("#FFC929") + "Damaged" + WHITE + ")",
                WHITE + "",
                ChatColor.of("#0EC912") + "🔮 " + ChatColor.of("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                GRAY + "- Durability Chip",
                WHITE + " ",
                ChatColor.of("#0EC912") + "🔮 " + ChatColor.of("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                GRAY + "- " + ChatColor.of("#0EC912") + "Pockets",
                WHITE + "",
                ChatColor.of("#0EC912") + "🔮 " + ChatColor.of("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                GRAY + "-" + WHITE + "\uD83C\uDF40 " + ChatColor.of("#FFC642") + "ᴜɴғᴏʀᴛᴜɴᴇ " + DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                GRAY + "-" + WHITE + "\uD83C\uDF40 " + ChatColor.of("#FFC642") + "ɪᴛᴇᴍ ʟᴏᴄᴋ " + DARK_RED + "\uD83E\uDD3C",
                WHITE + "",
                GRAY + "-" + WHITE + "\uD83D\uDCB8 " + ChatColor.of("#FFC642") + "ʀɪᴄʜ ʀᴜsʜ" + GREEN + "\uD83E\uDDD1\uD83C\uDFFB",
                GRAY + "-" + WHITE + "\uD83D\uDCB8 " + ChatColor.of("#FFC642") + "ᴀᴍʟɪғɪᴄᴀᴛɪᴏɴ" + GREEN + "\uD83E\uDD3C"
        ));
        GemMEta.setCustomModelData(72);
        Gem.setItemMeta(GemMEta);
        return Gem;
    }

    public ItemStack WealthRT2() {
        ItemStack Gem = new ItemStack(Material.PRISMARINE_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.setDisplayName(ChatColor.of("#0EC912") + "" + BOLD + "ᴡᴇᴀʟᴛʜ " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(Arrays.asList(
                WHITE + "" + BOLD + "ғᴜᴇʟ ᴀ ᴇᴍᴘɪʀᴇ",
                WHITE + "(" + ChatColor.of("#FF1111") + "Ruined" + WHITE + ")",
                WHITE + "",
                ChatColor.of("#0EC912") + "🔮 " + ChatColor.of("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                GRAY + "No Passives",
                WHITE + " ",
                ChatColor.of("#0EC912") + "🔮 " + ChatColor.of("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                GRAY + "- " + ChatColor.of("#0EC912") + "Pockets",
                WHITE + "",
                ChatColor.of("#0EC912") + "🔮 " + ChatColor.of("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                GRAY + "-" + WHITE + "\uD83C\uDF40 " + ChatColor.of("#FFC642") + "ᴜɴғᴏʀᴛᴜɴᴇ " + DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                GRAY + "-" + WHITE + "\uD83C\uDF40 " + ChatColor.of("#FFC642") + "ɪᴛᴇᴍ ʟᴏᴄᴋ " + DARK_RED + "\uD83E\uDD3C",
                WHITE + "",
                GRAY + "-" + WHITE + "\uD83D\uDCB8 " + ChatColor.of("#FFC642") + "ʀɪᴄʜ ʀᴜsʜ" + GREEN + "\uD83E\uDDD1\uD83C\uDFFB",
                GRAY + "-" + WHITE + "\uD83D\uDCB8 " + ChatColor.of("#FFC642") + "ᴀᴍʟɪғɪᴄᴀᴛɪᴏɴ" + GREEN + "\uD83E\uDD3C"
        ));
        GemMEta.setCustomModelData(92);
        Gem.setItemMeta(GemMEta);
        return Gem;
    }

    public ItemStack WealthBT2() {
        ItemStack Gem = new ItemStack(Material.PRISMARINE_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.setDisplayName(ChatColor.of("#0EC912") + "" + BOLD + "ᴡᴇᴀʟᴛʜ " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(Arrays.asList(
                WHITE + "" + BOLD + "ᴜsᴇʟᴇss"
        ));
        GemMEta.setCustomModelData(99);
        Gem.setItemMeta(GemMEta);
        return Gem;

    }


    public ItemStack PuffP5T2() {
        ItemStack Gem = new ItemStack(Material.PRISMARINE_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.setDisplayName(WHITE + "" + BOLD + "ᴘᴜғғ " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.addEnchant(Enchantment.DURABILITY, 1, true);
        GemMEta.setLore(Arrays.asList(
                WHITE + "" + BOLD + "ʙᴇ ᴛʜᴇ ʙɪɢɢᴇsᴛ ʙɪʀᴅ",
                WHITE + "(" + ChatColor.of("#57FFC7") + "Pristine"
                        + WHITE + " + "
                        + ChatColor.of("#96FFD9") + "5" + ")",
                WHITE + " ",
                WHITE + "🔮 " + ChatColor.of("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                GRAY + "- Fall Damage immunity",
                GRAY + "- Enchants Power",
                GRAY + "- Enchants Punch",
                GRAY + "- Sculk Silence",
                GRAY + "- Crop Tramp-Less",
                WHITE + " ",
                WHITE + "🔮 " + ChatColor.of("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                GRAY + "- " + WHITE + "Double Jump",
                WHITE + " ",
                WHITE + "🔮 " + ChatColor.of("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                GRAY + "- " + WHITE + "☁" + ChatColor.of("#FAE7E6") + " ʙʀᴇᴇᴢʏ ʙᴀsʜ " + DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                GRAY + "- " + WHITE + "☁" + ChatColor.of("#FAE7E6") + " ʙʀᴇᴇᴢʏ ʙᴀsʜ " + DARK_RED + "\uD83E\uDD3C",
                WHITE + "",
                GRAY + "- " + WHITE + "⏫" + ChatColor.of("#EFEFEF") + " ᴅᴀsʜ"
        ));
        GemMEta.setCustomModelData(6);
        Gem.setItemMeta(GemMEta);
        return Gem;

    }

    public ItemStack PuffP4T2() {
        ItemStack Gem = new ItemStack(Material.PRISMARINE_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.setDisplayName(WHITE + "" + BOLD + "ᴘᴜғғ " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(Arrays.asList(
                WHITE + "" + BOLD + "ʙᴇ ᴛʜᴇ ʙɪɢɢᴇsᴛ ʙɪʀᴅ",
                WHITE + "(" + ChatColor.of("#57FFC7") + "Pristine"
                        + WHITE + " + "
                        + ChatColor.of("#96FFD9") + "4" + ")",
                WHITE + " ",
                WHITE + "🔮 " + ChatColor.of("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                GRAY + "- Fall Damage immunity",
                GRAY + "- Enchants Power",
                GRAY + "- Enchants Punch",
                GRAY + "- Sculk Silence",
                GRAY + "- Crop Tramp-Less",
                WHITE + " ",
                WHITE + "🔮 " + ChatColor.of("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                GRAY + "- " + WHITE + "Double Jump",
                WHITE + " ",
                WHITE + "🔮 " + ChatColor.of("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                GRAY + "- " + WHITE + "☁" + ChatColor.of("#FAE7E6") + " ʙʀᴇᴇᴢʏ ʙᴀsʜ " + DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                GRAY + "- " + WHITE + "☁" + ChatColor.of("#FAE7E6") + " ʙʀᴇᴇᴢʏ ʙᴀsʜ " + DARK_RED + "\uD83E\uDD3C",
                WHITE + "",
                GRAY + "- " + WHITE + "⏫" + ChatColor.of("#EFEFEF") + " ᴅᴀsʜ"
        ));
        GemMEta.setCustomModelData(6);
        Gem.setItemMeta(GemMEta);
        return Gem;

    }

    public ItemStack PuffP3T2() {
        ItemStack Gem = new ItemStack(Material.PRISMARINE_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.setDisplayName(WHITE + "" + BOLD + "ᴘᴜғғ " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(Arrays.asList(
                WHITE + "" + BOLD + "ʙᴇ ᴛʜᴇ ʙɪɢɢᴇsᴛ ʙɪʀᴅ",
                WHITE + "(" + ChatColor.of("#57FFC7") + "Pristine"
                        + WHITE + " + "
                        + ChatColor.of("#96FFD9") + "3" + ")",
                WHITE + " ",
                WHITE + "🔮 " + ChatColor.of("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                GRAY + "- Fall Damage immunity",
                GRAY + "- Enchants Power",
                GRAY + "- Enchants Punch",
                GRAY + "- Sculk Silence",
                GRAY + "- Crop Tramp-Less",
                WHITE + " ",
                WHITE + "🔮 " + ChatColor.of("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                GRAY + "- " + WHITE + "Double Jump",
                WHITE + " ",
                WHITE + "🔮 " + ChatColor.of("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                GRAY + "- " + WHITE + "☁" + ChatColor.of("#FAE7E6") + " ʙʀᴇᴇᴢʏ ʙᴀsʜ " + DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                GRAY + "- " + WHITE + "☁" + ChatColor.of("#FAE7E6") + " ʙʀᴇᴇᴢʏ ʙᴀsʜ " + DARK_RED + "\uD83E\uDD3C",
                WHITE + "",
                GRAY + "- " + WHITE + "⏫" + ChatColor.of("#EFEFEF") + " ᴅᴀsʜ"
        ));
        GemMEta.setCustomModelData(6);
        Gem.setItemMeta(GemMEta);
        return Gem;

    }

    public ItemStack PuffP2T2() {
        ItemStack Gem = new ItemStack(Material.PRISMARINE_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.setDisplayName(WHITE + "" + BOLD + "ᴘᴜғғ " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(Arrays.asList(
                WHITE + "" + BOLD + "ʙᴇ ᴛʜᴇ ʙɪɢɢᴇsᴛ ʙɪʀᴅ",
                WHITE + "(" + ChatColor.of("#57FFC7") + "Pristine"
                        + WHITE + " + "
                        + ChatColor.of("#96FFD9") + "2" + ")",
                WHITE + " ",
                WHITE + "🔮 " + ChatColor.of("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                GRAY + "- Fall Damage immunity",
                GRAY + "- Enchants Power",
                GRAY + "- Enchants Punch",
                GRAY + "- Sculk Silence",
                GRAY + "- Crop Tramp-Less",
                WHITE + " ",
                WHITE + "🔮 " + ChatColor.of("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                GRAY + "- " + WHITE + "Double Jump",
                WHITE + " ",
                WHITE + "🔮 " + ChatColor.of("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                GRAY + "- " + WHITE + "☁" + ChatColor.of("#FAE7E6") + " ʙʀᴇᴇᴢʏ ʙᴀsʜ " + DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                GRAY + "- " + WHITE + "☁" + ChatColor.of("#FAE7E6") + " ʙʀᴇᴇᴢʏ ʙᴀsʜ " + DARK_RED + "\uD83E\uDD3C",
                WHITE + "",
                GRAY + "- " + WHITE + "⏫" + ChatColor.of("#EFEFEF") + " ᴅᴀsʜ"
        ));
        GemMEta.setCustomModelData(6);
        Gem.setItemMeta(GemMEta);
        return Gem;

    }

    public ItemStack PuffP1T2() {
        ItemStack Gem = new ItemStack(Material.PRISMARINE_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.setDisplayName(WHITE + "" + BOLD + "ᴘᴜғғ " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(Arrays.asList(
                WHITE + "" + BOLD + "ʙᴇ ᴛʜᴇ ʙɪɢɢᴇsᴛ ʙɪʀᴅ",
                WHITE + "(" + ChatColor.of("#57FFC7") + "Pristine"
                        + WHITE + " + "
                        + ChatColor.of("#96FFD9") + "1" + ")",
                WHITE + " ",
                WHITE + "🔮 " + ChatColor.of("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                GRAY + "- Fall Damage immunity",
                GRAY + "- Enchants Power",
                GRAY + "- Enchants Punch",
                GRAY + "- Sculk Silence",
                GRAY + "- Crop Tramp-Less",
                WHITE + " ",
                WHITE + "🔮 " + ChatColor.of("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                GRAY + "- " + WHITE + "Double Jump",
                WHITE + " ",
                WHITE + "🔮 " + ChatColor.of("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                GRAY + "- " + WHITE + "☁" + ChatColor.of("#FAE7E6") + " ʙʀᴇᴇᴢʏ ʙᴀsʜ " + DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                GRAY + "- " + WHITE + "☁" + ChatColor.of("#FAE7E6") + " ʙʀᴇᴇᴢʏ ʙᴀsʜ " + DARK_RED + "\uD83E\uDD3C",
                WHITE + "",
                GRAY + "- " + WHITE + "⏫" + ChatColor.of("#EFEFEF") + " ᴅᴀsʜ"
        ));
        GemMEta.setCustomModelData(6);
        Gem.setItemMeta(GemMEta);
        return Gem;

    }

    public ItemStack PuffPT2() {
        ItemStack Gem = new ItemStack(Material.PRISMARINE_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.setDisplayName(WHITE + "" + BOLD + "ᴘᴜғғ " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(Arrays.asList(
                WHITE + "" + BOLD + "ʙᴇ ᴛʜᴇ ʙɪɢɢᴇsᴛ ʙɪʀᴅ",
                WHITE + "(" + ChatColor.of("#57FFC7") + "Pristine" + WHITE + ")",
                WHITE + " ",
                WHITE + "🔮 " + ChatColor.of("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                GRAY + "- Fall Damage immunity",
                GRAY + "- Enchants Power",
                GRAY + "- Enchants Punch",
                GRAY + "- Sculk Silence",
                GRAY + "- Crop Tramp-Less",
                WHITE + " ",
                WHITE + "🔮 " + ChatColor.of("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                GRAY + "- " + WHITE + "Double Jump",
                WHITE + " ",
                WHITE + "🔮 " + ChatColor.of("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                GRAY + "- " + WHITE + "☁" + ChatColor.of("#FAE7E6") + " ʙʀᴇᴇᴢʏ ʙᴀsʜ " + DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                GRAY + "- " + WHITE + "☁" + ChatColor.of("#FAE7E6") + " ʙʀᴇᴇᴢʏ ʙᴀsʜ " + DARK_RED + "\uD83E\uDD3C",
                WHITE + "",
                GRAY + "- " + WHITE + "⏫" + ChatColor.of("#EFEFEF") + " ᴅᴀsʜ"
        ));
        GemMEta.setCustomModelData(6);
        Gem.setItemMeta(GemMEta);
        return Gem;

    }

    public ItemStack PuffST2() {
        ItemStack Gem = new ItemStack(Material.PRISMARINE_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.setDisplayName(WHITE + "" + BOLD + "ᴘᴜғғ " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(Arrays.asList(
                WHITE + "" + BOLD + "ʙᴇ ᴛʜᴇ ʙɪɢɢᴇsᴛ ʙɪʀᴅ",
                WHITE  + "(" + ChatColor.of("#57FF8F") + "Scratched" + WHITE  + ")",
                WHITE + " ",
                WHITE + "🔮 " + ChatColor.of("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                GRAY + "- Fall Damage immunity",
                GRAY + "- Enchants Power",
                GRAY + "- Enchants Punch",
                GRAY + "- Crop Tramp-Less",
                WHITE + " ",
                WHITE + "🔮 " + ChatColor.of("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                GRAY + "- " + WHITE + "Double Jump",
                WHITE + " ",
                WHITE + "🔮 " + ChatColor.of("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                GRAY + "- " + WHITE + "☁" + ChatColor.of("#FAE7E6") + " ʙʀᴇᴇᴢʏ ʙᴀsʜ " + DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                GRAY + "- " + WHITE + "☁" + ChatColor.of("#FAE7E6") + " ʙʀᴇᴇᴢʏ ʙᴀsʜ " + DARK_RED + "\uD83E\uDD3C",
                WHITE + "",
                GRAY + "- " + WHITE + "⏫" + ChatColor.of("#EFEFEF") + " ᴅᴀsʜ"
        ));
        GemMEta.setCustomModelData(26);
        Gem.setItemMeta(GemMEta);
        return Gem;

    }

    public ItemStack PuffCT2() {
        ItemStack Gem = new ItemStack(Material.PRISMARINE_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.setDisplayName(WHITE + "" + BOLD + "ᴘᴜғғ " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(Arrays.asList(
                WHITE + "" + BOLD + "ʙᴇ ᴛʜᴇ ʙɪɢɢᴇsᴛ ʙɪʀᴅ",
                WHITE  + "(" + ChatColor.of("#7958DB") + "Cracked" + WHITE  + ")",
                WHITE + " ",
                WHITE + "🔮 " + ChatColor.of("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                GRAY + "- Fall Damage immunity",
                GRAY + "- Enchants Punch",
                GRAY + "- Crop Tramp-Less",
                WHITE + " ",
                WHITE + "🔮 " + ChatColor.of("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                GRAY + "- " + WHITE + "Double Jump",
                WHITE + " ",
                WHITE + "🔮 " + ChatColor.of("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                GRAY + "- " + WHITE + "☁" + ChatColor.of("#FAE7E6") + " ʙʀᴇᴇᴢʏ ʙᴀsʜ " + DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                GRAY + "- " + WHITE + "☁" + ChatColor.of("#FAE7E6") + " ʙʀᴇᴇᴢʏ ʙᴀsʜ " + DARK_RED + "\uD83E\uDD3C",
                WHITE + "",
                GRAY + "- " + WHITE + "⏫" + ChatColor.of("#EFEFEF") + " ᴅᴀsʜ"
        ));
        GemMEta.setCustomModelData(46);
        Gem.setItemMeta(GemMEta);
        return Gem;

    }

    public ItemStack PuffDT2() {
        ItemStack Gem = new ItemStack(Material.PRISMARINE_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.setDisplayName(WHITE + "" + BOLD + "ᴘᴜғғ " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(Arrays.asList(
                WHITE + "" + BOLD + "ʙᴇ ᴛʜᴇ ʙɪɢɢᴇsᴛ ʙɪʀᴅ",
                WHITE  + "(" + ChatColor.of("#FFC929") + "Damaged" + WHITE  + ")",
                WHITE + " ",
                WHITE + "🔮 " + ChatColor.of("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                GRAY + "- Fall Damage immunity",
                GRAY + "  - (Not Dripstone Immune)",
                GRAY + "- Crop Tramp-Less",
                WHITE + " ",
                WHITE + "🔮 " + ChatColor.of("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                GRAY + "- " + WHITE + "Double Jump",
                WHITE + " ",
                WHITE + "🔮 " + ChatColor.of("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                GRAY + "- " + WHITE + "☁" + ChatColor.of("#FAE7E6") + " ʙʀᴇᴇᴢʏ ʙᴀsʜ " + DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                GRAY + "- " + WHITE + "☁" + ChatColor.of("#FAE7E6") + " ʙʀᴇᴇᴢʏ ʙᴀsʜ " + DARK_RED + "\uD83E\uDD3C",
                WHITE + "",
                GRAY + "- " + WHITE + "⏫" + ChatColor.of("#EFEFEF") + " ᴅᴀsʜ"
        ));
        GemMEta.setCustomModelData(66);
        Gem.setItemMeta(GemMEta);
        return Gem;

    }

    public ItemStack PuffRT2() {
        ItemStack Gem = new ItemStack(Material.PRISMARINE_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.setDisplayName(WHITE + "" + BOLD + "ᴘᴜғғ " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(Arrays.asList(
                WHITE + "" + BOLD + "ʙᴇ ᴛʜᴇ ʙɪɢɢᴇsᴛ ʙɪʀᴅ",
                WHITE  + "(" + ChatColor.of("#FF1111") + "Ruined" + WHITE  + ")",
                WHITE + " ",
                WHITE + "🔮 " + ChatColor.of("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                GRAY + "- No Passives",
                WHITE + " ",
                WHITE + "🔮 " + ChatColor.of("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                GRAY + "- " + WHITE + "Double Jump",
                WHITE + " ",
                WHITE + "🔮 " + ChatColor.of("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                GRAY + "- " + WHITE + "☁" + ChatColor.of("#FAE7E6") + " ʙʀᴇᴇᴢʏ ʙᴀsʜ " + DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                GRAY + "- " + WHITE + "☁" + ChatColor.of("#FAE7E6") + " ʙʀᴇᴇᴢʏ ʙᴀsʜ " + DARK_RED + "\uD83E\uDD3C",
                WHITE + "",
                GRAY + "- " + WHITE + "⏫" + ChatColor.of("#EFEFEF") + " ᴅᴀsʜ"
        ));
        GemMEta.setCustomModelData(66);
        Gem.setItemMeta(GemMEta);
        return Gem;

    }

    public ItemStack PuffBT2() {
        ItemStack Gem = new ItemStack(Material.PRISMARINE_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.setDisplayName(WHITE + "" + BOLD + "ᴘᴜғғ " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(Arrays.asList(
                WHITE + "" + BOLD + "ᴜsᴇʟᴇss"
        ));
        GemMEta.setCustomModelData(99);
        Gem.setItemMeta(GemMEta);
        return Gem;

    }


    public ItemStack LifeP5T2() {

        ItemStack Gem = new ItemStack(Material.PRISMARINE_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.setDisplayName(ChatColor.of("#FE04B4") + "" + BOLD + "ʟɪғᴇ " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.addEnchant(Enchantment.DURABILITY, 1, true);
        GemMEta.setLore(
                Arrays.asList(
                        WHITE + "" + BOLD + "ᴄᴏɴᴛʀᴏʟ ᴛʜᴇ ʙᴀʟᴀɴᴄᴇ ᴏғ ʟɪғᴇ",
                        WHITE + "(" + ChatColor.of("#57FFC7") + "Pristine"
                                + WHITE + " + "
                                + ChatColor.of("#96FFD9") + "5" + ")",
                        WHITE + " ",
                        ChatColor.of("#FE04B4") + "🔮 " + ChatColor.of("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                        GRAY + "- Green Thumb",
                        GRAY + "- Radiant Fist",
                        GRAY + "- Bonus Saturation",
                        GRAY + "- Bonus Absorption",
                        GRAY + "- Wither Immune",
                        WHITE + " ",
                        ChatColor.of("#FE04B4") + "🔮 " + ChatColor.of("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                        GRAY + "- " + ChatColor.of("#FE04B4") + "Vitalaty Vortex",
                        WHITE + " ",
                        ChatColor.of("#FE04B4") + "🔮 " + ChatColor.of("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                        GRAY + "- " + WHITE + "\uD83D\uDC98" + ChatColor.of("#FF429A") + " ʜᴇᴀʀᴛ ᴅʀᴀɪɴᴇʀ " + DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                        GRAY + "- " + WHITE + "\uD83D\uDC98" + ChatColor.of("#FF429A") + " ʜᴇᴀʀᴛʟᴏᴄᴋ " + DARK_RED + "\uD83E\uDD3C",
                        WHITE + "",
                        GRAY + "- " + WHITE + "\uD83D\uDC96" + ChatColor.of("#B8FFFA") + " ᴄɪʀᴄʟᴇ ᴏғ ʟɪғᴇ " + GREEN + "\uD83E\uDDD1\uD83C\uDFFB",
                        GRAY + "- " + WHITE + "\uD83D\uDC96" + ChatColor.of("#B8FFFA") + " ᴄɪʀᴄʟᴇ ᴏғ ʟɪғᴇ " + GREEN + "\uD83E\uDD3C"
                )
        );
        GemMEta.setCustomModelData(4);
        Gem.setItemMeta(GemMEta);
        return Gem;

    }

    public ItemStack LifeP4T2() {

        ItemStack Gem = new ItemStack(Material.PRISMARINE_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.setDisplayName(ChatColor.of("#FE04B4") + "" + BOLD + "ʟɪғᴇ " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(
                Arrays.asList(
                        WHITE + "" + BOLD + "ᴄᴏɴᴛʀᴏʟ ᴛʜᴇ ʙᴀʟᴀɴᴄᴇ ᴏғ ʟɪғᴇ",
                        WHITE + "(" + ChatColor.of("#57FFC7") + "Pristine"
                                + WHITE + " + "
                                + ChatColor.of("#96FFD9") + "4" + ")",
                        WHITE + " ",
                        ChatColor.of("#FE04B4") + "🔮 " + ChatColor.of("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                        GRAY + "- Green Thumb",
                        GRAY + "- Radiant Fist",
                        GRAY + "- Bonus Saturation",
                        GRAY + "- Bonus Absorption",
                        GRAY + "- Wither Immune",
                        WHITE + " ",
                        ChatColor.of("#FE04B4") + "🔮 " + ChatColor.of("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                        GRAY + "- " + ChatColor.of("#FE04B4") + "Vitalaty Vortex",
                        WHITE + " ",
                        ChatColor.of("#FE04B4") + "🔮 " + ChatColor.of("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                        GRAY + "- " + WHITE + "\uD83D\uDC98" + ChatColor.of("#FF429A") + " ʜᴇᴀʀᴛ ᴅʀᴀɪɴᴇʀ " + DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                        GRAY + "- " + WHITE + "\uD83D\uDC98" + ChatColor.of("#FF429A") + " ʜᴇᴀʀᴛʟᴏᴄᴋ " + DARK_RED + "\uD83E\uDD3C",
                        WHITE + "",
                        GRAY + "- " + WHITE + "\uD83D\uDC96" + ChatColor.of("#B8FFFA") + " ᴄɪʀᴄʟᴇ ᴏғ ʟɪғᴇ " + GREEN + "\uD83E\uDDD1\uD83C\uDFFB",
                        GRAY + "- " + WHITE + "\uD83D\uDC96" + ChatColor.of("#B8FFFA") + " ᴄɪʀᴄʟᴇ ᴏғ ʟɪғᴇ " + GREEN + "\uD83E\uDD3C"
                )
        );
        GemMEta.setCustomModelData(4);
        Gem.setItemMeta(GemMEta);
        return Gem;

    }

    public ItemStack LifeP3T2() {

        ItemStack Gem = new ItemStack(Material.PRISMARINE_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.setDisplayName(ChatColor.of("#FE04B4") + "" + BOLD + "ʟɪғᴇ " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(
                Arrays.asList(
                        WHITE + "" + BOLD + "ᴄᴏɴᴛʀᴏʟ ᴛʜᴇ ʙᴀʟᴀɴᴄᴇ ᴏғ ʟɪғᴇ",
                        WHITE + "(" + ChatColor.of("#57FFC7") + "Pristine"
                                + WHITE + " + "
                                + ChatColor.of("#96FFD9") + "3" + ")",
                        WHITE + " ",
                        ChatColor.of("#FE04B4") + "🔮 " + ChatColor.of("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                        GRAY + "- Green Thumb",
                        GRAY + "- Radiant Fist",
                        GRAY + "- Bonus Saturation",
                        GRAY + "- Bonus Absorption",
                        GRAY + "- Wither Immune",
                        WHITE + " ",
                        ChatColor.of("#FE04B4") + "🔮 " + ChatColor.of("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                        GRAY + "- " + ChatColor.of("#FE04B4") + "Vitalaty Vortex",
                        WHITE + " ",
                        ChatColor.of("#FE04B4") + "🔮 " + ChatColor.of("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                        GRAY + "- " + WHITE + "\uD83D\uDC98" + ChatColor.of("#FF429A") + " ʜᴇᴀʀᴛ ᴅʀᴀɪɴᴇʀ " + DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                        GRAY + "- " + WHITE + "\uD83D\uDC98" + ChatColor.of("#FF429A") + " ʜᴇᴀʀᴛʟᴏᴄᴋ " + DARK_RED + "\uD83E\uDD3C",
                        WHITE + "",
                        GRAY + "- " + WHITE + "\uD83D\uDC96" + ChatColor.of("#B8FFFA") + " ᴄɪʀᴄʟᴇ ᴏғ ʟɪғᴇ " + GREEN + "\uD83E\uDDD1\uD83C\uDFFB",
                        GRAY + "- " + WHITE + "\uD83D\uDC96" + ChatColor.of("#B8FFFA") + " ᴄɪʀᴄʟᴇ ᴏғ ʟɪғᴇ " + GREEN + "\uD83E\uDD3C"
                )
        );
        GemMEta.setCustomModelData(4);
        Gem.setItemMeta(GemMEta);
        return Gem;

    }

    public ItemStack LifeP2T2() {

        ItemStack Gem = new ItemStack(Material.PRISMARINE_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.setDisplayName(ChatColor.of("#FE04B4") + "" + BOLD + "ʟɪғᴇ " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(
                Arrays.asList(
                        WHITE + "" + BOLD + "ᴄᴏɴᴛʀᴏʟ ᴛʜᴇ ʙᴀʟᴀɴᴄᴇ ᴏғ ʟɪғᴇ",
                        WHITE + "(" + ChatColor.of("#57FFC7") + "Pristine"
                                + WHITE + " + "
                                + ChatColor.of("#96FFD9") + "2" + ")",
                        WHITE + " ",
                        ChatColor.of("#FE04B4") + "🔮 " + ChatColor.of("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                        GRAY + "- Green Thumb",
                        GRAY + "- Radiant Fist",
                        GRAY + "- Bonus Saturation",
                        GRAY + "- Bonus Absorption",
                        GRAY + "- Wither Immune",
                        WHITE + " ",
                        ChatColor.of("#FE04B4") + "🔮 " + ChatColor.of("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                        GRAY + "- " + ChatColor.of("#FE04B4") + "Vitalaty Vortex",
                        WHITE + " ",
                        ChatColor.of("#FE04B4") + "🔮 " + ChatColor.of("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                        GRAY + "- " + WHITE + "\uD83D\uDC98" + ChatColor.of("#FF429A") + " ʜᴇᴀʀᴛ ᴅʀᴀɪɴᴇʀ " + DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                        GRAY + "- " + WHITE + "\uD83D\uDC98" + ChatColor.of("#FF429A") + " ʜᴇᴀʀᴛʟᴏᴄᴋ " + DARK_RED + "\uD83E\uDD3C",
                        WHITE + "",
                        GRAY + "- " + WHITE + "\uD83D\uDC96" + ChatColor.of("#B8FFFA") + " ᴄɪʀᴄʟᴇ ᴏғ ʟɪғᴇ " + GREEN + "\uD83E\uDDD1\uD83C\uDFFB",
                        GRAY + "- " + WHITE + "\uD83D\uDC96" + ChatColor.of("#B8FFFA") + " ᴄɪʀᴄʟᴇ ᴏғ ʟɪғᴇ " + GREEN + "\uD83E\uDD3C"
                )
        );
        GemMEta.setCustomModelData(4);
        Gem.setItemMeta(GemMEta);
        return Gem;

    }

    public ItemStack LifeP1T2() {

        ItemStack Gem = new ItemStack(Material.PRISMARINE_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.setDisplayName(ChatColor.of("#FE04B4") + "" + BOLD + "ʟɪғᴇ " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(
                Arrays.asList(
                        WHITE + "" + BOLD + "ᴄᴏɴᴛʀᴏʟ ᴛʜᴇ ʙᴀʟᴀɴᴄᴇ ᴏғ ʟɪғᴇ",
                        WHITE + "(" + ChatColor.of("#57FFC7") + "Pristine"
                                + WHITE + " + "
                                + ChatColor.of("#96FFD9") + "1" + ")",
                        WHITE + " ",
                        ChatColor.of("#FE04B4") + "🔮 " + ChatColor.of("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                        GRAY + "- Green Thumb",
                        GRAY + "- Radiant Fist",
                        GRAY + "- Bonus Saturation",
                        GRAY + "- Bonus Absorption",
                        GRAY + "- Wither Immune",
                        WHITE + " ",
                        ChatColor.of("#FE04B4") + "🔮 " + ChatColor.of("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                        GRAY + "- " + ChatColor.of("#FE04B4") + "Vitalaty Vortex",
                        WHITE + " ",
                        ChatColor.of("#FE04B4") + "🔮 " + ChatColor.of("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                        GRAY + "- " + WHITE + "\uD83D\uDC98" + ChatColor.of("#FF429A") + " ʜᴇᴀʀᴛ ᴅʀᴀɪɴᴇʀ " + DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                        GRAY + "- " + WHITE + "\uD83D\uDC98" + ChatColor.of("#FF429A") + " ʜᴇᴀʀᴛʟᴏᴄᴋ " + DARK_RED + "\uD83E\uDD3C",
                        WHITE + "",
                        GRAY + "- " + WHITE + "\uD83D\uDC96" + ChatColor.of("#B8FFFA") + " ᴄɪʀᴄʟᴇ ᴏғ ʟɪғᴇ " + GREEN + "\uD83E\uDDD1\uD83C\uDFFB",
                        GRAY + "- " + WHITE + "\uD83D\uDC96" + ChatColor.of("#B8FFFA") + " ᴄɪʀᴄʟᴇ ᴏғ ʟɪғᴇ " + GREEN + "\uD83E\uDD3C"
                )
        );
        GemMEta.setCustomModelData(4);
        Gem.setItemMeta(GemMEta);
        return Gem;

    }

    public ItemStack LifePT2() {

        ItemStack Gem = new ItemStack(Material.PRISMARINE_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.setDisplayName(ChatColor.of("#FE04B4") + "" + BOLD + "ʟɪғᴇ " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(
                Arrays.asList(
                        WHITE + "" + BOLD + "ᴄᴏɴᴛʀᴏʟ ᴛʜᴇ ʙᴀʟᴀɴᴄᴇ ᴏғ ʟɪғᴇ",
                        WHITE + "(" + ChatColor.of("#57FFC7") + "Pristine" + WHITE + ")",
                        WHITE + " ",
                        ChatColor.of("#FE04B4") + "🔮 " + ChatColor.of("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                        GRAY + "- Green Thumb",
                        GRAY + "- Radiant Fist",
                        GRAY + "- Bonus Saturation",
                        GRAY + "- Bonus Absorption",
                        GRAY + "- Wither Immune",
                        WHITE + " ",
                        ChatColor.of("#FE04B4") + "🔮 " + ChatColor.of("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                        GRAY + "- " + ChatColor.of("#FE04B4") + "Vitalaty Vortex",
                        WHITE + " ",
                        ChatColor.of("#FE04B4") + "🔮 " + ChatColor.of("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                        GRAY + "- " + WHITE + "\uD83D\uDC98" + ChatColor.of("#FF429A") + " ʜᴇᴀʀᴛ ᴅʀᴀɪɴᴇʀ " + DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                        GRAY + "- " + WHITE + "\uD83D\uDC98" + ChatColor.of("#FF429A") + " ʜᴇᴀʀᴛʟᴏᴄᴋ " + DARK_RED + "\uD83E\uDD3C",
                        WHITE + "",
                        GRAY + "- " + WHITE + "\uD83D\uDC96" + ChatColor.of("#B8FFFA") + " ᴄɪʀᴄʟᴇ ᴏғ ʟɪғᴇ " + GREEN + "\uD83E\uDDD1\uD83C\uDFFB",
                        GRAY + "- " + WHITE + "\uD83D\uDC96" + ChatColor.of("#B8FFFA") + " ᴄɪʀᴄʟᴇ ᴏғ ʟɪғᴇ " + GREEN + "\uD83E\uDD3C"
                )
        );
        GemMEta.setCustomModelData(4);
        Gem.setItemMeta(GemMEta);
        return Gem;

    }

    public ItemStack LifeST2() {

        ItemStack Gem = new ItemStack(Material.PRISMARINE_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.setDisplayName(ChatColor.of("#FE04B4") + "" + BOLD + "ʟɪғᴇ " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(
                Arrays.asList(
                        WHITE + "" + BOLD + "ᴄᴏɴᴛʀᴏʟ ᴛʜᴇ ʙᴀʟᴀɴᴄᴇ ᴏғ ʟɪғᴇ",
                        WHITE + "(" + ChatColor.of("#57FF8F") + "Scratched" + WHITE + ")",
                        WHITE + " ",
                        ChatColor.of("#FE04B4") + "🔮 " + ChatColor.of("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                        GRAY + "- Green Thumb",
                        GRAY + "- Bonus Saturation",
                        GRAY + "- Bonus Absorption",
                        GRAY + "- Wither Immune",
                        WHITE + " ",
                        ChatColor.of("#FE04B4") + "🔮 " + ChatColor.of("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                        GRAY + "- " + ChatColor.of("#FE04B4") + "Vitalaty Vortex",
                        WHITE + " ",
                        ChatColor.of("#FE04B4") + "🔮 " + ChatColor.of("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                        GRAY + "- " + WHITE + "\uD83D\uDC98" + ChatColor.of("#FF429A") + " ʜᴇᴀʀᴛ ᴅʀᴀɪɴᴇʀ " + DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                        GRAY + "- " + WHITE + "\uD83D\uDC98" + ChatColor.of("#FF429A") + " ʜᴇᴀʀᴛʟᴏᴄᴋ " + DARK_RED + "\uD83E\uDD3C",
                        WHITE + "",
                        GRAY + "- " + WHITE + "\uD83D\uDC96" + ChatColor.of("#B8FFFA") + " ᴄɪʀᴄʟᴇ ᴏғ ʟɪғᴇ " + GREEN + "\uD83E\uDDD1\uD83C\uDFFB",
                        GRAY + "- " + WHITE + "\uD83D\uDC96" + ChatColor.of("#B8FFFA") + " ᴄɪʀᴄʟᴇ ᴏғ ʟɪғᴇ " + GREEN + "\uD83E\uDD3C"
                )
        );
        GemMEta.setCustomModelData(24);
        Gem.setItemMeta(GemMEta);
        return Gem;

    }

    public ItemStack LifeCT2() {

        ItemStack Gem = new ItemStack(Material.PRISMARINE_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.setDisplayName(ChatColor.of("#FE04B4") + "" + BOLD + "ʟɪғᴇ " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(
                Arrays.asList(
                        WHITE + "" + BOLD + "ᴄᴏɴᴛʀᴏʟ ᴛʜᴇ ʙᴀʟᴀɴᴄᴇ ᴏғ ʟɪғᴇ",
                        WHITE + "(" + ChatColor.of("#7958DB") + "Cracked" + WHITE + ")",
                        WHITE + " ",
                        ChatColor.of("#FE04B4") + "🔮 " + ChatColor.of("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                        GRAY + "- Green Thumb",
                        GRAY + "- Bonus Saturation",
                        WHITE + " ",
                        ChatColor.of("#FE04B4") + "🔮 " + ChatColor.of("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                        GRAY + "- " + ChatColor.of("#FE04B4") + "Vitalaty Vortex",
                        WHITE + " ",
                        ChatColor.of("#FE04B4") + "🔮 " + ChatColor.of("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                        GRAY + "- " + WHITE + "\uD83D\uDC98" + ChatColor.of("#FF429A") + " ʜᴇᴀʀᴛ ᴅʀᴀɪɴᴇʀ " + DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                        GRAY + "- " + WHITE + "\uD83D\uDC98" + ChatColor.of("#FF429A") + " ʜᴇᴀʀᴛʟᴏᴄᴋ " + DARK_RED + "\uD83E\uDD3C",
                        WHITE + "",
                        GRAY + "- " + WHITE + "\uD83D\uDC96" + ChatColor.of("#B8FFFA") + " ᴄɪʀᴄʟᴇ ᴏғ ʟɪғᴇ " + GREEN + "\uD83E\uDDD1\uD83C\uDFFB",
                        GRAY + "- " + WHITE + "\uD83D\uDC96" + ChatColor.of("#B8FFFA") + " ᴄɪʀᴄʟᴇ ᴏғ ʟɪғᴇ " + GREEN + "\uD83E\uDD3C"
                )
        );
        GemMEta.setCustomModelData(44);
        Gem.setItemMeta(GemMEta);
        return Gem;

    }

    public ItemStack LifeDT2() {

        ItemStack Gem = new ItemStack(Material.PRISMARINE_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.setDisplayName(ChatColor.of("#FE04B4") + "" + BOLD + "ʟɪғᴇ " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(
                Arrays.asList(
                        WHITE + "" + BOLD + "ᴄᴏɴᴛʀᴏʟ ᴛʜᴇ ʙᴀʟᴀɴᴄᴇ ᴏғ ʟɪғᴇ",
                        WHITE + "(" + ChatColor.of("#FFC929") + "Damaged" + WHITE + ")",
                        WHITE + " ",
                        ChatColor.of("#FE04B4") + "🔮 " + ChatColor.of("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                        GRAY + "- Green Thumb",
                        WHITE + " ",
                        ChatColor.of("#FE04B4") + "🔮 " + ChatColor.of("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                        GRAY + "- " + ChatColor.of("#FE04B4") + "Vitalaty Vortex",
                        WHITE + " ",
                        ChatColor.of("#FE04B4") + "🔮 " + ChatColor.of("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                        GRAY + "- " + WHITE + "\uD83D\uDC98" + ChatColor.of("#FF429A") + " ʜᴇᴀʀᴛ ᴅʀᴀɪɴᴇʀ " + DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                        GRAY + "- " + WHITE + "\uD83D\uDC98" + ChatColor.of("#FF429A") + " ʜᴇᴀʀᴛʟᴏᴄᴋ " + DARK_RED + "\uD83E\uDD3C",
                        WHITE + "",
                        GRAY + "- " + WHITE + "\uD83D\uDC96" + ChatColor.of("#B8FFFA") + " ᴄɪʀᴄʟᴇ ᴏғ ʟɪғᴇ " + GREEN + "\uD83E\uDDD1\uD83C\uDFFB",
                        GRAY + "- " + WHITE + "\uD83D\uDC96" + ChatColor.of("#B8FFFA") + " ᴄɪʀᴄʟᴇ ᴏғ ʟɪғᴇ " + GREEN + "\uD83E\uDD3C"
                )
        );
        GemMEta.setCustomModelData(64);
        Gem.setItemMeta(GemMEta);
        return Gem;

    }

    public ItemStack LifeRT2() {

        ItemStack Gem = new ItemStack(Material.PRISMARINE_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.setDisplayName(ChatColor.of("#FE04B4") + "" + BOLD + "ʟɪғᴇ " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(
                Arrays.asList(
                        WHITE + "" + BOLD + "ᴄᴏɴᴛʀᴏʟ ᴛʜᴇ ʙᴀʟᴀɴᴄᴇ ᴏғ ʟɪғᴇ",
                        WHITE + "(" + ChatColor.of("#FF1111") + "Ruined" + WHITE + ")",
                        WHITE + " ",
                        ChatColor.of("#FE04B4") + "🔮 " + ChatColor.of("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                        GRAY + "No Passives",
                        WHITE + " ",
                        ChatColor.of("#FE04B4") + "🔮 " + ChatColor.of("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                        GRAY + "- " + ChatColor.of("#FE04B4") + "Vitalaty Vortex",
                        WHITE + " ",
                        ChatColor.of("#FE04B4") + "🔮 " + ChatColor.of("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                        GRAY + "- " + WHITE + "\uD83D\uDC98" + ChatColor.of("#FF429A") + " ʜᴇᴀʀᴛ ᴅʀᴀɪɴᴇʀ " + DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                        GRAY + "- " + WHITE + "\uD83D\uDC98" + ChatColor.of("#FF429A") + " ʜᴇᴀʀᴛʟᴏᴄᴋ " + DARK_RED + "\uD83E\uDD3C",
                        WHITE + "",
                        GRAY + "- " + WHITE + "\uD83D\uDC96" + ChatColor.of("#B8FFFA") + " ᴄɪʀᴄʟᴇ ᴏғ ʟɪғᴇ " + GREEN + "\uD83E\uDDD1\uD83C\uDFFB",
                        GRAY + "- " + WHITE + "\uD83D\uDC96" + ChatColor.of("#B8FFFA") + " ᴄɪʀᴄʟᴇ ᴏғ ʟɪғᴇ " + GREEN + "\uD83E\uDD3C"
                )
        );
        GemMEta.setCustomModelData(84);
        Gem.setItemMeta(GemMEta);
        return Gem;

    }

    public ItemStack LifeBT2() {

        ItemStack Gem = new ItemStack(Material.PRISMARINE_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.setDisplayName(ChatColor.of("#FE04B4") + "" + BOLD + "ʟɪғᴇ " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(
                Arrays.asList(
                        WHITE + "" + BOLD + "ᴜsᴇʟᴇss"
                )
        );
        GemMEta.setCustomModelData(84);
        Gem.setItemMeta(GemMEta);
        return Gem;

    }

    public ItemStack SpeedP5T2() {

        ItemStack Gem = new ItemStack(Material.PRISMARINE_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.addEnchant(Enchantment.DURABILITY, 1, true);
        GemMEta.setDisplayName(ChatColor.of("#FEFD17") + "" + BOLD + "sᴘᴇᴇᴅ " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(Arrays.asList(
                WHITE + "" + BOLD + "ᴡᴀᴛᴄʜ ᴛʜᴇ ᴡᴏʀʟᴅ ᴀʀᴏᴜɴᴅ ʏᴏᴜ ᴛᴜʀɴ ɪɴᴛᴏ ᴀ ʙʟᴜʀ ",
                WHITE + "(" + ChatColor.of("#57FFC7") + "Pristine"
                        + WHITE + " + "
                        + ChatColor.of("#96FFD9") + "5" + ")",
                WHITE + "",
                ChatColor.of("#FEFD17") + "🔮 " + ChatColor.of("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                GRAY + "- Speed",
                GRAY + "- Dolphins grace",
                GRAY + "- Enchants Efficiency",
                GRAY + "- Enchants Soul Speed",
                WHITE + "",
                ChatColor.of("#FEFD17") + "🔮 " + ChatColor.of("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                GRAY + "- " + ChatColor.of("#FEFD17") + " Terminal Velocity",
                WHITE + "",
                ChatColor.of("#FEFD17") + "🔮 " + ChatColor.of("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                GRAY + "- " + WHITE + "\uD83C\uDFAF " + ChatColor.of("#FFE86E") + "ʙʟᴜʀ",
                WHITE + "",
                GRAY + "- " + WHITE + "\uD83C\uDF29 " + ChatColor.of("#61FFEA") + "sᴘᴇᴇᴅʏ sᴛᴏʀᴍ " + DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                GRAY + "- " + WHITE + "\uD83C\uDF29 " + ChatColor.of("#61FFEA") + "sᴘᴇᴇᴅʏ sᴛᴏʀᴍ " + DARK_RED + "\uD83E\uDD3C"
        ));
        GemMEta.setCustomModelData(8);
        Gem.setItemMeta(GemMEta);
        return Gem;

    }

    public ItemStack SpeedP4T2() {

        ItemStack Gem = new ItemStack(Material.PRISMARINE_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.addEnchant(Enchantment.DURABILITY, 1, true);
        GemMEta.setDisplayName(ChatColor.of("#FEFD17") + "" + BOLD + "sᴘᴇᴇᴅ " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(Arrays.asList(
                WHITE + "" + BOLD + "ᴡᴀᴛᴄʜ ᴛʜᴇ ᴡᴏʀʟᴅ ᴀʀᴏᴜɴᴅ ʏᴏᴜ ᴛᴜʀɴ ɪɴᴛᴏ ᴀ ʙʟᴜʀ ",
                WHITE + "(" + ChatColor.of("#57FFC7") + "Pristine"
                        + WHITE + " + "
                        + ChatColor.of("#96FFD9") + "4" + ")",
                WHITE + "",
                ChatColor.of("#FEFD17") + "🔮 " + ChatColor.of("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                GRAY + "- Speed",
                GRAY + "- Dolphins grace",
                GRAY + "- Enchants Efficiency",
                GRAY + "- Enchants Soul Speed",
                WHITE + "",
                ChatColor.of("#FEFD17") + "🔮 " + ChatColor.of("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                GRAY + "- " + ChatColor.of("#FEFD17") + " Terminal Velocity",
                WHITE + "",
                ChatColor.of("#FEFD17") + "🔮 " + ChatColor.of("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                GRAY + "- " + WHITE + "\uD83C\uDFAF " + ChatColor.of("#FFE86E") + "ʙʟᴜʀ",
                WHITE + "",
                GRAY + "- " + WHITE + "\uD83C\uDF29 " + ChatColor.of("#61FFEA") + "sᴘᴇᴇᴅʏ sᴛᴏʀᴍ " + DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                GRAY + "- " + WHITE + "\uD83C\uDF29 " + ChatColor.of("#61FFEA") + "sᴘᴇᴇᴅʏ sᴛᴏʀᴍ " + DARK_RED + "\uD83E\uDD3C"
        ));
        GemMEta.setCustomModelData(8);
        Gem.setItemMeta(GemMEta);
        return Gem;

    }

    public ItemStack SpeedP3T2() {

        ItemStack Gem = new ItemStack(Material.PRISMARINE_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.addEnchant(Enchantment.DURABILITY, 1, true);
        GemMEta.setDisplayName(ChatColor.of("#FEFD17") + "" + BOLD + "sᴘᴇᴇᴅ " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(Arrays.asList(
                WHITE + "" + BOLD + "ᴡᴀᴛᴄʜ ᴛʜᴇ ᴡᴏʀʟᴅ ᴀʀᴏᴜɴᴅ ʏᴏᴜ ᴛᴜʀɴ ɪɴᴛᴏ ᴀ ʙʟᴜʀ ",
                WHITE + "(" + ChatColor.of("#57FFC7") + "Pristine"
                        + WHITE + " + "
                        + ChatColor.of("#96FFD9") + "3" + ")",
                WHITE + "",
                ChatColor.of("#FEFD17") + "🔮 " + ChatColor.of("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                GRAY + "- Speed",
                GRAY + "- Dolphins grace",
                GRAY + "- Enchants Efficiency",
                GRAY + "- Enchants Soul Speed",
                WHITE + "",
                ChatColor.of("#FEFD17") + "🔮 " + ChatColor.of("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                GRAY + "- " + ChatColor.of("#FEFD17") + " Terminal Velocity",
                WHITE + "",
                ChatColor.of("#FEFD17") + "🔮 " + ChatColor.of("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                GRAY + "- " + WHITE + "\uD83C\uDFAF " + ChatColor.of("#FFE86E") + "ʙʟᴜʀ",
                WHITE + "",
                GRAY + "- " + WHITE + "\uD83C\uDF29 " + ChatColor.of("#61FFEA") + "sᴘᴇᴇᴅʏ sᴛᴏʀᴍ " + DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                GRAY + "- " + WHITE + "\uD83C\uDF29 " + ChatColor.of("#61FFEA") + "sᴘᴇᴇᴅʏ sᴛᴏʀᴍ " + DARK_RED + "\uD83E\uDD3C"
        ));
        GemMEta.setCustomModelData(8);
        Gem.setItemMeta(GemMEta);
        return Gem;

    }

    public ItemStack SpeedP2T2() {

        ItemStack Gem = new ItemStack(Material.PRISMARINE_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.addEnchant(Enchantment.DURABILITY, 1, true);
        GemMEta.setDisplayName(ChatColor.of("#FEFD17") + "" + BOLD + "sᴘᴇᴇᴅ " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(Arrays.asList(
                WHITE + "" + BOLD + "ᴡᴀᴛᴄʜ ᴛʜᴇ ᴡᴏʀʟᴅ ᴀʀᴏᴜɴᴅ ʏᴏᴜ ᴛᴜʀɴ ɪɴᴛᴏ ᴀ ʙʟᴜʀ ",
                WHITE + "(" + ChatColor.of("#57FFC7") + "Pristine"
                        + WHITE + " + "
                        + ChatColor.of("#96FFD9") + "2" + ")",
                WHITE + "",
                ChatColor.of("#FEFD17") + "🔮 " + ChatColor.of("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                GRAY + "- Speed",
                GRAY + "- Dolphins grace",
                GRAY + "- Enchants Efficiency",
                GRAY + "- Enchants Soul Speed",
                WHITE + "",
                ChatColor.of("#FEFD17") + "🔮 " + ChatColor.of("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                GRAY + "- " + ChatColor.of("#FEFD17") + " Terminal Velocity",
                WHITE + "",
                ChatColor.of("#FEFD17") + "🔮 " + ChatColor.of("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                GRAY + "- " + WHITE + "\uD83C\uDFAF " + ChatColor.of("#FFE86E") + "ʙʟᴜʀ",
                WHITE + "",
                GRAY + "- " + WHITE + "\uD83C\uDF29 " + ChatColor.of("#61FFEA") + "sᴘᴇᴇᴅʏ sᴛᴏʀᴍ " + DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                GRAY + "- " + WHITE + "\uD83C\uDF29 " + ChatColor.of("#61FFEA") + "sᴘᴇᴇᴅʏ sᴛᴏʀᴍ " + DARK_RED + "\uD83E\uDD3C"
        ));
        GemMEta.setCustomModelData(8);
        Gem.setItemMeta(GemMEta);
        return Gem;

    }

    public ItemStack SpeedP1T2() {

        ItemStack Gem = new ItemStack(Material.PRISMARINE_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.addEnchant(Enchantment.DURABILITY, 1, true);
        GemMEta.setDisplayName(ChatColor.of("#FEFD17") + "" + BOLD + "sᴘᴇᴇᴅ " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(Arrays.asList(
                WHITE + "" + BOLD + "ᴡᴀᴛᴄʜ ᴛʜᴇ ᴡᴏʀʟᴅ ᴀʀᴏᴜɴᴅ ʏᴏᴜ ᴛᴜʀɴ ɪɴᴛᴏ ᴀ ʙʟᴜʀ ",
                WHITE + "(" + ChatColor.of("#57FFC7") + "Pristine"
                        + WHITE + " + "
                        + ChatColor.of("#96FFD9") + "1" + ")",
                WHITE + "",
                ChatColor.of("#FEFD17") + "🔮 " + ChatColor.of("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                GRAY + "- Speed",
                GRAY + "- Dolphins grace",
                GRAY + "- Enchants Efficiency",
                GRAY + "- Enchants Soul Speed",
                WHITE + "",
                ChatColor.of("#FEFD17") + "🔮 " + ChatColor.of("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                GRAY + "- " + ChatColor.of("#FEFD17") + " Terminal Velocity",
                WHITE + "",
                ChatColor.of("#FEFD17") + "🔮 " + ChatColor.of("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                GRAY + "- " + WHITE + "\uD83C\uDFAF " + ChatColor.of("#FFE86E") + "ʙʟᴜʀ",
                WHITE + "",
                GRAY + "- " + WHITE + "\uD83C\uDF29 " + ChatColor.of("#61FFEA") + "sᴘᴇᴇᴅʏ sᴛᴏʀᴍ " + DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                GRAY + "- " + WHITE + "\uD83C\uDF29 " + ChatColor.of("#61FFEA") + "sᴘᴇᴇᴅʏ sᴛᴏʀᴍ " + DARK_RED + "\uD83E\uDD3C"
        ));
        GemMEta.setCustomModelData(8);
        Gem.setItemMeta(GemMEta);
        return Gem;

    }

    public ItemStack SpeedPT2() {

        ItemStack Gem = new ItemStack(Material.PRISMARINE_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.addEnchant(Enchantment.DURABILITY, 1, true);
        GemMEta.setDisplayName(ChatColor.of("#FEFD17") + "" + BOLD + "sᴘᴇᴇᴅ " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(Arrays.asList(
                WHITE + "" + BOLD + "ᴡᴀᴛᴄʜ ᴛʜᴇ ᴡᴏʀʟᴅ ᴀʀᴏᴜɴᴅ ʏᴏᴜ ᴛᴜʀɴ ɪɴᴛᴏ ᴀ ʙʟᴜʀ ",
                WHITE + "(" + ChatColor.of("#57FFC7") + "Pristine" + ")",
                WHITE + "",
                ChatColor.of("#FEFD17") + "🔮 " + ChatColor.of("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                GRAY + "- Speed",
                GRAY + "- Dolphins grace",
                GRAY + "- Enchants Efficiency",
                GRAY + "- Enchants Soul Speed",
                WHITE + "",
                ChatColor.of("#FEFD17") + "🔮 " + ChatColor.of("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                GRAY + "- " + ChatColor.of("#FEFD17") + " Terminal Velocity",
                WHITE + "",
                ChatColor.of("#FEFD17") + "🔮 " + ChatColor.of("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                GRAY + "- " + WHITE + "\uD83C\uDFAF " + ChatColor.of("#FFE86E") + "ʙʟᴜʀ",
                WHITE + "",
                GRAY + "- " + WHITE + "\uD83C\uDF29 " + ChatColor.of("#61FFEA") + "sᴘᴇᴇᴅʏ sᴛᴏʀᴍ " + DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                GRAY + "- " + WHITE + "\uD83C\uDF29 " + ChatColor.of("#61FFEA") + "sᴘᴇᴇᴅʏ sᴛᴏʀᴍ " + DARK_RED + "\uD83E\uDD3C"
        ));
        GemMEta.setCustomModelData(8);
        Gem.setItemMeta(GemMEta);
        return Gem;

    }

    public ItemStack SpeedST2() {

        ItemStack Gem = new ItemStack(Material.PRISMARINE_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.addEnchant(Enchantment.DURABILITY, 1, true);
        GemMEta.setDisplayName(ChatColor.of("#FEFD17") + "" + BOLD + "sᴘᴇᴇᴅ " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(Arrays.asList(
                WHITE + "" + BOLD + "ᴡᴀᴛᴄʜ ᴛʜᴇ ᴡᴏʀʟᴅ ᴀʀᴏᴜɴᴅ ʏᴏᴜ ᴛᴜʀɴ ɪɴᴛᴏ ᴀ ʙʟᴜʀ ",
                WHITE + "(" + ChatColor.of("#57FF8F") + "Scratched" + WHITE + ")",
                WHITE + "",
                ChatColor.of("#FEFD17") + "🔮 " + ChatColor.of("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                GRAY + "- Speed",
                GRAY + "- Dolphins grace",
                GRAY + "- Enchants Efficiency",
                GRAY + "- Enchants Soul Speed",
                WHITE + "",
                ChatColor.of("#FEFD17") + "🔮 " + ChatColor.of("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                GRAY + "- " + ChatColor.of("#FEFD17") + " Terminal Velocity",
                WHITE + "",
                ChatColor.of("#FEFD17") + "🔮 " + ChatColor.of("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                GRAY + "- " + WHITE + "\uD83C\uDFAF " + ChatColor.of("#FFE86E") + "ʙʟᴜʀ",
                WHITE + "",
                GRAY + "- " + WHITE + "\uD83C\uDF29 " + ChatColor.of("#61FFEA") + "sᴘᴇᴇᴅʏ sᴛᴏʀᴍ " + DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                GRAY + "- " + WHITE + "\uD83C\uDF29 " + ChatColor.of("#61FFEA") + "sᴘᴇᴇᴅʏ sᴛᴏʀᴍ " + DARK_RED + "\uD83E\uDD3C"
        ));
        GemMEta.setCustomModelData(28);
        Gem.setItemMeta(GemMEta);
        return Gem;

    }

    public ItemStack SpeedCT2() {

        ItemStack Gem = new ItemStack(Material.PRISMARINE_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.addEnchant(Enchantment.DURABILITY, 1, true);
        GemMEta.setDisplayName(ChatColor.of("#FEFD17") + "" + BOLD + "sᴘᴇᴇᴅ " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(Arrays.asList(
                WHITE + "" + BOLD + "ᴡᴀᴛᴄʜ ᴛʜᴇ ᴡᴏʀʟᴅ ᴀʀᴏᴜɴᴅ ʏᴏᴜ ᴛᴜʀɴ ɪɴᴛᴏ ᴀ ʙʟᴜʀ ",
                WHITE + "(" + ChatColor.of("#7958DB") + "Cracked" + WHITE + ")",
                WHITE + "",
                ChatColor.of("#FEFD17") + "🔮 " + ChatColor.of("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                GRAY + "- Speed",
                GRAY + "- Enchants Efficiency",
                GRAY + "- Enchants Soul Speed",
                WHITE + "",
                ChatColor.of("#FEFD17") + "🔮 " + ChatColor.of("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                GRAY + "- " + ChatColor.of("#FEFD17") + " Terminal Velocity",
                WHITE + "",
                ChatColor.of("#FEFD17") + "🔮 " + ChatColor.of("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                GRAY + "- " + WHITE + "\uD83C\uDFAF " + ChatColor.of("#FFE86E") + "ʙʟᴜʀ",
                WHITE + "",
                GRAY + "- " + WHITE + "\uD83C\uDF29 " + ChatColor.of("#61FFEA") + "sᴘᴇᴇᴅʏ sᴛᴏʀᴍ " + DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                GRAY + "- " + WHITE + "\uD83C\uDF29 " + ChatColor.of("#61FFEA") + "sᴘᴇᴇᴅʏ sᴛᴏʀᴍ " + DARK_RED + "\uD83E\uDD3C"
        ));
        GemMEta.setCustomModelData(48);
        Gem.setItemMeta(GemMEta);
        return Gem;

    }

    public ItemStack SpeedDT2() {

        ItemStack Gem = new ItemStack(Material.PRISMARINE_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.addEnchant(Enchantment.DURABILITY, 1, true);
        GemMEta.setDisplayName(ChatColor.of("#FEFD17") + "" + BOLD + "sᴘᴇᴇᴅ " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(Arrays.asList(
                WHITE + "" + BOLD + "ᴡᴀᴛᴄʜ ᴛʜᴇ ᴡᴏʀʟᴅ ᴀʀᴏᴜɴᴅ ʏᴏᴜ ᴛᴜʀɴ ɪɴᴛᴏ ᴀ ʙʟᴜʀ ",
                WHITE + "(" + ChatColor.of("#FFC929") + "Damaged" + WHITE + ")",
                WHITE + "",
                ChatColor.of("#FEFD17") + "🔮 " + ChatColor.of("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                GRAY + "- Speed",
                GRAY + "- Dolphins grace",
                GRAY + "- Enchants Efficiency",
                WHITE + "",
                ChatColor.of("#FEFD17") + "🔮 " + ChatColor.of("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                GRAY + "- " + ChatColor.of("#FEFD17") + " Terminal Velocity",
                WHITE + "",
                ChatColor.of("#FEFD17") + "🔮 " + ChatColor.of("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                GRAY + "- " + WHITE + "\uD83C\uDFAF " + ChatColor.of("#FFE86E") + "ʙʟᴜʀ",
                WHITE + "",
                GRAY + "- " + WHITE + "\uD83C\uDF29 " + ChatColor.of("#61FFEA") + "sᴘᴇᴇᴅʏ sᴛᴏʀᴍ " + DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                GRAY + "- " + WHITE + "\uD83C\uDF29 " + ChatColor.of("#61FFEA") + "sᴘᴇᴇᴅʏ sᴛᴏʀᴍ " + DARK_RED + "\uD83E\uDD3C"
        ));
        GemMEta.setCustomModelData(68);
        Gem.setItemMeta(GemMEta);
        return Gem;

    }

    public ItemStack SpeedRT2() {

        ItemStack Gem = new ItemStack(Material.PRISMARINE_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.addEnchant(Enchantment.DURABILITY, 1, true);
        GemMEta.setDisplayName(ChatColor.of("#FEFD17") + "" + BOLD + "sᴘᴇᴇᴅ " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(Arrays.asList(
                WHITE + "" + BOLD + "ᴡᴀᴛᴄʜ ᴛʜᴇ ᴡᴏʀʟᴅ ᴀʀᴏᴜɴᴅ ʏᴏᴜ ᴛᴜʀɴ ɪɴᴛᴏ ᴀ ʙʟᴜʀ ",
                WHITE + "(" + ChatColor.of("#FF1111") + "Ruined" + WHITE + ")",
                WHITE + "",
                ChatColor.of("#FEFD17") + "🔮 " + ChatColor.of("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                GRAY + "No Passives",
                WHITE + "",
                ChatColor.of("#FEFD17") + "🔮 " + ChatColor.of("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                GRAY + "- " + ChatColor.of("#FEFD17") + " Terminal Velocity",
                WHITE + "",
                ChatColor.of("#FEFD17") + "🔮 " + ChatColor.of("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                GRAY + "- " + WHITE + "\uD83C\uDFAF " + ChatColor.of("#FFE86E") + "ʙʟᴜʀ",
                WHITE + "",
                GRAY + "- " + WHITE + "\uD83C\uDF29 " + ChatColor.of("#61FFEA") + "sᴘᴇᴇᴅʏ sᴛᴏʀᴍ " + DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                GRAY + "- " + WHITE + "\uD83C\uDF29 " + ChatColor.of("#61FFEA") + "sᴘᴇᴇᴅʏ sᴛᴏʀᴍ " + DARK_RED + "\uD83E\uDD3C"
        ));
        GemMEta.setCustomModelData(88);
        Gem.setItemMeta(GemMEta);
        return Gem;

    }

    public ItemStack SpeedBT2() {
        ItemStack Gem = new ItemStack(Material.PRISMARINE_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.setDisplayName(ChatColor.of("#FEFD17") + "" + BOLD + "sᴘᴇᴇᴅ " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(Arrays.asList(
                WHITE + "" + BOLD + "ᴜsᴇʟᴇss"
        ));
        GemMEta.setCustomModelData(99);
        Gem.setItemMeta(GemMEta);
        return Gem;

    }

    public ItemStack FireP5T2() {

        ItemStack Gem = new ItemStack(Material.PRISMARINE_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.addEnchant(Enchantment.DURABILITY, 1, true);
        GemMEta.setDisplayName(ChatColor.of("#FE8120") + "" + BOLD + "ғɪʀᴇ " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(Arrays.asList(
                WHITE + "" + BOLD + "ᴍᴀɴɪᴘᴜʟᴀᴛᴇ ғɪʀᴇ",
                WHITE + "(" + ChatColor.of("#57FFC7") + "Pristine"
                        + WHITE + " + "
                        + ChatColor.of("#96FFD9") + "5" + ")",
                WHITE + "",
                ChatColor.of("#FE8120") + "🔮 " + ChatColor.of("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                GRAY + "- Fire Resistance",
                GRAY + "- Autosmelt",
                GRAY + "- Flamestrike",
                GRAY + "- Fireshot",
                WHITE + " ",
                ChatColor.of("#FE8120") + "🔮 " + ChatColor.of("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                GRAY + "- " + ChatColor.of("#FE8120") + "Crisp",
                WHITE + "",
                ChatColor.of("#FE8120") + "🔮 " + ChatColor.of("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                GRAY + "-" + WHITE + "🧨" + ChatColor.of("#FF5F33") + " ғɪʀᴇʙᴀʟʟ " + DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                GRAY + "-" + WHITE + "🧨" + ChatColor.of("#FF5F33") + " ᴍᴇᴛᴇᴏʀ sʜᴏᴡᴇʀ " + DARK_RED + "\uD83E\uDD3C",
                WHITE + "",
                GRAY + "-" + WHITE + "🥾 " + ChatColor.of("#248FD1") + "ᴄᴏᴢʏ Cᴀᴍᴘғɪʀᴇ"
        ));
        GemMEta.setCustomModelData(2);
        Gem.setItemMeta(GemMEta);
        return Gem;

    }

    public ItemStack FireP4T2() {

        ItemStack Gem = new ItemStack(Material.PRISMARINE_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.setDisplayName(ChatColor.of("#FE8120") + "" + BOLD + "ғɪʀᴇ " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(Arrays.asList(
                WHITE + "" + BOLD + "ᴍᴀɴɪᴘᴜʟᴀᴛᴇ ғɪʀᴇ",
                WHITE + "(" + ChatColor.of("#57FFC7") + "Pristine"
                        + WHITE + " + "
                        + ChatColor.of("#96FFD9") + "4" + ")",
                WHITE + "",
                ChatColor.of("#FE8120") + "🔮 " + ChatColor.of("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                GRAY + "- Fire Resistance",
                GRAY + "- Autosmelt",
                GRAY + "- Flamestrike",
                GRAY + "- Fireshot",
                WHITE + " ",
                ChatColor.of("#FE8120") + "🔮 " + ChatColor.of("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                GRAY + "- " + ChatColor.of("#FE8120") + "Crisp",
                WHITE + "",
                ChatColor.of("#FE8120") + "🔮 " + ChatColor.of("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                GRAY + "-" + WHITE + "🧨" + ChatColor.of("#FF5F33") + " ғɪʀᴇʙᴀʟʟ " + DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                GRAY + "-" + WHITE + "🧨" + ChatColor.of("#FF5F33") + " ᴍᴇᴛᴇᴏʀ sʜᴏᴡᴇʀ " + DARK_RED + "\uD83E\uDD3C",
                WHITE + "",
                GRAY + "-" + WHITE + "🥾 " + ChatColor.of("#248FD1") + "ᴄᴏᴢʏ Cᴀᴍᴘғɪʀᴇ"
        ));
        GemMEta.setCustomModelData(2);
        Gem.setItemMeta(GemMEta);
        return Gem;

    }

    public ItemStack FireP3T2() {

        ItemStack Gem = new ItemStack(Material.PRISMARINE_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.setDisplayName(ChatColor.of("#FE8120") + "" + BOLD + "ғɪʀᴇ " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(Arrays.asList(
                WHITE + "" + BOLD + "ᴍᴀɴɪᴘᴜʟᴀᴛᴇ ғɪʀᴇ",
                WHITE + "(" + ChatColor.of("#57FFC7") + "Pristine"
                        + WHITE + " + "
                        + ChatColor.of("#96FFD9") + "3" + ")",
                WHITE + "",
                ChatColor.of("#FE8120") + "🔮 " + ChatColor.of("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                GRAY + "- Fire Resistance",
                GRAY + "- Autosmelt",
                GRAY + "- Flamestrike",
                GRAY + "- Fireshot",
                WHITE + " ",
                ChatColor.of("#FE8120") + "🔮 " + ChatColor.of("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                GRAY + "- " + ChatColor.of("#FE8120") + "Crisp",
                WHITE + "",
                ChatColor.of("#FE8120") + "🔮 " + ChatColor.of("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                GRAY + "-" + WHITE + "🧨" + ChatColor.of("#FF5F33") + " ғɪʀᴇʙᴀʟʟ " + DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                GRAY + "-" + WHITE + "🧨" + ChatColor.of("#FF5F33") + " ᴍᴇᴛᴇᴏʀ sʜᴏᴡᴇʀ " + DARK_RED + "\uD83E\uDD3C",
                WHITE + "",
                GRAY + "-" + WHITE + "🥾 " + ChatColor.of("#248FD1") + "ᴄᴏᴢʏ Cᴀᴍᴘғɪʀᴇ"
        ));
        GemMEta.setCustomModelData(2);
        Gem.setItemMeta(GemMEta);
        return Gem;

    }

    public ItemStack FireP2T2() {

        ItemStack Gem = new ItemStack(Material.PRISMARINE_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.setDisplayName(ChatColor.of("#FE8120") + "" + BOLD + "ғɪʀᴇ " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(Arrays.asList(
                WHITE + "" + BOLD + "ᴍᴀɴɪᴘᴜʟᴀᴛᴇ ғɪʀᴇ",
                WHITE + "(" + ChatColor.of("#57FFC7") + "Pristine"
                        + WHITE + " + "
                        + ChatColor.of("#96FFD9") + "2" + ")",
                WHITE + "",
                ChatColor.of("#FE8120") + "🔮 " + ChatColor.of("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                GRAY + "- Fire Resistance",
                GRAY + "- Autosmelt",
                GRAY + "- Flamestrike",
                GRAY + "- Fireshot",
                WHITE + " ",
                ChatColor.of("#FE8120") + "🔮 " + ChatColor.of("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                GRAY + "- " + ChatColor.of("#FE8120") + "Crisp",
                WHITE + "",
                ChatColor.of("#FE8120") + "🔮 " + ChatColor.of("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                GRAY + "-" + WHITE + "🧨" + ChatColor.of("#FF5F33") + " ғɪʀᴇʙᴀʟʟ " + DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                GRAY + "-" + WHITE + "🧨" + ChatColor.of("#FF5F33") + " ᴍᴇᴛᴇᴏʀ sʜᴏᴡᴇʀ " + DARK_RED + "\uD83E\uDD3C",
                WHITE + "",
                GRAY + "-" + WHITE + "🥾 " + ChatColor.of("#248FD1") + "ᴄᴏᴢʏ Cᴀᴍᴘғɪʀᴇ"
        ));
        GemMEta.setCustomModelData(2);
        Gem.setItemMeta(GemMEta);
        return Gem;

    }

    public ItemStack FireP1T2() {

        ItemStack Gem = new ItemStack(Material.PRISMARINE_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.setDisplayName(ChatColor.of("#FE8120") + "" + BOLD + "ғɪʀᴇ " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(Arrays.asList(
                WHITE + "" + BOLD + "ᴍᴀɴɪᴘᴜʟᴀᴛᴇ ғɪʀᴇ",
                WHITE + "(" + ChatColor.of("#57FFC7") + "Pristine"
                        + WHITE + " + "
                        + ChatColor.of("#96FFD9") + "1" + ")",
                WHITE + "",
                ChatColor.of("#FE8120") + "🔮 " + ChatColor.of("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                GRAY + "- Fire Resistance",
                GRAY + "- Autosmelt",
                GRAY + "- Flamestrike",
                GRAY + "- Fireshot",
                WHITE + " ",
                ChatColor.of("#FE8120") + "🔮 " + ChatColor.of("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                GRAY + "- " + ChatColor.of("#FE8120") + "Crisp",
                WHITE + "",
                ChatColor.of("#FE8120") + "🔮 " + ChatColor.of("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                GRAY + "-" + WHITE + "🧨" + ChatColor.of("#FF5F33") + " ғɪʀᴇʙᴀʟʟ " + DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                GRAY + "-" + WHITE + "🧨" + ChatColor.of("#FF5F33") + " ᴍᴇᴛᴇᴏʀ sʜᴏᴡᴇʀ " + DARK_RED + "\uD83E\uDD3C",
                WHITE + "",
                GRAY + "-" + WHITE + "🥾 " + ChatColor.of("#248FD1") + "ᴄᴏᴢʏ Cᴀᴍᴘғɪʀᴇ"
        ));
        GemMEta.setCustomModelData(2);
        Gem.setItemMeta(GemMEta);
        return Gem;

    }

    public ItemStack FirePT2() {

        ItemStack Gem = new ItemStack(Material.PRISMARINE_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.setDisplayName(ChatColor.of("#FE8120") + "" + BOLD + "ғɪʀᴇ " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(Arrays.asList(
                WHITE + "" + BOLD + "ᴍᴀɴɪᴘᴜʟᴀᴛᴇ ғɪʀᴇ",
                WHITE + "(" + ChatColor.of("#57FFC7") + "Pristine" + WHITE + ")",
                WHITE + "",
                ChatColor.of("#FE8120") + "🔮 " + ChatColor.of("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                GRAY + "- Fire Resistance",
                GRAY + "- Autosmelt",
                GRAY + "- Flamestrike",
                GRAY + "- Fireshot",
                WHITE + " ",
                ChatColor.of("#FE8120") + "🔮 " + ChatColor.of("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                GRAY + "- " + ChatColor.of("#FE8120") + "Crisp",
                WHITE + "",
                ChatColor.of("#FE8120") + "🔮 " + ChatColor.of("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                GRAY + "-" + WHITE + "🧨" + ChatColor.of("#FF5F33") + " ғɪʀᴇʙᴀʟʟ " + DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                GRAY + "-" + WHITE + "🧨" + ChatColor.of("#FF5F33") + " ᴍᴇᴛᴇᴏʀ sʜᴏᴡᴇʀ " + DARK_RED + "\uD83E\uDD3C",
                WHITE + "",
                GRAY + "-" + WHITE + "🥾 " + ChatColor.of("#248FD1") + "ᴄᴏᴢʏ Cᴀᴍᴘғɪʀᴇ"
        ));
        GemMEta.setCustomModelData(2);
        Gem.setItemMeta(GemMEta);
        return Gem;

    }

    public ItemStack FireST2() {

        ItemStack Gem = new ItemStack(Material.PRISMARINE_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.setDisplayName(ChatColor.of("#FE8120") + "" + BOLD + "ғɪʀᴇ " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(Arrays.asList(
                WHITE + "" + BOLD + "ᴍᴀɴɪᴘᴜʟᴀᴛᴇ ғɪʀᴇ",
                WHITE + "(" + ChatColor.of("#57FF8F") + "Scratched" + WHITE + ")",
                WHITE + "",
                ChatColor.of("#FE8120") + "🔮 " + ChatColor.of("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                GRAY + "- Fire Resistance",
                GRAY + "- Flamestrike",
                GRAY + "- Fireshot",
                WHITE + " ",
                ChatColor.of("#FE8120") + "🔮 " + ChatColor.of("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                GRAY + "- " + ChatColor.of("#FE8120") + "Crisp",
                WHITE + "",
                ChatColor.of("#FE8120") + "🔮 " + ChatColor.of("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                GRAY + "-" + WHITE + "🧨" + ChatColor.of("#FF5F33") + " ғɪʀᴇʙᴀʟʟ " + DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                GRAY + "-" + WHITE + "🧨" + ChatColor.of("#FF5F33") + " ᴍᴇᴛᴇᴏʀ sʜᴏᴡᴇʀ " + DARK_RED + "\uD83E\uDD3C",
                WHITE + "",
                GRAY + "-" + WHITE + "🥾 " + ChatColor.of("#248FD1") + "ᴄᴏᴢʏ Cᴀᴍᴘғɪʀᴇ"
        ));
        GemMEta.setCustomModelData(22);
        Gem.setItemMeta(GemMEta);
        return Gem;

    }

    public ItemStack FireCT2() {

        ItemStack Gem = new ItemStack(Material.PRISMARINE_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.setDisplayName(ChatColor.of("#FE8120") + "" + BOLD + "ғɪʀᴇ " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(Arrays.asList(
                WHITE + "" + BOLD + "ᴍᴀɴɪᴘᴜʟᴀᴛᴇ ғɪʀᴇ",
                WHITE + "(" + ChatColor.of("#7958DB") + "Cracked" + WHITE + ")",
                WHITE + "",
                ChatColor.of("#FE8120") + "🔮 " + ChatColor.of("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                GRAY + "- Fire Resistance",
                GRAY + "- Flamestrike",
                GRAY + "- Fireshot",
                WHITE + " ",
                ChatColor.of("#FE8120") + "🔮 " + ChatColor.of("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                GRAY + "- " + ChatColor.of("#FE8120") + "Crisp",
                WHITE + "",
                ChatColor.of("#FE8120") + "🔮 " + ChatColor.of("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                GRAY + "-" + WHITE + "🧨" + ChatColor.of("#FF5F33") + " ғɪʀᴇʙᴀʟʟ " + DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                GRAY + "-" + WHITE + "🧨" + ChatColor.of("#FF5F33") + " ᴍᴇᴛᴇᴏʀ sʜᴏᴡᴇʀ " + DARK_RED + "\uD83E\uDD3C",
                WHITE + "",
                GRAY + "-" + WHITE + "🥾 " + ChatColor.of("#248FD1") + "ᴄᴏᴢʏ Cᴀᴍᴘғɪʀᴇ"
        ));
        GemMEta.setCustomModelData(42);
        Gem.setItemMeta(GemMEta);
        return Gem;
    }




    public ItemStack FireDT2() {

        ItemStack Gem = new ItemStack(Material.PRISMARINE_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.setDisplayName(ChatColor.of("#FE8120") + "" + BOLD + "ғɪʀᴇ " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(Arrays.asList(
                WHITE + "" + BOLD + "ᴍᴀɴɪᴘᴜʟᴀᴛᴇ ғɪʀᴇ",
                WHITE + "(" + ChatColor.of("#FFC929") + "Damaged" + WHITE + ")",
                WHITE + "",
                ChatColor.of("#FE8120") + "🔮 " + ChatColor.of("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                GRAY + "- Fire Resistance",
                GRAY + "- Flamestrike",
                WHITE + " ",
                ChatColor.of("#FE8120") + "🔮 " + ChatColor.of("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                GRAY + "- " + ChatColor.of("#FE8120") + "Crisp",
                WHITE + "",
                ChatColor.of("#FE8120") + "🔮 " + ChatColor.of("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                GRAY + "-" + WHITE + "🧨" + ChatColor.of("#FF5F33") + " ғɪʀᴇʙᴀʟʟ " + DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                GRAY + "-" + WHITE + "🧨" + ChatColor.of("#FF5F33") + " ᴍᴇᴛᴇᴏʀ sʜᴏᴡᴇʀ " + DARK_RED + "\uD83E\uDD3C",
                WHITE + "",
                GRAY + "-" + WHITE + "🥾 " + ChatColor.of("#248FD1") + "ᴄᴏᴢʏ Cᴀᴍᴘғɪʀᴇ"
        ));
        GemMEta.setCustomModelData(62);
        Gem.setItemMeta(GemMEta);
        return Gem;
    }

    public ItemStack FireRT2() {

        ItemStack Gem = new ItemStack(Material.PRISMARINE_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.setDisplayName(ChatColor.of("#FE8120") + "" + BOLD + "ғɪʀᴇ " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(Arrays.asList(
                WHITE + "" + BOLD + "ᴍᴀɴɪᴘᴜʟᴀᴛᴇ ғɪʀᴇ",
                WHITE + "(" + ChatColor.of("#FF1111") + "Ruined" + WHITE + ")",
                WHITE + "",
                ChatColor.of("#FE8120") + "🔮 " + ChatColor.of("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                GRAY + "No Passives",
                WHITE + " ",
                ChatColor.of("#FE8120") + "🔮 " + ChatColor.of("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                GRAY + "- " + ChatColor.of("#FE8120") + "Crisp",
                WHITE + "",
                ChatColor.of("#FE8120") + "🔮 " + ChatColor.of("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                GRAY + "-" + WHITE + "🧨" + ChatColor.of("#FF5F33") + " ғɪʀᴇʙᴀʟʟ " + DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                GRAY + "-" + WHITE + "🧨" + ChatColor.of("#FF5F33") + " ᴍᴇᴛᴇᴏʀ sʜᴏᴡᴇʀ " + DARK_RED + "\uD83E\uDD3C",
                WHITE + "",
                GRAY + "-" + WHITE + "🥾 " + ChatColor.of("#248FD1") + "ᴄᴏᴢʏ Cᴀᴍᴘғɪʀᴇ"
        ));
        GemMEta.setCustomModelData(82);
        Gem.setItemMeta(GemMEta);
        return Gem;
    }

    public ItemStack FireBT2() {

        ItemStack Gem = new ItemStack(Material.PRISMARINE_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.setDisplayName(ChatColor.of("#FE8120") + "" + BOLD + "ғɪʀᴇ " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(Arrays.asList(
                WHITE + "" + BOLD + "ᴜsᴇʟᴇss"
        ));
        GemMEta.setCustomModelData(100);
        Gem.setItemMeta(GemMEta);
        return Gem;
    }

    public ItemStack FluxP5T2() {

        ItemStack Gem = new ItemStack(Material.PRISMARINE_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.addEnchant(Enchantment.DURABILITY, 1, true);
        GemMEta.setDisplayName(ChatColor.of("#5ED7FF") +  "" + BOLD + "ғʟᴜx " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(Arrays.asList(
                WHITE + "" + BOLD + "ᴇᴠᴇʀʏᴛʜɪɴɢ ɪs ᴀ ғʟᴜᴄᴛᴜᴀᴛɪᴏɴ",
                WHITE + "(" + ChatColor.of("#57FFC7") + "Pristine"
                        + WHITE + " + "
                        + ChatColor.of("#96FFD9") + "5" + GRAY + ")",
                ChatColor.of("#03EAFF") + "🔮 " + ChatColor.of("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                GRAY + "- Flow State",
                GRAY + "- Shocking Chance",
                GRAY + "- Tireless",
                GRAY + "- Conduction",
                GRAY + "- Charged",
                WHITE + " ",
                ChatColor.of("#03EAFF") + "🔮 " + ChatColor.of("#82F3FF") + BOLD + " ᴀʙɪʟɪᴛʏ",
                GRAY + "- " + ChatColor.of("#03EAFF") + "Kinetic Burst",
                WHITE + "",
                ChatColor.of("#03EAFF") + "🔮 " + ChatColor.of("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                GRAY + "- ☄ " + ChatColor.of("#03EAFF") + "ᴇɴᴇʀɢʏ ʙᴇᴀᴍ " + DARK_RED + "🧑🏻",
                GRAY + "- ☄ " + ChatColor.of("#03EAFF") + "ɢʀᴏᴜɴᴅ " + GRAY + " " + DARK_RED + "🤼",
                WHITE + "",
                GRAY + "- 🌀 " + ChatColor.of("#03EAFF") + "Kinetic Overdrive " + GREEN + "🤼"

        ));
        GemMEta.setCustomModelData(16);
        Gem.setItemMeta(GemMEta);
        return Gem;

    }

    public ItemStack FluxP4T2() {

        ItemStack Gem = new ItemStack(Material.PRISMARINE_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.setDisplayName(ChatColor.of("#5ED7FF") +  "" + BOLD + "ғʟᴜx " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(Arrays.asList(
                WHITE + "" + BOLD + "ᴇᴠᴇʀʏᴛʜɪɴɢ ɪs ᴀ ғʟᴜᴄᴛᴜᴀᴛɪᴏɴ",
                WHITE + "(" + ChatColor.of("#57FFC7") + "Pristine"
                        + WHITE + " + "
                        + ChatColor.of("#96FFD9") + "4" + GRAY + ")",
                ChatColor.of("#03EAFF") + "🔮 " + ChatColor.of("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                GRAY + "- Flow State",
                GRAY + "- Shocking Chance",
                GRAY + "- Tireless",
                GRAY + "- Conduction",
                GRAY + "- Charged",
                WHITE + " ",
                ChatColor.of("#03EAFF") + "🔮 " + ChatColor.of("#82F3FF") + BOLD + " ᴀʙɪʟɪᴛʏ",
                GRAY + "- " + ChatColor.of("#03EAFF") + "Kinetic Burst",
                WHITE + "",
                ChatColor.of("#03EAFF") + "🔮 " + ChatColor.of("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                GRAY + "- ☄ " + ChatColor.of("#03EAFF") + "ᴇɴᴇʀɢʏ ʙᴇᴀᴍ " + DARK_RED + "🧑🏻",
                GRAY + "- ☄ " + ChatColor.of("#03EAFF") + "ɢʀᴏᴜɴᴅ " + GRAY + " " + DARK_RED + "🤼",
                WHITE + "",
                GRAY + "- 🌀 " + ChatColor.of("#03EAFF") + "Kinetic Overdrive " + GREEN + "🤼"

        ));
        GemMEta.setCustomModelData(16);
        Gem.setItemMeta(GemMEta);
        return Gem;

    }

    public ItemStack FluxP3T2() {

        ItemStack Gem = new ItemStack(Material.PRISMARINE_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.setDisplayName(ChatColor.of("#5ED7FF") +  "" + BOLD + "ғʟᴜx " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(Arrays.asList(
                WHITE + "" + BOLD + "ᴇᴠᴇʀʏᴛʜɪɴɢ ɪs ᴀ ғʟᴜᴄᴛᴜᴀᴛɪᴏɴ",
                WHITE + "(" + ChatColor.of("#57FFC7") + "Pristine"
                        + WHITE + " + "
                        + ChatColor.of("#96FFD9") + "3" + GRAY + ")",
                ChatColor.of("#03EAFF") + "🔮 " + ChatColor.of("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                GRAY + "- Flow State",
                GRAY + "- Shocking Chance",
                GRAY + "- Tireless",
                GRAY + "- Conduction",
                GRAY + "- Charged",
                WHITE + " ",
                ChatColor.of("#03EAFF") + "🔮 " + ChatColor.of("#82F3FF") + BOLD + " ᴀʙɪʟɪᴛʏ",
                GRAY + "- " + ChatColor.of("#03EAFF") + "Kinetic Burst",
                WHITE + "",
                ChatColor.of("#03EAFF") + "🔮 " + ChatColor.of("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                GRAY + "- ☄ " + ChatColor.of("#03EAFF") + "ᴇɴᴇʀɢʏ ʙᴇᴀᴍ " + DARK_RED + "🧑🏻",
                GRAY + "- ☄ " + ChatColor.of("#03EAFF") + "ɢʀᴏᴜɴᴅ " + GRAY + " " + DARK_RED + "🤼",
                WHITE + "",
                GRAY + "- 🌀 " + ChatColor.of("#03EAFF") + "Kinetic Overdrive " + GREEN + "🤼"

        ));
        GemMEta.setCustomModelData(16);
        Gem.setItemMeta(GemMEta);
        return Gem;

    }

    public ItemStack FluxP2T2() {

        ItemStack Gem = new ItemStack(Material.PRISMARINE_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.setDisplayName(ChatColor.of("#5ED7FF") +  "" + BOLD + "ғʟᴜx " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(Arrays.asList(
                WHITE + "" + BOLD + "ᴇᴠᴇʀʏᴛʜɪɴɢ ɪs ᴀ ғʟᴜᴄᴛᴜᴀᴛɪᴏɴ",
                WHITE + "(" + ChatColor.of("#57FFC7") + "Pristine"
                        + WHITE + " + "
                        + ChatColor.of("#96FFD9") + "2" + GRAY + ")",
                ChatColor.of("#03EAFF") + "🔮 " + ChatColor.of("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                GRAY + "- Flow State",
                GRAY + "- Shocking Chance",
                GRAY + "- Tireless",
                GRAY + "- Conduction",
                GRAY + "- Charged",
                WHITE + " ",
                ChatColor.of("#03EAFF") + "🔮 " + ChatColor.of("#82F3FF") + BOLD + " ᴀʙɪʟɪᴛʏ",
                GRAY + "- " + ChatColor.of("#03EAFF") + "Kinetic Burst",
                WHITE + "",
                ChatColor.of("#03EAFF") + "🔮 " + ChatColor.of("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                GRAY + "- ☄ " + ChatColor.of("#03EAFF") + "ᴇɴᴇʀɢʏ ʙᴇᴀᴍ " + DARK_RED + "🧑🏻",
                GRAY + "- ☄ " + ChatColor.of("#03EAFF") + "ɢʀᴏᴜɴᴅ " + GRAY + " " + DARK_RED + "🤼",
                WHITE + "",
                GRAY + "- 🌀 " + ChatColor.of("#03EAFF") + "Kinetic Overdrive " + GREEN + "🤼"

        ));
        GemMEta.setCustomModelData(16);
        Gem.setItemMeta(GemMEta);
        return Gem;

    }

    public ItemStack FluxP1T2() {

        ItemStack Gem = new ItemStack(Material.PRISMARINE_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.setDisplayName(ChatColor.of("#5ED7FF") +  "" + BOLD + "ғʟᴜx " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(Arrays.asList(
                WHITE + "" + BOLD + "ᴇᴠᴇʀʏᴛʜɪɴɢ ɪs ᴀ ғʟᴜᴄᴛᴜᴀᴛɪᴏɴ",
                WHITE + "(" + ChatColor.of("#57FFC7") + "Pristine"
                        + WHITE + " + "
                        + ChatColor.of("#96FFD9") + "1" + GRAY + ")",
                ChatColor.of("#03EAFF") + "🔮 " + ChatColor.of("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                GRAY + "- Flow State",
                GRAY + "- Shocking Chance",
                GRAY + "- Tireless",
                GRAY + "- Conduction",
                GRAY + "- Charged",
                WHITE + " ",
                ChatColor.of("#03EAFF") + "🔮 " + ChatColor.of("#82F3FF") + BOLD + " ᴀʙɪʟɪᴛʏ",
                GRAY + "- " + ChatColor.of("#03EAFF") + "Kinetic Burst",
                WHITE + "",
                ChatColor.of("#03EAFF") + "🔮 " + ChatColor.of("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                GRAY + "- ☄ " + ChatColor.of("#03EAFF") + "ᴇɴᴇʀɢʏ ʙᴇᴀᴍ " + DARK_RED + "🧑🏻",
                GRAY + "- ☄ " + ChatColor.of("#03EAFF") + "ɢʀᴏᴜɴᴅ " + GRAY + " " + DARK_RED + "🤼",
                WHITE + "",
                GRAY + "- 🌀 " + ChatColor.of("#03EAFF") + "Kinetic Overdrive " + GREEN + "🤼"

        ));
        GemMEta.setCustomModelData(16);
        Gem.setItemMeta(GemMEta);
        return Gem;

    }

    public ItemStack FluxPT2() {

        ItemStack Gem = new ItemStack(Material.PRISMARINE_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.setDisplayName(ChatColor.of("#5ED7FF") +  "" + BOLD + "ғʟᴜx " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(Arrays.asList(
                WHITE + "" + BOLD + "ᴇᴠᴇʀʏᴛʜɪɴɢ ɪs ᴀ ғʟᴜᴄᴛᴜᴀᴛɪᴏɴ",
                WHITE + "(" + ChatColor.of("#57FFC7") + "Pristine" + GRAY + ")",
                ChatColor.of("#03EAFF") + "🔮 " + ChatColor.of("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                GRAY + "- Flow State",
                GRAY + "- Shocking Chance",
                GRAY + "- Tireless",
                GRAY + "- Conduction",
                GRAY + "- Charged",
                WHITE + " ",
                ChatColor.of("#03EAFF") + "🔮 " + ChatColor.of("#82F3FF") + BOLD + " ᴀʙɪʟɪᴛʏ",
                GRAY + "- " + ChatColor.of("#03EAFF") + "Kinetic Burst",
                WHITE + "",
                ChatColor.of("#03EAFF") + "🔮 " + ChatColor.of("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                GRAY + "- ☄ " + ChatColor.of("#03EAFF") + "ᴇɴᴇʀɢʏ ʙᴇᴀᴍ " + DARK_RED + "🧑🏻",
                GRAY + "- ☄ " + ChatColor.of("#03EAFF") + "ɢʀᴏᴜɴᴅ " + GRAY + " " + DARK_RED + "🤼",
                WHITE + "",
                GRAY + "- 🌀 " + ChatColor.of("#03EAFF") + "Kinetic Overdrive " + GREEN + "🤼"

        ));
        GemMEta.setCustomModelData(16);
        Gem.setItemMeta(GemMEta);
        return Gem;

    }

    public ItemStack FluxST2() {

        ItemStack Gem = new ItemStack(Material.PRISMARINE_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.setDisplayName(ChatColor.of("#5ED7FF") +  "" + BOLD + "ғʟᴜx " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(Arrays.asList(
                WHITE + "" + BOLD + "ᴇᴠᴇʀʏᴛʜɪɴɢ ɪs ᴀ ғʟᴜᴄᴛᴜᴀᴛɪᴏɴ",
                WHITE + "(" + ChatColor.of("#57FF8F") + "Scratched" + GRAY + ")",
                ChatColor.of("#03EAFF") + "🔮 " + ChatColor.of("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                GRAY + "- Flow State",
                GRAY + "- Shocking Chance",
                GRAY + "- Conduction",
                WHITE + " ",
                ChatColor.of("#03EAFF") + "🔮 " + ChatColor.of("#82F3FF") + BOLD + " ᴀʙɪʟɪᴛʏ",
                GRAY + "- " + ChatColor.of("#03EAFF") + "Kinetic Burst",
                WHITE + "",
                ChatColor.of("#03EAFF") + "🔮 " + ChatColor.of("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                GRAY + "- ☄ " + ChatColor.of("#03EAFF") + "ᴇɴᴇʀɢʏ ʙᴇᴀᴍ " + DARK_RED + "🧑🏻",
                GRAY + "- ☄ " + ChatColor.of("#03EAFF") + "ɢʀᴏᴜɴᴅ " + GRAY + " " + DARK_RED + "🤼",
                WHITE + "",
                GRAY + "- 🌀 " + ChatColor.of("#03EAFF") + "Kinetic Overdrive " + GREEN + "🤼"

        ));
        GemMEta.setCustomModelData(36);
        Gem.setItemMeta(GemMEta);
        return Gem;

    }

    public ItemStack FluxCT2() {

        ItemStack Gem = new ItemStack(Material.PRISMARINE_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.setDisplayName(ChatColor.of("#5ED7FF") +  "" + BOLD + "ғʟᴜx " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(Arrays.asList(
                WHITE + "" + BOLD + "ᴇᴠᴇʀʏᴛʜɪɴɢ ɪs ᴀ ғʟᴜᴄᴛᴜᴀᴛɪᴏɴ",
                WHITE + "(" + ChatColor.of("#7958DB") + "Cracked" + GRAY + ")",
                ChatColor.of("#03EAFF") + "🔮 " + ChatColor.of("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                GRAY + "- Flow State",
                GRAY + "- Shocking Chance",
                WHITE + " ",
                ChatColor.of("#03EAFF") + "🔮 " + ChatColor.of("#82F3FF") + BOLD + " ᴀʙɪʟɪᴛʏ",
                GRAY + "- " + ChatColor.of("#03EAFF") + "Kinetic Burst",
                WHITE + "",
                ChatColor.of("#03EAFF") + "🔮 " + ChatColor.of("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                GRAY + "- ☄ " + ChatColor.of("#03EAFF") + "ᴇɴᴇʀɢʏ ʙᴇᴀᴍ " + DARK_RED + "🧑🏻",
                GRAY + "- ☄ " + ChatColor.of("#03EAFF") + "ɢʀᴏᴜɴᴅ " + GRAY + " " + DARK_RED + "🤼",
                WHITE + "",
                GRAY + "- 🌀 " + ChatColor.of("#03EAFF") + "Kinetic Overdrive " + GREEN + "🤼"

        ));
        GemMEta.setCustomModelData(56);
        Gem.setItemMeta(GemMEta);
        return Gem;

    }

    public ItemStack FluxDT2() {

        ItemStack Gem = new ItemStack(Material.PRISMARINE_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.setDisplayName(ChatColor.of("#5ED7FF") +  "" + BOLD + "ғʟᴜx " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(Arrays.asList(
                WHITE + "" + BOLD + "ᴇᴠᴇʀʏᴛʜɪɴɢ ɪs ᴀ ғʟᴜᴄᴛᴜᴀᴛɪᴏɴ",
                WHITE + "(" + ChatColor.of("#FFC929") + "Damaged" + GRAY + ")",
                ChatColor.of("#03EAFF") + "🔮 " + ChatColor.of("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                GRAY + "- Flow State",
                WHITE + " ",
                ChatColor.of("#03EAFF") + "🔮 " + ChatColor.of("#82F3FF") + BOLD + " ᴀʙɪʟɪᴛʏ",
                GRAY + "- " + ChatColor.of("#03EAFF") + "Kinetic Burst",
                WHITE + "",
                ChatColor.of("#03EAFF") + "🔮 " + ChatColor.of("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                GRAY + "- ☄ " + ChatColor.of("#03EAFF") + "ᴇɴᴇʀɢʏ ʙᴇᴀᴍ " + DARK_RED + "🧑🏻",
                GRAY + "- ☄ " + ChatColor.of("#03EAFF") + "ɢʀᴏᴜɴᴅ " + GRAY + " " + DARK_RED + "🤼",
                WHITE + "",
                GRAY + "- 🌀 " + ChatColor.of("#03EAFF") + "Kinetic Overdrive " + GREEN + "🤼"

        ));
        GemMEta.setCustomModelData(76);
        Gem.setItemMeta(GemMEta);
        return Gem;

    }

    public ItemStack FluxRT2() {

        ItemStack Gem = new ItemStack(Material.PRISMARINE_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.setDisplayName(ChatColor.of("#5ED7FF") +  "" + BOLD + "ғʟᴜx " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(Arrays.asList(
                WHITE + "" + BOLD + "ᴇᴠᴇʀʏᴛʜɪɴɢ ɪs ᴀ ғʟᴜᴄᴛᴜᴀᴛɪᴏɴ",
                WHITE + "(" + ChatColor.of("#FFC929") + "Damaged" + GRAY + ")",
                ChatColor.of("#03EAFF") + "🔮 " + ChatColor.of("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                GRAY + "No Passives",
                WHITE + " ",
                ChatColor.of("#03EAFF") + "🔮 " + ChatColor.of("#82F3FF") + BOLD + " ᴀʙɪʟɪᴛʏ",
                GRAY + "- " + ChatColor.of("#03EAFF") + "Kinetic Burst",
                WHITE + "",
                ChatColor.of("#03EAFF") + "🔮 " + ChatColor.of("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                GRAY + "- ☄ " + ChatColor.of("#03EAFF") + "ᴇɴᴇʀɢʏ ʙᴇᴀᴍ " + DARK_RED + "🧑🏻",
                GRAY + "- ☄ " + ChatColor.of("#03EAFF") + "ɢʀᴏᴜɴᴅ " + GRAY + " " + DARK_RED + "🤼",
                WHITE + "",
                GRAY + "- 🌀 " + ChatColor.of("#03EAFF") + "Kinetic Overdrive " + GREEN + "🤼"

        ));
        GemMEta.setCustomModelData(96);
        Gem.setItemMeta(GemMEta);
        return Gem;

    }

    public ItemStack FluxBT2() {

        ItemStack Gem = new ItemStack(Material.PRISMARINE_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.setDisplayName(ChatColor.of("#5ED7FF") +  "" + BOLD + "ғʟᴜx " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(Arrays.asList(
                WHITE + "" + BOLD + "ᴜsᴇʟᴇss"
        ));
        GemMEta.setCustomModelData(100);
        Gem.setItemMeta(GemMEta);
        return Gem;

    }

    public ItemStack StrengthP5T2() {

        ItemStack Gem = new ItemStack(Material.PRISMARINE_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.addEnchant(Enchantment.DURABILITY, 1, true);
        GemMEta.setDisplayName(ChatColor.of("#F10303") +  "" + BOLD + "sᴛʀᴇɴɢᴛʜ " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(Arrays.asList(
                WHITE + "" + BOLD + "ʜᴀᴠᴇ ᴛʜᴇ sᴛʀᴇɴɢᴛʜ ᴏғ ᴀ ᴀʀᴍʏ",
                WHITE + "(" + ChatColor.of("#57FFC7") + "Pristine"
                        + WHITE + " + "
                        + ChatColor.of("#96FFD9") + "5" + ")",
                WHITE + " ",
                ChatColor.of("#F10303") + "🔮 " + ChatColor.of("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                GRAY + "- " + GRAY + "Strength",
                GRAY + "- Enchants Sharpness",
                WHITE + " ",
                ChatColor.of("#F10303") + "🔮 " + ChatColor.of("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                GRAY + "- " + ChatColor.of("#F10303") + "Bounty Hunter",
                WHITE + " ",
                ChatColor.of("#F10303") + "🔮 " + ChatColor.of("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                GRAY + "- " + WHITE + "\uD83E\uDD3A " + ChatColor.of("#B5B5B5") + "ғʀᴀɪʟᴇʀ " + DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                GRAY + "- " + WHITE + "\uD83E\uDD3A " + ChatColor.of("#B5B5B5") + "ɴᴜʟʟɪғʏ " + DARK_RED + "\uD83E\uDD3C",
                WHITE + "",
                GRAY + "- " + WHITE + "⚔" + ChatColor.of("#910D0D") + " ᴄʜᴀᴅ sᴛʀᴇɴɢᴛʜ " + GREEN + "\uD83E\uDDD1\uD83C\uDFFB",
                GRAY + "- " + WHITE + "⚔" + ChatColor.of("#910D0D") + " ᴄʜᴀᴅ sᴛʀᴇɴɢᴛʜ " + GREEN + "\uD83E\uDD3C"

        ));
        GemMEta.setCustomModelData(10);
        Gem.setItemMeta(GemMEta);
        return Gem;

    }

    public ItemStack StrengthP4T2() {

        ItemStack Gem = new ItemStack(Material.PRISMARINE_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.setDisplayName(ChatColor.of("#F10303") +  "" + BOLD + "sᴛʀᴇɴɢᴛʜ " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(Arrays.asList(
                WHITE + "" + BOLD + "ʜᴀᴠᴇ ᴛʜᴇ sᴛʀᴇɴɢᴛʜ ᴏғ ᴀ ᴀʀᴍʏ",
                WHITE + "(" + ChatColor.of("#57FFC7") + "Pristine"
                        + WHITE + " + "
                        + ChatColor.of("#96FFD9") + "4" + ")",
                WHITE + " ",
                ChatColor.of("#F10303") + "🔮 " + ChatColor.of("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                GRAY + "- " + GRAY + "Strength",
                GRAY + "- Enchants Sharpness",
                WHITE + " ",
                ChatColor.of("#F10303") + "🔮 " + ChatColor.of("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                GRAY + "- " + ChatColor.of("#F10303") + "Bounty Hunter",
                WHITE + " ",
                ChatColor.of("#F10303") + "🔮 " + ChatColor.of("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                GRAY + "- " + WHITE + "\uD83E\uDD3A " + ChatColor.of("#B5B5B5") + "ғʀᴀɪʟᴇʀ " + DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                GRAY + "- " + WHITE + "\uD83E\uDD3A " + ChatColor.of("#B5B5B5") + "ɴᴜʟʟɪғʏ " + DARK_RED + "\uD83E\uDD3C",
                WHITE + "",
                GRAY + "- " + WHITE + "⚔" + ChatColor.of("#910D0D") + " ᴄʜᴀᴅ sᴛʀᴇɴɢᴛʜ " + GREEN + "\uD83E\uDDD1\uD83C\uDFFB",
                GRAY + "- " + WHITE + "⚔" + ChatColor.of("#910D0D") + " ᴄʜᴀᴅ sᴛʀᴇɴɢᴛʜ " + GREEN + "\uD83E\uDD3C"

        ));
        GemMEta.setCustomModelData(10);
        Gem.setItemMeta(GemMEta);
        return Gem;

    }

    public ItemStack StrengthP3T2() {

        ItemStack Gem = new ItemStack(Material.PRISMARINE_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.setDisplayName(ChatColor.of("#F10303") +  "" + BOLD + "sᴛʀᴇɴɢᴛʜ " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(Arrays.asList(
                WHITE + "" + BOLD + "ʜᴀᴠᴇ ᴛʜᴇ sᴛʀᴇɴɢᴛʜ ᴏғ ᴀ ᴀʀᴍʏ",
                WHITE + "(" + ChatColor.of("#57FFC7") + "Pristine"
                        + WHITE + " + "
                        + ChatColor.of("#96FFD9") + "3" + ")",
                WHITE + " ",
                ChatColor.of("#F10303") + "🔮 " + ChatColor.of("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                GRAY + "- " + GRAY + "Strength",
                GRAY + "- Enchants Sharpness",
                WHITE + " ",
                ChatColor.of("#F10303") + "🔮 " + ChatColor.of("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                GRAY + "- " + ChatColor.of("#F10303") + "Bounty Hunter",
                WHITE + " ",
                ChatColor.of("#F10303") + "🔮 " + ChatColor.of("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                GRAY + "- " + WHITE + "\uD83E\uDD3A " + ChatColor.of("#B5B5B5") + "ғʀᴀɪʟᴇʀ " + DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                GRAY + "- " + WHITE + "\uD83E\uDD3A " + ChatColor.of("#B5B5B5") + "ɴᴜʟʟɪғʏ " + DARK_RED + "\uD83E\uDD3C",
                WHITE + "",
                GRAY + "- " + WHITE + "⚔" + ChatColor.of("#910D0D") + " ᴄʜᴀᴅ sᴛʀᴇɴɢᴛʜ " + GREEN + "\uD83E\uDDD1\uD83C\uDFFB",
                GRAY + "- " + WHITE + "⚔" + ChatColor.of("#910D0D") + " ᴄʜᴀᴅ sᴛʀᴇɴɢᴛʜ " + GREEN + "\uD83E\uDD3C"

        ));
        GemMEta.setCustomModelData(10);
        Gem.setItemMeta(GemMEta);
        return Gem;

    }

    public ItemStack StrengthP2T2() {

        ItemStack Gem = new ItemStack(Material.PRISMARINE_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.setDisplayName(ChatColor.of("#F10303") +  "" + BOLD + "sᴛʀᴇɴɢᴛʜ " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(Arrays.asList(
                WHITE + "" + BOLD + "ʜᴀᴠᴇ ᴛʜᴇ sᴛʀᴇɴɢᴛʜ ᴏғ ᴀ ᴀʀᴍʏ",
                WHITE + "(" + ChatColor.of("#57FFC7") + "Pristine"
                        + WHITE + " + "
                        + ChatColor.of("#96FFD9") + "2" + ")",
                WHITE + " ",
                ChatColor.of("#F10303") + "🔮 " + ChatColor.of("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                GRAY + "- " + GRAY + "Strength",
                GRAY + "- Enchants Sharpness",
                WHITE + " ",
                ChatColor.of("#F10303") + "🔮 " + ChatColor.of("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                GRAY + "- " + ChatColor.of("#F10303") + "Bounty Hunter",
                WHITE + " ",
                ChatColor.of("#F10303") + "🔮 " + ChatColor.of("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                GRAY + "- " + WHITE + "\uD83E\uDD3A " + ChatColor.of("#B5B5B5") + "ғʀᴀɪʟᴇʀ " + DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                GRAY + "- " + WHITE + "\uD83E\uDD3A " + ChatColor.of("#B5B5B5") + "ɴᴜʟʟɪғʏ " + DARK_RED + "\uD83E\uDD3C",
                WHITE + "",
                GRAY + "- " + WHITE + "⚔" + ChatColor.of("#910D0D") + " ᴄʜᴀᴅ sᴛʀᴇɴɢᴛʜ " + GREEN + "\uD83E\uDDD1\uD83C\uDFFB",
                GRAY + "- " + WHITE + "⚔" + ChatColor.of("#910D0D") + " ᴄʜᴀᴅ sᴛʀᴇɴɢᴛʜ " + GREEN + "\uD83E\uDD3C"

        ));
        GemMEta.setCustomModelData(10);
        Gem.setItemMeta(GemMEta);
        return Gem;

    }

    public ItemStack StrengthP1T2() {

        ItemStack Gem = new ItemStack(Material.PRISMARINE_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.setDisplayName(ChatColor.of("#F10303") +  "" + BOLD + "sᴛʀᴇɴɢᴛʜ " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(Arrays.asList(
                WHITE + "" + BOLD + "ʜᴀᴠᴇ ᴛʜᴇ sᴛʀᴇɴɢᴛʜ ᴏғ ᴀ ᴀʀᴍʏ",
                WHITE + "(" + ChatColor.of("#57FFC7") + "Pristine"
                        + WHITE + " + "
                        + ChatColor.of("#96FFD9") + "1" + ")",
                WHITE + " ",
                ChatColor.of("#F10303") + "🔮 " + ChatColor.of("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                GRAY + "- " + GRAY + "Strength",
                GRAY + "- Enchants Sharpness",
                WHITE + " ",
                ChatColor.of("#F10303") + "🔮 " + ChatColor.of("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                GRAY + "- " + ChatColor.of("#F10303") + "Bounty Hunter",
                WHITE + " ",
                ChatColor.of("#F10303") + "🔮 " + ChatColor.of("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                GRAY + "- " + WHITE + "\uD83E\uDD3A " + ChatColor.of("#B5B5B5") + "ғʀᴀɪʟᴇʀ " + DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                GRAY + "- " + WHITE + "\uD83E\uDD3A " + ChatColor.of("#B5B5B5") + "ɴᴜʟʟɪғʏ " + DARK_RED + "\uD83E\uDD3C",
                WHITE + "",
                GRAY + "- " + WHITE + "⚔" + ChatColor.of("#910D0D") + " ᴄʜᴀᴅ sᴛʀᴇɴɢᴛʜ " + GREEN + "\uD83E\uDDD1\uD83C\uDFFB",
                GRAY + "- " + WHITE + "⚔" + ChatColor.of("#910D0D") + " ᴄʜᴀᴅ sᴛʀᴇɴɢᴛʜ " + GREEN + "\uD83E\uDD3C"

        ));
        GemMEta.setCustomModelData(10);
        Gem.setItemMeta(GemMEta);
        return Gem;

    }

    public ItemStack StrengthPT2() {

        ItemStack Gem = new ItemStack(Material.PRISMARINE_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.setDisplayName(ChatColor.of("#F10303") +  "" + BOLD + "sᴛʀᴇɴɢᴛʜ " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(Arrays.asList(
                WHITE + "" + BOLD + "ʜᴀᴠᴇ ᴛʜᴇ sᴛʀᴇɴɢᴛʜ ᴏғ ᴀ ᴀʀᴍʏ",
                WHITE + "(" + ChatColor.of("#57FFC7") + "Pristine" + WHITE + ")",
                WHITE + " ",
                ChatColor.of("#F10303") + "🔮 " + ChatColor.of("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                GRAY + "- " + GRAY + "Strength",
                GRAY + "- Enchants Sharpness",
                WHITE + " ",
                ChatColor.of("#F10303") + "🔮 " + ChatColor.of("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                GRAY + "- " + ChatColor.of("#F10303") + "Bounty Hunter",
                WHITE + " ",
                ChatColor.of("#F10303") + "🔮 " + ChatColor.of("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                GRAY + "- " + WHITE + "\uD83E\uDD3A " + ChatColor.of("#B5B5B5") + "ғʀᴀɪʟᴇʀ " + DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                GRAY + "- " + WHITE + "\uD83E\uDD3A " + ChatColor.of("#B5B5B5") + "ɴᴜʟʟɪғʏ " + DARK_RED + "\uD83E\uDD3C",
                WHITE + "",
                GRAY + "- " + WHITE + "⚔" + ChatColor.of("#910D0D") + " ᴄʜᴀᴅ sᴛʀᴇɴɢᴛʜ " + GREEN + "\uD83E\uDDD1\uD83C\uDFFB",
                GRAY + "- " + WHITE + "⚔" + ChatColor.of("#910D0D") + " ᴄʜᴀᴅ sᴛʀᴇɴɢᴛʜ " + GREEN + "\uD83E\uDD3C"

        ));
        GemMEta.setCustomModelData(10);
        Gem.setItemMeta(GemMEta);
        return Gem;

    }

    public ItemStack StrengthST2() {

        ItemStack Gem = new ItemStack(Material.PRISMARINE_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.setDisplayName(ChatColor.of("#F10303") +  "" + BOLD + "sᴛʀᴇɴɢᴛʜ " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(Arrays.asList(
                WHITE + "" + BOLD + "ʜᴀᴠᴇ ᴛʜᴇ sᴛʀᴇɴɢᴛʜ ᴏғ ᴀ ᴀʀᴍʏ",
                WHITE + "(" + ChatColor.of("#57FFC7") + "Pristine" + WHITE + ")",
                WHITE + " ",
                ChatColor.of("#F10303") + "🔮 " + ChatColor.of("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                GRAY + "- " + GRAY + "Strength",
                GRAY + "- Enchants Sharpness",
                GRAY + "- Bloodthorns",
                WHITE + " ",
                ChatColor.of("#F10303") + "🔮 " + ChatColor.of("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                GRAY + "- " + ChatColor.of("#F10303") + "Bounty Hunter",
                WHITE + " ",
                ChatColor.of("#F10303") + "🔮 " + ChatColor.of("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                GRAY + "- " + WHITE + "\uD83E\uDD3A " + ChatColor.of("#B5B5B5") + "ғʀᴀɪʟᴇʀ " + DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                GRAY + "- " + WHITE + "\uD83E\uDD3A " + ChatColor.of("#B5B5B5") + "ɴᴜʟʟɪғʏ " + DARK_RED + "\uD83E\uDD3C",
                WHITE + "",
                GRAY + "- " + WHITE + "⚔" + ChatColor.of("#910D0D") + " ᴄʜᴀᴅ sᴛʀᴇɴɢᴛʜ " + GREEN + "\uD83E\uDDD1\uD83C\uDFFB",
                GRAY + "- " + WHITE + "⚔" + ChatColor.of("#910D0D") + " ᴄʜᴀᴅ sᴛʀᴇɴɢᴛʜ " + GREEN + "\uD83E\uDD3C"

        ));
        GemMEta.setCustomModelData(30);
        Gem.setItemMeta(GemMEta);
        return Gem;

    }

    public ItemStack StrengthCT2() {

        ItemStack Gem = new ItemStack(Material.PRISMARINE_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.setDisplayName(ChatColor.of("#F10303") +  "" + BOLD + "sᴛʀᴇɴɢᴛʜ " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(Arrays.asList(
                WHITE + "" + BOLD + "ʜᴀᴠᴇ ᴛʜᴇ sᴛʀᴇɴɢᴛʜ ᴏғ ᴀ ᴀʀᴍʏ",
                WHITE + "(" + ChatColor.of("#7958DB") + "Cracked" + WHITE + ")",
                WHITE + " ",
                ChatColor.of("#F10303") + "🔮 " + ChatColor.of("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                GRAY + "- " + GRAY + "Strength",
                GRAY + "- Enchants Sharpness",
                WHITE + " ",
                ChatColor.of("#F10303") + "🔮 " + ChatColor.of("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                GRAY + "- " + ChatColor.of("#F10303") + "Bounty Hunter",
                WHITE + " ",
                ChatColor.of("#F10303") + "🔮 " + ChatColor.of("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                GRAY + "- " + WHITE + "\uD83E\uDD3A " + ChatColor.of("#B5B5B5") + "ғʀᴀɪʟᴇʀ " + DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                GRAY + "- " + WHITE + "\uD83E\uDD3A " + ChatColor.of("#B5B5B5") + "ɴᴜʟʟɪғʏ " + DARK_RED + "\uD83E\uDD3C",
                WHITE + "",
                GRAY + "- " + WHITE + "⚔" + ChatColor.of("#910D0D") + " ᴄʜᴀᴅ sᴛʀᴇɴɢᴛʜ " + GREEN + "\uD83E\uDDD1\uD83C\uDFFB",
                GRAY + "- " + WHITE + "⚔" + ChatColor.of("#910D0D") + " ᴄʜᴀᴅ sᴛʀᴇɴɢᴛʜ " + GREEN + "\uD83E\uDD3C"

        ));
        GemMEta.setCustomModelData(50);
        Gem.setItemMeta(GemMEta);
        return Gem;

    }

    public ItemStack StrengthDT2() {

        ItemStack Gem = new ItemStack(Material.PRISMARINE_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.setDisplayName(ChatColor.of("#F10303") +  "" + BOLD + "sᴛʀᴇɴɢᴛʜ " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(Arrays.asList(
                WHITE + "" + BOLD + "ʜᴀᴠᴇ ᴛʜᴇ sᴛʀᴇɴɢᴛʜ ᴏғ ᴀ ᴀʀᴍʏ",
                WHITE + "(" + ChatColor.of("#FFC929") + "Damaged" + WHITE + ")",
                WHITE + " ",
                ChatColor.of("#F10303") + "🔮 " + ChatColor.of("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                GRAY + "- " + GRAY + "Strength",
                GRAY + "- Enchants Sharpness",
                WHITE + " ",
                ChatColor.of("#F10303") + "🔮 " + ChatColor.of("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                GRAY + "- " + ChatColor.of("#F10303") + "Bounty Hunter",
                WHITE + " ",
                ChatColor.of("#F10303") + "🔮 " + ChatColor.of("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                GRAY + "- " + WHITE + "\uD83E\uDD3A " + ChatColor.of("#B5B5B5") + "ғʀᴀɪʟᴇʀ " + DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                GRAY + "- " + WHITE + "\uD83E\uDD3A " + ChatColor.of("#B5B5B5") + "ɴᴜʟʟɪғʏ " + DARK_RED + "\uD83E\uDD3C",
                WHITE + "",
                GRAY + "- " + WHITE + "⚔" + ChatColor.of("#910D0D") + " ᴄʜᴀᴅ sᴛʀᴇɴɢᴛʜ " + GREEN + "\uD83E\uDDD1\uD83C\uDFFB",
                GRAY + "- " + WHITE + "⚔" + ChatColor.of("#910D0D") + " ᴄʜᴀᴅ sᴛʀᴇɴɢᴛʜ " + GREEN + "\uD83E\uDD3C"

        ));
        GemMEta.setCustomModelData(70);
        Gem.setItemMeta(GemMEta);
        return Gem;

    }

    public ItemStack StrengthRT2() {

        ItemStack Gem = new ItemStack(Material.PRISMARINE_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.setDisplayName(ChatColor.of("#F10303") +  "" + BOLD + "sᴛʀᴇɴɢᴛʜ " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(Arrays.asList(
                WHITE + "" + BOLD + "ʜᴀᴠᴇ ᴛʜᴇ sᴛʀᴇɴɢᴛʜ ᴏғ ᴀ ᴀʀᴍʏ",
                WHITE + "(" + ChatColor.of("#FF1111") + "Ruined" + WHITE + ")",
                WHITE + " ",
                ChatColor.of("#F10303") + "🔮 " + ChatColor.of("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                GRAY + "- No Passives",
                WHITE + " ",
                ChatColor.of("#F10303") + "🔮 " + ChatColor.of("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                GRAY + "- " + ChatColor.of("#F10303") + "Bounty Hunter",
                WHITE + " ",
                ChatColor.of("#F10303") + "🔮 " + ChatColor.of("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                GRAY + "- " + WHITE + "\uD83E\uDD3A " + ChatColor.of("#B5B5B5") + "ғʀᴀɪʟᴇʀ " + DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                GRAY + "- " + WHITE + "\uD83E\uDD3A " + ChatColor.of("#B5B5B5") + "ɴᴜʟʟɪғʏ " + DARK_RED + "\uD83E\uDD3C",
                WHITE + "",
                GRAY + "- " + WHITE + "⚔" + ChatColor.of("#910D0D") + " ᴄʜᴀᴅ sᴛʀᴇɴɢᴛʜ " + GREEN + "\uD83E\uDDD1\uD83C\uDFFB",
                GRAY + "- " + WHITE + "⚔" + ChatColor.of("#910D0D") + " ᴄʜᴀᴅ sᴛʀᴇɴɢᴛʜ " + GREEN + "\uD83E\uDD3C"

        ));
        GemMEta.setCustomModelData(70);
        Gem.setItemMeta(GemMEta);
        return Gem;

    }

    public ItemStack StrengthBT2() {

        ItemStack Gem = new ItemStack(Material.PRISMARINE_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.setDisplayName(ChatColor.of("#F10303") +  "" + BOLD + "sᴛʀᴇɴɢᴛʜ " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(Arrays.asList(
                WHITE + "" + BOLD + "ᴜsᴇʟᴇss"
        ));
        GemMEta.setCustomModelData(100);
        Gem.setItemMeta(GemMEta);
        return Gem;

    }

    public ItemStack AstraP5T2() {

        ItemStack Gem = new ItemStack(Material.PRISMARINE_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.addEnchant(Enchantment.DURABILITY, 1, true);
        GemMEta.setDisplayName(ChatColor.of("#A01FFF") + "" + BOLD + "ᴀsᴛʀᴀ " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(Arrays.asList(
                WHITE + "" + BOLD + "ᴍᴀɴᴀɢᴇ ᴛʜᴇ ᴛɪᴅᴇs ᴏғ ᴛʜᴇ ᴄᴏsᴍᴏs ",
                WHITE + "(" + ChatColor.of("#57FFC7") + "Pristine"
                        + WHITE + " + "
                        + ChatColor.of("#96FFD9") + "5" + GRAY + ")",
                ChatColor.of("#A01FFF") + "🔮 " + ChatColor.of("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                GRAY + "- Phasing",
                GRAY + "- Soul Healing",
                GRAY + "- Soul Capture",
                ChatColor.of("#A01FFF") + " ",
                GRAY + " ",
                ChatColor.of("#A01FFF") + "🔮 " + ChatColor.of("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                GRAY + "- " + ChatColor.of("#A01FFF") + "Dimensional Drift",
                WHITE + "",
                ChatColor.of("#A01FFF") + "🔮 " + ChatColor.of("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                GRAY + "- " + WHITE + "🔪 " + ChatColor.of("#BFB8B8") + "ᴅᴀɢɢᴇʀs " + DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                GRAY + "- " + WHITE + "🔪 " + GRAY + "ᴜɴʙᴏᴜɴᴅᴇᴅ " + DARK_RED + "\uD83E\uDD3C",
                WHITE + "",
                GRAY + "- " + WHITE + "👻 " + ChatColor.of("#AABBBF") + "ᴀsᴛʀᴀʟ ᴘʀᴏᴊᴇᴄᴛɪᴏɴ " + GREEN + "\uD83E\uDDD1\uD83C\uDFFB",
                GRAY + "- " + WHITE + "👻 " + ChatColor.of("#AABBBF") + "ᴀsᴛʀᴀʟ ᴠᴏɪᴅ " + GREEN + "\uD83E\uDD3C"

        ));
        GemMEta.setCustomModelData(14);
        Gem.setItemMeta(GemMEta);
        return Gem;

    }

    public ItemStack AstraP4T2() {

        ItemStack Gem = new ItemStack(Material.PRISMARINE_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.setDisplayName(ChatColor.of("#A01FFF") + "" + BOLD + "ᴀsᴛʀᴀ " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(Arrays.asList(
                WHITE + "" + BOLD + "ᴍᴀɴᴀɢᴇ ᴛʜᴇ ᴛɪᴅᴇs ᴏғ ᴛʜᴇ ᴄᴏsᴍᴏs ",
                WHITE + "(" + ChatColor.of("#57FFC7") + "Pristine"
                        + WHITE + " + "
                        + ChatColor.of("#96FFD9") + "4" + GRAY + ")",
                ChatColor.of("#A01FFF") + "🔮 " + ChatColor.of("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                GRAY + "- Phasing",
                GRAY + "- Soul Healing",
                GRAY + "- Soul Capture",
                ChatColor.of("#A01FFF") + " ",
                GRAY + " ",
                ChatColor.of("#A01FFF") + "🔮 " + ChatColor.of("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                GRAY + "- " + ChatColor.of("#A01FFF") + "Dimensional Drift",
                WHITE + "",
                ChatColor.of("#A01FFF") + "🔮 " + ChatColor.of("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                GRAY + "- " + WHITE + "🔪 " + ChatColor.of("#BFB8B8") + "ᴅᴀɢɢᴇʀs " + DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                GRAY + "- " + WHITE + "🔪 " + GRAY + "ᴜɴʙᴏᴜɴᴅᴇᴅ " + DARK_RED + "\uD83E\uDD3C",
                WHITE + "",
                GRAY + "- " + WHITE + "👻 " + ChatColor.of("#AABBBF") + "ᴀsᴛʀᴀʟ ᴘʀᴏᴊᴇᴄᴛɪᴏɴ " + GREEN + "\uD83E\uDDD1\uD83C\uDFFB",
                GRAY + "- " + WHITE + "👻 " + ChatColor.of("#AABBBF") + "ᴀsᴛʀᴀʟ ᴠᴏɪᴅ " + GREEN + "\uD83E\uDD3C"

        ));
        GemMEta.setCustomModelData(14);
        Gem.setItemMeta(GemMEta);
        return Gem;

    }

    public ItemStack AstraP3T2() {

        ItemStack Gem = new ItemStack(Material.PRISMARINE_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.setDisplayName(ChatColor.of("#A01FFF") + "" + BOLD + "ᴀsᴛʀᴀ " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(Arrays.asList(
                WHITE + "" + BOLD + "ᴍᴀɴᴀɢᴇ ᴛʜᴇ ᴛɪᴅᴇs ᴏғ ᴛʜᴇ ᴄᴏsᴍᴏs ",
                WHITE + "(" + ChatColor.of("#57FFC7") + "Pristine"
                        + WHITE + " + "
                        + ChatColor.of("#96FFD9") + "3" + GRAY + ")",
                ChatColor.of("#A01FFF") + "🔮 " + ChatColor.of("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                GRAY + "- Phasing",
                GRAY + "- Soul Healing",
                GRAY + "- Soul Capture",
                ChatColor.of("#A01FFF") + " ",
                GRAY + " ",
                ChatColor.of("#A01FFF") + "🔮 " + ChatColor.of("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                GRAY + "- " + ChatColor.of("#A01FFF") + "Dimensional Drift",
                WHITE + "",
                ChatColor.of("#A01FFF") + "🔮 " + ChatColor.of("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                GRAY + "- " + WHITE + "🔪 " + ChatColor.of("#BFB8B8") + "ᴅᴀɢɢᴇʀs " + DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                GRAY + "- " + WHITE + "🔪 " + GRAY + "ᴜɴʙᴏᴜɴᴅᴇᴅ " + DARK_RED + "\uD83E\uDD3C",
                WHITE + "",
                GRAY + "- " + WHITE + "👻 " + ChatColor.of("#AABBBF") + "ᴀsᴛʀᴀʟ ᴘʀᴏᴊᴇᴄᴛɪᴏɴ " + GREEN + "\uD83E\uDDD1\uD83C\uDFFB",
                GRAY + "- " + WHITE + "👻 " + ChatColor.of("#AABBBF") + "ᴀsᴛʀᴀʟ ᴠᴏɪᴅ " + GREEN + "\uD83E\uDD3C"

        ));
        GemMEta.setCustomModelData(14);
        Gem.setItemMeta(GemMEta);
        return Gem;

    }

    public ItemStack AstraP2T2() {

        ItemStack Gem = new ItemStack(Material.PRISMARINE_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.setDisplayName(ChatColor.of("#A01FFF") + "" + BOLD + "ᴀsᴛʀᴀ " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(Arrays.asList(
                WHITE + "" + BOLD + "ᴍᴀɴᴀɢᴇ ᴛʜᴇ ᴛɪᴅᴇs ᴏғ ᴛʜᴇ ᴄᴏsᴍᴏs ",
                WHITE + "(" + ChatColor.of("#57FFC7") + "Pristine"
                        + WHITE + " + "
                        + ChatColor.of("#96FFD9") + "2" + GRAY + ")",
                ChatColor.of("#A01FFF") + "🔮 " + ChatColor.of("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                GRAY + "- Phasing",
                GRAY + "- Soul Healing",
                GRAY + "- Soul Capture",
                ChatColor.of("#A01FFF") + " ",
                GRAY + " ",
                ChatColor.of("#A01FFF") + "🔮 " + ChatColor.of("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                GRAY + "- " + ChatColor.of("#A01FFF") + "Dimensional Drift",
                WHITE + "",
                ChatColor.of("#A01FFF") + "🔮 " + ChatColor.of("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                GRAY + "- " + WHITE + "🔪 " + ChatColor.of("#BFB8B8") + "ᴅᴀɢɢᴇʀs " + DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                GRAY + "- " + WHITE + "🔪 " + GRAY + "ᴜɴʙᴏᴜɴᴅᴇᴅ " + DARK_RED + "\uD83E\uDD3C",
                WHITE + "",
                GRAY + "- " + WHITE + "👻 " + ChatColor.of("#AABBBF") + "ᴀsᴛʀᴀʟ ᴘʀᴏᴊᴇᴄᴛɪᴏɴ " + GREEN + "\uD83E\uDDD1\uD83C\uDFFB",
                GRAY + "- " + WHITE + "👻 " + ChatColor.of("#AABBBF") + "ᴀsᴛʀᴀʟ ᴠᴏɪᴅ " + GREEN + "\uD83E\uDD3C"

        ));
        GemMEta.setCustomModelData(14);
        Gem.setItemMeta(GemMEta);
        return Gem;

    }

    public ItemStack AstraP1T2() {

        ItemStack Gem = new ItemStack(Material.PRISMARINE_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.setDisplayName(ChatColor.of("#A01FFF") + "" + BOLD + "ᴀsᴛʀᴀ " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(Arrays.asList(
                WHITE + "" + BOLD + "ᴍᴀɴᴀɢᴇ ᴛʜᴇ ᴛɪᴅᴇs ᴏғ ᴛʜᴇ ᴄᴏsᴍᴏs ",
                WHITE + "(" + ChatColor.of("#57FFC7") + "Pristine"
                        + WHITE + " + "
                        + ChatColor.of("#96FFD9") + "1" + GRAY + ")",
                ChatColor.of("#A01FFF") + "🔮 " + ChatColor.of("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                GRAY + "- Phasing",
                GRAY + "- Soul Healing",
                GRAY + "- Soul Capture",
                ChatColor.of("#A01FFF") + " ",
                GRAY + " ",
                ChatColor.of("#A01FFF") + "🔮 " + ChatColor.of("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                GRAY + "- " + ChatColor.of("#A01FFF") + "Dimensional Drift",
                WHITE + "",
                ChatColor.of("#A01FFF") + "🔮 " + ChatColor.of("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                GRAY + "- " + WHITE + "🔪 " + ChatColor.of("#BFB8B8") + "ᴅᴀɢɢᴇʀs " + DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                GRAY + "- " + WHITE + "🔪 " + GRAY + "ᴜɴʙᴏᴜɴᴅᴇᴅ " + DARK_RED + "\uD83E\uDD3C",
                WHITE + "",
                GRAY + "- " + WHITE + "👻 " + ChatColor.of("#AABBBF") + "ᴀsᴛʀᴀʟ ᴘʀᴏᴊᴇᴄᴛɪᴏɴ " + GREEN + "\uD83E\uDDD1\uD83C\uDFFB",
                GRAY + "- " + WHITE + "👻 " + ChatColor.of("#AABBBF") + "ᴀsᴛʀᴀʟ ᴠᴏɪᴅ " + GREEN + "\uD83E\uDD3C"

        ));
        GemMEta.setCustomModelData(14);
        Gem.setItemMeta(GemMEta);
        return Gem;

    }

    public ItemStack AstraPT2() {

        ItemStack Gem = new ItemStack(Material.PRISMARINE_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.setDisplayName(ChatColor.of("#A01FFF") + "" + BOLD + "ᴀsᴛʀᴀ " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(Arrays.asList(
                WHITE + "" + BOLD + "ᴍᴀɴᴀɢᴇ ᴛʜᴇ ᴛɪᴅᴇs ᴏғ ᴛʜᴇ ᴄᴏsᴍᴏs ",
                WHITE + "(" + ChatColor.of("#57FFC7") + "Pristine" + GRAY + ")",
                ChatColor.of("#A01FFF") + "🔮 " + ChatColor.of("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                GRAY + "- Phasing",
                GRAY + "- Soul Healing",
                GRAY + "- Soul Capture",
                ChatColor.of("#A01FFF") + " ",
                GRAY + " ",
                ChatColor.of("#A01FFF") + "🔮 " + ChatColor.of("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                GRAY + "- " + ChatColor.of("#A01FFF") + "Dimensional Drift",
                WHITE + "",
                ChatColor.of("#A01FFF") + "🔮 " + ChatColor.of("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                GRAY + "- " + WHITE + "🔪 " + ChatColor.of("#BFB8B8") + "ᴅᴀɢɢᴇʀs " + DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                GRAY + "- " + WHITE + "🔪 " + GRAY + "ᴜɴʙᴏᴜɴᴅᴇᴅ " + DARK_RED + "\uD83E\uDD3C",
                WHITE + "",
                GRAY + "- " + WHITE + "👻 " + ChatColor.of("#AABBBF") + "ᴀsᴛʀᴀʟ ᴘʀᴏᴊᴇᴄᴛɪᴏɴ " + GREEN + "\uD83E\uDDD1\uD83C\uDFFB",
                GRAY + "- " + WHITE + "👻 " + ChatColor.of("#AABBBF") + "ᴀsᴛʀᴀʟ ᴠᴏɪᴅ " + GREEN + "\uD83E\uDD3C"

        ));
        GemMEta.setCustomModelData(14);
        Gem.setItemMeta(GemMEta);
        return Gem;

    }

    public ItemStack AstraST2() {

        ItemStack Gem = new ItemStack(Material.PRISMARINE_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.setDisplayName(ChatColor.of("#A01FFF") + "" + BOLD + "ᴀsᴛʀᴀ " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(Arrays.asList(
                WHITE + "" + BOLD + "ᴍᴀɴᴀɢᴇ ᴛʜᴇ ᴛɪᴅᴇs ᴏғ ᴛʜᴇ ᴄᴏsᴍᴏs ",
                WHITE + "(" + ChatColor.of("#57FF8F") + "Scratched" + GRAY + ")",
                ChatColor.of("#A01FFF") + "\uD83D\uDD3A " + ChatColor.of("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                GRAY + "- Phasing",
                GRAY + "- Soul Healing",
                GRAY + "- Soul Capture",
                ChatColor.of("#A01FFF") + " ",
                GRAY + " ",
                ChatColor.of("#A01FFF") + "🔮 " + ChatColor.of("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                GRAY + "- " + ChatColor.of("#A01FFF") + "Dimensional Drift",
                WHITE + "",
                ChatColor.of("#A01FFF") + "🔮 " + ChatColor.of("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                GRAY + "- " + WHITE + "🔪 " + ChatColor.of("#BFB8B8") + "ᴅᴀɢɢᴇʀs " + DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                GRAY + "- " + WHITE + "🔪 " + GRAY + "ᴜɴʙᴏᴜɴᴅᴇᴅ " + DARK_RED + "\uD83E\uDD3C",
                WHITE + "",
                GRAY + "- " + WHITE + "👻 " + ChatColor.of("#AABBBF") + "ᴀsᴛʀᴀʟ ᴘʀᴏᴊᴇᴄᴛɪᴏɴ " + GREEN + "\uD83E\uDDD1\uD83C\uDFFB",
                GRAY + "- " + WHITE + "👻 " + ChatColor.of("#AABBBF") + "ᴀsᴛʀᴀʟ ᴠᴏɪᴅ " + GREEN + "\uD83E\uDD3C"

        ));
        GemMEta.setCustomModelData(34);
        Gem.setItemMeta(GemMEta);
        return Gem;

    }

    public ItemStack AstraCT2() {

        ItemStack Gem = new ItemStack(Material.PRISMARINE_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.setDisplayName(ChatColor.of("#A01FFF") + "" + BOLD + "ᴀsᴛʀᴀ " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(Arrays.asList(
                WHITE + "" + BOLD + "ᴍᴀɴᴀɢᴇ ᴛʜᴇ ᴛɪᴅᴇs ᴏғ ᴛʜᴇ ᴄᴏsᴍᴏs ",
                WHITE + "(" + ChatColor.of("#7958DB") + "Cracked" + GRAY + ")",
                ChatColor.of("#A01FFF") + " ",
                ChatColor.of("#A01FFF") + "\uD83D\uDD3A " + ChatColor.of("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                GRAY + "- Phasing",
                GRAY + "- Soul Healing",
                GRAY + " ",
                ChatColor.of("#A01FFF") + "🔮" + " " + ChatColor.of("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                GRAY + "- " + ChatColor.of("#A01FFF") + "Dimensional Drift",
                WHITE + "",
                ChatColor.of("#A01FFF") + "🔮 " + ChatColor.of("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                GRAY + "- " + WHITE + "🔪 " + ChatColor.of("#BFB8B8") + "ᴅᴀɢɢᴇʀs " + DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                GRAY + "- " + WHITE + "🔪 " + GRAY + "ᴜɴʙᴏᴜɴᴅᴇᴅ " + DARK_RED + "\uD83E\uDD3C",
                WHITE + "",
                GRAY + "- " + WHITE + "👻 " + ChatColor.of("#AABBBF") + "ᴀsᴛʀᴀʟ ᴘʀᴏᴊᴇᴄᴛɪᴏɴ " + GREEN + "\uD83E\uDDD1\uD83C\uDFFB",
                GRAY + "- " + WHITE + "👻 " + ChatColor.of("#AABBBF") + "ᴀsᴛʀᴀʟ ᴠᴏɪᴅ " + GREEN + "\uD83E\uDD3C"

        ));
        GemMEta.setCustomModelData(54);
        Gem.setItemMeta(GemMEta);
        return Gem;

    }

    public ItemStack AstraDT2() {

        ItemStack Gem = new ItemStack(Material.PRISMARINE_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.setDisplayName(ChatColor.of("#A01FFF") + "" + BOLD + "ᴀsᴛʀᴀ " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(Arrays.asList(
                WHITE + "" + BOLD + "ᴍᴀɴᴀɢᴇ ᴛʜᴇ ᴛɪᴅᴇs ᴏғ ᴛʜᴇ ᴄᴏsᴍᴏs ",
                WHITE + "(" + ChatColor.of("#FFC929") + "Damaged" + GRAY + ")",
                ChatColor.of("#A01FFF") + "\uD83D\uDD3A " + ChatColor.of("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                GRAY + "- Soul Healing",
                GRAY + "- Soul Capture",
                ChatColor.of("#A01FFF") + " ",
                GRAY + " ",
                ChatColor.of("#A01FFF") + "🔮 " + ChatColor.of("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                GRAY + "- " + ChatColor.of("#A01FFF") + "Dimensional Drift",
                WHITE + "",
                ChatColor.of("#A01FFF") + "🔮 " + ChatColor.of("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                GRAY + "- " + WHITE + "🔪 " + ChatColor.of("#BFB8B8") + "ᴅᴀɢɢᴇʀs " + DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                GRAY + "- " + WHITE + "🔪 " + GRAY + "ᴜɴʙᴏᴜɴᴅᴇᴅ " + DARK_RED + "\uD83E\uDD3C",
                WHITE + "",
                GRAY + "- " + WHITE + "👻 " + ChatColor.of("#AABBBF") + "ᴀsᴛʀᴀʟ ᴘʀᴏᴊᴇᴄᴛɪᴏɴ " + GREEN + "\uD83E\uDDD1\uD83C\uDFFB",
                GRAY + "- " + WHITE + "👻 " + ChatColor.of("#AABBBF") + "ᴀsᴛʀᴀʟ ᴠᴏɪᴅ " + GREEN + "\uD83E\uDD3C"

        ));
        GemMEta.setCustomModelData(74);
        Gem.setItemMeta(GemMEta);
        return Gem;

    }

    public ItemStack AstraRT2() {

        ItemStack Gem = new ItemStack(Material.PRISMARINE_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.setDisplayName(ChatColor.of("#A01FFF") + "" + BOLD + "ᴀsᴛʀᴀ " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(Arrays.asList(
                WHITE + "" + BOLD + "ᴍᴀɴᴀɢᴇ ᴛʜᴇ ᴛɪᴅᴇs ᴏғ ᴛʜᴇ ᴄᴏsᴍᴏs ",
                WHITE + "(" + ChatColor.of("#FF1111") + "Ruined" + GRAY + ")",
                ChatColor.of("#A01FFF") + "🔮 " + ChatColor.of("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                GRAY + "No Passives",
                ChatColor.of("#A01FFF") + " ",
                GRAY + " ",
                ChatColor.of("#A01FFF") + "🔮 " + ChatColor.of("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                GRAY + "- " + ChatColor.of("#A01FFF") + "Dimensional Drift",
                WHITE + "",
                ChatColor.of("#A01FFF") + "🔮 " + ChatColor.of("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                GRAY + "- " + WHITE + "🔪 " + ChatColor.of("#BFB8B8") + "ᴅᴀɢɢᴇʀs " + DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                GRAY + "- " + WHITE + "🔪 " + GRAY + "ᴜɴʙᴏᴜɴᴅᴇᴅ " + DARK_RED + "\uD83E\uDD3C",
                WHITE + "",
                GRAY + "- " + WHITE + "👻 " + ChatColor.of("#AABBBF") + "ᴀsᴛʀᴀʟ ᴘʀᴏᴊᴇᴄᴛɪᴏɴ " + GREEN + "\uD83E\uDDD1\uD83C\uDFFB",
                GRAY + "- " + WHITE + "👻 " + ChatColor.of("#AABBBF") + "ᴀsᴛʀᴀʟ ᴠᴏɪᴅ " + GREEN + "\uD83E\uDD3C"

        ));
        GemMEta.setCustomModelData(94);
        Gem.setItemMeta(GemMEta);
        return Gem;

    }

    public ItemStack AstraBT2() {

        ItemStack Gem = new ItemStack(Material.PRISMARINE_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.setDisplayName(ChatColor.of("#A01FFF") + "" + BOLD + "ᴀsᴛʀᴀ " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(Arrays.asList(
                WHITE + "" + BOLD + "ᴜsᴇʟᴇss"
        ));
        GemMEta.setCustomModelData(100);
        Gem.setItemMeta(GemMEta);
        return Gem;

    }

    public ItemStack WealthP5T1() {
        ItemStack Gem = new ItemStack(Material.AMETHYST_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.setDisplayName(ChatColor.of("#0EC912") + "" + BOLD + "ᴡᴇᴀʟᴛʜ " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.addEnchant(Enchantment.DURABILITY, 1, true);
        GemMEta.setLore(Arrays.asList(
                WHITE + "" + BOLD + "ғᴜᴇʟ ᴀ ᴇᴍᴘɪʀᴇ",
                WHITE + "(" + ChatColor.of("#57FFC7") + "Pristine"
                        + WHITE + " + "
                        + ChatColor.of("#96FFD9") + "5" + ")",
                WHITE + "",
                ChatColor.of("#0EC912") + "\uD83D\uDD3A " + ChatColor.of("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                GRAY + "- Hero ChatColor.of the village",
                GRAY + "- Luck",
                GRAY + "- Enchants Mending",
                GRAY + "- Enchants Fortune",
                GRAY + "- Enchants Looting",
                GRAY + "- Bonus Ores",
                GRAY + "- Extra EXP",
                GRAY + "- Durability Chip",
                WHITE + " ",
                ChatColor.of("#0EC912") + "\uD83D\uDD3A " + ChatColor.of("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                GRAY + "- " + ChatColor.of("#0EC912") + "Pockets",
                WHITE + "",
                ChatColor.of("#0EC912") + "🔮 " + ChatColor.of("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                WHITE + "" + BOLD + "Unknown"
        ));
        GemMEta.setCustomModelData(11);
        Gem.setItemMeta(GemMEta);
        return Gem;
    }

    public ItemStack WealthP4T1() {
        ItemStack Gem = new ItemStack(Material.AMETHYST_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.setDisplayName(ChatColor.of("#0EC912") + "" + BOLD + "ᴡᴇᴀʟᴛʜ " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(Arrays.asList(
                WHITE + "" + BOLD + "ғᴜᴇʟ ᴀ ᴇᴍᴘɪʀᴇ",
                WHITE + "(" + ChatColor.of("#57FFC7") + "Pristine"
                        + WHITE + " + "
                        + ChatColor.of("#96FFD9") + "4" + ")",
                WHITE + "",
                ChatColor.of("#0EC912") + "\uD83D\uDD3A " + ChatColor.of("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                GRAY + "- Hero ChatColor.of the village",
                GRAY + "- Luck",
                GRAY + "- Enchants Mending",
                GRAY + "- Enchants Fortune",
                GRAY + "- Enchants Looting",
                GRAY + "- Bonus Ores",
                GRAY + "- Extra EXP",
                GRAY + "- Durability Chip",
                WHITE + " ",
                ChatColor.of("#0EC912") + "\uD83D\uDD3A " + ChatColor.of("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                GRAY + "- " + ChatColor.of("#0EC912") + "Pockets",
                WHITE + "",
                ChatColor.of("#0EC912") + "🔮 " + ChatColor.of("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                WHITE + "" + BOLD + "Unknown"
        ));
        GemMEta.setCustomModelData(11);
        Gem.setItemMeta(GemMEta);
        return Gem;
    }

    public ItemStack WealthP3T1() {
        ItemStack Gem = new ItemStack(Material.AMETHYST_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.setDisplayName(ChatColor.of("#0EC912") + "" + BOLD + "ᴡᴇᴀʟᴛʜ " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(Arrays.asList(
                WHITE + "" + BOLD + "ғᴜᴇʟ ᴀ ᴇᴍᴘɪʀᴇ",
                WHITE + "(" + ChatColor.of("#57FFC7") + "Pristine"
                        + WHITE + " + "
                        + ChatColor.of("#96FFD9") + "3" + ")",
                WHITE + "",
                ChatColor.of("#0EC912") + "\uD83D\uDD3A " + ChatColor.of("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                GRAY + "- Hero ChatColor.of the village",
                GRAY + "- Luck",
                GRAY + "- Enchants Mending",
                GRAY + "- Enchants Fortune",
                GRAY + "- Enchants Looting",
                GRAY + "- Bonus Ores",
                GRAY + "- Extra EXP",
                GRAY + "- Durability Chip",
                WHITE + " ",
                ChatColor.of("#0EC912") + "\uD83D\uDD3A " + ChatColor.of("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                GRAY + "- " + ChatColor.of("#0EC912") + "Pockets",
                WHITE + "",
                ChatColor.of("#0EC912") + "🔮 " + ChatColor.of("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                WHITE + "" + BOLD + "Unknown"
        ));
        GemMEta.setCustomModelData(11);
        Gem.setItemMeta(GemMEta);
        return Gem;
    }

    public ItemStack WealthP2T1() {
        ItemStack Gem = new ItemStack(Material.AMETHYST_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.setDisplayName(ChatColor.of("#0EC912") + "" + BOLD + "ᴡᴇᴀʟᴛʜ " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(Arrays.asList(
                WHITE + "" + BOLD + "ғᴜᴇʟ ᴀ ᴇᴍᴘɪʀᴇ",
                WHITE + "(" + ChatColor.of("#57FFC7") + "Pristine"
                        + WHITE + " + "
                        + ChatColor.of("#96FFD9") + "2" + ")",
                WHITE + "",
                ChatColor.of("#0EC912") + "\uD83D\uDD3A " + ChatColor.of("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                GRAY + "- Hero ChatColor.of the village",
                GRAY + "- Luck",
                GRAY + "- Enchants Mending",
                GRAY + "- Enchants Fortune",
                GRAY + "- Enchants Looting",
                GRAY + "- Bonus Ores",
                GRAY + "- Extra EXP",
                GRAY + "- Durability Chip",
                WHITE + " ",
                ChatColor.of("#0EC912") + "\uD83D\uDD3A " + ChatColor.of("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                GRAY + "- " + ChatColor.of("#0EC912") + "Pockets",
                WHITE + "",
                ChatColor.of("#0EC912") + "🔮 " + ChatColor.of("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                WHITE + "" + BOLD + "Unknown"
        ));
        GemMEta.setCustomModelData(11);
        Gem.setItemMeta(GemMEta);
        return Gem;
    }

    public ItemStack WealthP1T1() {
        ItemStack Gem = new ItemStack(Material.AMETHYST_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.setDisplayName(ChatColor.of("#0EC912") + "" + BOLD + "ᴡᴇᴀʟᴛʜ " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(Arrays.asList(
                WHITE + "" + BOLD + "ғᴜᴇʟ ᴀ ᴇᴍᴘɪʀᴇ",
                WHITE + "(" + ChatColor.of("#57FFC7") + "Pristine"
                        + WHITE + " + "
                        + ChatColor.of("#96FFD9") + "1" + ")",
                WHITE + "",
                ChatColor.of("#0EC912") + "\uD83D\uDD3A " + ChatColor.of("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                GRAY + "- Hero ChatColor.of the village",
                GRAY + "- Luck",
                GRAY + "- Enchants Mending",
                GRAY + "- Enchants Fortune",
                GRAY + "- Enchants Looting",
                GRAY + "- Bonus Ores",
                GRAY + "- Extra EXP",
                GRAY + "- Durability Chip",
                WHITE + " ",
                ChatColor.of("#0EC912") + "\uD83D\uDD3A " + ChatColor.of("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                GRAY + "- " + ChatColor.of("#0EC912") + "Pockets",
                WHITE + "",
                ChatColor.of("#0EC912") + "🔮 " + ChatColor.of("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                WHITE + "" + BOLD + "Unknown"
        ));
        GemMEta.setCustomModelData(11);
        Gem.setItemMeta(GemMEta);
        return Gem;
    }

    public ItemStack WealthPT1() {
        ItemStack Gem = new ItemStack(Material.AMETHYST_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.setDisplayName(ChatColor.of("#0EC912") + "" + BOLD + "ᴡᴇᴀʟᴛʜ " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(Arrays.asList(
                WHITE + "" + BOLD + "ғᴜᴇʟ ᴀ ᴇᴍᴘɪʀᴇ",
                WHITE + "(" + ChatColor.of("#57FFC7") + "Pristine" + WHITE + ")",
                WHITE + "",
                ChatColor.of("#0EC912") + "\uD83D\uDD3A " + ChatColor.of("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                GRAY + "- Hero ChatColor.of the village",
                GRAY + "- Luck",
                GRAY + "- Enchants Mending",
                GRAY + "- Enchants Fortune",
                GRAY + "- Enchants Looting",
                GRAY + "- Bonus Ores",
                GRAY + "- Extra EXP",
                GRAY + "- Durability Chip",
                WHITE + " ",
                ChatColor.of("#0EC912") + "\uD83D\uDD3A " + ChatColor.of("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                GRAY + "- " + ChatColor.of("#0EC912") + "Pockets",
                WHITE + "",
                ChatColor.of("#0EC912") + "🔮 " + ChatColor.of("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                WHITE + "" + BOLD + "Unknown"
        ));
        GemMEta.setCustomModelData(11);
        Gem.setItemMeta(GemMEta);
        return Gem;
    }

    public ItemStack WealthST1() {
        ItemStack Gem = new ItemStack(Material.AMETHYST_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.setDisplayName(ChatColor.of("#0EC912") + "" + BOLD + "ᴡᴇᴀʟᴛʜ " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(Arrays.asList(
                WHITE + "" + BOLD + "ғᴜᴇʟ ᴀ ᴇᴍᴘɪʀᴇ",
                WHITE + "(" + ChatColor.of("#57FF8F") + "Scratched" + WHITE + ")",
                WHITE + "",
                ChatColor.of("#0EC912") + "\uD83D\uDD3A " + ChatColor.of("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                GRAY + "- Hero ChatColor.of the village",
                GRAY + "- Enchants Mending",
                GRAY + "- Enchants Looting",
                GRAY + "- Bonus Ores",
                GRAY + "- Durability Chip",
                WHITE + " ",
                ChatColor.of("#0EC912") + "\uD83D\uDD3A " + ChatColor.of("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                GRAY + "- " + ChatColor.of("#0EC912") + "Pockets",
                WHITE + "",
                ChatColor.of("#0EC912") + "🔮 " + ChatColor.of("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                WHITE + "" + BOLD + "Unknown"
        ));
        GemMEta.setCustomModelData(31);
        Gem.setItemMeta(GemMEta);
        return Gem;
    }

    public ItemStack WealthCT1() {
        ItemStack Gem = new ItemStack(Material.AMETHYST_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.setDisplayName(ChatColor.of("#0EC912") + "" + BOLD + "ᴡᴇᴀʟᴛʜ " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(Arrays.asList(
                WHITE + "" + BOLD + "ғᴜᴇʟ ᴀ ᴇᴍᴘɪʀᴇ",
                WHITE + "(" + ChatColor.of("#7958DB") + "Cracked" + WHITE + ")",
                WHITE + "",
                ChatColor.of("#0EC912") + "\uD83D\uDD3A " + ChatColor.of("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                GRAY + "- Enchants Looting",
                GRAY + "- Bonus Ores",
                GRAY + "- Durability Chip",
                WHITE + " ",
                ChatColor.of("#0EC912") + "\uD83D\uDD3A " + ChatColor.of("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                GRAY + "- " + ChatColor.of("#0EC912") + "Pockets",
                WHITE + "",
                ChatColor.of("#0EC912") + "🔮 " + ChatColor.of("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                WHITE + "" + BOLD + "Unknown"
        ));
        GemMEta.setCustomModelData(51);
        Gem.setItemMeta(GemMEta);
        return Gem;
    }

    public ItemStack WealthDT1() {
        ItemStack Gem = new ItemStack(Material.AMETHYST_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.setDisplayName(ChatColor.of("#0EC912") + "" + BOLD + "ᴡᴇᴀʟᴛʜ " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(Arrays.asList(
                WHITE + "" + BOLD + "ғᴜᴇʟ ᴀ ᴇᴍᴘɪʀᴇ",
                WHITE + "(" + ChatColor.of("#FFC929") + "Damaged" + WHITE + ")",
                WHITE + "",
                ChatColor.of("#0EC912") + "\uD83D\uDD3A " + ChatColor.of("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                GRAY + "- Durability Chip",
                WHITE + " ",
                ChatColor.of("#0EC912") + "\uD83D\uDD3A " + ChatColor.of("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                GRAY + "- " + ChatColor.of("#0EC912") + "Pockets",
                WHITE + "",
                ChatColor.of("#0EC912") + "🔮 " + ChatColor.of("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                WHITE + "" + BOLD + "Unknown"
        ));
        GemMEta.setCustomModelData(71);
        Gem.setItemMeta(GemMEta);
        return Gem;
    }

    public ItemStack WealthRT1() {
        ItemStack Gem = new ItemStack(Material.AMETHYST_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.setDisplayName(ChatColor.of("#0EC912") + "" + BOLD + "ᴡᴇᴀʟᴛʜ " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(Arrays.asList(
                WHITE + "" + BOLD + "ғᴜᴇʟ ᴀ ᴇᴍᴘɪʀᴇ",
                WHITE + "(" + ChatColor.of("#FF1111") + "Ruined" + WHITE + ")",
                WHITE + "",
                ChatColor.of("#0EC912") + "\uD83D\uDD3A " + ChatColor.of("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                GRAY + "No Passives",
                WHITE + " ",
                ChatColor.of("#0EC912") + "\uD83D\uDD3A " + ChatColor.of("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                GRAY + "- " + ChatColor.of("#0EC912") + "Pockets",
                WHITE + "",
                ChatColor.of("#0EC912") + "🔮 " + ChatColor.of("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                WHITE + "" + BOLD + "Unknown"
        ));
        GemMEta.setCustomModelData(91);
        Gem.setItemMeta(GemMEta);
        return Gem;
    }

    public ItemStack WealthBT1() {
        ItemStack Gem = new ItemStack(Material.AMETHYST_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.setDisplayName(ChatColor.of("#0EC912") + "" + BOLD + "ᴡᴇᴀʟᴛʜ " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(Arrays.asList(
                WHITE + "" + BOLD + "ᴜsᴇʟᴇss"
        ));
        GemMEta.setCustomModelData(99);
        Gem.setItemMeta(GemMEta);
        return Gem;
    }

    public ItemStack PuffP5T1() {
        ItemStack Gem = new ItemStack(Material.AMETHYST_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.setDisplayName(WHITE + "" + BOLD + "ᴘᴜғғ " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.addEnchant(Enchantment.DURABILITY, 1, true);
        GemMEta.setLore(Arrays.asList(
                WHITE + "" + BOLD + "ʙᴇ ᴛʜᴇ ʙɪɢɢᴇsᴛ ʙɪʀᴅ",
                WHITE + "(" + ChatColor.of("#57FFC7") + "Pristine"
                        + WHITE + " + "
                        + ChatColor.of("#96FFD9") + "5" + ")",
                WHITE + " ",
                WHITE + "\uD83D\uDD3A " + ChatColor.of("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                GRAY + "- Fall Damage immunity",
                GRAY + "- Enchants Power",
                GRAY + "- Enchants Punch",
                GRAY + "- Sculk Silence",
                GRAY + "- Crop Tramp-Less",
                WHITE + " ",
                WHITE + "\uD83D\uDD3A " + ChatColor.of("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                GRAY + "- " + WHITE + "Double Jump",
                WHITE + " ",
                WHITE + "🔮 " + ChatColor.of("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                WHITE + "" + BOLD + "required"
        ));
        GemMEta.setCustomModelData(6);
        Gem.setItemMeta(GemMEta);
        return Gem;

    }

    public ItemStack PuffP4T1() {
        ItemStack Gem = new ItemStack(Material.AMETHYST_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.setDisplayName(WHITE + "" + BOLD + "ᴘᴜғғ " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(Arrays.asList(
                WHITE + "" + BOLD + "ʙᴇ ᴛʜᴇ ʙɪɢɢᴇsᴛ ʙɪʀᴅ",
                WHITE + "(" + ChatColor.of("#57FFC7") + "Pristine"
                        + WHITE + " + "
                        + ChatColor.of("#96FFD9") + "4" + ")",
                WHITE + " ",
                WHITE + "\uD83D\uDD3A " + ChatColor.of("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                GRAY + "- Fall Damage immunity",
                GRAY + "- Enchants Power",
                GRAY + "- Enchants Punch",
                GRAY + "- Sculk Silence",
                GRAY + "- Crop Tramp-Less",
                WHITE + " ",
                WHITE + "\uD83D\uDD3A " + ChatColor.of("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                GRAY + "- " + WHITE + "Double Jump",
                WHITE + " ",
                WHITE + "🔮 " + ChatColor.of("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                WHITE + "" + BOLD + "required"
        ));
        GemMEta.setCustomModelData(6);
        Gem.setItemMeta(GemMEta);
        return Gem;

    }

    public ItemStack PuffP3T1() {
        ItemStack Gem = new ItemStack(Material.AMETHYST_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.setDisplayName(WHITE + "" + BOLD + "ᴘᴜғғ " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(Arrays.asList(
                WHITE + "" + BOLD + "ʙᴇ ᴛʜᴇ ʙɪɢɢᴇsᴛ ʙɪʀᴅ",
                WHITE + "(" + ChatColor.of("#57FFC7") + "Pristine"
                        + WHITE + " + "
                        + ChatColor.of("#96FFD9") + "3" + ")",
                WHITE + " ",
                WHITE + "\uD83D\uDD3A " + ChatColor.of("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                GRAY + "- Fall Damage immunity",
                GRAY + "- Enchants Power",
                GRAY + "- Enchants Punch",
                GRAY + "- Sculk Silence",
                GRAY + "- Crop Tramp-Less",
                WHITE + " ",
                WHITE + "\uD83D\uDD3A " + ChatColor.of("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                GRAY + "- " + WHITE + "Double Jump",
                WHITE + " ",
                WHITE + "🔮 " + ChatColor.of("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                WHITE + "" + BOLD + "required"
        ));
        GemMEta.setCustomModelData(6);
        Gem.setItemMeta(GemMEta);
        return Gem;

    }

    public ItemStack PuffP2T1() {
        ItemStack Gem = new ItemStack(Material.AMETHYST_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.setDisplayName(WHITE + "" + BOLD + "ᴘᴜғғ " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(Arrays.asList(
                WHITE + "" + BOLD + "ʙᴇ ᴛʜᴇ ʙɪɢɢᴇsᴛ ʙɪʀᴅ",
                WHITE + "(" + ChatColor.of("#57FFC7") + "Pristine"
                        + WHITE + " + "
                        + ChatColor.of("#96FFD9") + "2" + ")",
                WHITE + " ",
                WHITE + "\uD83D\uDD3A " + ChatColor.of("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                GRAY + "- Fall Damage immunity",
                GRAY + "- Enchants Power",
                GRAY + "- Enchants Punch",
                GRAY + "- Sculk Silence",
                GRAY + "- Crop Tramp-Less",
                WHITE + " ",
                WHITE + "\uD83D\uDD3A " + ChatColor.of("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                GRAY + "- " + WHITE + "Double Jump",
                WHITE + " ",
                WHITE + "🔮 " + ChatColor.of("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                WHITE + "" + BOLD + "required"
        ));
        GemMEta.setCustomModelData(6);
        Gem.setItemMeta(GemMEta);
        return Gem;

    }

    public ItemStack PuffP1T1() {
        ItemStack Gem = new ItemStack(Material.AMETHYST_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.setDisplayName(WHITE + "" + BOLD + "ᴘᴜғғ " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(Arrays.asList(
                WHITE + "" + BOLD + "ʙᴇ ᴛʜᴇ ʙɪɢɢᴇsᴛ ʙɪʀᴅ",
                WHITE + "(" + ChatColor.of("#57FFC7") + "Pristine"
                        + WHITE + " + "
                        + ChatColor.of("#96FFD9") + "1" + ")",
                WHITE + " ",
                WHITE + "\uD83D\uDD3A " + ChatColor.of("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                GRAY + "- Fall Damage immunity",
                GRAY + "- Enchants Power",
                GRAY + "- Enchants Punch",
                GRAY + "- Sculk Silence",
                GRAY + "- Crop Tramp-Less",
                WHITE + " ",
                WHITE + "\uD83D\uDD3A " + ChatColor.of("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                GRAY + "- " + WHITE + "Double Jump",
                WHITE + " ",
                WHITE + "🔮 " + ChatColor.of("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                WHITE + "" + BOLD + "required"
        ));
        GemMEta.setCustomModelData(6);
        Gem.setItemMeta(GemMEta);
        return Gem;

    }

    public ItemStack PuffPT1() {
        ItemStack Gem = new ItemStack(Material.AMETHYST_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.setDisplayName(WHITE + "" + BOLD + "ᴘᴜғғ " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(Arrays.asList(
                WHITE + "" + BOLD + "ʙᴇ ᴛʜᴇ ʙɪɢɢᴇsᴛ ʙɪʀᴅ",
                WHITE + "(" + ChatColor.of("#57FFC7") + "Pristine" + WHITE + ")",
                WHITE + " ",
                WHITE + "\uD83D\uDD3A " + ChatColor.of("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                GRAY + "- Fall Damage immunity",
                GRAY + "- Enchants Power",
                GRAY + "- Enchants Punch",
                GRAY + "- Sculk Silence",
                GRAY + "- Crop Tramp-Less",
                WHITE + " ",
                WHITE + "\uD83D\uDD3A " + ChatColor.of("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                GRAY + "- " + WHITE + "Double Jump",
                WHITE + " ",
                WHITE + "🔮 " + ChatColor.of("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                WHITE + "" + BOLD + "required"
        ));
        GemMEta.setCustomModelData(6);
        Gem.setItemMeta(GemMEta);
        return Gem;

    }

    public ItemStack PuffST1() {
        ItemStack Gem = new ItemStack(Material.AMETHYST_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.setDisplayName(WHITE + "" + BOLD + "ᴘᴜғғ " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(Arrays.asList(
                WHITE + "" + BOLD + "ʙᴇ ᴛʜᴇ ʙɪɢɢᴇsᴛ ʙɪʀᴅ",
                WHITE + "(" + ChatColor.of("#57FF8F") + "Scratched" + WHITE + ")",
                WHITE + " ",
                WHITE + "\uD83D\uDD3A " + ChatColor.of("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                GRAY + "- Fall Damage immunity",
                GRAY + "- Enchants Punch",
                GRAY + "- Crop Tramp-Less",
                WHITE + " ",
                WHITE + "\uD83D\uDD3A " + ChatColor.of("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                GRAY + "- " + WHITE + "Double Jump",
                WHITE + " ",
                WHITE + "🔮 " + ChatColor.of("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                WHITE + "" + BOLD + "required"
        ));
        GemMEta.setCustomModelData(26);
        Gem.setItemMeta(GemMEta);
        return Gem;

    }

    public ItemStack PuffCT1() {
        ItemStack Gem = new ItemStack(Material.AMETHYST_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.setDisplayName(WHITE + "" + BOLD + "ᴘᴜғғ " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(Arrays.asList(
                WHITE + "" + BOLD + "ʙᴇ ᴛʜᴇ ʙɪɢɢᴇsᴛ ʙɪʀᴅ",
                WHITE + "(" + ChatColor.of("#7958DB") + "Cracked" + WHITE + ")",
                WHITE + " ",
                WHITE + "\uD83D\uDD3A " + ChatColor.of("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                GRAY + "- Fall Damage immunity",
                GRAY + "- Enchants Punch",
                GRAY + "- Crop Tramp-Less",
                WHITE + " ",
                WHITE + "\uD83D\uDD3A " + ChatColor.of("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                GRAY + "- " + WHITE + "Double Jump",
                WHITE + " ",
                WHITE + "🔮 " + ChatColor.of("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                WHITE + "" + BOLD + "required"
        ));
        GemMEta.setCustomModelData(46);
        Gem.setItemMeta(GemMEta);
        return Gem;

    }

    public ItemStack PuffDT1() {
        ItemStack Gem = new ItemStack(Material.AMETHYST_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.setDisplayName(WHITE + "" + BOLD + "ᴘᴜғғ " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(Arrays.asList(
                WHITE + "" + BOLD + "ʙᴇ ᴛʜᴇ ʙɪɢɢᴇsᴛ ʙɪʀᴅ",
                WHITE + "(" + ChatColor.of("#FFC929") + "Damaged" + WHITE + ")",
                WHITE + " ",
                WHITE + "\uD83D\uDD3A " + ChatColor.of("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                GRAY + "- Crop Tramp-Less",
                WHITE + " ",
                WHITE + "\uD83D\uDD3A " + ChatColor.of("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                GRAY + "- " + WHITE + "Double Jump",
                WHITE + " ",
                WHITE + "🔮 " + ChatColor.of("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                WHITE + "" + BOLD + "required"
        ));
        GemMEta.setCustomModelData(66);
        Gem.setItemMeta(GemMEta);
        return Gem;

    }

    public ItemStack PuffRT1() {
        ItemStack Gem = new ItemStack(Material.AMETHYST_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.setDisplayName(WHITE + "" + BOLD + "ᴘᴜғғ " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(Arrays.asList(
                WHITE + "" + BOLD + "ʙᴇ ᴛʜᴇ ʙɪɢɢᴇsᴛ ʙɪʀᴅ",
                WHITE + "(" + ChatColor.of("#FF1111") + "Ruined" + WHITE + ")",
                WHITE + " ",
                WHITE + "\uD83D\uDD3A " + ChatColor.of("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                GRAY + "No Passives",
                WHITE + " ",
                WHITE + "\uD83D\uDD3A " + ChatColor.of("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                GRAY + "- " + WHITE + "Double Jump",
                WHITE + " ",
                WHITE + "🔮 " + ChatColor.of("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                WHITE + "" + BOLD + "required"
        ));
        GemMEta.setCustomModelData(86);
        Gem.setItemMeta(GemMEta);
        return Gem;

    }

    public ItemStack PuffBT1() {
        ItemStack Gem = new ItemStack(Material.AMETHYST_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.setDisplayName(WHITE + "" + BOLD + "ᴘᴜғғ " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(Arrays.asList(
                WHITE + "" + BOLD + "ᴜsᴇʟᴇss"
        ));
        GemMEta.setCustomModelData(99);
        Gem.setItemMeta(GemMEta);
        return Gem;

    }


    public ItemStack LifeP5T1() {

        ItemStack Gem = new ItemStack(Material.AMETHYST_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.setDisplayName(ChatColor.of("#FE04B4") + "" + BOLD + "ʟɪғᴇ " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.addEnchant(Enchantment.DURABILITY, 1, true);
        GemMEta.setLore(
                Arrays.asList(
                        WHITE + "" + BOLD + "ᴄᴏɴᴛʀᴏʟ ᴛʜᴇ ʙᴀʟᴀɴᴄᴇ ᴏғ ʟɪғᴇ",
                        WHITE + "(" + ChatColor.of("#57FFC7") + "Pristine"
                                + WHITE + " + "
                                + ChatColor.of("#96FFD9") + "5" + ")",
                        WHITE + " ",
                        ChatColor.of("#FE04B4") + "\uD83D\uDD3A " + ChatColor.of("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                        GRAY + "- Green Thumb",
                        GRAY + "- Radiant Fist",
                        GRAY + "- Bonus Saturation",
                        GRAY + "- Bonus Absorption",
                        GRAY + "- Wither Immune",
                        WHITE + " ",
                        ChatColor.of("#FE04B4") + "\uD83D\uDD3A " + ChatColor.of("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                        GRAY + "- " + ChatColor.of("#FE04B4") + "Vitalaty Vortex",
                        WHITE + " ",
                        ChatColor.of("#FE04B4") + "🔮 " + ChatColor.of("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                        WHITE + "" + BOLD + "required"
                )
        );
        GemMEta.setCustomModelData(3);
        Gem.setItemMeta(GemMEta);
        return Gem;

    }

    public ItemStack LifeP4T1() {

        ItemStack Gem = new ItemStack(Material.AMETHYST_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.setDisplayName(ChatColor.of("#FE04B4") + "" + BOLD + "ʟɪғᴇ " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(
                Arrays.asList(
                        WHITE + "" + BOLD + "ᴄᴏɴᴛʀᴏʟ ᴛʜᴇ ʙᴀʟᴀɴᴄᴇ ᴏғ ʟɪғᴇ",
                        WHITE + "(" + ChatColor.of("#57FFC7") + "Pristine"
                                + WHITE + " + "
                                + ChatColor.of("#96FFD9") + "4" + ")",
                        WHITE + " ",
                        ChatColor.of("#FE04B4") + "\uD83D\uDD3A " + ChatColor.of("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                        GRAY + "- Green Thumb",
                        GRAY + "- Radiant Fist",
                        GRAY + "- Bonus Saturation",
                        GRAY + "- Bonus Absorption",
                        GRAY + "- Wither Immune",
                        WHITE + " ",
                        ChatColor.of("#FE04B4") + "\uD83D\uDD3A " + ChatColor.of("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                        GRAY + "- " + ChatColor.of("#FE04B4") + "Vitalaty Vortex",
                        WHITE + " ",
                        ChatColor.of("#FE04B4") + "🔮 " + ChatColor.of("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                        WHITE + "" + BOLD + "required"
                )
        );
        GemMEta.setCustomModelData(3);
        Gem.setItemMeta(GemMEta);
        return Gem;

    }

    public ItemStack LifeP2T1() {

        ItemStack Gem = new ItemStack(Material.AMETHYST_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.setDisplayName(ChatColor.of("#FE04B4") + "" + BOLD + "ʟɪғᴇ " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(
                Arrays.asList(
                        WHITE + "" + BOLD + "ᴄᴏɴᴛʀᴏʟ ᴛʜᴇ ʙᴀʟᴀɴᴄᴇ ᴏғ ʟɪғᴇ",
                        WHITE + "(" + ChatColor.of("#57FFC7") + "Pristine"
                                + WHITE + " + "
                                + ChatColor.of("#96FFD9") + "2" + ")",
                        WHITE + " ",
                        ChatColor.of("#FE04B4") + "\uD83D\uDD3A " + ChatColor.of("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                        GRAY + "- Green Thumb",
                        GRAY + "- Radiant Fist",
                        GRAY + "- Bonus Saturation",
                        GRAY + "- Bonus Absorption",
                        GRAY + "- Wither Immune",
                        WHITE + " ",
                        ChatColor.of("#FE04B4") + "\uD83D\uDD3A " + ChatColor.of("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                        GRAY + "- " + ChatColor.of("#FE04B4") + "Vitalaty Vortex",
                        WHITE + " ",
                        ChatColor.of("#FE04B4") + "🔮 " + ChatColor.of("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                        WHITE + "" + BOLD + "required"
                )
        );
        GemMEta.setCustomModelData(3);
        Gem.setItemMeta(GemMEta);
        return Gem;

    }

    public ItemStack LifeP1T1() {

        ItemStack Gem = new ItemStack(Material.AMETHYST_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.setDisplayName(ChatColor.of("#FE04B4") + "" + BOLD + "ʟɪғᴇ " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(
                Arrays.asList(
                        WHITE + "" + BOLD + "ᴄᴏɴᴛʀᴏʟ ᴛʜᴇ ʙᴀʟᴀɴᴄᴇ ᴏғ ʟɪғᴇ",
                        WHITE + "(" + ChatColor.of("#57FFC7") + "Pristine"
                                + WHITE + " + "
                                + ChatColor.of("#96FFD9") + "1" + ")",
                        WHITE + " ",
                        ChatColor.of("#FE04B4") + "\uD83D\uDD3A " + ChatColor.of("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                        GRAY + "- Green Thumb",
                        GRAY + "- Radiant Fist",
                        GRAY + "- Bonus Saturation",
                        GRAY + "- Bonus Absorption",
                        GRAY + "- Wither Immune",
                        WHITE + " ",
                        ChatColor.of("#FE04B4") + "\uD83D\uDD3A " + ChatColor.of("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                        GRAY + "- " + ChatColor.of("#FE04B4") + "Vitalaty Vortex",
                        WHITE + " ",
                        ChatColor.of("#FE04B4") + "🔮 " + ChatColor.of("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                        WHITE + "" + BOLD + "required"
                )
        );
        GemMEta.setCustomModelData(3);
        Gem.setItemMeta(GemMEta);
        return Gem;

    }

    public ItemStack LifePT1() {

        ItemStack Gem = new ItemStack(Material.AMETHYST_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.setDisplayName(ChatColor.of("#FE04B4") + "" + BOLD + "ʟɪғᴇ " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(
                Arrays.asList(
                        WHITE + "" + BOLD + "ᴄᴏɴᴛʀᴏʟ ᴛʜᴇ ʙᴀʟᴀɴᴄᴇ ᴏғ ʟɪғᴇ",
                        WHITE + "(" + ChatColor.of("#57FFC7") + "Pristine" + WHITE + ")",
                        WHITE + " ",
                        ChatColor.of("#FE04B4") + "\uD83D\uDD3A " + ChatColor.of("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                        GRAY + "- Green Thumb",
                        GRAY + "- Radiant Fist",
                        GRAY + "- Bonus Saturation",
                        GRAY + "- Bonus Absorption",
                        GRAY + "- Wither Immune",
                        WHITE + " ",
                        ChatColor.of("#FE04B4") + "\uD83D\uDD3A " + ChatColor.of("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                        GRAY + "- " + ChatColor.of("#FE04B4") + "Vitalaty Vortex",
                        WHITE + " ",
                        ChatColor.of("#FE04B4") + "🔮 " + ChatColor.of("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                        WHITE + "" + BOLD + "required"
                )
        );
        GemMEta.setCustomModelData(3);
        Gem.setItemMeta(GemMEta);
        return Gem;

    }

    public ItemStack LifeST1() {

        ItemStack Gem = new ItemStack(Material.AMETHYST_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.setDisplayName(ChatColor.of("#FE04B4") + "" + BOLD + "ʟɪғᴇ " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(
                Arrays.asList(
                        WHITE + "" + BOLD + "ᴄᴏɴᴛʀᴏʟ ᴛʜᴇ ʙᴀʟᴀɴᴄᴇ ᴏғ ʟɪғᴇ",
                        WHITE + "(" + ChatColor.of("#57FF8F") + "Scratched" + WHITE + ")",
                        WHITE + " ",
                        ChatColor.of("#FE04B4") + "\uD83D\uDD3A " + ChatColor.of("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                        GRAY + "- Green Thumb",
                        GRAY + "- Bonus Saturation",
                        GRAY + "- Bonus Absorption",
                        GRAY + "- Wither Immune",
                        WHITE + " ",
                        ChatColor.of("#FE04B4") + "\uD83D\uDD3A " + ChatColor.of("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                        GRAY + "- " + ChatColor.of("#FE04B4") + "Vitalaty Vortex",
                        WHITE + " ",
                        ChatColor.of("#FE04B4") + "🔮 " + ChatColor.of("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                        WHITE + "" + BOLD + "required"
                )
        );
        GemMEta.setCustomModelData(23);
        Gem.setItemMeta(GemMEta);
        return Gem;

    }

    public ItemStack LifeCT1() {

        ItemStack Gem = new ItemStack(Material.AMETHYST_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.setDisplayName(ChatColor.of("#FE04B4") + "" + BOLD + "ʟɪғᴇ " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(
                Arrays.asList(
                        WHITE + "" + BOLD + "ᴄᴏɴᴛʀᴏʟ ᴛʜᴇ ʙᴀʟᴀɴᴄᴇ ᴏғ ʟɪғᴇ",
                        WHITE + "(" + ChatColor.of("#7958DB") + "Cracked" + WHITE + ")",
                        WHITE + " ",
                        ChatColor.of("#FE04B4") + "\uD83D\uDD3A " + ChatColor.of("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                        GRAY + "- Green Thumb",
                        GRAY + "- Bonus Saturation",
                        GRAY + "- Bonus Absorption",
                        WHITE + " ",
                        ChatColor.of("#FE04B4") + "\uD83D\uDD3A " + ChatColor.of("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                        GRAY + "- " + ChatColor.of("#FE04B4") + "Vitalaty Vortex",
                        WHITE + " ",
                        ChatColor.of("#FE04B4") + "🔮 " + ChatColor.of("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                        WHITE + "" + BOLD + "required"
                )
        );
        GemMEta.setCustomModelData(43);
        Gem.setItemMeta(GemMEta);
        return Gem;

    }

    public ItemStack LifeDT1() {

        ItemStack Gem = new ItemStack(Material.AMETHYST_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.setDisplayName(ChatColor.of("#FE04B4") + "" + BOLD + "ʟɪғᴇ " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(
                Arrays.asList(
                        WHITE + "" + BOLD + "ᴄᴏɴᴛʀᴏʟ ᴛʜᴇ ʙᴀʟᴀɴᴄᴇ ᴏғ ʟɪғᴇ",
                        WHITE + "(" + ChatColor.of("#FFC929") + "Damaged" + WHITE + ")",
                        WHITE + " ",
                        ChatColor.of("#FE04B4") + "\uD83D\uDD3A " + ChatColor.of("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                        GRAY + "- Green Thumb",
                        WHITE + " ",
                        ChatColor.of("#FE04B4") + "\uD83D\uDD3A " + ChatColor.of("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                        GRAY + "- " + ChatColor.of("#FE04B4") + "Vitalaty Vortex",
                        WHITE + " ",
                        ChatColor.of("#FE04B4") + "🔮 " + ChatColor.of("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                        WHITE + "" + BOLD + "required"
                )
        );
        GemMEta.setCustomModelData(63);
        Gem.setItemMeta(GemMEta);
        return Gem;

    }

    public ItemStack LifeRT1() {

        ItemStack Gem = new ItemStack(Material.AMETHYST_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.setDisplayName(ChatColor.of("#FE04B4") + "" + BOLD + "ʟɪғᴇ " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(
                Arrays.asList(
                        WHITE + "" + BOLD + "ᴄᴏɴᴛʀᴏʟ ᴛʜᴇ ʙᴀʟᴀɴᴄᴇ ᴏғ ʟɪғᴇ",
                        WHITE + "(" + ChatColor.of("#FF1111") + "Ruined" + WHITE + ")",
                        WHITE + " ",
                        ChatColor.of("#FE04B4") + "\uD83D\uDD3A " + ChatColor.of("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                        GRAY + "No Passives",
                        WHITE + " ",
                        ChatColor.of("#FE04B4") + "\uD83D\uDD3A " + ChatColor.of("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                        GRAY + "- " + ChatColor.of("#FE04B4") + "Vitalaty Vortex",
                        WHITE + " ",
                        ChatColor.of("#FE04B4") + "🔮 " + ChatColor.of("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                        WHITE + "" + BOLD + "required"
                )
        );
        GemMEta.setCustomModelData(83);
        Gem.setItemMeta(GemMEta);
        return Gem;

    }

    public ItemStack LifeBT1() {

        ItemStack Gem = new ItemStack(Material.AMETHYST_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.setDisplayName(ChatColor.of("#FE04B4") + "" + BOLD + "ʟɪғᴇ " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(
                Arrays.asList(
                        WHITE + "" + BOLD + "ᴜsᴇʟᴇss"
                )
        );
        GemMEta.setCustomModelData(99);
        Gem.setItemMeta(GemMEta);
        return Gem;

    }

    public ItemStack SpeedP5T1() {

        ItemStack Gem = new ItemStack(Material.AMETHYST_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.addEnchant(Enchantment.DURABILITY, 1, true);
        GemMEta.setDisplayName(ChatColor.of("#FEFD17") + "" + BOLD + "sᴘᴇᴇᴅ " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(Arrays.asList(
                WHITE + "" + BOLD + "ᴡᴀᴛᴄʜ ᴛʜᴇ ᴡᴏʀʟᴅ ᴀʀᴏᴜɴᴅ ʏᴏᴜ ᴛᴜʀɴ ɪɴᴛᴏ ᴀ ʙʟᴜʀ ",
                WHITE + "(" + ChatColor.of("#57FFC7") + "Pristine"
                        + WHITE + " + "
                        + ChatColor.of("#96FFD9") + "5" + ")",
                WHITE + "",
                GRAY + "  " + ChatColor.of("#FEFD17") + "\uD83D\uDD3A " + ChatColor.of("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                GRAY + "- Speed",
                GRAY + "- Dolphins grace",
                GRAY + "- Enchants Efficiency",
                GRAY + "- Enchants Soul Speed",
                WHITE + "",
                ChatColor.of("#FEFD17") + "\uD83D\uDD3A " + ChatColor.of("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                GRAY + "- " + ChatColor.of("#FEFD17") + " Terminal Velocity",
                WHITE + "",
                ChatColor.of("#FEFD17") + "🔮 " + ChatColor.of("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                WHITE + "" + BOLD + "Unknown"
        ));
        GemMEta.setCustomModelData(7);
        Gem.setItemMeta(GemMEta);
        return Gem;

    }

    public ItemStack SpeedP4T1() {

        ItemStack Gem = new ItemStack(Material.AMETHYST_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.setDisplayName(ChatColor.of("#FEFD17") + "" + BOLD + "sᴘᴇᴇᴅ " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(Arrays.asList(
                WHITE + "" + BOLD + "ᴡᴀᴛᴄʜ ᴛʜᴇ ᴡᴏʀʟᴅ ᴀʀᴏᴜɴᴅ ʏᴏᴜ ᴛᴜʀɴ ɪɴᴛᴏ ᴀ ʙʟᴜʀ ",
                WHITE + "(" + ChatColor.of("#57FFC7") + "Pristine"
                        + WHITE + " + "
                        + ChatColor.of("#96FFD9") + "4" + ")",
                WHITE + "",
                GRAY + "  " + ChatColor.of("#FEFD17") + "\uD83D\uDD3A " + ChatColor.of("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                GRAY + "- Speed",
                GRAY + "- Dolphins grace",
                GRAY + "- Enchants Efficiency",
                GRAY + "- Enchants Soul Speed",
                WHITE + "",
                ChatColor.of("#FEFD17") + "\uD83D\uDD3A " + ChatColor.of("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                GRAY + "- " + ChatColor.of("#FEFD17") + " Terminal Velocity",
                WHITE + "",
                ChatColor.of("#FEFD17") + "🔮 " + ChatColor.of("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                WHITE + "" + BOLD + "Unknown"
        ));
        GemMEta.setCustomModelData(7);
        Gem.setItemMeta(GemMEta);
        return Gem;

    }

    public ItemStack SpeedP3T1() {

        ItemStack Gem = new ItemStack(Material.AMETHYST_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.setDisplayName(ChatColor.of("#FEFD17") + "" + BOLD + "sᴘᴇᴇᴅ " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(Arrays.asList(
                WHITE + "" + BOLD + "ᴡᴀᴛᴄʜ ᴛʜᴇ ᴡᴏʀʟᴅ ᴀʀᴏᴜɴᴅ ʏᴏᴜ ᴛᴜʀɴ ɪɴᴛᴏ ᴀ ʙʟᴜʀ ",
                WHITE + "(" + ChatColor.of("#57FFC7") + "Pristine"
                        + WHITE + " + "
                        + ChatColor.of("#96FFD9") + "3" + ")",
                WHITE + "",
                GRAY + "  " + ChatColor.of("#FEFD17") + "\uD83D\uDD3A " + ChatColor.of("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                GRAY + "- Speed",
                GRAY + "- Dolphins grace",
                GRAY + "- Enchants Efficiency",
                GRAY + "- Enchants Soul Speed",
                WHITE + "",
                ChatColor.of("#FEFD17") + "\uD83D\uDD3A " + ChatColor.of("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                GRAY + "- " + ChatColor.of("#FEFD17") + " Terminal Velocity",
                WHITE + "",
                ChatColor.of("#FEFD17") + "🔮 " + ChatColor.of("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                WHITE + "" + BOLD + "Unknown"
        ));
        GemMEta.setCustomModelData(7);
        Gem.setItemMeta(GemMEta);
        return Gem;

    }

    public ItemStack SpeedP2T1() {

        ItemStack Gem = new ItemStack(Material.AMETHYST_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.setDisplayName(ChatColor.of("#FEFD17") + "" + BOLD + "sᴘᴇᴇᴅ " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(Arrays.asList(
                WHITE + "" + BOLD + "ᴡᴀᴛᴄʜ ᴛʜᴇ ᴡᴏʀʟᴅ ᴀʀᴏᴜɴᴅ ʏᴏᴜ ᴛᴜʀɴ ɪɴᴛᴏ ᴀ ʙʟᴜʀ ",
                WHITE + "(" + ChatColor.of("#57FFC7") + "Pristine"
                        + WHITE + " + "
                        + ChatColor.of("#96FFD9") + "2" + ")",
                WHITE + "",
                GRAY + "  " + ChatColor.of("#FEFD17") + "\uD83D\uDD3A " + ChatColor.of("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                GRAY + "- Speed",
                GRAY + "- Dolphins grace",
                GRAY + "- Enchants Efficiency",
                GRAY + "- Enchants Soul Speed",
                WHITE + "",
                ChatColor.of("#FEFD17") + "\uD83D\uDD3A " + ChatColor.of("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                GRAY + "- " + ChatColor.of("#FEFD17") + " Terminal Velocity",
                WHITE + "",
                ChatColor.of("#FEFD17") + "🔮 " + ChatColor.of("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                WHITE + "" + BOLD + "Unknown"
        ));
        GemMEta.setCustomModelData(7);
        Gem.setItemMeta(GemMEta);
        return Gem;

    }

    public ItemStack SpeedP1T1() {

        ItemStack Gem = new ItemStack(Material.AMETHYST_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.setDisplayName(ChatColor.of("#FEFD17") + "" + BOLD + "sᴘᴇᴇᴅ " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(Arrays.asList(
                WHITE + "" + BOLD + "ᴡᴀᴛᴄʜ ᴛʜᴇ ᴡᴏʀʟᴅ ᴀʀᴏᴜɴᴅ ʏᴏᴜ ᴛᴜʀɴ ɪɴᴛᴏ ᴀ ʙʟᴜʀ ",
                WHITE + "(" + ChatColor.of("#57FFC7") + "Pristine"
                        + WHITE + " + "
                        + ChatColor.of("#96FFD9") + "1" + ")",
                WHITE + "",
                GRAY + "  " + ChatColor.of("#FEFD17") + "\uD83D\uDD3A " + ChatColor.of("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                GRAY + "- Speed",
                GRAY + "- Dolphins grace",
                GRAY + "- Enchants Efficiency",
                GRAY + "- Enchants Soul Speed",
                WHITE + "",
                ChatColor.of("#FEFD17") + "\uD83D\uDD3A " + ChatColor.of("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                GRAY + "- " + ChatColor.of("#FEFD17") + " Terminal Velocity",
                WHITE + "",
                ChatColor.of("#FEFD17") + "🔮 " + ChatColor.of("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                WHITE + "" + BOLD + "Unknown"
        ));
        GemMEta.setCustomModelData(7);
        Gem.setItemMeta(GemMEta);
        return Gem;

    }

    public ItemStack SpeedST1() {

        ItemStack Gem = new ItemStack(Material.AMETHYST_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.setDisplayName(ChatColor.of("#FEFD17") + "" + BOLD + "sᴘᴇᴇᴅ " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(Arrays.asList(
                WHITE + "" + BOLD + "ᴡᴀᴛᴄʜ ᴛʜᴇ ᴡᴏʀʟᴅ ᴀʀᴏᴜɴᴅ ʏᴏᴜ ᴛᴜʀɴ ɪɴᴛᴏ ᴀ ʙʟᴜʀ ",
                WHITE + "(" + ChatColor.of("#57FF8F") + "Scratched" + WHITE + ")",
                WHITE + "",
                GRAY + "  " + ChatColor.of("#FEFD17") + "\uD83D\uDD3A " + ChatColor.of("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                GRAY + "- Speed",
                GRAY + "- Dolphins grace",
                GRAY + "- Enchants Efficiency",
                GRAY + "- Enchants Soul Speed",
                WHITE + "",
                ChatColor.of("#FEFD17") + "\uD83D\uDD3A " + ChatColor.of("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                GRAY + "- " + ChatColor.of("#FEFD17") + " Terminal Velocity",
                WHITE + "",
                ChatColor.of("#FEFD17") + "🔮 " + ChatColor.of("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                WHITE + "" + BOLD + "Unknown"
        ));
        GemMEta.setCustomModelData(27);
        Gem.setItemMeta(GemMEta);
        return Gem;

    }

    public ItemStack SpeedCT1() {

        ItemStack Gem = new ItemStack(Material.AMETHYST_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.setDisplayName(ChatColor.of("#FEFD17") + "" + BOLD + "sᴘᴇᴇᴅ " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(Arrays.asList(
                WHITE + "" + BOLD + "ᴡᴀᴛᴄʜ ᴛʜᴇ ᴡᴏʀʟᴅ ᴀʀᴏᴜɴᴅ ʏᴏᴜ ᴛᴜʀɴ ɪɴᴛᴏ ᴀ ʙʟᴜʀ ",
                WHITE + "(" + ChatColor.of("#7958DB") + "Cracked" + WHITE + ")",
                WHITE + "",
                GRAY + "  " + ChatColor.of("#FEFD17") + "\uD83D\uDD3A " + ChatColor.of("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                GRAY + "- Speed",
                GRAY + "- Enchants Efficiency",
                GRAY + "- Enchants Soul Speed",
                WHITE + "",
                ChatColor.of("#FEFD17") + "\uD83D\uDD3A " + ChatColor.of("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                GRAY + "- " + ChatColor.of("#FEFD17") + " Terminal Velocity",
                WHITE + "",
                ChatColor.of("#FEFD17") + "🔮 " + ChatColor.of("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                WHITE + "" + BOLD + "Unknown"
        ));
        GemMEta.setCustomModelData(47);
        Gem.setItemMeta(GemMEta);
        return Gem;

    }

    public ItemStack SpeedDT1() {

        ItemStack Gem = new ItemStack(Material.AMETHYST_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.setDisplayName(ChatColor.of("#FEFD17") + "" + BOLD + "sᴘᴇᴇᴅ " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(Arrays.asList(
                WHITE + "" + BOLD + "ᴡᴀᴛᴄʜ ᴛʜᴇ ᴡᴏʀʟᴅ ᴀʀᴏᴜɴᴅ ʏᴏᴜ ᴛᴜʀɴ ɪɴᴛᴏ ᴀ ʙʟᴜʀ ",
                WHITE + "(" + ChatColor.of("#FFC929") + "Damaged" + WHITE + ")",
                WHITE + "",
                GRAY + "  " + ChatColor.of("#FEFD17") + "\uD83D\uDD3A " + ChatColor.of("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                GRAY + "- Speed",
                GRAY + "- Enchants Efficiency",
                WHITE + "",
                ChatColor.of("#FEFD17") + "\uD83D\uDD3A " + ChatColor.of("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                GRAY + "- " + ChatColor.of("#FEFD17") + " Terminal Velocity",
                WHITE + "",
                ChatColor.of("#FEFD17") + "🔮 " + ChatColor.of("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                WHITE + "" + BOLD + "Unknown"
        ));
        GemMEta.setCustomModelData(67);
        Gem.setItemMeta(GemMEta);
        return Gem;

    }

    public ItemStack SpeedRT1() {

        ItemStack Gem = new ItemStack(Material.AMETHYST_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.setDisplayName(ChatColor.of("#FEFD17") + "" + BOLD + "sᴘᴇᴇᴅ " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(Arrays.asList(
                WHITE + "" + BOLD + "ᴡᴀᴛᴄʜ ᴛʜᴇ ᴡᴏʀʟᴅ ᴀʀᴏᴜɴᴅ ʏᴏᴜ ᴛᴜʀɴ ɪɴᴛᴏ ᴀ ʙʟᴜʀ ",
                WHITE + "(" + ChatColor.of("#FF1111") + "Ruined" + WHITE + ")",
                WHITE + "",
                GRAY + "  " + ChatColor.of("#FEFD17") + "\uD83D\uDD3A " + ChatColor.of("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                GRAY + "No Passives",
                WHITE + "",
                ChatColor.of("#FEFD17") + "\uD83D\uDD3A " + ChatColor.of("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                GRAY + "- " + ChatColor.of("#FEFD17") + " Terminal Velocity",
                WHITE + "",
                ChatColor.of("#FEFD17") + "🔮 " + ChatColor.of("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                WHITE + "" + BOLD + "Unknown"
        ));
        GemMEta.setCustomModelData(87);
        Gem.setItemMeta(GemMEta);
        return Gem;

    }

    public ItemStack SpeedBT1() {

        ItemStack Gem = new ItemStack(Material.AMETHYST_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.setDisplayName(ChatColor.of("#FEFD17") + "" + BOLD + "sᴘᴇᴇᴅ " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(Arrays.asList(
                WHITE + "" + BOLD + "ᴜsᴇʟᴇss"
        ));
        GemMEta.setCustomModelData(99);
        Gem.setItemMeta(GemMEta);
        return Gem;

    }

    public ItemStack FireP5T1() {

        ItemStack Gem = new ItemStack(Material.AMETHYST_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.addEnchant(Enchantment.DURABILITY, 1, true);
        GemMEta.setDisplayName(ChatColor.of("#FE8120") + "" + BOLD + "ғɪʀᴇ " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(Arrays.asList(
                WHITE + "" + BOLD + "ᴍᴀɴɪᴘᴜʟᴀᴛᴇ ғɪʀᴇ",
                WHITE + "(" + ChatColor.of("#57FFC7") + "Pristine"
                        + WHITE + " + "
                        + ChatColor.of("#96FFD9") + "5" + ")",
                WHITE + "",
                ChatColor.of("#FE8120") + "🔺 " + ChatColor.of("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                GRAY + "- Fire Resistance",
                GRAY + "- Autosmelt",
                GRAY + "- Flamestrike",
                GRAY + "- Fireshot",
                WHITE + " ",
                ChatColor.of("#FE8120") + "🔺 " + ChatColor.of("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                GRAY + "- " + ChatColor.of("#FE8120") + "Crisp",
                WHITE + "",
                ChatColor.of("#FE8120") + "🔮 " + ChatColor.of("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                WHITE + "" + BOLD + "Unknown"
        ));
        GemMEta.setCustomModelData(1);
        Gem.setItemMeta(GemMEta);
        return Gem;

    }

    public ItemStack FireP4T1() {

        ItemStack Gem = new ItemStack(Material.AMETHYST_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.setDisplayName(ChatColor.of("#FE8120") + "" + BOLD + "ғɪʀᴇ " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(Arrays.asList(
                WHITE + "" + BOLD + "ᴍᴀɴɪᴘᴜʟᴀᴛᴇ ғɪʀᴇ",
                WHITE + "(" + ChatColor.of("#57FFC7") + "Pristine"
                        + WHITE + " + "
                        + ChatColor.of("#96FFD9") + "4" + ")",
                WHITE + "",
                ChatColor.of("#FE8120") + "🔺 " + ChatColor.of("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                GRAY + "- Fire Resistance",
                GRAY + "- Autosmelt",
                GRAY + "- Flamestrike",
                GRAY + "- Fireshot",
                WHITE + " ",
                ChatColor.of("#FE8120") + "🔺 " + ChatColor.of("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                GRAY + "- " + ChatColor.of("#FE8120") + "Crisp",
                WHITE + "",
                ChatColor.of("#FE8120") + "🔮 " + ChatColor.of("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                WHITE + "" + BOLD + "Unknown"
        ));
        GemMEta.setCustomModelData(1);
        Gem.setItemMeta(GemMEta);
        return Gem;

    }

    public ItemStack FireP3T1() {

        ItemStack Gem = new ItemStack(Material.AMETHYST_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.setDisplayName(ChatColor.of("#FE8120") + "" + BOLD + "ғɪʀᴇ " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(Arrays.asList(
                WHITE + "" + BOLD + "ᴍᴀɴɪᴘᴜʟᴀᴛᴇ ғɪʀᴇ",
                WHITE + "(" + ChatColor.of("#57FFC7") + "Pristine"
                        + WHITE + " + "
                        + ChatColor.of("#96FFD9") + "3" + ")",
                WHITE + "",
                ChatColor.of("#FE8120") + "🔺 " + ChatColor.of("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                GRAY + "- Fire Resistance",
                GRAY + "- Autosmelt",
                GRAY + "- Flamestrike",
                GRAY + "- Fireshot",
                WHITE + " ",
                ChatColor.of("#FE8120") + "🔺 " + ChatColor.of("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                GRAY + "- " + ChatColor.of("#FE8120") + "Crisp",
                WHITE + "",
                ChatColor.of("#FE8120") + "🔮 " + ChatColor.of("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                WHITE + "" + BOLD + "Unknown"
        ));
        GemMEta.setCustomModelData(1);
        Gem.setItemMeta(GemMEta);
        return Gem;

    }

    public ItemStack FireP2T1() {

        ItemStack Gem = new ItemStack(Material.AMETHYST_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.setDisplayName(ChatColor.of("#FE8120") + "" + BOLD + "ғɪʀᴇ " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(Arrays.asList(
                WHITE + "" + BOLD + "ᴍᴀɴɪᴘᴜʟᴀᴛᴇ ғɪʀᴇ",
                WHITE + "(" + ChatColor.of("#57FFC7") + "Pristine"
                        + WHITE + " + "
                        + ChatColor.of("#96FFD9") + "2" + ")",
                WHITE + "",
                ChatColor.of("#FE8120") + "🔺 " + ChatColor.of("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                GRAY + "- Fire Resistance",
                GRAY + "- Autosmelt",
                GRAY + "- Flamestrike",
                GRAY + "- Fireshot",
                WHITE + " ",
                ChatColor.of("#FE8120") + "🔺 " + ChatColor.of("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                GRAY + "- " + ChatColor.of("#FE8120") + "Crisp",
                WHITE + "",
                ChatColor.of("#FE8120") + "🔮 " + ChatColor.of("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                WHITE + "" + BOLD + "Unknown"
        ));
        GemMEta.setCustomModelData(1);
        Gem.setItemMeta(GemMEta);
        return Gem;

    }

    public ItemStack FireP1T1() {

        ItemStack Gem = new ItemStack(Material.AMETHYST_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.setDisplayName(ChatColor.of("#FE8120") + "" + BOLD + "ғɪʀᴇ " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(Arrays.asList(
                WHITE + "" + BOLD + "ᴍᴀɴɪᴘᴜʟᴀᴛᴇ ғɪʀᴇ",
                WHITE + "(" + ChatColor.of("#57FFC7") + "Pristine"
                        + WHITE + " + "
                        + ChatColor.of("#96FFD9") + "1" + ")",
                WHITE + "",
                ChatColor.of("#FE8120") + "🔺 " + ChatColor.of("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                GRAY + "- Fire Resistance",
                GRAY + "- Autosmelt",
                GRAY + "- Flamestrike",
                GRAY + "- Fireshot",
                WHITE + " ",
                ChatColor.of("#FE8120") + "🔺 " + ChatColor.of("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                GRAY + "- " + ChatColor.of("#FE8120") + "Crisp",
                WHITE + "",
                ChatColor.of("#FE8120") + "🔮 " + ChatColor.of("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                WHITE + "" + BOLD + "Unknown"
        ));
        GemMEta.setCustomModelData(1);
        Gem.setItemMeta(GemMEta);
        return Gem;

    }

    public ItemStack FirePT1() {

        ItemStack Gem = new ItemStack(Material.AMETHYST_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.setDisplayName(ChatColor.of("#FE8120") + "" + BOLD + "ғɪʀᴇ " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(Arrays.asList(
                WHITE + "" + BOLD + "ᴍᴀɴɪᴘᴜʟᴀᴛᴇ ғɪʀᴇ",
                WHITE + "(" + ChatColor.of("#57FFC7") + "Pristine" + WHITE + ")",
                WHITE + "",
                ChatColor.of("#FE8120") + "🔺 " + ChatColor.of("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                GRAY + "- Fire Resistance",
                GRAY + "- Autosmelt",
                GRAY + "- Flamestrike",
                GRAY + "- Fireshot",
                WHITE + " ",
                ChatColor.of("#FE8120") + "🔺 " + ChatColor.of("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                GRAY + "- " + ChatColor.of("#FE8120") + "Crisp",
                WHITE + "",
                ChatColor.of("#FE8120") + "🔮 " + ChatColor.of("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                WHITE + "" + BOLD + "Unknown"
        ));
        GemMEta.setCustomModelData(1);
        Gem.setItemMeta(GemMEta);
        return Gem;

    }

    public ItemStack FireST1() {

        ItemStack Gem = new ItemStack(Material.AMETHYST_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.setDisplayName(ChatColor.of("#FE8120") + "" + BOLD + "ғɪʀᴇ " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(Arrays.asList(
                WHITE + "" + BOLD + "ᴍᴀɴɪᴘᴜʟᴀᴛᴇ ғɪʀᴇ",
                WHITE + "(" + ChatColor.of("#57FF8F") + "Scratched" + WHITE + ")",
                WHITE + "",
                ChatColor.of("#FE8120") + "🔺 " + ChatColor.of("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                GRAY + "- Fire Resistance",
                GRAY + "- Flamestrike",
                GRAY + "- Fireshot",
                WHITE + " ",
                ChatColor.of("#FE8120") + "🔺 " + ChatColor.of("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                GRAY + "- " + ChatColor.of("#FE8120") + "Crisp",
                WHITE + "",
                ChatColor.of("#FE8120") + "🔮 " + ChatColor.of("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                WHITE + "" + BOLD + "Unknown"
        ));
        GemMEta.setCustomModelData(21);
        Gem.setItemMeta(GemMEta);
        return Gem;

    }

    public ItemStack FireCT1() {

        ItemStack Gem = new ItemStack(Material.AMETHYST_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.setDisplayName(ChatColor.of("#FE8120") + "" + BOLD + "ғɪʀᴇ " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(Arrays.asList(
                WHITE + "" + BOLD + "ᴍᴀɴɪᴘᴜʟᴀᴛᴇ ғɪʀᴇ",
                WHITE + "(" + blissgems.colorize("#7958DB") + "Cracked" + WHITE + ")",
                WHITE + "",
                ChatColor.of("#FE8120") + "🔺 " + ChatColor.of("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                GRAY + "- Fire Resistance",
                GRAY + "- Flamestrike",
                WHITE + " ",
                ChatColor.of("#FE8120") + "🔺 " + ChatColor.of("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                GRAY + "- " + ChatColor.of("#FE8120") + "Crisp",
                WHITE + "",
                ChatColor.of("#FE8120") + "🔮 " + ChatColor.of("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                WHITE + "" + BOLD + "Unknown"
        ));
        GemMEta.setCustomModelData(41);
        Gem.setItemMeta(GemMEta);
        return Gem;

    }

    public ItemStack FireDT1() {

        ItemStack Gem = new ItemStack(Material.AMETHYST_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.setDisplayName(ChatColor.of("#FE8120") + "" + BOLD + "ғɪʀᴇ " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(Arrays.asList(
                WHITE + "" + BOLD + "ᴍᴀɴɪᴘᴜʟᴀᴛᴇ ғɪʀᴇ",
                WHITE + "(" + blissgems.colorize("#FFC929") + "Damaged" + WHITE + ")",
                WHITE + "",
                ChatColor.of("#FE8120") + "🔺 " + ChatColor.of("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                GRAY + "- Fire Resistance",
                WHITE + " ",
                ChatColor.of("#FE8120") + "🔺 " + ChatColor.of("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                GRAY + "- " + ChatColor.of("#FE8120") + "Crisp",
                WHITE + "",
                ChatColor.of("#FE8120") + "🔮 " + ChatColor.of("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                WHITE + "" + BOLD + "Unknown"
        ));
        GemMEta.setCustomModelData(61);
        Gem.setItemMeta(GemMEta);
        return Gem;

    }

    public ItemStack FireRT1() {

        ItemStack Gem = new ItemStack(Material.AMETHYST_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.setDisplayName(ChatColor.of("#FE8120") + "" + BOLD + "ғɪʀᴇ " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(Arrays.asList(
                WHITE + "" + BOLD + "ᴍᴀɴɪᴘᴜʟᴀᴛᴇ ғɪʀᴇ",
                WHITE + "(" + blissgems.colorize("#FF1111") + "Ruined" + WHITE + ")",
                WHITE + "",
                ChatColor.of("#FE8120") + "🔺 " + ChatColor.of("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                GRAY + "No Passives",
                WHITE + " ",
                ChatColor.of("#FE8120") + "🔺 " + ChatColor.of("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                GRAY + "- " + ChatColor.of("#FE8120") + "Crisp",
                WHITE + "",
                ChatColor.of("#FE8120") + "🔮 " + ChatColor.of("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                WHITE + "" + BOLD + "Unknown"
        ));
        GemMEta.setCustomModelData(81);
        Gem.setItemMeta(GemMEta);
        return Gem;

    }

    public ItemStack FireBT1() {

        ItemStack Gem = new ItemStack(Material.AMETHYST_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.setDisplayName(ChatColor.of("#FE8120") + "" + BOLD + "ғɪʀᴇ " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(Arrays.asList(
                WHITE + "" + BOLD + "ᴜsᴇʟᴇss"
        ));
        GemMEta.setCustomModelData(99);
        Gem.setItemMeta(GemMEta);
        return Gem;

    }

    public ItemStack FluxP5T1() {

        ItemStack Gem = new ItemStack(Material.AMETHYST_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.addEnchant(Enchantment.DURABILITY, 1, true);
        GemMEta.setDisplayName(ChatColor.of("#5ED7FF") +  "" + BOLD + "ғʟᴜx " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(Arrays.asList(
                WHITE + "" + BOLD + "ᴇᴠᴇʀʏᴛʜɪɴɢ ɪs ᴀ ғʟᴜᴄᴛᴜᴀᴛɪᴏɴ",
                WHITE + "(" + ChatColor.of("#57FFC7") + "Pristine"
                        + WHITE + " + "
                        + ChatColor.of("#96FFD9") + "5" + GRAY + ")",
                ChatColor.of("#03EAFF") + "🔺 " + ChatColor.of("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                GRAY + "- Flow State",
                GRAY + "- Shocking Chance",
                GRAY + "- Tireless",
                GRAY + "- Conduction",
                WHITE + " ",
                ChatColor.of("#03EAFF") + "🔺 " + ChatColor.of("#82F3FF") + BOLD + " ᴀʙɪʟɪᴛʏ",
                GRAY + "- " + ChatColor.of("#03EAFF") + "Kinetic Burst",
                WHITE + "",
                ChatColor.of("#03EAFF") + "🔮 " + ChatColor.of("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                WHITE + "" + BOLD + "Unknown"

        ));
        GemMEta.setCustomModelData(15);
        Gem.setItemMeta(GemMEta);
        return Gem;

    }

    public ItemStack FluxP4T1() {

        ItemStack Gem = new ItemStack(Material.AMETHYST_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.setDisplayName(ChatColor.of("#5ED7FF") +  "" + BOLD + "ғʟᴜx " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(Arrays.asList(
                WHITE + "" + BOLD + "ᴇᴠᴇʀʏᴛʜɪɴɢ ɪs ᴀ ғʟᴜᴄᴛᴜᴀᴛɪᴏɴ",
                WHITE + "(" + ChatColor.of("#57FFC7") + "Pristine"
                        + WHITE + " + "
                        + ChatColor.of("#96FFD9") + "4" + GRAY + ")",
                ChatColor.of("#03EAFF") + "🔺 " + ChatColor.of("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                GRAY + "- Flow State",
                GRAY + "- Shocking Chance",
                GRAY + "- Tireless",
                GRAY + "- Conduction",
                WHITE + " ",
                ChatColor.of("#03EAFF") + "🔺 " + ChatColor.of("#82F3FF") + BOLD + " ᴀʙɪʟɪᴛʏ",
                GRAY + "- " + ChatColor.of("#03EAFF") + "Kinetic Burst",
                WHITE + "",
                ChatColor.of("#03EAFF") + "🔮 " + ChatColor.of("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                WHITE + "" + BOLD + "Unknown"

        ));
        GemMEta.setCustomModelData(15);
        Gem.setItemMeta(GemMEta);
        return Gem;

    }

    public ItemStack FluxP3T1() {

        ItemStack Gem = new ItemStack(Material.AMETHYST_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.setDisplayName(ChatColor.of("#5ED7FF") +  "" + BOLD + "ғʟᴜx " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(Arrays.asList(
                WHITE + "" + BOLD + "ᴇᴠᴇʀʏᴛʜɪɴɢ ɪs ᴀ ғʟᴜᴄᴛᴜᴀᴛɪᴏɴ",
                WHITE + "(" + ChatColor.of("#57FFC7") + "Pristine"
                        + WHITE + " + "
                        + ChatColor.of("#96FFD9") + "3" + GRAY + ")",
                ChatColor.of("#03EAFF") + "🔺 " + ChatColor.of("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                GRAY + "- Flow State",
                GRAY + "- Shocking Chance",
                GRAY + "- Tireless",
                GRAY + "- Conduction",
                WHITE + " ",
                ChatColor.of("#03EAFF") + "🔺 " + ChatColor.of("#82F3FF") + BOLD + " ᴀʙɪʟɪᴛʏ",
                GRAY + "- " + ChatColor.of("#03EAFF") + "Kinetic Burst",
                WHITE + "",
                ChatColor.of("#03EAFF") + "🔮 " + ChatColor.of("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                WHITE + "" + BOLD + "Unknown"

        ));
        GemMEta.setCustomModelData(15);
        Gem.setItemMeta(GemMEta);
        return Gem;

    }

    public ItemStack FluxP2T1() {

        ItemStack Gem = new ItemStack(Material.AMETHYST_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.setDisplayName(ChatColor.of("#5ED7FF") +  "" + BOLD + "ғʟᴜx " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(Arrays.asList(
                WHITE + "" + BOLD + "ᴇᴠᴇʀʏᴛʜɪɴɢ ɪs ᴀ ғʟᴜᴄᴛᴜᴀᴛɪᴏɴ",
                WHITE + "(" + ChatColor.of("#57FFC7") + "Pristine"
                        + WHITE + " + "
                        + ChatColor.of("#96FFD9") + "2" + GRAY + ")",
                ChatColor.of("#03EAFF") + "🔺 " + ChatColor.of("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                GRAY + "- Flow State",
                GRAY + "- Shocking Chance",
                GRAY + "- Tireless",
                GRAY + "- Conduction",
                WHITE + " ",
                ChatColor.of("#03EAFF") + "🔺 " + ChatColor.of("#82F3FF") + BOLD + " ᴀʙɪʟɪᴛʏ",
                GRAY + "- " + ChatColor.of("#03EAFF") + "Kinetic Burst",
                WHITE + "",
                ChatColor.of("#03EAFF") + "🔮 " + ChatColor.of("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                WHITE + "" + BOLD + "Unknown"

        ));
        GemMEta.setCustomModelData(15);
        Gem.setItemMeta(GemMEta);
        return Gem;

    }

    public ItemStack FluxP1T1() {

        ItemStack Gem = new ItemStack(Material.AMETHYST_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.setDisplayName(ChatColor.of("#5ED7FF") +  "" + BOLD + "ғʟᴜx " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(Arrays.asList(
                WHITE + "" + BOLD + "ᴇᴠᴇʀʏᴛʜɪɴɢ ɪs ᴀ ғʟᴜᴄᴛᴜᴀᴛɪᴏɴ",
                WHITE + "(" + ChatColor.of("#57FFC7") + "Pristine"
                        + WHITE + " + "
                        + ChatColor.of("#96FFD9") + "1" + GRAY + ")",
                ChatColor.of("#03EAFF") + "🔺 " + ChatColor.of("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                GRAY + "- Flow State",
                GRAY + "- Shocking Chance",
                GRAY + "- Tireless",
                GRAY + "- Conduction",
                WHITE + " ",
                ChatColor.of("#03EAFF") + "🔺 " + ChatColor.of("#82F3FF") + BOLD + " ᴀʙɪʟɪᴛʏ",
                GRAY + "- " + ChatColor.of("#03EAFF") + "Kinetic Burst",
                WHITE + "",
                ChatColor.of("#03EAFF") + "🔮 " + ChatColor.of("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                WHITE + "" + BOLD + "Unknown"

        ));
        GemMEta.setCustomModelData(15);
        Gem.setItemMeta(GemMEta);
        return Gem;

    }

    public ItemStack FluxPT1() {

        ItemStack Gem = new ItemStack(Material.AMETHYST_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.setDisplayName(ChatColor.of("#5ED7FF") +  "" + BOLD + "ғʟᴜx " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(Arrays.asList(
                WHITE + "" + BOLD + "ᴇᴠᴇʀʏᴛʜɪɴɢ ɪs ᴀ ғʟᴜᴄᴛᴜᴀᴛɪᴏɴ",
                WHITE + "(" + ChatColor.of("#57FFC7") + "Pristine" + GRAY + ")",
                ChatColor.of("#03EAFF") + "🔺 " + ChatColor.of("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                GRAY + "- Flow State",
                GRAY + "- Shocking Chance",
                GRAY + "- Tireless",
                GRAY + "- Conduction",
                WHITE + " ",
                ChatColor.of("#03EAFF") + "🔺 " + ChatColor.of("#82F3FF") + BOLD + " ᴀʙɪʟɪᴛʏ",
                GRAY + "- " + ChatColor.of("#03EAFF") + "Kinetic Burst",
                WHITE + "",
                ChatColor.of("#03EAFF") + "🔮 " + ChatColor.of("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                WHITE + "" + BOLD + "Unknown"

        ));
        GemMEta.setCustomModelData(15);
        Gem.setItemMeta(GemMEta);
        return Gem;

    }

    public ItemStack FluxST1() {

        ItemStack Gem = new ItemStack(Material.AMETHYST_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.setDisplayName(ChatColor.of("#5ED7FF") +  "" + BOLD + "ғʟᴜx " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(Arrays.asList(
                WHITE + "" + BOLD + "ᴇᴠᴇʀʏᴛʜɪɴɢ ɪs ᴀ ғʟᴜᴄᴛᴜᴀᴛɪᴏɴ",
                WHITE + "(" + blissgems.colorize("#57FF8F") + "Scratched" + GRAY + ")",
                ChatColor.of("#03EAFF") + "🔺 " + ChatColor.of("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                GRAY + "- Flow State",
                GRAY + "- Shocking Chance",
                GRAY + "- Conduction",
                WHITE + " ",
                ChatColor.of("#03EAFF") + "🔺 " + ChatColor.of("#82F3FF") + BOLD + " ᴀʙɪʟɪᴛʏ",
                GRAY + "- " + ChatColor.of("#03EAFF") + "Kinetic Burst",
                WHITE + "",
                ChatColor.of("#03EAFF") + "🔮 " + ChatColor.of("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                WHITE + "" + BOLD + "Unknown"

        ));
        GemMEta.setCustomModelData(35);
        Gem.setItemMeta(GemMEta);
        return Gem;

    }

    public ItemStack FluxCT1() {

        ItemStack Gem = new ItemStack(Material.AMETHYST_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.setDisplayName(ChatColor.of("#5ED7FF") +  "" + BOLD + "ғʟᴜx " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(Arrays.asList(
                WHITE + "" + BOLD + "ᴇᴠᴇʀʏᴛʜɪɴɢ ɪs ᴀ ғʟᴜᴄᴛᴜᴀᴛɪᴏɴ",
                WHITE + "(" + blissgems.colorize("#7958DB") + "Cracked" + GRAY + ")",
                ChatColor.of("#03EAFF") + "🔺 " + ChatColor.of("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                GRAY + "- Flow State",
                GRAY + "- Shocking Chance",
                WHITE + " ",
                ChatColor.of("#03EAFF") + "🔺 " + ChatColor.of("#82F3FF") + BOLD + " ᴀʙɪʟɪᴛʏ",
                GRAY + "- " + ChatColor.of("#03EAFF") + "Kinetic Burst",
                WHITE + "",
                ChatColor.of("#03EAFF") + "🔮 " + ChatColor.of("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                WHITE + "" + BOLD + "Unknown"

        ));
        GemMEta.setCustomModelData(55);
        Gem.setItemMeta(GemMEta);
        return Gem;

    }

    public ItemStack FluxDT1() {

        ItemStack Gem = new ItemStack(Material.AMETHYST_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.setDisplayName(ChatColor.of("#5ED7FF") +  "" + BOLD + "ғʟᴜx " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(Arrays.asList(
                WHITE + "" + BOLD + "ᴇᴠᴇʀʏᴛʜɪɴɢ ɪs ᴀ ғʟᴜᴄᴛᴜᴀᴛɪᴏɴ",
                WHITE + "(" + blissgems.colorize("#FFC929") + "Damaged" + GRAY + ")",
                ChatColor.of("#03EAFF") + "🔺 " + ChatColor.of("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                GRAY + "- Flow State",
                WHITE + " ",
                ChatColor.of("#03EAFF") + "🔺 " + ChatColor.of("#82F3FF") + BOLD + " ᴀʙɪʟɪᴛʏ",
                GRAY + "- " + ChatColor.of("#03EAFF") + "Kinetic Burst",
                WHITE + "",
                ChatColor.of("#03EAFF") + "🔮 " + ChatColor.of("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                WHITE + "" + BOLD + "Unknown"

        ));
        GemMEta.setCustomModelData(75);
        Gem.setItemMeta(GemMEta);
        return Gem;

    }

    public ItemStack FluxRT1() {

        ItemStack Gem = new ItemStack(Material.AMETHYST_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.setDisplayName(ChatColor.of("#5ED7FF") +  "" + BOLD + "ғʟᴜx " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(Arrays.asList(
                WHITE + "" + BOLD + "ᴇᴠᴇʀʏᴛʜɪɴɢ ɪs ᴀ ғʟᴜᴄᴛᴜᴀᴛɪᴏɴ",
                WHITE + "(" + blissgems.colorize("#FF1111") + "Ruined" + GRAY + ")",
                ChatColor.of("#03EAFF") + "🔺 " + ChatColor.of("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                GRAY + "No Passives",
                WHITE + " ",
                ChatColor.of("#03EAFF") + "🔺 " + ChatColor.of("#82F3FF") + BOLD + " ᴀʙɪʟɪᴛʏ",
                GRAY + "- " + ChatColor.of("#03EAFF") + "Kinetic Burst",
                WHITE + "",
                ChatColor.of("#03EAFF") + "🔮 " + ChatColor.of("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                WHITE + "" + BOLD + "Unknown"

        ));
        GemMEta.setCustomModelData(95);
        Gem.setItemMeta(GemMEta);
        return Gem;

    }

    public ItemStack FluxBT1() {

        ItemStack Gem = new ItemStack(Material.AMETHYST_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.setDisplayName(ChatColor.of("#5ED7FF") +  "" + BOLD + "ғʟᴜx " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(Arrays.asList(
                WHITE + "" + BOLD + "ᴜsᴇʟᴇss"

        ));
        GemMEta.setCustomModelData(99);
        Gem.setItemMeta(GemMEta);
        return Gem;

    }

    public ItemStack StrengthP5T1() {

        ItemStack Gem = new ItemStack(Material.AMETHYST_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.addEnchant(Enchantment.DURABILITY, 1, true);
        GemMEta.setDisplayName(ChatColor.of("#F10303") +  "" + BOLD + "sᴛʀᴇɴɢᴛʜ " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(Arrays.asList(
                WHITE + "" + BOLD + "ʜᴀᴠᴇ ᴛʜᴇ sᴛʀᴇɴɢᴛʜ ᴏғ ᴀ ᴀʀᴍʏ",
                WHITE + "(" + ChatColor.of("#57FFC7") + "Pristine"
                        + WHITE + " + "
                        + ChatColor.of("#96FFD9") + "5" + ")",
                WHITE + " ",
                ChatColor.of("#F10303") + "🔮 " + ChatColor.of("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                GRAY + "- " + GRAY + "Strength",
                GRAY + "- Enchants Sharpness",
                WHITE + " ",
                ChatColor.of("#F10303") + "🔮 " + ChatColor.of("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                GRAY + "- " + ChatColor.of("#F10303") + "Bounty Hunter",
                WHITE + " ",
                ChatColor.of("#F10303") + "🔮 " + ChatColor.of("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                GRAY + "- " + WHITE + "" + BOLD + "Unknown"

        ));
        GemMEta.setCustomModelData(9);
        Gem.setItemMeta(GemMEta);
        return Gem;

    }

    public ItemStack StrengthP4T1() {

        ItemStack Gem = new ItemStack(Material.AMETHYST_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.setDisplayName(ChatColor.of("#F10303") +  "" + BOLD + "sᴛʀᴇɴɢᴛʜ " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(Arrays.asList(
                WHITE + "" + BOLD + "ʜᴀᴠᴇ ᴛʜᴇ sᴛʀᴇɴɢᴛʜ ᴏғ ᴀ ᴀʀᴍʏ",
                WHITE + "(" + ChatColor.of("#57FFC7") + "Pristine"
                        + WHITE + " + "
                        + ChatColor.of("#96FFD9") + "4" + ")",
                WHITE + " ",
                ChatColor.of("#F10303") + "🔮 " + ChatColor.of("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                GRAY + "- " + GRAY + "Strength",
                GRAY + "- Enchants Sharpness",
                WHITE + " ",
                ChatColor.of("#F10303") + "🔮 " + ChatColor.of("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                GRAY + "- " + ChatColor.of("#F10303") + "Bounty Hunter",
                WHITE + " ",
                ChatColor.of("#F10303") + "🔮 " + ChatColor.of("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                GRAY + "- " + WHITE + "" + BOLD + "Unknown"

        ));
        GemMEta.setCustomModelData(9);
        Gem.setItemMeta(GemMEta);
        return Gem;

    }

    public ItemStack StrengthP3T1() {

        ItemStack Gem = new ItemStack(Material.AMETHYST_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.setDisplayName(ChatColor.of("#F10303") +  "" + BOLD + "sᴛʀᴇɴɢᴛʜ " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(Arrays.asList(
                WHITE + "" + BOLD + "ʜᴀᴠᴇ ᴛʜᴇ sᴛʀᴇɴɢᴛʜ ᴏғ ᴀ ᴀʀᴍʏ",
                WHITE + "(" + ChatColor.of("#57FFC7") + "Pristine"
                        + WHITE + " + "
                        + ChatColor.of("#96FFD9") + "3" + ")",
                WHITE + " ",
                ChatColor.of("#F10303") + "🔮 " + ChatColor.of("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                GRAY + "- " + GRAY + "Strength",
                GRAY + "- Enchants Sharpness",
                WHITE + " ",
                ChatColor.of("#F10303") + "🔮 " + ChatColor.of("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                GRAY + "- " + ChatColor.of("#F10303") + "Bounty Hunter",
                WHITE + " ",
                ChatColor.of("#F10303") + "🔮 " + ChatColor.of("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                GRAY + "- " + WHITE + "" + BOLD + "Unknown"

        ));
        GemMEta.setCustomModelData(9);
        Gem.setItemMeta(GemMEta);
        return Gem;

    }

    public ItemStack StrengthP2T1() {

        ItemStack Gem = new ItemStack(Material.AMETHYST_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.setDisplayName(ChatColor.of("#F10303") +  "" + BOLD + "sᴛʀᴇɴɢᴛʜ " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(Arrays.asList(
                WHITE + "" + BOLD + "ʜᴀᴠᴇ ᴛʜᴇ sᴛʀᴇɴɢᴛʜ ᴏғ ᴀ ᴀʀᴍʏ",
                WHITE + "(" + ChatColor.of("#57FFC7") + "Pristine"
                        + WHITE + " + "
                        + ChatColor.of("#96FFD9") + "2" + ")",
                WHITE + " ",
                ChatColor.of("#F10303") + "🔮 " + ChatColor.of("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                GRAY + "- " + GRAY + "Strength",
                GRAY + "- Enchants Sharpness",
                WHITE + " ",
                ChatColor.of("#F10303") + "🔮 " + ChatColor.of("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                GRAY + "- " + ChatColor.of("#F10303") + "Bounty Hunter",
                WHITE + " ",
                ChatColor.of("#F10303") + "🔮 " + ChatColor.of("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                GRAY + "- " + WHITE + "" + BOLD + "Unknown"

        ));
        GemMEta.setCustomModelData(9);
        Gem.setItemMeta(GemMEta);
        return Gem;

    }

    public ItemStack StrengthP1T1() {

        ItemStack Gem = new ItemStack(Material.AMETHYST_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.setDisplayName(ChatColor.of("#F10303") +  "" + BOLD + "sᴛʀᴇɴɢᴛʜ " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(Arrays.asList(
                WHITE + "" + BOLD + "ʜᴀᴠᴇ ᴛʜᴇ sᴛʀᴇɴɢᴛʜ ᴏғ ᴀ ᴀʀᴍʏ",
                WHITE + "(" + ChatColor.of("#57FFC7") + "Pristine"
                        + WHITE + " + "
                        + ChatColor.of("#96FFD9") + "1" + ")",
                WHITE + " ",
                ChatColor.of("#F10303") + "🔮 " + ChatColor.of("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                GRAY + "- " + GRAY + "Strength",
                GRAY + "- Enchants Sharpness",
                WHITE + " ",
                ChatColor.of("#F10303") + "🔮 " + ChatColor.of("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                GRAY + "- " + ChatColor.of("#F10303") + "Bounty Hunter",
                WHITE + " ",
                ChatColor.of("#F10303") + "🔮 " + ChatColor.of("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                GRAY + "- " + WHITE + "" + BOLD + "Unknown"

        ));
        GemMEta.setCustomModelData(9);
        Gem.setItemMeta(GemMEta);
        return Gem;

    }

    public ItemStack StrengthPT1() {

        ItemStack Gem = new ItemStack(Material.AMETHYST_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.setDisplayName(ChatColor.of("#F10303") +  "" + BOLD + "sᴛʀᴇɴɢᴛʜ " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(Arrays.asList(
                WHITE + "" + BOLD + "ʜᴀᴠᴇ ᴛʜᴇ sᴛʀᴇɴɢᴛʜ ᴏғ ᴀ ᴀʀᴍʏ",
                WHITE + "(" + ChatColor.of("#57FFC7") + "Pristine" + WHITE + ")",
                WHITE + " ",
                ChatColor.of("#F10303") + "🔮 " + ChatColor.of("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                GRAY + "- " + GRAY + "Strength",
                GRAY + "- Enchants Sharpness",
                WHITE + " ",
                ChatColor.of("#F10303") + "🔮 " + ChatColor.of("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                GRAY + "- " + ChatColor.of("#F10303") + "Bounty Hunter",
                WHITE + " ",
                ChatColor.of("#F10303") + "🔮 " + ChatColor.of("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                GRAY + "- " + WHITE + "" + BOLD + "Unknown"

        ));
        GemMEta.setCustomModelData(9);
        Gem.setItemMeta(GemMEta);
        return Gem;

    }

    public ItemStack StrengthST1() {

        ItemStack Gem = new ItemStack(Material.AMETHYST_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.setDisplayName(ChatColor.of("#F10303") +  "" + BOLD + "sᴛʀᴇɴɢᴛʜ " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(Arrays.asList(
                WHITE + "" + BOLD + "ʜᴀᴠᴇ ᴛʜᴇ sᴛʀᴇɴɢᴛʜ ᴏғ ᴀ ᴀʀᴍʏ",
                WHITE + "(" + blissgems.colorize("#57FF8F") + "Scratched" + WHITE + ")",
                WHITE + " ",
                ChatColor.of("#F10303") + "🔮 " + ChatColor.of("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                GRAY + "- " + GRAY + "Strength",
                GRAY + "- Enchants Sharpness",
                WHITE + " ",
                ChatColor.of("#F10303") + "🔮 " + ChatColor.of("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                GRAY + "- " + ChatColor.of("#A01FFF") + "Bounty Hunter",
                WHITE + " ",
                ChatColor.of("#F10303") + "🔮 " + ChatColor.of("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                GRAY + "- " + WHITE + "" + BOLD + "Unknown"

        ));
        GemMEta.setCustomModelData(29);
        Gem.setItemMeta(GemMEta);
        return Gem;

    }

    public ItemStack StrengthCT1() {

        ItemStack Gem = new ItemStack(Material.AMETHYST_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.setDisplayName(ChatColor.of("#F10303") +  "" + BOLD + "sᴛʀᴇɴɢᴛʜ " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(Arrays.asList(
                WHITE + "" + BOLD + "ʜᴀᴠᴇ ᴛʜᴇ sᴛʀᴇɴɢᴛʜ ᴏғ ᴀ ᴀʀᴍʏ",
                WHITE + "(" + blissgems.colorize("#7958DB") + "Cracked" + WHITE + ")",
                WHITE + " ",
                ChatColor.of("#F10303") + "🔮 " + ChatColor.of("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                GRAY + "- " + GRAY + "Strength",
                GRAY + "- Enchants Sharpness",
                WHITE + " ",
                ChatColor.of("#F10303") + "🔮 " + ChatColor.of("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                GRAY + "- " + ChatColor.of("#F10303") + "Bounty Hunter",
                WHITE + " ",
                ChatColor.of("#F10303") + "🔮 " + ChatColor.of("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                GRAY + "- " + WHITE + "" + BOLD + "Unknown"

        ));
        GemMEta.setCustomModelData(49);
        Gem.setItemMeta(GemMEta);
        return Gem;

    }

    public ItemStack StrengthDT1() {

        ItemStack Gem = new ItemStack(Material.AMETHYST_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.setDisplayName(ChatColor.of("#F10303") +  "" + BOLD + "sᴛʀᴇɴɢᴛʜ " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(Arrays.asList(
                WHITE + "" + BOLD + "ʜᴀᴠᴇ ᴛʜᴇ sᴛʀᴇɴɢᴛʜ ᴏғ ᴀ ᴀʀᴍʏ",
                WHITE + "(" + blissgems.colorize("#FFC929") + "Damaged" + WHITE + ")",
                WHITE + " ",
                ChatColor.of("#F10303") + "🔮 " + ChatColor.of("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                GRAY + "- " + GRAY + "Strength",
                WHITE + " ",
                ChatColor.of("#F10303") + "🔮 " + ChatColor.of("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                GRAY + "- " + ChatColor.of("#F10303") + "Bounty Hunter",
                WHITE + " ",
                ChatColor.of("#F10303") + "🔮 " + ChatColor.of("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                GRAY + "- " + WHITE + "" + BOLD + "Unknown"

        ));
        GemMEta.setCustomModelData(69);
        Gem.setItemMeta(GemMEta);
        return Gem;

    }

    public ItemStack StrengthRT1() {

        ItemStack Gem = new ItemStack(Material.AMETHYST_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.setDisplayName(ChatColor.of("#F10303") +  "" + BOLD + "sᴛʀᴇɴɢᴛʜ " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(Arrays.asList(
                WHITE + "" + BOLD + "ʜᴀᴠᴇ ᴛʜᴇ sᴛʀᴇɴɢᴛʜ ᴏғ ᴀ ᴀʀᴍʏ",
                WHITE + "(" + blissgems.colorize("#FF1111") + "Ruined" + WHITE + ")",
                WHITE + " ",
                ChatColor.of("#F10303") + "🔮 " + ChatColor.of("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                GRAY + "No Passives",
                WHITE + " ",
                ChatColor.of("#F10303") + "🔮 " + ChatColor.of("#82F3FF") + BOLD + "ᴀʙɪʟɪᴛʏ",
                GRAY + "- " + ChatColor.of("#F10303") + "Bounty Hunter",
                WHITE + " ",
                ChatColor.of("#F10303") + "🔮 " + ChatColor.of("#B8FFFB") + BOLD + "ᴘᴏᴡᴇʀs",
                GRAY + "- " + WHITE + "" + BOLD + "Unknown"

        ));
        GemMEta.setCustomModelData(89);
        Gem.setItemMeta(GemMEta);
        return Gem;

    }

    public ItemStack StrengthBT1() {

        ItemStack Gem = new ItemStack(Material.AMETHYST_SHARD);
        ItemMeta GemMEta = Gem.getItemMeta();
        GemMEta.setDisplayName(ChatColor.of("#F10303") +  "" + BOLD + "sᴛʀᴇɴɢᴛʜ " + ChatColor.of("#FFD773") + "ɢᴇᴍ");
        GemMEta.setLore(Arrays.asList(
                ChatColor.WHITE + "" + ChatColor.BOLD + "ᴜsᴇʟᴇss"
        ));
        GemMEta.setCustomModelData(99);
        Gem.setItemMeta(GemMEta);
        return Gem;

    }
}
