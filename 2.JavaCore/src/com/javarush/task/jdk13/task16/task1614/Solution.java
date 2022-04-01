package com.javarush.task.jdk13.task16.task1614;

/* 
Вывод стек-трейса
*/

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new SpecialThread());
        thread.start();

        System.out.println("*****************");

        for (StackTraceElement element : Thread.currentThread().getStackTrace()) {
            System.out.println(element);
        }
    }

    private static class SpecialThread implements Runnable {
        @Override
        public void run() {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        }
    }


}
