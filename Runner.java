package com.company;

public class Runner {
    double bottle1 = 0.5;
    int bottle2 = 1;
    double bottle3 = 1.5;

    public static void main(String[] args) {
        openBottles();
    }


    public static void openBottles() {
//- открыть поочередно все бутылки и выпустить из них газ*/
        Bottle opening = new Bottle();
        opening.open();
    }
}


