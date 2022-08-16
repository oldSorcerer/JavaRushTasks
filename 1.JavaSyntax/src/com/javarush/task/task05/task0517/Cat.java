package com.javarush.task.task05.task0517;

/* 
Конструируем котиков
*/

public class Cat {
    String name;
    String address;
    String color;
    int age;
    int weight;

    public Cat(String name) {
        this.name = name;
        this.color = "u";
        this.age = 9;
        this.weight = 8;
    }

    public Cat(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = "u";
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = 8;
        this.color = "u";
    }

    public Cat(int weight, String color) {
        this.color = color;
        this.weight = weight;
        this.age = 9;
    }

    public Cat(int weight, String color, String address) {
        this.address = address;
        this.color = color;
        this.weight = weight;
        this.age = 9;
    }

    public static void main(String[] args) {

    }
}