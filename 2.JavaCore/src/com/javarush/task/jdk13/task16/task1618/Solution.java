package com.javarush.task.jdk13.task16.task1618;

/* 
Справедливость
*/

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        Mouse alpha = new Mouse("#1");
        Mouse mouse1 = new Mouse("#2");
        Mouse mouse2 = new Mouse("#3");
    }

    private static void eat() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ignore) {
        }
    }

    public static class Mouse extends Thread {
        public Mouse(String name) {
            super(name);
            start();
        }

        public void run() {
            System.out.println(getName() + " is starting to eat");
            eat();
            System.out.println(getName() + " has finished eating");
        }
    }
}
