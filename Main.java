package com.company;

import java.lang.reflect.Array;
import java.util.Collections;
import java.util.Random;
import java.lang.Math;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //foo1();
        //foo2();
        //foo3();
        //foo4();
        //foo5();
        foo6();
        //foo7();
        //foo8();
        //foo9();
    }

    //- используя while вывести все числа от 0 до 20 в 1 строку через пробел
    static void foo1() {
        int a = 0;
        while (a <= 20) {
            System.out.print(a + " ");
            a++;
        }
    }

    //- используя for вывести каждое нечетное число от 3 до 19 включительно
    static void foo2() {
        int a;
        for (a = 0; a < 20; a++) {
            if (a % 2 != 0) {
                System.out.print(a + " ");

            }
        }
    }

    //- создать пустой массив типа int и размера n =
    static void foo3() {
        int[] array = new int[8];
        // - заполнить его случайными элементами используя Random.nextInt(n)
        // - пройти по массиву и вывести все элементы
        Random random = new Random();
        for (int a = 0; a < array.length; a++) {
            array[a] = random.nextInt();
            System.out.print(a);
        }
    }


    // - вывести все элементы в обратном порядке
    static void foo4() {
        int[] array = new int[7];
        // - заполнить его случайными элементами используя Random.nextInt(n)
        // - пройти по массиву и вывести все элементы
        Random random = new Random();
        for (int a = 0; a < array.length; a++) {
            array[a] = random.nextInt(100);
            System.out.print(array[a] + " ");
        }
        for (int a = array.length - 1; a >= 0; a--) {
            array[a] = random.nextInt(100);
            System.out.print(array[a] + " ");
        }
    }


    //- каждый элемент умножить на 5 и вывести результат
    static void foo5() {
        int[] array = new int[7];
        Random random = new Random();
        for (int a = 0; a < array.length; a++) {
            array[a] = random.nextInt(100);
            int b = array[a] * 5;
            System.out.print(b + " ");
        }
    }


    //- каждый элемент возвести в квадрат и вывести результат
    static void foo6() {
        int[] array = new int[7];
        Random random = new Random();
        for (int a = 0; a < array.length; a++) {
            array[a] = random.nextInt(100);
            int b = array[a] * array[a];
            System.out.print(b + " ");
        }
    }

    //- найти минимальный элемент массива и вывести результат
    static void foo7() {
        int[] array = new int[7];
        Random random = new Random();

        for (int a = 0; a < array.length; a++) {
            array[a] = random.nextInt(100);
            continue;
        }
        Arrays.sort(array);
        System.out.print(array[0] + " ");
    }

    //- поменять местами первый и последний элементы и вывести результат
    static void foo8() {
        int[] array = new int[7];
        Random random = new Random();

        for (int a = 0; a < array.length; a++) {
            array[a] = random.nextInt(100);
            continue;
        }
        Arrays.sort(array);
        int temp = array[0];
        array[0] = array[6];
        array[6] = temp;
        System.out.print(array[0] + " " + array[6]);
    }

    //- отсортировать элементы массива в порядке убывания (любым способом)
    static void foo9() {
        Integer[] array = new Integer[7];
        Random random = new Random();
        for (int a = 0; a < array.length; a++) {
            array[a] = random.nextInt(100);
        }
        Arrays.sort(array, Collections.reverseOrder());
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}





