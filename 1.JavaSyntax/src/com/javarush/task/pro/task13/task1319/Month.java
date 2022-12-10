package com.javarush.task.pro.task13.task1319;

/* 
Месяцы в сезоне
*/

import java.util.Arrays;

public enum Month {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER;

    public static Month[] getWinterMonths() {
        return new Month[]{DECEMBER, JANUARY, FEBRUARY};
    }

    public static Month[] getSpringMonths() {
        return Arrays.copyOfRange(Month.values(), 2, 5);
    }

    public static Month[] getSummerMonths() {
        return Arrays.copyOfRange(Month.values(), 5, 8);
    }

    public static Month[] getAutumnMonths() {
        return Arrays.copyOfRange(Month.values(), 8, 11);
    }
}
