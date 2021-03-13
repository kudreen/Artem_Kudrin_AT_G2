package com.company;

import java.util.ArrayList;
import java.util.List;


public class SparklingWater extends Water {//implements Serializable { //ругается на то, что класс не абстрактный
    private static boolean isOpened;
    static List<Integer> bubbles = new ArrayList<>();
    SparklingWater water;


    public SparklingWater() throws InterruptedException {
        isOpened();
        //   System.out.printf(" Calling inner method 'isOpened()'").println();
    }

    public static void pump(List<Integer> bubbles) throws InterruptedException {
        SparklingWater.bubbles = bubbles;
    }

    public void setOpened(boolean isOpened) {
        // System.out.printf(" Change isOpened to %s", isOpened).println();
    }


    public void isOpened() {
        Thread thread = new Thread();
        thread.run();
        {
            while (isOpened) {

                System.out.println("Bottle is closed..");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            try {
                degas();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        ;
        thread.start();
    }
    //   System.out.printf(" Checking bottle statement and run degas()").println()

    private static void degas() throws InterruptedException {
        Thread.sleep(1000);
        int a = 10 + 5 * temperature;
        for (int i = 0; i < bubbles.size(); i++) {
            System.out.println(i + "Cramp!");
        }
        // System.out.printf(" Degassing water by formula ").println();

    }

    public void isSparkle() {
        boolean bobblesLeft = false;
        if (bubbles.size() > 0) {
            bobblesLeft = true;
        }
        // System.out.printf(" Checking how much bubbles left in water ").println();
    }


    @Override
    public void mix() {

    }
}


