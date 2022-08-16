package com.javarush.task.task04.task0413;

/* 
День недели
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        switch (Integer.parseInt(reader.readLine())) {
            case 1 -> System.out.println("понедельник");
            case 2 -> System.out.println("вторник");
            case 3 -> System.out.println("среда");
            case 4 -> System.out.println("четверг");
            case 5 -> System.out.println("пятница");
            case 6 -> System.out.println("суббота");
            case 7 -> System.out.println("воскресенье");
            default -> System.out.println("такого дня недели не существует");
        }
    }
}