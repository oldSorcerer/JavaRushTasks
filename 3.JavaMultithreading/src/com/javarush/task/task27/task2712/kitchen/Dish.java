package com.javarush.task.task27.task2712.kitchen;

public enum Dish {

    FISH(25),
    STEAK(30),
    SOUP(15),
    JUICE(5),
    WATER(3);

    private final int duration;

    Dish(int duration) {
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public static String allDishesToString() {
        StringBuilder builder = new StringBuilder();
        for (Dish value : values()) {
            builder.append(value).append(", ");
        }
        return builder.substring(0, builder.lastIndexOf(","));
    }
}
