package com.hyperdondon.blissgemsremake.internal.commands;

import com.hyperdondon.blissgemsremake.api.*;
import com.hyperdondon.blissgemsremake.blissgems;
import com.hyperdondon.blissgemsremake.internal.PlayerParticlePreferences;
import de.tr7zw.nbtapi.NBT;
import de.tr7zw.nbtapi.NBTCompound;
import de.tr7zw.nbtapi.NBTItem;
import de.tr7zw.nbtapi.iface.ReadWriteNBT;
import de.tr7zw.nbtapi.iface.ReadWriteNBTList;
import io.lumine.mythic.bukkit.entities.BukkitTadpole;
import net.kyori.adventure.audience.Audiences;
import net.kyori.adventure.platform.bukkit.BukkitAudiences;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.TextComponent;
import net.kyori.adventure.text.format.NamedTextColor;
import net.kyori.adventure.text.format.TextColor;
import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.chat.BaseComponent;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;
import org.mineacademy.fo.Common;
import org.mineacademy.fo.MinecraftVersion;

import java.util.ArrayList;
import java.util.List;

import static com.hyperdondon.blissgemsremake.blissgems.plugin;

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
            //Settings.setSeason(3);
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

            Settings.setSeason(3);

            Gem gem = Gem.GemConstructor(GemType.Strength, 2, Energy.Pristine, 1,1 ,3);

            p.getInventory().addItem(gem.toItemStack());

            TextComponent comp = Component.text()
                    .content(TextColor.HEX_PREFIX + "#F10303 test")
                    .build();


            // Assume 'plugin' is your JavaPlugin instance
            BukkitAudiences audience = BukkitAudiences.create(blissgems.getInstance());

            // Assume 'player' is the player you want to send the message to
            audience.player(p).sendMessage(comp);

            // Assume 'player' is the player you want to send the message to
            //audience.player(player).sendMessage(comp)


            //p.sendMessage(Component.text(NamedTextColor.HEX_PREFIX + "#F10303 dsa"));


            //Gem g = Gem.fromGemItem(p.getInventory().getItemInMainHand());

            //p.getInventory().setItemInOffHand(GetGemItem.returngem(GemType.Strength, 2, Energy.N_A, 1, 1, 1));

            //g.UpdateWithItemStack(p.getInventory().getItemInOffHand());

            //Bukkit.broadcastMessage(g.getID());

            //p.getInventory().addItem(gem);

           // p.getInventory().addItem(g.toItemStack());





            return true;
            }
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
            }
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
        return true;
    }
}
