package com.hyperdondon.blissgemsremake.api

import com.hyperdondon.blissgemsremake.BlissGems.Companion.colorize
import com.hyperdondon.blissgemsremake.BlissGems.Companion.instance
import net.md_5.bungee.api.ChatColor
import org.bukkit.Material
import org.bukkit.NamespacedKey
import org.bukkit.entity.Player
import org.bukkit.inventory.ItemStack
import org.bukkit.persistence.PersistentDataType
import org.mineacademy.fo.Common
import java.util.*

class Gem {
    var id: String? = null
    var type: GemType? = null
    var tier = 0
    var energy: Energy? = null
    var allowDrop: Boolean = false
    var allowRemove: Boolean = false
    var season = 0

    /**
     * Internal Use only!
     */
    private constructor()

    /**
     * Constructs a gem using information you have passed.
     */
    constructor(gemtype: GemType?, gemtier: Int, gemenergy: Energy?) {
        val allowremovebool = Settings.removingAllowed
        val allowdropint = Settings.droppingAllowed

        id = UUID.randomUUID().toString()
        type = gemtype
        tier = gemtier
        energy = gemenergy
        this.allowRemove = allowremovebool
        this.allowDrop = allowdropint
        season = Settings.season
    }

    /**
     * Constructs a gem using information you have passed.
     */
    constructor(gemtype: GemType?, gemtier: Int, gemenergy: Energy?, allowremovebool: Boolean, allowdropbool: Boolean) {
        id = UUID.randomUUID().toString()
        type = gemtype
        tier = gemtier
        energy = gemenergy
        this.allowRemove = allowremovebool
        this.allowDrop = allowdropbool
        season = Settings.season
    }

    /**
     * Constructs a gem using information you have passed.
     */
    constructor(
        gemtype: GemType?,
        gemtier: Int,
        gemenergy: Energy?,
        allowremovebool: Boolean,
        allowdropbool: Boolean,
        gemseason: Int
    ) {
        id = UUID.randomUUID().toString()
        type = gemtype
        tier = gemtier
        energy = gemenergy
        this.allowRemove = allowremovebool
        this.allowDrop = allowdropbool
        season = gemseason
    }

    /**
     * Constructs a gem using information you have passed.
     */
    constructor(gemtype: GemType?, gemtier: Int, gemenergy: Energy?, gemseason: Int) {
        val allowremovebool = Settings.removingAllowed
        val allowdropbool = Settings.droppingAllowed

        id = UUID.randomUUID().toString()
        type = gemtype
        tier = gemtier
        energy = gemenergy
        this.allowRemove = allowremovebool
        this.allowDrop = allowdropbool
        season = gemseason
    }

    /**
     * Turns your Gem to an ItemStack using the information given.
     */
    fun toItemStack(): ItemStack? {
        val allowremoveint: Int
        val allowdropint: Int

        if (this.allowRemove) allowremoveint = 1
        else allowremoveint = 0


        if (this.allowDrop) allowdropint = 1
        else allowdropint = 0


        val item = GemItems.getGemItem(type, tier, energy, allowdropint, allowremoveint, season)
        val itemMeta = item!!.getItemMeta()


        if (season == 2 || season == 3) {
            val idkey = NamespacedKey(instance!!, "gem-id")
            itemMeta.getPersistentDataContainer().set<String?, String?>(idkey, PersistentDataType.STRING, id!!)
        } else if (season == 1) {
            val idkey = NamespacedKey(instance!!, "shard_id")
            itemMeta.getPersistentDataContainer().set<String?, String?>(idkey, PersistentDataType.STRING, id!!)
        }

        item.setItemMeta(itemMeta)


        return item
    }

