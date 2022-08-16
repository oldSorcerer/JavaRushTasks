package com.javarush.task.task05.task0504;


/* 
Трикотаж
*/

public class Solution {
    public static void main(String[] args) {

        Cat c = new Cat("A", 10, 1, 2);
        Cat c1 = new Cat("A1", 1090, 190, 28);
        Cat c2 = new Cat("A2", 100, 10, 29);
    }

    public static class Cat {
        private final String name;
        private final int age;
        private final int weight;
        private final int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }
    }
}