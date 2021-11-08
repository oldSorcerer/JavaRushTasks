package com.javarush.task.pro.task11.task1121;

import java.util.Arrays;

/* 
Забытая инициализация
*/

public class Solution {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = i;
        }
        System.out.println(Arrays.toString(array));
    }
}
