package com.company.vessel;

import com.company.stuff.SparklingWater;
import com.company.material.Material;
import com.company.stuff.Transformable;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static com.company.material.Material.Plastic;

public class Bottle extends Vessel implements Containable {
    private SparklingWater water;
    List<Transformable> stuff = new ArrayList<>();

    public Bottle(double volume, double diameter, Material material) {
        super(volume, diameter, material);
        volume = setVolume(0.5);
        material = setMaterial(Plastic);
        diameter = 2.0;
    }

    public Bottle(){
        this(0.5, 2.0, Plastic);
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
        this.water.setOpened(true);
        //System.out.printf(" Set water statement to 'open' ").println();
    }

    @Override
    public void close() {

    }

    public void warm(int temperature) {
        stuff = stuff.stream().peek(x -> x.setOpened(false)).collect(Collectors.toList());
        //System.out.printf(" Warming water to %s", temperature).println();
    }

    /*public SparklingWater getWater() {
        return this.water;
        //System.out.printf(" Getting 'Water' object");
    }

    public void setWater(SparklingWater water) {
        this.water = water;
        //System.out.print(" Add new 'water' object ");
    }*/
}

   /* @Override
    public String toString(){
        return "Bottle {" +
                "volume=" + volume + '\'' + "}";
    }*/

