package com.company;

public class Runner {
    public static void main(String[] args) {
        openBottle1();
        openBottle2();
        openBottle3();
    }

    public static void openBottle1() {
        double volume = 0.5;
        SparklingWater checkIsOpened = new SparklingWater();
        checkIsOpened.checkIsOpened();
        System.out.printf(" Opening small bottle ").println();
    }
    public static void openBottle2() {
        double volume = 1;
        SparklingWater checkIsOpened = new SparklingWater();
        checkIsOpened.checkIsOpened();
        System.out.printf(" Opening medium bottle ").println();
    }
    public static void openBottle3() {
        double volume = 1.5;
        SparklingWater checkIsOpened = new SparklingWater();
        checkIsOpened.checkIsOpened();
        System.out.printf(" Opening big bottle ").println();
    }


}
