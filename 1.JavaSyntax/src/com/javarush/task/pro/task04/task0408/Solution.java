package com.javarush.task.pro.task04.task0408;

import java.util.Scanner;

/* 
Максимум из введенных чисел
*/

public class Solution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int min = Integer.MIN_VALUE;

        while (sc.hasNextInt()) {
            int number = sc.nextInt();

            if (number > min && (number % 2 ) == 0) {
                min = number;
            }
        }
        System.out.println(min);

    }
}