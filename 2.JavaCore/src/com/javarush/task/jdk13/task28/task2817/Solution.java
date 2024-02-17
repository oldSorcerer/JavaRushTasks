package com.javarush.task.jdk13.task28.task2817;

import java.time.LocalTime;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* 
Полусекундомер
*/

public class Solution {

    public static ScheduledExecutorService scheduledPool = Executors.newScheduledThreadPool(3);

    public static void main(String[] args) throws Exception {
        Runnable runnable = () -> System.out.println(LocalTime.now());

        scheduledPool.scheduleAtFixedRate(runnable, 0L, 500L, TimeUnit.MILLISECONDS);

        Thread.sleep(3000);
        scheduledPool.shutdown();
    }
}