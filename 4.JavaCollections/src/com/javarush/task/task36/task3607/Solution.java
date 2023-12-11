package com.javarush.task.task36.task3607;

/* 
Найти класс по описанию Ӏ Java Collections: 6 уровень, 10 лекция
*/

import java.util.concurrent.DelayQueue;

public class Solution {
    public static void main(String[] args) {
        System.out.println(getExpectedClass());
    }

    public static Class<?> getExpectedClass() {
        return DelayQueue.class;
    }
}
