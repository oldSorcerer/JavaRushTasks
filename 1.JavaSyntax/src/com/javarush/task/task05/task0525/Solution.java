package com.javarush.task.task05.task0525;

/* 
И целой утки мало
*/

public class Solution {

    public static void main(String[] args) {
        Duck duck1 = new Duck();
        Duck duck2 = new Duck();
        System.out.println(duck1);
        System.out.println(duck2);
        Cat duck11 = new Cat();
        Cat duck21 = new Cat();
        System.out.println(duck11);
        System.out.println(duck21);
        Dog duck12 = new Dog();
        Dog duck22 = new Dog();
        System.out.println(duck12);
        System.out.println(duck22);
    }

    public static class Duck {
        public String toString() {
            return "Duck";
        }
    }

    public static class Cat {
        public String toString() {
            return "Cat";
        }
    }

    public static class Dog {
        public String toString() {
            return "Dog";
        }
    }
}