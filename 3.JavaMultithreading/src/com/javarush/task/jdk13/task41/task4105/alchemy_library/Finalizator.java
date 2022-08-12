package com.javarush.task.jdk13.task41.task4105.alchemy_library;

public class Finalizator {
    public Potion fix(Potion result){
        System.out.println("Finalizator: obtaining a new potion...");
        return new Potion(String.format("%s %s potion", result.getSize(), result.getType()), result.getType(), result.getSize());
    }
}