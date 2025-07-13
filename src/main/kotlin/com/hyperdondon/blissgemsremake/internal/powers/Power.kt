package com.hyperdondon.blissgemsremake.internal.powers

import com.hyperdondon.blissgemsremake.api.Gem
import com.hyperdondon.blissgemsremake.api.SeasonSupport
import com.hyperdondon.blissgemsremake.internal.util.ComponentWrapper
import org.bukkit.entity.Player
import org.bukkit.event.Event

abstract class Power(
    public val id: String,
    public val actionText: ComponentWrapper,
    public val seasonSupport: SeasonSupport
) {
    open fun runTickTimer() {
    }

    fun runSecondTimer() {
    }

    abstract fun activate(player: Player, gem: Gem, seasonSupport: SeasonSupport, event: Event?)

    abstract fun deactivate(player: Player, gem: Gem, seasonSupport: SeasonSupport)
}
