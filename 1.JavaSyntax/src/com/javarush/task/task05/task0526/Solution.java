package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {

        Man m = new Man("d", 1, "f");
        Man m1 = new Man("d1", 11, "f1");
        Woman m2 = new Woman("d2", 12, "f2");
        Woman m3 = new Woman("d3", 13, "f3");
        System.out.println(m);
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);
    }

    public static class Man {
        String name, address;
        int age;

        public Man(String name, int age, String address) {
            this.name = name;
            this.address = address;
            this.age = age;
        }

        public String toString() {
            return this.name + " " + this.age + " " + this.address;
        }
    }

    public static class Woman {
        String name, address;
        int age;

        public Woman(String name, int age, String address) {
            this.name = name;
            this.address = address;
            this.age = age;
        }

        public String toString() {
            return this.name + " " + this.age + " " + this.address;
        }
    }
}