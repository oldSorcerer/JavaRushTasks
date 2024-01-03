package com.javarush.task.jdk13.task28.task2807;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.FutureTask;

/* 
Оркестр с бубенцами
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        List<FutureTask<String>> taskList = new ArrayList<>();
        List<String> instruments = List.of("скрипка", "тромбон", "бубенцы", "контрабас");
        for (String instrument : instruments) {
            taskList.add(startPlaying(instrument));
        }

        Thread.sleep(1000);
        completeConcert(taskList);
    }

    public static FutureTask<String> startPlaying(String name) {
        FutureTask<String> task = new FutureTask<>(new MusicalInstrument(name));
        new Thread(task).start();
        return task;
    }

    public static void completeConcert(List<FutureTask<String>> taskList) {
        taskList.stream()
                .filter(task -> !task.isDone())
                .forEach(task -> task.cancel(true));
    }
}