    companion object {
        /**
         * Returns a Gem using the values from an ItemStack that should be a gem.
         */
        @JvmStatic
        fun fromGemItem(gem: ItemStack): Gem {
            val itemMeta = gem.getItemMeta()


            val gem2 = Gem()

            gem2.energy = getGemInfo(gem)!!.get(0) as Energy?
            gem2.season = getGemInfo(gem)!!.get(1) as Int
            gem2.type = getGemType(gem)
            gem2.id = getGemID(gem).toString()
            gem2.tier = getGemTier(gem)
            gem2.allowDrop = getGemAllowDrop(gem)
            gem2.allowRemove = getGemAllowRemove(gem)


            //Bukkit.broadcastMessage(gem2.type.toString());
            return gem2
        }

        /**
         * Checks if the energy that is given is Energy.Pristine or higher.
         */
        @JvmStatic
        fun isPristineorHigher(en: Energy?): Boolean {
            return (en == Energy.N_A || en == Energy.Pristine || en == Energy.Pristine_1 || en == Energy.Pristine_2 || en == Energy.Pristine_3 || en == Energy.Pristine_4 || en == Energy.Pristine_5)
        }

        /**
         * Gives a player the Gem you provided as an item.
         */
        @JvmStatic
        fun giveGem(gem: Gem, p: Player, silent: Boolean, tier: Int) {
            if (!silent) {
                var gemmessage = "N/A"
                if (gem.type == GemType.Strength) gemmessage = colorize("#F10303&lsᴛʀᴇɴɢᴛʜ")
                else if (gem.type == GemType.Speed) gemmessage = colorize("#FEFD17&lsᴘᴇᴇᴅ")
                else if (gem.type == GemType.Life) gemmessage = colorize("#FE04B4&lʟɪғᴇ")
                else if (gem.type == GemType.Puff) gemmessage = colorize("#EFEFEF&lᴘᴜғғ")
                else if (gem.type == GemType.Astra) gemmessage = colorize("#A01FFF&lᴀsᴛʀᴀ")
                else if (gem.type == GemType.Flux) gemmessage = colorize("#5ED7FF&lғʟᴜx")
                else if (gem.type == GemType.Fire) gemmessage = colorize("#FE8120&lғɪʀᴇ")
                else if (gem.type == GemType.Wealth) gemmessage = colorize("#0EC912&lᴡᴇᴀʟᴛʜ")

                p.sendMessage(Common.colorize("#FFD773🔮 #B8FFFBYou have received a " + gemmessage + "#B8FFFB gem &7Tier &b" + tier))
            }
            p.getInventory().addItem(gem.toItemStack()!!)
        }

        /**
         * Returns an ArrayList. The object in the first index is the energy, the second index is the season
         */
        @JvmStatic
        fun getGemInfo(gem: ItemStack): ArrayList<Any?>? {
            if (!isGem(gem)) return null
            val list = ArrayList<Any?>()
            for (i in 1..5) if (gem.getItemMeta().getLore()!!
                    .contains(Common.colorize("#57FFC7") + "Pristine" + ChatColor.WHITE + " + " + Common.colorize("#96FFD9") + i)
            ) {
                list.add(Energy.valueOf("Pristine_" + i))
                list.add(2)
            }
            //Pris
            if (gem.getItemMeta().getLore()!!.contains(Common.colorize("#57FFC7") + "Pristine")) {
                list.add(Energy.Pristine)
                list.add(2)
            } else if (gem.getItemMeta().getLore()!!.contains(Common.colorize("#57FF8F") + "Scratched")) {
                list.add(Energy.Scratched)
                list.add(2)
            } else if (gem.getItemMeta().getLore()!!.contains(Common.colorize("#7958DB") + "Cracked")) {
                list.add(Energy.Cracked)
                list.add(2)
            } else if (gem.getItemMeta().getLore()!!.contains(Common.colorize("#FFC929") + "Damaged")) {
                list.add(Energy.Damaged)
                list.add(2)
            } else if (gem.getItemMeta().getLore()!!.contains(Common.colorize("#FF1111") + "Ruined")) {
                list.add(Energy.Ruined)
                list.add(2)
            }

            if (!list.isEmpty()) return list

            for (i in 1..5) if (gem.getItemMeta().getLore()!!
                    .contains(
                        Common.colorize("&f(") + Common.colorize("#57FFC7") + "Pristine" + ChatColor.WHITE + " + " + Common.colorize(
                            "#96FFD9"
                        ) + i + ")"
                    ) ||
                gem.getItemMeta().getLore()!!
                    .contains(
                        Common.colorize("&f(") + Common.colorize("#57FFC7") + "Pristine" + ChatColor.WHITE + " + " + Common.colorize(
                            "#96FFD9"
                        ) + i + Common.colorize("&7)")
                    ) ||
                gem.getItemMeta().getLore()!!
                    .contains(
                        Common.colorize("&f(") + Common.colorize("#57FFC7") + "Pristine" + ChatColor.WHITE + " + " + Common.colorize(
                            "#96FFD9"
                        ) + i + Common.colorize("&7) ")
                    )
            ) {
                list.add(Energy.valueOf("Pristine_" + i))
                list.add(3)
            }

            //Pris
            if (gem.getItemMeta().getLore()!!
                    .contains(Common.colorize("&f(") + Common.colorize("#57FFC7") + "Pristine" + Common.colorize("&f)")) ||
                gem.getItemMeta().getLore()!!
                    .contains(Common.colorize("&f(") + Common.colorize("#57FFC7") + "Pristine" + Common.colorize("&7)")) ||
                gem.getItemMeta().getLore()!!
                    .contains(Common.colorize("&f(") + Common.colorize("#57FFC7") + "Pristine" + Common.colorize("&7) "))
            ) {
                list.add(Energy.Pristine)
                list.add(3)
            } else if (gem.getItemMeta().getLore()!!
                    .contains(Common.colorize("&f(") + Common.colorize("#57FF8F") + "Scratched" + Common.colorize("&f)")) ||
                gem.getItemMeta().getLore()!!
                    .contains(Common.colorize("&f(") + Common.colorize("#57FF8F") + "Scratched" + Common.colorize("&7)")) ||
                gem.getItemMeta().getLore()!!
                    .contains(Common.colorize("&f(") + Common.colorize("#57FF8F") + "Scratched" + Common.colorize("&7) "))
            ) {
                list.add(Energy.Scratched)
                list.add(3)
            } else if (gem.getItemMeta().getLore()!!
                    .contains(Common.colorize("&f(") + Common.colorize("#7958DB") + "Cracked" + Common.colorize("&f)")) ||
                gem.getItemMeta().getLore()!!
                    .contains(Common.colorize("&f(") + Common.colorize("#7958DB") + "Cracked" + Common.colorize("&7)")) ||
                gem.getItemMeta().getLore()!!
                    .contains(Common.colorize("&f(") + Common.colorize("#7958DB") + "Cracked" + Common.colorize("&7) "))
            ) {
                list.add(Energy.Cracked)
                list.add(3)
            } else if (gem.getItemMeta().getLore()!!
                    .contains(Common.colorize("&f(") + Common.colorize("#FFC929") + "Damaged" + Common.colorize("&f)")) ||
                gem.getItemMeta().getLore()!!
                    .contains(Common.colorize("&f(") + Common.colorize("#FFC929") + "Damaged" + Common.colorize("&7)")) ||
                gem.getItemMeta().getLore()!!
                    .contains(Common.colorize("&f(") + Common.colorize("#FFC929") + "Damaged" + Common.colorize("&7) "))
            ) {
                list.add(Energy.Damaged)
                list.add(3)
            } else if (gem.getItemMeta().getLore()!!
                    .contains(Common.colorize("&f(") + Common.colorize("#FF1111") + "Ruined" + Common.colorize("&f)")) ||
                gem.getItemMeta().getLore()!!
                    .contains(Common.colorize("&f(") + Common.colorize("#FF1111") + "Ruined" + Common.colorize("&7)")) ||
                gem.getItemMeta().getLore()!!
                    .contains(Common.colorize("&f(\"") + Common.colorize("#FF1111") + "Ruined" + Common.colorize("&f\")")) ||
                gem.getItemMeta().getLore()!!
                    .contains(Common.colorize("&f(") + Common.colorize("#FF1111") + "Ruined" + Common.colorize("&7) "))
            ) {
                list.add(Energy.Ruined)
                list.add(3)
            } else if (gem.getItemMeta().getLore()!!
                    .contains(ChatColor.WHITE.toString() + "" + ChatColor.BOLD + "ᴜsᴇʟᴇss")
            ) {
                list.add(Energy.Broken)
                if (gem.getItemMeta().getCustomModelData() == 99 || gem.getItemMeta()
                        .getCustomModelData() == 100
                ) list.add(3)
                if (gem.getItemMeta().getCustomModelData() == 95 || gem.getItemMeta()
                        .getCustomModelData() == 96
                ) list.add(2)
            }

            if (list.isEmpty()) {
                list.add(Energy.N_A)
                list.add(1)
            }
            return list
        }

        /**
         * Get whether the gem is allowed to be removed from the player's inventory
         */
        @JvmStatic
        fun getGemAllowRemove(gem: ItemStack): Boolean {
            if (!isGem(gem)) return false
            val tierkey = NamespacedKey(instance!!, "quick-no-remove")
            if (gem.getItemMeta().getPersistentDataContainer()
                    .has<String?, String?>(tierkey, PersistentDataType.STRING)
            ) {
                var allow = false
                if (gem.getItemMeta().getPersistentDataContainer()
                        .get<Int?, Int?>(tierkey, PersistentDataType.INTEGER) == 1
                ) allow = true
                return allow
            } else return false
        }

        /**
         * Get whether the gem is allowed to be dropped
         */
        @JvmStatic
        fun getGemAllowDrop(gem: ItemStack): Boolean {
            if (!isGem(gem)) return false
            val tierkey = NamespacedKey(instance!!, "quick-no-drop")
            if (gem.getItemMeta().getPersistentDataContainer()
                    .has<String?, String?>(tierkey, PersistentDataType.STRING)
            ) {
                var allow = false
                if (gem.getItemMeta().getPersistentDataContainer()
                        .get<Int?, Int?>(tierkey, PersistentDataType.INTEGER) == 1
                ) allow = true
                return allow
            } else return false
        }

        //Constructors
        /**
         * Get the tier of a gem
         */
        @JvmStatic
        fun getGemTier(gem: ItemStack): Int {
            if (!isGem(gem)) return 0
            val tierkey = NamespacedKey(instance!!, "gem-tier")
            if (gem.getItemMeta().getPersistentDataContainer()
                    .has<String?, String?>(tierkey, PersistentDataType.STRING)
            ) return gem.getItemMeta().getPersistentDataContainer()
                .get<Int?, Int?>(tierkey, PersistentDataType.INTEGER)!!
            else if (gem.getType() == Material.PRISMARINE_SHARD) return 2
            else return 1
        }

        /**
         * Get the ID of a gem
         */
        @JvmStatic
        fun getGemID(gem: ItemStack): UUID? {
            if (!isGem(gem)) return null
            var idkey = NamespacedKey(instance!!, "gem-id")
            if (!gem.getItemMeta().getPersistentDataContainer()
                    .has<String?, String?>(idkey, PersistentDataType.STRING)
            ) idkey = NamespacedKey(
                instance!!, "shard_id"
            )
            return UUID.fromString(
                gem.getItemMeta().getPersistentDataContainer().get<String?, String?>(idkey, PersistentDataType.STRING)
            )
        }

        /**
         * Get the ID of a gem
         */
        @JvmStatic
        fun getGemID(gem: ItemStack, p: Player?): String? {
            if (!isGem(gem)) return null
            var idkey = NamespacedKey(instance!!, "gem-id")
            if (!gem.getItemMeta().getPersistentDataContainer()
                    .has<String?, String?>(idkey, PersistentDataType.STRING)
            ) idkey = NamespacedKey(
                instance!!, "shard_id"
            )

            return gem.getItemMeta().getPersistentDataContainer()
                .get<String?, String?>(idkey, PersistentDataType.STRING)
        }

        /**
         * Get the energy of a gem
         */
        @JvmStatic
        fun getGemEnergy(gem: ItemStack): Energy? {
            if (!isGem(gem)) return null
            return getGemInfo(gem)!!.get(0) as Energy?
        }

        /**
         * Get the season of a gem
         */
        @JvmStatic
        fun getGemSeason(gem: ItemStack): Int {
            if (!isGem(gem)) return 0
            return getGemInfo(gem)!!.get(1) as Int
        }

        /**
         * Get the type of the gem
         */
        @JvmStatic
        fun getGemType(gem: ItemStack): GemType? {
            if (!isGem(gem)) return null
            var type: GemType? = null
            var type2 = ""
            val season: Int = getGemSeason(gem)

            if (season == 2 || season == 3) {
                val typekey = NamespacedKey(instance!!, "gem-type")
                type2 = gem.getItemMeta().getPersistentDataContainer()
                    .get<String?, String?>(typekey, PersistentDataType.STRING)!!
                    .lowercase(Locale.getDefault())
            }
            if (season != 1) {
                if (type2 == "life") type = GemType.Life
                else if (type2 == "strength") type = GemType.Strength
                else if (type2 == "fire") type = GemType.Fire
                else if (type2 == "speed") type = GemType.Speed
                else if (type2 == "wealth") type = GemType.Wealth
                else if (type2 == "astra") type = GemType.Astra
                else if (type2 == "puff") type = GemType.Puff
                else if (type2 == "flux") type = GemType.Flux
                else if (type2 == "gold") type = GemType.Gold
            } else if (gem.getItemMeta().getDisplayName()
                    .contains(Common.colorize("#FE04B4") + ChatColor.BOLD + "Life " + Common.colorize("#FFD773") + "Gem") || gem.getItemMeta()
                    .getDisplayName()
                    .contains(Common.colorize("#FE04B4") + ChatColor.BOLD + "Life " + Common.colorize("#C7C7C7") + "Gem")
            ) type = GemType.Life
            else if (gem.getItemMeta().getDisplayName()
                    .contains(Common.colorize("#F10303") + "Strength " + Common.colorize("#FFD773") + "Gem") || gem.getItemMeta()
                    .getDisplayName()
                    .contains(Common.colorize("#F10303") + ChatColor.BOLD + "Strength " + Common.colorize("#C7C7C7") + "Gem")
            ) type = GemType.Strength
            else if (gem.getItemMeta().getDisplayName()
                    .contains(Common.colorize("#FE8120") + ChatColor.BOLD + "Fire " + Common.colorize("#FFD773") + "Gem") || gem.getItemMeta()
                    .getDisplayName()
                    .contains(Common.colorize("#FE8120") + ChatColor.BOLD + "Fire " + Common.colorize("#C7C7C7") + "Gem")
            ) type = GemType.Fire
            else if (gem.getItemMeta().getDisplayName()
                    .contains(Common.colorize("#FEFD17") + ChatColor.BOLD + "Speed " + Common.colorize("#FFD773") + "Gem") || gem.getItemMeta()
                    .getDisplayName()
                    .contains(Common.colorize("#FEFD17") + ChatColor.BOLD + "Speed " + Common.colorize("#C7C7C7") + "Gem")
            ) type = GemType.Speed
            else if (gem.getItemMeta().getDisplayName()
                    .contains(Common.colorize("#0EC912") + ChatColor.BOLD + "Wealth " + Common.colorize("#FFD773") + "Gem") || gem.getItemMeta()
                    .getDisplayName()
                    .contains(Common.colorize("#0EC912") + ChatColor.BOLD + "Wealth " + Common.colorize("#C7C7C7") + "Gem")
            ) type = GemType.Wealth
            else if (gem.getItemMeta().getDisplayName()
                    .contains(ChatColor.WHITE.toString() + "" + ChatColor.BOLD + "Puff Gem")
            ) type = GemType.Puff
            return type
        }

        /**
         * Checks if the player has a gem.
         */
        @JvmStatic
        fun hasAGem(p: Player): Boolean {
            for (item in p.getInventory().getContents()) if (!Objects.isNull(item) && isGem(item)) return true
            return false
        }

        /**
         * Returns the player's energy.
         */
        @JvmStatic
        fun getPlayerEnergy(p: Player): Energy? {
            for (item in p.getInventory()
                .getContents()) if (!Objects.isNull(item) && isGem(item)) return Companion.getGemEnergy(
                item!!
            )
            return Energy.N_A
        }

        /**
         * Returns the type of the first gem inside the player's inventory. If it returns null, it means the player doesn't have a gem.
         */
        @JvmStatic
        fun getPlayerGemType(p: Player): GemType? {
            for (item in p.getInventory()
                .getContents()) if (!Objects.isNull(item) && isGem(item)) return Companion.getGemType(
                item!!
            )
            return null
        }

        /**
         * Returns the first gem inside the player's inventory. If it returns null, it means the player doesn't have a gem.
         */
        @JvmStatic
        fun getPlayerGemItem(p: Player): ItemStack? {
            for (item in p.getInventory().getContents()) if (!Objects.isNull(item) && isGem(item)) return item
            Common.log(ChatColor.RED.toString() + p.getName() + " doesn't have a gem!")
            return null
        }

        /**
         * Returns the first gem inside the player's inventory. If it returns null, it means the player doesn't have a gem.
         */
        @JvmStatic
        fun getPlayerGem(p: Player): Gem {
            return Companion.fromGemItem(getPlayerGemItem(p)!!)
        }

        @JvmStatic
        fun isGem(gem: ItemStack?): Boolean {
            val idkeys2 = NamespacedKey(instance!!, "gem-id")
            if (Objects.isNull(gem)) return false
            if (!gem!!.hasItemMeta()) return false
            if (!gem.getItemMeta().getPersistentDataContainer()
                    .has<String?, String?>(idkeys2, PersistentDataType.STRING)
            ) {
                val idkeys1 = NamespacedKey(instance!!, "shard_id")
                return gem.getItemMeta().getPersistentDataContainer()
                    .has<String?, String?>(idkeys1, PersistentDataType.STRING)
            }
            return true
        }
    }
}
