package com.hyperdondon.blissgemsremake.internal.commands;

import com.github.puregero.multilib.MultiLib;
import com.hyperdondon.blissgemsremake.api.*;
import com.hyperdondon.blissgemsremake.BlissGems;
import com.hyperdondon.blissgemsremake.internal.PlayerParticlePreferences;
import com.hyperdondon.blissgemsremake.internal.item.trader.Trader;
import lombok.Getter;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.mineacademy.fo.Common;
import org.mineacademy.fo.MinecraftVersion;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public final class SlashBliss implements CommandExecutor, TabCompleter {

    @Getter
    private static volatile SlashBliss instance = new SlashBliss();


    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, Command command, String s, String[] args) {
        if (args.length < 1) {
            Player p = (Player) commandSender;

            //Spigot/Bukkit 1.18 added support for multiple strings to be sent at the same time
            if (MinecraftVersion.newerThan(MinecraftVersion.V.v1_17)) p.sendMessage(
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
            else {
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

        if (args[0].equals("test")) {
            Player p = (Player) commandSender;
            Trader.OpenGUI(p);
            return true;
        }

        //Usage CMDS
        if (args.length == 1) switch (args[0]) {
            case "gem":
                commandSender.sendMessage(BlissGems.colorize("&cUsage: /bliss gem (player) (type) (tier)"));
                return true;
            case "item":
                commandSender.sendMessage(BlissGems.colorize("&cUsage: /bliss item (item) (player) (amount)"));
                return true;
            case "particle":
            case "particles":
                commandSender.sendMessage(BlissGems.colorize("&cUsage: /bliss particles (level)"));
                return true;
            case "setenergy":
                commandSender.sendMessage(BlissGems.colorize("&cUsage: /bliss setenergy (player) [amount]"));
                return true;
            case "withdraw":
                commandSender.sendMessage(BlissGems.colorize("&cUsage: /bliss energy amount"));
                return true;
            default:
                return true;
        }

        if (args.length == 2) {
            if (args[0].equals("gem")) {
                commandSender.sendMessage(BlissGems.colorize("&cUsage: /bliss gem (player) (type) (tier)"));
                return true;
            }

            if (args[0].equals("particles") || args[0].equals("particle"))
                if (args[1].equals("default") || args[1].equals("less") || args[1].equals("performance")) {
                    Player p = (Player) commandSender;
                    PlayerParticlePreferences.getInstance().put(p, args[1].toLowerCase());
                    p.sendMessage(BlissGems.colorize("#FFD773") + "🔮 " + "" + ChatColor.GREEN + "Particle Level changed to " + ChatColor.YELLOW + args[1].toUpperCase());
                    return true;
                }

        }

        if (args.length > 3) {
            if (args[0].equals("gem")) {
                //Check if the 2nd arg is a player
                boolean Usage = false;
                boolean IsPlayer = false;
                Player p = null;
                for (Player player : MultiLib.getAllOnlinePlayers())
                    if (args[1].equals(player.getName())) {
                        IsPlayer = true;
                        p = player;
                    }

                if (!IsPlayer)
                    Usage = true;


                if (!args[2].equals("astra") &&
                        !args[2].equals("fire") &&
                        !args[2].equals("life") &&
                        !args[2].equals("puff") &&
                        !args[2].equals("random") &&
                        !args[2].equals("speed") &&
                        !args[2].equals("strength") &&
                        !args[2].equals("flux") &&
                        !args[2].equals("wealth"))
                    Usage = true;

                if (Usage) {
                    commandSender.sendMessage(BlissGems.colorize("&cUsage: /bliss gem (player) (type) (tier)"));
                    return true;
                }

                try {
                    // Check if number by catching the error/exception
                    Integer.parseInt(args[3]);

                } catch (NumberFormatException e) {
                    commandSender.sendMessage(BlissGems.colorize("#FFD773\uD83D\uDD2E #FC8888Argument must be an integer/number"));
                    return true;
                }

                int tier = 1;
                if (Integer.parseInt(args[3]) == 2)
                    tier = 2;

                Settings.setSeason(2);
                GemType type = GemType.valueOf(args[2].substring(0, 1).toUpperCase() + args[2].substring(1));  //Make all letter lowercase then capitalize first letter
                Energy energy = Energy.Pristine;
                if (Gem.hasAGem(p))
                    energy = Gem.getPlayerEnergy(p);

                int season = Settings.getSeason();

                if (args.length > 4) {
                    try {
                        // Check if number by catching the error/exception
                        Integer.parseInt(args[4]);
                    } catch (NumberFormatException e) {
                        commandSender.sendMessage(BlissGems.colorize("#FFD773\uD83D\uDD2E #FC8888Argument must be an integer/number"));
                        return true;
                    }
                    season = Integer.parseInt(args[4]);
                }

                Gem gem = new Gem(type, tier, energy, season);

                String gemmessage = "";
                if (type == GemType.Strength)
                    gemmessage = BlissGems.colorize("#F10303&lsᴛʀᴇɴɢᴛʜ");
                else if (type == GemType.Speed)
                    gemmessage = BlissGems.colorize("#FEFD17&lsᴘᴇᴇᴅ");
                else if (type == GemType.Life)
                    gemmessage = BlissGems.colorize("#FE04B4&lʟɪғᴇ");
                else if (type == GemType.Puff)
                    gemmessage = BlissGems.colorize("#EFEFEF&lᴘᴜғғ");
                else if (type == GemType.Astra)
                    gemmessage = BlissGems.colorize("#A01FFF&lᴀsᴛʀᴀ");
                else if (type == GemType.Flux)
                    gemmessage = BlissGems.colorize("#5ED7FF&lғʟᴜx");
                else if (type == GemType.Fire)
                    gemmessage = BlissGems.colorize("#FE8120&lғɪʀᴇ");
                else if (type == GemType.Wealth)
                    gemmessage = BlissGems.colorize("#0EC912&lᴡᴇᴀʟᴛʜ");

                p.sendMessage(Common.colorize("#FFD773🔮 #B8FFFBYou have given #FFD773" + args[1] + " #B8FFFBa " + gemmessage + "#B8FFFB gem &7Tier &b" + args[3]));

                //gem.setAllowdrop(true);
                //gem.setAllowremove(true);
                Gem.giveGem(gem, p, false, Integer.parseInt(args[3]));
            }


            if (args[0].equals("item")) {
                //Check if the 2nd arg is a player
                boolean Usage = false;
                boolean IsPlayer = false;
                Player p = null;
                for (Player player : MultiLib.getAllOnlinePlayers())
                    if (args[2].equals(player.getName())) {
                        IsPlayer = true;
                        p = player;
                    }

                Usage = !IsPlayer;

                if (!args[1].equals("energy") &&
                        !args[1].equals("repair") &&
                        !args[1].equals("revive") &&
                        !args[1].equals("trader") &&
                        !args[1].equals("upgrader"))
                    Usage = true;

                if (Usage) {
                    commandSender.sendMessage(BlissGems.colorize("&cUsage: /bliss item (item) (player) (amount)"));
                    return true;
                }

                try {
                    // Check if number by catching the error/exception
                    Integer.parseInt(args[3]);

                } catch (NumberFormatException e) {
                    commandSender.sendMessage(BlissGems.colorize("&cAn internal error occurred while attempting to perform this command"));
                    return true;
                }

                int tier = 1;
                if (Integer.parseInt(args[3]) == 2)
                    tier = 2;

                p.sendMessage(Common.colorize("#FFD773🔮 #B8FFFBYou have given #FFD773" + args[1] + " #B8FFFBa " + "#B8FFFB gem &7Tier &b" + args[3]));

                p.getInventory().addItem(BlissItems.getItem(BlissItemType.Trader, "ds", "ds", 3));
            }

        }

        return true;
    }

    @Override
    public @Nullable List<String> onTabComplete(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] args) {
        if (args.length == 1) {
            if (Settings.getSeason() == 3)
                return List.of("gem", "item", "particles", "revive", "setenergy", "set-charge", "withdraw");
            if (Settings.getSeason() == 2)
                return List.of("gem", "item", "particles", "revive", "setenergy", "withdraw");
        }

        if (args[0].equals("gem")) {
            if (args.length == 2) {
                List<String> pl = new ArrayList<>();
                for (Player p : MultiLib.getAllOnlinePlayers())
                    pl.add(p.getName());
                return pl;
            }
            if (args.length == 3) {
                if (Settings.getSeason() == 3)
                    return List.of("astra", "fire", "life", "puff", "random", "speed", "strength", "flux", "wealth");
                if (Settings.getSeason() == 2)
                    return List.of("astra", "fire", "life", "puff", "random", "speed", "strength", "wealth");
                if (Settings.getSeason() == 1)
                    return List.of("fire", "life", "puff", "random", "speed", "strength", "flux", "wealth");
            }
            if (args.length == 4)
                return List.of("(tier)");
        }

        if (args[0].equals("item")) {
            if (args.length == 2)
                return List.of("energy", "repair", "revive", "trader", "upgrader");

            if (args.length == 3) {
                List<String> pl = new ArrayList<>();
                for (Player p : MultiLib.getAllOnlinePlayers())
                    pl.add(p.getName());
                return pl;
            }

            if (args.length == 4)
                return List.of("1", "2");


        }
        return List.of();
    }
}
