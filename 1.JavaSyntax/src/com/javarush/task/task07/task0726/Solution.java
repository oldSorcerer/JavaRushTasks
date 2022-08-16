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

            Cat cat = new Cat(name, Integer.parseInt(reader.readLine()), Integer.parseInt(reader.readLine()), Integer.parseInt(reader.readLine()));
            CATS.add(cat);
        }

        printList();
    }

    public static void printList() {
        for (Cat cat : CATS) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private final String name;
        private final int age;
        private final int weight;
        private final int tailLength;

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
