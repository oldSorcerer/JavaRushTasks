package com.javarush.task.jdk13.task34.task3408;

import lombok.SneakyThrows;

public class Generator<T> {

    private final Class<T> aClass;

    public Generator(Class<T> aClass) {
        this.aClass = aClass;
    }

    @SneakyThrows
    T newInstance() {
        return aClass.getDeclaredConstructor().newInstance();
    }
}
