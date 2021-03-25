package com.company.stuff;

public class Bubble {
    public static final double volume = 03;
    String gas;

    private Bubble(String gas) {
        gas = "CO2";
    }

    public void cramp() {
        System.out.println("Cramp!");
    }
    public double getVolume() {
        return volume;
    }
}
