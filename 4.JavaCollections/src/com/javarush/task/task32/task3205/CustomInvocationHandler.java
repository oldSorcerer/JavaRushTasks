package com.javarush.task.task32.task3205;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class CustomInvocationHandler implements InvocationHandler {

    private final SomeInterfaceWithMethods original;

    public CustomInvocationHandler(SomeInterfaceWithMethods original) {
        this.original = original;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(method.getName() + " in");
        Object invoke = method.invoke(original, args);
        System.out.println(method.getName() + " out");
        return invoke;
    }
}
