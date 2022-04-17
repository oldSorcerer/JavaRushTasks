package com.javarush.task.task16.task1616;

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
            try {
                while (true) {
                    Thread.sleep(1000);
                    seconds++;
                }
            } catch (InterruptedException e) {
                System.out.println(seconds);
            }
        }
    }
}
