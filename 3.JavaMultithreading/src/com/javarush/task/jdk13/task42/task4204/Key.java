package com.javarush.task.jdk13.task42.task4204;

import java.util.Random;

public class Key {
    private static final Random random = new Random();
    private final int intField = random.nextInt(5) + 1;

    public int getIntField() {
        return intField;
    }

    @Override
    public int hashCode() {
        return intField;
    }

    @Override
    public String toString() {
        return "" + intField;
    }
}
