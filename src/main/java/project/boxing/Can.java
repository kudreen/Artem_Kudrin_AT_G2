package com.company;

public abstract class Can extends Vessel implements Containable {
    public Can(double volume, double diameter, int weight, Material material) {
        super(volume, diameter, weight, material);
    }
}
