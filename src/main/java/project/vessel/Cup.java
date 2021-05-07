package com.company.vessel;

<<<<<<< HEAD
import com.company.material.Glass;
import com.company.material.Material;
import com.company.material.Plastic;
import com.company.stuff.Transformable;

public class Cup extends Vessel implements Containable {
    public Cup(double volume, double diameter, int weight, Material material) {
        super(volume, 8.0, weight, material);
    }


   /*public Cup() {
        super(0.5, 8.0, 1, new Plastic());
    }*/
=======

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
>>>>>>> master

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
