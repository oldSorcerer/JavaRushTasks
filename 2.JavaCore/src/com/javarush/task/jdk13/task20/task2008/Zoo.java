package com.javarush.task.jdk13.task20.task2008;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    public List<Animal> animals = new ArrayList<>();

    @JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type")
    @JsonSubTypes({
            @JsonSubTypes.Type(value = Lion.class, name = "lion"),
            @JsonSubTypes.Type(value = Penguin.class, name = "penguin")
    })
    public static class Animal {
        public String name;

        public Animal() {
        }

        public Animal(String name) {
            this.name = name;
        }
    }

    public static class Lion extends Animal {
        public double roarVolume;

        public Lion() {
        }

        public Lion(String name, double roarVolume) {
            super(name);
            this.roarVolume = roarVolume;
        }
    }

    public static class Penguin extends Animal {
        public int age;
        boolean likesCream;

        public Penguin() {
        }

        public Penguin(String name, boolean likesCream, int age) {
            super(name);
            this.likesCream = likesCream;
            this.age = age;
        }
    }
}