package com.company;

class SparklingWater extends Water {
    private boolean isOpened;
    private Bubble[] bubbles;


    public void SparklingWater() {
        this.setOpened(isOpened);
        System.out.printf(" Calling inner method 'isOpened()'").println();
    }

    public void pump(Bubble[] bubbles) {
       //Bottle water = new Bottle().; //??????
       // this.bubbles = volume //????*/


        System.out.printf(" Pumping bubbles into water").println();
    }

    public void setOpened(boolean isOpened) {
        isOpened = !isOpened;
        System.out.printf(" Change isOpened to %s", isOpened).println();
    }

    void checkIsOpened() {
        new Bottle().open();
        if(isOpened == true){
            degas();
        }
        System.out.printf(" Checking bottle statement and run degas()").println();
    }

        public void degas() throws InterruptedException {
        new Bottle().warm();
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


