package com.hyperdondon.blissgemsremake.api.util;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.minimessage.MiniMessage;
import net.kyori.adventure.text.serializer.legacy.LegacyComponentSerializer;

public final class FormatUtil {
    public static Component miniMessage(String text) {
        return MiniMessage.miniMessage().deserialize(text);
    }

    public static Component miniMessage(String... texts) {
        return miniMessage(String.join("<newline>", texts));
    }

    public static String serializeComponent(Component component) {
        return LegacyComponentSerializer.legacySection().serialize(component);
    }

    public static String serializeComponent(Component... components) {
        String[] texts = new String[components.length];
        for (int i = 0; i < components.length; i++) texts[i] = serializeComponent(components[i]);
        return String.join("<newline>", texts);
    }
}
