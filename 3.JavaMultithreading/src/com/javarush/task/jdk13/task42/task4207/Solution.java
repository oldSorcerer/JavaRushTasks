package com.javarush.task.jdk13.task42.task4207;

import java.util.List;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/* 
Арбайтен!
*/

public class Solution {

    public static ExecutorService executor = Executors.newCachedThreadPool();

    public static void main(String[] args) throws InterruptedException {
        AtomicInteger codeLines = new AtomicInteger();
        List<Callable<Boolean>> developers = Stream
                .generate(() -> new Developer(codeLines))
                .limit(6)
                .collect(toList());
        executor.invokeAll(developers);
        executor.awaitTermination(1, TimeUnit.SECONDS);
        executor.shutdownNow();
        System.out.println("Проект готов!");
    }
}

