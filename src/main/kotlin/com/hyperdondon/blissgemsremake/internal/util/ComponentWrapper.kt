package com.hyperdondon.blissgemsremake.internal.util

import net.kyori.adventure.text.Component
import net.kyori.adventure.text.minimessage.MiniMessage
import net.kyori.adventure.text.serializer.legacy.LegacyComponentSerializer
import org.bukkit.ChatColor
import java.lang.String

class ComponentWrapper {
    public val component: Component

    constructor(text: kotlin.String) {
        component = parse(text)
    }

    constructor(vararg texts: kotlin.String?) {
        this.component = parse(String.join("\n&r", *texts))
    }

    fun toSectionSign(): kotlin.String {
        return LegacyComponentSerializer.legacySection().serialize(component)
    }

    fun toAmpersand(): kotlin.String {
        return LegacyComponentSerializer.legacyAmpersand().serialize(component)
    }

    fun splitLines(): MutableList<Component?> {
        val lines: MutableList<Component?> = ArrayList()
        val serialized = LegacyComponentSerializer.legacySection().serialize(component)

        for (line in serialized.split("\n".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()) {
            lines.add(LegacyComponentSerializer.legacySection().deserialize(line))
        }

        return lines
    }

    companion object {
        fun parse(text: kotlin.String): Component {
            var text = text
            text = ChatColor.translateAlternateColorCodes('&', text) //ampersand coloring is dope
            text = MiniMessage.miniMessage().serialize(
                LegacyComponentSerializer.legacySection().deserialize(text)
            ) //turn the text into a component, then turn it into minimessage
            if (text.startsWith("\\")) text =
                text.substring(1) //for whatever reason, the text will have a blackslash at the start and removing it makes it work??

            return Companion.miniMessage(text.replace("\\", "")) //finally, make it a component
        }

        fun miniMessage(text: kotlin.String): Component {
            return MiniMessage.miniMessage().deserialize(text)
        }

        fun miniMessage(vararg texts: kotlin.String?): Component {
            return Companion.miniMessage(String.join("\n", *texts))
        }

        fun format(text: kotlin.String): kotlin.String {
            return ComponentWrapper(text).toSectionSign()
        }
    }
}
