package com.javarush.task.pro.task10.task1016;

public class City {
    private final String name;
    private final int temperature;

    public City(String name, int temperature) {
        this.name = name;
        this.temperature = temperature;
    }

    public String getName() {
        return name;
    }

    public int getTemperature() {
        return temperature;
    }
}
