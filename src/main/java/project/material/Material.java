package com.company.material;

<<<<<<< HEAD
public abstract class Material {
=======
public enum Material {
    Glass ( 0.017, "green", 2200),
    Plastic (0.2, "white", 1800),
    Metal (58.0, "silver", 7800);

>>>>>>> master
    private double thermalConductivity;
    private String color;
    private double density;

<<<<<<< HEAD
    public Material(double thermalConductivity, double density, String color) {
        this.thermalConductivity = 0;
        this.color = "white";
        this.density = 0;
    }

    public Material() {

    }

    /*public Material() {

    }*/
=======


    Material(double thermalConductivity, String color, double density) {
        this.thermalConductivity = thermalConductivity;
        this.color = color;
        this.density = density;
    }


>>>>>>> master

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