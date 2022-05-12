package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Клубок
*/

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    static {
        threads.add(new MyThreadOne());
        threads.add(new MyThreadTwo());
        threads.add(new MyThreadThree());
        threads.add(new MyThreadFour());
        threads.add(new MyThreadFive());
    }

    public static void main(String[] args) {
    }

    static class MyThreadOne extends Thread {
        @Override
        public void run() {
            while (true) {
            }
        }
    }

    static class MyThreadTwo extends Thread {
        @Override
        public void run() {
            try {
                throw new InterruptedException();
            } catch (InterruptedException e) {
                System.out.println("InterruptedException");
            }
        }
    }

    static class MyThreadThree extends Thread {
        @Override
        public void run() {
            while (true) {
                System.out.println("Ура");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ignored) {
                }
            }
        }
    }

    static class MyThreadFour extends Thread implements Message {
        @Override
        public void run() {
            while (!isInterrupted()) {
            }
        }

        @Override
        public void showWarning() {
            interrupt();
        }
    }

    static class MyThreadFive extends Thread {
        @Override
        public void run() {
            BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
            int sum = 0;
            while (true) {
                try {
                    String string = rd.readLine();
                    if (string.equals("N")) {
                        break;
                    }
                    sum += Integer.parseInt(string);
                } catch (IOException ignored) {
                }
            }
            System.out.println(sum);
        }
    }
}