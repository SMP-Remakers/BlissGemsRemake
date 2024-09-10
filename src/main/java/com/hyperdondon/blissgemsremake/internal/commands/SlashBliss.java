package com.hyperdondon.blissgemsremake.internal.commands;

import com.comphenix.protocol.PacketType;
import com.hyperdondon.blissgemsremake.api.Energy;
import com.hyperdondon.blissgemsremake.api.GemType;
import com.hyperdondon.blissgemsremake.api.GetGemItem;
import com.hyperdondon.blissgemsremake.api.Settings;
import com.hyperdondon.blissgemsremake.blissgems;
import com.hyperdondon.blissgemsremake.internal.PlayerParticlePreferences;
import com.hyperdondon.blissgemsremake.internal.VersionChecker;
import com.hyperdondon.blissgemsremake.internal.gems.Strength.Powers;
import lombok.Getter;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.minimessage.MiniMessage;
import net.kyori.adventure.text.serializer.legacy.LegacyComponentSerializer;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.mineacademy.fo.MinecraftVersion;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public final class SlashBliss implements CommandExecutor, TabCompleter {

    @Getter
    private static volatile SlashBliss instance = new SlashBliss();


    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, Command command, String s, String[] args) {


        if (args.length == 0) {
            Player p = (Player) commandSender;

            //Spigot/Bukkit 1.18 added support for multiple strings to be sent at the same time
            if (MinecraftVersion.newerThan(MinecraftVersion.V.v1_17)) {
                p.sendMessage(
                        ChatColor.AQUA + "/bliss toggle " + ChatColor.GRAY + "-Toggles give system",
                        ChatColor.AQUA + "/bliss gem (player) (type) (tier) " + ChatColor.GRAY + "- give gem to specific player",
                        ChatColor.AQUA + "/bliss item (item) (player) [amount] " + ChatColor.GRAY + "- give specified item to specific player",
                        ChatColor.AQUA + "/bliss revive (player) " + ChatColor.GRAY + "- revive specific player",
                        ChatColor.AQUA + "/bliss setenergy (player) [amount] " + ChatColor.GRAY + "- set player's energy",
                        ChatColor.AQUA + "/bliss reload " + ChatColor.GRAY + "- reload the configuration",
                        ChatColor.AQUA + "/bliss revive (player) " + ChatColor.GRAY + "- revive banned player",
                        ChatColor.AQUA + "/bliss withdraw [amount] " + ChatColor.GRAY + "- withdraw energy",
                        ChatColor.AQUA + "/bliss setenergy (player) [amount] " + ChatColor.GRAY + "- set energy for player",
                        ChatColor.AQUA + "/bliss particles [setting] " + ChatColor.GRAY + "- set performance setting"

                );
            } else {
                p.sendMessage(ChatColor.AQUA + "/bliss toggle " + ChatColor.GRAY + "-Toggles give system");
                p.sendMessage(ChatColor.AQUA + "/bliss gem (player) (type) (tier) " + ChatColor.GRAY + "- give gem to specific player");
                p.sendMessage(ChatColor.AQUA + "/bliss item (item) (player) [amount] " + ChatColor.GRAY + "- give specified item to specific player");
                p.sendMessage(ChatColor.AQUA + "/bliss revive (player) " + ChatColor.GRAY + "- revive specific player");
                p.sendMessage(ChatColor.AQUA + "/bliss setenergy (player) [amount] " + ChatColor.GRAY + "- set player's energy");
                p.sendMessage(ChatColor.AQUA + "/bliss reload " + ChatColor.GRAY + "- reload the configuration");
                p.sendMessage(ChatColor.AQUA + "/bliss revive (player) " + ChatColor.GRAY + "- revive banned player");
                p.sendMessage(ChatColor.AQUA + "/bliss withdraw [amount] " + ChatColor.GRAY + "- withdraw energy");
                p.sendMessage(ChatColor.AQUA + "/bliss setenergy (player) [amount] " + ChatColor.GRAY + "- set energy for player");
                p.sendMessage(ChatColor.AQUA + "/bliss particles [setting] " + ChatColor.GRAY + "- set performance setting");
            }
            return true;
        }


        if (args.length == 2) {
            if (args[0].equals("particles") || args[0].equals("particle")) {
                if (args[1].equals("default") || args[1].equals("less") || args[1].equals("performance")) {
                    Player p = (Player) commandSender;
                    PlayerParticlePreferences.getInstance().put(p, args[1].toLowerCase());
                    p.sendMessage(blissgems.colorize("#FFD773") + "🔮 " + "" + ChatColor.GREEN + "Particle Level changed to " + ChatColor.YELLOW + args[1].toUpperCase());
                    return true;
                }
            }

        }


        if (args.length == 3) {
            //Settings.setSeason(3);
            Player p = (Player) commandSender;
            //ItemStack gem = GetGemItem.returngem(GemType.Strength, 2, Energy.Pristine, 1, 1);

            //Gem gem = Gem.GemConstructor(GemType.Speed, 2, Energy.Cracked, 1,1 ,3);

            //Component parsed = MiniMessage.miniMessage().deserialize("Hello <rainbow>world</rainbow>, isn't <underlined>MiniMessage</underlined> fun?");
            // serialized = miniMessage.serialize(LegacyComponentSerializer.legacySection().deserialize(serialized));
            //p.sendMessage(parsed);

            //Bukkit.broadcastMessage(String.valueOf(VersionChecker.OlderThanNBTChange()));
            p.getInventory().addItem(GetGemItem.returngem(GemType.Wealth, 2, Energy.Pristine, 1, 1, 1));
            //Gem g = Gem.fromGemItem(p.getInventory().getItemInMainHand());
            //Bukkit.broadcastMessage(g.getEnergy().toString());
            //var mm = MiniMessage.miniMessage();
            //Audience player = blissgems.adventure.player(p);


            //player.sendMessage(component);


            //Gem g = Gem.fromGemItem(p.getInventory().getItemInMainHand());

            //p.getInventory().setItemInOffHand(GetGemItem.returngem(GemType.Strength, 2, Energy.N_A, 1, 1, 1));

            //g.UpdateWithItemStack(p.getInventory().getItemInOffHand());

            //Bukkit.broadcastMessage(g.getID());

            //p.getInventory().addItem(gem);

            // p.getInventory().addItem(g.toItemStack());


            return true;
        }
        return true;
    }

    @Override
    public @Nullable List<String> onTabComplete(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {
        if (strings.length == 1) {
            if (Settings.getSeason() == 3)
                return List.of("gem", "item", "particles", "revive", "setenergy", "set-charge", "withdraw");
            if (Settings.getSeason() == 2)
                return List.of("gem", "item", "particles", "revive", "setenergy", "withdraw");
        }

        if (strings[0].equals("gem")) {
            if (strings.length == 2) {
                List<String> pl = new ArrayList<>();
                for (Player p : Bukkit.getOnlinePlayers())
                    pl.add(p.getName());
                return pl;
            }
            if (strings.length == 3) {
                return List.of("astra", "fire", "life", "puff", "random", "speed", "strength", "flux", "wealth");
            }
            if (strings.length == 4) {
                return List.of("(tier)");
            }
        }
        return List.of();
    }
}
