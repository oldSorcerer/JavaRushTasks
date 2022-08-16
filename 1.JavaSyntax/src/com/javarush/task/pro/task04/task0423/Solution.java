package com.javarush.task.pro.task04.task0423;

import java.util.Scanner;

/* 
Калибровка климата
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = 0;
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            number = scanner.nextInt();
            sum = sum + number;
        }
        sum = sum/5;
        System.out.println(sum);
    }
}
