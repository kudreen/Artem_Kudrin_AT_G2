package com.company.vessel;


import com.company.material.Material;

import com.company.stuff.Transformable;

import static com.company.material.Material.Plastic;

public class Cup extends Vessel implements Containable {
    public Cup(double volume, double diameter, Material material, int i) {
        super(volume, 8.0, material);
    }


   public Cup() {
        super(0.5, 8.0, 1, Plastic);
    }

    @Override
    public void addStuff(Transformable stuff) {

    }

    @Override
    public Transformable removeStuff() {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int getFreeSpace() {
        return 0;
    }

    public void open() {

    }

    @Override
    public void warm(int temperature) {

    }

    @Override
    public void close() {

    }
}
