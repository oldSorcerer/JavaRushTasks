package com.javarush.task.jdk13.task38.task3803;

/* 
Обработка аннотаций
*/

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        printFullyQualifiedNames(Solution.class);
        printFullyQualifiedNames(SomeTest.class);

        printValues(Solution.class);
        printValues(SomeTest.class);
    }

    public static <T> boolean printFullyQualifiedNames(Class<T> aClass) {

        if (aClass.isAnnotationPresent(PrepareMyTest.class)) {
            PrepareMyTest annotation = aClass.getAnnotation(PrepareMyTest.class);
            Arrays.stream(annotation.fullyQualifiedNames()).forEach(System.out::println);
            return true;
        }
        return false;
    }

    public static <T> boolean printValues(Class<T> aClass) {
        if (aClass.isAnnotationPresent(PrepareMyTest.class)) {
            PrepareMyTest annotation = aClass.getAnnotation(PrepareMyTest.class);
            Arrays.stream(annotation.value())
                    .map(Class::getSimpleName).forEach(System.out::println);
            return true;
        }
        return false;
    }
}