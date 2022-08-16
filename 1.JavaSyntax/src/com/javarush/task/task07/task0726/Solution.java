package com.javarush.task.task07.task0726;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Не компилируется задача про котиков
*/

public class Solution {
    public final static ArrayList<Cat> CATS = new ArrayList<Cat>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String name = reader.readLine();

            if (name.isEmpty()) break;

            Cat cat = new Cat(name,Integer.parseInt(reader.readLine()),Integer.parseInt(reader.readLine()),Integer.parseInt(reader.readLine()));
            CATS.add(cat);
        }

        printList();
    }

    public static void printList() {
        for (int i = 0; i < CATS.size(); i++) {
            System.out.println(CATS.get(i));
        }
    }

    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private int tailLength;

        Cat(String name, int age, int weight, int tailLength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.tailLength = tailLength;
        }

        @Override
        public String toString() {
            return "Cat name is " + name + ", age is " + age + ", weight is " + weight + ", tail = " + tailLength;
        }
    }
}


/*Не компилируется задача про котиков
Задача: Программа вводит с клавиатуры данные про котов и выводит их на экран.

Пример:
Cat name is Barsik, age is 6, weight is 5, tail = 22
Cat name is Murka, age is 8, weight is 7, tail = 20


Требования:
1. Программа должна считывать данные с клавиатуры.
2. Если пользователь ввел: Barsik, 6, 5 и 22 (каждое значение с новой строки),
то программа должна вывести "Cat name is Barsik, age is 6, weight is 5, tail = 22".
3. Если пользователь ввел: Murka, 8, 7 и 20 (каждое значение с новой строки),
то программа должна вывести "Cat name is Murka, age is 8, weight is 7, tail = 20".
4. Если пользователь ввел: Barsik, 6, 5, 22, Murka, 8, 7 и 20 (каждое значение с новой строки),
то программа должна вывести две строки: "Cat name is Barsik, age is 6, weight is 5, tail = 22" и "Cat name is Murka, age is 8, weight is 7, tail = 20".*/