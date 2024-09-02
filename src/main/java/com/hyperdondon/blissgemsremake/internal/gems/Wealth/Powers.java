package com.hyperdondon.blissgemsremake.internal.gems.Wealth;

import com.hyperdondon.blissgemsremake.blissgems;
import lombok.Getter;
import org.bukkit.*;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.persistence.PersistentDataType;
import org.bukkit.scheduler.BukkitRunnable;
import org.mineacademy.fo.Common;
import org.mineacademy.fo.MinecraftVersion;
import org.mineacademy.fo.remain.Remain;

import java.time.Duration;
import java.util.HashMap;
import java.util.Objects;
import java.util.UUID;

public final class Powers implements Listener {

    @Getter
    private static volatile Powers instance = new Powers();


    public static HashMap<UUID, Long> RichRush;
    public static HashMap<UUID, Long> Unfortune;

    Powers() {
        RichRush = new HashMap<>();
        Unfortune = new HashMap<>();
    }


    @EventHandler
    public void RichRush(PlayerInteractEvent event) {
        if (event.getAction() == Action.LEFT_CLICK_AIR || event.getAction() == Action.LEFT_CLICK_BLOCK) { //check left click

            if (event.getPlayer().getInventory().getItemInMainHand().hasItemMeta()) {


                ItemStack gem = event.getPlayer().getInventory().getItemInMainHand();

                NamespacedKey typekey = new NamespacedKey(blissgems.getInstance(), "gem-type"); //will be used to check and get the gem type

                NamespacedKey idkey = new NamespacedKey(blissgems.getInstance(), "gem-id"); //will be used to get the gem id

                if (event.getPlayer().getInventory().getItemInMainHand().getItemMeta().getPersistentDataContainer().has(typekey, PersistentDataType.STRING)) { //checking if the item has the data

                    if (RichRush.containsKey(UUID.fromString(Objects.requireNonNull(gem.getItemMeta().getPersistentDataContainer().get(idkey, PersistentDataType.STRING))))) {
                        long cooldownmils = RichRush.get(UUID.fromString(gem.getItemMeta().getPersistentDataContainer().get(idkey, PersistentDataType.STRING)));
                        if (cooldownmils - System.currentTimeMillis() >= 0) {
                            return;
                        }
                    }


                    if (Objects.equals(event.getPlayer().getInventory().getItemInMainHand().getItemMeta().getPersistentDataContainer().get(typekey, PersistentDataType.STRING), "wealth")) { //checking if the gem is a wealth gem

                        if (!RichRush.containsKey(event.getPlayer().getInventory().getItemInMainHand().getItemMeta().getPersistentDataContainer().get(idkey, PersistentDataType.STRING))) {
                            RichRush.put(UUID.fromString(event.getPlayer().getInventory().getItemInMainHand().getItemMeta().getPersistentDataContainer().get(idkey, PersistentDataType.STRING)), System.currentTimeMillis() + 240000);
                        }

                            event.getPlayer().sendMessage(
                                    blissgems.colorize("#0EC912") + "🔮" +
                                    blissgems.colorize("#B8FFFB") + "You have activated group " +
                                    blissgems.colorize("&f") + "\uD83D\uDCB8 " + blissgems.colorize("#0EC912") + "Rich Rush " +
                                    blissgems.colorize("#B8FFFB") + "Skill for " +
                                    blissgems.colorize("#0EC912") + "5 Minutes"
                            );


                        Location loc = event.getPlayer().getLocation();

                        double spacing = 0.05;
                        wealthcircle(loc, 1, spacing);
                        wealthcircle(loc, 2, spacing);
                        wealthcircle(loc, 3, spacing);
                        wealthcircle(loc, 4, spacing);

                        final int[] i = {0};
                        new BukkitRunnable() {
                            @Override
                            public void run() {
                                if (i[0] < 8) {
                                    wealthcircle(loc, 5, spacing);

                                    i[0]++;

                                } else {
                                    cancel();
                                }

                            }
                        }.runTaskTimer(blissgems.getInstance(), 0, 6);
                    }
                }
            }
        }
    }


