package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        int[] ints = new int[20];
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 20; i++) {
            ints[i] = Integer.parseInt(r.readLine());
        }

        int[] arrayOne = new int[10];
        int[] arrayTwo = new int[10];


        for (int i = 0; i < 10; i++) {
            arrayOne[i] = ints[i];
            arrayTwo[i] = ints[i + 10];
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(arrayTwo[i]);
        }
    }
}