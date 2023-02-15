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

    public static class MyThreadOne extends Thread {
        @Override
        public void run() {
            while (true) {
            }
        }
    }

    public static class MyThreadTwo extends Thread {
        @Override
        public void run() {
            try {
                throw new InterruptedException();
            } catch (InterruptedException e) {
                System.out.println("InterruptedException");
            }
        }
    }

    public static class MyThreadThree extends Thread {
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

    public static class MyThreadFour extends Thread implements Message {
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

    public static class MyThreadFive extends Thread {
        @Override
        public void run() {
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
                int sum = 0;
                while (true) {
                    try {
                        String string = reader.readLine();
                        if (string.equals("N")) {
                            break;
                        }
                        sum += Integer.parseInt(string);
                    } catch (IOException ignored) {
                    }
                }
                System.out.println(sum);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}