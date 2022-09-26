package com.javarush.task.task26.task2611;

import java.util.concurrent.ConcurrentHashMap;

public class Consumer implements Runnable {
    private ConcurrentHashMap<String, String> map;

    public Consumer(ConcurrentHashMap<String, String> map) {
        this.map = map;
    }

    public void run() {
        Thread currentThread = Thread.currentThread();
        while (!currentThread.isInterrupted()) {
            if (!map.isEmpty()) {
                for (String key : map.keySet()) {
                    System.out.println(map.remove(key));
                }
            }
        }
    }
}