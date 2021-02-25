package com.company;

public class Bottle {
    private double volume;
    private SparklingWater water;
    private Bubble[] bobbles;

    public Bottle(double volume) {

        this.bobbles = new Bubble[(int) (volume * 10000)]; //заполнилось массивом пузырьков из расчёта объёма

       this.water.pump(bobbles);
    }


    public void open() {
        this.water.setOpened(true);
        System.out.printf(" Set water statement to 'open' ").println();

    }

    public void warm(int temperature) {
        temperature = 40;
        System.out.printf(" Warming water to %s", temperature).println();
        //тут ок
    }

    public SparklingWater getWater() {
        System.out.printf(" Getting 'Water' object");
        return water;
        // тут ок
    }

    public void setWater(SparklingWater water) {
        this.water = water;
        System.out.print(" Add new 'water' object ");
        //тут ок
    }
}
