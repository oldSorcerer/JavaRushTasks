package com.javarush.task.task25.task2504;

/* 
Switch для нитей
*/

public class Solution {
    public static void processThreads(Thread... threads) {
        for (Thread thread : threads) {
            switch (thread.getState()) {
                case NEW -> thread.start();
                case BLOCKED, WAITING, TIMED_WAITING -> thread.interrupt();
                case RUNNABLE -> thread.isInterrupted();
                case TERMINATED -> System.out.println(thread.getPriority());
            }
        }
    }

    public static void main(String[] args) {
    }
}
