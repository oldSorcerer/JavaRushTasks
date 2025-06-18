package com.javarush.task.jdk13.task35.task3506;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>(Arrays.asList(new Animal(1), new Animal(2)));
        List<Pet> pets1 = new ArrayList<>(Arrays.asList(new Pet(3), new Pet(4)));
        List<Pet> pets2 = new ArrayList<>(Arrays.asList(new Pet(5), new Pet(6)));
        List<Cat> cats = new ArrayList<>(Arrays.asList(new Cat(7), new Cat(8)));

        MySolution mySolution = new MySolution();
        mySolution.one(pets1, pets2);
        System.out.println(pets1);
        System.out.println(pets2);

        mySolution.two(pets2, cats);
        System.out.println(pets2);
        System.out.println(cats);

        mySolution.three(animals, pets1);
        System.out.println(animals);
        System.out.println(pets1);

        mySolution.four(animals, cats);
        System.out.println(cats);
        System.out.println(animals);

    }
}

@Getter
@AllArgsConstructor
class Animal {
    private int number;

    @Override
    public String toString() {
        return Animal.class.getSimpleName() + "{" +
                "number=" + number +
                '}';
    }
}

class Pet extends Animal {

    public Pet(int number) {
        super(number);
    }

    @Override
    public String toString() {
        return Pet.class.getSimpleName() + "{" +
                "number=" + getNumber() +
                '}';
    }
}

class Cat extends Pet {

    public Cat(int number) {
        super(number);
    }

    @Override
    public String toString() {
        return Cat.class.getSimpleName() + "{" +
                "number=" + getNumber() +
                '}';
    }
}