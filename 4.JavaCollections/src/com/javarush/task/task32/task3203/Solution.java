package com.javarush.task.task32.task3203;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.StringWriter;

/* 
Пишем стек-трейс
*/

public class Solution {
    public static void main(String[] args) {
        String text = getStackTrace(new IndexOutOfBoundsException("fff"));
        System.out.println(text);
    }

    public static String getStackTrace(Throwable throwable) {
//        StringWriter stringWriter = new StringWriter();
//        try (PrintWriter printWriter = new PrintWriter("")){
//            throwable.printStackTrace(printWriter);
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }
//        throwable.printStackTrace();

        StringBuilder builder = new StringBuilder();
        for (StackTraceElement stackTraceElement : throwable.getStackTrace()) {
            builder.append(stackTraceElement.toString());
        }
        return builder.toString();
    }
}
