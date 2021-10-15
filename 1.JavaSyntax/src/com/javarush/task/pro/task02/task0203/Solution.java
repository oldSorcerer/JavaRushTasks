package com.javarush.task.pro.task02.task0203;

/* 
Последняя цифра числа
*/

public class Solution {

    public static void main(String[] args) {
        int number = 546;

        int lastDigit = number % 10;

        System.out.println(lastDigit);
    }
}