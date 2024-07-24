package com.hyperdondon.internal.gems.Speed;

import com.hyperdondon.blissgems;
import lombok.Getter;
import org.bukkit.*;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.persistence.PersistentDataType;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.scheduler.BukkitRunnable;
import org.mineacademy.fo.Common;
import org.mineacademy.fo.remain.Remain;

import java.time.Duration;
import java.util.HashMap;
import java.util.Objects;
import java.util.UUID;

public final class Powers implements Listener {

    @Getter
    private static volatile Powers instance = new Powers();


    public static HashMap<UUID, Long> SpeedyStorm;
    public static HashMap<UUID, Long> SlothsSeditave;

    Powers() {
        SpeedyStorm = new HashMap<>();
        SlothsSeditave = new HashMap<>();
    }


    @EventHandler
    public void SpeedyStorm(PlayerInteractEvent event) {
        if (event.getAction() == Action.LEFT_CLICK_AIR || event.getAction() == Action.LEFT_CLICK_BLOCK) { //check left click

            if (event.getPlayer().getInventory().getItemInMainHand().hasItemMeta()) {


                ItemStack gem = event.getPlayer().getInventory().getItemInMainHand();

                NamespacedKey typekey = new NamespacedKey("blissgems", "gem-type"); //will be used to check and get the gem type

                NamespacedKey idkey = new NamespacedKey("blissgems", "gem-id"); //will be used to get the gem id

                if (event.getPlayer().getInventory().getItemInMainHand().getItemMeta().getPersistentDataContainer().has(typekey, PersistentDataType.STRING)) { //checking if the item has the data

                    if (SpeedyStorm.containsKey(UUID.fromString(Objects.requireNonNull(gem.getItemMeta().getPersistentDataContainer().get(idkey, PersistentDataType.STRING))))) {
                        long cooldownmils = SpeedyStorm.get(UUID.fromString(gem.getItemMeta().getPersistentDataContainer().get(idkey, PersistentDataType.STRING)));
                        if (cooldownmils - System.currentTimeMillis() >= 0) {
                            return;
                        }
                    }


                    if (Objects.equals(event.getPlayer().getInventory().getItemInMainHand().getItemMeta().getPersistentDataContainer().get(typekey, PersistentDataType.STRING), "Speed")) { //checking if the gem is a Speed gem

                        if (!SpeedyStorm.containsKey(event.getPlayer().getInventory().getItemInMainHand().getItemMeta().getPersistentDataContainer().get(idkey, PersistentDataType.STRING))) {
                            SpeedyStorm.put(UUID.fromString(event.getPlayer().getInventory().getItemInMainHand().getItemMeta().getPersistentDataContainer().get(idkey, PersistentDataType.STRING)), System.currentTimeMillis() + 240000);
                        }

                        event.getPlayer().sendMessage(
                                Common.colorize("&x&F&E&F&D&1&7") + "🔮" +
                                        Common.colorize("&x&b&8&f&f&f&b") + " You have activated group " +
                                        Common.colorize("&f") + "🤺" + Common.colorize("&x&F&E&F&D&1&7") + "Sloths Sedative" +
                                        Common.colorize("&x&b&8&f&f&f&b") + " skill" + Common.colorize("&7") + " (radius 4)"
                        );


                        for (Entity entity : event.getPlayer().getNearbyEntities(5, 5, 5)) {
                            if (entity != event.getPlayer()) {
                                LivingEntity e = (LivingEntity) entity;
                                if (e != null) {
                                    e.clearActivePotionEffects();
                                    e.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 40, 0));
                                }
                            }
                        }


                        Location loc = event.getPlayer().getLocation();

                        double spacing = 0.05;
                        strenghcircle(loc, 1, spacing);
                        strenghcircle(loc, 2, spacing);
                        strenghcircle(loc, 3, spacing);
                        strenghcircle(loc, 4, spacing);

                        final int[] i = {0};
                        new BukkitRunnable() {
                            @Override
                            public void run() {
                                if (i[0] < 8) {
                                    strenghcircle(loc, 5, spacing);

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


    public static void SpeedTicks() {

    }

    public static void SpeedSeconds() {
        for (Player p : Bukkit.getOnlinePlayers()) {
            if (p.getInventory().getItemInMainHand().hasItemMeta() || p.getInventory().getItemInOffHand().hasItemMeta()) {

                ItemStack gem = new ItemStack(Material.AIR);


                NamespacedKey idkey = new NamespacedKey("blissgems", "gem-id"); //will be used to get the gem id

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

                    NamespacedKey typekey = new NamespacedKey("blissgems", "gem-type"); //will be used to check and get the gem type


                    UUID id = UUID.fromString(Objects.requireNonNull(gem.getItemMeta().getPersistentDataContainer().get(idkey, PersistentDataType.STRING)));

                    if (Objects.equals(gem.getItemMeta().getPersistentDataContainer().get(typekey, PersistentDataType.STRING), "speed")) {
                        if (SpeedyStorm.containsKey(id)) {

                            Duration duration = Duration.ofMillis(SpeedyStorm.get(id) - System.currentTimeMillis());


                            long minutes = duration.toMinutes();
                            long seconds = duration.toSecondsPart();

                            String time;
                            if (minutes > 0) {
                                time = (seconds > 0) ? minutes + "m " + seconds + "s" : minutes + "m";
                            } else {
                                time = (seconds > 0) ? seconds + "s" : "";
                            }


                            if (time.equals("")) {
                                Remain.sendActionBar(p, Common.colorize("&x&F&1&0&3&0&3") + "\uD83E\uDD3A" + " " + ChatColor.GREEN + "Ready!");

                            } else {
                                Remain.sendActionBar(p, Common.colorize("&x&F&1&0&3&0&3") + "\uD83E\uDD3A" + " " + ChatColor.AQUA + time);
                            }

                        }

                        typekey = null;
                        idkey = null;
                    }
                }
            }
        }
    }

    public static void strenghcircle(Location player, int radius, double spacing) {
        Particle.DustOptions circledust = new Particle.DustOptions(Color.fromRGB(241, 3, 3), 1);

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


    @EventHandler
    public void SlothsSeditave(PlayerInteractEvent event) {
        if (event.getAction() == Action.RIGHT_CLICK_AIR || event.getAction() == Action.RIGHT_CLICK_BLOCK) { //check right click

            if (event.getPlayer().getInventory().getItemInMainHand().hasItemMeta()) {


                ItemStack gem = event.getPlayer().getInventory().getItemInMainHand();

                NamespacedKey typekey = new NamespacedKey("blissgems", "gem-type"); //will be used to check and get the gem type

                NamespacedKey idkey = new NamespacedKey("blissgems", "gem-id"); //will be used to get the gem id

                if (event.getPlayer().getInventory().getItemInMainHand().getItemMeta().getPersistentDataContainer().has(typekey, PersistentDataType.STRING)) { //checking if the item has the data


                    if (SlothsSeditave.containsKey(UUID.fromString(Objects.requireNonNull(gem.getItemMeta().getPersistentDataContainer().get(idkey, PersistentDataType.STRING))))) {
                        long cooldownmils = SlothsSeditave.get(UUID.fromString(gem.getItemMeta().getPersistentDataContainer().get(idkey, PersistentDataType.STRING)));
                        if (cooldownmils - System.currentTimeMillis() >= 0) {
                            return;
                        }
                    }


                    if (Objects.equals(event.getPlayer().getInventory().getItemInMainHand().getItemMeta().getPersistentDataContainer().get(typekey, PersistentDataType.STRING), "speed")) { //checking if the gem is a speed gem

                        if (!SlothsSeditave.containsKey(event.getPlayer().getInventory().getItemInMainHand().getItemMeta().getPersistentDataContainer().get(idkey, PersistentDataType.STRING))) {
                            SlothsSeditave.put(UUID.fromString(event.getPlayer().getInventory().getItemInMainHand().getItemMeta().getPersistentDataContainer().get(idkey, PersistentDataType.STRING)), System.currentTimeMillis() + 240000);
                        }

                        event.getPlayer().sendMessage(
                                Common.colorize("&x&F&E&F&D&1&7") + "🔮" +
                                        Common.colorize("&x&b&8&f&f&f&b") + " You have activated group " +
                                        Common.colorize("&f") + "🤺" + Common.colorize("&x&F&E&F&D&1&7") + "Sloths Sedative" +
                                        Common.colorize("&x&b&8&f&f&f&b") + " skill" + Common.colorize("&7") + " (radius 4)"
                        );


                        for (Entity entity : event.getPlayer().getNearbyEntities(5, 5, 5)) {
                            if (entity != event.getPlayer()) {
                                LivingEntity e = (LivingEntity) entity;
                                e.clearActivePotionEffects();
                                e.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 800, 0));
                            }
                        }


                        Location loc = event.getPlayer().getLocation();

                        double spacing = 0.05;
                        strenghcircle(loc, 1, spacing);
                        strenghcircle(loc, 2, spacing);
                        strenghcircle(loc, 3, spacing);
                        strenghcircle(loc, 4, spacing);

                        final int[] i = {0};
                        new BukkitRunnable() {
                            @Override
                            public void run() {
                                if (i[0] < 8) {
                                    strenghcircle(loc, 5, spacing);

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
}

