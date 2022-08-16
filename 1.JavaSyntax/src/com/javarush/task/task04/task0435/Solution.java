package com.javarush.task.task04.task0435;

/* 
Четные числа
*/

public class Solution {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if ((i % 2) == 0)
                System.out.println(i);
        }
    }
}
