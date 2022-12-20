package com.javarush.task.task26.task2601;

import java.util.Arrays;
import java.util.Comparator;

/* 
Почитать в инете про медиану выборки
*/

public class Solution {

    public static void main(String[] args) {
        sort(new Integer[]{13, 8, 15, 5, 17}); //System.out.println(Arrays.toString(sort(new Integer[]{13, 8, 15, 5, 17})));
    }

    public static Integer[] sort(Integer[] array) {
        Arrays.sort(array);

        int median = array.length % 2 == 0 ? (array[array.length / 2 - 1] + array[array.length / 2]) / 2 : array[array.length / 2];

        Arrays.sort(array, Comparator.comparingInt(i -> Math.abs(median - i)));

        return array;
    }
}
