package com.company;

import java.util.ArrayList;
import java.util.List;

public class Bottle extends Vessel {
    private SparklingWater water;
    List<Integer> bubbles = new ArrayList<>();

    public Bottle(double volume, double diameter, int weight, Material material) throws InterruptedException {
        super(volume, diameter, weight, material);
        for (int i = 0; i < volume * 10000; i++) {
            this.bubbles.add(i);
        }
        SparklingWater.pump(bubbles);
        volume = volume;
        this.bubbles = bubbles;

    }


    public void open() {
        this.water.setOpened(true);
        //System.out.printf(" Set water statement to 'open' ").println();
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

