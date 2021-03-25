package com.company.stuff;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class SparklingWater extends Water implements Serializable {
   private boolean isOpened;
   //private Bubble[] bubbles;
   static List<Integer> bubbles = new ArrayList<>();
    SparklingWater water;


    public SparklingWater(double volume) throws InterruptedException {


        for (int i = 0; i < volume * 10000; i++) {
            this.bubbles.add(i);
        }
        //SparklingWater.pump(bubbles);
        this.bubbles = bubbles;



        isOpened();
    }



    //public static void pump(List<Integer> bubbles) throws InterruptedException {
      //  SparklingWater.bubbles = bubbles;
    //}

    public void setOpened(boolean isOpened) {
        isOpened = true;
    }

    @Override
    public void setTemperature() {

    }


    private boolean isOpened() {
        Thread thread = new Thread();
        thread.run();
        {
            while (this.isOpened = false) {

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

        thread.start();

        return true;
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


