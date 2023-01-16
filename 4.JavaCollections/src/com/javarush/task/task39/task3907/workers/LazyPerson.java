package com.javarush.task.task39.task3907.workers;

public class LazyPerson implements Worker {
    @Override
    public void work() {
        // Do nothing
    }

    @Override
    public void eat() {
        System.out.println("LazyPerson is eating!");
    }

    @Override
    public void sleep() {
        System.out.println("LazyPerson is sleeping!");
    }
}
