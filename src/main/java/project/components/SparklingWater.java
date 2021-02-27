package com.company;

class SparklingWater extends Water {
    private static boolean isOpened;
    private static Bubble[] bubbles;

    public SparklingWater() throws InterruptedException {

        // должен вызывать метод isOpened
        MyThread.isOpened();
        System.out.printf(" Calling inner method 'isOpened()'").println();
    }

    public void pump(Bubble[] bubbles){
        Bubble[] water = new Bubble[0];
        bubbles = water;




        System.out.printf(" Pumping bubbles into water").println();
    }

    public void setOpened(boolean isOpened) {
        isOpened = true;
        System.out.printf(" Change isOpened to %s", isOpened).println();
    }

public static class MyThread extends Thread {
    public static void isOpened() throws InterruptedException {
        MyThread myThread = new MyThread();
        myThread.start();
        //?????
            if (isOpened == true) {
                degas();
            }
            System.out.printf(" Checking bottle statement and run degas()").println();
        }
    }

        public static void degas() throws InterruptedException {
        new Bottle(0.5).warm(10);
        Thread.sleep(1000);
        for (int i = 0; i < bubbles.length; i = 10+5 * temperature) {
                return;
            }
        System.out.printf(" Degassing water by formula ").println();

        }

        public void isSparkle(){
        boolean bobblesLeft = false;
        if (bubbles.length >0){
            bobblesLeft = true;
        }
        System.out.printf(" Checking how much bubbles left in water ").println();
        }
    }


