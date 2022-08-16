package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        int[] ints = new int[15];
        int ch = 0, nch = 0;
        for (int i = 0; i < 15; i++) {
            ints[i] = Integer.parseInt(r.readLine());
            if ((i % 2) == 0) ch = ch + ints[i];
            else nch = nch + ints[i];
        }
        if (ch > nch)
            System.out.println("В домах с четными номерами проживает больше жителей.");
        else if (nch > ch)
            System.out.println("В домах с нечетными номерами проживает больше жителей.");

    }
}