package com.hyperdondon.blissgemsremake.internal.progression;

import com.hyperdondon.blissgemsremake.blissgems;
import com.hyperdondon.blissgemsremake.internal.gems.Wealth.Powers;
import lombok.Getter;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.block.BlockState;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerPortalEvent;
import org.bukkit.event.world.PortalCreateEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.metadata.FixedMetadataValue;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.mineacademy.fo.Common;

import java.util.Objects;

public class EnchantedObsidian implements Listener, CommandExecutor {


    @Getter
    private static volatile EnchantedObsidian instance = new EnchantedObsidian();


    private static final String ENCHANTED_OBSIDIAN_NAME = Common.colorize("&dEnchanted Obsidian");


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
    public void onPlayerDropItem(PlayerDropItemEvent event) {
        ItemStack droppedItem = event.getItemDrop().getItemStack();
        if (isEnchantedObsidian(droppedItem)) {
            //event.getPlayer().setGlowing(false);
            Item dropped = event.getItemDrop();
            dropped.setGlowing(true);

            // Give back enchanted obsidian
            //event.getPlayer().getInventory().addItem(droppedItem);
            //dropped.remove();
        }
    }

    @EventHandler
    public void onInventoryClick(InventoryClickEvent event) {
        if (event.getWhoClicked() instanceof Player) {
            Player player = (Player) event.getWhoClicked();
            new BukkitRunnable() {
                @Override
                public void run() {
                    boolean hasEnchantedObsidian = player.getInventory().containsAtLeast(new ItemStack(Material.OBSIDIAN), 1) &&
                            player.getInventory().all(Material.OBSIDIAN).values().stream()
                                    .anyMatch(item -> item.getItemMeta() != null && ENCHANTED_OBSIDIAN_NAME.equals(item.getItemMeta().getDisplayName()));
                    player.setGlowing(hasEnchantedObsidian);
                }
            }.runTaskLater(blissgems.getInstance(), 1L); // Run one tick later to ensure the inventory update is processed
        }
    }

    @EventHandler
    public void onInventoryClose(InventoryCloseEvent event) {
        if (event.getPlayer() instanceof Player) {
            Player player = (Player) event.getPlayer();
            boolean hasEnchantedObsidian = player.getInventory().containsAtLeast(new ItemStack(Material.OBSIDIAN), 1) &&
                    player.getInventory().all(Material.OBSIDIAN).values().stream()
                            .anyMatch(item -> item.getItemMeta() != null && ENCHANTED_OBSIDIAN_NAME.equals(item.getItemMeta().getDisplayName()));
            player.setGlowing(hasEnchantedObsidian);
        }
    }

    @EventHandler
    public void onPlayerPortal(PlayerPortalEvent event) {
        if (event.getPlayer().getWorld().getEnvironment() == World.Environment.NETHER) {
            // Check if portal is made with enchanted obsidian
            boolean hasEnchantedObsidian = event.getPlayer().getInventory().containsAtLeast(new ItemStack(Material.OBSIDIAN), 1) &&
                    event.getPlayer().getInventory().all(Material.OBSIDIAN).values().stream()
                            .anyMatch(item -> item.getItemMeta() != null && ENCHANTED_OBSIDIAN_NAME.equals(item.getItemMeta().getDisplayName()));
            if (!hasEnchantedObsidian) {
                //  event.setCancelled(true);
                event.getPlayer().sendMessage(ChatColor.RED + "You Can't Go Through The Nether as You Are On Progression One");
            }
        }
    }

    @EventHandler
    public void onPortalCreate(PortalCreateEvent event) {
        boolean enchantedObsidianUsed = event.getBlocks().stream()
                .anyMatch(block -> block.getType() == Material.OBSIDIAN &&
                        block.hasMetadata(ENCHANTED_OBSIDIAN_NAME));
        if (enchantedObsidianUsed) {
            for (BlockState block : event.getBlocks()) {
                if (block.getType() == Material.OBSIDIAN) {
                    block.setMetadata(ENCHANTED_OBSIDIAN_NAME, new FixedMetadataValue(blissgems.getInstance(), true));
                }
            }
        }
    }


    @EventHandler
    public void onPortalNether(PortalCreateEvent event) {
        event.setCancelled(true);
        event.getEntity().sendMessage(ChatColor.RED + "You Can't Go Through The Nether as You Are On Progression One");
    }

    private boolean isEnchantedObsidian(ItemStack item) {
        return item != null && item.getType() == Material.OBSIDIAN && item.getItemMeta() != null &&
                ENCHANTED_OBSIDIAN_NAME.equals(item.getItemMeta().getDisplayName());
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (label.equalsIgnoreCase("progobsidian")) {
            if (sender instanceof Player) {
                Player player = (Player) sender;
                ItemStack enchantedObsidian = new ItemStack(Material.OBSIDIAN);
                var meta = enchantedObsidian.getItemMeta();
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
