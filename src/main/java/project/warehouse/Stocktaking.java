package com.company.warehouse;

import com.company.vessel.Vessel;

import java.io.*;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Map;

public class Stocktaking extends Warehouse {
    private static final Path FILE = Path.of("C:\\File\\VesselBox");

    private Stocktaking() {
<<<<<<< HEAD

=======
>>>>>>> master
    }

    public static void registerBox(VesselBox box) throws IOException {
        FileOutputStream fos = new FileOutputStream(String.valueOf(FILE));
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(box);
        fos.close();
        oos.close();
    }

    public static void disposeBox(VesselBox box) throws IOException {
        FileInputStream fis = new FileInputStream(String.valueOf(FILE));
        ObjectInputStream ois = new ObjectInputStream(fis);
        ois.close();
        fis.close();
        ois.close();
    }

<<<<<<< HEAD
    public static void getInfo(){
        System.out.println();
=======
    public static void getInfo() {
        Warehouse getInfo = new Warehouse();
        getInfo.getBox();

>>>>>>> master
    }

}
