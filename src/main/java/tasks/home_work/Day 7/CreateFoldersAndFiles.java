package com.company;

import java.io.*;
import java.util.Arrays;
import java.util.Random;

public class CreateFoldersAndFiles {

    public static void main(String[] args) throws IOException {
        new File("C:\\Users\\KudrinAR\\Desktop\\New").mkdirs();
        FileOutputStream fosFirstFile = new FileOutputStream("C:\\Users\\KudrinAR\\Desktop\\New\\document.txt");
        FileOutputStream fosSecondFile = new FileOutputStream("C:\\Users\\KudrinAR\\Desktop\\New\\document2.txt");
        ObjectOutputStream oosFirstFile = new ObjectOutputStream(fosFirstFile);
        ObjectOutputStream oosSecondFile = new ObjectOutputStream(fosSecondFile);
        int[] array = new int[10];
        Random random = new Random();
        String ints = "";
        for (int a = 0; a < array.length; a++) {
            array[a] = random.nextInt(100);
            String string = Arrays.toString(array);
            ints = string;
        }
        oosFirstFile.writeObject(ints);
        oosFirstFile.close();
        for (int a = 0; a < array.length; a++) {
            array[a] = random.nextInt(100);
            String string = Arrays.toString(array);
            ints = string;
        }
        oosSecondFile.writeObject(ints);
        oosSecondFile.close();
    }
}
