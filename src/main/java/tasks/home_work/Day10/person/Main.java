package com.company;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int[] age = new Random().ints(100, 1, 100).toArray();


        String name = new Random(100).ints(100, 100, 122)
                .mapToObj(i -> (char) i)
                .limit(5)
                .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
                .toString();

        String surname = new Random(100).ints(100, 100, 122)
                .mapToObj(i -> (char) i)
                .limit(7)
                .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
                .toString();


        List<Object> list = Arrays.asList(age, name, surname);

        list.stream().filter(p -> p.a <= 21).

    }
}

