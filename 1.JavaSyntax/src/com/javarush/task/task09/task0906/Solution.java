package com.javarush.task.task09.task0906;

/* 
Логирование стек трейса
*/

public class Solution {
    public static void main(String[] args) {
        log("In main method");
    }

    public static void log(String s) {
        StackTraceElement[] e = Thread.currentThread().getStackTrace();
        System.out.println(e[2].getClassName() + ": " + e[2].getMethodName() + ": " + s);
    }
}