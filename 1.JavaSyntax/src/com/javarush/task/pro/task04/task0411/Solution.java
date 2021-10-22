package com.javarush.task.pro.task04.task0411;

/* 
Четные числа
*/

public class Solution {
    public static void main(String[] args) {
        for (int i = 1; i <= 15 ; i++) {
            if (i % 2 == 0)
                System.out.println(i);
        }
    }
}