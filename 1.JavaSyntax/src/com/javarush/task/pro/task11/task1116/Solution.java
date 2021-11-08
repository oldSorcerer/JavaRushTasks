package com.javarush.task.pro.task11.task1116;

/* 
Правильный класс
*/

public class Solution {
    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.println(cat.name);
    }
}
class Cat {
    String name = "Tom";
}