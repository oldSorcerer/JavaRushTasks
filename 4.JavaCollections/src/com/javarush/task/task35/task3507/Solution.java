package com.javarush.task.task35.task3507;

import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;
import java.util.Set;

/* 
ClassLoader - что это такое?
*/

public class Solution {
    public static void main(String[] args) {
        Set<? extends Animal> allAnimals = getAllAnimals(
                Solution.class.getProtectionDomain().getCodeSource().getLocation().getPath()
                + Solution.class.getPackage().getName().replaceAll("[.]", "/")
                + "/data");
        System.out.println(allAnimals);
    }

    public static Set<? extends Animal> getAllAnimals(String pathToAnimals) {
        Set<Animal> set = new HashSet<>();

        try {
            Class<?> clazz = Class.forName(pathToAnimals);
            Animal animal = (Animal) clazz.getDeclaredConstructor().newInstance();
            set.add(animal);

        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | NoSuchMethodException |
                 InvocationTargetException e) {
            throw new RuntimeException(e);
        }
        return set;
    }
}
