package com.company.warehouse;

import com.company.material.Material;

import com.company.vessel.Bottle;
import com.company.vessel.Cup;
import com.company.vessel.Vessel;

import java.io.IOException;
import java.util.Map;

import static com.company.material.Material.Glass;
import static com.company.material.Material.Plastic;

public class Warehouse {
    private Map<Integer, VesselBox> stock;


    public void addBox(VesselBox box) throws IOException {
        for (int i = 0; i < 40; i++) {
            stock.put(i, box);
        }

    }

    public void getBox() {

        stock.get(stock);
        System.out.println(stock.hashCode());
        //вывожу хешкод, но не вывожу name
    }

    void removeBox() {

        stock.remove(null);
    }


    public static void warehouse() throws Exception {
        VesselBox<Vessel> bottle = new VesselBox<>(new Bottle(), 9);
        System.out.println(bottle);

        VesselBox<Vessel> cup = new VesselBox<>(new Cup(), 25);
        System.out.println(cup);

    }
}



