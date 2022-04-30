package com.javarush.task.task16.task1621;

/* 
Thread.currentThread - всегда возвращает текущую нить
*/

public class Solution {
    static int count = 5;

    public static void main(String[] args) {
        ThreadNamePrinter tnp = new ThreadNamePrinter();
        tnp.start();
        for (int i = 0; i < count; i++) {
            tnp.printMsg();
        }
    }

    public static class ThreadNamePrinter extends Thread {
        public void run() {
            for (int i = 0; i < count; i++) {
                printMsg();
            }
        }

        public void printMsg() {
            Thread t = Thread.currentThread();
            String name = t.getName();
            System.out.println("Name=" + name);
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
