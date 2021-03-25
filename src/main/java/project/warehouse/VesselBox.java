package com.company.warehouse;

import com.company.vessel.Containable;
import com.company.vessel.Vessel;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class VesselBox<T extends Vessel> implements Serializable {
    //public T[] box;
    //public int element;
    //int vessel;
    //public int boxQuantity;
    //T[] array = (T[]) new Object[9];



    private String name;
    private int capacity;
    private List<Containable> box;
    private long id;

    public VesselBox(T vessel, int boxQuantity) throws Exception {

        if (boxQuantity == 9 | boxQuantity == 25 | boxQuantity == 36 ) {
            ArrayList<Vessel> boxes = new ArrayList<>(boxQuantity);
            for (int i = 0; i < boxQuantity; i++) {
                boxes.add(vessel);
            }
            print((List<T>) boxes);
        }

        else {
            System.out.println("Ошибка");
        }
    }

    private void print(List<T> vessels) {
        for (T vessel : vessels) {
            System.out.println(vessel.getClass().getSimpleName() + " ");
        }
    }

    /*public boolean equals(Object o){
        //переписанный метод equals
    }
*/
}






