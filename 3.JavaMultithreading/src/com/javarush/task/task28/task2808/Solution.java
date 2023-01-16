package com.javarush.task.task28.task2808;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/* 
Осваиваем Callable
*/

public class Solution {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        List<Future<String>> futures = new ArrayList<>();
        ExecutorService executor = Executors.newFixedThreadPool(5);
        //List<Future<String>> futures = IntStream.rangeClosed(1000, 1010).mapToObj(i -> executor.submit(getTask(i))).collect(Collectors.toList());
        for (int i = 1000; i <= 1010; i++) {
            futures.add(executor.submit(getTask(i)));
        }

        futures.add(executor.submit(getTask(10_000_000)));
        futures.add(executor.submit(getTask(Integer.MAX_VALUE)));

        for (Future<String> future : futures) {
            System.out.println(future.get());
        }

        executor.shutdown();
        executor.awaitTermination(10, TimeUnit.SECONDS);

    }

    public static Callable<String> getTask(final int i) {
        return () -> BigInteger.valueOf(i).multiply((BigInteger.valueOf(i).add(BigInteger.ONE))).divide(BigInteger.valueOf(2)).toString();
//    return () -> String.valueOf(i * (i + 1L) / 2);
    }
}
/* output
500500
501501
502503
503506
504510
505515
506521
507528
508536
509545
510555
50000005000000
*/
