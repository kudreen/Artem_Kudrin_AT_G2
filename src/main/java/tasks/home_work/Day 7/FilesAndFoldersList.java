package com.company;

import java.io.File;

public class FilesAndFoldersList {

    public static void main(String[] args) {
        File directory = new File("C:\\Users\\KudrinAR\\Desktop");
        if (directory.isDirectory()) {
            for (File item : directory.listFiles()) {
                if (item.isDirectory()) {
                    System.out.println("Папка: " + item.getName());
                } else {
                    System.out.println("Файл: " + item.getName());
                }
            }
        }
    }
}

