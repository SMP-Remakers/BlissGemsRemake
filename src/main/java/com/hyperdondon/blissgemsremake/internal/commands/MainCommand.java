package com.hyperdondon.blissgemsremake.internal.commands;

import com.github.puregero.multilib.MultiLib;
import com.hyperdondon.blissgemsremake.BlissGems;
import com.hyperdondon.blissgemsremake.api.*;
import com.hyperdondon.blissgemsremake.api.util.ComponentWrapper;
import com.hyperdondon.blissgemsremake.internal.PlayerParticlePreferences;
import com.hyperdondon.blissgemsremake.internal.item.trader.Trader;
import lombok.Getter;
import org.bukkit.entity.Player;
import org.mineacademy.fo.Common;
import org.mineacademy.fo.annotation.AutoRegister;
import org.mineacademy.fo.command.SimpleCommand;

import java.util.ArrayList;
import java.util.List;


@AutoRegister
public final class MainCommand extends SimpleCommand {

    @Getter
    private static volatile MainCommand instance = new MainCommand();

    public MainCommand() {
        super("blissgems/bliss");

        setDescription("Main command for BlissGems");
        setUsage("/<command>");
    }


    @Override
    protected void onCommand() {
        checkConsole();
        Player commandSender = getPlayer();
        //tellFormattedNoPrefix("<blue>&lfds");
        if (args.length == 0) {
            tellNoPrefix(
                    "&b/bliss toggle &7-Toggles give system",
                    "&b/bliss gem (player) (type) (tier) &7- give gem to specific player",
                    "&b/bliss item (item) (player) [amount] &7- give specified item to specific player",
                    "&b/bliss revive (player) &7- revive specific player",
                    "&b/bliss setenergy (player) [amount] &7- set player's energy",
                    "&b/bliss reload &7- reload the configuration",
                    "&b/bliss revive (player) &7- revive banned player",
                    "&b/bliss withdraw [amount] &7- withdraw energy",
                    "&b/bliss setenergy (player) [amount] &7- set energy for player",
                    "&b/bliss particles [setting] &7- set performance setting"
            );
            return;
        }
        if (args[0].equals("test")) Trader.OpenGUI(commandSender);

        //Usage CMDS
        if (args.length == 1) switch (args[0]) {
            case "gem":
                tellNoPrefix("&cUsage: /bliss gem (player) (type) (tier)");
                return;
            case "item":
                tellNoPrefix("&cUsage: /bliss item (item) (player) (amount)");
                return;
            case "particle":
            case "particles":
                tellNoPrefix("&cUsage: /bliss particles (level)");
                return;
            case "setenergy":
                tellNoPrefix("&cUsage: /bliss setenergy (player) [amount]");
                return;
            case "withdraw":
                tellNoPrefix("&cUsage: /bliss energy amount");
                return;
            default:
                return;
        }

        if (args.length == 2) {
            if (args[0].equals("gem")) {
                tellNoPrefix("&cUsage: /bliss gem (player) (type) (tier)");
                return;
            }

            if (args[0].equals("particles") || args[0].equals("particle"))
                if (args[1].equals("default") || args[1].equals("less") || args[1].equals("performance")) {
                    PlayerParticlePreferences.getInstance().put(commandSender, args[1].toLowerCase());
                    tellNoPrefix("#FFD773🔮 &aParticle Level changed to &e" + args[1].toUpperCase());
                    return;
                }

        }

        if (args.length > 3) {
            if (args[0].equals("gem")) {
                //Check if the 2nd arg is a player
                boolean Usage = false;
                boolean IsPlayer = false;
                Player target = null;
                for (Player player : MultiLib.getAllOnlinePlayers())
                    if (args[1].equals(player.getName())) {
                        IsPlayer = true;
                        target = player;
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
                    return;
                }

                try {
                    // Check if number by catching the error/exception
                    Integer.parseInt(args[3]);

                } catch (NumberFormatException e) {
                    commandSender.sendMessage(BlissGems.colorize("#FFD773\uD83D\uDD2E #FC8888Argument must be an integer/number"));
                    return;
                }

                int tier = 1;
                if (Integer.parseInt(args[3]) == 2)
                    tier = 2;

                Settings.setSeason(2);
                GemType type = GemType.valueOf(args[2].substring(0, 1).toUpperCase() + args[2].substring(1));  //Make all letter lowercase then capitalize the first letter
                Energy energy = Energy.Pristine;
                if (Gem.hasAGem(target))
                    energy = Gem.getPlayerEnergy(target);

                int season = Settings.getSeason();

                if (args.length > 4) {
                    try {
                        // Check if number by catching the error/exception
                        Integer.parseInt(args[4]);
                    } catch (NumberFormatException e) {
                        commandSender.sendMessage(BlissGems.colorize("#FFD773\uD83D\uDD2E #FC8888Argument must be an integer/number"));
                        return;
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

                target.sendMessage(Common.colorize("#FFD773🔮 #B8FFFBYou have given #FFD773" + args[1] + " #B8FFFBa " + gemmessage + "#B8FFFB gem &7Tier &b" + args[3]));

                //gem.setAllowdrop(true);
                //gem.setAllowremove(true);
                Gem.giveGem(gem, target, false, Integer.parseInt(args[3]));
            }


            if (args[0].equals("item")) {
                //Check if the 2nd arg is a player
                boolean Usage;
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
                    return;
                }

                try {
                    // Check if number by catching the error/exception
                    Integer.parseInt(args[3]);

                } catch (NumberFormatException e) {
                    commandSender.sendMessage(BlissGems.colorize("&cAn internal error occurred while attempting to perform this command"));
                    return;
                }

                int tier = 1;
                if (Integer.parseInt(args[3]) == 2)
                    tier = 2;

                p.sendMessage(Common.colorize("#FFD773🔮 #B8FFFBYou have given #FFD773" + args[1] + " #B8FFFBa " + "#B8FFFB gem &7Tier &b" + args[3]));

                p.getInventory().addItem(BlissItems.getItem(BlissItemType.Trader, "ds", "ds", 3));
            }

        }
    }

    public List<String> tabComplete() {
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

    public void tellFormatted(String... messages) {
        super.tell(new ComponentWrapper(messages).toSectionSign());
    }

    public void tellFormattedNoPrefix(String... messages) {
        super.tellNoPrefix(new ComponentWrapper(messages).toSectionSign());
    }
}
