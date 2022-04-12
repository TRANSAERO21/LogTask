package com.elseboot3909.LogTask;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;
import java.util.stream.Stream;

public class Main {

    private static Random random = new Random();

    public static void main(String[] args) {
        Stream<Log> generator = Stream
                .generate(() -> new Log(LogType.generateRandom(), random.nextInt(1000)));
        ArrayList<Log> list = new ArrayList<>();
        generator.limit(30).forEach(list::add);

        list.stream()
                .sorted((o1, o2) -> o1.compare(o2, o1))
                .forEach(System.out::println);

        System.out.println();

        list.stream()
                .filter((log) -> log.Count < 100)
                .forEach(System.out::println);

    }
}
