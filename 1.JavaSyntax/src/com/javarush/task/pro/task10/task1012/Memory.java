package com.javarush.task.pro.task10.task1012;

import java.util.Arrays;

/* 
Дефрагментация памяти
*/

public class Memory {

    public static void main(String[] args) {
        String[] memory = {"object15", null, null, "object2", null, null, null, "object32", null, "object4"};
        executeDefragmentation(memory);
        System.out.println(Arrays.toString(memory));
    }

    public static void executeDefragmentation(String[] array) {
        for (int i = array.length; i >= 1; i--) {
            for (int j = 1;  j < i; j++) {
                if (array[j - 1] == null) {
                    array[j - 1] = array[j];
                    array[j] = null;
                }
            }
        }
    }
}
