package com.javarush.task.jdk13.task34.task3409;

/* 
Первый попавшийся конструктор
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        Generator<Event> eventGenerator = new Generator<>(Event.class);

        System.out.println(eventGenerator.newInstance());
        System.out.println(eventGenerator.newInstance());
        System.out.println(eventGenerator.newInstance());
        System.out.println(new Generator<>(Solution.class).newInstance());
        System.out.println(new Generator<>(NullPointerException.class).newInstance());
    }
}
