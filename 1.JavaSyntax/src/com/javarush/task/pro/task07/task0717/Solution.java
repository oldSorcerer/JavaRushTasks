package com.javarush.task.pro.task07.task0717;

/* 
Операционная система "Анжелика"
*/

public class Solution {

    public static void main(String[] args) {
        int i1 = (short) -32768 - 31715;
        int i2 = Short.MAX_VALUE - 31687;
        int i3 = 1000 + 84;
        int i4 = (short) (222356 - 24660);
        int i5 = 'о';
        int i6 = 1076;
        int i7 = (byte) 289;
        System.out.println("Добро пожаловать на борт корабля " + (char) i1 + (char) i2 + (char) i3 + (char) i4 + (char) i5 + (char) i6 + (char) i7);
    }
}
