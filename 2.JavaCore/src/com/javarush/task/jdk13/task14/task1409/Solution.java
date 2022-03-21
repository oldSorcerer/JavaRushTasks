package com.javarush.task.jdk13.task14.task1409;

import java.time.DayOfWeek;

/* 
Усложняем switch expression
*/

public class Solution {

    public static void main(String[] args) {
        for (DayOfWeek day : DayOfWeek.values()) {
            System.out.print(day + ": ");
            System.out.println("(" + getLettersCount(day) + ")");
        }
    }

    public static int getLettersCount(DayOfWeek day) {
        return switch (day) {
            case MONDAY, FRIDAY, SUNDAY -> {
                System.out.print("шесть");
                yield 6;}
            case TUESDAY -> {
                System.out.print("семь");
                yield 7;}
            case THURSDAY, SATURDAY ->{
                System.out.print("восемь");
                yield 8;}
            case WEDNESDAY -> {
                System.out.print("девять");
                yield 9;}
        };
    }
}
