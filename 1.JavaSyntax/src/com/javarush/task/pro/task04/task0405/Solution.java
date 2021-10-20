package com.javarush.task.pro.task04.task0405;

/* 
Незаполненный прямоугольник
*/

public class Solution {
    public static void main(String[] args) {

        int height = 1;
        while (height <= 10) {
            int width = 1;
            while (width <= 20) {
                if (height == 1 || height == 10) {
                    System.out.print('Б');
                } else if (width == 1 || width == 20) {
                    System.out.print('Б');
                } else {
                    System.out.print(' ');
                }
                width++;
            }
            System.out.println();
            height++;
        }

        /*int i = 0;
        while (i < 10) {
            int j = 0;
            if (i == 0 || i == 9) {
                while (j < 20) {
                    System.out.print("Б");
                    j++;
                }
            } else {
                System.out.print("Б");
                while (j < 18) {
                    System.out.print(" ");
                    if (j == 17) {
                        System.out.print("Б");
                    }
                    j++;
                }
            }

            System.out.println();
            i++;

        }*/

    }
}