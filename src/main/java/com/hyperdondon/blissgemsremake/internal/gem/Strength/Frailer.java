package com.hyperdondon.blissgemsremake.internal.gem.Strength;

import com.hyperdondon.blissgemsremake.BlissGems;
import com.hyperdondon.blissgemsremake.api.CooldownHandler;
import com.hyperdondon.blissgemsremake.api.Gem;
import com.hyperdondon.blissgemsremake.api.GemType;
import com.hyperdondon.blissgemsremake.api.SeasonSupport;
import com.hyperdondon.blissgemsremake.internal.VersionChecker;
import com.hyperdondon.blissgemsremake.internal.powers.Power;
import com.hyperdondon.blissgemsremake.internal.powers.PowerHandler;
import lombok.Getter;
import net.kyori.adventure.text.Component;
import org.bukkit.*;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.block.Action;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.util.Vector;

import javax.annotation.Nullable;

import static com.hyperdondon.blissgemsremake.api.util.TimeUtils.FromMinutesAndSeconds;

public final class Frailer extends Power {
    @Getter
    public volatile static Frailer instance = new Frailer();

    public Frailer() {
        super("Power-Frailer", BlissGems.miniMessageComponent("🤺" + " [cooldown]"), SeasonSupport.S1_S2_S3);
    }

    @Override
    public void activate(Player player, Gem gem, SeasonSupport seasonSupport, Event pEvent) {
        if (pEvent instanceof EntityDamageByEntityEvent entityDamageByEntityEvent)
            singleUse(player, gem, seasonSupport, entityDamageByEntityEvent);
        else if (pEvent instanceof PlayerInteractEvent playerInteractEvent)
            groupUse(player, gem, seasonSupport, playerInteractEvent);
    }

    public void groupUse(Player player, Gem gem, SeasonSupport seasonSupport, PlayerInteractEvent pEvent) {
        String id = gem.getId();

        if (!CooldownHandler.canUseCooldown("Power-Frailer:" + id))
            return; //Add cant use power message


        CooldownHandler.setCooldown("Power-Frailer:" + id, FromMinutesAndSeconds(4, 0));
        player.sendMessage(BlissGems.miniMessage(
                "<#F10303>🔮 <#B8FFFB>You have activated group <white>🤺 <#F10303>Frailer <#B8FFFB>skill <gray>(radius 5)"
        ));

        for (Entity entity : player.getNearbyEntities(5, 5, 5)) {
            if (entity == player) continue;
            if (!(entity instanceof LivingEntity livingEntity)) continue;
            for (PotionEffect pe : livingEntity.getActivePotionEffects())
                livingEntity.removePotionEffect(pe.getType());
            livingEntity.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 40, 0));
        }


        Location loc = pEvent.getPlayer().getLocation();

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

    public void singleUse(Player player, Gem gem, SeasonSupport seasonSupport, EntityDamageByEntityEvent pEvent) {
        LivingEntity ent = (LivingEntity) pEvent.getEntity();

        if (!CooldownHandler.canUseCooldown("Power-Frailer:" + gem.getId())) {
            String display = CooldownHandler.parseCooldown("Power-Frailer:" + gem.getId(), "<#F10303>");
            if (SeasonSupport.isPresent(seasonSupport, SeasonSupport.S1_S2))
                player.sendMessage(BlissGems.miniMessage(
                        "<#F10303>🔮 <#FDABAA>Your <white>🤺<#F10303>Frailer <#FDABAA>skill is on cooldown for <#F10303>" + display
                ));
            else
                player.sendMessage(BlissGems.miniMessage(
                        "<#F10303>🔮 <#FDABAA>Your <white>🤺<#F10303>Nullify <#FDABAA>skill is on cooldown for <#F10303>" + display
                ));
            return; //Add "can't use power message"
        }

        CooldownHandler.setCooldown("Power-Frailer:" + gem.getId(), FromMinutesAndSeconds(4, 0));

        if (SeasonSupport.isPresent(seasonSupport, SeasonSupport.S1_S2))
            player.sendMessage(
                    BlissGems.colorize("#F10303") + "🔮" +
                            BlissGems.colorize("#B8FFFB") + " You have used " +
                            BlissGems.colorize("<white>") + "🤺" + BlissGems.colorize("#F10303") + "Frailer" +
                            BlissGems.colorize("#B8FFFB") + " skill on " + BlissGems.colorize("#F10303") + pEvent.getEntity().getName() + BlissGems.colorize("&7") + " (radius 5)"
            );
        else
            player.sendMessage(
                    BlissGems.colorize("#F10303") + "🔮" +
                            BlissGems.colorize("#B8FFFB") + " You have used " +
                            BlissGems.colorize("<white>") + "🤺" + BlissGems.colorize("#F10303") + "Nullify" +
                            BlissGems.colorize("#B8FFFB") + " skill on " + BlissGems.colorize("#F10303") + pEvent.getEntity().getName() + BlissGems.colorize("&7") + " (radius 5)"
            );

        for (PotionEffect pe : ent.getActivePotionEffects()) ent.removePotionEffect(pe.getType());

        ent.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, 400, 0));

        pEvent.getEntity().getLocation().toVector().subtract(pEvent.getDamager().getLocation().toVector()).normalize().multiply(0.1);

        Particle.DustOptions circledust = new Particle.DustOptions(Color.fromRGB(241, 3, 3), 1);

        final int[] i = {0};
        new BukkitRunnable() {
            @Override
            public void run() {
                if (i[0] < 100) {
                    i[0]++;
                    Location point1 = pEvent.getDamager().getLocation();
                    point1.setY(point1.getY() + 1);

                    Location point2 = pEvent.getEntity().getLocation();
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

    @Override
    public void deactivate(Player player, Gem gem, SeasonSupport season) {
    }
}
