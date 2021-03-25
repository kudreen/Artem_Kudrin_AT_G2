package com.company;

public class IntegerMassive {

    public static void main(String[] args) {
        int number = 11;
        method(number);
    }

    public static void method(int number) {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
            continue;
        }

        for (int a = array.length - 1; a >= number; a--)
         System.out.println(array[a]);
        }
    }
