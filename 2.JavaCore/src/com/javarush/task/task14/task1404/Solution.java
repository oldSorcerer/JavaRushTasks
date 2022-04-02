package com.javarush.task.task14.task1404;

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
            System.out.println(CatFactory.getCatByKey(string));
        }
    }

    static class CatFactory {
        static Cat getCatByKey(String key) {
            switch (key) {
                case "vaska":
                    return new MaleCat("Василий");
                case "murka":
                    return new FemaleCat("Мурочка");
                case "kiska":
                    return new FemaleCat("Кисюлька");
                default:
                    return new Cat(key);
            }
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

        @Override
        public String toString() {
            return "Я уличный кот " + getName();
        }
    }

    static class MaleCat extends Cat {
        MaleCat(String name) {
            super(name);
        }

        @Override
        public String toString() {
            return "Я - солидный кошак по имени " + getName();
        }
    }

    static class FemaleCat extends Cat {
        FemaleCat(String name) {
            super(name);
        }

        @Override
        public String toString() {
            return "Я - милая кошечка по имени " + getName();
        }
    }
}
