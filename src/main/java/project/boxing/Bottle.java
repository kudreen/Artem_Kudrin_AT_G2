package com.company;

public class Bottle {
    private double volume;
    private SparklingWater water;
    private Bubble[] bobbles;

    public Bottle(double volume) throws InterruptedException {

        this.bobbles = new Bubble[(int) (volume * 10000)]; //заполнилось массивом пузырьков из расчёта объёма
        this.setWater(water);
        water = new SparklingWater();

        water.pump(bobbles);
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
        this.water = water;
        System.out.printf(" Getting 'Water' object");
        return water;
        // тут ок
    }

    public void setWater(SparklingWater water) throws InterruptedException {
        water = new SparklingWater();
        System.out.print(" Add new 'water' object ");

    }
}
