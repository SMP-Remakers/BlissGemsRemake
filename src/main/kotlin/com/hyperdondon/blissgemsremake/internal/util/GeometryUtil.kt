package com.hyperdondon.blissgemsremake.internal.util

import org.bukkit.Location
import org.bukkit.util.Vector
import kotlin.math.cos
import kotlin.math.sin

object GeometryUtil {
    //Circular Stuff
    fun getSphericalVector(r: Double, yaw: Double, pitch: Double): Vector {
        val x = r * cos(pitch) * cos(yaw)
        val y = r * sin(pitch)
        val z = r * cos(pitch) * sin(yaw)
        return Vector(x, y, z)
    }

    fun getSphericalVector(r: Double, yaw: Double): Vector {
        return getSphericalVector(r, yaw, 0.0)
    }

    fun getParticleAmount(r: Double, density: Double): Double {
        return (2 * Math.PI * r / density)
    }

    fun getYaw(r: Double, iteration: Double, density: Double): Double {
        return (iteration * 360) / getParticleAmount(r, density)
    }

    //Directional stuff
    fun forwardsBlocks(pLocation: Location, pBlocks: Double): Location {
        val clone = pLocation.clone()
        val direction = clone.direction.normalize()
        return clone.add(direction.multiply(pBlocks))
    }

    fun backwardsBlocks(pLocation: Location, pBlocks: Double): Location {
        val clone = pLocation.clone()
        val direction = clone.direction.normalize().multiply(-pBlocks)
        return clone.add(direction)
    }

    fun leftBlocks(pLocation: Location, pBlocks: Double): Location {
        val clone = pLocation.clone()
        val yaw = clone.yaw

        val radians = Math.toRadians((yaw - 90).toDouble())
        val left = Vector(-sin(radians), 0.0, cos(radians)).normalize().multiply(pBlocks)
        return clone.add(left)
    }

    fun rightBlocks(pLocation: Location, pBlocks: Double): Location {
        val clone = pLocation.clone()
        val yaw = clone.yaw

        val radians = Math.toRadians((yaw + 90).toDouble())
        val right = Vector(-sin(radians), 0.0, cos(radians)).normalize().multiply(pBlocks)
        return clone.add(right)
    }

    fun leftBlocksWithPitch(pLocation: Location, pBlocks: Double): Location {
        val clone = pLocation.clone()
        clone.yaw = clone.yaw - 90
        val direction = clone.direction.normalize().multiply(pBlocks)
        return clone.add(direction)
    }

    fun rightBlocksWithPitch(pLocation: Location, pBlocks: Double): Location {
        val clone = pLocation.clone()
        clone.yaw = clone.yaw + 90
        val direction = clone.direction.normalize().multiply(pBlocks)
        return clone.add(direction)
    }

    fun aboveBlocks(pLocation: Location, pBlocks: Double): Location {
        val clone = pLocation.clone()
        val direction = clone.direction // Forward
        val right = direction.clone().crossProduct(Vector(0, 1, 0)).normalize() // Right
        val up = right.clone().crossProduct(direction).normalize() // Local up
        return clone.add(up.multiply(pBlocks))
    }

    fun underBlocks(pLocation: Location, pBlocks: Double): Location {
        val clone = pLocation.clone()
        val direction = clone.direction // Forward
        val right = direction.clone().crossProduct(Vector(0, 1, 0)).normalize() // Right
        val up = right.clone().crossProduct(direction).normalize() // Local up
        return clone.subtract(up.multiply(pBlocks))
    }
}