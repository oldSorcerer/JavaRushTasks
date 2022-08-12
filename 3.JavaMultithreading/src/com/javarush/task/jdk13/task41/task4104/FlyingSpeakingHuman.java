package com.javarush.task.jdk13.task41.task4104;

public class FlyingSpeakingHuman implements Creature {
    @Override
    public void move() {
        System.out.println("Человек машет крыльями.");
    }

    @Override
    public void sound() {
        System.out.println("Человек говорит.");
    }

    public void searchMeaningOfLife() {
        System.out.println("Человек ищет смысл жизни.");
    }
}
