package com.javarush.task.jdk13.task27.task2701;

/* 
Создаем deadlock
*/

public class Solution {
    public static void main(String[] args) {
        final Friend alphonse =
                new Friend("Alphonse");
        final Friend gaston =
                new Friend("Gaston");
        new Thread(new Runnable() {
            public void run() {
                alphonse.bow(gaston);
            }
        }).start();
        new Thread(new Runnable() {
            public void run() {
                gaston.bow(alphonse);
            }
        }).start();
    }

    static class Friend {
        private final String name;

        public Friend(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

        public void bow(Friend bower) {
            System.out.format("%s: %s"
                              + " bowed to me!%n",
                    this.name, bower.getName());
            bower.bowBack(this);
        }

        public void bowBack(Friend bower) {
            System.out.format("%s: %s"
                              + " bowed back to me!%n",
                    this.name, bower.getName());
        }
    }
}
