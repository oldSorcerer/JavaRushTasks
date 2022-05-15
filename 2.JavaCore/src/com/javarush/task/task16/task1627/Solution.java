package com.javarush.task.task16.task1627;

import java.util.ArrayList;
import java.util.List;

/* 
Поиграем?
*/

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        OnlineGame onlineGame = new OnlineGame();
        onlineGame.start();
    }

    public static class OnlineGame extends Thread {
        public static volatile boolean isWinnerFound = false;

        public static List<String> steps = new ArrayList<>();

        static {
            steps.add("Начало игры");
            steps.add("Сбор ресурсов");
            steps.add("Рост экономики");
            steps.add("Убийство врагов");
        }

        protected Gamer gamer1 = new Gamer("Ivanov", 3);
        protected Gamer gamer2 = new Gamer("Petrov", 1);
        protected Gamer gamer3 = new Gamer("Sidorov", 5);

        public void run() {
            gamer1.start();
            gamer2.start();
            gamer3.start();

            while (!isWinnerFound) {
            }
            gamer1.interrupt();
            gamer2.interrupt();
            gamer3.interrupt();
        }
    }

    public static class Gamer extends Thread {
        private int rating;

        public Gamer(String name, int rating) {
            super(name);
            this.rating = rating;
        }

        @Override
        public void run() {
            try {
                for (int i = 0; i < OnlineGame.steps.size() ; i++) {
                    System.out.println(getName() + ":" + OnlineGame.steps.get(i));
                    Thread.sleep(1000 / rating);
                    if (OnlineGame.steps.get(i).equals("Убийство врагов") && !OnlineGame.isWinnerFound) {
                        System.out.println(getName() + ":победитель!");
                        OnlineGame.isWinnerFound = true;
                    }
                }
            } catch (InterruptedException e) {
                System.out.println(getName() + ":проиграл");
            }
        }
    }
}
