package com.hyperdondon.blissgemsremake;

import com.hyperdondon.blissgemsremake.internal.PlayerParticlePreferences;
import com.hyperdondon.blissgemsremake.internal.GemGiver;
import com.hyperdondon.blissgemsremake.internal.commands.SlashBliss;
import com.hyperdondon.blissgemsremake.internal.gems.Strength.Powers;
import com.hyperdondon.blissgemsremake.internal.progression.EnchantedObsidian;
import com.hyperdondon.blissgemsremake.internal.progression.SlashProg;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.scheduler.BukkitRunnable;
import org.mineacademy.fo.plugin.SimplePlugin;

import java.io.File;

import static com.hyperdondon.blissgemsremake.internal.gems.Strength.Powers.StrengthSeconds;
import static com.hyperdondon.blissgemsremake.internal.gems.Strength.Powers.StrengthTicks;
import static com.hyperdondon.blissgemsremake.internal.gems.Wealth.Powers.WealthSeconds;
import static com.hyperdondon.blissgemsremake.internal.gems.Wealth.Powers.WealthTicks;

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


        this.loadLibrary("org.openjdk.nashorn", "nashorn-core", "15.4");
        this.loadLibrary("org.mariadb.jdbc", "mariadb-java-client", "3.0.3");
        this.loadLibrary("com.mysql", "mysql-connector-j", "9.0.0");
        this.loadLibrary("org.xerial", "sqlite-jdbc", "3.46.0.0");

        PlayerParticlePreferences.getInstance().connect("jdbc:sqlite:" + this.getDataFolder().getAbsolutePath() + "/Data.db");
        plugin = this;


        Bukkit.getPluginManager().registerEvents(EnchantedObsidian.getInstance(), this);


        getCommand("progobsidian").setExecutor(EnchantedObsidian.getInstance());

        registerEvents(this);

        registerEvents(Powers.getInstance());

        registerEvents(GemGiver.getInstance());

        registerEvents(com.hyperdondon.blissgemsremake.internal.gems.Wealth.Powers.getInstance());

        getCommand("bliss").setExecutor(new SlashBliss());

        getCommand("progression").setExecutor(new SlashProg());

        getCommand("progobsidian").setExecutor(new EnchantedObsidian());

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
                EnchantedObsidian.startGlowCheckTask();
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