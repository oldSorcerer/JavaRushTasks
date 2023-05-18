package com.javarush.task.task39.task3906;

public class LightBulb {
    private boolean on = false;

    public boolean isOn() {
        return on;
    }

    void turnOff() {
        System.out.println("The light is off!");
        on = false;
    }

    void turnOn() {
        System.out.println("The light is on!");
        on = true;
    }
}
