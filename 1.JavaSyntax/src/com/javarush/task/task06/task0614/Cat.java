package com.javarush.task.task06.task0614;

import java.util.ArrayList;

/* 
Статические коты
*/

public class Cat {
    public static ArrayList<Cat> cats = new ArrayList<>();

    public Cat() {

    }

    public static void main(String[] args) {

        cats.add(new Cat());
        cats.add(new Cat());
        cats.add(new Cat());
        cats.add(new Cat());
        cats.add(new Cat());
        cats.add(new Cat());
        cats.add(new Cat());
        cats.add(new Cat());
        cats.add(new Cat());
        cats.add(new Cat());

        printCats();
    }

    public static void printCats() {
        for (Cat cat : cats) {
            System.out.println(cat);
        }
    }
}