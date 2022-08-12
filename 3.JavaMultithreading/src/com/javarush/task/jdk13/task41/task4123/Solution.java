package com.javarush.task.jdk13.task41.task4123;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.*;

/* 
Доверяй, но перепроверяй
*/

public class Solution {

    public static UserDB db = new UserDB();

    public static void main(String[] args) throws Exception {
        Set<Callable<Integer>> callables = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            int finalI = i;
            callables.add(new Callable<Integer>() {
                @Override
                public Integer call() throws Exception {
                    TimeUnit.MILLISECONDS.sleep(finalI);
                    return db.getDB().size();
                }
            });
        }

        ExecutorService executor = Executors.newCachedThreadPool();
        List<Future<Integer>> futures = executor.invokeAll(callables);
        executor.awaitTermination(1, TimeUnit.SECONDS);
        for (Future<Integer> future : futures) {
            System.out.println(future.get());
        }

        executor.shutdown();
    }
}
