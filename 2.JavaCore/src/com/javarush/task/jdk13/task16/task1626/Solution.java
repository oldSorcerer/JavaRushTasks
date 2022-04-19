package com.javarush.task.jdk13.task16.task1626;

/* 
А без interrupt слабо?
*/

public class Solution {
    public static volatile boolean flag = false;

    public static void main(String[] args) throws InterruptedException {
        TestThread testThread = new TestThread();
        Thread t = new Thread(testThread);
        t.start();
        Thread.sleep(3000);
        ourInterruptMethod();

    }

    public static void ourInterruptMethod() {
        flag = true;
    }

    public static class TestThread implements Runnable {

        public void run() {
            while (!flag) {
                try {
                    System.out.println("he-he");
                    Thread.sleep(500);
                } catch (InterruptedException ignore) {
                }
            }
        }
    }
}
