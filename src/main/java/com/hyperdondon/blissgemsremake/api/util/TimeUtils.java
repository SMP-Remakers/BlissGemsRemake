package com.hyperdondon.blissgemsremake.api.util;

public final class TimeUtils {
    public static long FromMinutesAndSeconds(int min, int sec) {
        for (int i = 0; i < min; i++)
            sec += 60;
        return FromSeconds(sec);
    }

    public static long FromSeconds(int sec) {
        long milli = 0;
        for (int i = 0; i < sec; i++)
            milli += 1000;
        return milli;
    }
}
