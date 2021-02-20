package com.company;
import java.util.Calendar;

public class SumEqualDate {

    public static void main(String[] args) {
        int[] array = new int[10];
        int month = Calendar.MONTH;

        int summ = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
            if (array[i] % month == 0) {
                summ = summ + array[i];
            }
        }
        System.out.println(summ);
    }
}






    /*f (array[i] % month != 0) {
        int sum = 0;
        for (int element : array)*/


//int sum = IntStream.of(array).sum();

/* System.out.println(sum += element);
 */










