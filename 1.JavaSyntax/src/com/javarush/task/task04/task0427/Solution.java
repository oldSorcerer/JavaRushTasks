package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(reader.readLine());

        if ((t >= 1) && (t <= 999)) {
            if (t < 10) {
                if ((t % 2) == 0)
                    System.out.println("четное однозначное число");
                else
                    System.out.println("нечетное однозначное число");
            } else if (t < 100) {
                if ((t % 2) == 0)
                    System.out.println("четное двузначное число");
                else
                    System.out.println("нечетное двузначное число");
            } else {
                if ((t % 2) == 0)
                    System.out.println("четное трехзначное число");
                else
                    System.out.println("нечетное трехзначное число");
            }
        }
    }
}
