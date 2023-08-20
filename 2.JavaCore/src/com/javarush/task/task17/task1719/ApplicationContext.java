package com.javarush.task.task17.task1719;

import java.util.HashMap;
import java.util.Map;

/* 
ApplicationContext
*/

public abstract class ApplicationContext<GenericsBean extends Bean> {
    private final Map<String, GenericsBean> container = new HashMap<>();
    // Map<Name, some class that implements the Bean interface>

    protected ApplicationContext() {
        parseAllClassesAndInterfaces();
    }

    public synchronized GenericsBean getByName(String name) {
        return container.get(name);
    }

    public synchronized GenericsBean removeByName(String name) {
        return container.remove(name);
    }

    protected abstract void parseAllClassesAndInterfaces();

    public static void main(String[] args) {

    }
}
