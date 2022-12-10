package com.javarush.task.pro.task14.task1422;

/* 
Сбор и сканирование ДНК
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        printDNA();
    }

    public static void printDNA() {
        for (StackTraceElement[] a : getDNA()) {
            StackTraceElement stackTraceElement = a[1];
            System.out.printf("File name: %s, Method name: %s, Line number: %d\n",
                    stackTraceElement.getFileName(), stackTraceElement.getMethodName(),
                    stackTraceElement.getLineNumber());
        }
    }

    private static List<StackTraceElement[]> getDNA() {
        List<StackTraceElement[]> list = new ArrayList<>();

        list.add(adenine());
        list.add(thymine());
        list.add(cytosine());
        list.add(guanine());

        return list;
    }

    private static StackTraceElement[] adenine() {
        return Thread.currentThread().getStackTrace();
    }

    private static StackTraceElement[] thymine() {
        return Thread.currentThread().getStackTrace();
    }

    private static StackTraceElement[] cytosine() {
        return Thread.currentThread().getStackTrace();
    }

    private static StackTraceElement[] guanine() {
        return Thread.currentThread().getStackTrace();
    }
}