package com.javarush.task.jdk13.task16.task1625;

/* 
Снова interrupt
*/

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        TestThread thread = new TestThread();
        thread.start();
        thread.interrupt();
    }

    public static class TestThread extends Thread {
        @Override
        public void run() {

        }
    }
}