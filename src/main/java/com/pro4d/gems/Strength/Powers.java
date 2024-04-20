package com.pro4d.gems.Strength;

import com.pro4d.blissgems;
import lombok.Getter;
import org.bukkit.*;
import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.persistence.PersistentDataType;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.util.Vector;
import org.mineacademy.fo.Common;
import org.mineacademy.fo.remain.Remain;

import java.time.Duration;
import java.util.HashMap;
import java.util.Objects;
import java.util.UUID;

public final class Powers implements Listener {

    @Getter
    private static volatile Powers instance = new Powers();


    public static HashMap<UUID, Long> Frailer;
    public static HashMap<UUID, Long> Chad;

    Powers() {
        Frailer = new HashMap<>();
        Chad = new HashMap<>();
    }

    @EventHandler
    public void SingleFrailerPower(EntityDamageByEntityEvent e) {
        if (e.getDamager().getType() == EntityType.PLAYER) {
            HumanEntity p = (HumanEntity) e.getDamager();
            if (p.getInventory().getItemInMainHand().hasItemMeta()) {


                ItemStack gem = p.getInventory().getItemInMainHand();

                NamespacedKey typekey = new NamespacedKey("blissgems", "gem-type"); //will be used to check and get the gem type

                NamespacedKey idkey = new NamespacedKey("blissgems", "gem-id"); //will be used to get the gem id

                if (p.getInventory().getItemInMainHand().getItemMeta().getPersistentDataContainer().has(typekey, PersistentDataType.STRING)) { //checking if the item has the data

                    if (Frailer.containsKey(UUID.fromString(Objects.requireNonNull(gem.getItemMeta().getPersistentDataContainer().get(idkey, PersistentDataType.STRING))))) {
                        long cooldownmils = Frailer.get(UUID.fromString(gem.getItemMeta().getPersistentDataContainer().get(idkey, PersistentDataType.STRING)));
                        if (cooldownmils - System.currentTimeMillis() >= 0) {
                            return;
                        }
                    }


                    if (Objects.equals(p.getInventory().getItemInMainHand().getItemMeta().getPersistentDataContainer().get(typekey, PersistentDataType.STRING), "strength")) { //checking if the gem is a strength gem

                        if (!Frailer.containsKey(p.getInventory().getItemInMainHand().getItemMeta().getPersistentDataContainer().get(idkey, PersistentDataType.STRING))) {
                            Frailer.put(UUID.fromString(p.getInventory().getItemInMainHand().getItemMeta().getPersistentDataContainer().get(idkey, PersistentDataType.STRING)), System.currentTimeMillis() + 240000);
                        }

                        p.sendMessage(
                                Common.colorize("&x&F&1&0&3&0&3") + "🔮" +
                                        Common.colorize("&x&b&8&f&f&f&b") + " You have activated " +
                                        Common.colorize("&f") + "🤺" + Common.colorize("&x&F&1&0&3&0&3") + "Frailer" +
                                        Common.colorize("&x&b&8&f&f&f&b") + " skill on " + Common.colorize("&x&F&1&0&3&0&3") + e.getEntity().getName() + Common.colorize("&7") + " (radius 5)"
                        );


                        LivingEntity ent = (LivingEntity) e.getEntity();

                        ent.clearActivePotionEffects();
                        
                        ent.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, 20, 0));

                        e.getEntity().getLocation().toVector().subtract(e.getDamager().getLocation().toVector()).normalize().multiply(0.1);

                        Particle.DustOptions circledust = new Particle.DustOptions(org.bukkit.Color.fromRGB(241, 3, 3), 1);

                        final int[] i = {0};
                        new BukkitRunnable() {
                            @Override
                            public void run() {
                                if (i[0] < 100) {
                                    i[0]++;
                                    Location point1 = e.getDamager().getLocation();
                                    point1.setY(point1.getY() + 1);

                                    Location point2 = e.getEntity().getLocation();
                                    point2.setY(point2.getY() + 1);

                                    World world = point1.getWorld();
                                    double distance = point1.distance(point2);
                                    Vector vector = point2.toVector().subtract(point1.toVector()).normalize().multiply(0.1);
                                    Location location = point1.clone();

                                    for (int i = 0; i < distance * 10; i++) {
                                        world.spawnParticle(Particle.REDSTONE, location, 0, circledust);

                                        world.spawnParticle(Particle.SMOKE_NORMAL, location, 0);

                                        location.add(vector);
                                    }
                                } else {
                                    cancel();
                                }
                            }
                        }.runTaskTimer(blissgems.getInstance(), 0, 0);


                    }
                }
            }
        }
    }

    @EventHandler
    public void GroupFrailerPower(PlayerInteractEvent e) {
        if (e.getAction() == Action.LEFT_CLICK_AIR || e.getAction() == Action.LEFT_CLICK_BLOCK) { //check left click

            if (e.getPlayer().getInventory().getItemInMainHand().hasItemMeta()) {


                ItemStack gem = e.getPlayer().getInventory().getItemInMainHand();

                NamespacedKey typekey = new NamespacedKey("blissgems", "gem-type"); //will be used to check and get the gem type

                NamespacedKey idkey = new NamespacedKey("blissgems", "gem-id"); //will be used to get the gem id

                if (e.getPlayer().getInventory().getItemInMainHand().getItemMeta().getPersistentDataContainer().has(typekey, PersistentDataType.STRING)) { //checking if the item has the data

                    if (Frailer.containsKey(UUID.fromString(Objects.requireNonNull(gem.getItemMeta().getPersistentDataContainer().get(idkey, PersistentDataType.STRING))))) {
                        long cooldownmils = Frailer.get(UUID.fromString(gem.getItemMeta().getPersistentDataContainer().get(idkey, PersistentDataType.STRING)));
                        if (cooldownmils - System.currentTimeMillis() >= 0) {
                            return;
                        }
                    }


                    if (Objects.equals(e.getPlayer().getInventory().getItemInMainHand().getItemMeta().getPersistentDataContainer().get(typekey, PersistentDataType.STRING), "strength")) { //checking if the gem is a strength gem

                        if (!Frailer.containsKey(e.getPlayer().getInventory().getItemInMainHand().getItemMeta().getPersistentDataContainer().get(idkey, PersistentDataType.STRING))) {
                            Frailer.put(UUID.fromString(e.getPlayer().getInventory().getItemInMainHand().getItemMeta().getPersistentDataContainer().get(idkey, PersistentDataType.STRING)), System.currentTimeMillis() + 240000);
                        }

                        e.getPlayer().sendMessage(
                                Common.colorize("&x&F&1&0&3&0&3") + "🔮" +
                                        Common.colorize("&x&b&8&f&f&f&b") + " You have activated group " +
                                        Common.colorize("&f") + "🤺" + Common.colorize("&x&F&1&0&3&0&3") + "Frailer" +
                                        Common.colorize("&x&b&8&f&f&f&b") + " skill" + Common.colorize("&7") + " (radius 5)"
                        );


                        for (Entity entity : e.getPlayer().getNearbyEntities(5, 5, 5)) {
                            if (entity != e.getPlayer()) {
                                LivingEntity entity2 = (LivingEntity) entity;
                                if (entity2 != null) {
                                    entity2.clearActivePotionEffects();
                                    entity2.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 40, 0));
                                }
                            }
                        }


                        Location loc = e.getPlayer().getLocation();

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


    public static void StrengthTicks() {

    }

    public static void StrengthSeconds() {
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

                    if (Objects.equals(gem.getItemMeta().getPersistentDataContainer().get(typekey, PersistentDataType.STRING), "strength")) {
                        if (Frailer.containsKey(id)) {

                            Duration duration = Duration.ofMillis(Frailer.get(id) - System.currentTimeMillis());


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
        Particle.DustOptions circledust = new Particle.DustOptions(org.bukkit.Color.fromRGB(241, 3, 3), 1);

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
    public void ChadPower(PlayerInteractEvent event) {
        if (event.getAction() == Action.RIGHT_CLICK_AIR || event.getAction() == Action.RIGHT_CLICK_BLOCK) { //check right click

            if (event.getPlayer().getInventory().getItemInMainHand().hasItemMeta()) {


                ItemStack gem = event.getPlayer().getInventory().getItemInMainHand();

                NamespacedKey typekey = new NamespacedKey("blissgems", "gem-type"); //will be used to check and get the gem type

                NamespacedKey idkey = new NamespacedKey("blissgems", "gem-id"); //will be used to get the gem id

                if (event.getPlayer().getInventory().getItemInMainHand().getItemMeta().getPersistentDataContainer().has(typekey, PersistentDataType.STRING)) { //checking if the item has the data


                    if (Chad.containsKey(UUID.fromString(Objects.requireNonNull(gem.getItemMeta().getPersistentDataContainer().get(idkey, PersistentDataType.STRING))))) {
                        long cooldownmils = Frailer.get(UUID.fromString(gem.getItemMeta().getPersistentDataContainer().get(idkey, PersistentDataType.STRING)));
                        if (cooldownmils - System.currentTimeMillis() >= 0) {
                            return;
                        }
                    }


                    if (Objects.equals(event.getPlayer().getInventory().getItemInMainHand().getItemMeta().getPersistentDataContainer().get(typekey, PersistentDataType.STRING), "strength")) { //checking if the gem is a strength gem

                        if (!Frailer.containsKey(event.getPlayer().getInventory().getItemInMainHand().getItemMeta().getPersistentDataContainer().get(idkey, PersistentDataType.STRING))) {
                            Frailer.put(UUID.fromString(event.getPlayer().getInventory().getItemInMainHand().getItemMeta().getPersistentDataContainer().get(idkey, PersistentDataType.STRING)), System.currentTimeMillis() + 240000);
                        }

                        event.getPlayer().sendMessage(
                                Common.colorize("&x&F&1&0&3&0&3") + "🔮" +
                                        Common.colorize("&x&b&8&f&f&f&b") + " You have activated group " +
                                        Common.colorize("&f") + "🤺" + Common.colorize("&x&F&1&0&3&0&3") + "Frailer" +
                                        Common.colorize("&x&b&8&f&f&f&b") + " skill" + Common.colorize("&7") + " (radius 5)"
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

