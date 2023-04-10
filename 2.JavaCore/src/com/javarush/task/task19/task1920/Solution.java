package com.javarush.task.task19.task1920;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

/* 
Самый богатый
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        Map<String, Double> map = new TreeMap<>();
        Set<String> set = new TreeSet<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]))) {
            while (reader.ready()) {
                String[] strings = reader.readLine().split(" ");
                String name = strings[0];
                double aDouble = Double.parseDouble(strings[1]);
                map.merge(name, aDouble, Double::sum);
            }
        }

        double max = Double.MIN_VALUE;
        for (Map.Entry<String, Double> entry : map.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                set.clear();
                set.add(entry.getKey());
            } else if (entry.getValue() == max) {
                set.add(entry.getKey());
            }
        }

        set.forEach(System.out::println);
    }

    public static void main1(String[] args) throws IOException {
        Map<String, Double> map = new TreeMap<>();

        Files.readAllLines(Paths.get(args[0])).stream()
                .map(e -> e.split(" "))
                .forEach(strings -> map.merge(strings[0], Double.parseDouble(strings[1]), Double::sum));

        map.entrySet().stream()
                .filter(entry -> Objects.equals(entry.getValue(), map.values().stream().max(Double::compare).orElseThrow()))
                .forEach(entry -> System.out.println(entry.getKey()));
    }
}