package com.javarush.task.jdk13.task28.task2805;

import java.util.concurrent.FutureTask;

/* 
Многопоточный факториал
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(new CalculateFactorial(35L).call());

        FutureTask<Long> future1 = new FutureTask<>(new CalculateFactorial(3L));
        FutureTask<Long> future2 = new FutureTask<>(new CalculateFactorial(10L));
        FutureTask<Long> future3 = new FutureTask<>(new CalculateFactorial(35L));
        new Thread(future1).start();
        new Thread(future2).start();
        new Thread(future3).start();
        System.out.println(future1.get());
        System.out.println(future2.get());
        System.out.println(future3.get());
    }
}