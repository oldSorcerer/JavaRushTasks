package com.javarush.task.jdk13.task35.task3506;

import java.util.List;

public class MySolution extends Solution{
    @Override
    public <T> void one(List<T> destination, List<T> source) {
        destination.addAll(source);
    }

    @Override
    public <T> void two(List<T> destination, List<? extends T> source) {
        destination.addAll(source);
    }

    @Override
    public <T> void three(List<? super T> destination, List<T> source) {
        destination.addAll(source);
    }

    @Override
    public <T> void four(List<? super T> destination, List<? extends T> source) {
        destination.addAll(source);
    }
}
