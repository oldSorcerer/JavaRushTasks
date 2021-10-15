package com.javarush.task.pro.task02.task0209;

/* 
Конкатенация строк и чисел
*/

public class Solution {

    public static void main(String[] args) {
        int x = 2;
        int y = 4;
        int z = 0;

        String digits = x + y + "" + z ;

        System.out.println(digits);
    }
}
