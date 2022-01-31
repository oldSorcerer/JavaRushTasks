package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();

    static {
        labels.put(1d, "1d");
        labels.put(2d, "2d");
        labels.put(3d, "3d");
        labels.put(4d, "4d");
        labels.put(5d, "5d");
    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}
