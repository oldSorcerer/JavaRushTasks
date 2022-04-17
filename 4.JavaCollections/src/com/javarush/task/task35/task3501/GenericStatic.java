package com.javarush.task.task35.task3501;

public class GenericStatic<T> {
    public static <T> T someStaticMethod(T genericObject) {
        System.out.println(genericObject);
        return genericObject;
    }
}
