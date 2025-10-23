package com.javarush.task.jdk13.task43.task4307;

import java.util.Arrays;
import java.util.Objects;

/* 
Шило на мыло
*/

public class Solution {

    public static void main(String[] args) {
        String[] array = {null, "hello", "ok", null, "bye"};

        printFirstNonNull(array);
        System.out.println("----------");
        printDefaultValueIfNullObject(array, "oops");
    }

    public static void printFirstNonNull(final String... values) {

        if (Objects.isNull(values)) {
            System.out.println((Object) null);
            return;
        }

        Arrays.stream(values).filter(Objects::nonNull).findFirst().ifPresent(System.out::println);
    }

    public static void printDefaultValueIfNullObject(final String[] values, final String defaultValue) {
        Arrays.stream(values).forEach(value -> System.out.println(Objects.requireNonNullElse(value, defaultValue)));
    }
}
