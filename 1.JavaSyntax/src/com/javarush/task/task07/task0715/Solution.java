package com.javarush.task.task07.task0715;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Продолжаем мыть раму
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        List<String> list = new ArrayList<>();
        list.add("мама");
        list.add("мыла");
        list.add("раму");
        list.add(1, "именно");
        list.add(3, "именно");
        list.add(5, "именно");

        for (String string : list) {
            System.out.println(string);
        }
    }
}