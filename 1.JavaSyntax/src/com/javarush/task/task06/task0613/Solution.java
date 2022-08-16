package com.javarush.task.task06.task0613;

/* 
Кот и статика
*/

public class Solution {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            new Cat();
        }
        System.out.print(Cat.catCount);
    }

    public static class Cat {

        static public int catCount;

        public Cat() {
            catCount++;
        }
    }
}