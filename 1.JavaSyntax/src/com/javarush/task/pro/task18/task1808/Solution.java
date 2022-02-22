package com.javarush.task.pro.task18.task1808;

import java.util.ArrayList;
import java.util.Collections;

/* 
Знакомство со ссылками на методы
*/

public class Solution {
    public static void main(String[] args) {
        var strings = new ArrayList<String>();
        Collections.addAll(strings, "Hello", "Amigo", "JavaRush", "CodeGym");

        print(strings);
    }

    public static void print(ArrayList<String> strings) {
        strings.forEach(System.out::println);
    }
}
