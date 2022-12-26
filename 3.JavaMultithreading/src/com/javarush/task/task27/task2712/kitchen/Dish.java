package com.javarush.task.task27.task2712.kitchen;

public enum Dish {
    FISH, STEAK, SOUP, JUICE, WATER;

    public static String allDishesToString() {
        StringBuilder builder = new StringBuilder();
        for (Dish value : values()) {
            builder.append(value).append(", ");
        }
        return builder.substring(0, builder.lastIndexOf(","));
    }
}
