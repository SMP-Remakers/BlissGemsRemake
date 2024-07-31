package com.hyperdondon.blissgemsremake.internal.commands;

import com.hyperdondon.blissgemsremake.api.*;
import com.hyperdondon.blissgemsremake.internal.PlayerParticlePreferences;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;
import org.mineacademy.fo.Common;

import java.util.List;

public final class SlashBliss implements CommandExecutor, Listener {

    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, Command command, String s, String[] args) {



        if (args.length == 1) {
            if (args[0].equals("test")) {
                Player p = (Player) commandSender;
                Bukkit.broadcastMessage(String.valueOf(Settings.getGiveGemOnJoin()));
                Settings.setGiveGemOnJoin(true);
                Bukkit.broadcastMessage(String.valueOf(Settings.getGiveGemOnJoin()));

                return true;
            }

            if (args[0].equals("toggle")) {
                Player p = (Player) commandSender;




                return true;
            }
        }

        if (args.length == 2) {
            if (args[0].equals("particles") || args[0].equals("particle")) {



                if (args[1].equals("default") || args[1].equals("less") || args[1].equals("performance")) {
                    Player p = (Player) commandSender;
                    PlayerParticlePreferences.getInstance().put(p, args[1]);
                    return true;
                }

            }
        }



        if (args.length == 3) {
            Settings.setSeason(3);
            Player p = (Player) commandSender;
            //ItemStack gem = GetGemItem.returngem(GemType.Strength, 2, Energy.Pristine, 1, 1);

            int allowremoveint;
            int allowdropint;
            if (Settings.getAllowRemove()) {
                allowremoveint = 1;
            }

            else  {
                allowremoveint = 0;
            }



            if (Settings.getAllowDrop()) {
                allowdropint = 1;
            }

            else  {
                allowdropint = 0;
            }

            Gem g = Gem.GemConstructor(GemType.Strength, 2, Energy.Pristine, allowdropint, allowremoveint, 2);

            p.getInventory().setItemInOffHand(g.toItemStack());


            //g.UpdateWithItemStack(p.getInventory().getItemInOffHand());


            //Bukkit.broadcastMessage(g.getID());

            //p.getInventory().addItem(gem);
            //p.getInventory().addItem(g.toItemStack());





            return true;
            }
        if (args.length == 0) {
            Player p = (Player) commandSender;
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
            return true;
        }
        return true;
    }
}
