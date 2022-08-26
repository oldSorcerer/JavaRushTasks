package com.javarush.task.jdk13.task34.task3409;

import java.lang.reflect.Constructor;

public class Generator<T> {

    private Class<T> aClass;

    public Generator(Class<T> aClass) {
        this.aClass = aClass;
    }

    T newInstance() throws Exception {
        Constructor<T> declaredConstructor = (Constructor<T>) aClass.getDeclaredConstructors()[0];
        return declaredConstructor.newInstance();
    }
}
