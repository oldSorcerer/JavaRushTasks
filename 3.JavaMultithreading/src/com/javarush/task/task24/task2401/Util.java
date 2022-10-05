package com.javarush.task.task24.task2401;

import java.lang.reflect.Method;

public class Util {
    // Пример того, как можно использовать интерфейс-маркер
    // Этот метод подходит только для классов, реализующих SelfInterfaceMarker
    public static void testClass(SelfInterfaceMarker interfaceMarker) throws UnsupportedInterfaceMarkerException {
        if (interfaceMarker == null) {
            throw new UnsupportedInterfaceMarkerException();
        }
        for (Method method : interfaceMarker.getClass().getDeclaredMethods()) {
            System.out.println(method);
        }
    }
}
