package com.hyperdondon.blissgemsremake.api.util;

import org.bukkit.Location;
import org.bukkit.util.Vector;

public class GeometryUtil {
    //Circular Stuff
    public static Vector getSphericalVector(double r, double yaw, double pitch) {
        double x = r * Math.cos(pitch) * Math.cos(yaw);
        double y = r * Math.sin(pitch);
        double z = r * Math.cos(pitch) * Math.sin(yaw);
        return new Vector(x, y, z);
    }

    public static Vector getSphericalVector(double r, double yaw) {
        return getSphericalVector(r, yaw, 0);
    }

    public static double getParticleAmount(double r, double density) {
        return (2 * Math.PI * r / density);
    }

    public static double getYaw(double r, double iteration, double density) {
        return (iteration * 360) / getParticleAmount(r, density);
    }

    //Directional stuff
    public static Location forwardsBlocks(Location pLocation, double pBlocks) {
        Location clone = pLocation.clone();
        Vector direction = clone.getDirection().normalize();
        return clone.add(direction.multiply(pBlocks));
    }

    public static Location backwardsBlocks(Location pLocation, double pBlocks) {
        Location clone = pLocation.clone();
        Vector direction = clone.getDirection().normalize().multiply(-pBlocks);
        return clone.add(direction);
    }

    public static Location leftBlocks(Location pLocation, double pBlocks) {
        Location clone = pLocation.clone();
        float yaw = clone.getYaw();

        double radians = Math.toRadians(yaw - 90);
        Vector left = new Vector(-Math.sin(radians), 0, Math.cos(radians)).normalize().multiply(pBlocks);
        return clone.add(left);
    }

    public static Location rightBlocks(Location pLocation, double pBlocks) {
        Location clone = pLocation.clone();
        float yaw = clone.getYaw();

        double radians = Math.toRadians(yaw + 90);
        Vector right = new Vector(-Math.sin(radians), 0, Math.cos(radians)).normalize().multiply(pBlocks);
        return clone.add(right);
    }

    public static Location leftBlocksWithPitch(Location pLocation, double pBlocks) {
        Location clone = pLocation.clone();
        clone.setYaw(clone.getYaw() - 90);
        Vector direction = clone.getDirection().normalize().multiply(pBlocks);
        return clone.add(direction);
    }

    public static Location rightBlocksWithPitch(Location pLocation, double pBlocks) {
        Location clone = pLocation.clone();
        clone.setYaw(clone.getYaw() + 90);
        Vector direction = clone.getDirection().normalize().multiply(pBlocks);
        return clone.add(direction);
    }

    public static Location aboveBlocks(Location pLocation, double pBlocks) {
        Location clone = pLocation.clone();
        Vector direction = clone.getDirection(); // Forward
        Vector right = direction.clone().crossProduct(new Vector(0, 1, 0)).normalize(); // Right
        Vector up = right.clone().crossProduct(direction).normalize(); // Local up
        return clone.add(up.multiply(pBlocks));
    }

    public static Location underBlocks(Location pLocation, double pBlocks) {
        Location clone = pLocation.clone();
        Vector direction = clone.getDirection(); // Forward
        Vector right = direction.clone().crossProduct(new Vector(0, 1, 0)).normalize(); // Right
        Vector up = right.clone().crossProduct(direction).normalize(); // Local up
        return clone.subtract(up.multiply(pBlocks));
    }
}