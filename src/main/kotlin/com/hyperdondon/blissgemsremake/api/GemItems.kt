package com.hyperdondon.blissgemsremake.api

import com.hyperdondon.blissgemsremake.BlissGems.Companion.colorize
import com.hyperdondon.blissgemsremake.BlissGems.Companion.instance
import com.hyperdondon.blissgemsremake.internal.VersionChecker.OlderThanNBTChange
import net.md_5.bungee.api.ChatColor
import org.bukkit.Material
import org.bukkit.NamespacedKey
import org.bukkit.inventory.ItemFlag
import org.bukkit.inventory.ItemStack
import org.bukkit.persistence.PersistentDataType
import org.mineacademy.fo.remain.CompEnchantment
import org.mineacademy.fo.remain.CompItemFlag
import java.util.*

object GemItems {
    @JvmStatic
    fun getGemItem(
        gem: GemType?,
        tier: Int,
        energy: Energy?,
        quicknodrop: Int,
        quicknoremove: Int,
        season: Int
    ): ItemStack? {
        //Energy


        var energystage = ""

        if (season != 1) if (energy == Energy.Pristine_5) energystage = (colorize("#57FFC7") + "Pristine"
                + ChatColor.WHITE + " + "
                + colorize("#96FFD9") + "5")
        else if (energy == Energy.Pristine_4) energystage = (colorize("#57FFC7") + "Pristine"
                + ChatColor.WHITE + " + "
                + colorize("#96FFD9") + "4")
        else if (energy == Energy.Pristine_3) energystage = (colorize("#57FFC7") + "Pristine"
                + ChatColor.WHITE + " + "
                + colorize("#96FFD9") + "3")
        else if (energy == Energy.Pristine_2) energystage = (colorize("#57FFC7") + "Pristine"
                + ChatColor.WHITE + " + "
                + colorize("#96FFD9") + "2")
        else if (energy == Energy.Pristine_1) energystage = (colorize("#57FFC7") + "Pristine"
                + ChatColor.WHITE + " + "
                + colorize("#96FFD9") + "1")
        else if (energy == Energy.Pristine || energy == Energy.N_A) energystage = colorize("#57FFC7") + "Pristine"
        else if (energy == Energy.Scratched) energystage = colorize("#57FF8F") + "Scratched"
        else if (energy == Energy.Cracked) energystage = colorize("#7958DB") + "Cracked"
        else if (energy == Energy.Damaged) energystage = colorize("#FFC929") + "Damaged"
        else if (energy == Energy.Ruined) energystage = colorize("#FF1111") + "Ruined"
        else if (energy == Energy.Broken) energystage = ChatColor.WHITE.toString() + "" + ChatColor.BOLD + "ᴜsᴇʟᴇss"
        else energystage = ChatColor.WHITE.toString() + "" + ChatColor.BOLD + "ᴜsᴇʟᴇss"


        //Strength
        if (tier == 2) {
            if (gem == GemType.Strength) {
                if (season == 1) {
                    val item = ItemStack(Material.PRISMARINE_SHARD, 1)
                    val itemMeta = item.getItemMeta()


                    val idkey = NamespacedKey(instance!!, "shard_id")
                    itemMeta.getPersistentDataContainer()
                        .set<String?, String?>(idkey, PersistentDataType.STRING, UUID.randomUUID().toString())
                    itemMeta.setDisplayName(colorize("#F10303") + "Strength " + colorize("#FFD773") + "Gem")

                    // Set HideFlags to 127 if server is lower than 1.20.6, if yes: then hide all flags.
                    // due to the nbt change, it is not possible to make everything 1-1 for people using 1.20.6 and higher.
                    if (OlderThanNBTChange()) {
                        CompItemFlag.HIDE_ENCHANTS.applyTo(item)
                        CompItemFlag.HIDE_ATTRIBUTES.applyTo(item)
                        CompItemFlag.HIDE_UNBREAKABLE.applyTo(item)
                        CompItemFlag.HIDE_DESTROYS.applyTo(item)
                        CompItemFlag.HIDE_PLACED_ON.applyTo(item)
                        CompItemFlag.HIDE_POTION_EFFECTS.applyTo(item)
                        CompItemFlag.HIDE_DYE.applyTo(item)
                    } else for (flag in ItemFlag.entries) itemMeta.addItemFlags(flag)

                    itemMeta.setCustomModelData(10)
                    itemMeta.setLore(
                        Arrays.asList<String?>(
                            ChatColor.WHITE.toString() + "" + ChatColor.BOLD + "Have the strength of 5 men",
                            colorize("#FFE4AB") + "Passives",
                            ChatColor.GRAY.toString() + " " + colorize("#F10303") + "🔮 " + ChatColor.GRAY + "Strength 2, Auto enchants all",
                            ChatColor.GRAY.toString() + " swords and axes with sharpness 5",
                            ChatColor.WHITE.toString() + " ",
                            colorize("#B8FFFB") + ChatColor.BOLD + "Powers",
                            ChatColor.GRAY.toString() + "-" + ChatColor.WHITE + "\uD83E\uDD3A " + colorize("#B5B5B5") + ChatColor.BOLD + "Frailer",
                            ChatColor.GRAY.toString() + " " + ChatColor.DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB " + ChatColor.GRAY + "Clears potion effects",
                            ChatColor.GRAY.toString() + " gives weakness 1 for 20 seconds",
                            ChatColor.GRAY.toString() + " " + ChatColor.DARK_RED + "\uD83E\uDD3C " + ChatColor.GRAY + " Clears potion effects",
                            ChatColor.GRAY.toString() + " and gives withering, " + ChatColor.WHITE + "40s, R5",
                            ChatColor.WHITE.toString() + " ",
                            ChatColor.GRAY.toString() + "-" + ChatColor.WHITE + "⚔" + colorize("#910D0D") + " Chad Strength " + ChatColor.WHITE + "R4 40s",
                            ChatColor.GRAY.toString() + " " + ChatColor.GREEN + "\uD83E\uDDD1\uD83C\uDFFB " + ChatColor.GRAY + "Every 3 crits charges a hit that deals 2x the dmg",
                            ChatColor.GRAY.toString() + " " + ChatColor.GREEN + "\uD83E\uDD3C " + ChatColor.GRAY + "Every 8 crits charges a hit that deals 2x the dmg"
                        )
                    )

                    item.setItemMeta(itemMeta)
                    return item
                }


                if (season == 2) {
                    val item = ItemStack(Material.PRISMARINE_SHARD, 1)
                    val itemMeta = item.getItemMeta()


                    val idkey = NamespacedKey(instance!!, "gem-id")
                    itemMeta.getPersistentDataContainer()
                        .set<String?, String?>(idkey, PersistentDataType.STRING, UUID.randomUUID().toString())

                    val tierkey = NamespacedKey(instance!!, "gem-tier")
                    itemMeta.getPersistentDataContainer().set<Int?, Int?>(tierkey, PersistentDataType.INTEGER, tier)

                    val typekey = NamespacedKey(instance!!, "gem-type")
                    itemMeta.getPersistentDataContainer()
                        .set<String?, String?>(typekey, PersistentDataType.STRING, "strength")

                    val quicknodropkey = NamespacedKey(instance!!, "quick-no-drop")
                    itemMeta.getPersistentDataContainer()
                        .set<Int?, Int?>(quicknodropkey, PersistentDataType.INTEGER, quicknodrop)

                    val quicknoremovekey = NamespacedKey(instance!!, "quick-no-remove")
                    itemMeta.getPersistentDataContainer()
                        .set<Int?, Int?>(quicknoremovekey, PersistentDataType.INTEGER, quicknoremove)


                    itemMeta.setDisplayName(colorize("#F10303") + ChatColor.BOLD + "sᴛʀᴇɴɢᴛʜ " + colorize("#FFD773") + "ɢᴇᴍ")
                    for (flag in ItemFlag.entries) itemMeta.addItemFlags(flag)
                    if (Gem.Companion.isPristineorHigher(energy)) {
                        if (energy == Energy.Pristine_5) itemMeta.addEnchant(CompEnchantment.DURABILITY, 1, true)

                        itemMeta.setCustomModelData(10)
                        itemMeta.setLore(
                            Arrays.asList<String?>(
                                ChatColor.WHITE.toString() + "" + ChatColor.BOLD + "ʜᴀᴠᴇ ᴛʜᴇ sᴛʀᴇɴɢᴛʜ ᴏғ ᴀ ᴀʀᴍʏ",
                                colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                energystage,
                                ChatColor.GRAY.toString() + " " + colorize("#F10303") + "🔮 " + ChatColor.GRAY + "Strength 2,",
                                ChatColor.GRAY.toString() + " Auto enchants sharpness 5",
                                ChatColor.GRAY.toString() + " BloodThorns, deal more damage the",
                                ChatColor.GRAY.toString() + " lower in health you are ",
                                ChatColor.GRAY.toString() + " ",
                                colorize("#B8FFFB") + ChatColor.BOLD + "ᴘᴏᴡᴇʀs",
                                ChatColor.GRAY.toString() + "-" + ChatColor.WHITE + "\uD83E\uDD3A " + colorize("#B5B5B5") + ChatColor.BOLD + "ғʀᴀɪʟᴇʀ",
                                ChatColor.GRAY.toString() + " " + ChatColor.DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB " + ChatColor.GRAY + "Clears potion effects",
                                ChatColor.GRAY.toString() + " gives weakness 1 for 20 seconds",
                                ChatColor.GRAY.toString() + " " + ChatColor.DARK_RED + "\uD83E\uDD3C " + ChatColor.GRAY + " Clears potion effects",
                                ChatColor.GRAY.toString() + " and gives withering, " + ChatColor.WHITE + "40s, R5",
                                ChatColor.WHITE.toString() + "",
                                ChatColor.GRAY.toString() + "-" + ChatColor.WHITE + "⚔" + colorize("#910D0D") + " ᴄʜᴀᴅ sᴛʀᴇɴɢᴛʜ " + ChatColor.WHITE + "R4 40s",
                                ChatColor.GRAY.toString() + " " + ChatColor.GREEN + "\uD83E\uDDD1\uD83C\uDFFB " + ChatColor.GRAY + "Every 3 crits charges a hit that deals 2x the dmg",
                                ChatColor.GRAY.toString() + " " + ChatColor.GREEN + "\uD83E\uDD3C " + ChatColor.GRAY + "Every 8 crits charges a hit that deals 2x the dmg"
                            )
                        )
                    }

                    if (energy == Energy.Scratched) {
                        itemMeta.setCustomModelData(30)
                        itemMeta.setLore(
                            Arrays.asList<String?>(
                                ChatColor.WHITE.toString() + "" + ChatColor.BOLD + "ʜᴀᴠᴇ ᴛʜᴇ sᴛʀᴇɴɢᴛʜ ᴏғ ᴀ ᴀʀᴍʏ",
                                colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                energystage,
                                ChatColor.GRAY.toString() + " " + colorize("#F10303") + "🔮 " + ChatColor.GRAY + "Strength 2,",
                                ChatColor.GRAY.toString() + " Auto enchants sharpness 4",
                                ChatColor.GRAY.toString() + " BloodThorns, deal more damage the",
                                ChatColor.GRAY.toString() + " lower in health you are",
                                ChatColor.GRAY.toString() + " ",
                                colorize("#B8FFFB") + ChatColor.BOLD + "ᴘᴏᴡᴇʀs",
                                ChatColor.GRAY.toString() + "-" + ChatColor.WHITE + "\uD83E\uDD3A " + colorize("#B5B5B5") + ChatColor.BOLD + "ғʀᴀɪʟᴇʀ",
                                ChatColor.GRAY.toString() + " " + ChatColor.DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB " + ChatColor.GRAY + "Clears potion effects",
                                ChatColor.GRAY.toString() + " gives weakness 1 for 20 seconds",
                                ChatColor.GRAY.toString() + " " + ChatColor.DARK_RED + "\uD83E\uDD3C " + ChatColor.GRAY + " Clears potion effects",
                                ChatColor.GRAY.toString() + " and gives withering, " + ChatColor.WHITE + "40s, R5",
                                ChatColor.WHITE.toString() + "",
                                ChatColor.GRAY.toString() + "-" + ChatColor.WHITE + "⚔" + colorize("#910D0D") + " ᴄʜᴀᴅ sᴛʀᴇɴɢᴛʜ " + ChatColor.WHITE + "R4 40s",
                                ChatColor.GRAY.toString() + " " + ChatColor.GREEN + "\uD83E\uDDD1\uD83C\uDFFB " + ChatColor.GRAY + "Every 3 crits charges a hit that deals 2x the dmg",
                                ChatColor.GRAY.toString() + " " + ChatColor.GREEN + "\uD83E\uDD3C " + ChatColor.GRAY + "Every 8 crits charges a hit that deals 2x the dmg"
                            )
                        )
                    }

                    if (energy == Energy.Cracked) {
                        itemMeta.setCustomModelData(50)
                        itemMeta.setLore(
                            Arrays.asList<String?>(
                                ChatColor.WHITE.toString() + "" + ChatColor.BOLD + "ʜᴀᴠᴇ ᴛʜᴇ sᴛʀᴇɴɢᴛʜ ᴏғ ᴀ ᴀʀᴍʏ",
                                colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                energystage,
                                ChatColor.GRAY.toString() + " " + colorize("#F10303") + "🔮 " + ChatColor.GRAY + "Strength 2,",
                                ChatColor.GRAY.toString() + " Auto enchants sharpness 3",
                                ChatColor.GRAY.toString() + " ",
                                colorize("#B8FFFB") + ChatColor.BOLD + "ᴘᴏᴡᴇʀs",
                                ChatColor.GRAY.toString() + "-" + ChatColor.WHITE + "\uD83E\uDD3A " + colorize("#B5B5B5") + ChatColor.BOLD + "ғʀᴀɪʟᴇʀ",
                                ChatColor.GRAY.toString() + " " + ChatColor.DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB " + ChatColor.GRAY + "Clears potion effects",
                                ChatColor.GRAY.toString() + " gives weakness 1 for 20 seconds",
                                ChatColor.GRAY.toString() + " " + ChatColor.DARK_RED + "\uD83E\uDD3C " + ChatColor.GRAY + " Clears potion effects",
                                ChatColor.GRAY.toString() + " and gives withering, " + ChatColor.WHITE + "40s, R5",
                                ChatColor.WHITE.toString() + "",
                                ChatColor.GRAY.toString() + "-" + ChatColor.WHITE + "⚔" + colorize("#910D0D") + " ᴄʜᴀᴅ sᴛʀᴇɴɢᴛʜ " + ChatColor.WHITE + "R4 40s",
                                ChatColor.GRAY.toString() + " " + ChatColor.GREEN + "\uD83E\uDDD1\uD83C\uDFFB " + ChatColor.GRAY + "Every 3 crits charges a hit that deals 2x the dmg",
                                ChatColor.GRAY.toString() + " " + ChatColor.GREEN + "\uD83E\uDD3C " + ChatColor.GRAY + "Every 8 crits charges a hit that deals 2x the dmg"
                            )
                        )
                    }

                    if (energy == Energy.Damaged) {
                        itemMeta.setCustomModelData(70)
                        itemMeta.setLore(
                            Arrays.asList<String?>(
                                ChatColor.WHITE.toString() + "" + ChatColor.BOLD + "ʜᴀᴠᴇ ᴛʜᴇ sᴛʀᴇɴɢᴛʜ ᴏғ ᴀ ᴀʀᴍʏ",
                                colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                energystage,
                                ChatColor.GRAY.toString() + " " + colorize("#F10303") + "🔮 " + ChatColor.GRAY + "Auto enchants sharpness 2",
                                ChatColor.WHITE.toString() + " ",
                                colorize("#B8FFFB") + ChatColor.BOLD + "ᴘᴏᴡᴇʀs",
                                ChatColor.GRAY.toString() + "-" + ChatColor.WHITE + "\uD83E\uDD3A " + colorize("#B5B5B5") + ChatColor.BOLD + "ғʀᴀɪʟᴇʀ",
                                ChatColor.GRAY.toString() + " " + ChatColor.DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB " + ChatColor.GRAY + "Clears potion effects",
                                ChatColor.GRAY.toString() + " gives weakness 1 for 20 seconds",
                                ChatColor.GRAY.toString() + " " + ChatColor.DARK_RED + "\uD83E\uDD3C " + ChatColor.GRAY + " Clears potion effects",
                                ChatColor.GRAY.toString() + " and gives withering, " + ChatColor.WHITE + "40s, R5",
                                ChatColor.WHITE.toString() + "",
                                ChatColor.GRAY.toString() + "-" + ChatColor.WHITE + "⚔" + colorize("#910D0D") + " ᴄʜᴀᴅ sᴛʀᴇɴɢᴛʜ " + ChatColor.WHITE + "R4 40s",
                                ChatColor.GRAY.toString() + " " + ChatColor.GREEN + "\uD83E\uDDD1\uD83C\uDFFB " + ChatColor.GRAY + "Every 3 crits charges a hit that deals 2x the dmg",
                                ChatColor.GRAY.toString() + " " + ChatColor.GREEN + "\uD83E\uDD3C " + ChatColor.GRAY + "Every 8 crits charges a hit that deals 2x the dmg"
                            )
                        )
                    }

                    if (energy == Energy.Ruined) {
                        itemMeta.setCustomModelData(90)
                        itemMeta.setLore(
                            Arrays.asList<String?>(
                                ChatColor.WHITE.toString() + "" + ChatColor.BOLD + "ʜᴀᴠᴇ ᴛʜᴇ sᴛʀᴇɴɢᴛʜ ᴏғ ᴀ ᴀʀᴍʏ",
                                colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                energystage,
                                ChatColor.GRAY.toString() + " " + colorize("#F10303") + "🔮 " + ChatColor.GRAY + "No passives",
                                ChatColor.WHITE.toString() + " ",
                                colorize("#B8FFFB") + ChatColor.BOLD + "ᴘᴏᴡᴇʀs",
                                ChatColor.GRAY.toString() + "-" + ChatColor.WHITE + "\uD83E\uDD3A " + colorize("#B5B5B5") + ChatColor.BOLD + "ғʀᴀɪʟᴇʀ",
                                ChatColor.GRAY.toString() + " " + ChatColor.DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB " + ChatColor.GRAY + "Clears potion effects",
                                ChatColor.GRAY.toString() + " gives weakness 1 for 20 seconds",
                                ChatColor.GRAY.toString() + " " + ChatColor.DARK_RED + "\uD83E\uDD3C " + ChatColor.GRAY + " Clears potion effects",
                                ChatColor.GRAY.toString() + " and gives withering, " + ChatColor.WHITE + "40s, R5",
                                ChatColor.WHITE.toString() + "",
                                ChatColor.GRAY.toString() + "-" + ChatColor.WHITE + "⚔" + colorize("#910D0D") + " ᴄʜᴀᴅ sᴛʀᴇɴɢᴛʜ " + ChatColor.WHITE + "R4 40s",
                                ChatColor.GRAY.toString() + " " + ChatColor.GREEN + "\uD83E\uDDD1\uD83C\uDFFB " + ChatColor.GRAY + "Every 3 crits charges a hit that deals 2x the dmg",
                                ChatColor.GRAY.toString() + " " + ChatColor.GREEN + "\uD83E\uDD3C " + ChatColor.GRAY + "Every 8 crits charges a hit that deals 2x the dmg"
                            )
                        )
                    }


                    if (energy == Energy.Broken) {
                        itemMeta.setCustomModelData(96)
                        itemMeta.setLore(
                            Arrays.asList<String?>(
                                ChatColor.WHITE.toString() + "" + ChatColor.BOLD + "ᴜsᴇʟᴇss"
                            )
                        )
                    }
                    item.setItemMeta(itemMeta)
                    return item
                }
                if (season == 3) {
                    val item = ItemStack(Material.PRISMARINE_SHARD, 1)
                    val itemMeta = item.getItemMeta()


                    val idkey = NamespacedKey(instance!!, "gem-id")
                    itemMeta.getPersistentDataContainer()
                        .set<String?, String?>(idkey, PersistentDataType.STRING, "9f969b5e-8b9a-4dd5-b5bc-9a23774721b4")

                    val tierkey = NamespacedKey(instance!!, "gem-tier")
                    itemMeta.getPersistentDataContainer().set<Int?, Int?>(tierkey, PersistentDataType.INTEGER, tier)

                    val typekey = NamespacedKey(instance!!, "gem-type")
                    itemMeta.getPersistentDataContainer()
                        .set<String?, String?>(typekey, PersistentDataType.STRING, "strength")

                    val quicknodropkey = NamespacedKey(instance!!, "quick-no-drop")
                    itemMeta.getPersistentDataContainer()
                        .set<Int?, Int?>(quicknodropkey, PersistentDataType.INTEGER, quicknodrop)

                    val quicknoremovekey = NamespacedKey(instance!!, "quick-no-remove")
                    itemMeta.getPersistentDataContainer()
                        .set<Int?, Int?>(quicknoremovekey, PersistentDataType.INTEGER, quicknoremove)


                    for (flag in ItemFlag.entries) itemMeta.addItemFlags(flag)

                    itemMeta.setDisplayName(colorize("#F10303") + ChatColor.BOLD + "sᴛʀᴇɴɢᴛʜ " + colorize("#FFD773") + "ɢᴇᴍ")
                    if (Gem.Companion.isPristineorHigher(energy)) {
                        if (energy == Energy.Pristine_5) itemMeta.addEnchant(CompEnchantment.DURABILITY, 1, true)

                        itemMeta.setCustomModelData(10)

                        var ending = colorize("&f)")
                        if (energy == Energy.Pristine_1 || energy == Energy.Pristine_2 || energy == Energy.Pristine_3 || energy == Energy.Pristine_4 || energy == Energy.Pristine_5) ending =
                            ")"

                        itemMeta.setLore(
                            Arrays.asList<String?>(
                                ChatColor.WHITE.toString() + "" + ChatColor.BOLD + "ʜᴀᴠᴇ ᴛʜᴇ sᴛʀᴇɴɢᴛʜ ᴏғ ᴀ ᴀʀᴍʏ",
                                colorize("&f(") + energystage + ending,
                                ChatColor.WHITE.toString() + " ",
                                colorize("#F10303") + "🔮" + " " + colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                ChatColor.GRAY.toString() + "- " + ChatColor.GRAY + "Strength",
                                ChatColor.GRAY.toString() + "- Enchants Sharpness",
                                ChatColor.WHITE.toString() + " ",
                                colorize("#F10303") + "🔮" + " " + colorize("#82F3FF") + ChatColor.BOLD + "ᴀʙɪʟɪᴛʏ",
                                ChatColor.GRAY.toString() + "- " + colorize("#F10303") + "Bounty Hunter",
                                ChatColor.WHITE.toString() + " ",
                                colorize("#F10303") + "🔮 " + colorize("#B8FFFB") + ChatColor.BOLD + "ᴘᴏᴡᴇʀs",
                                ChatColor.GRAY.toString() + "- " + ChatColor.WHITE + "\uD83E\uDD3A " + colorize("#B5B5B5") + "ғʀᴀɪʟᴇʀ " + ChatColor.DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                                ChatColor.GRAY.toString() + "- " + ChatColor.WHITE + "\uD83E\uDD3A " + colorize("#B5B5B5") + "ɴᴜʟʟɪғʏ " + ChatColor.DARK_RED + "\uD83E\uDD3C",
                                ChatColor.WHITE.toString() + "",
                                ChatColor.GRAY.toString() + "- " + ChatColor.WHITE + "⚔" + colorize("#910D0D") + " ᴄʜᴀᴅ sᴛʀᴇɴɢᴛʜ " + ChatColor.GREEN + "\uD83E\uDDD1\uD83C\uDFFB",
                                ChatColor.GRAY.toString() + "- " + ChatColor.WHITE + "⚔" + colorize("#910D0D") + " ᴄʜᴀᴅ sᴛʀᴇɴɢᴛʜ " + ChatColor.GREEN + "\uD83E\uDD3C"
                            )
                        )
                    }


                    if (energy == Energy.Scratched) {
                        itemMeta.setCustomModelData(30)
                        itemMeta.setLore(
                            Arrays.asList<String?>(
                                ChatColor.WHITE.toString() + "" + ChatColor.BOLD + "ʜᴀᴠᴇ ᴛʜᴇ sᴛʀᴇɴɢᴛʜ ᴏғ ᴀ ᴀʀᴍʏ",
                                colorize("&f(") + energystage + colorize("&f)"),
                                ChatColor.WHITE.toString() + " ",
                                colorize("#F10303") + "🔮" + " " + colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                ChatColor.GRAY.toString() + "- " + ChatColor.GRAY + "Strength",
                                ChatColor.GRAY.toString() + "- Enchants Sharpness",
                                ChatColor.GRAY.toString() + "- " + ChatColor.GRAY + "Bloodthorns",
                                ChatColor.WHITE.toString() + " ",
                                colorize("#F10303") + "🔮" + " " + colorize("#82F3FF") + ChatColor.BOLD + "ᴀʙɪʟɪᴛʏ",
                                ChatColor.GRAY.toString() + "- " + colorize("#F10303") + "Bounty Hunter",
                                ChatColor.WHITE.toString() + " ",
                                colorize("#F10303") + "🔮 " + colorize("#B8FFFB") + ChatColor.BOLD + "ᴘᴏᴡᴇʀs",
                                ChatColor.GRAY.toString() + "- " + ChatColor.WHITE + "\uD83E\uDD3A " + colorize("#B5B5B5") + "ғʀᴀɪʟᴇʀ " + ChatColor.DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                                ChatColor.GRAY.toString() + "- " + ChatColor.WHITE + "\uD83E\uDD3A " + colorize("#B5B5B5") + "ɴᴜʟʟɪғʏ " + ChatColor.DARK_RED + "\uD83E\uDD3C",
                                ChatColor.WHITE.toString() + "",
                                ChatColor.GRAY.toString() + "- " + ChatColor.WHITE + "⚔" + colorize("#910D0D") + " ᴄʜᴀᴅ sᴛʀᴇɴɢᴛʜ " + ChatColor.GREEN + "\uD83E\uDDD1\uD83C\uDFFB",
                                ChatColor.GRAY.toString() + "- " + ChatColor.WHITE + "⚔" + colorize("#910D0D") + " ᴄʜᴀᴅ sᴛʀᴇɴɢᴛʜ " + ChatColor.GREEN + "\uD83E\uDD3C"
                            )
                        )
                    }

                    if (energy == Energy.Cracked) {
                        itemMeta.setCustomModelData(50)

                        itemMeta.setLore(
                            Arrays.asList<String?>(
                                ChatColor.WHITE.toString() + "" + ChatColor.BOLD + "ʜᴀᴠᴇ ᴛʜᴇ sᴛʀᴇɴɢᴛʜ ᴏғ ᴀ ᴀʀᴍʏ",
                                colorize("&f(") + energystage + colorize("&f)"),
                                ChatColor.WHITE.toString() + " ",
                                colorize("#F10303") + "🔮" + " " + colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                ChatColor.GRAY.toString() + "- " + ChatColor.GRAY + "Strength",
                                ChatColor.GRAY.toString() + "- Enchants Sharpness",
                                ChatColor.WHITE.toString() + " ",
                                colorize("#F10303") + "🔮" + " " + colorize("#82F3FF") + ChatColor.BOLD + "ᴀʙɪʟɪᴛʏ",
                                ChatColor.GRAY.toString() + "- " + colorize("#F10303") + "Bounty Hunter",
                                ChatColor.WHITE.toString() + " ",
                                colorize("#F10303") + "🔮 " + colorize("#B8FFFB") + ChatColor.BOLD + "ᴘᴏᴡᴇʀs",
                                ChatColor.GRAY.toString() + "- " + ChatColor.WHITE + "\uD83E\uDD3A " + colorize("#B5B5B5") + "ғʀᴀɪʟᴇʀ " + ChatColor.DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                                ChatColor.GRAY.toString() + "- " + ChatColor.WHITE + "\uD83E\uDD3A " + colorize("#B5B5B5") + "ɴᴜʟʟɪғʏ " + ChatColor.DARK_RED + "\uD83E\uDD3C",
                                ChatColor.WHITE.toString() + "",
                                ChatColor.GRAY.toString() + "- " + ChatColor.WHITE + "⚔" + colorize("#910D0D") + " ᴄʜᴀᴅ sᴛʀᴇɴɢᴛʜ " + ChatColor.GREEN + "\uD83E\uDDD1\uD83C\uDFFB",
                                ChatColor.GRAY.toString() + "- " + ChatColor.WHITE + "⚔" + colorize("#910D0D") + " ᴄʜᴀᴅ sᴛʀᴇɴɢᴛʜ " + ChatColor.GREEN + "\uD83E\uDD3C"
                            )
                        )
                    }


                    if (energy == Energy.Damaged) {
                        itemMeta.setCustomModelData(70)

                        itemMeta.setLore(
                            Arrays.asList<String?>(
                                ChatColor.WHITE.toString() + "" + ChatColor.BOLD + "ʜᴀᴠᴇ ᴛʜᴇ sᴛʀᴇɴɢᴛʜ ᴏғ ᴀ ᴀʀᴍʏ",
                                colorize("&f(") + energystage + colorize("&f)"),
                                ChatColor.WHITE.toString() + " ",
                                colorize("#F10303") + "🔮" + " " + colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                ChatColor.GRAY.toString() + "- " + ChatColor.GRAY + "Strength",
                                ChatColor.GRAY.toString() + "- Enchants Sharpness",
                                ChatColor.WHITE.toString() + " ",
                                colorize("#F10303") + "🔮" + " " + colorize("#82F3FF") + ChatColor.BOLD + "ᴀʙɪʟɪᴛʏ",
                                ChatColor.GRAY.toString() + "- " + colorize("#F10303") + "Bounty Hunter",
                                ChatColor.WHITE.toString() + " ",
                                colorize("#F10303") + "🔮 " + colorize("#B8FFFB") + ChatColor.BOLD + "ᴘᴏᴡᴇʀs",
                                ChatColor.GRAY.toString() + "- " + ChatColor.WHITE + "\uD83E\uDD3A " + colorize("#B5B5B5") + "ғʀᴀɪʟᴇʀ " + ChatColor.DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                                ChatColor.GRAY.toString() + "- " + ChatColor.WHITE + "\uD83E\uDD3A " + colorize("#B5B5B5") + "ɴᴜʟʟɪғʏ " + ChatColor.DARK_RED + "\uD83E\uDD3C",
                                ChatColor.WHITE.toString() + "",
                                ChatColor.GRAY.toString() + "- " + ChatColor.WHITE + "⚔" + colorize("#910D0D") + " ᴄʜᴀᴅ sᴛʀᴇɴɢᴛʜ " + ChatColor.GREEN + "\uD83E\uDDD1\uD83C\uDFFB",
                                ChatColor.GRAY.toString() + "- " + ChatColor.WHITE + "⚔" + colorize("#910D0D") + " ᴄʜᴀᴅ sᴛʀᴇɴɢᴛʜ " + ChatColor.GREEN + "\uD83E\uDD3C"
                            )
                        )
                    }

                    if (energy == Energy.Ruined) {
                        itemMeta.setCustomModelData(90)

                        itemMeta.setLore(
                            Arrays.asList<String?>(
                                ChatColor.WHITE.toString() + "" + ChatColor.BOLD + "ʜᴀᴠᴇ ᴛʜᴇ sᴛʀᴇɴɢᴛʜ ᴏғ ᴀ ᴀʀᴍʏ",
                                colorize("&f(") + energystage + colorize("&f)"),
                                ChatColor.WHITE.toString() + " ",
                                colorize("#F10303") + "🔮" + " " + colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                ChatColor.GRAY.toString() + "No Passives",
                                ChatColor.WHITE.toString() + " ",
                                colorize("#F10303") + "🔮" + " " + colorize("#82F3FF") + ChatColor.BOLD + "ᴀʙɪʟɪᴛʏ",
                                ChatColor.GRAY.toString() + "- " + colorize("#F10303") + "Bounty Hunter",
                                ChatColor.WHITE.toString() + " ",
                                colorize("#F10303") + "🔮 " + colorize("#B8FFFB") + ChatColor.BOLD + "ᴘᴏᴡᴇʀs",
                                ChatColor.GRAY.toString() + "- " + ChatColor.WHITE + "\uD83E\uDD3A " + colorize("#B5B5B5") + "ғʀᴀɪʟᴇʀ " + ChatColor.DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                                ChatColor.GRAY.toString() + "- " + ChatColor.WHITE + "\uD83E\uDD3A " + colorize("#B5B5B5") + "ɴᴜʟʟɪғʏ " + ChatColor.DARK_RED + "\uD83E\uDD3C",
                                ChatColor.WHITE.toString() + "",
                                ChatColor.GRAY.toString() + "- " + ChatColor.WHITE + "⚔" + colorize("#910D0D") + " ᴄʜᴀᴅ sᴛʀᴇɴɢᴛʜ " + ChatColor.GREEN + "\uD83E\uDDD1\uD83C\uDFFB",
                                ChatColor.GRAY.toString() + "- " + ChatColor.WHITE + "⚔" + colorize("#910D0D") + " ᴄʜᴀᴅ sᴛʀᴇɴɢᴛʜ " + ChatColor.GREEN + "\uD83E\uDD3C"
                            )
                        )
                    }


                    if (energy == Energy.Broken) {
                        itemMeta.setCustomModelData(100)
                        itemMeta.setLore(
                            Arrays.asList<String?>(
                                energystage
                            )
                        )
                    }
                    item.setItemMeta(itemMeta)
                    return item
                }
            }


            //Speed
            if (gem == GemType.Speed) {
                if (season == 1) {
                    val item = ItemStack(Material.PRISMARINE_SHARD, 1)
                    val itemMeta = item.getItemMeta()


                    val idkey = NamespacedKey(instance!!, "shard_id")
                    itemMeta.getPersistentDataContainer().set<String?, String?>(
                        idkey,
                        PersistentDataType.STRING,
                        UUID.randomUUID().toString().toString()
                    )

                    itemMeta.setDisplayName(colorize("#FEFD17") + ChatColor.BOLD + "Speed " + colorize("#FFD773") + "Gem")


                    // Set HideFlags to 127 if server is lower than 1.20.6, if yes: then hide all flags.
                    // due to the nbt change, it is not possible to make everything 1-1 for people using 1.20.6 and higher.
                    if (OlderThanNBTChange()) {
                        CompItemFlag.HIDE_ENCHANTS.applyTo(item)
                        CompItemFlag.HIDE_ATTRIBUTES.applyTo(item)
                        CompItemFlag.HIDE_UNBREAKABLE.applyTo(item)
                        CompItemFlag.HIDE_DESTROYS.applyTo(item)
                        CompItemFlag.HIDE_PLACED_ON.applyTo(item)
                        CompItemFlag.HIDE_POTION_EFFECTS.applyTo(item)
                        CompItemFlag.HIDE_DYE.applyTo(item)
                    } else for (flag in ItemFlag.entries) itemMeta.addItemFlags(flag)


                    itemMeta.setCustomModelData(8)
                    itemMeta.setLore(
                        Arrays.asList<String?>(
                            ChatColor.WHITE.toString() + "" + ChatColor.BOLD + "Feel the energy, the speed",
                            colorize("#FFE4AB") + "Passives",
                            ChatColor.GRAY.toString() + " " + colorize("#FEFD17") + "🔮 " + ChatColor.GRAY + "Speed 3, Dolphines Grace",
                            ChatColor.GRAY.toString() + " and immune to soul sand",
                            ChatColor.WHITE.toString() + " ",
                            colorize("#B8FFFB") + ChatColor.BOLD + "Powers",
                            ChatColor.GRAY.toString() + "- " + ChatColor.DARK_GRAY + "\uD83C\uDFAF" + ChatColor.WHITE + "Sloths Sedative",
                            ChatColor.GRAY.toString() + " " + ChatColor.DARK_RED + "\uD83E\uDD3C " + ChatColor.GRAY + "Slowness 2, mining fatigue 3",
                            ChatColor.GRAY.toString() + " Clears speed effects, 0.8x slower crits, " + ChatColor.WHITE + "30s, R4",
                            ChatColor.GRAY.toString() + " " + ChatColor.DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB" + ChatColor.GRAY + "Slowness 4, mining fatigue 3",
                            ChatColor.GRAY.toString() + " Clears speed effects, 0.5x slower crits, " + ChatColor.WHITE + "40s, R4",
                            ChatColor.WHITE.toString() + "",
                            ChatColor.GRAY.toString() + "-" + ChatColor.WHITE + "🌩 " + colorize("#61FFEA") + "Speedy Storm " + ChatColor.WHITE + "40s R4",
                            ChatColor.GREEN.toString() + " \uD83E\uDDD1\uD83C\uDFFB" + ChatColor.GRAY + "Spawns a Thunder Storm with lightning strikes",
                            ChatColor.GRAY.toString() + " the caster gets constant 1.5x faster crits while",
                            ChatColor.GRAY.toString() + " the storm is active and speed 3 while in the storm.",
                            ChatColor.GRAY.toString() + " Trusted get 1.3x faster crits and speed 3 in the storm",
                            ChatColor.GRAY.toString() + " If trusted or caster get struck by thunder they get",
                            ChatColor.GRAY.toString() + " Speed 6 and 2.2x faster crits, If untrusted is struck",
                            ChatColor.GRAY.toString() + " by thunder they are stunned for 2s",
                            ChatColor.GREEN.toString() + " \uD83E\uDD3C" + ChatColor.GRAY + "Gives trusted 1.5x faster crits and speed 3."
                        )
                    )

                    item.setItemMeta(itemMeta)
                    return item
                }


                if (season == 2) {
                    val item = ItemStack(Material.PRISMARINE_SHARD, 1)
                    val itemMeta = item.getItemMeta()


                    val idkey = NamespacedKey(instance!!, "gem-id")
                    itemMeta.getPersistentDataContainer()
                        .set<String?, String?>(idkey, PersistentDataType.STRING, UUID.randomUUID().toString())

                    val tierkey = NamespacedKey(instance!!, "gem-tier")
                    itemMeta.getPersistentDataContainer().set<Int?, Int?>(tierkey, PersistentDataType.INTEGER, tier)

                    val typekey = NamespacedKey(instance!!, "gem-type")
                    itemMeta.getPersistentDataContainer()
                        .set<String?, String?>(typekey, PersistentDataType.STRING, "speed")

                    val quicknodropkey = NamespacedKey(instance!!, "quick-no-drop")
                    itemMeta.getPersistentDataContainer()
                        .set<Int?, Int?>(quicknodropkey, PersistentDataType.INTEGER, quicknodrop)

                    val quicknoremovekey = NamespacedKey(instance!!, "quick-no-remove")
                    itemMeta.getPersistentDataContainer()
                        .set<Int?, Int?>(quicknoremovekey, PersistentDataType.INTEGER, quicknoremove)


                    itemMeta.setDisplayName(colorize("#FEFD17") + ChatColor.BOLD + "sᴘᴇᴇᴅ " + colorize("#FFD773") + "ɢᴇᴍ")
                    for (flag in ItemFlag.entries) itemMeta.addItemFlags(flag)

                    if (Gem.Companion.isPristineorHigher(energy)) {
                        if (energy == Energy.Pristine_5) itemMeta.addEnchant(CompEnchantment.DURABILITY, 1, true)
                        itemMeta.setCustomModelData(8)
                        itemMeta.setLore(
                            Arrays.asList<String?>(
                                ChatColor.WHITE.toString() + "" + ChatColor.BOLD + "ᴡᴀᴛᴄʜ ᴛʜᴇ ᴡᴏʀʟᴅ ᴀʀᴏᴜɴᴅ ʏᴏᴜ ᴛᴜʀɴ ɪɴᴛᴏ ᴀ ʙʟᴜʀ",
                                colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                energystage,
                                ChatColor.GRAY.toString() + " " + colorize("#FEFD17") + "🔮 " + ChatColor.GRAY + "Speed 3, Dolphins Grace",
                                ChatColor.GRAY.toString() + " and Immune to soul sand, auto-enchants efficiency 5",
                                ChatColor.WHITE.toString() + " ",
                                colorize("#B8FFFB") + ChatColor.BOLD + "ᴘᴏᴡᴇʀs",
                                ChatColor.GRAY.toString() + "- " + ChatColor.WHITE + "\uD83C\uDFAF" + ChatColor.WHITE + "sʟᴏᴛʜs sᴇᴅᴀᴛɪᴠᴇ",
                                ChatColor.GRAY.toString() + " " + ChatColor.DARK_RED + "\uD83E\uDD3C\uD83C\uDFFB" + ChatColor.GRAY + " Slowness 2, mining fatigue 3",
                                ChatColor.GRAY.toString() + " Clears speed effects, 0.8x slower crits, " + ChatColor.WHITE + "30s, R4",
                                ChatColor.GRAY.toString() + " " + ChatColor.DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB" + ChatColor.GRAY + "Slowness 4, mining fatigue 3",
                                ChatColor.GRAY.toString() + " Clears speed effect, 0.5x slower crits, " + ChatColor.WHITE + "40s, R4",
                                ChatColor.WHITE.toString() + "",
                                ChatColor.GRAY.toString() + "-" + ChatColor.WHITE + "🌩 " + colorize("#61FFEA") + "sᴘᴇᴇᴅʏ sᴛᴏʀᴍ " + ChatColor.WHITE + "40s R4",
                                ChatColor.GRAY.toString() + " " + ChatColor.GREEN + "\uD83E\uDDD1\uD83C\uDFFB" + ChatColor.GRAY + "Spawns a Thunder Storm with lightning strikes",
                                ChatColor.GRAY.toString() + " the caster gets constant 1.5x faster crits while",
                                ChatColor.GRAY.toString() + " the storm is active and speed 3 while in the storm.",
                                ChatColor.GRAY.toString() + " Trusted get 1.3x faster crits and speed 3 in the storm",
                                ChatColor.GRAY.toString() + " If trusted or caster get struck by thunder they get",
                                ChatColor.GRAY.toString() + " Speed 6 and 2.2x faster crits, If untrusted is struck",
                                ChatColor.GRAY.toString() + " by thunder they are stuned for 2s",
                                ChatColor.GRAY.toString() + " " + ChatColor.GREEN + "\uD83E\uDD3C" + ChatColor.GRAY + "Gives trusted 1.5x faster crits and speed 3."
                            )
                        )
                    }


                    if (energy == Energy.Scratched) {
                        itemMeta.setCustomModelData(28)
                        itemMeta.setLore(
                            Arrays.asList<String?>(
                                ChatColor.WHITE.toString() + "" + ChatColor.BOLD + "ᴡᴀᴛᴄʜ ᴛʜᴇ ᴡᴏʀʟᴅ ᴀʀᴏᴜɴᴅ ʏᴏᴜ ᴛᴜʀɴ ɪɴᴛᴏ ᴀ ʙʟᴜʀ",
                                colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                energystage,
                                ChatColor.GRAY.toString() + " " + colorize("#FEFD17") + "🔮 " + ChatColor.GRAY + "Speed 3, Immune to soul sand",
                                ChatColor.GRAY.toString() + " auto-enchants efficiency 4",
                                ChatColor.WHITE.toString() + " ",
                                colorize("#B8FFFB") + ChatColor.BOLD + "ᴘᴏᴡᴇʀs",
                                ChatColor.GRAY.toString() + "- " + ChatColor.WHITE + "\uD83C\uDFAF" + ChatColor.WHITE + "sʟᴏᴛʜs sᴇᴅᴀᴛɪᴠᴇ",
                                ChatColor.GRAY.toString() + " " + ChatColor.DARK_RED + "\uD83E\uDD3C\uD83C\uDFFB" + ChatColor.GRAY + " Slowness 2, mining fatigue 3",
                                ChatColor.GRAY.toString() + " Clears speed effects, 0.8x slower crits, " + ChatColor.WHITE + "30s, R4",
                                ChatColor.GRAY.toString() + " " + ChatColor.DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB" + ChatColor.GRAY + "Slowness 4, mining fatigue 3",
                                ChatColor.GRAY.toString() + " Clears speed effect, 0.5x slower crits, " + ChatColor.WHITE + "40s, R4",
                                ChatColor.WHITE.toString() + "",
                                ChatColor.GRAY.toString() + "-" + ChatColor.WHITE + "🌩 " + colorize("#61FFEA") + "sᴘᴇᴇᴅʏ sᴛᴏʀᴍ " + ChatColor.WHITE + "40s R4",
                                ChatColor.GRAY.toString() + " " + ChatColor.GREEN + "\uD83E\uDDD1\uD83C\uDFFB" + ChatColor.GRAY + "Spawns a Thunder Storm with lightning strikes",
                                ChatColor.GRAY.toString() + " the caster gets constant 1.5x faster crits while",
                                ChatColor.GRAY.toString() + " the storm is active and speed 3 while in the storm.",
                                ChatColor.GRAY.toString() + " Trusted get 1.3x faster crits and speed 3 in the storm",
                                ChatColor.GRAY.toString() + " If trusted or caster get struck by thunder they get",
                                ChatColor.GRAY.toString() + " Speed 6 and 2.2x faster crits, If untrusted is struck",
                                ChatColor.GRAY.toString() + " by thunder they are stuned for 2s",
                                ChatColor.GRAY.toString() + " " + ChatColor.GREEN + "\uD83E\uDD3C" + ChatColor.GRAY + "Gives trusted 1.5x faster crits and speed 3."
                            )
                        )
                    }

                    if (energy == Energy.Cracked) {
                        itemMeta.setCustomModelData(48)
                        itemMeta.setLore(
                            Arrays.asList<String?>(
                                ChatColor.WHITE.toString() + "" + ChatColor.BOLD + "ᴡᴀᴛᴄʜ ᴛʜᴇ ᴡᴏʀʟᴅ ᴀʀᴏᴜɴᴅ ʏᴏᴜ ᴛᴜʀɴ ɪɴᴛᴏ ᴀ ʙʟᴜʀ",
                                colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                energystage,
                                ChatColor.GRAY.toString() + " " + colorize("#FEFD17") + "🔮 " + ChatColor.GRAY + "Speed 3, Immune to soul sand",
                                ChatColor.GRAY.toString() + " auto-enchants efficiency 3",
                                ChatColor.WHITE.toString() + " ",
                                colorize("#B8FFFB") + ChatColor.BOLD + "ᴘᴏᴡᴇʀs",
                                ChatColor.GRAY.toString() + "- " + ChatColor.WHITE + "\uD83C\uDFAF" + ChatColor.WHITE + "sʟᴏᴛʜs sᴇᴅᴀᴛɪᴠᴇ",
                                ChatColor.GRAY.toString() + " " + ChatColor.DARK_RED + "\uD83E\uDD3C\uD83C\uDFFB" + ChatColor.GRAY + " Slowness 2, mining fatigue 3",
                                ChatColor.GRAY.toString() + " Clears speed effects, 0.8x slower crits, " + ChatColor.WHITE + "30s, R4",
                                ChatColor.GRAY.toString() + " " + ChatColor.DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB" + ChatColor.GRAY + "Slowness 4, mining fatigue 3",
                                ChatColor.GRAY.toString() + " Clears speed effect, 0.5x slower crits, " + ChatColor.WHITE + "40s, R4",
                                ChatColor.WHITE.toString() + "",
                                ChatColor.GRAY.toString() + "-" + ChatColor.WHITE + "🌩 " + colorize("#61FFEA") + "sᴘᴇᴇᴅʏ sᴛᴏʀᴍ " + ChatColor.WHITE + "40s R4",
                                ChatColor.GRAY.toString() + " " + ChatColor.GREEN + "\uD83E\uDDD1\uD83C\uDFFB" + ChatColor.GRAY + "Spawns a Thunder Storm with lightning strikes",
                                ChatColor.GRAY.toString() + " the caster gets constant 1.5x faster crits while",
                                ChatColor.GRAY.toString() + " the storm is active and speed 3 while in the storm.",
                                ChatColor.GRAY.toString() + " Trusted get 1.3x faster crits and speed 3 in the storm",
                                ChatColor.GRAY.toString() + " If trusted or caster get struck by thunder they get",
                                ChatColor.GRAY.toString() + " Speed 6 and 2.2x faster crits, If untrusted is struck",
                                ChatColor.GRAY.toString() + " by thunder they are stuned for 2s",
                                ChatColor.GRAY.toString() + " " + ChatColor.GREEN + "\uD83E\uDD3C" + ChatColor.GRAY + "Gives trusted 1.5x faster crits and speed 3."
                            )
                        )
                    }

                    if (energy == Energy.Damaged) {
                        itemMeta.setCustomModelData(68)
                        itemMeta.setLore(
                            Arrays.asList<String?>(
                                ChatColor.WHITE.toString() + "" + ChatColor.BOLD + "ᴡᴀᴛᴄʜ ᴛʜᴇ ᴡᴏʀʟᴅ ᴀʀᴏᴜɴᴅ ʏᴏᴜ ᴛᴜʀɴ ɪɴᴛᴏ ᴀ ʙʟᴜʀ",
                                colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                energystage,
                                ChatColor.GRAY.toString() + " " + colorize("#FEFD17") + "🔮 " + ChatColor.GRAY + "Immune to soul sand",
                                ChatColor.GRAY.toString() + " auto-enchants efficiency 2",
                                ChatColor.WHITE.toString() + " ",
                                colorize("#B8FFFB") + ChatColor.BOLD + "ᴘᴏᴡᴇʀs",
                                ChatColor.GRAY.toString() + "- " + ChatColor.WHITE + "\uD83C\uDFAF" + ChatColor.WHITE + "sʟᴏᴛʜs sᴇᴅᴀᴛɪᴠᴇ",
                                ChatColor.GRAY.toString() + " " + ChatColor.DARK_RED + "\uD83E\uDD3C\uD83C\uDFFB" + ChatColor.GRAY + " Slowness 2, mining fatigue 3",
                                ChatColor.GRAY.toString() + " Clears speed effects, 0.8x slower crits, " + ChatColor.WHITE + "30s, R4",
                                ChatColor.GRAY.toString() + " " + ChatColor.DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB" + ChatColor.GRAY + "Slowness 4, mining fatigue 3",
                                ChatColor.GRAY.toString() + " Clears speed effect, 0.5x slower crits, " + ChatColor.WHITE + "40s, R4",
                                ChatColor.WHITE.toString() + "",
                                ChatColor.GRAY.toString() + "-" + ChatColor.WHITE + "🌩 " + colorize("#61FFEA") + "sᴘᴇᴇᴅʏ sᴛᴏʀᴍ " + ChatColor.WHITE + "40s R4",
                                ChatColor.GRAY.toString() + " " + ChatColor.GREEN + "\uD83E\uDDD1\uD83C\uDFFB" + ChatColor.GRAY + "Spawns a Thunder Storm with lightning strikes",
                                ChatColor.GRAY.toString() + " the caster gets constant 1.5x faster crits while",
                                ChatColor.GRAY.toString() + " the storm is active and speed 3 while in the storm.",
                                ChatColor.GRAY.toString() + " Trusted get 1.3x faster crits and speed 3 in the storm",
                                ChatColor.GRAY.toString() + " If trusted or caster get struck by thunder they get",
                                ChatColor.GRAY.toString() + " Speed 6 and 2.2x faster crits, If untrusted is struck",
                                ChatColor.GRAY.toString() + " by thunder they are stuned for 2s",
                                ChatColor.GRAY.toString() + " " + ChatColor.GREEN + "\uD83E\uDD3C" + ChatColor.GRAY + "Gives trusted 1.5x faster crits and speed 3."
                            )
                        )
                    }

                    if (energy == Energy.Ruined) {
                        itemMeta.setCustomModelData(88)
                        itemMeta.setLore(
                            Arrays.asList<String?>(
                                ChatColor.WHITE.toString() + "" + ChatColor.BOLD + "ᴡᴀᴛᴄʜ ᴛʜᴇ ᴡᴏʀʟᴅ ᴀʀᴏᴜɴᴅ ʏᴏᴜ ᴛᴜʀɴ ɪɴᴛᴏ ᴀ ʙʟᴜʀ",
                                colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                energystage,
                                ChatColor.GRAY.toString() + " " + colorize("#FEFD17") + "🔮 " + ChatColor.GRAY + "No passives",
                                ChatColor.WHITE.toString() + " ",
                                colorize("#B8FFFB") + ChatColor.BOLD + "ᴘᴏᴡᴇʀs",
                                ChatColor.GRAY.toString() + "- " + ChatColor.WHITE + "\uD83C\uDFAF" + ChatColor.WHITE + "sʟᴏᴛʜs sᴇᴅᴀᴛɪᴠᴇ",
                                ChatColor.GRAY.toString() + " " + ChatColor.DARK_RED + "\uD83E\uDD3C\uD83C\uDFFB" + ChatColor.GRAY + " Slowness 2, mining fatigue 3",
                                ChatColor.GRAY.toString() + " Clears speed effects, 0.8x slower crits, " + ChatColor.WHITE + "30s, R4",
                                ChatColor.GRAY.toString() + " " + ChatColor.DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB" + ChatColor.GRAY + "Slowness 4, mining fatigue 3",
                                ChatColor.GRAY.toString() + " Clears speed effect, 0.5x slower crits, " + ChatColor.WHITE + "40s, R4",
                                ChatColor.WHITE.toString() + "",
                                ChatColor.GRAY.toString() + "-" + ChatColor.WHITE + "🌩 " + colorize("#61FFEA") + "sᴘᴇᴇᴅʏ sᴛᴏʀᴍ " + ChatColor.WHITE + "40s R4",
                                ChatColor.GRAY.toString() + " " + ChatColor.GREEN + "\uD83E\uDDD1\uD83C\uDFFB" + ChatColor.GRAY + "Spawns a Thunder Storm with lightning strikes",
                                ChatColor.GRAY.toString() + " the caster gets constant 1.5x faster crits while",
                                ChatColor.GRAY.toString() + " the storm is active and speed 3 while in the storm.",
                                ChatColor.GRAY.toString() + " Trusted get 1.3x faster crits and speed 3 in the storm",
                                ChatColor.GRAY.toString() + " If trusted or caster get struck by thunder they get",
                                ChatColor.GRAY.toString() + " Speed 6 and 2.2x faster crits, If untrusted is struck",
                                ChatColor.GRAY.toString() + " by thunder they are stuned for 2s",
                                ChatColor.GRAY.toString() + " " + ChatColor.GREEN + "\uD83E\uDD3C" + ChatColor.GRAY + "Gives trusted 1.5x faster crits and speed 3."
                            )
                        )
                    }


                    if (energy == Energy.Broken) {
                        itemMeta.setCustomModelData(96)
                        itemMeta.setLore(
                            Arrays.asList<String?>(
                                ChatColor.WHITE.toString() + "" + ChatColor.BOLD + "ᴜsᴇʟᴇss"
                            )
                        )
                    }
                    item.setItemMeta(itemMeta)
                    return item
                }


                if (season == 3) {
                    val item = ItemStack(Material.PRISMARINE_SHARD, 1)
                    val itemMeta = item.getItemMeta()


                    val idkey = NamespacedKey(instance!!, "gem-id")
                    itemMeta.getPersistentDataContainer()
                        .set<String?, String?>(idkey, PersistentDataType.STRING, "a95b1359-cdd0-4e74-b4d4-76fb2e256c7d")

                    val tierkey = NamespacedKey(instance!!, "gem-tier")
                    itemMeta.getPersistentDataContainer().set<Int?, Int?>(tierkey, PersistentDataType.INTEGER, tier)

                    val typekey = NamespacedKey(instance!!, "gem-type")
                    itemMeta.getPersistentDataContainer()
                        .set<String?, String?>(typekey, PersistentDataType.STRING, "speed")

                    val quicknodropkey = NamespacedKey(instance!!, "quick-no-drop")
                    itemMeta.getPersistentDataContainer()
                        .set<Int?, Int?>(quicknodropkey, PersistentDataType.INTEGER, quicknodrop)

                    val quicknoremovekey = NamespacedKey(instance!!, "quick-no-remove")
                    itemMeta.getPersistentDataContainer()
                        .set<Int?, Int?>(quicknoremovekey, PersistentDataType.INTEGER, quicknoremove)


                    itemMeta.setDisplayName(colorize("#FEFD17") + ChatColor.BOLD + "sᴘᴇᴇᴅ " + colorize("#FFD773") + "ɢᴇᴍ")
                    if (Gem.Companion.isPristineorHigher(energy) || energy == Energy.Scratched) {
                        if (energy == Energy.Pristine_5) itemMeta.addEnchant(CompEnchantment.DURABILITY, 1, true)
                        itemMeta.setCustomModelData(8)
                        if (energy == Energy.Scratched) itemMeta.setCustomModelData(28)
                        for (flag in ItemFlag.entries) itemMeta.addItemFlags(flag)

                        var ending = colorize("&f)")
                        if (energy == Energy.Pristine_1 || energy == Energy.Pristine_2 || energy == Energy.Pristine_3 || energy == Energy.Pristine_4 || energy == Energy.Pristine_5) ending =
                            ")"

                        itemMeta.setLore(
                            Arrays.asList<String?>(
                                ChatColor.WHITE.toString() + "" + ChatColor.BOLD + "ᴡᴀᴛᴄʜ ᴛʜᴇ ᴡᴏʀʟᴅ ᴀʀᴏᴜɴᴅ ʏᴏᴜ ᴛᴜʀɴ ɪɴᴛᴏ ᴀ ʙʟᴜʀ ",
                                colorize("&f(") + energystage + ending,
                                ChatColor.WHITE.toString() + "",
                                colorize("#FEFD17") + "🔮" + " " + colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                ChatColor.GRAY.toString() + "- Speed",
                                ChatColor.GRAY.toString() + "- Dolphins grace",
                                ChatColor.GRAY.toString() + "- Enchants Efficiency",
                                ChatColor.GRAY.toString() + "- Enchants Soul Speed",
                                ChatColor.WHITE.toString() + "",
                                colorize("#FEFD17") + "🔮" + " " + colorize("#82F3FF") + ChatColor.BOLD + "ᴀʙɪʟɪᴛʏ",
                                ChatColor.GRAY.toString() + "- " + colorize("#FEFD17") + " Terminal Velocity",
                                ChatColor.WHITE.toString() + "",
                                colorize("#FEFD17") + "🔮 " + colorize("#B8FFFB") + ChatColor.BOLD + "ᴘᴏᴡᴇʀs",
                                ChatColor.GRAY.toString() + "- " + ChatColor.WHITE + "\uD83C\uDFAF " + colorize("#FFE86E") + "ʙʟᴜʀ",
                                ChatColor.WHITE.toString() + "",
                                ChatColor.GRAY.toString() + "- " + ChatColor.WHITE + "\uD83C\uDF29 " + colorize("#61FFEA") + "sᴘᴇᴇᴅʏ sᴛᴏʀᴍ " + ChatColor.DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                                ChatColor.GRAY.toString() + "- " + ChatColor.WHITE + "\uD83C\uDF29 " + colorize("#61FFEA") + "sᴘᴇᴇᴅʏ sᴛᴏʀᴍ " + ChatColor.DARK_RED + "\uD83E\uDD3C"
                            )
                        )
                    }

                    if (energy == Energy.Cracked) {
                        itemMeta.setCustomModelData(48)
                        for (flag in ItemFlag.entries) itemMeta.addItemFlags(flag)
                        itemMeta.setLore(
                            Arrays.asList<String?>(
                                ChatColor.WHITE.toString() + "" + ChatColor.BOLD + "ᴡᴀᴛᴄʜ ᴛʜᴇ ᴡᴏʀʟᴅ ᴀʀᴏᴜɴᴅ ʏᴏᴜ ᴛᴜʀɴ ɪɴᴛᴏ ᴀ ʙʟᴜʀ ",
                                colorize("&f(") + energystage + colorize("&f)"),
                                ChatColor.WHITE.toString() + "",
                                colorize("#FEFD17") + "🔮" + " " + colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                ChatColor.GRAY.toString() + "- Speed",
                                ChatColor.GRAY.toString() + "- Enchants Efficiency",
                                ChatColor.GRAY.toString() + "- Enchants Soul Speed",
                                ChatColor.WHITE.toString() + "",
                                colorize("#FEFD17") + "🔮" + " " + colorize("#82F3FF") + ChatColor.BOLD + "ᴀʙɪʟɪᴛʏ",
                                ChatColor.GRAY.toString() + "- " + colorize("#FEFD17") + " Terminal Velocity",
                                ChatColor.WHITE.toString() + "",
                                colorize("#FEFD17") + "🔮 " + colorize("#B8FFFB") + ChatColor.BOLD + "ᴘᴏᴡᴇʀs",
                                ChatColor.GRAY.toString() + "- " + ChatColor.WHITE + "\uD83C\uDFAF " + colorize("#FFE86E") + "ʙʟᴜʀ",
                                ChatColor.WHITE.toString() + "",
                                ChatColor.GRAY.toString() + "- " + ChatColor.WHITE + "\uD83C\uDF29 " + colorize("#61FFEA") + "sᴘᴇᴇᴅʏ sᴛᴏʀᴍ " + ChatColor.DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                                ChatColor.GRAY.toString() + "- " + ChatColor.WHITE + "\uD83C\uDF29 " + colorize("#61FFEA") + "sᴘᴇᴇᴅʏ sᴛᴏʀᴍ " + ChatColor.DARK_RED + "\uD83E\uDD3C"
                            )
                        )
                    }

                    if (energy == Energy.Damaged) {
                        itemMeta.setCustomModelData(68)
                        for (flag in ItemFlag.entries) itemMeta.addItemFlags(flag)
                        itemMeta.setLore(
                            Arrays.asList<String?>(
                                ChatColor.WHITE.toString() + "" + ChatColor.BOLD + "ᴡᴀᴛᴄʜ ᴛʜᴇ ᴡᴏʀʟᴅ ᴀʀᴏᴜɴᴅ ʏᴏᴜ ᴛᴜʀɴ ɪɴᴛᴏ ᴀ ʙʟᴜʀ ",
                                colorize("&f(") + energystage + colorize("&f)"),
                                ChatColor.WHITE.toString() + "",
                                colorize("#FEFD17") + "🔮" + " " + colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                ChatColor.GRAY.toString() + "- Speed",
                                ChatColor.GRAY.toString() + "- Dolphins grace",
                                ChatColor.GRAY.toString() + "- Enchants Efficiency",
                                ChatColor.WHITE.toString() + "",
                                colorize("#FEFD17") + "🔮" + " " + colorize("#82F3FF") + ChatColor.BOLD + "ᴀʙɪʟɪᴛʏ",
                                ChatColor.GRAY.toString() + "- " + colorize("#FEFD17") + " Terminal Velocity",
                                ChatColor.WHITE.toString() + "",
                                colorize("#FEFD17") + "🔮 " + colorize("#B8FFFB") + ChatColor.BOLD + "ᴘᴏᴡᴇʀs",
                                ChatColor.GRAY.toString() + "- " + ChatColor.WHITE + "\uD83C\uDFAF " + colorize("#FFE86E") + "ʙʟᴜʀ",
                                ChatColor.WHITE.toString() + "",
                                ChatColor.GRAY.toString() + "- " + ChatColor.WHITE + "\uD83C\uDF29 " + colorize("#61FFEA") + "sᴘᴇᴇᴅʏ sᴛᴏʀᴍ " + ChatColor.DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                                ChatColor.GRAY.toString() + "- " + ChatColor.WHITE + "\uD83C\uDF29 " + colorize("#61FFEA") + "sᴘᴇᴇᴅʏ sᴛᴏʀᴍ " + ChatColor.DARK_RED + "\uD83E\uDD3C"
                            )
                        )
                    }


                    if (energy == Energy.Ruined) {
                        itemMeta.setCustomModelData(88)
                        for (flag in ItemFlag.entries) itemMeta.addItemFlags(flag)
                        itemMeta.setLore(
                            Arrays.asList<String?>(
                                ChatColor.WHITE.toString() + "" + ChatColor.BOLD + "ᴡᴀᴛᴄʜ ᴛʜᴇ ᴡᴏʀʟᴅ ᴀʀᴏᴜɴᴅ ʏᴏᴜ ᴛᴜʀɴ ɪɴᴛᴏ ᴀ ʙʟᴜʀ ",
                                colorize("&f(") + energystage + colorize("&f)"),
                                ChatColor.WHITE.toString() + "",
                                colorize("#FEFD17") + "🔮" + " " + colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                ChatColor.GRAY.toString() + "No Passives",
                                ChatColor.WHITE.toString() + "",
                                colorize("#FEFD17") + "🔮" + " " + colorize("#82F3FF") + ChatColor.BOLD + "ᴀʙɪʟɪᴛʏ",
                                ChatColor.GRAY.toString() + "- " + colorize("#FEFD17") + " Terminal Velocity",
                                ChatColor.WHITE.toString() + "",
                                colorize("#FEFD17") + "🔮 " + colorize("#B8FFFB") + ChatColor.BOLD + "ᴘᴏᴡᴇʀs",
                                ChatColor.GRAY.toString() + "- " + ChatColor.WHITE + "\uD83C\uDFAF " + colorize("#FFE86E") + "ʙʟᴜʀ",
                                ChatColor.WHITE.toString() + "",
                                ChatColor.GRAY.toString() + "- " + ChatColor.WHITE + "\uD83C\uDF29 " + colorize("#61FFEA") + "sᴘᴇᴇᴅʏ sᴛᴏʀᴍ " + ChatColor.DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                                ChatColor.GRAY.toString() + "- " + ChatColor.WHITE + "\uD83C\uDF29 " + colorize("#61FFEA") + "sᴘᴇᴇᴅʏ sᴛᴏʀᴍ " + ChatColor.DARK_RED + "\uD83E\uDD3C"
                            )
                        )
                    }


                    if (energy == Energy.Broken) {
                        itemMeta.setCustomModelData(100)
                        for (flag in ItemFlag.entries) itemMeta.addItemFlags(flag)
                        itemMeta.setLore(
                            Arrays.asList<String?>(
                                ChatColor.WHITE.toString() + "" + ChatColor.BOLD + "ᴜsᴇʟᴇss"
                            )
                        )
                    }
                    item.setItemMeta(itemMeta)
                    return item
                }
            }


            //Life
            if (gem == GemType.Life) {
                if (season == 1) {
                    val item = ItemStack(Material.PRISMARINE_SHARD, 1)
                    val itemMeta = item.getItemMeta()


                    val idkey = NamespacedKey(instance!!, "shard_id")
                    itemMeta.getPersistentDataContainer().set<String?, String?>(
                        idkey,
                        PersistentDataType.STRING,
                        UUID.randomUUID().toString().toString()
                    )

                    itemMeta.setDisplayName(colorize("#FE04B4") + ChatColor.BOLD + "Life " + colorize("#FFD773") + "Gem")


                    // Set HideFlags to 127 if server is lower than 1.20.6, if yes: then hide all flags.
                    // due to the nbt change, it is not possible to make everything 1-1 for people using 1.20.6 and higher.
                    if (OlderThanNBTChange()) {
                        CompItemFlag.HIDE_ENCHANTS.applyTo(item)
                        CompItemFlag.HIDE_ATTRIBUTES.applyTo(item)
                        CompItemFlag.HIDE_UNBREAKABLE.applyTo(item)
                        CompItemFlag.HIDE_DESTROYS.applyTo(item)
                        CompItemFlag.HIDE_PLACED_ON.applyTo(item)
                        CompItemFlag.HIDE_POTION_EFFECTS.applyTo(item)
                        CompItemFlag.HIDE_DYE.applyTo(item)
                    } else for (flag in ItemFlag.entries) itemMeta.addItemFlags(flag)


                    itemMeta.setCustomModelData(4)
                    itemMeta.setLore(
                        Arrays.asList<String?>(
                            ChatColor.WHITE.toString() + "" + ChatColor.BOLD + "Control life itself",
                            colorize("#FFE4AB") + "Passives",
                            ChatColor.GRAY.toString() + " " + colorize("#FE04B4") + "🔮 " + ChatColor.GRAY + "Feed animals and grow plants",
                            ChatColor.GRAY.toString() + " by crouch clicking with bare hand, 3x dmg",
                            ChatColor.GRAY.toString() + " to undead mobs, 2x the saturation capacity",
                            ChatColor.GRAY.toString() + " Immune to withering, heal half a heart ever 5 seconds",
                            ChatColor.GRAY.toString() + " 2 more hearts from gapples, and 90% chance totems work",
                            ChatColor.WHITE.toString() + " ",
                            colorize("#FFE4AB") + "Powers",
                            ChatColor.GRAY.toString() + "-" + colorize("#350100") + "\uD83D\uDC98 " + colorize("#FE04B4") + "Heart Drainer",  //emoji color is not accurate, i dont have the color for it
                            ChatColor.GRAY.toString() + " " + ChatColor.DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB " + ChatColor.GRAY + "Removes 30% of players hearts " + ChatColor.WHITE + "20s",
                            ChatColor.GRAY.toString() + " " + ChatColor.DARK_RED + "\uD83E\uDD3C " + ChatColor.GRAY + "Removes 15% of players hearts " + ChatColor.WHITE + "R4, 1m",
                            ChatColor.WHITE.toString() + "",
                            ChatColor.GRAY.toString() + "-" + ChatColor.WHITE + "\uD83D\uDC96 " + colorize("#B8FFFA") + "Privilege Precinct",
                            ChatColor.GREEN.toString() + "\uD83E\uDDD1\uD83C\uDFFB " + ChatColor.GRAY + "Summons a 8 block wide zone that follows you",
                            ChatColor.GRAY.toString() + " Gives trusted +3, Untrusted -3 hearts",
                            ChatColor.GRAY.toString() + " slowly mends armour and tools if trusted",
                            ChatColor.GRAY.toString() + " caster only can steal health while zone is active",
                            ChatColor.GREEN.toString() + "\uD83E\uDD3C " + ChatColor.GRAY + "Gives trusted players +3 hearts for " + ChatColor.WHITE + "1m 30s, R4"
                        )
                    )

                    item.setItemMeta(itemMeta)
                    return item
                }


                if (season == 2) {
                    val item = ItemStack(Material.PRISMARINE_SHARD, 1)
                    val itemMeta = item.getItemMeta()


                    val idkey = NamespacedKey(instance!!, "gem-id")
                    itemMeta.getPersistentDataContainer()
                        .set<String?, String?>(idkey, PersistentDataType.STRING, UUID.randomUUID().toString())

                    val tierkey = NamespacedKey(instance!!, "gem-tier")
                    itemMeta.getPersistentDataContainer().set<Int?, Int?>(tierkey, PersistentDataType.INTEGER, tier)

                    val typekey = NamespacedKey(instance!!, "gem-type")
                    itemMeta.getPersistentDataContainer()
                        .set<String?, String?>(typekey, PersistentDataType.STRING, "life")

                    val quicknodropkey = NamespacedKey(instance!!, "quick-no-drop")
                    itemMeta.getPersistentDataContainer()
                        .set<Int?, Int?>(quicknodropkey, PersistentDataType.INTEGER, quicknodrop)

                    val quicknoremovekey = NamespacedKey(instance!!, "quick-no-remove")
                    itemMeta.getPersistentDataContainer()
                        .set<Int?, Int?>(quicknoremovekey, PersistentDataType.INTEGER, quicknoremove)


                    itemMeta.setDisplayName(colorize("#FE04B4") + ChatColor.BOLD + "ʟɪғᴇ " + colorize("#FFD773") + "ɢᴇᴍ")
                    for (flag in ItemFlag.entries) itemMeta.addItemFlags(flag)

                    if (Gem.Companion.isPristineorHigher(energy)) {
                        if (energy == Energy.Pristine_5) itemMeta.addEnchant(CompEnchantment.DURABILITY, 1, true)
                        itemMeta.setCustomModelData(4)
                        itemMeta.setLore(
                            Arrays.asList<String?>(
                                ChatColor.WHITE.toString() + "" + ChatColor.BOLD + "ᴄᴏɴᴛʀᴏʟ ᴛʜᴇ ʙᴀʟᴀɴᴄᴇ ᴏғ ʟɪғᴇ",
                                colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                energystage,
                                ChatColor.GRAY.toString() + " " + colorize("#FE04B4") + "🔮" + ChatColor.GRAY + " " + ChatColor.GRAY + "Feed animals and grow plants",
                                ChatColor.GRAY.toString() + " by crouch clicking with bare hand. 3x dmg",
                                ChatColor.GRAY.toString() + " to undead mobs. 2x saturation",
                                ChatColor.GRAY.toString() + " Immune to withering. Heal half a heart ever 5 seconds",
                                ChatColor.GRAY.toString() + " 2 more hearts from gapples.",
                                ChatColor.WHITE.toString() + " ",
                                colorize("#FFE4AB") + "ᴘᴏᴡᴇʀs ",
                                ChatColor.GRAY.toString() + "-" + ChatColor.WHITE + "\uD83D\uDC98" + colorize("#FF429A") + " ʜᴇᴀʀᴛ ᴅʀᴀɪɴᴇʀ",  //emoji color is not accurate, i dont have the color for it
                                ChatColor.GRAY.toString() + " " + ChatColor.DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB " + ChatColor.GRAY + "Removes 4 hearts " + ChatColor.WHITE + "20s",
                                ChatColor.GRAY.toString() + " " + ChatColor.DARK_RED + "\uD83E\uDD3C " + ChatColor.GRAY + "Removes 2 hearts " + ChatColor.WHITE + "R4, 1m",
                                ChatColor.WHITE.toString() + "",
                                ChatColor.GRAY.toString() + "-" + ChatColor.WHITE + "\uD83D\uDC96" + colorize("#B8FFFA") + " ᴄɪʀᴄʟᴇ ᴏғ ʟɪғᴇ",
                                ChatColor.GREEN.toString() + "\uD83E\uDDD1\uD83C\uDFFB " + ChatColor.GRAY + "Summons a 8 block wide zone that follows you",
                                ChatColor.GRAY.toString() + " Gives trusted +4, Untrusted -4 hearts",
                                ChatColor.GRAY.toString() + " slowly mends armour and tools if trusted",
                                ChatColor.GRAY.toString() + " caster only can steal health while zone is active",
                                ChatColor.GREEN.toString() + "\uD83E\uDD3C " + ChatColor.GRAY + "Gives trusted players +5 hearts for " + ChatColor.WHITE + "1m 30s, R4"
                            )
                        )
                    }


                    if (energy == Energy.Scratched) {
                        itemMeta.setCustomModelData(24)
                        itemMeta.setLore(
                            Arrays.asList<String?>(
                                ChatColor.WHITE.toString() + "" + ChatColor.BOLD + "ᴄᴏɴᴛʀᴏʟ ᴛʜᴇ ʙᴀʟᴀɴᴄᴇ ᴏғ ʟɪғᴇ",
                                colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                energystage,
                                ChatColor.GRAY.toString() + " " + colorize("#FE04B4") + "🔮" + ChatColor.GRAY + " " + ChatColor.GRAY + "Feed animals and grow plants",
                                ChatColor.GRAY.toString() + " by crouch clicking with bare hand. 3x dmg",
                                ChatColor.GRAY.toString() + " to undead mobs. Immune to withering",
                                ChatColor.GRAY.toString() + " Heal half a heart ever 5 seconds",
                                ChatColor.WHITE.toString() + " ",
                                colorize("#FFE4AB") + "ᴘᴏᴡᴇʀs ",
                                ChatColor.GRAY.toString() + "-" + ChatColor.WHITE + "\uD83D\uDC98" + colorize("#FF429A") + " ʜᴇᴀʀᴛ ᴅʀᴀɪɴᴇʀ",  //emoji color is not accurate, i dont have the color for it
                                ChatColor.GRAY.toString() + " " + ChatColor.DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB " + ChatColor.GRAY + "Removes 4 hearts " + ChatColor.WHITE + "20s",
                                ChatColor.GRAY.toString() + " " + ChatColor.DARK_RED + "\uD83E\uDD3C " + ChatColor.GRAY + "Removes 2 hearts " + ChatColor.WHITE + "R4, 1m",
                                ChatColor.WHITE.toString() + "",
                                ChatColor.GRAY.toString() + "-" + ChatColor.WHITE + "\uD83D\uDC96" + colorize("#B8FFFA") + " ᴄɪʀᴄʟᴇ ᴏғ ʟɪғᴇ",
                                ChatColor.GREEN.toString() + "\uD83E\uDDD1\uD83C\uDFFB " + ChatColor.GRAY + "Summons a 8 block wide zone that follows you",
                                ChatColor.GRAY.toString() + " Gives trusted +4, Untrusted -4 hearts",
                                ChatColor.GRAY.toString() + " slowly mends armour and tools if trusted",
                                ChatColor.GRAY.toString() + " caster only can steal health while zone is active",
                                ChatColor.GREEN.toString() + "\uD83E\uDD3C " + ChatColor.GRAY + "Gives trusted players +5 hearts for " + ChatColor.WHITE + "1m 30s, R4"
                            )
                        )
                    }

                    if (energy == Energy.Cracked) {
                        itemMeta.setCustomModelData(44)
                        itemMeta.setLore(
                            Arrays.asList<String?>(
                                ChatColor.WHITE.toString() + "" + ChatColor.BOLD + "ᴄᴏɴᴛʀᴏʟ ᴛʜᴇ ʙᴀʟᴀɴᴄᴇ ᴏғ ʟɪғᴇ",
                                colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                energystage,
                                ChatColor.GRAY.toString() + " " + colorize("#FE04B4") + "🔮" + ChatColor.GRAY + " " + ChatColor.GRAY + "Feed animals by crouch",
                                ChatColor.GRAY.toString() + " clicking with bare hand. Immune to withering.",
                                ChatColor.GRAY.toString() + " Heal half a heart ever 5 seconds",
                                ChatColor.WHITE.toString() + " ",
                                colorize("#FFE4AB") + "ᴘᴏᴡᴇʀs ",
                                ChatColor.GRAY.toString() + "-" + ChatColor.WHITE + "\uD83D\uDC98" + colorize("#FF429A") + " ʜᴇᴀʀᴛ ᴅʀᴀɪɴᴇʀ",  //emoji color is not accurate, i dont have the color for it
                                ChatColor.GRAY.toString() + " " + ChatColor.DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB " + ChatColor.GRAY + "Removes 4 hearts " + ChatColor.WHITE + "20s",
                                ChatColor.GRAY.toString() + " " + ChatColor.DARK_RED + "\uD83E\uDD3C " + ChatColor.GRAY + "Removes 2 hearts " + ChatColor.WHITE + "R4, 1m",
                                ChatColor.WHITE.toString() + "",
                                ChatColor.GRAY.toString() + "-" + ChatColor.WHITE + "\uD83D\uDC96" + colorize("#B8FFFA") + " ᴄɪʀᴄʟᴇ ᴏғ ʟɪғᴇ",
                                ChatColor.GREEN.toString() + "\uD83E\uDDD1\uD83C\uDFFB " + ChatColor.GRAY + "Summons a 8 block wide zone that follows you",
                                ChatColor.GRAY.toString() + " Gives trusted +4, Untrusted -4 hearts",
                                ChatColor.GRAY.toString() + " slowly mends armour and tools if trusted",
                                ChatColor.GRAY.toString() + " caster only can steal health while zone is active",
                                ChatColor.GREEN.toString() + "\uD83E\uDD3C " + ChatColor.GRAY + "Gives trusted players +5 hearts for " + ChatColor.WHITE + "1m 30s, R4"
                            )
                        )
                    }

                    if (energy == Energy.Damaged) {
                        itemMeta.setCustomModelData(64)
                        itemMeta.setLore(
                            Arrays.asList<String?>(
                                ChatColor.WHITE.toString() + "" + ChatColor.BOLD + "ᴄᴏɴᴛʀᴏʟ ᴛʜᴇ ʙᴀʟᴀɴᴄᴇ ᴏғ ʟɪғᴇ",
                                colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                energystage,
                                ChatColor.GRAY.toString() + " " + colorize("#FE04B4") + "🔮" + ChatColor.GRAY + " " + ChatColor.GRAY + " Heal half a heart ever 5 seconds",
                                ChatColor.WHITE.toString() + " ",
                                colorize("#FFE4AB") + "ᴘᴏᴡᴇʀs ",
                                ChatColor.GRAY.toString() + "-" + ChatColor.WHITE + "\uD83D\uDC98" + colorize("#FF429A") + " ʜᴇᴀʀᴛ ᴅʀᴀɪɴᴇʀ",  //emoji color is not accurate, i dont have the color for it
                                ChatColor.GRAY.toString() + " " + ChatColor.DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB " + ChatColor.GRAY + "Removes 4 hearts " + ChatColor.WHITE + "20s",
                                ChatColor.GRAY.toString() + " " + ChatColor.DARK_RED + "\uD83E\uDD3C " + ChatColor.GRAY + "Removes 2 hearts " + ChatColor.WHITE + "R4, 1m",
                                ChatColor.WHITE.toString() + "",
                                ChatColor.GRAY.toString() + "-" + ChatColor.WHITE + "\uD83D\uDC96" + colorize("#B8FFFA") + " ᴄɪʀᴄʟᴇ ᴏғ ʟɪғᴇ",
                                ChatColor.GREEN.toString() + "\uD83E\uDDD1\uD83C\uDFFB " + ChatColor.GRAY + "Summons a 8 block wide zone that follows you",
                                ChatColor.GRAY.toString() + " Gives trusted +4, Untrusted -4 hearts",
                                ChatColor.GRAY.toString() + " slowly mends armour and tools if trusted",
                                ChatColor.GRAY.toString() + " caster only can steal health while zone is active",
                                ChatColor.GREEN.toString() + "\uD83E\uDD3C " + ChatColor.GRAY + "Gives trusted players +5 hearts for " + ChatColor.WHITE + "1m 30s, R4"
                            )
                        )
                    }

                    if (energy == Energy.Ruined) {
                        itemMeta.setCustomModelData(84)
                        itemMeta.setLore(
                            Arrays.asList<String?>(
                                ChatColor.WHITE.toString() + "" + ChatColor.BOLD + "ᴄᴏɴᴛʀᴏʟ ᴛʜᴇ ʙᴀʟᴀɴᴄᴇ ᴏғ ʟɪғᴇ",
                                colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                energystage,
                                ChatColor.GRAY.toString() + " " + colorize("#FE04B4") + "🔮" + ChatColor.GRAY + " No passives",
                                ChatColor.WHITE.toString() + " ",
                                colorize("#FFE4AB") + "ᴘᴏᴡᴇʀs ",
                                ChatColor.GRAY.toString() + "-" + ChatColor.WHITE + "\uD83D\uDC98" + colorize("#FF429A") + " ʜᴇᴀʀᴛ ᴅʀᴀɪɴᴇʀ",  //emoji color is not accurate, i dont have the color for it
                                ChatColor.GRAY.toString() + " " + ChatColor.DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB " + ChatColor.GRAY + "Removes 4 hearts " + ChatColor.WHITE + "20s",
                                ChatColor.GRAY.toString() + " " + ChatColor.DARK_RED + "\uD83E\uDD3C " + ChatColor.GRAY + "Removes 2 hearts " + ChatColor.WHITE + "R4, 1m",
                                ChatColor.WHITE.toString() + "",
                                ChatColor.GRAY.toString() + "-" + ChatColor.WHITE + "\uD83D\uDC96" + colorize("#B8FFFA") + " ᴄɪʀᴄʟᴇ ᴏғ ʟɪғᴇ",
                                ChatColor.GREEN.toString() + "\uD83E\uDDD1\uD83C\uDFFB " + ChatColor.GRAY + "Summons a 8 block wide zone that follows you",
                                ChatColor.GRAY.toString() + " Gives trusted +4, Untrusted -4 hearts",
                                ChatColor.GRAY.toString() + " slowly mends armour and tools if trusted",
                                ChatColor.GRAY.toString() + " caster only can steal health while zone is active",
                                ChatColor.GREEN.toString() + "\uD83E\uDD3C " + ChatColor.GRAY + "Gives trusted players +5 hearts for " + ChatColor.WHITE + "1m 30s, R4"
                            )
                        )
                    }


                    if (energy == Energy.Broken) {
                        itemMeta.setCustomModelData(96)
                        itemMeta.setLore(
                            Arrays.asList<String?>(
                                ChatColor.WHITE.toString() + "" + ChatColor.BOLD + "ᴜsᴇʟᴇss"
                            )
                        )
                    }
                    item.setItemMeta(itemMeta)
                    return item
                }


                if (season == 3) {
                    val item = ItemStack(Material.PRISMARINE_SHARD, 1)
                    val itemMeta = item.getItemMeta()


                    val idkey = NamespacedKey(instance!!, "gem-id")
                    itemMeta.getPersistentDataContainer()
                        .set<String?, String?>(idkey, PersistentDataType.STRING, "d9a2dbb6-3647-4a35-ba85-d4b58ded6e94")

                    val tierkey = NamespacedKey(instance!!, "gem-tier")
                    itemMeta.getPersistentDataContainer().set<Int?, Int?>(tierkey, PersistentDataType.INTEGER, tier)

                    val typekey = NamespacedKey(instance!!, "gem-type")
                    itemMeta.getPersistentDataContainer()
                        .set<String?, String?>(typekey, PersistentDataType.STRING, "life")

                    val quicknodropkey = NamespacedKey(instance!!, "quick-no-drop")
                    itemMeta.getPersistentDataContainer()
                        .set<Int?, Int?>(quicknodropkey, PersistentDataType.INTEGER, quicknodrop)

                    val quicknoremovekey = NamespacedKey(instance!!, "quick-no-remove")
                    itemMeta.getPersistentDataContainer()
                        .set<Int?, Int?>(quicknoremovekey, PersistentDataType.INTEGER, quicknoremove)


                    itemMeta.setDisplayName(colorize("#FE04B4") + ChatColor.BOLD + "ʟɪғᴇ " + colorize("#FFD773") + "ɢᴇᴍ")
                    for (flag in ItemFlag.entries) itemMeta.addItemFlags(flag)

                    if (Gem.Companion.isPristineorHigher(energy)) {
                        if (energy == Energy.Pristine_5) itemMeta.addEnchant(CompEnchantment.DURABILITY, 1, true)
                        itemMeta.setCustomModelData(4)

                        var ending = colorize("&f)")
                        if (energy == Energy.Pristine_1 || energy == Energy.Pristine_2 || energy == Energy.Pristine_3 || energy == Energy.Pristine_4 || energy == Energy.Pristine_5) ending =
                            ")"

                        itemMeta.setLore(
                            Arrays.asList<String?>(
                                ChatColor.WHITE.toString() + "" + ChatColor.BOLD + "ᴄᴏɴᴛʀᴏʟ ᴛʜᴇ ʙᴀʟᴀɴᴄᴇ ᴏғ ʟɪғᴇ",
                                colorize("&f(") + energystage + ending,
                                ChatColor.WHITE.toString() + " ",
                                colorize("#FE04B4") + "🔮 " + colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                ChatColor.GRAY.toString() + "- Green Thumb",
                                ChatColor.GRAY.toString() + "- Radiant Fist",
                                ChatColor.GRAY.toString() + "- Bonus Saturation",
                                ChatColor.GRAY.toString() + "- Bonus Absorption",
                                ChatColor.GRAY.toString() + "- Wither Immune",
                                ChatColor.WHITE.toString() + " ",
                                colorize("#FE04B4") + "🔮" + " " + colorize("#82F3FF") + ChatColor.BOLD + "ᴀʙɪʟɪᴛʏ",
                                ChatColor.GRAY.toString() + "- " + colorize("#FE04B4") + "Vitalaty Vortex",
                                ChatColor.WHITE.toString() + " ",
                                colorize("#FE04B4") + "🔮 " + colorize("#B8FFFB") + ChatColor.BOLD + "ᴘᴏᴡᴇʀs",
                                ChatColor.GRAY.toString() + "- " + ChatColor.WHITE + "\uD83D\uDC98" + colorize("#FF429A") + " ʜᴇᴀʀᴛ ᴅʀᴀɪɴᴇʀ " + ChatColor.DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                                ChatColor.GRAY.toString() + "- " + ChatColor.WHITE + "\uD83D\uDC98" + colorize("#FF429A") + " ʜᴇᴀʀᴛʟᴏᴄᴋ " + ChatColor.DARK_RED + "\uD83E\uDD3C",
                                ChatColor.WHITE.toString() + "",
                                ChatColor.GRAY.toString() + "- " + ChatColor.WHITE + "\uD83D\uDC96" + colorize("#B8FFFA") + " ᴄɪʀᴄʟᴇ ᴏғ ʟɪғᴇ " + ChatColor.GREEN + "\uD83E\uDDD1\uD83C\uDFFB",
                                ChatColor.GRAY.toString() + "- " + ChatColor.WHITE + "\uD83D\uDC96" + colorize("#B8FFFA") + " ᴄɪʀᴄʟᴇ ᴏғ ʟɪғᴇ " + ChatColor.GREEN + "\uD83E\uDD3C"
                            )
                        )
                    }


                    if (energy == Energy.Scratched) {
                        itemMeta.setCustomModelData(24)
                        itemMeta.setLore(
                            Arrays.asList<String?>(
                                ChatColor.WHITE.toString() + "" + ChatColor.BOLD + "ᴄᴏɴᴛʀᴏʟ ᴛʜᴇ ʙᴀʟᴀɴᴄᴇ ᴏғ ʟɪғᴇ",
                                colorize("&f(") + energystage + colorize("&f)"),
                                ChatColor.WHITE.toString() + " ",
                                colorize("#FE04B4") + "🔮 " + colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                ChatColor.GRAY.toString() + "- Green Thumb",
                                ChatColor.GRAY.toString() + "- Bonus Saturation",
                                ChatColor.GRAY.toString() + "- Bonus Absorption",
                                ChatColor.GRAY.toString() + "- Wither Immune",
                                ChatColor.WHITE.toString() + " ",
                                colorize("#FE04B4") + "🔮" + " " + colorize("#82F3FF") + ChatColor.BOLD + "ᴀʙɪʟɪᴛʏ",
                                ChatColor.GRAY.toString() + "- " + colorize("#FE04B4") + "Vitalaty Vortex",
                                ChatColor.WHITE.toString() + " ",
                                colorize("#FE04B4") + "🔮 " + colorize("#B8FFFB") + ChatColor.BOLD + "ᴘᴏᴡᴇʀs",
                                ChatColor.GRAY.toString() + "- " + ChatColor.WHITE + "\uD83D\uDC98" + colorize("#FF429A") + " ʜᴇᴀʀᴛ ᴅʀᴀɪɴᴇʀ " + ChatColor.DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                                ChatColor.GRAY.toString() + "- " + ChatColor.WHITE + "\uD83D\uDC98" + colorize("#FF429A") + " ʜᴇᴀʀᴛʟᴏᴄᴋ " + ChatColor.DARK_RED + "\uD83E\uDD3C",
                                ChatColor.WHITE.toString() + "",
                                ChatColor.GRAY.toString() + "- " + ChatColor.WHITE + "\uD83D\uDC96" + colorize("#B8FFFA") + " ᴄɪʀᴄʟᴇ ᴏғ ʟɪғᴇ " + ChatColor.GREEN + "\uD83E\uDDD1\uD83C\uDFFB",
                                ChatColor.GRAY.toString() + "- " + ChatColor.WHITE + "\uD83D\uDC96" + colorize("#B8FFFA") + " ᴄɪʀᴄʟᴇ ᴏғ ʟɪғᴇ " + ChatColor.GREEN + "\uD83E\uDD3C"
                            )
                        )
                    }

                    if (energy == Energy.Cracked) {
                        itemMeta.setCustomModelData(44)
                        itemMeta.setLore(
                            Arrays.asList<String?>(
                                ChatColor.WHITE.toString() + "" + ChatColor.BOLD + "ᴄᴏɴᴛʀᴏʟ ᴛʜᴇ ʙᴀʟᴀɴᴄᴇ ᴏғ ʟɪғᴇ",
                                colorize("&f(") + energystage + colorize("&f)"),
                                ChatColor.WHITE.toString() + " ",
                                colorize("#FE04B4") + "🔮 " + colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                ChatColor.GRAY.toString() + "- Green Thumb",
                                ChatColor.GRAY.toString() + "- Bonus Saturation",
                                ChatColor.WHITE.toString() + " ",
                                colorize("#FE04B4") + "🔮" + " " + colorize("#82F3FF") + ChatColor.BOLD + "ᴀʙɪʟɪᴛʏ",
                                ChatColor.GRAY.toString() + "- " + colorize("#FE04B4") + "Vitalaty Vortex",
                                ChatColor.WHITE.toString() + " ",
                                colorize("#FE04B4") + "🔮 " + colorize("#B8FFFB") + ChatColor.BOLD + "ᴘᴏᴡᴇʀs",
                                ChatColor.GRAY.toString() + "- " + ChatColor.WHITE + "\uD83D\uDC98" + colorize("#FF429A") + " ʜᴇᴀʀᴛ ᴅʀᴀɪɴᴇʀ " + ChatColor.DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                                ChatColor.GRAY.toString() + "- " + ChatColor.WHITE + "\uD83D\uDC98" + colorize("#FF429A") + " ʜᴇᴀʀᴛʟᴏᴄᴋ " + ChatColor.DARK_RED + "\uD83E\uDD3C",
                                ChatColor.WHITE.toString() + "",
                                ChatColor.GRAY.toString() + "- " + ChatColor.WHITE + "\uD83D\uDC96" + colorize("#B8FFFA") + " ᴄɪʀᴄʟᴇ ᴏғ ʟɪғᴇ " + ChatColor.GREEN + "\uD83E\uDDD1\uD83C\uDFFB",
                                ChatColor.GRAY.toString() + "- " + ChatColor.WHITE + "\uD83D\uDC96" + colorize("#B8FFFA") + " ᴄɪʀᴄʟᴇ ᴏғ ʟɪғᴇ " + ChatColor.GREEN + "\uD83E\uDD3C"
                            )
                        )
                    }

                    if (energy == Energy.Damaged) {
                        itemMeta.setCustomModelData(64)
                        itemMeta.setLore(
                            Arrays.asList<String?>(
                                ChatColor.WHITE.toString() + "" + ChatColor.BOLD + "ᴄᴏɴᴛʀᴏʟ ᴛʜᴇ ʙᴀʟᴀɴᴄᴇ ᴏғ ʟɪғᴇ",
                                colorize("&f(") + energystage + colorize("&f)"),
                                ChatColor.WHITE.toString() + " ",
                                colorize("#FE04B4") + "🔮 " + colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                ChatColor.GRAY.toString() + "- Green Thumb",
                                ChatColor.WHITE.toString() + " ",
                                colorize("#FE04B4") + "🔮" + " " + colorize("#82F3FF") + ChatColor.BOLD + "ᴀʙɪʟɪᴛʏ",
                                ChatColor.GRAY.toString() + "- " + colorize("#FE04B4") + "Vitalaty Vortex",
                                ChatColor.WHITE.toString() + " ",
                                colorize("#FE04B4") + "🔮 " + colorize("#B8FFFB") + ChatColor.BOLD + "ᴘᴏᴡᴇʀs",
                                ChatColor.GRAY.toString() + "- " + ChatColor.WHITE + "\uD83D\uDC98" + colorize("#FF429A") + " ʜᴇᴀʀᴛ ᴅʀᴀɪɴᴇʀ " + ChatColor.DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                                ChatColor.GRAY.toString() + "- " + ChatColor.WHITE + "\uD83D\uDC98" + colorize("#FF429A") + " ʜᴇᴀʀᴛʟᴏᴄᴋ " + ChatColor.DARK_RED + "\uD83E\uDD3C",
                                ChatColor.WHITE.toString() + "",
                                ChatColor.GRAY.toString() + "- " + ChatColor.WHITE + "\uD83D\uDC96" + colorize("#B8FFFA") + " ᴄɪʀᴄʟᴇ ᴏғ ʟɪғᴇ " + ChatColor.GREEN + "\uD83E\uDDD1\uD83C\uDFFB",
                                ChatColor.GRAY.toString() + "- " + ChatColor.WHITE + "\uD83D\uDC96" + colorize("#B8FFFA") + " ᴄɪʀᴄʟᴇ ᴏғ ʟɪғᴇ " + ChatColor.GREEN + "\uD83E\uDD3C"
                            )
                        )
                    }

                    if (energy == Energy.Ruined) {
                        itemMeta.setCustomModelData(84)
                        itemMeta.setLore(
                            Arrays.asList<String?>(
                                ChatColor.WHITE.toString() + "" + ChatColor.BOLD + "ᴄᴏɴᴛʀᴏʟ ᴛʜᴇ ʙᴀʟᴀɴᴄᴇ ᴏғ ʟɪғᴇ",
                                colorize("&f(") + energystage + colorize("&f)"),
                                ChatColor.WHITE.toString() + " ",
                                colorize("#FE04B4") + "🔮 " + colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                ChatColor.GRAY.toString() + "No Passives",
                                ChatColor.WHITE.toString() + " ",
                                colorize("#FE04B4") + "🔮" + " " + colorize("#82F3FF") + ChatColor.BOLD + "ᴀʙɪʟɪᴛʏ",
                                ChatColor.GRAY.toString() + "- " + colorize("#FE04B4") + "Vitalaty Vortex",
                                ChatColor.WHITE.toString() + " ",
                                colorize("#FE04B4") + "🔮 " + colorize("#B8FFFB") + ChatColor.BOLD + "ᴘᴏᴡᴇʀs",
                                ChatColor.GRAY.toString() + "- " + ChatColor.WHITE + "\uD83D\uDC98" + colorize("#FF429A") + " ʜᴇᴀʀᴛ ᴅʀᴀɪɴᴇʀ " + ChatColor.DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                                ChatColor.GRAY.toString() + "- " + ChatColor.WHITE + "\uD83D\uDC98" + colorize("#FF429A") + " ʜᴇᴀʀᴛʟᴏᴄᴋ " + ChatColor.DARK_RED + "\uD83E\uDD3C",
                                ChatColor.WHITE.toString() + "",
                                ChatColor.GRAY.toString() + "- " + ChatColor.WHITE + "\uD83D\uDC96" + colorize("#B8FFFA") + " ᴄɪʀᴄʟᴇ ᴏғ ʟɪғᴇ " + ChatColor.GREEN + "\uD83E\uDDD1\uD83C\uDFFB",
                                ChatColor.GRAY.toString() + "- " + ChatColor.WHITE + "\uD83D\uDC96" + colorize("#B8FFFA") + " ᴄɪʀᴄʟᴇ ᴏғ ʟɪғᴇ " + ChatColor.GREEN + "\uD83E\uDD3C"
                            )
                        )
                    }


                    if (energy == Energy.Broken) {
                        itemMeta.setCustomModelData(100)
                        for (flag in ItemFlag.entries) itemMeta.addItemFlags(flag)
                        itemMeta.setLore(
                            Arrays.asList<String?>(
                                ChatColor.WHITE.toString() + "" + ChatColor.BOLD + "ᴜsᴇʟᴇss"
                            )
                        )
                    }
                    item.setItemMeta(itemMeta)
                    return item
                }
            }


            //Puff
            if (gem == GemType.Puff) {
                if (season == 1) {
                    val item = ItemStack(Material.PRISMARINE_SHARD, 1)
                    val itemMeta = item.getItemMeta()


                    val idkey = NamespacedKey(instance!!, "shard_id")
                    itemMeta.getPersistentDataContainer().set<String?, String?>(
                        idkey,
                        PersistentDataType.STRING,
                        UUID.randomUUID().toString().toString()
                    )

                    itemMeta.setDisplayName(ChatColor.WHITE.toString() + "" + ChatColor.BOLD + "Puff Gem")


                    // Set HideFlags to 127 if server is lower than 1.20.6, if yes: then hide all flags.
                    // due to the nbt change, it is not possible to make everything 1-1 for people using 1.20.6 and higher.
                    if (OlderThanNBTChange()) {
                        CompItemFlag.HIDE_ENCHANTS.applyTo(item)
                        CompItemFlag.HIDE_ATTRIBUTES.applyTo(item)
                        CompItemFlag.HIDE_UNBREAKABLE.applyTo(item)
                        CompItemFlag.HIDE_DESTROYS.applyTo(item)
                        CompItemFlag.HIDE_PLACED_ON.applyTo(item)
                        CompItemFlag.HIDE_POTION_EFFECTS.applyTo(item)
                        CompItemFlag.HIDE_DYE.applyTo(item)
                    } else for (flag in ItemFlag.entries) itemMeta.addItemFlags(flag)


                    itemMeta.setCustomModelData(6)
                    itemMeta.setLore(
                        Arrays.asList<String?>(
                            ChatColor.WHITE.toString() + "" + ChatColor.BOLD + "Be free like the wind",
                            colorize("#FFE4AB") + "Passives",
                            ChatColor.GRAY.toString() + " " + ChatColor.WHITE + "🔮 " + ChatColor.GRAY + "No fall damage, double jump",
                            ChatColor.GRAY.toString() + " and bows get Power 5 and Punch 2",
                            ChatColor.WHITE.toString() + " ",
                            ChatColor.WHITE.toString() + " ",
                            ChatColor.GRAY.toString() + "-" + ChatColor.WHITE + "☁ " + colorize("#FAE7E6") + "Breezy Bash",
                            ChatColor.GRAY.toString() + " " + ChatColor.DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB " + ChatColor.GRAY + "Lifts player 35 blocks and smashes",
                            ChatColor.GRAY.toString() + " them down at a high velocity",
                            ChatColor.GRAY.toString() + " " + ChatColor.DARK_RED + "\uD83E\uDD3C " + ChatColor.GRAY + "Levitates enemies " + ChatColor.WHITE + "R4, 25s",
                            ChatColor.WHITE.toString() + "",
                            ChatColor.GRAY.toString() + "-" + ChatColor.WHITE + "⏫ " + ChatColor.WHITE + "Dash",
                            ChatColor.GRAY.toString() + " Dashes you in the direction you are looking",
                            ChatColor.GRAY.toString() + " deals 2 hearts of damage regardless the protection",
                            ChatColor.GRAY.toString() + " to players and mobs upon contact"
                        )
                    )

                    item.setItemMeta(itemMeta)
                    return item
                }


                if (season == 2) {
                    val item = ItemStack(Material.PRISMARINE_SHARD, 1)
                    val itemMeta = item.getItemMeta()


                    val idkey = NamespacedKey(instance!!, "gem-id")
                    itemMeta.getPersistentDataContainer()
                        .set<String?, String?>(idkey, PersistentDataType.STRING, UUID.randomUUID().toString())

                    val tierkey = NamespacedKey(instance!!, "gem-tier")
                    itemMeta.getPersistentDataContainer().set<Int?, Int?>(tierkey, PersistentDataType.INTEGER, tier)

                    val typekey = NamespacedKey(instance!!, "gem-type")
                    itemMeta.getPersistentDataContainer()
                        .set<String?, String?>(typekey, PersistentDataType.STRING, "puff")

                    val quicknodropkey = NamespacedKey(instance!!, "quick-no-drop")
                    itemMeta.getPersistentDataContainer()
                        .set<Int?, Int?>(quicknodropkey, PersistentDataType.INTEGER, quicknodrop)

                    val quicknoremovekey = NamespacedKey(instance!!, "quick-no-remove")
                    itemMeta.getPersistentDataContainer()
                        .set<Int?, Int?>(quicknoremovekey, PersistentDataType.INTEGER, quicknoremove)


                    itemMeta.setDisplayName(colorize("#EFEFEF") + ChatColor.BOLD + "ᴘᴜғғ " + colorize("#FFD773") + "ɢᴇᴍ")
                    for (flag in ItemFlag.entries) itemMeta.addItemFlags(flag)

                    if (Gem.Companion.isPristineorHigher(energy)) {
                        if (energy == Energy.Pristine_5) itemMeta.addEnchant(CompEnchantment.DURABILITY, 1, true)
                        itemMeta.setCustomModelData(6)
                        itemMeta.setLore(
                            Arrays.asList<String?>(
                                ChatColor.WHITE.toString() + "" + ChatColor.BOLD + "ʙᴇ ᴛʜᴇ ʙɪɢɢᴇsᴛ ʙɪʀᴅ",
                                colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                energystage,
                                ChatColor.GRAY.toString() + " " + ChatColor.WHITE + "🔮" + ChatColor.GRAY + "No fall damage, double jump",
                                ChatColor.GRAY.toString() + " Auto enchant Power 5 and Punch 2",
                                ChatColor.GRAY.toString() + " and feather falling 4",
                                ChatColor.WHITE.toString() + " ",
                                colorize("#B8FFFB") + ChatColor.BOLD + "ᴘᴏᴡᴇʀs",
                                ChatColor.GRAY.toString() + "-" + ChatColor.WHITE + "☁" + colorize("#FAE7E6") + "ʙʀᴇᴇᴢʏ ʙᴀsʜ",
                                ChatColor.GRAY.toString() + " " + ChatColor.DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB " + ChatColor.GRAY + "Lifts player 35 blocks and smashes",
                                ChatColor.GRAY.toString() + " them down at a high velocity",
                                ChatColor.GRAY.toString() + " " + ChatColor.DARK_RED + "\uD83E\uDD3C " + ChatColor.GRAY + "Pushes enemies away from you",
                                ChatColor.WHITE.toString() + "",
                                ChatColor.GRAY.toString() + "-" + ChatColor.WHITE + "⏫ " + colorize("#EFEFEF") + "ᴅᴀsʜ",
                                ChatColor.GRAY.toString() + " Dashes you in the direction you are looking",
                                ChatColor.GRAY.toString() + " deals 2 hearts of damage regardless the protection",
                                ChatColor.GRAY.toString() + " to players and mobs upon contact"
                            )
                        )
                    }


                    if (energy == Energy.Scratched) {
                        itemMeta.setCustomModelData(26)
                        itemMeta.setLore(
                            Arrays.asList<String?>(
                                ChatColor.WHITE.toString() + "" + ChatColor.BOLD + "ʙᴇ ᴛʜᴇ ʙɪɢɢᴇsᴛ ʙɪʀᴅ",
                                colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                energystage,
                                ChatColor.GRAY.toString() + " " + ChatColor.WHITE + "🔮" + ChatColor.GRAY + "No fall damage, double jump",
                                ChatColor.GRAY.toString() + " Auto enchant Power 4 and Punch",
                                ChatColor.GRAY.toString() + " and feather falling 3",
                                ChatColor.WHITE.toString() + " ",
                                colorize("#B8FFFB") + ChatColor.BOLD + "ᴘᴏᴡᴇʀs",
                                ChatColor.GRAY.toString() + "-" + ChatColor.WHITE + "☁" + colorize("#FAE7E6") + "ʙʀᴇᴇᴢʏ ʙᴀsʜ",
                                ChatColor.GRAY.toString() + " " + ChatColor.DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB " + ChatColor.GRAY + "Lifts player 35 blocks and smashes",
                                ChatColor.GRAY.toString() + " them down at a high velocity",
                                ChatColor.GRAY.toString() + " " + ChatColor.DARK_RED + "\uD83E\uDD3C " + ChatColor.GRAY + "Pushes enemies away from you",
                                ChatColor.WHITE.toString() + "",
                                ChatColor.GRAY.toString() + "-" + ChatColor.WHITE + "⏫ " + colorize("#EFEFEF") + "ᴅᴀsʜ",
                                ChatColor.GRAY.toString() + " Dashes you in the direction you are looking",
                                ChatColor.GRAY.toString() + " deals 2 hearts of damage regardless the protection",
                                ChatColor.GRAY.toString() + " to players and mobs upon contact"
                            )
                        )
                    }

                    if (energy == Energy.Cracked) {
                        itemMeta.setCustomModelData(46)
                        itemMeta.setLore(
                            Arrays.asList<String?>(
                                ChatColor.WHITE.toString() + "" + ChatColor.BOLD + "ʙᴇ ᴛʜᴇ ʙɪɢɢᴇsᴛ ʙɪʀᴅ",
                                colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                energystage,
                                ChatColor.GRAY.toString() + " " + ChatColor.WHITE + "🔮" + ChatColor.GRAY + "Double jump",
                                ChatColor.GRAY.toString() + " Auto enchant Power 3 and Punch",
                                ChatColor.GRAY.toString() + " and feather falling 2",
                                ChatColor.WHITE.toString() + " ",
                                colorize("#B8FFFB") + ChatColor.BOLD + "ᴘᴏᴡᴇʀs",
                                ChatColor.GRAY.toString() + "-" + ChatColor.WHITE + "☁" + colorize("#FAE7E6") + "ʙʀᴇᴇᴢʏ ʙᴀsʜ",
                                ChatColor.GRAY.toString() + " " + ChatColor.DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB " + ChatColor.GRAY + "Lifts player 35 blocks and smashes",
                                ChatColor.GRAY.toString() + " them down at a high velocity",
                                ChatColor.GRAY.toString() + " " + ChatColor.DARK_RED + "\uD83E\uDD3C " + ChatColor.GRAY + "Pushes enemies away from you",
                                ChatColor.WHITE.toString() + "",
                                ChatColor.GRAY.toString() + "-" + ChatColor.WHITE + "⏫ " + colorize("#EFEFEF") + "ᴅᴀsʜ",
                                ChatColor.GRAY.toString() + " Dashes you in the direction you are looking",
                                ChatColor.GRAY.toString() + " deals 2 hearts of damage regardless the protection",
                                ChatColor.GRAY.toString() + " to players and mobs upon contact"
                            )
                        )
                    }

                    if (energy == Energy.Damaged) {
                        itemMeta.setCustomModelData(66)
                        itemMeta.setLore(
                            Arrays.asList<String?>(
                                ChatColor.WHITE.toString() + "" + ChatColor.BOLD + "ʙᴇ ᴛʜᴇ ʙɪɢɢᴇsᴛ ʙɪʀᴅ",
                                colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                energystage,
                                ChatColor.WHITE.toString() + "🔮" + ChatColor.GRAY + "Auto enchant Power 2",
                                ChatColor.GRAY.toString() + " and feather falling 1",
                                ChatColor.WHITE.toString() + " ",
                                colorize("#B8FFFB") + ChatColor.BOLD + "ᴘᴏᴡᴇʀs",
                                ChatColor.GRAY.toString() + "-" + ChatColor.WHITE + "☁" + colorize("#FAE7E6") + "ʙʀᴇᴇᴢʏ ʙᴀsʜ",
                                ChatColor.GRAY.toString() + " " + ChatColor.DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB " + ChatColor.GRAY + "Lifts player 35 blocks and smashes",
                                ChatColor.GRAY.toString() + " them down at a high velocity",
                                ChatColor.GRAY.toString() + " " + ChatColor.DARK_RED + "\uD83E\uDD3C " + ChatColor.GRAY + "Pushes enemies away from you",
                                ChatColor.WHITE.toString() + "",
                                ChatColor.GRAY.toString() + "-" + ChatColor.WHITE + "⏫ " + colorize("#EFEFEF") + "ᴅᴀsʜ",
                                ChatColor.GRAY.toString() + " Dashes you in the direction you are looking",
                                ChatColor.GRAY.toString() + " deals 2 hearts of damage regardless the protection",
                                ChatColor.GRAY.toString() + " to players and mobs upon contact"
                            )
                        )
                    }

                    if (energy == Energy.Ruined) {
                        itemMeta.setCustomModelData(86)
                        itemMeta.setLore(
                            Arrays.asList<String?>(
                                ChatColor.WHITE.toString() + "" + ChatColor.BOLD + "ʙᴇ ᴛʜᴇ ʙɪɢɢᴇsᴛ ʙɪʀᴅ",
                                colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                energystage,
                                ChatColor.WHITE.toString() + "🔮" + ChatColor.GRAY + "No passives",
                                ChatColor.WHITE.toString() + " ",
                                colorize("#B8FFFB") + ChatColor.BOLD + "ᴘᴏᴡᴇʀs",
                                ChatColor.GRAY.toString() + "-" + ChatColor.WHITE + "☁" + colorize("#FAE7E6") + "ʙʀᴇᴇᴢʏ ʙᴀsʜ",
                                ChatColor.GRAY.toString() + " " + ChatColor.DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB " + ChatColor.GRAY + "Lifts player 35 blocks and smashes",
                                ChatColor.GRAY.toString() + " them down at a high velocity",
                                ChatColor.GRAY.toString() + " " + ChatColor.DARK_RED + "\uD83E\uDD3C " + ChatColor.GRAY + "Pushes enemies away from you",
                                ChatColor.WHITE.toString() + "",
                                ChatColor.GRAY.toString() + "-" + ChatColor.WHITE + "⏫ " + colorize("#EFEFEF") + "ᴅᴀsʜ",
                                ChatColor.GRAY.toString() + " Dashes you in the direction you are looking",
                                ChatColor.GRAY.toString() + " deals 2 hearts of damage regardless the protection",
                                ChatColor.GRAY.toString() + " to players and mobs upon contact"
                            )
                        )
                    }


                    if (energy == Energy.Broken) {
                        itemMeta.setCustomModelData(96)
                        itemMeta.setLore(
                            Arrays.asList<String?>(
                                ChatColor.WHITE.toString() + "" + ChatColor.BOLD + "ᴜsᴇʟᴇss"
                            )
                        )
                    }
                    item.setItemMeta(itemMeta)
                    return item
                }


                if (season == 3) {
                    val item = ItemStack(Material.PRISMARINE_SHARD, 1)
                    val itemMeta = item.getItemMeta()

                    val idkey = NamespacedKey(instance!!, "gem-id")
                    itemMeta.getPersistentDataContainer()
                        .set<String?, String?>(idkey, PersistentDataType.STRING, "a6a2db68-e82e-4ab8-b883-0fe5f3ad3def")

                    val tierkey = NamespacedKey(instance!!, "gem-tier")
                    itemMeta.getPersistentDataContainer().set<Int?, Int?>(tierkey, PersistentDataType.INTEGER, tier)

                    val typekey = NamespacedKey(instance!!, "gem-type")
                    itemMeta.getPersistentDataContainer()
                        .set<String?, String?>(typekey, PersistentDataType.STRING, "puff")

                    val quicknodropkey = NamespacedKey(instance!!, "quick-no-drop")
                    itemMeta.getPersistentDataContainer()
                        .set<Int?, Int?>(quicknodropkey, PersistentDataType.INTEGER, quicknodrop)

                    val quicknoremovekey = NamespacedKey(instance!!, "quick-no-remove")
                    itemMeta.getPersistentDataContainer()
                        .set<Int?, Int?>(quicknoremovekey, PersistentDataType.INTEGER, quicknoremove)

                    itemMeta.setDisplayName(colorize("#EFEFEF") + ChatColor.BOLD + "ᴘᴜғғ " + colorize("#FFD773") + "ɢᴇᴍ")
                    for (flag in ItemFlag.entries) itemMeta.addItemFlags(flag)

                    if (Gem.Companion.isPristineorHigher(energy)) {
                        if (energy == Energy.Pristine_5) itemMeta.addEnchant(CompEnchantment.DURABILITY, 1, true)
                        itemMeta.setCustomModelData(6)
                        var ending = colorize("&f)")
                        if (energy == Energy.Pristine_1 || energy == Energy.Pristine_2 || energy == Energy.Pristine_3 || energy == Energy.Pristine_4 || energy == Energy.Pristine_5) ending =
                            ")"

                        itemMeta.setLore(
                            Arrays.asList<String?>(
                                ChatColor.WHITE.toString() + "" + ChatColor.BOLD + "ʙᴇ ᴛʜᴇ ʙɪɢɢᴇsᴛ ʙɪʀᴅ",
                                colorize("&f(") + energystage + ending,
                                ChatColor.WHITE.toString() + " ",
                                ChatColor.WHITE.toString() + "🔮 " + colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                ChatColor.GRAY.toString() + "- Fall Damage immunity",
                                ChatColor.GRAY.toString() + "- Enchants Power",
                                ChatColor.GRAY.toString() + "- Enchants Punch",
                                ChatColor.GRAY.toString() + "- Sculk Silence",
                                ChatColor.GRAY.toString() + "- Crop Tramp-Less",
                                ChatColor.WHITE.toString() + " ",
                                ChatColor.WHITE.toString() + "🔮 " + colorize("#82F3FF") + ChatColor.BOLD + "ᴀʙɪʟɪᴛʏ",
                                ChatColor.GRAY.toString() + "- " + ChatColor.WHITE + "Double Jump",
                                ChatColor.WHITE.toString() + " ",
                                ChatColor.WHITE.toString() + "🔮 " + colorize("#B8FFFB") + ChatColor.BOLD + "ᴘᴏᴡᴇʀs",
                                ChatColor.GRAY.toString() + "- " + ChatColor.WHITE + "☁" + colorize("#FAE7E6") + " ʙʀᴇᴇᴢʏ ʙᴀsʜ " + ChatColor.DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                                ChatColor.GRAY.toString() + "- " + ChatColor.WHITE + "☁" + colorize("#FAE7E6") + " ʙʀᴇᴇᴢʏ ʙᴀsʜ " + ChatColor.DARK_RED + "\uD83E\uDD3C",
                                ChatColor.WHITE.toString() + "",
                                ChatColor.GRAY.toString() + "- " + ChatColor.WHITE + "⏫" + colorize("#EFEFEF") + " ᴅᴀsʜ"
                            )
                        )
                    }


                    if (energy == Energy.Scratched) {
                        itemMeta.setCustomModelData(26)
                        itemMeta.setLore(
                            Arrays.asList<String?>(
                                ChatColor.WHITE.toString() + "" + ChatColor.BOLD + "ʙᴇ ᴛʜᴇ ʙɪɢɢᴇsᴛ ʙɪʀᴅ",
                                colorize("&f(") + energystage + colorize("&f)"),
                                ChatColor.WHITE.toString() + " ",
                                ChatColor.WHITE.toString() + "🔮 " + colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                ChatColor.GRAY.toString() + "- Fall Damage immunity",
                                ChatColor.GRAY.toString() + "- Enchants Power",
                                ChatColor.GRAY.toString() + "- Enchants Punch",
                                ChatColor.GRAY.toString() + "- Crop Tramp-Less",
                                ChatColor.WHITE.toString() + " ",
                                ChatColor.WHITE.toString() + "🔮 " + colorize("#82F3FF") + ChatColor.BOLD + "ᴀʙɪʟɪᴛʏ",
                                ChatColor.GRAY.toString() + "- " + ChatColor.WHITE + "Double Jump",
                                ChatColor.WHITE.toString() + " ",
                                ChatColor.WHITE.toString() + "🔮 " + colorize("#B8FFFB") + ChatColor.BOLD + "ᴘᴏᴡᴇʀs",
                                ChatColor.GRAY.toString() + "- " + ChatColor.WHITE + "☁" + colorize("#FAE7E6") + " ʙʀᴇᴇᴢʏ ʙᴀsʜ " + ChatColor.DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                                ChatColor.GRAY.toString() + "- " + ChatColor.WHITE + "☁" + colorize("#FAE7E6") + " ʙʀᴇᴇᴢʏ ʙᴀsʜ " + ChatColor.DARK_RED + "\uD83E\uDD3C",
                                ChatColor.WHITE.toString() + "",
                                ChatColor.GRAY.toString() + "- " + ChatColor.WHITE + "⏫" + colorize("#EFEFEF") + " ᴅᴀsʜ"
                            )
                        )
                    }

                    if (energy == Energy.Cracked) {
                        itemMeta.setCustomModelData(46)
                        itemMeta.setLore(
                            Arrays.asList<String?>(
                                ChatColor.WHITE.toString() + "" + ChatColor.BOLD + "ʙᴇ ᴛʜᴇ ʙɪɢɢᴇsᴛ ʙɪʀᴅ",
                                colorize("&f(") + energystage + colorize("&f)"),
                                ChatColor.WHITE.toString() + " ",
                                ChatColor.WHITE.toString() + "🔮 " + colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                ChatColor.GRAY.toString() + "- Fall Damage immunity",
                                ChatColor.GRAY.toString() + "- Enchants Punch",
                                ChatColor.GRAY.toString() + "- Crop Tramp-Less",
                                ChatColor.WHITE.toString() + " ",
                                ChatColor.WHITE.toString() + "🔮 " + colorize("#82F3FF") + ChatColor.BOLD + "ᴀʙɪʟɪᴛʏ",
                                ChatColor.GRAY.toString() + "- " + ChatColor.WHITE + "Double Jump",
                                ChatColor.WHITE.toString() + " ",
                                ChatColor.WHITE.toString() + "🔮 " + colorize("#B8FFFB") + ChatColor.BOLD + "ᴘᴏᴡᴇʀs",
                                ChatColor.GRAY.toString() + "- " + ChatColor.WHITE + "☁" + colorize("#FAE7E6") + " ʙʀᴇᴇᴢʏ ʙᴀsʜ " + ChatColor.DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                                ChatColor.GRAY.toString() + "- " + ChatColor.WHITE + "☁" + colorize("#FAE7E6") + " ʙʀᴇᴇᴢʏ ʙᴀsʜ " + ChatColor.DARK_RED + "\uD83E\uDD3C",
                                ChatColor.WHITE.toString() + "",
                                ChatColor.GRAY.toString() + "- " + ChatColor.WHITE + "⏫" + colorize("#EFEFEF") + " ᴅᴀsʜ"
                            )
                        )
                    }

                    if (energy == Energy.Damaged) {
                        itemMeta.setCustomModelData(66)
                        itemMeta.setLore(
                            Arrays.asList<String?>(
                                ChatColor.WHITE.toString() + "" + ChatColor.BOLD + "ʙᴇ ᴛʜᴇ ʙɪɢɢᴇsᴛ ʙɪʀᴅ",
                                colorize("&f(") + energystage + colorize("&f)"),
                                ChatColor.WHITE.toString() + " ",
                                ChatColor.WHITE.toString() + "🔮 " + colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                ChatColor.GRAY.toString() + "- Fall Damage immunity",
                                ChatColor.GRAY.toString() + "  - (Not Dripstone Immune)",
                                ChatColor.GRAY.toString() + "- Crop Tramp-Less",
                                ChatColor.WHITE.toString() + " ",
                                ChatColor.WHITE.toString() + "🔮 " + colorize("#82F3FF") + ChatColor.BOLD + "ᴀʙɪʟɪᴛʏ",
                                ChatColor.GRAY.toString() + "- " + ChatColor.WHITE + "Double Jump",
                                ChatColor.WHITE.toString() + " ",
                                ChatColor.WHITE.toString() + "🔮 " + colorize("#B8FFFB") + ChatColor.BOLD + "ᴘᴏᴡᴇʀs",
                                ChatColor.GRAY.toString() + "- " + ChatColor.WHITE + "☁" + colorize("#FAE7E6") + " ʙʀᴇᴇᴢʏ ʙᴀsʜ " + ChatColor.DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                                ChatColor.GRAY.toString() + "- " + ChatColor.WHITE + "☁" + colorize("#FAE7E6") + " ʙʀᴇᴇᴢʏ ʙᴀsʜ " + ChatColor.DARK_RED + "\uD83E\uDD3C",
                                ChatColor.WHITE.toString() + "",
                                ChatColor.GRAY.toString() + "- " + ChatColor.WHITE + "⏫" + colorize("#EFEFEF") + " ᴅᴀsʜ"
                            )
                        )
                    }

                    if (energy == Energy.Ruined) {
                        itemMeta.setCustomModelData(86)
                        itemMeta.setLore(
                            Arrays.asList<String?>(
                                ChatColor.WHITE.toString() + "" + ChatColor.BOLD + "ʙᴇ ᴛʜᴇ ʙɪɢɢᴇsᴛ ʙɪʀᴅ",
                                colorize("&f(") + energystage + colorize("&f)"),
                                ChatColor.WHITE.toString() + " ",
                                ChatColor.WHITE.toString() + "🔮 " + colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                ChatColor.GRAY.toString() + "No Passives",
                                ChatColor.WHITE.toString() + " ",
                                ChatColor.WHITE.toString() + "🔮 " + colorize("#82F3FF") + ChatColor.BOLD + "ᴀʙɪʟɪᴛʏ",
                                ChatColor.GRAY.toString() + "- " + ChatColor.WHITE + "Double Jump",
                                ChatColor.WHITE.toString() + " ",
                                ChatColor.WHITE.toString() + "🔮 " + colorize("#B8FFFB") + ChatColor.BOLD + "ᴘᴏᴡᴇʀs",
                                ChatColor.GRAY.toString() + "- " + ChatColor.WHITE + "☁" + colorize("#FAE7E6") + " ʙʀᴇᴇᴢʏ ʙᴀsʜ " + ChatColor.DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                                ChatColor.GRAY.toString() + "- " + ChatColor.WHITE + "☁" + colorize("#FAE7E6") + " ʙʀᴇᴇᴢʏ ʙᴀsʜ " + ChatColor.DARK_RED + "\uD83E\uDD3C",
                                ChatColor.WHITE.toString() + "",
                                ChatColor.GRAY.toString() + "- " + ChatColor.WHITE + "⏫" + colorize("#EFEFEF") + " ᴅᴀsʜ"
                            )
                        )
                    }


                    if (energy == Energy.Broken) {
                        itemMeta.setCustomModelData(100)
                        for (flag in ItemFlag.entries) itemMeta.addItemFlags(flag)
                        itemMeta.setLore(
                            Arrays.asList<String?>(
                                ChatColor.WHITE.toString() + "" + ChatColor.BOLD + "ᴜsᴇʟᴇss"
                            )
                        )
                    }
                    item.setItemMeta(itemMeta)
                    return item
                }
            }


            //Astra
            if (gem == GemType.Astra) {
                if (season == 2) {
                    val item = ItemStack(Material.PRISMARINE_SHARD, 1)
                    val itemMeta = item.getItemMeta()


                    val idkey = NamespacedKey(instance!!, "gem-id")
                    itemMeta.getPersistentDataContainer()
                        .set<String?, String?>(idkey, PersistentDataType.STRING, UUID.randomUUID().toString())

                    val tierkey = NamespacedKey(instance!!, "gem-tier")
                    itemMeta.getPersistentDataContainer().set<Int?, Int?>(tierkey, PersistentDataType.INTEGER, tier)

                    val typekey = NamespacedKey(instance!!, "gem-type")
                    itemMeta.getPersistentDataContainer()
                        .set<String?, String?>(typekey, PersistentDataType.STRING, "astra")

                    val quicknodropkey = NamespacedKey(instance!!, "quick-no-drop")
                    itemMeta.getPersistentDataContainer()
                        .set<Int?, Int?>(quicknodropkey, PersistentDataType.INTEGER, quicknodrop)

                    val quicknoremovekey = NamespacedKey(instance!!, "quick-no-remove")
                    itemMeta.getPersistentDataContainer()
                        .set<Int?, Int?>(quicknoremovekey, PersistentDataType.INTEGER, quicknoremove)


                    itemMeta.setDisplayName(colorize("#A01FFF") + ChatColor.BOLD + "ᴀsᴛʀᴀ " + colorize("#FFD773") + "ɢᴇᴍ")
                    for (flag in ItemFlag.entries) itemMeta.addItemFlags(flag)

                    if (Gem.Companion.isPristineorHigher(energy)) {
                        if (energy == Energy.Pristine_5) itemMeta.addEnchant(CompEnchantment.DURABILITY, 1, true)
                        itemMeta.setCustomModelData(14)
                        itemMeta.setLore(
                            Arrays.asList<String?>(
                                ChatColor.WHITE.toString() + "" + ChatColor.BOLD + "ᴍᴀɴᴀɢᴇ ᴛʜᴇ ᴛɪᴅᴇs ᴏғ ᴛʜᴇ ᴄᴏsᴍᴏs",
                                colorize("#A01FFF") + " ",
                                ChatColor.GRAY.toString() + " ",
                                colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                energystage,
                                ChatColor.GRAY.toString() + " " + colorize("#A01FFF") + "🔮 " + ChatColor.GRAY + "10% of attacks will phase",
                                ChatColor.GRAY.toString() + " through you. Absorbing souls will heal you 2.5 hearts",
                                ChatColor.GRAY.toString() + " if mob, and 5 if player.",
                                ChatColor.GRAY.toString() + " Capture 2 mobs inside your gem, releasing ",
                                ChatColor.GRAY.toString() + " them in the opposite order they were captured.",
                                ChatColor.WHITE.toString() + "",
                                colorize("#A01FFF") + ChatColor.BOLD + "ᴘᴏᴡᴇʀs",
                                ChatColor.WHITE.toString() + "\uD83D\uDD2A " + colorize("#BFB8B8") + "ᴅᴀɢɢᴇʀs",
                                ChatColor.GRAY.toString() + "Shoot 5 daggers, if a player is hit with one ",
                                ChatColor.GRAY.toString() + " they take 3 hearts of damage and their gem is ",
                                ChatColor.GRAY.toString() + " disabled for 10 seconds for every dagger they're hit with.",
                                ChatColor.DARK_RED.toString() + "\uD83E\uDD3C " + ChatColor.GRAY + "Enter the body of that player, exit by crouching or",
                                ChatColor.GRAY.toString() + " when that player receives damage. Leaving the body",
                                ChatColor.GRAY.toString() + " will haunt them, disabling their gem for 10 seconds",
                                ChatColor.WHITE.toString() + "",
                                ChatColor.GRAY.toString() + "-" + ChatColor.WHITE + "\uD83D\uDC7B " + colorize("#AABBBF") + "ᴀsᴛʀᴀʟ ᴘʀᴏᴊᴇᴄᴛɪᴏɴ",
                                ChatColor.GRAY.toString() + " Become a projection and explore in a 150 block ",
                                ChatColor.GRAY.toString() + " radius. Spook players by left clicking with your gem,",
                                ChatColor.GRAY.toString() + " or tag them with right click, tagging makes that player glow for you, ",
                                ChatColor.GRAY.toString() + " and everyone in your trust list.",
                                ChatColor.GRAY.toString() + " You exit the Astral state if your npc is hit,",
                                ChatColor.GRAY.toString() + " or you click the air with an empty hand"
                            )
                        )
                    }


                    if (energy == Energy.Scratched) {
                        itemMeta.setCustomModelData(34)
                        itemMeta.setLore(
                            Arrays.asList<String?>(
                                ChatColor.WHITE.toString() + "" + ChatColor.BOLD + "ᴍᴀɴᴀɢᴇ ᴛʜᴇ ᴛɪᴅᴇs ᴏғ ᴛʜᴇ ᴄᴏsᴍᴏs",
                                colorize("#A01FFF") + " ",
                                ChatColor.GRAY.toString() + " ",
                                colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                energystage,
                                ChatColor.GRAY.toString() + " " + colorize("#A01FFF") + "🔮 " + ChatColor.GRAY + "10% of attacks will phase",
                                ChatColor.GRAY.toString() + " through you. Absorbing souls will heal you 2.5 hearts",
                                ChatColor.GRAY.toString() + " if mob, and 5 if player.",
                                ChatColor.GRAY.toString() + " Capture 2 mobs inside your gem, releasing ",
                                ChatColor.GRAY.toString() + " them in the opposite order they were captured.",
                                ChatColor.WHITE.toString() + "",
                                colorize("#A01FFF") + ChatColor.BOLD + "ᴘᴏᴡᴇʀs",
                                ChatColor.WHITE.toString() + "\uD83D\uDD2A " + colorize("#BFB8B8") + "ᴅᴀɢɢᴇʀs",
                                ChatColor.GRAY.toString() + "Shoot 5 daggers, if a player is hit with one ",
                                ChatColor.GRAY.toString() + " they take 3 hearts of damage and their gem is ",
                                ChatColor.GRAY.toString() + " disabled for 10 seconds for every dagger they're hit with.",
                                ChatColor.DARK_RED.toString() + "\uD83E\uDD3C " + ChatColor.GRAY + "Enter the body of that player, exit by crouching or",
                                ChatColor.GRAY.toString() + " when that player receives damage. Leaving the body",
                                ChatColor.GRAY.toString() + " will haunt them, disabling their gem for 10 seconds",
                                ChatColor.WHITE.toString() + "",
                                ChatColor.GRAY.toString() + "-" + ChatColor.WHITE + "\uD83D\uDC7B " + colorize("#AABBBF") + "ᴀsᴛʀᴀʟ ᴘʀᴏᴊᴇᴄᴛɪᴏɴ",
                                ChatColor.GRAY.toString() + " Become a projection and explore in a 150 block ",
                                ChatColor.GRAY.toString() + " radius. Spook players by left clicking with your gem,",
                                ChatColor.GRAY.toString() + " or tag them with right click, tagging makes that player glow for you, ",
                                ChatColor.GRAY.toString() + " and everyone in your trust list.",
                                ChatColor.GRAY.toString() + " You exit the Astral state if your npc is hit,",
                                ChatColor.GRAY.toString() + " or you click the air with an empty hand"
                            )
                        )
                    }

                    if (energy == Energy.Cracked) {
                        itemMeta.setCustomModelData(54)
                        itemMeta.setLore(
                            Arrays.asList<String?>(
                                ChatColor.WHITE.toString() + "" + ChatColor.BOLD + "ᴍᴀɴᴀɢᴇ ᴛʜᴇ ᴛɪᴅᴇs ᴏғ ᴛʜᴇ ᴄᴏsᴍᴏs",
                                colorize("#A01FFF") + " ",
                                ChatColor.GRAY.toString() + " ",
                                colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                energystage,
                                ChatColor.GRAY.toString() + " " + colorize("#A01FFF") + "🔮 " + "Absorbing souls will heal",
                                ChatColor.GRAY.toString() + " you 2.5 hearts if mob, 5 if player.",
                                ChatColor.GRAY.toString() + " Capture 2 mobs inside your gem, releasing ",
                                ChatColor.GRAY.toString() + " them in the opposite order they were captured.",
                                ChatColor.WHITE.toString() + "",
                                colorize("#A01FFF") + ChatColor.BOLD + "ᴘᴏᴡᴇʀs",
                                ChatColor.WHITE.toString() + "\uD83D\uDD2A " + colorize("#BFB8B8") + "ᴅᴀɢɢᴇʀs",
                                ChatColor.GRAY.toString() + "Shoot 5 daggers, if a player is hit with one ",
                                ChatColor.GRAY.toString() + " they take 3 hearts of damage and their gem is ",
                                ChatColor.GRAY.toString() + " disabled for 10 seconds for every dagger they're hit with.",
                                ChatColor.DARK_RED.toString() + "\uD83E\uDD3C " + ChatColor.GRAY + "Enter the body of that player, exit by crouching or",
                                ChatColor.GRAY.toString() + " when that player receives damage. Leaving the body",
                                ChatColor.GRAY.toString() + " will haunt them, disabling their gem for 10 seconds",
                                ChatColor.WHITE.toString() + "",
                                ChatColor.GRAY.toString() + "-" + ChatColor.WHITE + "\uD83D\uDC7B " + colorize("#AABBBF") + "ᴀsᴛʀᴀʟ ᴘʀᴏᴊᴇᴄᴛɪᴏɴ",
                                ChatColor.GRAY.toString() + " Become a projection and explore in a 150 block ",
                                ChatColor.GRAY.toString() + " radius. Spook players by left clicking with your gem,",
                                ChatColor.GRAY.toString() + " or tag them with right click, tagging makes that player glow for you, ",
                                ChatColor.GRAY.toString() + " You exit the Astral state if your npc is hit,",
                                ChatColor.GRAY.toString() + " or you click the air with an empty hand"
                            )
                        )
                    }

                    if (energy == Energy.Damaged) {
                        itemMeta.setCustomModelData(74)
                        itemMeta.setLore(
                            Arrays.asList<String?>(
                                ChatColor.WHITE.toString() + "" + ChatColor.BOLD + "ᴍᴀɴᴀɢᴇ ᴛʜᴇ ᴛɪᴅᴇs ᴏғ ᴛʜᴇ ᴄᴏsᴍᴏs",
                                colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                energystage,
                                ChatColor.GRAY.toString() + " " + colorize("#A01FFF") + "🔮 " + ChatColor.GRAY + "No passives",
                                ChatColor.WHITE.toString() + "",
                                colorize("#A01FFF") + ChatColor.BOLD + "ᴘᴏᴡᴇʀs",
                                ChatColor.WHITE.toString() + "\uD83D\uDD2A " + colorize("#BFB8B8") + "ᴅᴀɢɢᴇʀs",
                                ChatColor.GRAY.toString() + "Shoot 5 daggers, if a player is hit with one ",
                                ChatColor.GRAY.toString() + " they take 3 hearts of damage and their gem is ",
                                ChatColor.GRAY.toString() + " disabled for 10 seconds for every dagger they're hit with.",
                                ChatColor.DARK_RED.toString() + "\uD83E\uDD3C " + ChatColor.GRAY + "Enter the body of that player, exit by crouching or",
                                ChatColor.GRAY.toString() + " when that player receives damage. Leaving the body",
                                ChatColor.GRAY.toString() + " will haunt them disabling their gem for 10 seconds",
                                ChatColor.WHITE.toString() + "",
                                ChatColor.GRAY.toString() + "-" + ChatColor.WHITE + "\uD83D\uDC7B " + colorize("#AABBBF") + "ᴀsᴛʀᴀʟ ᴘʀᴏᴊᴇᴄᴛɪᴏɴ",
                                ChatColor.GRAY.toString() + " Become a projection and explore in a 150 block ",
                                ChatColor.GRAY.toString() + " radius. Spook players by left clicking with your gem,",
                                ChatColor.GRAY.toString() + " or tag them with right click, tagging makes that player glow for you, ",
                                ChatColor.GRAY.toString() + " You exit the Astral state if your npc is hit,",
                                ChatColor.GRAY.toString() + " or you click the air with an empty hand"
                            )
                        )
                    }

                    if (energy == Energy.Ruined) {
                        itemMeta.setCustomModelData(94)
                        itemMeta.setLore(
                            Arrays.asList<String?>(
                                ChatColor.WHITE.toString() + "" + ChatColor.BOLD + "ᴍᴀɴᴀɢᴇ ᴛʜᴇ ᴛɪᴅᴇs ᴏғ ᴛʜᴇ ᴄᴏsᴍᴏs",
                                colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                energystage,
                                ChatColor.GRAY.toString() + " " + colorize("#A01FFF") + "🔮 " + ChatColor.GRAY + "No passives",
                                ChatColor.WHITE.toString() + "",
                                colorize("#A01FFF") + ChatColor.BOLD + "ᴘᴏᴡᴇʀs",
                                ChatColor.WHITE.toString() + "\uD83D\uDD2A " + colorize("#BFB8B8") + "ᴅᴀɢɢᴇʀs",
                                ChatColor.GRAY.toString() + "Shoot 5 daggers, if a player is hit with one ",
                                ChatColor.GRAY.toString() + " they take 3 hearts of damage and their gem is ",
                                ChatColor.GRAY.toString() + " disabled for 10 seconds for every dagger they're hit with.",
                                ChatColor.DARK_RED.toString() + "\uD83E\uDD3C " + ChatColor.GRAY + "Enter the body of that player, exit by crouching or",
                                ChatColor.GRAY.toString() + " when that player receives damage. Leaving the body",
                                ChatColor.GRAY.toString() + " will haunt them disabling their gem for 10 seconds",
                                ChatColor.WHITE.toString() + "",
                                ChatColor.GRAY.toString() + "-" + ChatColor.WHITE + "\uD83D\uDC7B " + colorize("#AABBBF") + "ᴀsᴛʀᴀʟ ᴘʀᴏᴊᴇᴄᴛɪᴏɴ",
                                ChatColor.GRAY.toString() + " Become a projection and explore in a 150 block ",
                                ChatColor.GRAY.toString() + " radius. Spook players by left clicking with your gem,",
                                ChatColor.GRAY.toString() + " or tag them with right click, tagging makes that player glow for you, ",
                                ChatColor.GRAY.toString() + " You exit the Astral state if your npc is hit,",
                                ChatColor.GRAY.toString() + " or you click the air with an empty hand"
                            )
                        )
                    }


                    if (energy == Energy.Broken) {
                        itemMeta.setCustomModelData(96)
                        itemMeta.setLore(
                            Arrays.asList<String?>(
                                ChatColor.WHITE.toString() + "" + ChatColor.BOLD + "ᴜsᴇʟᴇss"
                            )
                        )
                    }
                    item.setItemMeta(itemMeta)
                    return item
                }


                if (season == 3) {
                    val item = ItemStack(Material.PRISMARINE_SHARD, 1)
                    val itemMeta = item.getItemMeta()


                    val idkey = NamespacedKey(instance!!, "gem-id")
                    itemMeta.getPersistentDataContainer()
                        .set<String?, String?>(idkey, PersistentDataType.STRING, "035f2f4a-0070-40d2-9bb2-3b38c4208bcf")

                    val tierkey = NamespacedKey(instance!!, "gem-tier")
                    itemMeta.getPersistentDataContainer().set<Int?, Int?>(tierkey, PersistentDataType.INTEGER, tier)

                    val typekey = NamespacedKey(instance!!, "gem-type")
                    itemMeta.getPersistentDataContainer()
                        .set<String?, String?>(typekey, PersistentDataType.STRING, "astra")

                    val quicknodropkey = NamespacedKey(instance!!, "quick-no-drop")
                    itemMeta.getPersistentDataContainer()
                        .set<Int?, Int?>(quicknodropkey, PersistentDataType.INTEGER, quicknodrop)

                    val quicknoremovekey = NamespacedKey(instance!!, "quick-no-remove")
                    itemMeta.getPersistentDataContainer()
                        .set<Int?, Int?>(quicknoremovekey, PersistentDataType.INTEGER, quicknoremove)


                    itemMeta.setDisplayName(colorize("#A01FFF") + ChatColor.BOLD + "ᴀsᴛʀᴀ " + colorize("#FFD773") + "ɢᴇᴍ")
                    for (flag in ItemFlag.entries) itemMeta.addItemFlags(flag)

                    if (Gem.Companion.isPristineorHigher(energy) || energy == Energy.Scratched) {
                        if (energy == Energy.Pristine_5) itemMeta.addEnchant(CompEnchantment.DURABILITY, 1, true)
                        if (energy == Energy.Scratched) itemMeta.setCustomModelData(34)
                        else itemMeta.setCustomModelData(14)
                        var gemthingylols = "🔮 "
                        if (energy == Energy.Scratched) gemthingylols = "\uD83D\uDD3A "
                        itemMeta.setLore(
                            Arrays.asList<String?>(
                                ChatColor.WHITE.toString() + "" + ChatColor.BOLD + "ᴍᴀɴᴀɢᴇ ᴛʜᴇ ᴛɪᴅᴇs ᴏғ ᴛʜᴇ ᴄᴏsᴍᴏs ",
                                colorize("&f(") + energystage + colorize("&7)"),
                                colorize("#A01FFF") + gemthingylols + colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                ChatColor.GRAY.toString() + "- Phasing",
                                ChatColor.GRAY.toString() + "- Soul Healing",
                                ChatColor.GRAY.toString() + "- Soul Capture",
                                colorize("#A01FFF") + " ",
                                ChatColor.GRAY.toString() + " ",
                                colorize("#A01FFF") + "🔮" + " " + colorize("#82F3FF") + ChatColor.BOLD + "ᴀʙɪʟɪᴛʏ",
                                ChatColor.GRAY.toString() + "- " + colorize("#A01FFF") + "Dimensional Drift",
                                ChatColor.WHITE.toString() + "",
                                colorize("#A01FFF") + "🔮 " + colorize("#B8FFFB") + ChatColor.BOLD + "ᴘᴏᴡᴇʀs",
                                ChatColor.GRAY.toString() + "- " + ChatColor.WHITE + "🔪 " + colorize("#BFB8B8") + "ᴅᴀɢɢᴇʀs " + ChatColor.DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                                ChatColor.GRAY.toString() + "- " + ChatColor.WHITE + "🔪 " + ChatColor.GRAY + "ᴜɴʙᴏᴜɴᴅᴇᴅ " + ChatColor.DARK_RED + "\uD83E\uDD3C",
                                ChatColor.WHITE.toString() + "",
                                ChatColor.GRAY.toString() + "- " + ChatColor.WHITE + "👻 " + colorize("#AABBBF") + "ᴀsᴛʀᴀʟ ᴘʀᴏᴊᴇᴄᴛɪᴏɴ " + ChatColor.GREEN + "\uD83E\uDDD1\uD83C\uDFFB",
                                ChatColor.GRAY.toString() + "- " + ChatColor.WHITE + "👻 " + colorize("#AABBBF") + "ᴀsᴛʀᴀʟ ᴠᴏɪᴅ " + ChatColor.GREEN + "\uD83E\uDD3C"
                            )
                        )
                    }

                    if (energy == Energy.Cracked) {
                        itemMeta.setCustomModelData(54)
                        itemMeta.setLore(
                            Arrays.asList<String?>(
                                ChatColor.WHITE.toString() + "" + ChatColor.BOLD + "ᴍᴀɴᴀɢᴇ ᴛʜᴇ ᴛɪᴅᴇs ᴏғ ᴛʜᴇ ᴄᴏsᴍᴏs ",
                                colorize("&f(") + energystage + colorize("&7)"),
                                colorize("#A01FFF") + "🔮 " + colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                ChatColor.GRAY.toString() + "- Soul Healing",
                                ChatColor.GRAY.toString() + "- Soul Capture",
                                colorize("#A01FFF") + " ",
                                ChatColor.GRAY.toString() + " ",
                                colorize("#A01FFF") + "🔮" + " " + colorize("#82F3FF") + ChatColor.BOLD + "ᴀʙɪʟɪᴛʏ",
                                ChatColor.GRAY.toString() + "- " + colorize("#A01FFF") + "Dimensional Drift",
                                ChatColor.WHITE.toString() + "",
                                colorize("#A01FFF") + "🔮 " + colorize("#B8FFFB") + ChatColor.BOLD + "ᴘᴏᴡᴇʀs",
                                ChatColor.GRAY.toString() + "- " + ChatColor.WHITE + "🔪 " + colorize("#BFB8B8") + "ᴅᴀɢɢᴇʀs " + ChatColor.DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                                ChatColor.GRAY.toString() + "- " + ChatColor.WHITE + "🔪 " + ChatColor.GRAY + "ᴜɴʙᴏᴜɴᴅᴇᴅ " + ChatColor.DARK_RED + "\uD83E\uDD3C",
                                ChatColor.WHITE.toString() + "",
                                ChatColor.GRAY.toString() + "- " + ChatColor.WHITE + "👻 " + colorize("#AABBBF") + "ᴀsᴛʀᴀʟ ᴘʀᴏᴊᴇᴄᴛɪᴏɴ " + ChatColor.GREEN + "\uD83E\uDDD1\uD83C\uDFFB",
                                ChatColor.GRAY.toString() + "- " + ChatColor.WHITE + "👻 " + colorize("#AABBBF") + "ᴀsᴛʀᴀʟ ᴠᴏɪᴅ " + ChatColor.GREEN + "\uD83E\uDD3C"
                            )
                        )
                    }

                    if (energy == Energy.Damaged) {
                        itemMeta.setCustomModelData(74)
                        itemMeta.setLore(
                            Arrays.asList<String?>(
                                ChatColor.WHITE.toString() + "" + ChatColor.BOLD + "ᴍᴀɴᴀɢᴇ ᴛʜᴇ ᴛɪᴅᴇs ᴏғ ᴛʜᴇ ᴄᴏsᴍᴏs ",
                                colorize("&f(") + energystage + colorize("&7)"),
                                colorize("#A01FFF") + " ",
                                colorize("#A01FFF") + "\uD83D\uDD3A " + colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                ChatColor.GRAY.toString() + "- Phasing",
                                ChatColor.GRAY.toString() + "- Soul Healing",
                                ChatColor.GRAY.toString() + " ",
                                colorize("#A01FFF") + "🔮" + " " + colorize("#82F3FF") + ChatColor.BOLD + "ᴀʙɪʟɪᴛʏ",
                                ChatColor.GRAY.toString() + "- " + colorize("#A01FFF") + "Dimensional Drift",
                                ChatColor.WHITE.toString() + "",
                                colorize("#A01FFF") + "🔮 " + colorize("#B8FFFB") + ChatColor.BOLD + "ᴘᴏᴡᴇʀs",
                                ChatColor.GRAY.toString() + "- " + ChatColor.WHITE + "🔪 " + colorize("#BFB8B8") + "ᴅᴀɢɢᴇʀs " + ChatColor.DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                                ChatColor.GRAY.toString() + "- " + ChatColor.WHITE + "🔪 " + ChatColor.GRAY + "ᴜɴʙᴏᴜɴᴅᴇᴅ " + ChatColor.DARK_RED + "\uD83E\uDD3C",
                                ChatColor.WHITE.toString() + "",
                                ChatColor.GRAY.toString() + "- " + ChatColor.WHITE + "👻 " + colorize("#AABBBF") + "ᴀsᴛʀᴀʟ ᴘʀᴏᴊᴇᴄᴛɪᴏɴ " + ChatColor.GREEN + "\uD83E\uDDD1\uD83C\uDFFB",
                                ChatColor.GRAY.toString() + "- " + ChatColor.WHITE + "👻 " + colorize("#AABBBF") + "ᴀsᴛʀᴀʟ ᴠᴏɪᴅ " + ChatColor.GREEN + "\uD83E\uDD3C"
                            )
                        )
                    }

                    if (energy == Energy.Ruined) {
                        itemMeta.setCustomModelData(94)
                        itemMeta.setLore(
                            Arrays.asList<String?>(
                                ChatColor.WHITE.toString() + "" + ChatColor.BOLD + "ᴍᴀɴᴀɢᴇ ᴛʜᴇ ᴛɪᴅᴇs ᴏғ ᴛʜᴇ ᴄᴏsᴍᴏs ",
                                colorize("&f(") + energystage + colorize("&7)"),
                                colorize("#A01FFF") + " ",
                                colorize("#A01FFF") + "🔮 " + colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                ChatColor.GRAY.toString() + "No Passives",
                                ChatColor.GRAY.toString() + " ",
                                colorize("#A01FFF") + "🔮" + " " + colorize("#82F3FF") + ChatColor.BOLD + "ᴀʙɪʟɪᴛʏ",
                                ChatColor.GRAY.toString() + "- " + colorize("#A01FFF") + "Dimensional Drift",
                                ChatColor.WHITE.toString() + "",
                                colorize("#A01FFF") + "🔮 " + colorize("#B8FFFB") + ChatColor.BOLD + "ᴘᴏᴡᴇʀs",
                                ChatColor.GRAY.toString() + "- " + ChatColor.WHITE + "🔪 " + colorize("#BFB8B8") + "ᴅᴀɢɢᴇʀs " + ChatColor.DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                                ChatColor.GRAY.toString() + "- " + ChatColor.WHITE + "🔪 " + ChatColor.GRAY + "ᴜɴʙᴏᴜɴᴅᴇᴅ " + ChatColor.DARK_RED + "\uD83E\uDD3C",
                                ChatColor.WHITE.toString() + "",
                                ChatColor.GRAY.toString() + "- " + ChatColor.WHITE + "👻 " + colorize("#AABBBF") + "ᴀsᴛʀᴀʟ ᴘʀᴏᴊᴇᴄᴛɪᴏɴ " + ChatColor.GREEN + "\uD83E\uDDD1\uD83C\uDFFB",
                                ChatColor.GRAY.toString() + "- " + ChatColor.WHITE + "👻 " + colorize("#AABBBF") + "ᴀsᴛʀᴀʟ ᴠᴏɪᴅ " + ChatColor.GREEN + "\uD83E\uDD3C"
                            )
                        )
                    }


                    if (energy == Energy.Broken) {
                        itemMeta.setCustomModelData(100)
                        for (flag in ItemFlag.entries) itemMeta.addItemFlags(flag)
                        itemMeta.setLore(
                            Arrays.asList<String?>(
                                ChatColor.WHITE.toString() + "" + ChatColor.BOLD + "ᴜsᴇʟᴇss"
                            )
                        )
                    }
                    item.setItemMeta(itemMeta)
                    return item
                }
            }


            //Flux
            if (gem == GemType.Flux) if (season == 3) {
                val item = ItemStack(Material.PRISMARINE_SHARD, 1)
                val itemMeta = item.getItemMeta()


                val idkey = NamespacedKey(instance!!, "gem-id")
                itemMeta.getPersistentDataContainer()
                    .set<String?, String?>(idkey, PersistentDataType.STRING, "fb1c4eab-dfae-4302-9441-47026b6d33ae")

                val tierkey = NamespacedKey(instance!!, "gem-tier")
                itemMeta.getPersistentDataContainer().set<Int?, Int?>(tierkey, PersistentDataType.INTEGER, tier)

                val typekey = NamespacedKey(instance!!, "gem-type")
                itemMeta.getPersistentDataContainer().set<String?, String?>(typekey, PersistentDataType.STRING, "flux")

                val quicknodropkey = NamespacedKey(instance!!, "quick-no-drop")
                itemMeta.getPersistentDataContainer()
                    .set<Int?, Int?>(quicknodropkey, PersistentDataType.INTEGER, quicknodrop)

                val quicknoremovekey = NamespacedKey(instance!!, "quick-no-remove")
                itemMeta.getPersistentDataContainer()
                    .set<Int?, Int?>(quicknoremovekey, PersistentDataType.INTEGER, quicknoremove)


                itemMeta.setDisplayName(colorize("#5ED7FF") + ChatColor.BOLD + "ғʟᴜx " + colorize("#FFD773") + "ɢᴇᴍ")
                for (flag in ItemFlag.entries) itemMeta.addItemFlags(flag)

                if (Gem.Companion.isPristineorHigher(energy)) {
                    if (energy == Energy.Pristine_5) itemMeta.addEnchant(CompEnchantment.DURABILITY, 1, true)

                    itemMeta.setCustomModelData(16)
                    itemMeta.setLore(
                        Arrays.asList<String?>(
                            ChatColor.WHITE.toString() + "" + ChatColor.BOLD + "ᴇᴠᴇʀʏᴛʜɪɴɢ ɪs ᴀ ғʟᴜᴄᴛᴜᴀᴛɪᴏɴ",
                            colorize("&f(") + energystage + colorize("&7) "),
                            colorize("#03EAFF") + "🔮 " + colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                            ChatColor.GRAY.toString() + "- Flow State",
                            ChatColor.GRAY.toString() + "- Shocking Chance",
                            ChatColor.GRAY.toString() + "- Tireless",
                            ChatColor.GRAY.toString() + "- Conduction",
                            ChatColor.GRAY.toString() + "- Charged",
                            ChatColor.WHITE.toString() + " ",
                            colorize("#03EAFF") + "🔮 " + colorize("#82F3FF") + ChatColor.BOLD + " ᴀʙɪʟɪᴛʏ",
                            ChatColor.GRAY.toString() + "- " + colorize("#03EAFF") + "Kinetic Burst",
                            ChatColor.WHITE.toString() + "",
                            colorize("#03EAFF") + "🔮 " + colorize("#B8FFFB") + ChatColor.BOLD + "ᴘᴏᴡᴇʀs",
                            ChatColor.GRAY.toString() + "- ☄ " + colorize("#03EAFF") + "ᴇɴᴇʀɢʏ ʙᴇᴀᴍ " + ChatColor.DARK_RED + "🧑🏻",
                            ChatColor.GRAY.toString() + "- ☄ " + colorize("#03EAFF") + "ɢʀᴏᴜɴᴅ " + ChatColor.GRAY + " " + ChatColor.DARK_RED + "🤼",
                            ChatColor.WHITE.toString() + "",
                            ChatColor.GRAY.toString() + "- 🌀 " + colorize("#03EAFF") + "Kinetic Overdrive " + ChatColor.GREEN + "🤼"
                        )
                    )
                }

                if (energy == Energy.Scratched) {
                    itemMeta.setCustomModelData(36)
                    itemMeta.setLore(
                        Arrays.asList<String?>(
                            ChatColor.WHITE.toString() + "" + ChatColor.BOLD + "ᴇᴠᴇʀʏᴛʜɪɴɢ ɪs ᴀ ғʟᴜᴄᴛᴜᴀᴛɪᴏɴ",
                            colorize("&f(") + energystage + colorize("&7) "),
                            colorize("#03EAFF") + "🔮 " + colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                            ChatColor.GRAY.toString() + "- Flow State",
                            ChatColor.GRAY.toString() + "- Shocking Chance",
                            ChatColor.GRAY.toString() + "- Conduction",
                            ChatColor.WHITE.toString() + " ",
                            colorize("#03EAFF") + "🔮 " + colorize("#82F3FF") + ChatColor.BOLD + " ᴀʙɪʟɪᴛʏ",
                            ChatColor.GRAY.toString() + "- " + colorize("#03EAFF") + "Kinetic Burst",
                            ChatColor.WHITE.toString() + "",
                            colorize("#03EAFF") + "🔮 " + colorize("#B8FFFB") + ChatColor.BOLD + "ᴘᴏᴡᴇʀs",
                            ChatColor.GRAY.toString() + "- ☄ " + colorize("#03EAFF") + "ᴇɴᴇʀɢʏ ʙᴇᴀᴍ " + ChatColor.DARK_RED + "🧑🏻",
                            ChatColor.GRAY.toString() + "- ☄ " + colorize("#03EAFF") + "ɢʀᴏᴜɴᴅ " + ChatColor.GRAY + " " + ChatColor.DARK_RED + "🤼",
                            ChatColor.WHITE.toString() + "",
                            ChatColor.GRAY.toString() + "- 🌀 " + colorize("#03EAFF") + "Kinetic Overdrive " + ChatColor.GREEN + "🤼"
                        )
                    )
                }

                if (energy == Energy.Cracked) {
                    itemMeta.setCustomModelData(56)
                    itemMeta.setLore(
                        Arrays.asList<String?>(
                            ChatColor.WHITE.toString() + "" + ChatColor.BOLD + "ᴇᴠᴇʀʏᴛʜɪɴɢ ɪs ᴀ ғʟᴜᴄᴛᴜᴀᴛɪᴏɴ",
                            colorize("&f(") + energystage + colorize("&7) "),
                            colorize("#03EAFF") + "🔮 " + colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                            ChatColor.GRAY.toString() + "- Flow State",
                            ChatColor.GRAY.toString() + "- Shocking Chance",
                            ChatColor.WHITE.toString() + " ",
                            colorize("#03EAFF") + "🔮 " + colorize("#82F3FF") + ChatColor.BOLD + " ᴀʙɪʟɪᴛʏ",
                            ChatColor.GRAY.toString() + "- " + colorize("#03EAFF") + "Kinetic Burst",
                            ChatColor.WHITE.toString() + "",
                            colorize("#03EAFF") + "🔮 " + colorize("#B8FFFB") + ChatColor.BOLD + "ᴘᴏᴡᴇʀs",
                            ChatColor.GRAY.toString() + "- ☄ " + colorize("#03EAFF") + "ᴇɴᴇʀɢʏ ʙᴇᴀᴍ " + ChatColor.DARK_RED + "🧑🏻",
                            ChatColor.GRAY.toString() + "- ☄ " + colorize("#03EAFF") + "ɢʀᴏᴜɴᴅ " + ChatColor.GRAY + " " + ChatColor.DARK_RED + "🤼",
                            ChatColor.WHITE.toString() + "",
                            ChatColor.GRAY.toString() + "- 🌀 " + colorize("#03EAFF") + "Kinetic Overdrive " + ChatColor.GREEN + "🤼"
                        )
                    )
                }

                if (energy == Energy.Damaged) {
                    itemMeta.setCustomModelData(76)
                    itemMeta.setLore(
                        Arrays.asList<String?>(
                            ChatColor.WHITE.toString() + "" + ChatColor.BOLD + "ᴇᴠᴇʀʏᴛʜɪɴɢ ɪs ᴀ ғʟᴜᴄᴛᴜᴀᴛɪᴏɴ",
                            colorize("&f(") + energystage + colorize("&7) "),
                            colorize("#03EAFF") + "🔮 " + colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                            ChatColor.GRAY.toString() + "- Flow State",
                            ChatColor.WHITE.toString() + " ",
                            colorize("#03EAFF") + "🔮 " + colorize("#82F3FF") + ChatColor.BOLD + " ᴀʙɪʟɪᴛʏ",
                            ChatColor.GRAY.toString() + "- " + colorize("#03EAFF") + "Kinetic Burst",
                            ChatColor.WHITE.toString() + "",
                            colorize("#03EAFF") + "🔮 " + colorize("#B8FFFB") + ChatColor.BOLD + "ᴘᴏᴡᴇʀs",
                            ChatColor.GRAY.toString() + "- ☄ " + colorize("#03EAFF") + "ᴇɴᴇʀɢʏ ʙᴇᴀᴍ " + ChatColor.DARK_RED + "🧑🏻",
                            ChatColor.GRAY.toString() + "- ☄ " + colorize("#03EAFF") + "ɢʀᴏᴜɴᴅ " + ChatColor.GRAY + " " + ChatColor.DARK_RED + "🤼",
                            ChatColor.WHITE.toString() + "",
                            ChatColor.GRAY.toString() + "- 🌀 " + colorize("#03EAFF") + "Kinetic Overdrive " + ChatColor.GREEN + "🤼"
                        )
                    )
                }

                if (energy == Energy.Ruined) {
                    itemMeta.setCustomModelData(96)
                    itemMeta.setLore(
                        Arrays.asList<String?>(
                            ChatColor.WHITE.toString() + "" + ChatColor.BOLD + "ᴇᴠᴇʀʏᴛʜɪɴɢ ɪs ᴀ ғʟᴜᴄᴛᴜᴀᴛɪᴏɴ",
                            colorize("&f(") + energystage + colorize("&7) "),
                            colorize("#03EAFF") + "🔮 " + colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                            ChatColor.GRAY.toString() + "No Passives",
                            ChatColor.WHITE.toString() + " ",
                            colorize("#03EAFF") + "🔮 " + colorize("#82F3FF") + ChatColor.BOLD + " ᴀʙɪʟɪᴛʏ",
                            ChatColor.GRAY.toString() + "- " + colorize("#03EAFF") + "Kinetic Burst",
                            ChatColor.WHITE.toString() + "",
                            colorize("#03EAFF") + "🔮 " + colorize("#B8FFFB") + ChatColor.BOLD + "ᴘᴏᴡᴇʀs",
                            ChatColor.GRAY.toString() + "- ☄ " + colorize("#03EAFF") + "ᴇɴᴇʀɢʏ ʙᴇᴀᴍ " + ChatColor.DARK_RED + "🧑🏻",
                            ChatColor.GRAY.toString() + "- ☄ " + colorize("#03EAFF") + "ɢʀᴏᴜɴᴅ " + ChatColor.GRAY + " " + ChatColor.DARK_RED + "🤼",
                            ChatColor.WHITE.toString() + "",
                            ChatColor.GRAY.toString() + "- 🌀 " + colorize("#03EAFF") + "Kinetic Overdrive " + ChatColor.GREEN + "🤼"
                        )
                    )
                }


                if (energy == Energy.Broken) {
                    itemMeta.setCustomModelData(100)
                    for (flag in ItemFlag.entries) itemMeta.addItemFlags(flag)
                    itemMeta.setLore(
                        Arrays.asList<String?>(
                            ChatColor.WHITE.toString() + "" + ChatColor.BOLD + "ᴜsᴇʟᴇss"
                        )
                    )
                }
                item.setItemMeta(itemMeta)
                return item
            }

            if (gem == GemType.Fire) {
                if (season == 1) {
                    val item = ItemStack(Material.PRISMARINE_SHARD, 1)
                    val itemMeta = item.getItemMeta()


                    val idkey = NamespacedKey(instance!!, "shard_id")
                    itemMeta.getPersistentDataContainer()
                        .set<String?, String?>(idkey, PersistentDataType.STRING, UUID.randomUUID().toString())

                    itemMeta.setDisplayName(colorize("#FE8120") + ChatColor.BOLD + "Fire " + colorize("#FFD773") + "Gem")


                    // Set HideFlags to 127 if server is lower than 1.20.6, if yes: then hide all flags.
                    // due to the nbt change, it is not possible to make everything 1-1 for people using 1.20.6 and higher.
                    if (OlderThanNBTChange()) {
                        CompItemFlag.HIDE_ENCHANTS.applyTo(item)
                        CompItemFlag.HIDE_ATTRIBUTES.applyTo(item)
                        CompItemFlag.HIDE_UNBREAKABLE.applyTo(item)
                        CompItemFlag.HIDE_DESTROYS.applyTo(item)
                        CompItemFlag.HIDE_PLACED_ON.applyTo(item)
                        CompItemFlag.HIDE_POTION_EFFECTS.applyTo(item)
                        CompItemFlag.HIDE_DYE.applyTo(item)
                    } else for (flag in ItemFlag.entries) itemMeta.addItemFlags(flag)


                    itemMeta.setCustomModelData(2)
                    itemMeta.setLore(
                        Arrays.asList<String?>(
                            ChatColor.WHITE.toString() + "" + ChatColor.BOLD + "Control fire and become fire",
                            colorize("#FFE4AB") + "Passives",
                            ChatColor.GRAY.toString() + " " + colorize("#FE8120") + "🔮 Auto Smelting Longer FireThorns",
                            ChatColor.GRAY.toString() + " Fire Aspect 2, Flame",
                            ChatColor.WHITE.toString() + " ",
                            colorize("#B8FFFB") + ChatColor.BOLD + "Powers",
                            ChatColor.GRAY.toString() + "-" + ChatColor.WHITE + "\uD83E\uDDE8 " + colorize("#FF5F33") + "Fireball",
                            ChatColor.GRAY.toString() + " Spawns a fireball that charges up",
                            ChatColor.GRAY.toString() + " when on obsidian, lava, fire, netherack",
                            ChatColor.GRAY.toString() + " and magma, when fully charged can one shot",
                            ChatColor.GRAY.toString() + " protection 4 netherite players",
                            ChatColor.WHITE.toString() + "",
                            ChatColor.GRAY.toString() + "-" + ChatColor.WHITE + "\uD83E\uDD7E " + colorize("#248FD1") + "Cozy Campfire",
                            ChatColor.GRAY.toString() + " Spawns a campfire that heals when near it"
                        )
                    )

                    item.setItemMeta(itemMeta)
                    return item
                }


                if (season == 2) {
                    val item = ItemStack(Material.PRISMARINE_SHARD, 1)
                    val itemMeta = item.getItemMeta()


                    val idkey = NamespacedKey(instance!!, "gem-id")
                    itemMeta.getPersistentDataContainer()
                        .set<String?, String?>(idkey, PersistentDataType.STRING, UUID.randomUUID().toString())

                    val tierkey = NamespacedKey(instance!!, "gem-tier")
                    itemMeta.getPersistentDataContainer().set<Int?, Int?>(tierkey, PersistentDataType.INTEGER, tier)

                    val typekey = NamespacedKey(instance!!, "gem-type")
                    itemMeta.getPersistentDataContainer()
                        .set<String?, String?>(typekey, PersistentDataType.STRING, "fire")

                    val quicknodropkey = NamespacedKey(instance!!, "quick-no-drop")
                    itemMeta.getPersistentDataContainer()
                        .set<Int?, Int?>(quicknodropkey, PersistentDataType.INTEGER, quicknodrop)

                    val quicknoremovekey = NamespacedKey(instance!!, "quick-no-remove")
                    itemMeta.getPersistentDataContainer()
                        .set<Int?, Int?>(quicknoremovekey, PersistentDataType.INTEGER, quicknoremove)


                    itemMeta.setDisplayName(colorize("#FE8120") + ChatColor.BOLD + "ғɪʀᴇ " + colorize("#FFD773") + "ɢᴇᴍ")
                    for (flag in ItemFlag.entries) itemMeta.addItemFlags(flag)

                    if (Gem.Companion.isPristineorHigher(energy)) {
                        if (energy == Energy.Pristine_5) itemMeta.addEnchant(CompEnchantment.DURABILITY, 1, true)

                        itemMeta.setCustomModelData(2)
                        itemMeta.setLore(
                            Arrays.asList<String?>(
                                ChatColor.WHITE.toString() + "" + ChatColor.BOLD + "ᴍᴀɴɪᴘᴜʟᴀᴛᴇ ғɪʀᴇ",
                                colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                energystage,
                                ChatColor.GRAY.toString() + " " + colorize("#FE8120") + "🔮 " + ChatColor.GRAY + "Auto Smelting. Longer FireThorns.",
                                ChatColor.GRAY.toString() + " Auto Enchant Flame & Fire Aspect 2",
                                ChatColor.WHITE.toString() + " ",
                                colorize("#B8FFFB") + ChatColor.BOLD + "ᴘᴏᴡᴇʀs",
                                ChatColor.GRAY.toString() + "-" + ChatColor.WHITE + "\uD83E\uDDE8" + colorize("#FF5F33") + " ғɪʀᴇʙᴀʟʟ",
                                ChatColor.GRAY.toString() + " Spawn a fireball that charges up passively,",
                                ChatColor.GRAY.toString() + " while standing on fire blocks, charge 2x faster.",
                                ChatColor.GRAY.toString() + " Deals more damage the more you charge it.",
                                ChatColor.WHITE.toString() + "",
                                ChatColor.GRAY.toString() + "-" + ChatColor.WHITE + "\uD83E\uDD7E " + colorize("#248FD1") + "ᴄᴏᴢʏ Cᴀᴍᴘғɪʀᴇ",
                                ChatColor.GRAY.toString() + " Spawn a campfire that heals 2 hearts and hunger",
                                ChatColor.GRAY.toString() + " a second in a 4 block radius"
                            )
                        )
                    }

                    if (energy == Energy.Scratched) {
                        itemMeta.setCustomModelData(22)
                        itemMeta.setLore(
                            Arrays.asList<String?>(
                                ChatColor.WHITE.toString() + "" + ChatColor.BOLD + "ᴍᴀɴɪᴘᴜʟᴀᴛᴇ ғɪʀᴇ",
                                colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                energystage,
                                ChatColor.GRAY.toString() + " " + colorize("#FE8120") + "🔮 " + "Longer FireThorns. Fire Res.",
                                ChatColor.GRAY.toString() + " Auto Enchant Flame & Fire Aspect 2",
                                ChatColor.WHITE.toString() + " ",
                                colorize("#B8FFFB") + ChatColor.BOLD + "ᴘᴏᴡᴇʀs",
                                ChatColor.GRAY.toString() + "-" + ChatColor.WHITE + "\uD83E\uDDE8" + colorize("#FF5F33") + " ғɪʀᴇʙᴀʟʟ",
                                ChatColor.GRAY.toString() + " Spawn a fireball that charges up passively,",
                                ChatColor.GRAY.toString() + " while standing on fire blocks charge 2x faster.",
                                ChatColor.GRAY.toString() + " Deals more damage the more you charge it.",
                                ChatColor.WHITE.toString() + "",
                                ChatColor.GRAY.toString() + "-" + ChatColor.WHITE + "\uD83E\uDD7E " + colorize("#248FD1") + "ᴄᴏᴢʏ Cᴀᴍᴘғɪʀᴇ",
                                ChatColor.GRAY.toString() + " Spawn a campfire that heals 2 hearts and hunger",
                                ChatColor.GRAY.toString() + " a second in a 4 block radius"
                            )
                        )
                    }

                    if (energy == Energy.Cracked) {
                        itemMeta.setCustomModelData(42)
                        itemMeta.setLore(
                            Arrays.asList<String?>(
                                ChatColor.WHITE.toString() + "" + ChatColor.BOLD + "ᴍᴀɴɪᴘᴜʟᴀᴛᴇ ғɪʀᴇ",
                                colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                energystage,
                                ChatColor.GRAY.toString() + " " + colorize("#FE8120") + "🔮 " + "Fire Res.",
                                ChatColor.GRAY.toString() + " Auto Enchant Flame & Fire Aspect",
                                ChatColor.WHITE.toString() + " ",
                                colorize("#B8FFFB") + ChatColor.BOLD + "ᴘᴏᴡᴇʀs",
                                ChatColor.GRAY.toString() + "-" + ChatColor.WHITE + "\uD83E\uDDE8" + colorize("#FF5F33") + " ғɪʀᴇʙᴀʟʟ",
                                ChatColor.GRAY.toString() + " Spawn a fireball that charges up passively,",
                                ChatColor.GRAY.toString() + " while standing on fire blocks charge 2x faster.",
                                ChatColor.GRAY.toString() + " Deals more damage the more you charge it.",
                                ChatColor.WHITE.toString() + "",
                                ChatColor.GRAY.toString() + "-" + ChatColor.WHITE + "\uD83E\uDD7E " + colorize("#248FD1") + "ᴄᴏᴢʏ Cᴀᴍᴘғɪʀᴇ",
                                ChatColor.GRAY.toString() + " Spawn a campfire that heals 2 hearts and hunger",
                                ChatColor.GRAY.toString() + " a second in a 4 block radius"
                            )
                        )
                    }

                    if (energy == Energy.Damaged) {
                        itemMeta.setCustomModelData(62)
                        itemMeta.setLore(
                            Arrays.asList<String?>(
                                ChatColor.WHITE.toString() + "" + ChatColor.BOLD + "ᴍᴀɴɪᴘᴜʟᴀᴛᴇ ғɪʀᴇ",
                                colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                energystage,
                                ChatColor.GRAY.toString() + " " + colorize("#FE8120") + "🔮 " + "Auto Enchant Flame",
                                ChatColor.WHITE.toString() + " ",
                                colorize("#B8FFFB") + ChatColor.BOLD + "ᴘᴏᴡᴇʀs",
                                ChatColor.GRAY.toString() + "-" + ChatColor.WHITE + "\uD83E\uDDE8" + colorize("#FF5F33") + " ғɪʀᴇʙᴀʟʟ",
                                ChatColor.GRAY.toString() + " Spawn a fireball that charges up passively,",
                                ChatColor.GRAY.toString() + " while standing on fire blocks charge 2x faster.",
                                ChatColor.GRAY.toString() + " Deals more damage the more you charge it",
                                ChatColor.WHITE.toString() + "",
                                ChatColor.GRAY.toString() + "-" + ChatColor.WHITE + "\uD83E\uDD7E " + colorize("#248FD1") + "ᴄᴏᴢʏ Cᴀᴍᴘғɪʀᴇ",
                                ChatColor.GRAY.toString() + " Spawn a campfire that heals 2 hearts and hunger",
                                ChatColor.GRAY.toString() + " a second in a 4 block radius"
                            )
                        )
                    }

                    if (energy == Energy.Ruined) {
                        itemMeta.setCustomModelData(82)
                        itemMeta.setLore(
                            Arrays.asList<String?>(
                                ChatColor.WHITE.toString() + "" + ChatColor.BOLD + "ᴍᴀɴɪᴘᴜʟᴀᴛᴇ ғɪʀᴇ",
                                colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                energystage,
                                ChatColor.GRAY.toString() + " " + colorize("#FE8120") + "🔮 " + "No passives",
                                ChatColor.WHITE.toString() + " ",
                                colorize("#B8FFFB") + ChatColor.BOLD + "ᴘᴏᴡᴇʀs",
                                ChatColor.GRAY.toString() + "-" + ChatColor.WHITE + "\uD83E\uDDE8" + colorize("#FF5F33") + " ғɪʀᴇʙᴀʟʟ",
                                ChatColor.GRAY.toString() + " Spawn a fireball that charges up passively,",
                                ChatColor.GRAY.toString() + " while standing on fire blocks charge 2x faster.",
                                ChatColor.GRAY.toString() + " Deals more damage the more you charge it",
                                ChatColor.WHITE.toString() + "",
                                ChatColor.GRAY.toString() + "-" + ChatColor.WHITE + "\uD83E\uDD7E " + colorize("#248FD1") + "ᴄᴏᴢʏ Cᴀᴍᴘғɪʀᴇ",
                                ChatColor.GRAY.toString() + " Spawn a campfire that heals 2 hearts and hunger",
                                ChatColor.GRAY.toString() + " a second in a 4 block radius"
                            )
                        )
                    }


                    if (energy == Energy.Broken) {
                        itemMeta.setCustomModelData(96)
                        itemMeta.setLore(
                            Arrays.asList<String?>(
                                ChatColor.WHITE.toString() + "" + ChatColor.BOLD + "ᴜsᴇʟᴇss"
                            )
                        )
                    }
                    item.setItemMeta(itemMeta)
                    return item
                }
                if (season == 3) {
                    val item = ItemStack(Material.PRISMARINE_SHARD, 1)
                    val itemMeta = item.getItemMeta()


                    val idkey = NamespacedKey(instance!!, "gem-id")
                    itemMeta.getPersistentDataContainer()
                        .set<String?, String?>(idkey, PersistentDataType.STRING, "f3580015-6d14-4cfb-bd46-2eef14ce75e7")

                    val tierkey = NamespacedKey(instance!!, "gem-tier")
                    itemMeta.getPersistentDataContainer().set<Int?, Int?>(tierkey, PersistentDataType.INTEGER, tier)

                    val typekey = NamespacedKey(instance!!, "gem-type")
                    itemMeta.getPersistentDataContainer()
                        .set<String?, String?>(typekey, PersistentDataType.STRING, "fire")

                    val quicknodropkey = NamespacedKey(instance!!, "quick-no-drop")
                    itemMeta.getPersistentDataContainer()
                        .set<Int?, Int?>(quicknodropkey, PersistentDataType.INTEGER, quicknodrop)

                    val quicknoremovekey = NamespacedKey(instance!!, "quick-no-remove")
                    itemMeta.getPersistentDataContainer()
                        .set<Int?, Int?>(quicknoremovekey, PersistentDataType.INTEGER, quicknoremove)

                    for (flag in ItemFlag.entries) itemMeta.addItemFlags(flag)
                    itemMeta.setDisplayName(colorize("#FE8120") + ChatColor.BOLD + "ғɪʀᴇ " + colorize("#FFD773") + "ɢᴇᴍ")
                    if (Gem.Companion.isPristineorHigher(energy)) {
                        if (energy == Energy.Pristine_5) itemMeta.addEnchant(CompEnchantment.DURABILITY, 1, true)

                        itemMeta.setCustomModelData(2)

                        var ending = colorize("&f)")
                        if (energy == Energy.Pristine_1 || energy == Energy.Pristine_2 || energy == Energy.Pristine_3 || energy == Energy.Pristine_4 || energy == Energy.Pristine_5) ending =
                            ")"

                        itemMeta.setLore(
                            Arrays.asList<String?>(
                                ChatColor.WHITE.toString() + "" + ChatColor.BOLD + "ᴍᴀɴɪᴘᴜʟᴀᴛᴇ ғɪʀᴇ",
                                colorize("&f(") + energystage + ending,
                                ChatColor.WHITE.toString() + "",
                                colorize("#FE8120") + "🔮 " + colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                ChatColor.GRAY.toString() + "- Fire Resistance",
                                ChatColor.GRAY.toString() + "- Autosmelt",
                                ChatColor.GRAY.toString() + "- Flamestrike",
                                ChatColor.GRAY.toString() + "- Fireshot",
                                ChatColor.WHITE.toString() + " ",
                                colorize("#FE8120") + "🔮 " + colorize("#82F3FF") + ChatColor.BOLD + "ᴀʙɪʟɪᴛʏ",
                                ChatColor.GRAY.toString() + "- " + colorize("#FE8120") + "Crisp",
                                ChatColor.WHITE.toString() + "",
                                colorize("#FE8120") + "🔮 " + colorize("#B8FFFB") + ChatColor.BOLD + "ᴘᴏᴡᴇʀs",
                                ChatColor.GRAY.toString() + "-" + ChatColor.WHITE + "🧨" + colorize("#FF5F33") + " ғɪʀᴇʙᴀʟʟ " + ChatColor.DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                                ChatColor.GRAY.toString() + "-" + ChatColor.WHITE + "🧨" + colorize("#FF5F33") + " ᴍᴇᴛᴇᴏʀ sʜᴏᴡᴇʀ " + ChatColor.DARK_RED + "\uD83E\uDD3C",
                                ChatColor.WHITE.toString() + "",
                                ChatColor.GRAY.toString() + "-" + ChatColor.WHITE + "🥾 " + colorize("#248FD1") + "ᴄᴏᴢʏ Cᴀᴍᴘғɪʀᴇ"
                            )
                        )
                    }


                    if (energy == Energy.Scratched) {
                        itemMeta.setCustomModelData(22)
                        itemMeta.setLore(
                            Arrays.asList<String?>(
                                ChatColor.WHITE.toString() + "" + ChatColor.BOLD + "ᴍᴀɴɪᴘᴜʟᴀᴛᴇ ғɪʀᴇ",
                                colorize("&f(") + energystage + colorize("&f)"),
                                ChatColor.WHITE.toString() + "",
                                colorize("#FE8120") + "🔮 " + colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                ChatColor.GRAY.toString() + "- Fire Resistance",
                                ChatColor.GRAY.toString() + "- Flamestrike",
                                ChatColor.GRAY.toString() + "- Fireshot",
                                ChatColor.WHITE.toString() + " ",
                                colorize("#FE8120") + "🔮 " + colorize("#82F3FF") + ChatColor.BOLD + "ᴀʙɪʟɪᴛʏ",
                                ChatColor.GRAY.toString() + "- " + colorize("#FE8120") + "Crisp",
                                ChatColor.WHITE.toString() + "",
                                colorize("#FE8120") + "🔮 " + colorize("#B8FFFB") + ChatColor.BOLD + "ᴘᴏᴡᴇʀs",
                                ChatColor.GRAY.toString() + "-" + ChatColor.WHITE + "🧨" + colorize("#FF5F33") + " ғɪʀᴇʙᴀʟʟ " + ChatColor.DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                                ChatColor.GRAY.toString() + "-" + ChatColor.WHITE + "🧨" + colorize("#FF5F33") + " ᴍᴇᴛᴇᴏʀ sʜᴏᴡᴇʀ " + ChatColor.DARK_RED + "\uD83E\uDD3C",
                                ChatColor.WHITE.toString() + "",
                                ChatColor.GRAY.toString() + "-" + ChatColor.WHITE + "🥾 " + colorize("#248FD1") + "ᴄᴏᴢʏ Cᴀᴍᴘғɪʀᴇ"
                            )
                        )
                    }

                    if (energy == Energy.Cracked) {
                        itemMeta.setCustomModelData(42)
                        itemMeta.setLore(
                            Arrays.asList<String?>(
                                ChatColor.WHITE.toString() + "" + ChatColor.BOLD + "ᴍᴀɴɪᴘᴜʟᴀᴛᴇ ғɪʀᴇ",
                                colorize("&f(") + energystage + colorize("&f)"),
                                ChatColor.WHITE.toString() + "",
                                colorize("#FE8120") + "🔮 " + colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                ChatColor.GRAY.toString() + "- Fire Resistance",
                                ChatColor.GRAY.toString() + "- Flamestrike",
                                ChatColor.GRAY.toString() + "- Fireshot",
                                ChatColor.WHITE.toString() + " ",
                                colorize("#FE8120") + "🔮 " + colorize("#82F3FF") + ChatColor.BOLD + "ᴀʙɪʟɪᴛʏ",
                                ChatColor.GRAY.toString() + "- " + colorize("#FE8120") + "Crisp",
                                ChatColor.WHITE.toString() + "",
                                colorize("#FE8120") + "🔮 " + colorize("#B8FFFB") + ChatColor.BOLD + "ᴘᴏᴡᴇʀs",
                                ChatColor.GRAY.toString() + "-" + ChatColor.WHITE + "🧨" + colorize("#FF5F33") + " ғɪʀᴇʙᴀʟʟ " + ChatColor.DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                                ChatColor.GRAY.toString() + "-" + ChatColor.WHITE + "🧨" + colorize("#FF5F33") + " ᴍᴇᴛᴇᴏʀ sʜᴏᴡᴇʀ " + ChatColor.DARK_RED + "\uD83E\uDD3C",
                                ChatColor.WHITE.toString() + "",
                                ChatColor.GRAY.toString() + "-" + ChatColor.WHITE + "🥾 " + colorize("#248FD1") + "ᴄᴏᴢʏ Cᴀᴍᴘғɪʀᴇ"
                            )
                        )
                    }


                    if (energy == Energy.Damaged) {
                        itemMeta.setCustomModelData(62)
                        itemMeta.setLore(
                            Arrays.asList<String?>(
                                ChatColor.WHITE.toString() + "" + ChatColor.BOLD + "ᴍᴀɴɪᴘᴜʟᴀᴛᴇ ғɪʀᴇ",
                                colorize("&f(") + energystage + colorize("&f)"),
                                ChatColor.WHITE.toString() + "",
                                colorize("#FE8120") + "🔮 " + colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                ChatColor.GRAY.toString() + "- Fire Resistance",
                                ChatColor.GRAY.toString() + "- Flamestrike",
                                ChatColor.WHITE.toString() + " ",
                                colorize("#FE8120") + "🔮 " + colorize("#82F3FF") + ChatColor.BOLD + "ᴀʙɪʟɪᴛʏ",
                                ChatColor.GRAY.toString() + "- " + colorize("#FE8120") + "Crisp",
                                ChatColor.WHITE.toString() + "",
                                colorize("#FE8120") + "🔮 " + colorize("#B8FFFB") + ChatColor.BOLD + "ᴘᴏᴡᴇʀs",
                                ChatColor.GRAY.toString() + "-" + ChatColor.WHITE + "🧨" + colorize("#FF5F33") + " ғɪʀᴇʙᴀʟʟ " + ChatColor.DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                                ChatColor.GRAY.toString() + "-" + ChatColor.WHITE + "🧨" + colorize("#FF5F33") + " ᴍᴇᴛᴇᴏʀ sʜᴏᴡᴇʀ " + ChatColor.DARK_RED + "\uD83E\uDD3C",
                                ChatColor.WHITE.toString() + "",
                                ChatColor.GRAY.toString() + "-" + ChatColor.WHITE + "🥾 " + colorize("#248FD1") + "ᴄᴏᴢʏ Cᴀᴍᴘғɪʀᴇ"
                            )
                        )
                    }

                    if (energy == Energy.Ruined) {
                        itemMeta.setCustomModelData(82)
                        itemMeta.setLore(
                            Arrays.asList<String?>(
                                ChatColor.WHITE.toString() + "" + ChatColor.BOLD + "ᴍᴀɴɪᴘᴜʟᴀᴛᴇ ғɪʀᴇ",
                                colorize("&f(") + energystage + colorize("&f)"),
                                ChatColor.WHITE.toString() + "",
                                colorize("#FE8120") + "🔮 " + colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                ChatColor.GRAY.toString() + "No Passives",
                                ChatColor.WHITE.toString() + " ",
                                colorize("#FE8120") + "🔮 " + colorize("#82F3FF") + ChatColor.BOLD + "ᴀʙɪʟɪᴛʏ",
                                ChatColor.GRAY.toString() + "- " + colorize("#FE8120") + "Crisp",
                                ChatColor.WHITE.toString() + "",
                                colorize("#FE8120") + "🔮 " + colorize("#B8FFFB") + ChatColor.BOLD + "ᴘᴏᴡᴇʀs",
                                ChatColor.GRAY.toString() + "-" + ChatColor.WHITE + "🧨" + colorize("#FF5F33") + " ғɪʀᴇʙᴀʟʟ " + ChatColor.DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                                ChatColor.GRAY.toString() + "-" + ChatColor.WHITE + "🧨" + colorize("#FF5F33") + " ᴍᴇᴛᴇᴏʀ sʜᴏᴡᴇʀ " + ChatColor.DARK_RED + "\uD83E\uDD3C",
                                ChatColor.WHITE.toString() + "",
                                ChatColor.GRAY.toString() + "-" + ChatColor.WHITE + "🥾 " + colorize("#248FD1") + "ᴄᴏᴢʏ Cᴀᴍᴘғɪʀᴇ"
                            )
                        )
                    }


                    if (energy == Energy.Broken) {
                        itemMeta.setCustomModelData(100)
                        itemMeta.setLore(
                            Arrays.asList<String?>(
                                energystage
                            )
                        )
                    }
                    item.setItemMeta(itemMeta)
                    return item
                }
            }


            if (gem == GemType.Wealth) {
                if (season == 1) {
                    val item = ItemStack(Material.PRISMARINE_SHARD, 1)
                    val itemMeta = item.getItemMeta()


                    val idkey = NamespacedKey(instance!!, "shard_id")
                    itemMeta.getPersistentDataContainer()
                        .set<String?, String?>(idkey, PersistentDataType.STRING, UUID.randomUUID().toString())

                    itemMeta.setDisplayName(colorize("#0EC912") + ChatColor.BOLD + "Wealth " + colorize("#FFD773") + "Gem")


                    // Set HideFlags to 127 if server is lower than 1.20.6, if yes: then hide all flags.
                    // due to the nbt change, it is not possible to make everything 1-1 for people using 1.20.6 and higher.

                    /*NBTItem nbtItem = new NBTItem(item);
                        nbtItem.setInteger("HideFlags", 127);
                        item = nbtItem.getItem();*/
                    if (OlderThanNBTChange()) {
                        CompItemFlag.HIDE_ENCHANTS.applyTo(item)
                        CompItemFlag.HIDE_ATTRIBUTES.applyTo(item)
                        CompItemFlag.HIDE_UNBREAKABLE.applyTo(item)
                        CompItemFlag.HIDE_DESTROYS.applyTo(item)
                        CompItemFlag.HIDE_PLACED_ON.applyTo(item)
                        CompItemFlag.HIDE_POTION_EFFECTS.applyTo(item)
                        CompItemFlag.HIDE_DYE.applyTo(item)
                    } else for (flag in ItemFlag.entries) itemMeta.addItemFlags(flag)


                    itemMeta.setCustomModelData(12)
                    itemMeta.setLore(
                        Arrays.asList<String?>(
                            ChatColor.WHITE.toString() + "" + ChatColor.BOLD + "Become wealthier than elon musk",
                            colorize("#FFE4AB") + "Passives",
                            ChatColor.GRAY.toString() + " " + colorize("#0EC912") + "🔮 " + ChatColor.GRAY + "Even cheaper villager trades, Auto enchants all",
                            ChatColor.GRAY.toString() + " swords with looting 3, and all pickaxes with fortune 3",
                            ChatColor.GRAY.toString() + " get two more ore for every 3 ores mined",
                            ChatColor.GRAY.toString() + " 2x the netherite scrap when taken out of furnace",
                            ChatColor.WHITE.toString() + " ",
                            colorize("#B8FFFB") + ChatColor.BOLD + "Powers",
                            ChatColor.GRAY.toString() + "-" + ChatColor.WHITE + "\uD83C\uDF40 " + ChatColor.RED + "Unfortune",
                            ChatColor.GRAY.toString() + " " + ChatColor.DARK_RED + "\uD83E\uDD3C " + ChatColor.GRAY + "1/3 of actions canceled " + ChatColor.WHITE + "40s, R2",
                            ChatColor.GRAY.toString() + " " + ChatColor.DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB " + ChatColor.GRAY + "1/2 of actions canceled " + ChatColor.WHITE + "40s",
                            ChatColor.WHITE.toString() + "",
                            ChatColor.GRAY.toString() + "-" + ChatColor.WHITE + "\uD83E\uDD7E " + colorize("#248FD1") + "Cozy Campfire",
                            ChatColor.GRAY.toString() + " Spawns a campfire that heals when near it 432423"
                        )
                    )

                    item.setItemMeta(itemMeta)
                    return item
                }


                if (season == 2) {
                    val item = ItemStack(Material.PRISMARINE_SHARD, 1)
                    val itemMeta = item.getItemMeta()


                    val idkey = NamespacedKey(instance!!, "gem-id")
                    itemMeta.getPersistentDataContainer()
                        .set<String?, String?>(idkey, PersistentDataType.STRING, UUID.randomUUID().toString())

                    val tierkey = NamespacedKey(instance!!, "gem-tier")
                    itemMeta.getPersistentDataContainer().set<Int?, Int?>(tierkey, PersistentDataType.INTEGER, tier)

                    val typekey = NamespacedKey(instance!!, "gem-type")
                    itemMeta.getPersistentDataContainer()
                        .set<String?, String?>(typekey, PersistentDataType.STRING, "wealth")

                    val quicknodropkey = NamespacedKey(instance!!, "quick-no-drop")
                    itemMeta.getPersistentDataContainer()
                        .set<Int?, Int?>(quicknodropkey, PersistentDataType.INTEGER, quicknodrop)

                    val quicknoremovekey = NamespacedKey(instance!!, "quick-no-remove")
                    itemMeta.getPersistentDataContainer()
                        .set<Int?, Int?>(quicknoremovekey, PersistentDataType.INTEGER, quicknoremove)


                    itemMeta.setDisplayName(colorize("#0EC912") + ChatColor.BOLD + "ᴡᴇᴀʟᴛʜ " + colorize("#FFD773") + "ɢᴇᴍ")
                    for (flag in ItemFlag.entries) itemMeta.addItemFlags(flag)

                    if (Gem.Companion.isPristineorHigher(energy)) {
                        if (energy == Energy.Pristine_5) itemMeta.addEnchant(CompEnchantment.DURABILITY, 1, true)

                        itemMeta.setCustomModelData(12)
                        itemMeta.setLore(
                            Arrays.asList<String?>(
                                ChatColor.WHITE.toString() + "" + ChatColor.BOLD + "ғᴜᴇʟ ᴀ ᴇᴍᴘɪʀᴇ",
                                colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                energystage,
                                ChatColor.GRAY.toString() + " " + colorize("#0EC912") + "🔮 " + ChatColor.GRAY + "Even cheaper villager trades, Luck",
                                ChatColor.GRAY.toString() + " Auto enchants looting 3, fortune 3, mending",
                                ChatColor.GRAY.toString() + " Get two more ore for every 3 ores mined",
                                ChatColor.GRAY.toString() + " 2x the netherite scrap when taken out of furnace",
                                ChatColor.GRAY.toString() + " Chip more of your enemies durability",
                                ChatColor.WHITE.toString() + " ",
                                colorize("#B8FFFB") + ChatColor.BOLD + "ᴘᴏᴡᴇʀs",
                                ChatColor.GRAY.toString() + "-" + ChatColor.WHITE + "\uD83C\uDF40 " + ChatColor.RED + "ᴜɴғᴏʀᴛᴜɴᴇ",
                                ChatColor.GRAY.toString() + " " + ChatColor.DARK_RED + "\uD83E\uDD3C " + ChatColor.GRAY + "1/3 of actions canceled " + ChatColor.WHITE + "40s, R2",
                                ChatColor.GRAY.toString() + " " + ChatColor.DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB " + ChatColor.GRAY + "1/2 of actions canceled " + ChatColor.WHITE + "40s",
                                ChatColor.WHITE.toString() + "",
                                ChatColor.GRAY.toString() + "-" + ChatColor.WHITE + "\uD83D\uDCB8 " + colorize("#FFC642") + "ʀɪᴄʜ ʀᴜsʜ",
                                ChatColor.GRAY.toString() + " Double the ores, and double the mob drops for 5 minutes"
                            )
                        )
                    }

                    if (energy == Energy.Scratched) {
                        itemMeta.setCustomModelData(32)
                        itemMeta.setLore(
                            Arrays.asList<String?>(
                                ChatColor.WHITE.toString() + "" + ChatColor.BOLD + "ғᴜᴇʟ ᴀ ᴇᴍᴘɪʀᴇ",
                                colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                energystage,
                                ChatColor.GRAY.toString() + " " + colorize("#0EC912") + "🔮 " + ChatColor.GRAY + "Even cheaper villager trades",
                                ChatColor.GRAY.toString() + " Auto enchants looting 2, fortune 3, mending",
                                ChatColor.GRAY.toString() + " Get two more ore for every 3 ores mined",
                                ChatColor.GRAY.toString() + " 2x the netherite scrap when taken out of furnace",
                                ChatColor.GRAY.toString() + " Chip more of your enemies durability",
                                ChatColor.WHITE.toString() + " ",
                                colorize("#B8FFFB") + ChatColor.BOLD + "ᴘᴏᴡᴇʀs",
                                ChatColor.GRAY.toString() + "-" + ChatColor.WHITE + "\uD83C\uDF40 " + ChatColor.RED + "ᴜɴғᴏʀᴛᴜɴᴇ",
                                ChatColor.GRAY.toString() + " " + ChatColor.DARK_RED + "\uD83E\uDD3C " + ChatColor.GRAY + "1/3 of actions canceled " + ChatColor.WHITE + "40s, R2",
                                ChatColor.GRAY.toString() + " " + ChatColor.DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB " + ChatColor.GRAY + "1/2 of actions canceled " + ChatColor.WHITE + "40s",
                                ChatColor.WHITE.toString() + "",
                                ChatColor.GRAY.toString() + "-" + ChatColor.WHITE + "\uD83D\uDCB8 " + colorize("#FFC642") + "ʀɪᴄʜ ʀᴜsʜ",
                                ChatColor.GRAY.toString() + " Double the ores, and double the mob drops for 5 minutes"
                            )
                        )
                    }

                    if (energy == Energy.Cracked) {
                        itemMeta.setCustomModelData(52)
                        itemMeta.setLore(
                            Arrays.asList<String?>(
                                ChatColor.WHITE.toString() + "" + ChatColor.BOLD + "ғᴜᴇʟ ᴀ ᴇᴍᴘɪʀᴇ",
                                colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                energystage,
                                ChatColor.GRAY.toString() + " " + colorize("#0EC912") + "🔮 " + ChatColor.GRAY + "Auto enchants looting 1, fortune 2, mending",
                                ChatColor.GRAY.toString() + " Get two more ore for every 3 ores mined",
                                ChatColor.GRAY.toString() + " 2x the netherite scrap when taken out of furnace",
                                ChatColor.WHITE.toString() + " ",
                                colorize("#B8FFFB") + ChatColor.BOLD + "ᴘᴏᴡᴇʀs",
                                ChatColor.GRAY.toString() + "-" + ChatColor.WHITE + "\uD83C\uDF40 " + ChatColor.RED + "ᴜɴғᴏʀᴛᴜɴᴇ",
                                ChatColor.GRAY.toString() + " " + ChatColor.DARK_RED + "\uD83E\uDD3C " + ChatColor.GRAY + "1/3 of actions canceled " + ChatColor.WHITE + "40s, R2",
                                ChatColor.GRAY.toString() + " " + ChatColor.DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB " + ChatColor.GRAY + "1/2 of actions canceled " + ChatColor.WHITE + "40s",
                                ChatColor.WHITE.toString() + "",
                                ChatColor.GRAY.toString() + "-" + ChatColor.WHITE + "\uD83D\uDCB8 " + colorize("#FFC642") + "ʀɪᴄʜ ʀᴜsʜ",
                                ChatColor.GRAY.toString() + " Double the ores, and double the mob drops for 5 minutes"
                            )
                        )
                    }

                    if (energy == Energy.Damaged) {
                        itemMeta.setCustomModelData(72)
                        itemMeta.setLore(
                            Arrays.asList<String?>(
                                ChatColor.WHITE.toString() + "" + ChatColor.BOLD + "ғᴜᴇʟ ᴀ ᴇᴍᴘɪʀᴇ",
                                colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                energystage,
                                ChatColor.GRAY.toString() + " " + colorize("#0EC912") + "🔮 " + ChatColor.GRAY + "Auto enchants fortune 1, mending",
                                ChatColor.GRAY.toString() + " 2x the netherite scrap when taken out of furnace",
                                ChatColor.WHITE.toString() + " ",
                                colorize("#B8FFFB") + ChatColor.BOLD + "ᴘᴏᴡᴇʀs",
                                ChatColor.GRAY.toString() + "-" + ChatColor.WHITE + "\uD83C\uDF40 " + ChatColor.RED + "ᴜɴғᴏʀᴛᴜɴᴇ",
                                ChatColor.GRAY.toString() + " " + ChatColor.DARK_RED + "\uD83E\uDD3C " + ChatColor.GRAY + "1/3 of actions canceled " + ChatColor.WHITE + "40s, R2",
                                ChatColor.GRAY.toString() + " " + ChatColor.DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB " + ChatColor.GRAY + "1/2 of actions canceled " + ChatColor.WHITE + "40s",
                                ChatColor.WHITE.toString() + "",
                                ChatColor.GRAY.toString() + "-" + ChatColor.WHITE + "\uD83D\uDCB8 " + colorize("#FFC642") + "ʀɪᴄʜ ʀᴜsʜ",
                                ChatColor.GRAY.toString() + " Double the ores, and double the mob drops for 5 minutes"
                            )
                        )
                    }

                    if (energy == Energy.Ruined) {
                        itemMeta.setCustomModelData(92)
                        itemMeta.setLore(
                            Arrays.asList<String?>(
                                ChatColor.WHITE.toString() + "" + ChatColor.BOLD + "ғᴜᴇʟ ᴀ ᴇᴍᴘɪʀᴇ",
                                colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                energystage,
                                ChatColor.GRAY.toString() + " " + colorize("#0EC912") + "🔮 " + ChatColor.GRAY + "No passives",
                                ChatColor.WHITE.toString() + " ",
                                colorize("#B8FFFB") + ChatColor.BOLD + "ᴘᴏᴡᴇʀs",
                                ChatColor.GRAY.toString() + "-" + ChatColor.WHITE + "\uD83C\uDF40 " + ChatColor.RED + "ᴜɴғᴏʀᴛᴜɴᴇ",
                                ChatColor.GRAY.toString() + " " + ChatColor.DARK_RED + "\uD83E\uDD3C " + ChatColor.GRAY + "1/3 of actions canceled " + ChatColor.WHITE + "40s, R2",
                                ChatColor.GRAY.toString() + " " + ChatColor.DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB " + ChatColor.GRAY + "1/2 of actions canceled " + ChatColor.WHITE + "40s",
                                ChatColor.WHITE.toString() + "",
                                ChatColor.GRAY.toString() + "-" + ChatColor.WHITE + "\uD83D\uDCB8 " + colorize("#FFC642") + "ʀɪᴄʜ ʀᴜsʜ",
                                ChatColor.GRAY.toString() + " Double the ores, and double the mob drops for 5 minutes"
                            )
                        )
                    }


                    if (energy == Energy.Broken) {
                        itemMeta.setCustomModelData(96)
                        itemMeta.setLore(
                            Arrays.asList<String?>(
                                ChatColor.WHITE.toString() + "" + ChatColor.BOLD + "ᴜsᴇʟᴇss"
                            )
                        )
                    }
                    item.setItemMeta(itemMeta)
                    return item
                }
                if (season == 3) {
                    val item = ItemStack(Material.PRISMARINE_SHARD, 1)
                    val itemMeta = item.getItemMeta()

                    val idkey = NamespacedKey(instance!!, "gem-id")
                    itemMeta.getPersistentDataContainer()
                        .set<String?, String?>(idkey, PersistentDataType.STRING, UUID.randomUUID().toString())
                    val tierkey = NamespacedKey(instance!!, "gem-tier")
                    itemMeta.getPersistentDataContainer().set<Int?, Int?>(tierkey, PersistentDataType.INTEGER, tier)

                    val typekey = NamespacedKey(instance!!, "gem-type")
                    itemMeta.getPersistentDataContainer()
                        .set<String?, String?>(typekey, PersistentDataType.STRING, "wealth")

                    val quicknodropkey = NamespacedKey(instance!!, "quick-no-drop")
                    itemMeta.getPersistentDataContainer()
                        .set<Int?, Int?>(quicknodropkey, PersistentDataType.INTEGER, quicknodrop)

                    val quicknoremovekey = NamespacedKey(instance!!, "quick-no-remove")
                    itemMeta.getPersistentDataContainer()
                        .set<Int?, Int?>(quicknoremovekey, PersistentDataType.INTEGER, quicknoremove)

                    for (flag in ItemFlag.entries) itemMeta.addItemFlags(flag)
                    itemMeta.setDisplayName(colorize("#0EC912") + ChatColor.BOLD + "ᴡᴇᴀʟᴛʜ " + colorize("#FFD773") + "ɢᴇᴍ")
                    if (Gem.Companion.isPristineorHigher(energy)) {
                        if (energy == Energy.Pristine_5) itemMeta.addEnchant(CompEnchantment.DURABILITY, 1, true)

                        itemMeta.setCustomModelData(12)

                        var ending = colorize("&f)")
                        if (energy == Energy.Pristine_1 || energy == Energy.Pristine_2 || energy == Energy.Pristine_3 || energy == Energy.Pristine_4 || energy == Energy.Pristine_5) ending =
                            ")"

                        itemMeta.setLore(
                            Arrays.asList<String?>(
                                ChatColor.WHITE.toString() + "" + ChatColor.BOLD + "ғᴜᴇʟ ᴀ ᴇᴍᴘɪʀᴇ",
                                colorize("&f(") + energystage + ending,
                                ChatColor.WHITE.toString() + " ",
                                colorize("#0EC912") + "🔮 " + colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                ChatColor.GRAY.toString() + "- Hero of the Village",
                                ChatColor.GRAY.toString() + "- Luck",
                                ChatColor.GRAY.toString() + "- Enchants Mending",
                                ChatColor.GRAY.toString() + "- Enchants Fortune",
                                ChatColor.GRAY.toString() + "- Enchants Looting",
                                ChatColor.GRAY.toString() + "- Bonus Ores",
                                ChatColor.GRAY.toString() + "- Extra EXP",
                                ChatColor.GRAY.toString() + "- Durability Chip",
                                ChatColor.GRAY.toString() + "- Double Debris",
                                ChatColor.WHITE.toString() + " ",
                                colorize("#0EC912") + "🔮 " + colorize("#82F3FF") + ChatColor.BOLD + "ᴀʙɪʟɪᴛʏ",
                                ChatColor.GRAY.toString() + "- " + colorize("#0EC912") + "Pockets",
                                ChatColor.WHITE.toString() + " ",
                                colorize("#0EC912") + "🔮 " + colorize("#B8FFFB") + ChatColor.BOLD + "ᴘᴏᴡᴇʀs",
                                ChatColor.GRAY.toString() + "-" + ChatColor.WHITE + "\uD83C\uDF40 " + ChatColor.RED + "ᴜɴғᴏʀᴛᴜɴᴇ " + ChatColor.DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                                ChatColor.GRAY.toString() + "-" + ChatColor.WHITE + "\uD83C\uDF40 " + ChatColor.RED + "ɪᴛᴇᴍ ʟᴏᴄᴋ " + ChatColor.DARK_RED + "\uD83E\uDD3C",
                                ChatColor.WHITE.toString() + "",
                                ChatColor.GRAY.toString() + "-" + ChatColor.WHITE + "\uD83D\uDCB8 " + colorize("#FFC642") + "ʀɪᴄʜ ʀᴜsʜ " + ChatColor.GREEN + "\uD83E\uDDD1\uD83C\uDFFB",
                                ChatColor.GRAY.toString() + "-" + ChatColor.WHITE + "\uD83D\uDCB8 " + colorize("#FFC642") + "ᴀᴍʟɪғɪᴄᴀᴛɪᴏɴ " + ChatColor.GREEN + "\uD83E\uDD3C"
                            )
                        )
                    }


                    if (energy == Energy.Scratched) {
                        itemMeta.setCustomModelData(32)
                        itemMeta.setLore(
                            Arrays.asList<String?>(
                                ChatColor.WHITE.toString() + "" + ChatColor.BOLD + "ғᴜᴇʟ ᴀ ᴇᴍᴘɪʀᴇ",
                                colorize("&f(") + energystage + colorize("&f)"),
                                ChatColor.WHITE.toString() + " ",
                                colorize("#0EC912") + "🔮 " + colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                ChatColor.GRAY.toString() + "- Hero of the Village",
                                ChatColor.GRAY.toString() + "- Enchants Mending",
                                ChatColor.GRAY.toString() + "- Enchants Looting",
                                ChatColor.GRAY.toString() + "- Bonus Ores",
                                ChatColor.GRAY.toString() + "- Durability Chip",
                                ChatColor.WHITE.toString() + " ",
                                colorize("#0EC912") + "🔮 " + colorize("#82F3FF") + ChatColor.BOLD + "ᴀʙɪʟɪᴛʏ",
                                ChatColor.GRAY.toString() + "- " + colorize("#0EC912") + "Pockets",
                                ChatColor.WHITE.toString() + " ",
                                colorize("#0EC912") + "🔮 " + colorize("#B8FFFB") + ChatColor.BOLD + "ᴘᴏᴡᴇʀs",
                                ChatColor.GRAY.toString() + "-" + ChatColor.WHITE + "\uD83C\uDF40 " + ChatColor.RED + "ᴜɴғᴏʀᴛᴜɴᴇ " + ChatColor.DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                                ChatColor.GRAY.toString() + "-" + ChatColor.WHITE + "\uD83C\uDF40 " + ChatColor.RED + "ɪᴛᴇᴍ ʟᴏᴄᴋ " + ChatColor.DARK_RED + "\uD83E\uDD3C",
                                ChatColor.WHITE.toString() + "",
                                ChatColor.GRAY.toString() + "-" + ChatColor.WHITE + "\uD83D\uDCB8 " + colorize("#FFC642") + "ʀɪᴄʜ ʀᴜsʜ " + ChatColor.GREEN + "\uD83E\uDDD1\uD83C\uDFFB",
                                ChatColor.GRAY.toString() + "-" + ChatColor.WHITE + "\uD83D\uDCB8 " + colorize("#FFC642") + "ᴀᴍʟɪғɪᴄᴀᴛɪᴏɴ " + ChatColor.GREEN + "\uD83E\uDD3C"
                            )
                        )
                    }

                    if (energy == Energy.Cracked) {
                        itemMeta.setCustomModelData(52)
                        itemMeta.setLore(
                            Arrays.asList<String?>(
                                ChatColor.WHITE.toString() + "" + ChatColor.BOLD + "ғᴜᴇʟ ᴀ ᴇᴍᴘɪʀᴇ",
                                colorize("&f(") + energystage + colorize("&f)"),
                                ChatColor.WHITE.toString() + " ",
                                colorize("#0EC912") + "🔮 " + colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                ChatColor.GRAY.toString() + "- Enchants Looting",
                                ChatColor.GRAY.toString() + "- Bonus Ores",
                                ChatColor.GRAY.toString() + "- Durability Chip",
                                ChatColor.WHITE.toString() + " ",
                                colorize("#0EC912") + "🔮 " + colorize("#82F3FF") + ChatColor.BOLD + "ᴀʙɪʟɪᴛʏ",
                                ChatColor.GRAY.toString() + "- " + colorize("#0EC912") + "Pockets",
                                ChatColor.WHITE.toString() + " ",
                                colorize("#0EC912") + "🔮 " + colorize("#B8FFFB") + ChatColor.BOLD + "ᴘᴏᴡᴇʀs",
                                ChatColor.GRAY.toString() + "-" + ChatColor.WHITE + "\uD83C\uDF40 " + ChatColor.RED + "ᴜɴғᴏʀᴛᴜɴᴇ " + ChatColor.DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                                ChatColor.GRAY.toString() + "-" + ChatColor.WHITE + "\uD83C\uDF40 " + ChatColor.RED + "ɪᴛᴇᴍ ʟᴏᴄᴋ " + ChatColor.DARK_RED + "\uD83E\uDD3C",
                                ChatColor.WHITE.toString() + "",
                                ChatColor.GRAY.toString() + "-" + ChatColor.WHITE + "\uD83D\uDCB8 " + colorize("#FFC642") + "ʀɪᴄʜ ʀᴜsʜ " + ChatColor.GREEN + "\uD83E\uDDD1\uD83C\uDFFB",
                                ChatColor.GRAY.toString() + "-" + ChatColor.WHITE + "\uD83D\uDCB8 " + colorize("#FFC642") + "ᴀᴍʟɪғɪᴄᴀᴛɪᴏɴ " + ChatColor.GREEN + "\uD83E\uDD3C"
                            )
                        )
                    }


                    if (energy == Energy.Damaged) {
                        itemMeta.setCustomModelData(72)
                        itemMeta.setLore(
                            Arrays.asList<String?>(
                                ChatColor.WHITE.toString() + "" + ChatColor.BOLD + "ғᴜᴇʟ ᴀ ᴇᴍᴘɪʀᴇ",
                                colorize("&f(") + energystage + colorize("&f)"),
                                ChatColor.WHITE.toString() + " ",
                                colorize("#0EC912") + "🔮 " + colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                ChatColor.GRAY.toString() + "- Durability Chip",
                                ChatColor.WHITE.toString() + " ",
                                colorize("#0EC912") + "🔮 " + colorize("#82F3FF") + ChatColor.BOLD + "ᴀʙɪʟɪᴛʏ",
                                ChatColor.GRAY.toString() + "- " + colorize("#0EC912") + "Pockets",
                                ChatColor.WHITE.toString() + " ",
                                colorize("#0EC912") + "🔮 " + colorize("#B8FFFB") + ChatColor.BOLD + "ᴘᴏᴡᴇʀs",
                                ChatColor.GRAY.toString() + "-" + ChatColor.WHITE + "\uD83C\uDF40 " + ChatColor.RED + "ᴜɴғᴏʀᴛᴜɴᴇ " + ChatColor.DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                                ChatColor.GRAY.toString() + "-" + ChatColor.WHITE + "\uD83C\uDF40 " + ChatColor.RED + "ɪᴛᴇᴍ ʟᴏᴄᴋ " + ChatColor.DARK_RED + "\uD83E\uDD3C",
                                ChatColor.WHITE.toString() + "",
                                ChatColor.GRAY.toString() + "-" + ChatColor.WHITE + "\uD83D\uDCB8 " + colorize("#FFC642") + "ʀɪᴄʜ ʀᴜsʜ " + ChatColor.GREEN + "\uD83E\uDDD1\uD83C\uDFFB",
                                ChatColor.GRAY.toString() + "-" + ChatColor.WHITE + "\uD83D\uDCB8 " + colorize("#FFC642") + "ᴀᴍʟɪғɪᴄᴀᴛɪᴏɴ " + ChatColor.GREEN + "\uD83E\uDD3C"
                            )
                        )
                    }

                    if (energy == Energy.Ruined) {
                        itemMeta.setCustomModelData(92)
                        itemMeta.setLore(
                            Arrays.asList<String?>(
                                ChatColor.WHITE.toString() + "" + ChatColor.BOLD + "ғᴜᴇʟ ᴀ ᴇᴍᴘɪʀᴇ",
                                colorize("&f(") + energystage + colorize("&f)"),
                                ChatColor.WHITE.toString() + " ",
                                colorize("#0EC912") + "🔮 " + colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                                ChatColor.GRAY.toString() + "No Passives",
                                ChatColor.WHITE.toString() + " ",
                                colorize("#0EC912") + "🔮 " + colorize("#82F3FF") + ChatColor.BOLD + "ᴀʙɪʟɪᴛʏ",
                                ChatColor.GRAY.toString() + "- " + colorize("#0EC912") + "Pockets",
                                ChatColor.WHITE.toString() + " ",
                                colorize("#0EC912") + "🔮 " + colorize("#B8FFFB") + ChatColor.BOLD + "ᴘᴏᴡᴇʀs",
                                ChatColor.GRAY.toString() + "-" + ChatColor.WHITE + "\uD83C\uDF40 " + ChatColor.RED + "ᴜɴғᴏʀᴛᴜɴᴇ " + ChatColor.DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                                ChatColor.GRAY.toString() + "-" + ChatColor.WHITE + "\uD83C\uDF40 " + ChatColor.RED + "ɪᴛᴇᴍ ʟᴏᴄᴋ " + ChatColor.DARK_RED + "\uD83E\uDD3C",
                                ChatColor.WHITE.toString() + "",
                                ChatColor.GRAY.toString() + "-" + ChatColor.WHITE + "\uD83D\uDCB8 " + colorize("#FFC642") + "ʀɪᴄʜ ʀᴜsʜ " + ChatColor.GREEN + "\uD83E\uDDD1\uD83C\uDFFB",
                                ChatColor.GRAY.toString() + "-" + ChatColor.WHITE + "\uD83D\uDCB8 " + colorize("#FFC642") + "ᴀᴍʟɪғɪᴄᴀᴛɪᴏɴ " + ChatColor.GREEN + "\uD83E\uDD3C"
                            )
                        )
                    }


                    if (energy == Energy.Broken) {
                        itemMeta.setCustomModelData(100)
                        itemMeta.setLore(
                            Arrays.asList<String?>(
                                energystage
                            )
                        )
                    }
                    item.setItemMeta(itemMeta)
                    return item
                }
            }
        }

        if (tier == 1) if (gem == GemType.Strength) {
            if (season == 1) {
                val item = ItemStack(Material.AMETHYST_SHARD, 1)
                val itemMeta = item.getItemMeta()


                val idkey = NamespacedKey(instance!!, "shard_id")
                itemMeta.getPersistentDataContainer()
                    .set<String?, String?>(idkey, PersistentDataType.STRING, UUID.randomUUID().toString())

                itemMeta.setDisplayName(colorize("#F10303") + ChatColor.BOLD + "Strength " + colorize("#C7C7C7") + "Gem")


                // Set HideFlags to 127 if server is lower than 1.20.6, if yes: then hide all flags.
                // due to the nbt change, it is not possible to make everything 1-1 for people using 1.20.6 and higher.
                if (OlderThanNBTChange()) {
                    CompItemFlag.HIDE_ENCHANTS.applyTo(item)
                    CompItemFlag.HIDE_ATTRIBUTES.applyTo(item)
                    CompItemFlag.HIDE_UNBREAKABLE.applyTo(item)
                    CompItemFlag.HIDE_DESTROYS.applyTo(item)
                    CompItemFlag.HIDE_PLACED_ON.applyTo(item)
                    CompItemFlag.HIDE_POTION_EFFECTS.applyTo(item)
                    CompItemFlag.HIDE_DYE.applyTo(item)
                } else for (flag in ItemFlag.entries) itemMeta.addItemFlags(flag)


                itemMeta.setCustomModelData(9)
                itemMeta.setLore(
                    Arrays.asList<String?>(
                        ChatColor.WHITE.toString() + "" + ChatColor.BOLD + "Have the strength of 5 men",
                        colorize("#FFE4AB") + "Passives",
                        ChatColor.GRAY.toString() + " " + colorize("#F10303") + "🔺 " + ChatColor.GRAY + "Strength 1, Auto enchants all",
                        ChatColor.GRAY.toString() + " swords and axes with sharpness 2",
                        ChatColor.WHITE.toString() + " ",
                        colorize("#B8FFFB") + ChatColor.BOLD + "Powers",
                        colorize("#F10303") + "🔮 " + ChatColor.WHITE + ChatColor.BOLD + "required"
                    )
                )

                item.setItemMeta(itemMeta)
                return item
            }


            if (season == 2) {
                val item = ItemStack(Material.AMETHYST_SHARD, 1)
                val itemMeta = item.getItemMeta()


                val idkey = NamespacedKey(instance!!, "gem-id")
                itemMeta.getPersistentDataContainer()
                    .set<String?, String?>(idkey, PersistentDataType.STRING, "166c9cee-5354-4a29-a33b-fc49080eecc1")

                val tierkey = NamespacedKey(instance!!, "gem-tier")
                itemMeta.getPersistentDataContainer().set<Int?, Int?>(tierkey, PersistentDataType.INTEGER, tier)

                val typekey = NamespacedKey(instance!!, "gem-type")
                itemMeta.getPersistentDataContainer()
                    .set<String?, String?>(typekey, PersistentDataType.STRING, "strength")

                val quicknodropkey = NamespacedKey(instance!!, "quick-no-drop")
                itemMeta.getPersistentDataContainer()
                    .set<Int?, Int?>(quicknodropkey, PersistentDataType.INTEGER, quicknodrop)

                val quicknoremovekey = NamespacedKey(instance!!, "quick-no-remove")
                itemMeta.getPersistentDataContainer()
                    .set<Int?, Int?>(quicknoremovekey, PersistentDataType.INTEGER, quicknoremove)


                itemMeta.setDisplayName(colorize("#F10303") + ChatColor.BOLD + "sᴛʀᴇɴɢᴛʜ " + colorize("#FFD773") + "ɢᴇᴍ")
                for (flag in ItemFlag.entries) itemMeta.addItemFlags(flag)

                if (Gem.Companion.isPristineorHigher(energy) || energy == Energy.Scratched) {
                    if (energy == Energy.Pristine_5) itemMeta.addEnchant(CompEnchantment.DURABILITY, 1, true)

                    if ((energy) == Energy.Scratched) itemMeta.setCustomModelData(29)
                    else itemMeta.setCustomModelData(9)
                    itemMeta.setLore(
                        Arrays.asList<String?>(
                            ChatColor.WHITE.toString() + "" + ChatColor.BOLD + "ʜᴀᴠᴇ ᴛʜᴇ sᴛʀᴇɴɢᴛʜ ᴏғ ᴀ ᴀʀᴍʏ",
                            colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                            energystage,
                            ChatColor.GRAY.toString() + " " + colorize("#F10303") + "🔺 " + ChatColor.GRAY + "Strength 1, Auto enchants all",
                            ChatColor.GRAY.toString() + " swords and axes with sharpness 2",
                            ChatColor.GRAY.toString() + " Deal more damage the lower you are",
                            ChatColor.WHITE.toString() + " ",
                            colorize("#B8FFFB") + ChatColor.BOLD + "ᴘᴏᴡᴇʀs",
                            colorize("#F10303") + "🔮 " + ChatColor.WHITE + ChatColor.BOLD + "required"
                        )
                    )
                }

                if (energy == Energy.Cracked) {
                    itemMeta.setCustomModelData(49)
                    itemMeta.setLore(
                        Arrays.asList<String?>(
                            ChatColor.WHITE.toString() + "" + ChatColor.BOLD + "ʜᴀᴠᴇ ᴛʜᴇ sᴛʀᴇɴɢᴛʜ ᴏғ ᴀ ᴀʀᴍʏ",
                            colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                            energystage,
                            ChatColor.GRAY.toString() + " " + colorize("#F10303") + "🔺 " + "Strength 1",
                            ChatColor.GRAY.toString() + " Auto Enchant sharpness 1",
                            ChatColor.WHITE.toString() + " ",
                            colorize("#B8FFFB") + ChatColor.BOLD + "ᴘᴏᴡᴇʀs",
                            colorize("#F10303") + "🔮 " + ChatColor.WHITE + ChatColor.BOLD + "required"
                        )
                    )
                }

                if (energy == Energy.Damaged) {
                    itemMeta.setCustomModelData(70)
                    itemMeta.setLore(
                        Arrays.asList<String?>(
                            ChatColor.WHITE.toString() + "" + ChatColor.BOLD + "ʜᴀᴠᴇ ᴛʜᴇ sᴛʀᴇɴɢᴛʜ ᴏғ ᴀ ᴀʀᴍʏ",
                            colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                            energystage,
                            ChatColor.GRAY.toString() + " " + colorize("#F10303") + "🔮 " + ChatColor.GRAY + "Auto enchants sharpness 2",
                            ChatColor.WHITE.toString() + " ",
                            colorize("#B8FFFB") + ChatColor.BOLD + "ᴘᴏᴡᴇʀs",
                            ChatColor.GRAY.toString() + "-" + ChatColor.WHITE + "\uD83E\uDD3A " + colorize("#B5B5B5") + ChatColor.BOLD + "ғʀᴀɪʟᴇʀ",
                            ChatColor.GRAY.toString() + " " + ChatColor.DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB " + ChatColor.GRAY + "Clears potion effects",
                            ChatColor.GRAY.toString() + " gives weakness 1 for 20 seconds",
                            ChatColor.GRAY.toString() + " " + ChatColor.DARK_RED + "\uD83E\uDD3C " + ChatColor.GRAY + " Clears potion effects",
                            ChatColor.GRAY.toString() + " and gives withering, " + ChatColor.WHITE + "40s, R5",
                            ChatColor.WHITE.toString() + "",
                            ChatColor.GRAY.toString() + "-" + ChatColor.WHITE + "⚔" + colorize("#910D0D") + " ᴄʜᴀᴅ sᴛʀᴇɴɢᴛʜ " + ChatColor.WHITE + "R4 40s",
                            ChatColor.GRAY.toString() + " " + ChatColor.GREEN + "\uD83E\uDDD1\uD83C\uDFFB " + ChatColor.GRAY + "Every 3 crits charges a hit that deals 2x the dmg",
                            ChatColor.GRAY.toString() + " " + ChatColor.GREEN + "\uD83E\uDD3C " + ChatColor.GRAY + "Every 8 crits charges a hit that deals 2x the dmg"
                        )
                    )
                }

                if (energy == Energy.Ruined) {
                    itemMeta.setCustomModelData(90)
                    itemMeta.setLore(
                        Arrays.asList<String?>(
                            ChatColor.WHITE.toString() + "" + ChatColor.BOLD + "ʜᴀᴠᴇ ᴛʜᴇ sᴛʀᴇɴɢᴛʜ ᴏғ ᴀ ᴀʀᴍʏ",
                            colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                            energystage,
                            ChatColor.GRAY.toString() + " " + colorize("#F10303") + "🔮 " + ChatColor.GRAY + "No passives",
                            ChatColor.WHITE.toString() + " ",
                            colorize("#B8FFFB") + ChatColor.BOLD + "ᴘᴏᴡᴇʀs",
                            ChatColor.GRAY.toString() + "-" + ChatColor.WHITE + "\uD83E\uDD3A " + colorize("#B5B5B5") + ChatColor.BOLD + "ғʀᴀɪʟᴇʀ",
                            ChatColor.GRAY.toString() + " " + ChatColor.DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB " + ChatColor.GRAY + "Clears potion effects",
                            ChatColor.GRAY.toString() + " gives weakness 1 for 20 seconds",
                            ChatColor.GRAY.toString() + " " + ChatColor.DARK_RED + "\uD83E\uDD3C " + ChatColor.GRAY + " Clears potion effects",
                            ChatColor.GRAY.toString() + " and gives withering, " + ChatColor.WHITE + "40s, R5",
                            ChatColor.WHITE.toString() + "",
                            ChatColor.GRAY.toString() + "-" + ChatColor.WHITE + "⚔" + colorize("#910D0D") + " ᴄʜᴀᴅ sᴛʀᴇɴɢᴛʜ " + ChatColor.WHITE + "R4 40s",
                            ChatColor.GRAY.toString() + " " + ChatColor.GREEN + "\uD83E\uDDD1\uD83C\uDFFB " + ChatColor.GRAY + "Every 3 crits charges a hit that deals 2x the dmg",
                            ChatColor.GRAY.toString() + " " + ChatColor.GREEN + "\uD83E\uDD3C " + ChatColor.GRAY + "Every 8 crits charges a hit that deals 2x the dmg"
                        )
                    )
                }


                if (energy == Energy.Broken) {
                    itemMeta.setCustomModelData(96)
                    itemMeta.setLore(
                        Arrays.asList<String?>(
                            ChatColor.WHITE.toString() + "" + ChatColor.BOLD + "ᴜsᴇʟᴇss"
                        )
                    )
                }
                item.setItemMeta(itemMeta)
                return item
            }
            if (season == 3) {
                val item = ItemStack(Material.PRISMARINE_SHARD, 1)
                val itemMeta = item.getItemMeta()


                val idkey = NamespacedKey(instance!!, "gem-id")
                itemMeta.getPersistentDataContainer()
                    .set<String?, String?>(idkey, PersistentDataType.STRING, "9f969b5e-8b9a-4dd5-b5bc-9a23774721b4")

                val tierkey = NamespacedKey(instance!!, "gem-tier")
                itemMeta.getPersistentDataContainer().set<Int?, Int?>(tierkey, PersistentDataType.INTEGER, tier)

                val typekey = NamespacedKey(instance!!, "gem-type")
                itemMeta.getPersistentDataContainer()
                    .set<String?, String?>(typekey, PersistentDataType.STRING, "strength")

                val quicknodropkey = NamespacedKey(instance!!, "quick-no-drop")
                itemMeta.getPersistentDataContainer()
                    .set<Int?, Int?>(quicknodropkey, PersistentDataType.INTEGER, quicknodrop)

                val quicknoremovekey = NamespacedKey(instance!!, "quick-no-remove")
                itemMeta.getPersistentDataContainer()
                    .set<Int?, Int?>(quicknoremovekey, PersistentDataType.INTEGER, quicknoremove)


                for (flag in ItemFlag.entries) itemMeta.addItemFlags(flag)

                itemMeta.setDisplayName(colorize("#F10303") + ChatColor.BOLD + "sᴛʀᴇɴɢᴛʜ " + colorize("#FFD773") + "ɢᴇᴍ")
                if (Gem.Companion.isPristineorHigher(energy)) {
                    if (energy == Energy.Pristine_5) itemMeta.addEnchant(CompEnchantment.DURABILITY, 1, true)

                    itemMeta.setCustomModelData(10)

                    var ending = colorize("&f)")
                    if (energy == Energy.Pristine_1 || energy == Energy.Pristine_2 || energy == Energy.Pristine_3 || energy == Energy.Pristine_4 || energy == Energy.Pristine_5) ending =
                        ")"

                    itemMeta.setLore(
                        Arrays.asList<String?>(
                            ChatColor.WHITE.toString() + "" + ChatColor.BOLD + "ʜᴀᴠᴇ ᴛʜᴇ sᴛʀᴇɴɢᴛʜ ᴏғ ᴀ ᴀʀᴍʏ",
                            colorize("&f(") + energystage + ending,
                            ChatColor.WHITE.toString() + " ",
                            colorize("#F10303") + "🔮" + " " + colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                            ChatColor.GRAY.toString() + "- " + ChatColor.GRAY + "Strength",
                            ChatColor.GRAY.toString() + "- Enchants Sharpness",
                            ChatColor.WHITE.toString() + " ",
                            colorize("#F10303") + "🔮" + " " + colorize("#82F3FF") + ChatColor.BOLD + "ᴀʙɪʟɪᴛʏ",
                            ChatColor.GRAY.toString() + "- " + colorize("#F10303") + "Bounty Hunter",
                            ChatColor.WHITE.toString() + " ",
                            colorize("#F10303") + "🔮 " + colorize("#B8FFFB") + ChatColor.BOLD + "ᴘᴏᴡᴇʀs",
                            ChatColor.GRAY.toString() + "- " + ChatColor.WHITE + "\uD83E\uDD3A " + colorize("#B5B5B5") + "ғʀᴀɪʟᴇʀ " + ChatColor.DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                            ChatColor.GRAY.toString() + "- " + ChatColor.WHITE + "\uD83E\uDD3A " + colorize("#B5B5B5") + "ɴᴜʟʟɪғʏ " + ChatColor.DARK_RED + "\uD83E\uDD3C",
                            ChatColor.WHITE.toString() + "",
                            ChatColor.GRAY.toString() + "- " + ChatColor.WHITE + "⚔" + colorize("#910D0D") + " ᴄʜᴀᴅ sᴛʀᴇɴɢᴛʜ " + ChatColor.GREEN + "\uD83E\uDDD1\uD83C\uDFFB",
                            ChatColor.GRAY.toString() + "- " + ChatColor.WHITE + "⚔" + colorize("#910D0D") + " ᴄʜᴀᴅ sᴛʀᴇɴɢᴛʜ " + ChatColor.GREEN + "\uD83E\uDD3C"
                        )
                    )
                }


                if (energy == Energy.Scratched) {
                    itemMeta.setCustomModelData(30)
                    itemMeta.setLore(
                        Arrays.asList<String?>(
                            ChatColor.WHITE.toString() + "" + ChatColor.BOLD + "ʜᴀᴠᴇ ᴛʜᴇ sᴛʀᴇɴɢᴛʜ ᴏғ ᴀ ᴀʀᴍʏ",
                            colorize("&f(") + energystage + colorize("&f)"),
                            ChatColor.WHITE.toString() + " ",
                            colorize("#F10303") + "🔮" + " " + colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                            ChatColor.GRAY.toString() + "- " + ChatColor.GRAY + "Strength",
                            ChatColor.GRAY.toString() + "- Enchants Sharpness",
                            ChatColor.GRAY.toString() + "- " + ChatColor.GRAY + "Bloodthorns",
                            ChatColor.WHITE.toString() + " ",
                            colorize("#F10303") + "🔮" + " " + colorize("#82F3FF") + ChatColor.BOLD + "ᴀʙɪʟɪᴛʏ",
                            ChatColor.GRAY.toString() + "- " + colorize("#F10303") + "Bounty Hunter",
                            ChatColor.WHITE.toString() + " ",
                            colorize("#F10303") + "🔮 " + colorize("#B8FFFB") + ChatColor.BOLD + "ᴘᴏᴡᴇʀs",
                            ChatColor.GRAY.toString() + "- " + ChatColor.WHITE + "\uD83E\uDD3A " + colorize("#B5B5B5") + "ғʀᴀɪʟᴇʀ " + ChatColor.DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                            ChatColor.GRAY.toString() + "- " + ChatColor.WHITE + "\uD83E\uDD3A " + colorize("#B5B5B5") + "ɴᴜʟʟɪғʏ " + ChatColor.DARK_RED + "\uD83E\uDD3C",
                            ChatColor.WHITE.toString() + "",
                            ChatColor.GRAY.toString() + "- " + ChatColor.WHITE + "⚔" + colorize("#910D0D") + " ᴄʜᴀᴅ sᴛʀᴇɴɢᴛʜ " + ChatColor.GREEN + "\uD83E\uDDD1\uD83C\uDFFB",
                            ChatColor.GRAY.toString() + "- " + ChatColor.WHITE + "⚔" + colorize("#910D0D") + " ᴄʜᴀᴅ sᴛʀᴇɴɢᴛʜ " + ChatColor.GREEN + "\uD83E\uDD3C"
                        )
                    )
                }

                if (energy == Energy.Cracked) {
                    itemMeta.setCustomModelData(50)

                    itemMeta.setLore(
                        Arrays.asList<String?>(
                            ChatColor.WHITE.toString() + "" + ChatColor.BOLD + "ʜᴀᴠᴇ ᴛʜᴇ sᴛʀᴇɴɢᴛʜ ᴏғ ᴀ ᴀʀᴍʏ",
                            colorize("&f(") + energystage + colorize("&f)"),
                            ChatColor.WHITE.toString() + " ",
                            colorize("#F10303") + "🔮" + " " + colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                            ChatColor.GRAY.toString() + "- " + ChatColor.GRAY + "Strength",
                            ChatColor.GRAY.toString() + "- Enchants Sharpness",
                            ChatColor.WHITE.toString() + " ",
                            colorize("#F10303") + "🔮" + " " + colorize("#82F3FF") + ChatColor.BOLD + "ᴀʙɪʟɪᴛʏ",
                            ChatColor.GRAY.toString() + "- " + colorize("#F10303") + "Bounty Hunter",
                            ChatColor.WHITE.toString() + " ",
                            colorize("#F10303") + "🔮 " + colorize("#B8FFFB") + ChatColor.BOLD + "ᴘᴏᴡᴇʀs",
                            ChatColor.GRAY.toString() + "- " + ChatColor.WHITE + "\uD83E\uDD3A " + colorize("#B5B5B5") + "ғʀᴀɪʟᴇʀ " + ChatColor.DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                            ChatColor.GRAY.toString() + "- " + ChatColor.WHITE + "\uD83E\uDD3A " + colorize("#B5B5B5") + "ɴᴜʟʟɪғʏ " + ChatColor.DARK_RED + "\uD83E\uDD3C",
                            ChatColor.WHITE.toString() + "",
                            ChatColor.GRAY.toString() + "- " + ChatColor.WHITE + "⚔" + colorize("#910D0D") + " ᴄʜᴀᴅ sᴛʀᴇɴɢᴛʜ " + ChatColor.GREEN + "\uD83E\uDDD1\uD83C\uDFFB",
                            ChatColor.GRAY.toString() + "- " + ChatColor.WHITE + "⚔" + colorize("#910D0D") + " ᴄʜᴀᴅ sᴛʀᴇɴɢᴛʜ " + ChatColor.GREEN + "\uD83E\uDD3C"
                        )
                    )
                }


                if (energy == Energy.Damaged) {
                    itemMeta.setCustomModelData(70)

                    itemMeta.setLore(
                        Arrays.asList<String?>(
                            ChatColor.WHITE.toString() + "" + ChatColor.BOLD + "ʜᴀᴠᴇ ᴛʜᴇ sᴛʀᴇɴɢᴛʜ ᴏғ ᴀ ᴀʀᴍʏ",
                            colorize("&f(") + energystage + colorize("&f)"),
                            ChatColor.WHITE.toString() + " ",
                            colorize("#F10303") + "🔮" + " " + colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                            ChatColor.GRAY.toString() + "- " + ChatColor.GRAY + "Strength",
                            ChatColor.GRAY.toString() + "- Enchants Sharpness",
                            ChatColor.WHITE.toString() + " ",
                            colorize("#F10303") + "🔮" + " " + colorize("#82F3FF") + ChatColor.BOLD + "ᴀʙɪʟɪᴛʏ",
                            ChatColor.GRAY.toString() + "- " + colorize("#F10303") + "Bounty Hunter",
                            ChatColor.WHITE.toString() + " ",
                            colorize("#F10303") + "🔮 " + colorize("#B8FFFB") + ChatColor.BOLD + "ᴘᴏᴡᴇʀs",
                            ChatColor.GRAY.toString() + "- " + ChatColor.WHITE + "\uD83E\uDD3A " + colorize("#B5B5B5") + "ғʀᴀɪʟᴇʀ " + ChatColor.DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                            ChatColor.GRAY.toString() + "- " + ChatColor.WHITE + "\uD83E\uDD3A " + colorize("#B5B5B5") + "ɴᴜʟʟɪғʏ " + ChatColor.DARK_RED + "\uD83E\uDD3C",
                            ChatColor.WHITE.toString() + "",
                            ChatColor.GRAY.toString() + "- " + ChatColor.WHITE + "⚔" + colorize("#910D0D") + " ᴄʜᴀᴅ sᴛʀᴇɴɢᴛʜ " + ChatColor.GREEN + "\uD83E\uDDD1\uD83C\uDFFB",
                            ChatColor.GRAY.toString() + "- " + ChatColor.WHITE + "⚔" + colorize("#910D0D") + " ᴄʜᴀᴅ sᴛʀᴇɴɢᴛʜ " + ChatColor.GREEN + "\uD83E\uDD3C"
                        )
                    )
                }

                if (energy == Energy.Ruined) {
                    itemMeta.setCustomModelData(90)

                    itemMeta.setLore(
                        Arrays.asList<String?>(
                            ChatColor.WHITE.toString() + "" + ChatColor.BOLD + "ʜᴀᴠᴇ ᴛʜᴇ sᴛʀᴇɴɢᴛʜ ᴏғ ᴀ ᴀʀᴍʏ",
                            colorize("&f(") + energystage + colorize("&f)"),
                            ChatColor.WHITE.toString() + " ",
                            colorize("#F10303") + "🔮" + " " + colorize("#FFE4AB") + "ᴘᴀssɪᴠᴇs",
                            ChatColor.GRAY.toString() + "No Passives",
                            ChatColor.WHITE.toString() + " ",
                            colorize("#F10303") + "🔮" + " " + colorize("#82F3FF") + ChatColor.BOLD + "ᴀʙɪʟɪᴛʏ",
                            ChatColor.GRAY.toString() + "- " + colorize("#F10303") + "Bounty Hunter",
                            ChatColor.WHITE.toString() + " ",
                            colorize("#F10303") + "🔮 " + colorize("#B8FFFB") + ChatColor.BOLD + "ᴘᴏᴡᴇʀs",
                            ChatColor.GRAY.toString() + "- " + ChatColor.WHITE + "\uD83E\uDD3A " + colorize("#B5B5B5") + "ғʀᴀɪʟᴇʀ " + ChatColor.DARK_RED + "\uD83E\uDDD1\uD83C\uDFFB",
                            ChatColor.GRAY.toString() + "- " + ChatColor.WHITE + "\uD83E\uDD3A " + colorize("#B5B5B5") + "ɴᴜʟʟɪғʏ " + ChatColor.DARK_RED + "\uD83E\uDD3C",
                            ChatColor.WHITE.toString() + "",
                            ChatColor.GRAY.toString() + "- " + ChatColor.WHITE + "⚔" + colorize("#910D0D") + " ᴄʜᴀᴅ sᴛʀᴇɴɢᴛʜ " + ChatColor.GREEN + "\uD83E\uDDD1\uD83C\uDFFB",
                            ChatColor.GRAY.toString() + "- " + ChatColor.WHITE + "⚔" + colorize("#910D0D") + " ᴄʜᴀᴅ sᴛʀᴇɴɢᴛʜ " + ChatColor.GREEN + "\uD83E\uDD3C"
                        )
                    )
                }


                if (energy == Energy.Broken) {
                    itemMeta.setCustomModelData(100)
                    itemMeta.setLore(
                        Arrays.asList<String?>(
                            energystage
                        )
                    )
                }
                item.setItemMeta(itemMeta)
                return item
            }
        }

        return null
    }
}

