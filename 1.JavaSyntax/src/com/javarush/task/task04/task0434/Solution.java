package com.javarush.task.task04.task0434;


/* 
Таблица умножения
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 10) {
            int y = 1;
            while (y <= 10) {
                System.out.print(i * y + " ");
                y++;
            }
            System.out.println();
            i++;
        }
    }
}
