package com.hyperdondon;

import com.hyperdondon.internal.GemGiver;
import com.hyperdondon.internal.SQLLiteData;
import com.hyperdondon.internal.commands.SlashBliss;
import com.hyperdondon.internal.gems.Strength.Powers;
import org.bukkit.Material;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.scheduler.BukkitRunnable;
import org.mineacademy.fo.database.SimpleDatabase;
import org.mineacademy.fo.plugin.SimplePlugin;

import java.io.File;

import static com.hyperdondon.internal.gems.Strength.Powers.StrengthSeconds;
import static com.hyperdondon.internal.gems.Strength.Powers.StrengthTicks;
import static com.hyperdondon.internal.gems.Wealth.Powers.WealthSeconds;
import static com.hyperdondon.internal.gems.Wealth.Powers.WealthTicks;

public final class blissgems extends SimplePlugin implements Listener {

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

        SQLLiteData.getInstance().connect("jdbc:sqlite:" + this.getDataFolder().getAbsolutePath() + "/Data.db");

        plugin = this;

        registerEvents(this);

        registerEvents(Powers.getInstance());

        registerEvents(GemGiver.getInstance());

        registerEvents(com.hyperdondon.internal.gems.Wealth.Powers.getInstance());

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