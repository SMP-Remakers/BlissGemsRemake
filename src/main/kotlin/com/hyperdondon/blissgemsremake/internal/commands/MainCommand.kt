package com.hyperdondon.blissgemsremake.internal.commands

import com.hyperdondon.blissgemsremake.api.*
import com.hyperdondon.blissgemsremake.internal.PlayerParticlePreferences.put
import com.hyperdondon.blissgemsremake.internal.util.ComponentWrapper
import com.hyperdondon.blissgemsremake.internal.util.KotlinObjectAutoRegister
import org.bukkit.entity.Player
import org.mineacademy.fo.Common
import org.mineacademy.fo.command.SimpleCommand
import org.mineacademy.fo.remain.Remain
import java.util.*

@KotlinObjectAutoRegister
object MainCommand : SimpleCommand("blissgems/bliss") {
    init {
        setDescription("Main command for BlissGems")
        usage = "/<command>"
    }

    override fun onCommand() {
        checkConsole()
        val commandSender = player
        //tellFormattedNoPrefix("<blue>&lfds");
        if (args.size == 0) {
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
            )
            return
        }

        //Usage CMDS
        if (args.size == 1) when (args[0]) {
            "gem" -> {
                tellNoPrefix("&cUsage: /bliss gem (player) (type) (tier)")
                return
            }

            "item" -> {
                tellNoPrefix("&cUsage: /bliss item (item) (player) (amount)")
                return
            }

            "particle", "particles" -> {
                tellNoPrefix("&cUsage: /bliss particles (level)")
                return
            }

            "setenergy" -> {
                tellNoPrefix("&cUsage: /bliss setenergy (player) [amount]")
                return
            }

            "withdraw" -> {
                tellNoPrefix("&cUsage: /bliss energy amount")
                return
            }

            else -> return
        }

        if (args.size == 2) {
            if (args[0] == "gem") {
                tellNoPrefix("&cUsage: /bliss gem (player) (type) (tier)")
                return
            }

            if (args[0] == "particles" || args[0] == "particle") if (args[1] == "default" || args[1] == "less" || args[1] == "performance") {
                put(commandSender, args[1].lowercase(Locale.getDefault()))
                tellNoPrefix("#FFD773🔮 &aParticle Level changed to &e" + args[1].uppercase(Locale.getDefault()))
                return
            }
        }

