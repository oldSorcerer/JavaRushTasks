package com.javarush.task.jdk13.task28.task2813;

public class Producer implements Runnable {
    private final String message;

    public Producer(String message) {
        this.message = message;
    }

    public void run() {
        try {
            Solution.queue.put(message);
        } catch (InterruptedException e) {
            System.out.printf("[%s] producer was terminated%n", Thread.currentThread().getName());
        }
    }
}