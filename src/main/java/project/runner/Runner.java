package com.company;

public class Runner {


    public static void main(String[] args) throws InterruptedException {
        openSmallBottle();
    }

    public static void openSmallBottle() throws InterruptedException {


        Material material = new Material(1, 1, "red") {
        };
        Bottle smallBottle = new Bottle(0.5, 1, 1, material);
        SparklingWater openSmallBottle = new SparklingWater();
        Bottle mediumBottle = new Bottle(1, 1, 1, material);
        SparklingWater openMediumBottle = new SparklingWater();
        Bottle bigBottle = new Bottle(1.5, 1, 1, material);
        SparklingWater openBigBottle = new SparklingWater();

    }
}






