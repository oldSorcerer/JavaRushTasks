package com.javarush.task.jdk13.task41.task4102;

public class SimplePizza implements Pizza {
    @Override
    public double getCost() {
        return 100;
    }

    @Override
    public String getIngredients() {
        return "тесто, помидоры, сыр";
    }
}
