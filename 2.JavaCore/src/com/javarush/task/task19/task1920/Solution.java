package com.javarush.task.task19.task1920;

import java.io.*;
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

        double max = 0.0;
        for (Map.Entry<String, Double> entry : map.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                set.clear();
                set.add(entry.getKey());
            } else if (entry.getValue() == max) {
                set.add(entry.getKey());
            }
        }

        for (String string : set) {
            System.out.println(string);
        }
    }
}