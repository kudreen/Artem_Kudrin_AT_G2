package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.Stream;

public class GenerateListCollection {

    public static void main(String[] args) {

        Stream.iterate(1, n -> n + 1).limit(10).
                filter(x -> x % 3 == 0).filter(x -> x % 5 == 0);

        Arrays.stream(new Random().ints(20, 1,20).
                toArray()).filter(x -> x % 3 == 0).filter(x -> x % 5 == 0);

    }
}
