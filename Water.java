package com.company;

public abstract class Water {
    String color = "red";
    String transparency = "good";
    String smell = "vanilla";
    String temperature = "+10";
}

class SparklingWater extends Water {
    boolean isOpened;
    int[] liter = new int[1];
    int[] bobbles = new int[10000];
    int a;
    private void literCapacity() {
        liter = bobbles;
    }

    //- вода заполняется пузырьками при упаковке на заводе, для этого у нее есть метод pump(Bubble[] bubbles)
    public void pump(Bubble[] bubbles) {
        //?????
    }

    // у газировки есть метод isOpened(), который раз в 2 секунды (используем Thread.sleep())  проверяет, состояние закрытости в бутылке и если бутылка открылась, то запускает метод degas(), который удаляет пузырьки по одному и вызывает их лопанье*/
    public void isOpened() throws InterruptedException {
        Thread.sleep(2000);
        if (isOpened = true) {
            degas();
            }
        }
    public void degas(){
        for (int i = 10000; i < bobbles.length; i--) {
            Bubble b = new Bubble();
            System.out.println(b.burst);
        }
}
}



