package com.javarush.task.jdk13.task35.task3508;

public class Dog {

    protected String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Пес " + name;
    }
}
