package com.javarush.task.jdk13.task41.task4116.animals;

public class Cat extends Animal {

    private int mice;
    private double kilogramsOfFur;

    @Override
    public String getName() {
        return "Кот";
    }

    public int miceCaught() {
        return mice;
    }

    public double furEaten() {
        return kilogramsOfFur;
    }

    public void hunt() {
        mice++;
        System.out.println(getName() + " поймал мышь.");
    }

    public void licks() {
        kilogramsOfFur += 0.005;
        System.out.println(getName() + " лижет шерсть.");
    }
}
