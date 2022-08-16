package com.javarush.task.pro.task05.task0518;

import java.util.Arrays;

/* 
Сортировка массива
*/

public class Solution {

    public static int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};

    public static void main(String[] args) {
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
