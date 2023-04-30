package com.javarush.task.pro.task05.task0505;

import java.util.Scanner;

/* 
Reverse
*/

public class Solution {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int[] array = new int[number];

        if (number > 0) {
            for (int i = 0; i < number; i++) {
                array[i] = Integer.parseInt(scanner.nextLine());
            }
        }

        if (number % 2 != 0) {
            for (int i = 0; i < array.length ; i++) {
                System.out.println(array[i]);
            }
        } else {
            for (int i = array.length - 1; i >= 0 ; i--) {
                System.out.println(array[i]);
            }
        }
    }
}
