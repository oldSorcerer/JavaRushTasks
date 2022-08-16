package com.javarush.task.task09.task0909;

/* 
Исключение при работе с массивами
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        try {
            int[] array = new int[2];
            array[8] = 5;
        } catch (ArrayIndexOutOfBoundsException q) {
            System.out.print("ArrayIndexOutOfBoundsException");
        }
    }
}