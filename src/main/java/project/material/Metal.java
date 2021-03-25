package com.company.material;

import com.company.material.Material;

public class Metal extends Material {
    public Metal (double thermalConductivity, double density, String color) {
        super(thermalConductivity, density, color);
    }

    public Metal() {
        super(58.0, 7800, "silver");
    }
}
