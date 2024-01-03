package com.javarush.task.jdk13.task28.task2809;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/* 
Многонитиевость в одной нити
*/

public class Solution {

    public static ExecutorService executorService = Executors.newSingleThreadExecutor();

    public static void main(String[] args) throws Exception {
        List<Future<String>> futures = new ArrayList<>();
        List<String> instruments = List.of("скрипка", "тромбон", "бубенцы", "контрабас");
        for (String instrument : instruments) {
            futures.add(startPlaying(instrument));
        }

        System.out.println("Успели доиграть: " + completeConcert(futures));

        executorService.shutdown();
    }

    public static Future<String> startPlaying(String name) {
        return executorService.submit(new MusicalInstrument(name));
    }

    public static List<String> completeConcert(List<Future<String>> futures) {
        List<String> result = new ArrayList<>();
        for (Future<String> future : futures) {
            try {
                result.add(future.get(800, TimeUnit.MILLISECONDS));
            } catch (Exception e) {
                future.cancel(true);
            }
        }
        return result;
    }
}