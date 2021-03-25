package com.company.vessel;

import com.company.material.Plastic;
import com.company.stuff.SparklingWater;
import com.company.material.Material;
import com.company.stuff.Transformable;

import java.util.ArrayList;
import java.util.List;

public class Bottle extends Vessel implements Containable {
    private SparklingWater water;
    List<Integer> bubbles = new ArrayList<>();

    public Bottle(double volume, double diameter, int weight, Material material) {
        super(volume, 10.0, weight, material);
    }


/*
    public Bottle(){
        super(0.5, 2.0, 1, new Plastic());

    }
*/


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
        this.water.setOpened(true);
        //System.out.printf(" Set water statement to 'open' ").println();
    }

    @Override
    public void close() {

    }

    public void warm(int temperature) {

        //System.out.printf(" Warming water to %s", temperature).println();
    }

    public SparklingWater getWater() {
        return this.water;
        //System.out.printf(" Getting 'Water' object");
    }

    public void setWater(SparklingWater water) {
        this.water = water;
        //System.out.print(" Add new 'water' object ");
    }
}

   /* @Override
    public String toString(){
        return "Bottle {" +
                "volume=" + volume + '\'' + "}";
    }*/

