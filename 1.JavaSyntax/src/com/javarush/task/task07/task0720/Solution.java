package com.javarush.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Перестановочка подоспела
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        List<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int number1 = Integer.parseInt(reader.readLine());
        int number2 = Integer.parseInt(reader.readLine());

        String string;
        for (int i = 0; i < number1; i++) {
            list.add(reader.readLine());
        }


        for (int i = 0; i < number2; i++) {
            string = list.get(0);
            list.remove(0);
            list.add(number1 - 1, string);
        }

        for (String g : list) {
            System.out.println(g);
        }
    }
}