package com.hyperdondon.blissgemsremake.api.util;

import lombok.Getter;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.minimessage.MiniMessage;
import net.kyori.adventure.text.serializer.legacy.LegacyComponentSerializer;
import org.mineacademy.fo.Common;

public class ComponentWrapper {
    @Getter
    private final Component component;

    public ComponentWrapper(String text) {
        component = parse(text);
    }

    public ComponentWrapper(String... texts) {
        component = parse(String.join("\n", texts));
    }

    public static Component parse(String text) {
        text = Common.colorize(text); //use the foundation colorizing method that parses and turns it into using section signs.
        text = MiniMessage.miniMessage().serialize(LegacyComponentSerializer.legacySection().deserialize(text)); //turn the text into a component, then turn it into minimessage
        if (text.startsWith("\\"))
            text = text.substring(1); //for whatever reason, the text will have a blackslash at the start and removing it makes it work??
        return miniMessage(text.replace("\\", "")); //finally, make it a component
    }

    public static Component miniMessage(String text) {
        return MiniMessage.miniMessage().deserialize(text);
    }

    public static Component miniMessage(String... texts) {
        return miniMessage(String.join("\n", texts));
    }

    public static String format(String text) {
        ComponentWrapper wrapper = new ComponentWrapper(text);
        return wrapper.toSectionSign();
    }

    public String toSectionSign() {
        return LegacyComponentSerializer.legacySection().serialize(component);
    }

    public String toAmpersand() {
        return LegacyComponentSerializer.legacyAmpersand().serialize(component);
    }
}