    @EventHandler
    public void balls(BlockBreakEvent event) {
        for (int i = 0; i < event.getPlayer().getInventory().getContents().length; i++) {

        }
    }


    public static void WealthTicks() {

    }

    public static void WealthSeconds() {
        for (Player p : Bukkit.getOnlinePlayers()) {
            if (p.getInventory().getItemInMainHand().hasItemMeta() || p.getInventory().getItemInOffHand().hasItemMeta()) {

                ItemStack gem = new ItemStack(Material.AIR);


                NamespacedKey idkey = new NamespacedKey(blissgems.getInstance(), "gem-id"); //will be used to get the gem id

                if (p.getInventory().getItemInMainHand().hasItemMeta()) {
                    if (p.getInventory().getItemInMainHand().getItemMeta().getPersistentDataContainer().has(idkey, PersistentDataType.STRING)) {
                        gem = p.getInventory().getItemInMainHand();
                    }
                }

                if (!gem.hasItemMeta()) {
                    if (p.getInventory().getItemInOffHand().hasItemMeta()) {
                        if (p.getInventory().getItemInOffHand().getItemMeta().getPersistentDataContainer().has(idkey, PersistentDataType.STRING)) {
                            gem = p.getInventory().getItemInOffHand();
                        }
                    }
                }

                if (gem.hasItemMeta()) {

                    NamespacedKey typekey = new NamespacedKey(blissgems.getInstance(), "gem-type"); //will be used to check and get the gem type


                    UUID id = UUID.fromString(Objects.requireNonNull(gem.getItemMeta().getPersistentDataContainer().get(idkey, PersistentDataType.STRING)));

                    if (Objects.equals(gem.getItemMeta().getPersistentDataContainer().get(typekey, PersistentDataType.STRING), "wealth")) {
                        if (RichRush.containsKey(id)) {

                            Duration duration = Duration.ofMillis(RichRush.get(id) - System.currentTimeMillis());


                            long minutes = duration.toMinutes();
                            long seconds = duration.toSecondsPart();

                            String time;
                            if (minutes > 0) {
                                time = (seconds > 0) ? minutes + "m " + seconds + "s" : minutes + "m";
                            } else {
                                time = (seconds > 0) ? seconds + "s" : "";
                            }


                            if (time.equals("")) {
                                Remain.sendActionBar(p, blissgems.colorize("&x&F&1&0&3&0&3") + "\uD83E\uDD3A" + " " + ChatColor.GREEN + "Ready!");

                            } else {
                                Remain.sendActionBar(p, blissgems.colorize("&x&F&1&0&3&0&3") + "\uD83E\uDD3A" + " " + ChatColor.AQUA + time);
                            }

                        }

                        typekey = null;
                        idkey = null;
                    }
                }
            }
        }
    }

    public static void wealthcircle(Location player, int radius, double spacing) {
        Particle.DustOptions circledust = new Particle.DustOptions(Color.fromRGB(14, 201, 18), 1);

        int scaleX = radius;  // use these to tune the size of your circle
        int scaleY = radius;
        double density = spacing;  // smaller numbers make the particles denser

        for (double i = 0; i < 2 * Math.PI; i += density) {

            double x = Math.cos(i) * scaleX;
            double y = Math.sin(i) * scaleY;

            // spawn your particle here
            // for example, if 'loc' is your location object and 'world' is your World object
            player.getWorld().spawnParticle(Particle.REDSTONE, player.getX() + x, player.getY(), player.getZ() + y, 0, circledust);

            player.getWorld().spawnParticle(Particle.SMOKE_NORMAL, player.getX() + x, player.getY(), player.getZ() + y, 0);

        }
    }
}

