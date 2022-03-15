package com.javarush.task.jdk13.task35.task3508;

public class Kitten extends Cat {

    public Kitten(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Котенок " + name;
    }
}
