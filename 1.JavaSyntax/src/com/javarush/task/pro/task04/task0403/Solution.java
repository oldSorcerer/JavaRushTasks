package com.javarush.task.pro.task04.task0403;

import java.util.Scanner;

/* 
Суммирование
*/

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean isExit;

        int sum = 0;

        while (true) {
            String string = sc.nextLine();
            isExit = string.equals("ENTER");

            if (isExit)
                break;

            sum += Integer.parseInt(string);

        }

        System.out.println(sum);
    }
}