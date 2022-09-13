package com.javarush.task.pro.task11.task1128;

/* 
Текстовые цифры
*/

public class Solution {

    public static void main(String[] args) {
        String numberStr = "147852369";
        for (char symbol : numberStr.toCharArray()) {
            System.out.print(digitToText(symbol));
            System.out.print(" ");
        }
        System.out.println();
    }

    public static String digitToText(char digit) {
        return switch (digit) {
            case '0' -> "ноль";
            case '1' -> "один";
            case '2' -> "два";
            case '3' -> "три";
            case '4' -> "четыре";
            case '5' -> "пять";
            case '6' -> "шесть";
            case '7' -> "семь";
            case '8' -> "восемь";
            case '9' -> "девять";
            default -> "";
        };
    }
}