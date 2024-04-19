package com.pro4d;

import org.bukkit.Material;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.scheduler.BukkitRunnable;
import org.mineacademy.fo.plugin.SimplePlugin;

import java.io.File;

import static com.pro4d.gems.Strength.Powers.StrengthSeconds;
import static com.pro4d.gems.Strength.Powers.StrengthTicks;
import static com.pro4d.gems.Wealth.Powers.WealthSeconds;
import static com.pro4d.gems.Wealth.Powers.WealthTicks;

public final class blissgems extends SimplePlugin implements Listener {
// Sky is the best

    public void onPluginStop() {
    }

    public static Integer season;
    public static blissgems plugin;

    @Override
    public void onPluginStart() {

    }

    public void onReloadablesStart() {
        Mainstart();
    }

    public void Mainstart() {
        plugin = this;

        registerEvents(this);

        registerEvents(com.pro4d.gems.Strength.Powers.getInstance());

        registerEvents(com.pro4d.gems.Wealth.Powers.getInstance());

        getCommand("bliss").setExecutor(new SlashBliss());

        String path = "config.yml";
        File settings = new File(blissgems.plugin.getDataFolder(), path);

        if (!settings.exists()) {
            plugin.saveResource(path, false);
            settings = new File(plugin.getDataFolder(), path);
        }

        YamlConfiguration config = YamlConfiguration.loadConfiguration(settings);
        season = config.getInt("season");


        new BukkitRunnable() {
            @Override
            public void run() {
                StrengthTicks();
                WealthTicks();
            }
        }.runTaskTimer(SimplePlugin.getInstance(), 0, 0);

        new BukkitRunnable() {
            @Override
            public void run() {
                StrengthSeconds();
                WealthSeconds();
            }
        }.runTaskTimer(SimplePlugin.getInstance(), 0, 20);
    }


    public void randomgem(PlayerJoinEvent event) {
        if (!event.getPlayer().hasPlayedBefore())
            event.getPlayer().getInventory().addItem(new ItemStack(Material.PRISMARINE_SHARD));
    }
}