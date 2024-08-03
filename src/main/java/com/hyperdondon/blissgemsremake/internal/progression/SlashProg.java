package com.hyperdondon.blissgemsremake.internal.progression;

import com.hyperdondon.blissgemsremake.internal.PlayerParticlePreferences;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.jetbrains.annotations.NotNull;

public final class SlashProg implements CommandExecutor, Listener {

    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, Command command, String s, String[] args) {

        if (args[0].equals("particles") || args[0].equals("particle")) {

            if (args.length == 2) {

                if (args[1].equals("default") || args[1].equals("less") || args[1].equals("performance")) {
                    Player p = (Player) commandSender;
                    PlayerParticlePreferences.getInstance().put(p, args[1]);
                    return true;
                }

            }
        }



        if (args.length == 0) {
            Player p = (Player) commandSender;
            p.sendMessage(

                    ChatColor.AQUA + "/bliss progitems (player)" + ChatColor.GRAY + "- give progitems to specific player"

            );
        }
        return true;
    }
}
