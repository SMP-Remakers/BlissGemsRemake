package com.hyperdondon.blissgemsremake;

import com.hyperdondon.blissgemsremake.api.CooldownHandler;
import com.hyperdondon.blissgemsremake.api.Settings;
import com.hyperdondon.blissgemsremake.internal.PlayerCooldownStorer;
import com.hyperdondon.blissgemsremake.internal.PlayerParticlePreferences;
import com.hyperdondon.blissgemsremake.internal.progression.EnchantedObsidian;
import com.hyperdondon.blissgemsremake.internal.progression.SlashProg;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.minimessage.MiniMessage;
import net.kyori.adventure.text.serializer.legacy.LegacyComponentSerializer;
import org.bstats.bukkit.Metrics;
import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.mineacademy.fo.Common;
import org.mineacademy.fo.plugin.SimplePlugin;

import java.io.File;

public final class BlissGems extends SimplePlugin implements Listener {

    /*
    @Getter
    public static BukkitAudiences adventure;
    */
    public static BlissGems plugin;
    int pluginId = 24042;
    Metrics metrics;


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
        /*
        For a Foundation version that has Libby
        this.loadLibrary("org.openjdk.nashorn", "nashorn-core", "15.4");
        this.loadLibrary("org.mariadb.jdbc", "mariadb-java-client", "3.0.3");
        this.loadLibrary("com.mysql", "mysql-connector-j", "9.0.0");
        this.loadLibrary("org.xerial", "sqlite-jdbc", "3.46.0.0");
         */
        //adventure = BukkitAudiences.create(this);

        plugin = this;

        if (Settings.isMetrics()) {
            boolean EnableMetrics = true;
            try {
                Class.forName("com.hyperdondon.blissgemsremake.libs.org.bstats.bukkit.Metrics");
            } catch (ClassNotFoundException e) {
                Common.error(e, "Are you a developer hotswapping? If you see this and you aren't, please report this bug");
                EnableMetrics = false;
            }
            if (EnableMetrics) {
                Common.logFramed("Starting bStats metrics.");
                metrics = new Metrics(this, pluginId);
            }
        }

        Bukkit.getPluginManager().registerEvents(EnchantedObsidian.getInstance(), this);

        getCommand("progobsidian").setExecutor(EnchantedObsidian.getInstance());

        getCommand("progression").setExecutor(new SlashProg());

        getCommand("progobsidian").setExecutor(new EnchantedObsidian());

        String configfilename = "config.yml";
        File settings = new File(getDataFolder(), configfilename);

        //settings = new File(plugin.getDataFolder(), configfilename);
        if (!settings.exists()) plugin.saveResource(configfilename, false);

        String databasefilename = "Data.db";
        File db = new File(getDataFolder(), databasefilename);

        //db = new File(plugin.getDataFolder(), "Data.db");
        if (!db.exists()) plugin.saveResource(databasefilename, false);

        PlayerParticlePreferences.getInstance().connect("jdbc:sqlite:" + getDataFolder().getAbsolutePath() + databasefilename);
        PlayerCooldownStorer.getInstance().connect("jdbc:sqlite:" + getDataFolder().getAbsolutePath() + databasefilename);

        CooldownHandler.Initialize();

        /*
        new BukkitRunnable() {
            @Override
            public void run() {
                EnchantedObsidian.startGlowCheckTask();
                runStrengthTickTimer();
            }
        }.runTaskTimer(SimplePlugin.getInstance(), 0, 0);

        new BukkitRunnable() {
            @Override
            public void run() {
                runStrengthSecondTimer();
            }
        }.runTaskTimer(SimplePlugin.getInstance(), 0, 20);

         */
    }

    //Bad method
    public static String colorize(String s) {
        var sc = MiniMessage.miniMessage().deserialize(s);
        s = LegacyComponentSerializer.legacySection().serialize(sc);
        s = Common.colorize(s);
        return s;
    }

    public static Component miniMessageComponent(String string) {
        return MiniMessage.miniMessage().deserialize(string);
    }

    public static String miniMessageComponent(Component... components) {
        String[] texts = new String[components.length];
        for (int i = 0; i < components.length; i++) texts[i] = miniMessageComponent(components[i]);
        return String.join("\n", texts);
    }

    public static String miniMessage(String string) {
        return LegacyComponentSerializer.legacySection().serialize(
                MiniMessage.miniMessage().deserialize(string)
        );
    }

    public static String miniMessage(String... messages) {
        return miniMessage(String.join("\n", messages));
    }
}
