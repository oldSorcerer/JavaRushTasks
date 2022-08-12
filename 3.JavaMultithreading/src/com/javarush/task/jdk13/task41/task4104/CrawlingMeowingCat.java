package com.javarush.task.jdk13.task41.task4104;

public class CrawlingMeowingCat implements Creature {
    @Override
    public void move() {
        System.out.println("Кошка ползет извиваясь.");
    }

    @Override
    public void sound() {
        System.out.println("Кошка мяукает.");
    }

    public void catchMice() {
        System.out.println("Кошка ловит мышей.");
    }
}
