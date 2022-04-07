package com.javarush.task.jdk13.task28.task2818;

import java.util.concurrent.Callable;

public class TheUltimateQuestion implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        System.out.println("The Ultimate Question of Life, the Universe, and Everything.");
        return 42;
    }
}
