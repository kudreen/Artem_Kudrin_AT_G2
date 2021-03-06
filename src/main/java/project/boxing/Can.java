package com.company;

public abstract class Can extends Vessel implements Containable {
    private double volume;
    private double diameter;
    private int weight;
    private Material material;

    public double getVolume() {
        return volume;
    }
    public void setVolume(double volume) {this.volume = volume;}

    public double getDiameter() {
        return diameter;
    }
    public void setDiameter(double diameter) {this.diameter = diameter;}

    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Material getMaterial() {
        return material;
    }
    public void setMaterial(Material material) {this.material = material;}

    public Can() {
        this.volume = 0;
        this.diameter = 0;
        this.weight = 0;
        this.material = null;
    }
}
