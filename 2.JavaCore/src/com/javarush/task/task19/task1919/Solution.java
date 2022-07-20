package com.javarush.task.task19.task1919;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

/* 
Считаем зарплаты
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        try(BufferedReader reader = new BufferedReader(new FileReader(args[0]))) {
            Map<String, Double> map = new TreeMap<>();
            while (reader.ready()) {
                String string = reader.readLine();
                String[] strings = string.split(" ");
                String name = String.valueOf(strings[0]);
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
}
