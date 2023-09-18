package com.javarush.task.pro.task07.task0718;

/* 
Взлет с планеты
*/

import java.util.Arrays;

public class Solution {

    public static void changePrimitive(int number) {
        number = number + 1;
        System.out.println("Значение переменной number внутри метода changePrimitive(int) равно " + number);
    }

    public static void changeObject(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] + 1;
        }
        System.out.println("Значение всех элементов массива array внутри метода changeObject(int[]) равно " + Arrays.toString(array));
    }

    public static void main(String[] args) {
        int number = 2020;
        System.out.println("Значение переменной number до вызова метода changePrimitive(int) равно " + number);
        changePrimitive(number);
        System.out.println("Значение переменной number после вызова метода changePrimitive(int) равно " + number);

        System.out.println("------------------------------------------------------------------------------------------");

        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Значения всех элементов массива array до вызова метода changeObject(int[]) равно " + Arrays.toString(array));
        changeObject(array);
        System.out.println("Значение всех элементов массива array после вызова метода changeObject(int[]) равно " + Arrays.toString(array));
    }
}