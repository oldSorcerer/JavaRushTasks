package com.javarush.task.jdk13.task34.task3408;

public class Generator<T> {

    Class<T> aClass;

    public Generator(Class<T> aClass) {
        this.aClass = aClass;
    }

    T newInstance() {
        return null;
    }
}
