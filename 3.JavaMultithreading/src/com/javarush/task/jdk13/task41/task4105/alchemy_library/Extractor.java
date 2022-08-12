package com.javarush.task.jdk13.task41.task4105.alchemy_library;

public class Extractor {
    public static Potion extractPortion(Potion potion, Essence essence) {
        System.out.println("Extractor: portion extraction...");
        return potion;
    }

    public static Potion convert(Potion portion, Essence essence) {
        System.out.println("Extractor: brewing a new potion...");
        return new Potion(null, essence.type, portion.getSize());
    }
}
