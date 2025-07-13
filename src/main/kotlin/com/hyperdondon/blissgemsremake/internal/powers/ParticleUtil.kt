package com.hyperdondon.blissgemsremake.internal.powers

import com.hyperdondon.blissgemsremake.internal.util.GeometryUtil
import org.bukkit.Color
import org.bukkit.Location
import org.mineacademy.fo.remain.CompParticle

object ParticleUtil {
    fun spawnGenericCircle(location: Location, color: Color, radius: Double) {
        val density = 0.1
        var i = 0.0
        while (i < GeometryUtil.getParticleAmount(radius, density)) {
            val yaw = GeometryUtil.getYaw(radius, i, density)
            val spawnLocation = location.clone().add(GeometryUtil.getSphericalVector(radius, yaw))

            CompParticle.REDSTONE.spawn(spawnLocation, color, 1f)
            CompParticle.SMOKE_NORMAL.spawn(spawnLocation, 0.0, 0.0)

            i++
        }
    }
}