        if (args.size > 3) {
            if (args[0] == "gem") {
                //Check if the 2nd arg is a player
                var showUsage = false
                var isPlayer = false
                var target: Player? = null
                for (player in Remain.getOnlinePlayers())
                    if (args[1] == player.name) {
                        isPlayer = true
                        target = player
                    }

                if (!isPlayer) showUsage = true

                if ((args[2] != "astra") && (args[2] != "fire") && (args[2] != "life") && (args[2] != "puff") && (args[2] != "random") && (args[2] != "speed") && (args[2] != "strength") && (args[2] != "flux") && (args[2] != "wealth")) showUsage =
                    true

                if (showUsage) {
                    tellNoPrefix("&cUsage: /bliss gem (player) (type) (tier)")
                    return
                }

                try {
                    // Check if number by catching the error/exception
                    args[3].toInt()
                } catch (numberException: NumberFormatException) {
                    tellFormattedNoPrefix("<#FFD773>\uD83D\uDD2E <#FC8888>Argument must be an integer/number")
                    return
                }

                var tier = 1
                if (args[3].toInt() == 2) tier = 2

                Settings.setSeason(2)
                val type = GemType.valueOf(
                    args[2].substring(0, 1).uppercase(Locale.getDefault()) + args[2].substring(1)
                ) //Make all letter lowercase then capitalize the first letter
                var energy: Energy? = Energy.Pristine
                if (Gem.hasAGem(target)) energy = Gem.getPlayerEnergy(target)

                var season = Settings.season

                if (args.size > 4) {
                    try {
                        // Check if number by catching the error/exception
                        args[4].toInt()
                    } catch (e: NumberFormatException) {
                        tellFormattedNoPrefix("<#FFD773>\uD83D\uDD2E <#FC8888>Argument must be an integer/number")
                        return
                    }
                    season = args[4].toInt()
                }

                val gem = Gem(type, tier, energy, season)

                var gemmessage: String? = ""
                gemmessage = when (type) {
                    GemType.Strength -> "<#F10303>&lsᴛʀᴇɴɢᴛʜ"
                    GemType.Speed -> "<#FEFD17>&lsᴘᴇᴇᴅ"
                    GemType.Life -> "<#FE04B4>&lʟɪғᴇ"
                    GemType.Puff -> "<#EFEFEF>&lᴘᴜғғ"
                    GemType.Astra -> "<#A01FFF>&lᴀsᴛʀᴀ"
                    GemType.Flux -> "<#5ED7FF>&lғʟᴜx"
                    GemType.Fire -> "<#FE8120>&lғɪʀᴇ"
                    GemType.Wealth -> "<#0EC912>&lᴡᴇᴀʟᴛʜ"
                    GemType.Gold -> "<#ffcc2>&lɢᴏʟᴅ"
                }

                Common.tellNoPrefix(
                    target!!, ComponentWrapper(
                        "<#FFD773>🔮 <#B8FFFB>You have given <#FFD773>${args[1]} <#B8FFFB>a $gemmessage <#B8FFFB> gem &7Tier &b${args[3]}"
                    ).toSectionSign()
                )

                //gem.setAllowdrop(true);
                //gem.setAllowremove(true);
                Gem.giveGem(gem, target, false, args[3].toInt())
            }


            if (args[0] == "item") {
                //Check if the 2nd arg is a player
                var showUsage: Boolean
                var isPlayer = false
                var p: Player? = null
                for (player in Remain.getOnlinePlayers()) if (args[2] == player.name) {
                    isPlayer = true
                    p = player
                }

                showUsage = !isPlayer

                if ((args[1] != "energy") && (args[1] != "repair") && (args[1] != "revive") && (args[1] != "trader") && (args[1] != "upgrader")) showUsage =
                    true

                if (showUsage) {
                    tellNoPrefix("&cUsage: /bliss item (item) (player) (amount)")
                    return
                }

                try {
                    // Check if number by catching the error/exception
                    args[3].toInt()
                } catch (e: NumberFormatException) {
                    tellNoPrefix("&cAn internal error occurred while attempting to perform this command")
                    return
                }

                var tier = 1
                if (args[3].toInt() == 2) tier = 2

                Common.tellNoPrefix(
                    p!!, ComponentWrapper(
                        "<#FFD773>\uD83D\uDD2E <#B8FFFB>You have given <#FFD773>${args[1]} <B8FFFB>a gem &7Tier &b${args[3]}"
                    ).toSectionSign()
                )

                p.inventory.addItem(BlissItems.getItem(BlissItemType.Trader, "ds", "ds", 3))
            }
        }
    }

    public override fun tabComplete(): MutableList<String?> {
        if (args.size == 1) {
            if (Settings.season == 3) return mutableListOf(
                "gem",
                "item",
                "particles",
                "revive",
                "setenergy",
                "set-charge",
                "withdraw"
            )
            if (Settings.season == 2) return mutableListOf(
                "gem",
                "item",
                "particles",
                "revive",
                "setenergy",
                "withdraw"
            )
        }

        if (args[0] == "gem") {
            if (args.size == 2) {
                val pl: MutableList<String?> = ArrayList<String?>()
                for (p in Remain.getOnlinePlayers()) pl.add(p.name)
                return pl
            }
            if (args.size == 3) {
                if (Settings.season == 3) return mutableListOf(
                    "astra",
                    "fire",
                    "life",
                    "puff",
                    "random",
                    "speed",
                    "strength",
                    "flux",
                    "wealth"
                )
                if (Settings.season == 2) return mutableListOf(
                    "astra",
                    "fire",
                    "life",
                    "puff",
                    "random",
                    "speed",
                    "strength",
                    "wealth"
                )
                if (Settings.season == 1) return mutableListOf(
                    "fire",
                    "life",
                    "puff",
                    "random",
                    "speed",
                    "strength",
                    "flux",
                    "wealth"
                )
            }
            if (args.size == 4) return mutableListOf("(tier)")
        }

        if (args[0] == "item") {
            if (args.size == 2) return mutableListOf("energy", "repair", "revive", "trader", "upgrader")

            if (args.size == 3) {
                val pl: MutableList<String?> = ArrayList<String?>()
                for (p in Remain.getOnlinePlayers()) pl.add(p.name)
                return pl
            }

            if (args.size == 4) return mutableListOf("1", "2")
        }
        return mutableListOf()
    }

    fun tellFormatted(vararg messages: String?) {
        super.tell(ComponentWrapper(*messages).toSectionSign())
    }

    fun tellFormattedNoPrefix(vararg messages: String?) {
        super.tellNoPrefix(ComponentWrapper(*messages).toSectionSign())
    }
}
