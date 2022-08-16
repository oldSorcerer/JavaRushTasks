package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] ints = new int[20];
        for (int i = 0; i < 20; i++) {
            ints[i] = Integer.parseInt(reader.readLine());
        }
        int max = ints[0];
        int min = ints[0];

        for (int i = 0; i < 20; i++) {
            if (max < ints[i])
                max = ints[i];
            if (min > ints[i])
                min = ints[i];
        }

        System.out.println(max + " " + min);
    }
}