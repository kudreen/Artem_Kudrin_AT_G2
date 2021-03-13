package com.company;

import java.lang.reflect.Array;

public class VesselBox<T extends Vessel> {
    public T[] box;
    //public int element;
    public int boxQuantity;
    T[] array = (T[]) new Object[9];

   public void vesselBox (Containable vessel, int boxQuantity) throws Exception {
        if (boxQuantity != 9 || boxQuantity != 25 || boxQuantity != 36)
            throw new Exception("The quantity is not allowed");
    }
}



