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

        ScheduledFuture<Integer> schedule = scheduledPool.schedule(new TheUltimateQuestion(), 365L * 7_500_000L, TimeUnit.DAYS);
        System.out.println(schedule.get());

        scheduledPool.shutdown();
    }
}
