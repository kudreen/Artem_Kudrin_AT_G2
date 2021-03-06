package com.company;

public abstract class Can extends Vessel implements Containable{
    private double volume;
    private double diameter;
    private int weight;
    private Material material;



    }

    public Can() {
        this.volume = 0;
        this.diameter = 0;
        this.weight = 0;
        this.material = null;
    }
}
