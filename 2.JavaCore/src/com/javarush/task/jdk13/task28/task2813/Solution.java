package com.javarush.task.jdk13.task28.task2813;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* 
Кеширование нитей
*/

public class Solution {

    public static BlockingQueue<String> queue = new ArrayBlockingQueue<>(32);
    public static ExecutorService executorService;

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        submitProducers();
        submitConsumers();

        executorService.shutdownNow();
    }

    public static void submitProducers() {
        //напишите тут ваш код

    }

    public static void submitConsumers() {
        //напишите тут ваш код

    }
}
