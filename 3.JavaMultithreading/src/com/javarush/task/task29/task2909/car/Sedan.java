package com.javarush.task.task29.task2909.car;

public class Sedan extends Car {

    private static final int MAX_SEDAN_SPEED = 120;

    public Sedan(int numberOfPassengers) {
        super(SEDAN, numberOfPassengers);
    }

    @Override
    public int getMaxSpeed() {
        return MAX_SEDAN_SPEED;
    }
}
