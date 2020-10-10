package com.javarush.task.task16.task1629;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Только по-очереди!
*/

public class Solution {
    public static volatile BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws InterruptedException {
        Read3Strings t1 = new Read3Strings();
        Read3Strings t2 = new Read3Strings();


        t1.start();
        t2.start();

        t1.join();
        t2.join();

        t1.printResult();
        t2.printResult();
    }

    public static class Read3Strings extends Thread {

        StringBuilder strBuilder = new StringBuilder();

        @Override
        public void run () {

            try {
                for (int i = 0; i < 3; i++) {
                    String string = reader.readLine();
                    strBuilder.append(string).append(" ");
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public synchronized void printResult() {
            System.out.println(strBuilder);
        }
    }
}
