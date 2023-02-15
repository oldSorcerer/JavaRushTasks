package com.javarush.task.sql.task09.task0904;

import java.util.List;

/* 
Все имена
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        AnimalManager animalManager = new AnimalManager();
        List<Animal> animals = animalManager.getAllAnimals();

        for (Animal animal : animals) {
            System.out.println(animal.getName());
        }
    }

//    private static void addAnimal(){
//        AnimalManager animalManager = new AnimalManager();
//
//    }
}
