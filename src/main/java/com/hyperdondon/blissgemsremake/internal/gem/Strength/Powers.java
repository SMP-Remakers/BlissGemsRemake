package com.hyperdondon.blissgemsremake.internal.gem.Strength;

import com.github.puregero.multilib.MultiLib;
import com.hyperdondon.blissgemsremake.api.CooldownHandler;
import com.hyperdondon.blissgemsremake.api.Gem;
import com.hyperdondon.blissgemsremake.api.GemType;

import static com.hyperdondon.blissgemsremake.api.util.TimeUtils.*;

import com.hyperdondon.blissgemsremake.BlissGems;
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
import org.mineacademy.fo.annotation.AutoRegister;
import org.mineacademy.fo.remain.Remain;

@AutoRegister
public final class Powers implements Listener {
    @Getter
    private static volatile Powers instance = new Powers();

    @EventHandler
    public void activateSingleFrailerPower(EntityDamageByEntityEvent e) {
        if (e.getDamager().getType() != EntityType.PLAYER)
            return;
        Player p = (Player) e.getDamager();
        if (!Gem.isGem(p.getInventory().getItemInMainHand()))
            return;
        if (Gem.getGemType(p.getInventory().getItemInMainHand()) != GemType.Strength) //Check if the gem isn't a strength gem
            return;
        LivingEntity ent = (LivingEntity) e.getEntity();
        if (!(ent instanceof Monster))
            return;
        //e.setCancelled(true);
        ItemStack gem = p.getInventory().getItemInMainHand();
        int season = Gem.getGemSeason(gem);

        String id = Gem.getGemID(gem, p);

        if (!CooldownHandler.canUseCooldown("Power-Frailer:" + id)) {
            String display = CooldownHandler.parseCooldown("Power-Frailer:" + id, "<#F10303>");
            if (season < 3)
                p.sendMessage(BlissGems.miniMessage(
                        "<#F10303>🔮 <#FDABAA>Your <white>🤺<#F10303>Frailer <#FDABAA>skill is on cooldown for <#F10303>" + display
                ));
            else
                p.sendMessage(BlissGems.miniMessage(
                        "<#F10303>🔮 <#FDABAA>Your <white>🤺<#F10303>Nullify <#FDABAA>skill is on cooldown for <#F10303>" + display
                ));
            return; //Add cant use power message
        }

        CooldownHandler.setCooldown("Power-Frailer:" + id, FromMinutesAndSeconds(4, 0));

        if (season < 3)
            p.sendMessage(
                    BlissGems.colorize("#F10303") + "🔮" +
                            BlissGems.colorize("#B8FFFB") + " You have used " +
                            BlissGems.colorize("<white>") + "🤺" + BlissGems.colorize("#F10303") + "Frailer" +
                            BlissGems.colorize("#B8FFFB") + " skill on " + BlissGems.colorize("#F10303") + e.getEntity().getName() + BlissGems.colorize("&7") + " (radius 5)"
            );
        else
            p.sendMessage(
                    BlissGems.colorize("#F10303") + "🔮" +
                            BlissGems.colorize("#B8FFFB") + " You have used " +
                            BlissGems.colorize("<white>") + "🤺" + BlissGems.colorize("#F10303") + "Nullify" +
                            BlissGems.colorize("#B8FFFB") + " skill on " + BlissGems.colorize("#F10303") + e.getEntity().getName() + BlissGems.colorize("&7") + " (radius 5)"
            );

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
        }.runTaskTimer(BlissGems.getInstance(), 0, 0);


