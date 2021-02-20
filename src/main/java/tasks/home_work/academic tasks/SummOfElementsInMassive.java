package com.company;

public class SummOfElementsInMassive {

    public static void main(String[] args) {
        int firstElement = 11;
        int secondElement = 22;
        int thirdElement = 78;
        summOfElementsInMassive(firstElement, secondElement, thirdElement);
}

    public static void summOfElementsInMassive(int firstElement, int secondElement, int thirdElement){
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        System.out.println(array[firstElement] + array[secondElement] + array[thirdElement]);
    }
}






