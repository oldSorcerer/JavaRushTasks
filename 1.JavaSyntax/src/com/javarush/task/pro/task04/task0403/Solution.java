package com.javarush.task.pro.task04.task0403;

import java.util.Scanner;

/* 
Суммирование
*/

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;

        while (true) {
            if (sc.hasNextInt()) {
               int number = sc.nextInt();
                sum += number;
            } else if (sc.hasNextLine()) {
                String string = sc.nextLine();
                if (string.equals("ENTER")) {
                    break;
                }
            }
        }
        System.out.println(sum);
    }
}