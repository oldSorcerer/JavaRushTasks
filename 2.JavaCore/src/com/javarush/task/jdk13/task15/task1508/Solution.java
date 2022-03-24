package com.javarush.task.jdk13.task15.task1508;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<>();

    static {
        labels.put(1.0, "Один");
        labels.put(2.0, "Два");
        labels.put(3.0, "Три");
        labels.put(4.0, "Четыре");
        labels.put(5.0, "Пять");
    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}
