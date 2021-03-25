package com.company.runner;

import com.company.material.Glass;
import com.company.material.Material;
import com.company.stuff.SparklingWater;
import com.company.vessel.Bottle;
import com.company.warehouse.Warehouse;

public class Runner {


    public static void main(String[] args) throws Exception {
        openSmallBottle();
    }

    public static void openSmallBottle() throws Exception {

       // Material material = new Material(0.017, 2200, "green");

        Glass material = new Glass();

        //SparklingWater smallBottle = new SparklingWater(0.5);
        SparklingWater openSmallBottle = new SparklingWater(0.5);

        //Bottl mediumBottle = new Bottle(1, 1, 1, material);
        SparklingWater openMediumBottle = new SparklingWater(1);

        //Bottle bigBottle = new Bottle(1.5, 1, 1, material);
        SparklingWater openBigBottle = new SparklingWater(1.5);

        Warehouse warehouse = new Warehouse();
        Warehouse.warehouse();

    }


}






