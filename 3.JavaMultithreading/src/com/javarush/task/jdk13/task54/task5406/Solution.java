package com.javarush.task.jdk13.task54.task5406;

/* 
Пускаем пузыри
*/

public class Solution {

    public static void main(String[] args) {
        new Sorter(getRandom(10_000), "random array").sortBubbleClassic();
        new Sorter(getRandom(10_000), "random array").sortBubbleAdvanced();
        System.out.println();
        new Sorter(getDecremental(10_000), "decremental array").sortBubbleClassic();
        new Sorter(getDecremental(10_000), "decremental array").sortBubbleAdvanced();
        System.out.println();
        new Sorter(getIncremental(10_000), "incremental array").sortBubbleClassic();
        new Sorter(getIncremental(10_000), "incremental array").sortBubbleAdvanced();
    }

    public static int[] getRandom(int length) {
        int[] array = new int[length];
        for (int count = 0; count < array.length; count++) {
            array[count] = (int) (Math.random() * 100);
        }
        return array;
    }

    public static int[] getDecremental(int length) {
        int[] array = new int[length];
        for (int count = 0; count < array.length; count++) {
            array[count] = array.length - count;
        }
        return array;
    }

    public static int[] getIncremental(int length) {
        int[] array = new int[length];
        for (int count = 0; count < array.length; count++) {
            array[count] = count;
        }
        return array;
    }
}
