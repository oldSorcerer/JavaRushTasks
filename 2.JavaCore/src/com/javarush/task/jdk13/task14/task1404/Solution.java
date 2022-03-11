package com.javarush.task.jdk13.task14.task1404;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Коты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String string = reader.readLine();
            if (string.isEmpty()) {
                break;
            }
            System.out.println(CatFactory.getCatByKey(string).toString());
        }
    }

    static class CatFactory {
        static Cat getCatByKey(String key) {
            return switch (key) {
                case "vaska" -> new MaleCat("Василий");
                case "murka" -> new FemaleCat("Мурочка");
                case "kiska" -> new FemaleCat("Кисюлька");
                default -> new Cat(key);
            };
        }
    }

    static class Cat {
        private String name;

        protected Cat(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

        public String toString() {
            return "Я уличный кот " + getName();
        }
    }

    static class MaleCat extends Cat {
        MaleCat(String name) {
            super(name);
        }

        public String toString() {
            return "Я - солидный кошак по имени " + getName();
        }
    }

    static class FemaleCat extends Cat {
        FemaleCat(String name) {
            super(name);
        }

        public String toString() {
            return "Я - милая кошечка по имени " + getName();
        }
    }
}
