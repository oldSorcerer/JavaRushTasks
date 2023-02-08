package com.javarush.task.pro.task05.task0525;

/* 
Ловушка для Роботанка
*/

public class Solution {
    public static String[] array;

    public static void main(String[] args) {
        array = new String[] { "robotank","robotank","robotank","robotank","robotank","robotank" };

        boolean isMissionComplete = false;
        for (String string : array) {
            if ("robotank".equalsIgnoreCase(string)) {
                isMissionComplete = true;
                break;
            }
        }
        System.out.println(isMissionComplete ? "Mission complete" : "Mission not completed");
    }
}