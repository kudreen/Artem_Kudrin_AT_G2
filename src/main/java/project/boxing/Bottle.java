package com.company;

public class Bottle extends Vessel {
    private double volume;
    private SparklingWater water;
    public Bubble[] bobbles;



    public Bottle(double volume) throws InterruptedException {
        Bubble[] bobbles = new Bubble[(int) (volume * 10000)];//заполнилось массивом пузырьков из расчёта объёма
        setWater(water);
        SparklingWater.pump(bobbles);
        this.volume = volume;
        this.bobbles = bobbles;
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


    private double diameter;
    private int weight;
    private Material material;

    public double getVolume() {
        return volume;
    }
    public void setVolume(double volume) {this.volume = volume;}

    public double getDiameter() {
        return diameter;
    }
    public void setDiameter(double diameter) {this.diameter = diameter;}

    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Material getMaterial() {
        return material;
    }
    public void setMaterial(Material material) {this.material = material;}

    public Bottle() {
        this.volume = 0;
        this.diameter = 0;
        this.weight = 0;
        this.material = null;
    }

}

   /* @Override
    public String toString(){
        return "Bottle {" +
                "volume=" + volume + '\'' + "}";
    }*/

