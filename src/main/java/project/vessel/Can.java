package com.company.vessel;

import com.company.material.Material;
import com.company.stuff.Transformable;

public abstract class Can extends Vessel implements Containable {
    public Can(double volume, double diameter, int weight, Material material) {
        super(volume, 10.0, weight, material);
    }

   /* public Can() {
        super(0.5, 10.0, 1, new Plastic());
    }*/

    @Override
    public void addStuff(Transformable stuff) {
    }

}
