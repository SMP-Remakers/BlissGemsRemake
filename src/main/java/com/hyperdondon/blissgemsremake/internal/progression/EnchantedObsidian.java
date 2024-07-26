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
    }

    @EventHandler
    public void onBlockPlace(BlockPlaceEvent event) {
        ItemStack placedItem = event.getItemInHand();
        Block block = event.getBlockPlaced();
        Player player = event.getPlayer();

        if (isEnchantedObsidian(placedItem)) {
            player.sendMessage(ChatColor.YELLOW + "Placed Enchanted Obsidian detected.");

            Block blockBelow = block.getRelative(BlockFace.DOWN);
            if (blockBelow.getType() == Material.REINFORCED_DEEPSLATE) {
                player.sendMessage(ChatColor.YELLOW + "Block is placed on top of reinforced deepslate.");

                if (isInsideAncientCity(block.getLocation())) {
                    player.sendMessage(ChatColor.YELLOW + "Block is inside an ancient city.");
                    trackEnchantedObsidianPlacement(block, player);
                } else {
                    player.sendMessage(ChatColor.RED + "Block is not inside an ancient city.");
                }
            } else {
                player.sendMessage(ChatColor.RED + "Block is not placed on reinforced deepslate.");
            }
        }
    }

    private boolean isInsideAncientCity(Location location) {
        Biome biome = location.getBlock().getBiome();
        return biome == Biome.DEEP_DARK;
    }

    private void trackEnchantedObsidianPlacement(Block block, Player player) {
        Location baseLocation = block.getLocation().getBlock().getRelative(BlockFace.DOWN).getLocation();
        int count = obsidianCounts.getOrDefault(baseLocation, 0) + 1;
        obsidianCounts.put(baseLocation, count);

        Bukkit.getLogger().info("Enchanted Obsidian Count at " + baseLocation + ": " + count);

        if (count >= REQUIRED_OBSIDIAN_COUNT) {
            player.sendMessage(ChatColor.GREEN + "Required enchanted obsidian blocks found. Replacing blocks and lighting the portal.");
            replaceAndLightPortal(baseLocation);
            obsidianCounts.remove(baseLocation); // Reset count after replacing
        } else {
            player.sendMessage(ChatColor.RED + "Not enough enchanted obsidian blocks. Found " + count + " out of " + REQUIRED_OBSIDIAN_COUNT + ".");
        }
    }

    private void replaceAndLightPortal(Location baseLocation) {
        // Define the width and height of the portal frame
        int width = 22;
        int height = 7;

        Location[] frameLocations = {
                baseLocation.clone().add(-2, 0, -2),
                baseLocation.clone().add(-2, 0, -1),
                baseLocation.clone().add(-2, 0, 0),
                baseLocation.clone().add(-2, 0, 1),
                baseLocation.clone().add(-2, 0, 2),
                baseLocation.clone().add(-1, 0, -2),
                baseLocation.clone().add(-1, 0, 2),
                baseLocation.clone().add(0, 0, -2),
                baseLocation.clone().add(0, 0, 2),
                baseLocation.clone().add(1, 0, -2),
                baseLocation.clone().add(1, 0, 2),
                baseLocation.clone().add(2, 0, -2),
                baseLocation.clone().add(2, 0, -1),
                baseLocation.clone().add(2, 0, 0),
                baseLocation.clone().add(2, 0, 1),
                baseLocation.clone().add(2, 0, 2)
        };



        for (int x = -1; x <= 1; x++) {
            for (int z = -1; z <= 1; z++) {
                if (x != 0 || z != 0) {
                    Block block = baseLocation.clone().add(x, 0, z).getBlock();
                    if (block.getType() == Material.AIR) {
                        block.setType(Material.NETHER_PORTAL);
                    }
                }
            }
        }
    }

    private boolean isEnchantedObsidian(ItemStack item) {
        if (item == null || item.getType() != Material.OBSIDIAN) return false;
        ItemMeta meta = item.getItemMeta();
        return meta != null && ENCHANTED_OBSIDIAN_NAME.equals(meta.getDisplayName());
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
