package com.javarush.task.task39.task3906;

public class SecuritySystem {
    private boolean on = false;

    public boolean isOn() {
        return on;
    }

    void turnOff() {
        System.out.println("Turning off the SecuritySystem!");
        on = false;
    }

    void turnOn() {
        System.out.println("Turning on the SecuritySystem!");
        on = true;
    }
}
