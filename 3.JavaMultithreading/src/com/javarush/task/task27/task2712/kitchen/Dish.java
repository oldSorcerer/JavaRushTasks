package com.javarush.task.task27.task2712.kitchen;

import java.util.Arrays;
import java.util.stream.Collectors;

public enum Dish {
    FISH,
    STEAK,
    SOUP,
    JUICE,
    WATER;

    public static String allDishesToString() {
        return Arrays.stream(values())
                .map(String::valueOf)
                .collect(Collectors.joining(", "));
    }
}
