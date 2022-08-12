package com.javarush.task.jdk13.task41.task4104;

public class SwimmingBarkingCat implements Creature {
    @Override
    public void move() {
        System.out.println("Кошка гребет ластами.");
    }

    @Override
    public void sound() {
        System.out.println("Кошка лает.");
    }

    public void catchMice() {
        System.out.println("Кошка ловит мышей.");
    }
}
