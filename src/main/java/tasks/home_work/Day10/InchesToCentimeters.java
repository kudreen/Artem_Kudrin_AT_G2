package com.company;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Stream;

public class InchesToCentimeters {

    public static void main(String[] args) {
        Collection<Integer> inches = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);

        inches.stream().filter(x -> x % 2 == 0).forEach(System.out::println);
        inches.stream().filter(x -> x % 2 == 0).map(x -> x * 2.54).forEach(System.out::println);
    }
}
