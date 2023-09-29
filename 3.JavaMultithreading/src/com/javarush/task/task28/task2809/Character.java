package com.javarush.task.task28.task2809;

import java.util.concurrent.ThreadLocalRandom;

public abstract class Character implements Runnable {
    protected abstract int getId();

    public void run() {
        System.out.println(this + " вступил в игру");
        doSomething();
        System.out.println(this + " умер");
    }

    private void doSomething() {
        try {
            Thread.currentThread().sleep(ThreadLocalRandom.current().nextInt(10, 100));
        } catch (InterruptedException ignored) {
        }
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " #" + getId();
    }
}