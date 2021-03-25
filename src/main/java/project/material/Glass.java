package com.company.material;

public class Glass extends Material {
    public Glass (double thermalConductivity, double density, String color) {
        super(thermalConductivity, density, color);
    }

    public Glass() {
        super(0.017, 2200, "green");
    }


}
