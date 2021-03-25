package com.company.warehouse;

import com.company.vessel.Vessel;

import java.io.*;

public class Stocktaking {

    public static void write(VesselBox<Vessel> vessel) throws IOException {

        FileOutputStream fos = new FileOutputStream("VesselBox");

        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(vessel);

        oos.close();
        fos.close();
    }
}
