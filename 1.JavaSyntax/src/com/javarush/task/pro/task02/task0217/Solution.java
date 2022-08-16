package com.javarush.task.pro.task02.task0217;

/* 
Разгон Амиго
*/

public class Solution {
    public static void main(String[] args) {
        int numberOne = 3;
        int numberTwo = 1;
        int numberThree = 1;
        String string = "00";

        String result = numberTwo + string + (numberOne + numberTwo + numberThree) + string;
        System.out.println("Разгоняем Амиго на " + result + "%");
    }
}
