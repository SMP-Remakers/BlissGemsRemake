package com.hyperdondon.blissgemsremake.internal.util

object TimeUtils {
    fun fromMinutesAndSeconds(min: Int, sec: Int): Long {
        var sec = sec
        for (i in 0..<min) sec += 60
        return fromSeconds(sec)
    }

    fun fromSeconds(sec: Int): Long {
        var milli: Long = 0
        for (i in 0..<sec) milli += 1000
        return milli
    }

    fun toSeconds(milli: Int): Int {
        var milli = milli
        var sec = 0
        while (milli > 0) {
            milli -= 1000
            sec++
        }
        return sec
    }
}