        final int[] a = {0};
        new BukkitRunnable() {
            @Override
            public void run() {
                if (a[0] < 400) a[0]++;
                else cancel();
            }
        }.runTaskTimer(BlissGems.getInstance(), 0, 0);
    }

    @EventHandler
    public void activateGroupFrailerPower(PlayerInteractEvent event) {
        //check left click
        if (event.getAction() != Action.LEFT_CLICK_AIR && event.getAction() != Action.LEFT_CLICK_BLOCK)
            return;
        if (!Gem.isGem(event.getPlayer().getInventory().getItemInMainHand()))
            return;
        if (Gem.getGemSeason(event.getPlayer().getInventory().getItemInMainHand()) > 2)
            return;
        if (Gem.getGemType(event.getPlayer().getInventory().getItemInMainHand()) != GemType.Strength) //Check if the gem isn't a strength gem
            return;
        event.setCancelled(true);
        ItemStack gem = event.getPlayer().getInventory().getItemInMainHand();
        Player p = event.getPlayer();
        String id = Gem.getGemID(gem, p);

        if (!CooldownHandler.canUseCooldown("Power-Frailer:" + id))
            return; //Add cant use power message


        CooldownHandler.setCooldown("Power-Frailer:" + id, FromMinutesAndSeconds(4, 0));
        event.getPlayer().sendMessage(BlissGems.miniMessage(
                "<#F10303>🔮 <#B8FFFB>You have activated group <white>🤺 <#F10303>Frailer <#B8FFFB>skill <gray>(radius 5)"
        ));

        for (Entity entity : event.getPlayer().getNearbyEntities(5, 5, 5)) {
            if (entity == event.getPlayer()) continue;
            if (!(entity instanceof LivingEntity livingEntity)) continue;
            for (PotionEffect pe : livingEntity.getActivePotionEffects())
                livingEntity.removePotionEffect(pe.getType());
            livingEntity.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 40, 0));
        }


        Location loc = event.getPlayer().getLocation();

        double spacing = 0.05;
        particleStrenghCircle(loc, 1, spacing);
        particleStrenghCircle(loc, 2, spacing);
        particleStrenghCircle(loc, 3, spacing);
        particleStrenghCircle(loc, 4, spacing);

        final int[] i = {0};
        new BukkitRunnable() {
            @Override
            public void run() {
                if (i[0] < 8) {
                    particleStrenghCircle(loc, 5, spacing);

                    i[0]++;

                } else cancel();

            }
        }.runTaskTimer(BlissGems.getInstance(), 0, 6);
    }


    public static void runStrengthTickTimer() {
    }

    public static void runStrengthSecondTimer() {
        for (Player p : MultiLib.getAllOnlinePlayers()) {
            ItemStack i = p.getInventory().getItemInMainHand();
            ItemStack io = p.getInventory().getItemInOffHand();
            if (!Gem.isGem(i) && !Gem.isGem(io))
                continue;
            ItemStack gem = (Gem.isGem(i)) ? i : io;
            if (Gem.getGemType(gem) != GemType.Strength)
                continue;
            String id = Gem.getGemID(gem, p);


            String FrailerString = BlissGems.miniMessage("<#F10303>" + "🤺" + " " + CooldownHandler.parseCooldown("Power-Frailer:" + id));

            String ChadString = BlissGems.miniMessage("<#F10303>" + "⚔" + " " + CooldownHandler.parseCooldown("Power-ChadStrength:" + id));


            Remain.sendActionBar(p, FrailerString + " " + ChadString);
        }
    }

    public static void particleStrenghCircle(Location player, int radius, double spacing) {
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

    @EventHandler
    public void ChadPower(PlayerInteractEvent event) {
        //check right click
        if (event.getAction() != Action.RIGHT_CLICK_AIR && event.getAction() != Action.RIGHT_CLICK_BLOCK)
            return;
        if (!Gem.isGem(event.getPlayer().getInventory().getItemInMainHand()))
            return;
        if (Gem.getGemType(event.getPlayer().getInventory().getItemInMainHand()) != GemType.Strength) //Check if the gem isn't a strength gem
            return;
        Player p = event.getPlayer();
        event.setCancelled(true);
        ItemStack gem = p.getInventory().getItemInMainHand();

        String id = Gem.getGemID(gem, p);

        //checking if the item has the data
        if (!CooldownHandler.canUseCooldown("Power-ChadStrength:" + id))
            return; //Add cant use power message

        CooldownHandler.setCooldown("Power-ChadStrength:" + id, FromMinutesAndSeconds(4, 0));


        /*
        event.getPlayer().sendMessage(
                blissgems.colorize("&x<white>&1&0&3&0&3") + "🔮" +
                        blissgems.colorize("&x&b&8<white><white><white>&b") + " You have activated group " +
                        blissgems.colorize("<white>") + "🤺" + blissgems.colorize("&x<white>&1&0&3&0&3") + "Chad" +
                        blissgems.colorize("&x&b&8<white><white><white>&b") + " skill" + blissgems.colorize("&7") + " (radius 5)"
        );

         */

        event.getPlayer().sendMessage(BlissGems.miniMessage(
                "<#F10303>🔮 <#B8FFFB>You have activated <white>🤺<#F10303>Chad Strength"
        ));

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