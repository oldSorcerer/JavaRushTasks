package com.javarush.task.jdk13.task41.task4104;

public class FlyingSpeakingСow implements Creature {
    @Override
    public void move() {
        System.out.println("Корова машет крыльями.");
    }

    @Override
    public void sound() {
        System.out.println("Корова говорит.");
    }

    public void giveMilk() {
        System.out.println("Корова дает молоко.");
    }
}
