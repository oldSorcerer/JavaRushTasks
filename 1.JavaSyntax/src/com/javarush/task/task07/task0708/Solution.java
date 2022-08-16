package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Самая длинная строка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        List<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        list.add(reader.readLine());
        list.add(reader.readLine());
        list.add(reader.readLine());
        list.add(reader.readLine());
        list.add(reader.readLine());

        int maxL = 0;

        for (int i = 0; i < 5; i++) {
            if (maxL < (list.get(i)).length()) {
                maxL = list.get(i).length();
            }
        }
        for (int i = 0; i < 5; i++) {
            if (list.get(i).length() == maxL) {
                System.out.println(list.get(i));

            }
        }
    }
}