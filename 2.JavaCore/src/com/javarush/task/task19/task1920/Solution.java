package com.javarush.task.task19.task1920;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/* 
Самый богатый
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        
        Map<String, Double> map = new TreeMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]))) {
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
        }
        Set<String> set = new TreeSet<>(map.keySet());
        for (String string : set) {
            System.out.println(string);
        }

    }
}