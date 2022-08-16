package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        List<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++) {
            list.add(reader.readLine());
        }

        int minL = list.get(0).length();
        for (int i = 0; i < 5; i++) {
            if (minL > list.get(i).length())
                minL = list.get(i).length();
        }

        for (int i = 0; i < 5; i++) {
            if (minL == list.get(i).length())
                System.out.println(list.get(i));
        }


    }
}