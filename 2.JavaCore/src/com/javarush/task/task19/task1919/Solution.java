package com.javarush.task.task19.task1919;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

/* 
Считаем зарплаты
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        Map<String, Double> map = new TreeMap<>();

        try(BufferedReader reader = new BufferedReader(new FileReader(args[0]))) {
            while (reader.ready()) {
                String string = reader.readLine();
                String[] strings = string.split(" ");
                String name = strings[0];
                double aDouble = Double.parseDouble(strings[1]);
                if (!map.containsKey(name)) {
                    map.put(name, aDouble);
                } else {
                    map.put(name, map.get(name) + aDouble);
                }
            }
            for (Map.Entry<String, Double> entry : map.entrySet()) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }
    }

//    public static void main1(String[] args) throws IOException {
//        Files.readAllLines(Paths.get(args[0]))
//                .stream()
//                .collect(Collectors
//                        .toMap(k -> k.split(" ")[0], k -> Double.parseDouble(k.split("")[1]), Double::sum, TreeMap::new))
//                .forEach((k, v) -> System.out.println(k + " " + v));
//    }
}