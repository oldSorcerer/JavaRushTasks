package com.javarush.task.jdk13.task41.task4116.animals;

import com.javarush.task.jdk13.task41.task4116.visitor.Visitor;

public class Cow extends Animal {

    private int litersOfMilk;
    private int stars;

    @Override
    public String getName() {
        return "Корова";
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visitCow(this);
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
