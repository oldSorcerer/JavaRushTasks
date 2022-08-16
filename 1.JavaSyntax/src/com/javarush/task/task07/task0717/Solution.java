package com.javarush.task.task07.task0717;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Удваиваем слова
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        List<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            list.add(reader.readLine());
        }
        List<String> result = doubleValues(list);
        for (String f : result) {
            System.out.println(f);
        }
    }

    public static List<String> doubleValues(List<String> list) {

        int size = list.size();

        for (int i = 0; i < size; i++) {
            list.add((i + 1), list.get(i));
            i++;
            size++;
        }
        return list;
    }
}