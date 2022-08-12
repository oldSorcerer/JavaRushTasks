package com.javarush.task.jdk13.task42.task4207;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class Developer implements Callable<Boolean> {
    private AtomicInteger codeLines;

    public Developer(AtomicInteger codeLines) {
        this.codeLines = codeLines;
    }

    @Override
    public Boolean call() {
        System.out.printf("Написано %d строк кода.\n", codeLines.addAndGet(1000));
        try {
            TimeUnit.MILLISECONDS.sleep(100);
        } catch (InterruptedException ignored) {
        }
        return true;
    }
}
