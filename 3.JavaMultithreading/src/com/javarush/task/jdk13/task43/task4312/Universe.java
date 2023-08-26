package com.javarush.task.jdk13.task43.task4312;

import org.apache.commons.collections4.CollectionUtils;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class Universe {
    private static Universe instance;

    private final Set<String> laws = new HashSet<>();

    private Universe() {
        laws.add("скорость света");
        laws.add("гравитационная постоянная");
        laws.add("постоянная Планка");
        laws.add("масса электрона");
        laws.add("масса протона");
        laws.add("заряд электрона");
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
}
