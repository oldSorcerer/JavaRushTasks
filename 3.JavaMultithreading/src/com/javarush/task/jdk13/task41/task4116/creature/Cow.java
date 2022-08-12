package com.javarush.task.jdk13.task41.task4116.animals;

public class Cow extends Animal {

    private int litersOfMilk;
    private int stars;

    @Override
    public String getName() {
        return "Корова";
    }

    public int milkedLiters() {
        return litersOfMilk;
    }

    public int getStars() {
        return stars;
    }

    public void giveMilk() {
        litersOfMilk += 20;
        System.out.println(getName() + " дала молока.");
    }

    public void gore() {
        stars++;
        System.out.println(getName() + " забодала зеваку.");
    }
}
