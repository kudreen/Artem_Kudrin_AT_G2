package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReadFile {

    public static void main(String[] args) throws IOException {

        Files.lines(Paths.get("file.txt"))

                .collect(Collectors.toList()).stream().skip(4)
                .flatMap(x -> Stream.of(x.split(" ")))
                .filter(s -> s.startsWith("Date log:"))
                .map(x -> x.substring(1, 20))
                .map(x -> x + " " + LocalDateTime.now())
                .collect(Collectors.joining("/"));
    }
}
