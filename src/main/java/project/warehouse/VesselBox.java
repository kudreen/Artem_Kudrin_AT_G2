package com.company.warehouse;

import com.company.vessel.Containable;
import com.company.vessel.Vessel;

import java.io.Serializable;
<<<<<<< HEAD
import java.util.ArrayList;
import java.util.List;
=======
import java.lang.annotation.Native;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
>>>>>>> master


public class VesselBox<T extends Vessel> implements Serializable {
    //public T[] box;
    //public int element;
    //int vessel;
    //public int boxQuantity;
    //T[] array = (T[]) new Object[9];


<<<<<<< HEAD

    private String name = ;
    private int capacity;
    private List<Containable> box;
    private long id;
=======
    private int capacity;
    private List<Containable> box;
    private long id;
    private String name = "I am box with " + capacity + " " + box;

>>>>>>> master

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

<<<<<<< HEAD
    public boolean equals(Object o){

    }

=======
    @Override
    public boolean equals(Object o){
     if (this == o)
         return true;
     if (o == null || this.getClass() != o.getClass())
         return false;
     VesselBox input = (VesselBox) o;
     return box.equals(input.box);
     //&& name.equals(input.name)
    }

    @Override
    public int hashCode(){
        return Objects.hash(box);
    }

    public VesselBox(String name, List<Containable> box){
        this.name = name;
        this.box = box;
        this.capacity = capacity;
    }

    public String getName() {

        return name;
    }
    public List<Containable> getBox() {
        return box;
    }
    public int getCapacity() {

        return capacity;
    }


>>>>>>> master
}






