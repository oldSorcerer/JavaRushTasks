package com.javarush.task.pro.task05.task0509;

/* 
Таблица умножения
*/

public class Solution {

    public static int[][] MULTIPLICATION_TABLE = new int[10][10];

    public static void main(String[] args) {

        for (int i = 0; i < MULTIPLICATION_TABLE.length; i++) {
            for (int j = 0; j < MULTIPLICATION_TABLE[i].length; j++) {
                System.out.print( (MULTIPLICATION_TABLE[i][j] = (i + 1) * (j + 1)) + " " );
            }
            System.out.println();
        }
    }
}
