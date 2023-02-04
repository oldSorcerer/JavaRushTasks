package com.javarush.task.pro.task04.task0410;

import java.util.Scanner;

/* 
Второе минимальное число из введенных
*/

public class Solution {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int min = scanner.nextInt();
        int secondMin = scanner.nextInt();

        if (secondMin < min) {
            int tmp = min;
            min = secondMin;
            secondMin = tmp;
        }

        while (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            if (min == secondMin && number > min) {
                secondMin = number;
            } else if (number < min) {
                secondMin = min;
                min = number;
            } else if (number > min && number < secondMin) {
                secondMin = number;
            }
        }
        System.out.println(secondMin);
    }
}