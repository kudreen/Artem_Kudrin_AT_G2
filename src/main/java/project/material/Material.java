package com.company.material;

public abstract class Material {
    private double thermalConductivity;
    private String color;
    private double density;

    public Material(double thermalConductivity, double density, String color) {
        this.thermalConductivity = 0;
        this.color = "white";
        this.density = 0;
    }

    public Material() {

    }

    /*public Material() {

    }*/

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

    public void setDensity(double density) {
        this.density = density;
    }


}