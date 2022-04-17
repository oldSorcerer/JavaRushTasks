package com.javarush.task.jdk13.task16.task1623;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Считаем секунды
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            Stopwatch stopwatch = new Stopwatch();
            stopwatch.start();
            reader.readLine();
            stopwatch.interrupt();
        }
    }

    public static class Stopwatch extends Thread {
        private int seconds;

        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    Thread.sleep(1000);
                    seconds++;
                } catch (InterruptedException e) {
                    System.out.println(seconds);
                    Thread.currentThread().interrupt();
                }
            }
        }
    }
}
