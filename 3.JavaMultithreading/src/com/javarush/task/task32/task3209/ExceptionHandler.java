package com.javarush.task.task32.task3209;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class ExceptionHandler {

    public static void log(Exception e) {
        System.out.println(e.toString());
    }
}