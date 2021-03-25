package com.company.warehouse;

import com.company.material.Plastic;
import com.company.vessel.Bottle;
import com.company.vessel.Cup;
import com.company.vessel.Vessel;

import java.util.Map;

public class Warehouse {
    private Map<Integer, VesselBox> stock;
    //public void addBox(VesselBox box);

    public void addBox(VesselBox box){

        
    }


    public static void warehouse() throws Exception {
            VesselBox<Vessel> bottle = new VesselBox<>(new Bottle(1, 10.0, 1, new Plastic()), 8);
            System.out.println(bottle);

            VesselBox<Vessel> cup = new VesselBox<>(new Cup(1, 8.0, 1, new Plastic()), 25);
            System.out.println(cup);
        }
    }



