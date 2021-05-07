package com.company.vessel;

import com.company.material.Material;

public abstract class Vessel {
    private double volume;
    private double diameter;
    private int weight;
    private Material material;


    public Vessel(double volume, double diameter, int weight, Material material) {
        this.volume = volume;
        this.diameter = diameter;
        this.weight = weight;
        this.material = material;
    }

    public Vessel(double volume, double diameter, Material material) {
        this.volume = volume;
        this.diameter = diameter;
        this.material = material;
    }

    public double getVolume() {
        return volume;
    }

    public double setVolume(double volume) {
        this.volume = volume;
        return volume;
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

    public Material setMaterial(Material material) {
        this.material = material;
        return material;
    }
}



