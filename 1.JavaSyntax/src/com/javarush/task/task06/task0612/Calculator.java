package com.javarush.task.task06.task0612;

/* 
Калькулятор
*/

public class Calculator {
    public static int plus(int a, int b) {
        return a + b;
    }

    public static int minus(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double division(int a, int b) {
        return a * 1.0 / b;
    }

    public static double percent(int a, int b) {
        return (double) b * a / 100.0;
    }

    public static void main(String[] args) {

    }
}