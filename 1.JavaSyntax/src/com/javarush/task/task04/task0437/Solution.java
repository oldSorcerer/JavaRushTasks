package com.javarush.task.task04.task0437;


/* 
Треугольник из восьмерок
*/

public class Solution {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int y = 1; y <= i; y++) {
                System.out.print(8);
            }
            System.out.println();
        }
    }
}
