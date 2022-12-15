package com.javarush.task.task26.task2601;

import java.util.Arrays;
import java.util.Comparator;

/* 
Почитать в инете про медиану выборки
*/

public class Solution {

    public static void main(String[] args) {
        sort(new Integer[]{13, 8, 15, 5, 17});
    }

    public static Integer[] sort(Integer[] array) {
        Arrays.sort(array);
//        System.out.println("array = " + Arrays.toString(array));
        int index = array.length / 2;
        return array;
    }
}
