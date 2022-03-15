package com.javarush.task.jdk13.task35.task3508;

public class Puppy extends Dog {

    public Puppy(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Щенок " + name;
    }
}
