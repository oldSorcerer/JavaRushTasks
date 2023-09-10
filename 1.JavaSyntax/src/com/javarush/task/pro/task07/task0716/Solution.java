package com.javarush.task.pro.task07.task0716;

/* 
Запуск систем корабля
*/

public class Solution {
    public static char[] chars = {1076, 1086, 1088, 1084, 1080, 1053};

    public static void main(String[] args) {
        String symbol =  "";
        char[] tempArray = new char[chars.length];
        for (int i = 0; i < tempArray.length; i++) {
            int j = (chars.length - 1) - i;
            tempArray[i] = chars[j];
            symbol += tempArray[i];

        }
        System.out.println(symbol);
    }
}