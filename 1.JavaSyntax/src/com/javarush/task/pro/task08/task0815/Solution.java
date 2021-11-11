package com.javarush.task.pro.task08.task0815;

/* 
Логические операторы
*/

public class Solution {

    public static void main(String[] args) {
        taskForCondition();
    }

    public static void taskForCondition() {
        int number = 15;
        boolean conditionFirst = number < 15 & number > 25 & (number += 15) < 25;
        boolean conditionSecond = (number | 5) > 12 || (number = number + 2) > 40;
        System.out.println(number);
    }
}
