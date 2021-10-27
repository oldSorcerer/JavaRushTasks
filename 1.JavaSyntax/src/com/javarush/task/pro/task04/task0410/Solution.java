package com.javarush.task.pro.task04.task0410;

import java.util.Scanner;

/* 
Второе минимальное число из введенных
*/

public class Solution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int min = sc.nextInt();
        int secondMin = sc.nextInt();

        if (secondMin < min) {
            int tmp = min;
            min = secondMin;
            secondMin = tmp;
        }

        while (sc.hasNextInt()) {
            int x = sc.nextInt();
            if (min == secondMin && x > min) {
                secondMin = x;
            } else if (x < min) {
                secondMin = min;
                min = x;
            } else if (x > min && x < secondMin) {
                secondMin = x;
            }
        }
        System.out.println(secondMin);
    }
}