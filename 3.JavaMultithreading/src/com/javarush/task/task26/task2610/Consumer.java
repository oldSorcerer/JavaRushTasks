package com.javarush.task.task26.task2610;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {
    private final BlockingQueue<Object> queue;

    public Consumer(BlockingQueue<Object> queue) {
        this.queue = queue;
    }

    public void run() {
        try {
            while (true) {
                System.out.println(queue.take());
                Thread.sleep(300);
            }
        } catch (InterruptedException e) {
            System.out.printf("[%s] thread was terminated%n", Thread.currentThread().getName());
        }
    }
}
