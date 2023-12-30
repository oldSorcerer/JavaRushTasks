package com.javarush.task.jdk13.task28.task2818;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* 
С ScheduledExecutor по галактике
*/

public class Solution {

    public static ScheduledExecutorService scheduledPool = Executors.newScheduledThreadPool(3);

    public static void main(String[] args) throws Exception {
        scheduledPool.schedule(new Runnable() {
            @Override
            public void run() {

            }
        }, 0L, TimeUnit.DAYS);


        scheduledPool.shutdown();
    }
}
