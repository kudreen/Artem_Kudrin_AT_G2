package com.company.vessel;

import com.company.material.Material;

public abstract class Vessel {
    private double volume;
    private double diameter;
    private int weight;
    private Material material;


    public Vessel(double volume, double diameter, int weight, Material material) {
        this.volume = 1;
        this.diameter = 1;
        this.weight = 1;
        this.material = material;
    }

    public Vessel() {
        Material density = new Material() {
            @Override
            public double getDensity() {
                return super.getDensity();
            }
        };

        double dens = density.getDensity();

        this.weight = (int) (dens * volume / 4);
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }
}



