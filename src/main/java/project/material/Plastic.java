package com.company.material;

import com.company.material.Material;

public class Plastic extends Material {
    public Plastic (double thermalConductivity, double density, String color) {
        super(thermalConductivity, density, color);
    }

    public Plastic() {
        super(0.2, 1800, "white");
    }
}
