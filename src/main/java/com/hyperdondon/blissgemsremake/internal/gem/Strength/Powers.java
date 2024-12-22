package com.hyperdondon.blissgemsremake.internal.gem.Strength;

import com.github.puregero.multilib.MultiLib;
import com.hyperdondon.blissgemsremake.api.CooldownHandler;
import com.hyperdondon.blissgemsremake.api.Gem;
import com.hyperdondon.blissgemsremake.api.GemType;

import static com.hyperdondon.blissgemsremake.api.util.TimeUtils.*;

import com.hyperdondon.blissgemsremake.blissgems;
import com.hyperdondon.blissgemsremake.internal.VersionChecker;
import lombok.Getter;
import org.bukkit.*;
import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.util.Vector;
import org.mineacademy.fo.Common;
import org.mineacademy.fo.remain.Remain;

import static net.md_5.bungee.api.ChatColor.*;

import java.time.Duration;

public final class Powers implements Listener {
    @Getter
    private static volatile Powers instance = new Powers();

    @EventHandler
    public void SingleFrailerPower(EntityDamageByEntityEvent e) {
        if (e.getDamager().getType() != EntityType.PLAYER)
            return;

        Player p = (Player) e.getDamager();
        if (!Gem.isGem(p.getInventory().getItemInMainHand()))
            return;
        if (Gem.getGemType(p.getInventory().getItemInMainHand()) != GemType.Strength) //Check if the gem isn't a strength gem
            return;
        e.setCancelled(true);
        ItemStack gem = p.getInventory().getItemInMainHand();

        String id = Gem.getGemID(gem, p);

        //checking if the item has the data
        if (!CooldownHandler.canUseCooldown("Power-Frailer:" + id))
            return; //Add cant use power message

        CooldownHandler.setCooldown("Power-Frailer:" + id, FromMinutesAndSeconds(4, 0));

        p.sendMessage(
                blissgems.colorize("#F10303") + "🔮" +
                        blissgems.colorize("#B8FFFB") + " You have activated " +
                        blissgems.colorize("&f") + "🤺" + blissgems.colorize("#F10303") + "Frailer" +
                        blissgems.colorize("#B8FFFB") + " skill on " + blissgems.colorize("#F10303") + e.getEntity().getName() + blissgems.colorize("&7") + " (radius 5)"
        );


        LivingEntity ent = (LivingEntity) e.getEntity();

        for (PotionEffect pe : ent.getActivePotionEffects()) ent.removePotionEffect(pe.getType());

        ent.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, 400, 0));

        e.getEntity().getLocation().toVector().subtract(e.getDamager().getLocation().toVector()).normalize().multiply(0.1);

        Particle.DustOptions circledust = new Particle.DustOptions(Color.fromRGB(241, 3, 3), 1);

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
                } else cancel();
            }
        }.runTaskTimer(blissgems.getInstance(), 0, 0);


        final int[] a = {0};
        new BukkitRunnable() {
            @Override
            public void run() {
                if (a[0] < 400) a[0]++;
                else cancel();
            }
        }.runTaskTimer(blissgems.getInstance(), 0, 0);
    }

    @EventHandler
    public void GroupFrailerPower(PlayerInteractEvent e) {
        //check left click
        if (e.getAction() != Action.LEFT_CLICK_AIR && e.getAction() != Action.LEFT_CLICK_BLOCK)
            return;
        if (!Gem.isGem(e.getPlayer().getInventory().getItemInMainHand()))
            return;
        if (Gem.getGemType(e.getPlayer().getInventory().getItemInMainHand()) != GemType.Strength) //Check if the gem isn't a strength gem
            return;
        e.setCancelled(true);
        ItemStack gem = e.getPlayer().getInventory().getItemInMainHand();
        Player p = e.getPlayer();
        String id = Gem.getGemID(gem, p);

        if (!CooldownHandler.canUseCooldown("Power-Frailer:" + id))
            return; //Add cant use power message


        CooldownHandler.setCooldown("Power-Frailer:" + id, FromMinutesAndSeconds(4, 0));
        e.getPlayer().sendMessage(
                blissgems.colorize("#F10303") + "🔮 " +
                        blissgems.colorize("#B8FFFB") + "You have activated group " +
                        blissgems.colorize("&f") + "🤺" + blissgems.colorize("#F10303") + "Frailer " +
                        blissgems.colorize("#B8FFFB") + "skill " + blissgems.colorize("&7") + "(radius 5)"
        );


        for (Entity entity : e.getPlayer().getNearbyEntities(5, 5, 5))
            if (entity != e.getPlayer()) {
                LivingEntity entity2 = (LivingEntity) entity;
                if (entity2 != null) {
                    for (PotionEffect pe : entity2.getActivePotionEffects())
                        entity2.removePotionEffect(pe.getType());
                    entity2.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 40, 0));
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

                } else cancel();

            }
        }.runTaskTimer(blissgems.getInstance(), 0, 6);
    }


    public static void StrengthTicks() {
    }

    public static void StrengthSeconds() {
        for (Player p : MultiLib.getAllOnlinePlayers()) {
            if (!Gem.isGem(p.getInventory().getItemInMainHand()) && !Gem.isGem(p.getInventory().getItemInOffHand()))
                continue;
            if (Gem.getGemType(p.getInventory().getItemInMainHand()) != GemType.Strength && Gem.getGemType(p.getInventory().getItemInOffHand()) != GemType.Strength)
                continue;

            ItemStack gem = new ItemStack(Material.AIR);

            if (Gem.isGem(p.getInventory().getItemInMainHand()))
                if (Gem.getGemType(p.getInventory().getItemInMainHand()) == GemType.Strength)
                    gem = p.getInventory().getItemInMainHand();

            if (Gem.isGem(p.getInventory().getItemInOffHand()))
                if (!Gem.isGem(p.getInventory().getItemInMainHand()))
                    if (Gem.getGemType(p.getInventory().getItemInOffHand()) == GemType.Strength)
                        gem = p.getInventory().getItemInOffHand();

            String id = Gem.getGemID(gem, p);

            String FrailerString = blissgems.colorize("#F10303") + "\uD83E\uDD3A" + " " + GREEN + "Ready!";
            String ChadString = blissgems.colorize("&x&F&1&0&3&0&3") + "⚔" + " " + GREEN + "Ready!";

            //Frailer
            {
                Duration duration = Duration.ofMillis(CooldownHandler.getCooldown("Power-Frailer:" + id));

                long minutes = duration.toMinutes();
                long seconds = duration.toSecondsPart();

                String time = "";
                if (minutes > 0) if (seconds > 0) time = minutes + "m " + seconds + "s";
                else time = minutes + "m";
                else if (seconds > 0) time = seconds + "s";


                if (time.equals(""))
                    FrailerString = blissgems.colorize("&x&F&1&0&3&0&3") + "\uD83E\uDD3A" + " " + GREEN + "Ready!";
                else FrailerString = blissgems.colorize("&x&F&1&0&3&0&3") + "\uD83E\uDD3A" + " " + AQUA + time;
            }

            {
                Duration duration = Duration.ofMillis(CooldownHandler.getCooldown("Power-ChadStrength:" + id));

                long minutes = duration.toMinutes();
                long seconds = duration.toSecondsPart();

                String time = "";
                if (minutes > 0) if (seconds > 0) time = minutes + "m " + seconds + "s";
                else time = minutes + "m";
                else if (seconds > 0) time = seconds + "s";


                if (time.equals(""))
                    ChadString = blissgems.colorize("&x&F&1&0&3&0&3") + "⚔" + " " + GREEN + "Ready!";
                else ChadString = blissgems.colorize("&x&F&1&0&3&0&3") + "⚔" + " " + AQUA + time;
            }
            Remain.sendActionBar(p, FrailerString + " " + ChadString);
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
            if (VersionChecker.OlderThanNBTChange())
                player.getWorld().spawnParticle(Particle.REDSTONE, player.getX() + x, player.getY(), player.getZ() + y, 0, circledust);
            else
                player.getWorld().spawnParticle(Particle.valueOf("DUST"), player.getX() + x, player.getY(), player.getZ() + y, 0, circledust);
            player.getWorld().spawnParticle(Particle.SMOKE_NORMAL, player.getX() + x, player.getY(), player.getZ() + y, 0);

        }
    }

    public static void createFlameRings(final Player p) {
        int scaleY = 1;  // use these to tune the size of your circle
        int scaleZ = 1;
        double density = 0.15;  // smaller numbers make the particles denser

        for (double i = 0; i < 2 * Math.PI; i += density) {

            double y = Math.cos(i) * scaleY;
            double z = Math.sin(i) * scaleZ;

            Location loc = p.getLocation();
            loc.setY(loc.getY() + y); // Adjust the Y coordinate to create a horizontal circle
            loc.setZ(loc.getZ() + z);

            loc.getWorld().spawnParticle(Particle.END_ROD, loc, 0, 0, y, z, 1);
        }


        double rotationAngle = 76;  // variable to control the rotation of the circle

        for (double i = 0; i < 2 * Math.PI; i += density) {

            double y = Math.cos(i) * scaleY;
            double z = Math.sin(i) * scaleZ;

            final Vector circleDir = p.getLocation().getDirection().clone().setX(100);
            double angle = Math.acos((p.getLocation().getX() - p.getLocation().getX()) / 1);
            //Location loc = p.getLocation().getDirection().clone().rotateAroundAxis(circleDir, 20);
            //loc.add(p.getLocation().getDirection().clone()
            //.rotateAroundAxis(circleDir, 20)
            //);

            //loc.setY(loc.getY() + y); // Adjust the Y coordinate to create a horizontal circle
            //loc.setZ(loc.getZ() + z);

            //loc.add(p.getLocation().getDirection().clone()
            //.rotateAroundAxis(circleDir, angle)
            //);


            //loc.getWorld().spawnParticle(Particle.END_ROD, loc, 0, 0, y, z, 1);
        }

    }

    //loc.getWorld().spawnParticle(Particle.END_ROD, loc, 0, 0, x, 0, 1);
    @EventHandler
    public void ChadPower(PlayerInteractEvent e) {
        //check right click
        if (e.getAction() != Action.RIGHT_CLICK_AIR && e.getAction() != Action.RIGHT_CLICK_BLOCK)
            return;
        if (!Gem.isGem(e.getPlayer().getInventory().getItemInMainHand()))
            return;
        if (Gem.getGemType(e.getPlayer().getInventory().getItemInMainHand()) != GemType.Strength) //Check if the gem isn't a strength gem
            return;
        Player p = e.getPlayer();
        e.setCancelled(true);
        ItemStack gem = p.getInventory().getItemInMainHand();

        String id = Gem.getGemID(gem, p);

        //checking if the item has the data
        if (!CooldownHandler.canUseCooldown("Power-ChadStrength:" + id))
            return; //Add cant use power message

        CooldownHandler.setCooldown("Power-ChadStrength:" + id, FromMinutesAndSeconds(4, 0));


        e.getPlayer().sendMessage(
                blissgems.colorize("&x&F&1&0&3&0&3") + "🔮" +
                        blissgems.colorize("&x&b&8&f&f&f&b") + " You have activated group " +
                        blissgems.colorize("&f") + "🤺" + blissgems.colorize("&x&F&1&0&3&0&3") + "Chad" +
                        blissgems.colorize("&x&b&8&f&f&f&b") + " skill" + blissgems.colorize("&7") + " (radius 5)"
        );


        for (Entity entity : e.getPlayer().getNearbyEntities(5, 5, 5))
            if (entity != e.getPlayer()) {
                LivingEntity entity1 = (LivingEntity) entity;
                for (PotionEffect pe : entity1.getActivePotionEffects()) entity1.removePotionEffect(pe.getType());
                entity1.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 800, 0));
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

                } else cancel();
            }
        }.runTaskTimer(blissgems.getInstance(), 0, 6);
    }

    /*
    @EventHandler
    public void ChadHit(EntityDamageByEntityEvent event) {
        if (event.getDamager().getType().equals(EntityType.PLAYER)) {
            HumanEntity attacker = (HumanEntity) event.getDamager();
            if (attacker.getInventory().getItemInMainHand().getType() == Material.AIR)
                if (ChadParticles.containsKey(attacker.getUniqueId()))
                    if (ChadParticles.get(attacker.getUniqueId()) < 4) {
                        Integer num = ChadParticles.get(attacker.getUniqueId()) + 1;
                        ChadParticles.put(attacker.getUniqueId(), num);
                    } else ChadParticles.put(attacker.getUniqueId(), 1);
        }
    }
    */
}