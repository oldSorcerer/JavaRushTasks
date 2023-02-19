package com.javarush.task.pro.task05.task0506;

import java.util.Arrays;
import java.util.Scanner;

/* 
Минимальное из N чисел
*/

public class Solution {
    public static int[] array;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        array = new int[number];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        Arrays.sort(array);

        System.out.println(array[0]);
    }
}
