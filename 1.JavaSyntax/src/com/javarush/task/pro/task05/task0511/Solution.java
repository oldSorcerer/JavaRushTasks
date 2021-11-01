package com.javarush.task.pro.task05.task0511;

import java.util.Scanner;

/* 
Создаем двумерный массив
*/

public class Solution {
    public static int[][] multiArray;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nubmer = Integer.parseInt(sc.nextLine());

        if (nubmer > 0) {
            multiArray = new int[nubmer][];
            for (int i = 0; i < nubmer; i++) {
                int n = Integer.parseInt(sc.nextLine());
                multiArray[i] = new int[n];
            }
        }
    }
}
