package com.javarush.task.task28.task2809;

import java.util.concurrent.atomic.AtomicInteger;

public class Plant extends Character {
    private final static AtomicInteger idSequence = new AtomicInteger();
    private final int id = idSequence.incrementAndGet();

    protected int getId() {
        return id;
    }
}