package com.javarush.task.jdk13.task41.task4106;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public final class Universe {

    private static Universe instance;
    private final Set<String> laws = new HashSet<>();

    private Universe() {
        System.out.println("Fine-tuning the laws of the universe begins.");
        tune("скорость света");
        tune("гравитационная постоянная");
        tune("постоянная Планка");
        tune("масса электрона");
        tune("масса протона");
        tune("заряд электрона");
        System.out.println("Fine-tuning the laws of the universe is complete.");
    }

    public static Universe getInstance() {
        if (instance == null) {
            instance = new Universe();
        }
        return instance;
    }

    public Set<String> getLaws() {
        return Collections.unmodifiableSet(laws);
    }

    private void tune(String low) {
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("устанавливается " + low);
        laws.add(low);
    }
}
