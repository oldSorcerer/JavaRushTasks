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
        String result = "";
        switch (digit) {
            case '0':
                result = "ноль";
                break;
            case '1':
                result = "один";
                break;
            case '2':
                result = "два";
                break;
            case '3':
                result = "три";
                break;
            case '4':
                result = "четыре";
                break;
            case '5':
                result = "пять";
                break;
            case '6':
                result = "шесть";
                break;
            case '7':
                result = "семь";
                break;
            case '8':
                result = "восемь";
                break;
            case '9':
                result = "девять";
        }
        return result;
    }
}
