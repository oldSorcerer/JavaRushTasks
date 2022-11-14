package com.javarush.task.task16.task1613;

/* 
Big Ben clock
*/

public class Solution {
    public static volatile boolean isStopped = false;

    public static void main(String[] args) throws InterruptedException {
        Clock clock = new Clock("Лондон", 23, 59, 57);
        Thread.sleep(4000);
        isStopped = true;
        Thread.sleep(1000);
    }

    public static class Clock extends Thread {
        private final String cityName;
        private int hours;
        private int minutes;
        private int seconds;

        public Clock(String cityName, int hours, int minutes, int seconds) {
            this.cityName = cityName;
            this.hours = hours;
            this.minutes = minutes;
            this.seconds = seconds;
            start();
        }

        @Override
        public void run() {
            try {
                while (!isStopped) {
                    printTime();
                }
            } catch (InterruptedException ignored) {
            }
        }

        private void printTime() throws InterruptedException {
            Thread.sleep(1000);
            seconds++;
            if (seconds > 59) {
                minutes++;
                seconds = 0;
            }
            if (minutes > 59) {
                hours++;
                minutes = 0;
            }
            if (hours > 23) {
                hours = 0;
            }
            if (hours == 0 && minutes == 0 && seconds == 0) {
                System.out.printf("В г. %s сейчас полночь!%n", cityName);
            } else {
                System.out.printf("В г. %s сейчас %d:%d:%d!%n", cityName, hours, minutes, seconds);
            }
        }
    }
}
