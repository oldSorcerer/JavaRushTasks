package com.javarush.task.jdk13.task42.task4204;

import java.util.*;
import java.util.concurrent.*;

/* 
Потоконебезопасная мапа
*/

public class Solution {
    private static final int THREAD_POOL_SIZE = 50;
    private static final int TIMEOUT = 10;
    private static final int STEPS = 100;
    private static final int MAP_SIZE = 30;
    private static final int VALUE_LIMIT = 5;
    private static final int VALUE_MULTIPLIER = 10;

    private static final List<Key> KEYS = new ArrayList<>();
    private static final ConcurrentHashMap<Key, Integer> MAP = new ConcurrentHashMap<>();

    static {
        for (int i = 0; i < MAP_SIZE; i++) {
            Key key = new Key();
            KEYS.add(key);
            MAP.put(key, i % VALUE_LIMIT + 1);
        }
    }


    public static void main(String[] args) throws InterruptedException {
        printMap(MAP);

        ExecutorService executor = Executors.newFixedThreadPool(THREAD_POOL_SIZE);

        for (int i = 0; i < STEPS; i++) {
            int index = i % MAP_SIZE;
            Key key = KEYS.get(index);

            Runnable task = () -> MAP.replace(key, key.getIntField(), key.getIntField() * VALUE_MULTIPLIER);

            executor.submit(task);
        }

        executor.awaitTermination(TIMEOUT, TimeUnit.MILLISECONDS);

        executor.shutdown();

        printMap(MAP);
    }

    public static void printMap(Map<Key, Integer> map) {
        for (Map.Entry<Key, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        System.out.println();
    }
}

