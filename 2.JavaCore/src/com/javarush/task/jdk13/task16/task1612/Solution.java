package com.javarush.task.jdk13.task16.task1612;

/* 
My second thread
*/

public class Solution {

    public static class TestThread extends Thread {

        static {
            System.out.println("it's a static block inside TestThread");
        }

        @Override
        public void run() {
            System.out.println("it's a run method");
        }
    }

    public static void main(String[] args) {
        TestThread thread = new TestThread();
        thread.start();
    }
}
