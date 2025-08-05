package com.hyperdondon.blissgemsremake.api

import java.time.Duration

object CooldownHandler {
    var cooldowns: HashMap<String?, Long?>? = null

    fun init() {
        cooldowns = HashMap<String?, Long?>()
    }

    @JvmStatic
    fun setCooldown(name: String?, value: Long) {
        cooldowns!!.put(name, value + System.currentTimeMillis())
    }

    @JvmStatic
    fun getCooldown(name: String?): Long {
        if (cooldowns!!.containsKey(name)) return cooldowns!!.get(name)!! - System.currentTimeMillis() + 1000
        setCooldown(name, -1000)
        return getCooldown(name)
    }

    @JvmStatic
    fun canUseCooldown(name: String?): Boolean {
        if (!cooldowns!!.containsKey(name)) return true
        return (getCooldown(name) <= 0)
    }

    @JvmStatic
    @JvmOverloads
    fun parseCooldown(cooldown: Long, color: String? = "<aqua>"): String {
        val duration = Duration.ofMillis(cooldown)

        val minutes = duration.toMinutes()
        val seconds = duration.toSecondsPart().toLong()

        var time = ""
        if (minutes > 0)
            if (seconds > 0)
                time = minutes.toString() + "m " + seconds + "s"
            else
                time = minutes.toString() + "m"
        else if (seconds > 0)
            time = seconds.toString() + "s"


        if (time.isEmpty()) return "<green>Ready!"
        else return color + time
    }

    @JvmStatic
    fun parseCooldown(cooldow: String?): String {
        val cooldown = getCooldown(cooldow)
        return parseCooldown(cooldown)
    }

    @JvmStatic
    fun parseCooldown(cooldow: String?, color: String?): String {
        val cooldown = getCooldown(cooldow)
        return parseCooldown(cooldown, color)
    }
}
