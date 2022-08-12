package com.javarush.task.jdk13.task41.task4116.animals;

public class Dog extends Animal {

    private int bones;

    @Override
    public String getName() {
        return "Пес";
    }

    public int bonesGnawed() {
        return bones;
    }

    public void eat() {
        bones++;
        System.out.println(getName() + " обглодал кость.");
    }
}
