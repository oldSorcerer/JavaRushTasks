package com.javarush.task.jdk13.task28.task2813;

public class Consumer implements Runnable {

    public void run() {
        try {
            System.out.println(Solution.queue.take());
        } catch (InterruptedException e) {
            System.out.printf("[%s] consumer was terminated%n", Thread.currentThread().getName());
        }
    }
}