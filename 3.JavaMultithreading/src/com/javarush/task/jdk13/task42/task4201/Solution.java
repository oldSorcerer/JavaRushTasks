package com.javarush.task.jdk13.task42.task4201;

import java.util.concurrent.*;

/* 
Заработать миллион!
*/

public class Solution {
    private static final int THREAD_POOL_SIZE = 10;
    private static final int TIMEOUT = 10;
    private static final int COUNT = 1_000;
    private static final int MONEY = 1_000;
    private static final int MILLION = 1_000_000;

    public static void main(String[] args) throws InterruptedException {
        CompanyAccount companyAccount = new CompanyAccount(0);
        ExecutorService executor = Executors.newFixedThreadPool(THREAD_POOL_SIZE);

        for (int i = 0; i < COUNT; i++) {
            Runnable task = () -> companyAccount.addMoney(MONEY);
            executor.submit(task);
        }

        executor.awaitTermination(TIMEOUT, TimeUnit.MILLISECONDS);
        executor.shutdown();

        System.out.println(companyAccount.getTotalMoney() == MILLION ? "We earned a million!!!" : "We couldn't make a million(((");
    }
}
