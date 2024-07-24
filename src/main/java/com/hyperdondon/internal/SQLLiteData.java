package com.hyperdondon.internal;

import lombok.Getter;
import org.mineacademy.fo.collection.SerializedMap;
import org.mineacademy.fo.database.SimpleDatabase;

public final class SQLLiteData extends SimpleDatabase {

    @Getter
    private static volatile SQLLiteData instance = new SQLLiteData();


    public static void Addvar(String name, String value) {
        SQLLiteData.getInstance().addVariable(name, value);
    }

    public static void Getvar(String name) {

    }
}
