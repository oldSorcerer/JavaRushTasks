package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int g = Integer.parseInt(reader.readLine());

        if ((g % 4) == 0) {
            if (((g % 100) == 0) && ((g % 400) != 0)) {
                System.out.println("количество дней в году: 365");
            } else {
                System.out.println("количество дней в году: 366");
            }
        } else {
            System.out.println("количество дней в году: 365");
        }
    }
}