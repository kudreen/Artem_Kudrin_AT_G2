package com.company.warehouse;

<<<<<<< HEAD
import com.company.material.Plastic;
=======
import com.company.material.Material;

>>>>>>> master
import com.company.vessel.Bottle;
import com.company.vessel.Cup;
import com.company.vessel.Vessel;

import java.io.IOException;
import java.util.Map;

<<<<<<< HEAD
public class Warehouse  {
=======
import static com.company.material.Material.Glass;
import static com.company.material.Material.Plastic;

public class Warehouse {
>>>>>>> master
    private Map<Integer, VesselBox> stock;


    public void addBox(VesselBox box) throws IOException {
        for (int i = 0; i < 40; i++) {
            stock.put(i, box);
        }

    }

    public void getBox() {
<<<<<<< HEAD
        stock.get(null);
    }

    void removeBox() {
        stock.remove(null);

=======

        stock.get(stock);
        System.out.println(stock.hashCode());
        //вывожу хешкод, но не вывожу name
    }

    void removeBox() {

        stock.remove(null);
>>>>>>> master
    }


    public static void warehouse() throws Exception {
<<<<<<< HEAD
        VesselBox<Vessel> bottle = new VesselBox<>(new Bottle(1, 10.0, 1, new Plastic()), 8);
        System.out.println(bottle);

        VesselBox<Vessel> cup = new VesselBox<>(new Cup(1, 8.0, 1, new Plastic()), 25);
=======
        VesselBox<Vessel> bottle = new VesselBox<>(new Bottle(), 9);
        System.out.println(bottle);

        VesselBox<Vessel> cup = new VesselBox<>(new Cup(), 25);
>>>>>>> master
        System.out.println(cup);

    }
}



