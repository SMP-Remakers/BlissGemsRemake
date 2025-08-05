package com.hyperdondon.blissgemsremake.api

import com.hyperdondon.blissgemsremake.BlissGems.Companion.colorize
import com.hyperdondon.blissgemsremake.BlissGems.Companion.instance
import com.mojang.authlib.GameProfile
import com.mojang.authlib.properties.Property
import net.md_5.bungee.api.ChatColor
import org.bukkit.NamespacedKey
import org.bukkit.inventory.ItemStack
import org.bukkit.inventory.meta.SkullMeta
import org.bukkit.persistence.PersistentDataType
import org.mineacademy.fo.Common
import org.mineacademy.fo.menu.model.ItemCreator
import org.mineacademy.fo.remain.CompEnchantment
import org.mineacademy.fo.remain.CompItemFlag
import org.mineacademy.fo.remain.CompMaterial
import java.util.*

object BlissItems {
    @JvmStatic
    fun getItem(itemType: BlissItemType?, id: String?, energysource: String?, season: Int): ItemStack? {
        if (itemType == BlissItemType.Trader) {
            val item =
                ItemCreator.of(CompMaterial.PLAYER_HEAD)
                    .name(colorize("#E9C2FF") + ChatColor.BOLD + "ᴛʀᴀᴅᴇʀ") //.skullUrl("http://textures.minecraft.net/texture/bf624a44e77b95dbe1cc735536953e840ba6c19b0157c549d9b82534648c8ce4")
                    //.skullOwner("Bliss_SMP")
                    .flags(*CompItemFlag.entries.toTypedArray())
                    .make()

            val itemMeta = item.getItemMeta()
            val idkey = NamespacedKey(instance!!, "trade_item")
            itemMeta.getPersistentDataContainer().set<Int?, Int?>(idkey, PersistentDataType.INTEGER, 1)

            itemMeta.setCustomModelData(0)
            if (season == 2 || season == 3) itemMeta.setLore(
                Arrays.asList<String?>(
                    ChatColor.GRAY.toString() + "ʀɪɢʜᴛ-ᴄʟɪᴄᴋ ᴛᴏ ᴄʜᴀɴɢᴇ ʏᴏᴜʀ ɢᴇᴍ ᴛʏᴘᴇ",
                    ChatColor.GRAY.toString() + "ʏᴏᴜ ᴡɪʟʟ ʀᴇᴄᴇɪᴠᴇ ᴀ ʀᴀɴᴅᴏᴍ ᴛɪᴇʀ ᴏɴᴇ ɢᴇᴍ",
                    ChatColor.WHITE.toString() + "",
                    ChatColor.RED.toString() + "ᴡᴀʀɴɪɴɢ: ᴜsɪɴɢ ᴛʜɪs ᴡɪʟʟ ʟᴏsᴇ ʏᴏᴜʀ ᴄᴜʀʀᴇɴᴛ ɢᴇᴍ"
                )
            )
            else itemMeta.setLore(
                Arrays.asList<String?>(
                    ChatColor.GRAY.toString() + "ʀɪɢʜᴛ-ᴄʟɪᴄᴋ ᴛᴏ ᴄʜᴀɴɢᴇ ʏᴏᴜʀ ɢᴇᴍ ᴛʏᴘᴇ",
                    ChatColor.GRAY.toString() + "ʏᴏᴜ ᴡɪʟʟ ʀᴇᴄᴇɪᴠᴇ ᴀ ʀᴀɴᴅᴏᴍ ᴛɪᴇʀ ᴏɴᴇ ɢᴇᴍ",
                    ChatColor.WHITE.toString() + "",
                    ChatColor.RED.toString() + "ᴡᴀʀɴɪɴɢ: ᴜsɪɴɢ ᴛʜɪs ᴡɪʟʟ ʟᴏsᴇ ʏᴏᴜʀ ᴄᴜʀʀᴇɴᴛ ɢᴇᴍ"
                )
            )


            itemMeta.addEnchant(CompEnchantment.DURABILITY, 1, true)

            item.setItemMeta(itemMeta)

            //W CHATGPT
            //recreates the id inside the trader for s3
            // Your integers
            var id1 = -2041578254 // First part
            var id2 = -1379710610 // Second part
            var id3 = -1313167349 // Third part
            var id4 = 221204661 // Fourth part

            if (season == 2) {
                id1 = -256801287 // First part
                id2 = -349680943 // Second part
                id3 = -1707885155 // Third part
                id4 = -1812836215 // Fourth part
            }

            // Combine the two halves into a UUID
            val msb = (id1.toLong() shl 32) or (id2.toLong() and 0xFFFFFFFFL) // MSB
            val lsb = (id3.toLong() shl 32) or (id4.toLong() and 0xFFFFFFFFL) // LSB

            val uuid = UUID(msb, lsb)
            val skullMeta = item.getItemMeta() as SkullMeta
            val profile = GameProfile(uuid, "Bliss_SMP")

            profile.getProperties().put(
                "textures",
                Property(
                    "textures",
                    "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYmY2MjRhNDRlNzdiOTVkYmUxY2M3MzU1MzY5NTNlODQwYmE2YzE5YjAxNTdjNTQ5ZDliODI1MzQ2NDhjOGNlNCJ9fX0="
                )
            )

            try {
                val profileField = skullMeta.javaClass.getDeclaredField("profile")
                profileField.setAccessible(true)
                profileField.set(skullMeta, profile)
            } catch (e: Exception) {
                Common.error(
                    e,
                    "Base64 Encoding for Trader Head encountered an exception. This could also happen because your server is in offline mode."
                )
            }


            item.setItemMeta(skullMeta)

            return item
        }


        return null
    }
}
