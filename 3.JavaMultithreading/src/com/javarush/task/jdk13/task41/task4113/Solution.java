package com.javarush.task.jdk13.task41.task4113;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* 
Тотальная итерация
*/

public class Solution {

    public static void main(String[] args) {
        getIterators().stream()
                .map(i -> i.getClass().getCanonicalName())
                .sorted()
                .forEach(System.out::println);
    }

    public static List<Iterator> getIterators() {
        //напишите тут ваш код

        return null;
    }
}
