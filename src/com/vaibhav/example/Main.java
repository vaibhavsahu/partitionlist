package com.vaibhav.example;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        final int chunkSize = 3;
        final AtomicInteger counter = new AtomicInteger();
        List<Integer> list = Arrays.asList(1, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);
        Collection<List<Integer>> listOfList = list.stream()
                .collect(Collectors.groupingBy(it -> counter.getAndIncrement()/chunkSize))
                .values();
        System.out.println(listOfList);;
    }
}
