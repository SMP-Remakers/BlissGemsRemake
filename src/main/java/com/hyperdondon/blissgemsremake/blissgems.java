package com.hyperdondon.blissgemsremake;

import com.hyperdondon.blissgemsremake.internal.*;
import com.hyperdondon.blissgemsremake.internal.commands.SlashBliss;
import com.hyperdondon.blissgemsremake.internal.gems.Strength.Powers;
import com.hyperdondon.blissgemsremake.internal.progression.EnchantedObsidian;
import com.hyperdondon.blissgemsremake.internal.progression.SlashProg;
import lombok.Getter;
import lombok.NonNull;
import net.kyori.adventure.platform.bukkit.BukkitAudiences;
import org.bukkit.Bukkit;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.event.Listener;
import org.bukkit.scheduler.BukkitRunnable;
import org.mineacademy.fo.plugin.SimplePlugin;

import java.io.File;

import static com.hyperdondon.blissgemsremake.internal.gems.Strength.Powers.StrengthSeconds;
import static com.hyperdondon.blissgemsremake.internal.gems.Strength.Powers.StrengthTicks;
import static com.hyperdondon.blissgemsremake.internal.gems.Wealth.Powers.WealthSeconds;
import static com.hyperdondon.blissgemsremake.internal.gems.Wealth.Powers.WealthTicks;

public final class blissgems extends SimplePlugin implements Listener {

    /*
    @Getter
    public static BukkitAudiences adventure;
    */
    public static Integer season;
    public static blissgems plugin;


    /*
    public @NonNull BukkitAudiences adventure() {
        if (adventure == null) {
            throw new IllegalStateException("Tried to access Adventure when the plugin was disabled!");
        }
        return adventure;
    }
    */

    @Override
    public void onPluginStart() {

    }

    public void onPluginStop() {
        /*
        if (adventure != null) {
            adventure.close();
            adventure = null;
        }
         */
    }

    public void onReloadablesStart() {
        Mainstart();
    }

    public void Mainstart() {


        this.loadLibrary("org.openjdk.nashorn", "nashorn-core", "15.4");
        this.loadLibrary("org.mariadb.jdbc", "mariadb-java-client", "3.0.3");
        this.loadLibrary("com.mysql", "mysql-connector-j", "9.0.0");
        this.loadLibrary("org.xerial", "sqlite-jdbc", "3.46.0.0");

        //adventure = BukkitAudiences.create(this);

        PlayerParticlePreferences.getInstance().connect("jdbc:sqlite:" + this.getDataFolder().getAbsolutePath() + "/Data.db");
        PlayerCooldownStorer.getInstance().connect("jdbc:sqlite:" + this.getDataFolder().getAbsolutePath() + "/Data.db");

        plugin = this;

        Bukkit.getPluginManager().registerEvents(EnchantedObsidian.getInstance(), this);

        getCommand("progobsidian").setExecutor(EnchantedObsidian.getInstance());

        registerEvents(this);

        registerEvents(LeaveJoinStorer.getInstance());

        registerEvents(Powers.getInstance());

        registerEvents(GemGiver.getInstance());

        registerEvents(com.hyperdondon.blissgemsremake.internal.gems.Wealth.Powers.getInstance());

        registerEvents(TexturePackLoader.getInstance());

        getCommand("blissgems").setExecutor(new SlashBliss());

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
}