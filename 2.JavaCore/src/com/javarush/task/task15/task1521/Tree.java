package com.javarush.task.task15.task1521;

public class Tree {
    public static int globalNumber;
    public int number;

    public Tree() {
        this.number = ++globalNumber;
    }

    public void info(Object s) {
        System.out.printf("Дерево № %d , метод Object, параметр %s%n", number, s.getClass().getSimpleName());
    }

    public void info(Number s) {
        System.out.printf("Дерево № %d , метод Number, параметр %s%n", number, s.getClass().getSimpleName());
    }

    public void info(String s) {
        System.out.printf("Дерево № %d , метод String, параметр %s%n", number, s.getClass().getSimpleName());
    }
}
