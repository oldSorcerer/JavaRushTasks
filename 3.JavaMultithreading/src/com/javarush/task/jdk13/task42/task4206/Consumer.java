package com.javarush.task.jdk13.task42.task4206;

public class Consumer implements Runnable {
    private final Storage storage;

    public Consumer(Storage storage) {
        this.storage = storage;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            storage.take();
        }
    }
}