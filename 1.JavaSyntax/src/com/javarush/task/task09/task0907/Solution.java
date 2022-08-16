package com.javarush.task.task09.task0907;

/* 
Исключение при работе с числами
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        try {
            int a = 42 / 0;
        } catch (ArithmeticException q) {
            System.out.print("ArithmeticException");
        }
    }
}