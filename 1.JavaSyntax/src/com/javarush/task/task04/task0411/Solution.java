package com.javarush.task.task04.task0411;

/* 
Времена года на Терре
*/

public class Solution {
    public static void main(String[] args) {
        checkSeason(12);
        checkSeason(4);
        checkSeason(7);
        checkSeason(10);
    }

    public static void checkSeason(int month) {
        if ((month <= 2) || (month == 12))
            System.out.println("зима");
        else if (month <= 5)
            System.out.println("весна");
        else if (month <= 8)
            System.out.println("лето");
        else
            System.out.println("осень");
    }
}