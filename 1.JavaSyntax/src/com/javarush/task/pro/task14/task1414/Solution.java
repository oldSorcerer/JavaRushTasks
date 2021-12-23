package com.javarush.task.pro.task14.task1414;

/* 
Готовим коктейли
*/

public class Solution {

    public static final String OUTPUT_FORMAT = "Метод %s вызван из строки %d класса %s в файле %s.\n";

    public static void main(String[] args) {
        makeScrewdriver();
    }

    public static void printStackTrace(StackTraceElement[] stackTrace) {
        for (int i = 0; i < stackTrace.length; i++) {
            String methodName = stackTrace[i].getMethodName();
            int lineNumber = stackTrace[i].getLineNumber();
            String className = stackTrace[i].getClassName();
            String fileName = stackTrace[i].getFileName();
            System.out.printf(OUTPUT_FORMAT, methodName, lineNumber, className, fileName);
        }
    }

    static void makeScrewdriver() {
        addJuice();
    }

    static void addJuice() {
        addVodka();
    }

    static void addVodka() {
        printStackTrace(Thread.currentThread().getStackTrace());
    }
}
