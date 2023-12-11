package com.javarush.task.task36.task3602;

import java.util.Arrays;
import java.util.Collections;

/* 
Найти класс по описанию Ӏ Java Collections: 6 уровень, 6 лекция
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getExpectedClass());
    }

    public static Class<?> getExpectedClass() {
         return Arrays.stream(Collections.class.getDeclaredClasses())
                 .filter(aClass -> aClass.getSimpleName().equals("EmptyList"))
                 .findFirst().orElseThrow();
    }
}