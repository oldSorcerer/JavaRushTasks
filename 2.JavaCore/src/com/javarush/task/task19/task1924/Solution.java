package com.javarush.task.task19.task1924;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

/* 
Замена чисел
*/

public class Solution {
    public static Map<Integer, String> map = new HashMap<>();

    static {
        String[] array = {"ноль", "один", "два", "три", "четыре", "пять", "шесть",
        "семь", "восемь", "девять", "десять", "одиннадцать", "двенадцать"};

        IntStream.range(0, array.length).forEach(i -> map.put(i, array[i]));

//        map.put(0, "ноль");
//        map.put(1, "один");
//        map.put(2, "два");
//        map.put(3, "три");
//        map.put(4, "четыре");
//        map.put(5, "пять");
//        map.put(6, "шесть");
//        map.put(7, "семь");
//        map.put(8, "восемь");
//        map.put(9, "девять");
//        map.put(10, "десять");
//        map.put(11, "одиннадцать");
//        map.put(12, "двенадцать");
    }

    public static void main(String[] args) throws IOException {

        try (BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
            BufferedReader reader = new BufferedReader(new FileReader(console.readLine()))) {

            while (reader.ready()) {
                String string = reader.readLine();
                for (Map.Entry<Integer, String> entry : map.entrySet()) {
                    string = string.replaceAll("\\b" + entry.getKey() + "\\b", entry.getValue());
                }
                System.out.println(string);
            }
        }
    }
}
