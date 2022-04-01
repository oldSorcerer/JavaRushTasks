package com.javarush.task.jdk13.task16.task1611;

/* 
My first thread
*/

public class Solution {

    public static class TestThread implements Runnable {
        @Override
        public void run() {
            System.out.println("My first thread");
        }
    }


    public static void main(String[] args) {
        TestThread task = new TestThread();
        new Thread(task).start();
    }
}
