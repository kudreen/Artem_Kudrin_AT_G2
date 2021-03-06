package com.company;

public class Plastic extends Material {
    private double thermalConductivity;
    private String color;
    private double density;


    public double getThermalConductivity() {
        return thermalConductivity;
    }
    public void setThermalConductivity(double thermalConductivity) {
        this.thermalConductivity = thermalConductivity;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public double getDensity() {
        return density;
    }
    public void setDensity(double density) {this.density = density;}

    public Plastic() {
        this.thermalConductivity = 0;
        this.color = null;
        this.density = 0;
    }
}
