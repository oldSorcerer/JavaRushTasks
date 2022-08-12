package com.javarush.task.jdk13.task41.task4104;

public class CrawlingBarkingCow implements Creature {
    @Override
    public void move() {
        System.out.println("Корова ползет извиваясь.");
    }

    @Override
    public void sound() {
        System.out.println("Корова лает.");
    }

    public void giveMilk() {
        System.out.println("Корова дает молоко.");
    }
}
