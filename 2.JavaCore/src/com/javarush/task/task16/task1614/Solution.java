package com.javarush.task.task16.task1614;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/* 
Обратный отсчет
*/

public class Solution {
    public static volatile List<String> list = new ArrayList<>(5);

    static {
        for (int i = 0; i < 5; i++) {
            list.add("Строка " + i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new Countdown(3), "Countdown");
        t.start();
    }

    public static class Countdown implements Runnable {
        private int countFrom;

        public Countdown(int countFrom) {
            this.countFrom = countFrom;
        }

        @Override
        public void run() {
            try {
                while (countFrom > 0) {
                    printCountdown();
                }
            } catch (InterruptedException ignored) {
            }
        }

        public void printCountdown() throws InterruptedException {
                Thread.sleep(500);
                System.out.println(list.get(--countFrom));
        }
    }
}