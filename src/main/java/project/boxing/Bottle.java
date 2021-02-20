package com.company;

public class Bottle {
    private double volume;
    private SparklingWater water;
    int bobbles;

    public Bottle(double volume) {
        if (volume == 0.5){
            int bobbles[] = new int[5000];
            return;
        }
        else if(volume == 1){
            int bobbles[] = new int[10000];
            return;
        }
        else if (volume == 1.5){
            int bobbles[] = new int[15000];
            return;
        }
    }



    public void open(){
        this.water.setOpened(true);
        System.out.printf(" Set water statement to 'open' ").println();
    }

    public void warm(int temperature) {
        SparklingWater setTemp = new SparklingWater();
        setTemp.setTemperature(10);
        System.out.printf(" Warming water to %s", temperature).println();
    }

    public SparklingWater getWater() {
        return water;
        //System.out.printf(" Return 'Water' object");
    }

    public void setWater(SparklingWater water) {
        this.water = water;
        System.out.print(" Add new 'water' object ");
    }
}
