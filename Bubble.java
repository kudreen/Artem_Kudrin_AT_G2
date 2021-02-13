package com.company;

public class Bubble {
    double volume = 0.3;
    String burst = "Cramp!";
    public Bubble(){}
    public Bubble(String burst){
        this.burst = burst;
    }

    // Bubble gasComp = new Bubble(); это нужно вставить там, где будет вызываться состав газа

    private void gasComp() {
        String oxygen = "o2";
        String carbonDioxide = "co2";
    }
}

