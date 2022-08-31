package com.javarush.task.pro.task08.task0819;

import java.util.Random;

public class CosmicAnomaly {
    private static final int rightNumber = new Random().nextInt(1000);

    public static int lowerBound = 0;
    public static int upperBound = 1000;

    private static int attemptsCount = 0;

    public static int nextAttempt(int attempt) {
        attemptsCount++;
        System.out.printf("Попытка № %d: %d%n", attemptsCount, attempt);
        int result;

        if (rightNumber > attempt) {
            lowerBound = attempt;
            result = upperBound;
        } else if (rightNumber < attempt) {
            upperBound = attempt;
            result = lowerBound;
        } else {
            System.out.println("Правильно!");
            return attempt;
        }

        System.out.printf("Неа :( Новый диапазон: (%d;%d)%n%n", lowerBound, upperBound);
        return result;
    }
}