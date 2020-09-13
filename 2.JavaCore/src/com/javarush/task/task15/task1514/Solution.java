package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();

    static {
        labels.put(1.1, "Один");
        labels.put(1.2, "Два");
        labels.put(1.3, "Три");
        labels.put(1.4, "Четыри");
        labels.put(1.5, "Пять");
    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}
