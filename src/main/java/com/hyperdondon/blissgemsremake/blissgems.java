package com.hyperdondon.blissgemsremake;

import com.hyperdondon.blissgemsremake.internal.*;
import com.hyperdondon.blissgemsremake.internal.commands.SlashBliss;
import com.hyperdondon.blissgemsremake.internal.gem.Strength.Powers;
import com.hyperdondon.blissgemsremake.internal.item.trader.Trader;
import com.hyperdondon.blissgemsremake.internal.progression.EnchantedObsidian;
import com.hyperdondon.blissgemsremake.internal.progression.SlashProg;
import net.kyori.adventure.text.minimessage.MiniMessage;
import net.kyori.adventure.text.serializer.legacy.LegacyComponentSerializer;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.scheduler.BukkitRunnable;
import org.mineacademy.fo.Common;
import org.mineacademy.fo.plugin.SimplePlugin;

import java.io.File;

import static com.hyperdondon.blissgemsremake.internal.gem.Strength.Powers.*;
import static com.hyperdondon.blissgemsremake.internal.gem.Wealth.Powers.*;

public final class blissgems extends SimplePlugin implements Listener {

    /*
    @Getter
    public static BukkitAudiences adventure;
    */
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
    public void onPluginStart() {}

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
        /*
        For a Foundation version that has Libby
        this.loadLibrary("org.openjdk.nashorn", "nashorn-core", "15.4");
        this.loadLibrary("org.mariadb.jdbc", "mariadb-java-client", "3.0.3");
        this.loadLibrary("com.mysql", "mysql-connector-j", "9.0.0");
        this.loadLibrary("org.xerial", "sqlite-jdbc", "3.46.0.0");
         */
        //adventure = BukkitAudiences.create(this);

        plugin = this;

        Bukkit.getPluginManager().registerEvents(EnchantedObsidian.getInstance(), this);

        getCommand("progobsidian").setExecutor(EnchantedObsidian.getInstance());

        registerEvents(Trader.getInstance());

        registerEvents(LeaveJoinStorer.getInstance());

        registerEvents(Powers.getInstance());

        registerEvents(GemGiver.getInstance());

        registerEvents(com.hyperdondon.blissgemsremake.internal.gem.Wealth.Powers.getInstance());

        registerEvents(TexturePackLoader.getInstance());

        getCommand("blissgems").setExecutor(SlashBliss.getInstance());
        getCommand("blissgems").setTabCompleter(SlashBliss.getInstance());

        getCommand("progression").setExecutor(new SlashProg());

        getCommand("progobsidian").setExecutor(new EnchantedObsidian());

        String configfilename = "config.yml";
        File settings = new File(blissgems.plugin.getDataFolder(), configfilename);

        //settings = new File(plugin.getDataFolder(), configfilename);
        if (!settings.exists()) plugin.saveResource(configfilename, false);

        String databasefilename = "Data.db";
        File db = new File(blissgems.plugin.getDataFolder(), "Data.db");

        //db = new File(plugin.getDataFolder(), "Data.db");
        if (!db.exists()) plugin.saveResource("Data.db", false);

        PlayerParticlePreferences.getInstance().connect("jdbc:sqlite:" + getDataFolder().getAbsolutePath() + databasefilename);
        PlayerCooldownStorer.getInstance().connect("jdbc:sqlite:" + getDataFolder().getAbsolutePath() + databasefilename);


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

    public static String colorize(String s) {
        var sc = MiniMessage.miniMessage().deserialize(s);
        s = LegacyComponentSerializer.legacySection().serialize(sc);
        s = Common.colorize(s);
        return s;
    }
}
