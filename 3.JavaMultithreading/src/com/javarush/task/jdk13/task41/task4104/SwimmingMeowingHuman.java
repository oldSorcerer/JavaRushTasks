package com.javarush.task.jdk13.task41.task4104;

public class SwimmingMeowingHuman implements Creature {
    @Override
    public void move() {
        System.out.println("Человек гребет ластами.");
    }

    @Override
    public void sound() {
        System.out.println("Человек мяукает.");
    }

    public void searchMeaningOfLife() {
        System.out.println("Человек ищет смысл жизни.");
    }
}
