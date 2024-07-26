package com.hyperdondon.blissgemsremake.internal.progression;

import lombok.Getter;
import org.bukkit.*;
import org.bukkit.block.Biome;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.HashMap;
import java.util.Map;

public class EnchantedObsidian implements Listener, CommandExecutor {

    @Getter
    private static volatile EnchantedObsidian instance = new EnchantedObsidian();

    private static final String ENCHANTED_OBSIDIAN_NAME = ChatColor.translateAlternateColorCodes('&', "&dEnchanted Obsidian");
    private static final int REQUIRED_OBSIDIAN_COUNT = 8;

    private final Map<Location, Integer> obsidianCounts = new HashMap<>();

    public static void startGlowCheckTask() {
        for (Player player : Bukkit.getOnlinePlayers()) {
            boolean hasEnchantedObsidian = false;
            for (ItemStack i : player.getInventory().getContents()) {
                if (i != null) {
                    if (i.hasItemMeta()) {
                        if (i.getItemMeta().hasDisplayName()) {
                            if (i.getItemMeta().getDisplayName().equals(ENCHANTED_OBSIDIAN_NAME)) {
                                if (hasEnchantedObsidian == false) {
                                    hasEnchantedObsidian = true;
                                }
                            }
                        }
                    }
                }
            }
            if (hasEnchantedObsidian) {
                player.setGlowing(true);
            } else {
                player.setGlowing(false);
            }
        }
    }

    @EventHandler
    public void onBlockPlace(BlockPlaceEvent event) {
        ItemStack placedItem = event.getItemInHand();
        Block block = event.getBlockPlaced();
        Player player = event.getPlayer();
        Block baseLocation = block.getLocation().getBlock().getRelative(BlockFace.DOWN).getLocation().getBlock();
        if (event.getItemInHand().hasItemMeta()) {
            if (event.getItemInHand().getItemMeta().hasDisplayName()) {
                if (event.getItemInHand().getItemMeta().getDisplayName() == ENCHANTED_OBSIDIAN_NAME) {





                }
            }
        }
    }
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (label.equalsIgnoreCase("progobsidian")) {
            if (sender instanceof Player) {
                Player player = (Player) sender;
                ItemStack enchantedObsidian = new ItemStack(Material.OBSIDIAN);
                ItemMeta meta = enchantedObsidian.getItemMeta();
                if (meta != null) {
                    meta.setDisplayName(ENCHANTED_OBSIDIAN_NAME);
                    enchantedObsidian.setItemMeta(meta);
                }

                player.getInventory().addItem(enchantedObsidian);
                player.sendMessage(ChatColor.GREEN + "You have been given Enchanted Obsidian!");
                return true;
            } else {
                sender.sendMessage(ChatColor.RED + "Only players can use this command.");
                return false;
            }
        }
        return false;
    }
}