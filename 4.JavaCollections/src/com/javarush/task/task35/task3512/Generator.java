package com.javarush.task.task35.task3512;

public class Generator<T> {

    private final Class<T> clazz;

    public Generator(Class<T> instance) {
        this.clazz = instance;
    }

    T newInstance() throws InstantiationException, IllegalAccessException {
        return clazz.newInstance();
    }
}

