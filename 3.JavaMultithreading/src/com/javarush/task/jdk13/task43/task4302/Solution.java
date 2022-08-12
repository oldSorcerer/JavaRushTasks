package com.javarush.task.jdk13.task43.task4302;

/* 
Сравниваем котов
*/

public class Solution {

    public static void main(String[] args) {
        Cat cat1 = new Cat("Bonya", 5, 4, "Devon Rex");
        Cat cat2 = new Cat("Ginger", 5, 6, "Devon Rex");

        System.out.println(cat1.equals(cat2));
    }
}