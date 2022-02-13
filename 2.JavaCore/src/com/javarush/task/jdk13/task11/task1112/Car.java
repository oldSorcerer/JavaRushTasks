package com.javarush.task.jdk13.task11.task1112;

public class Car {

    private final Engine engine = new Engine();

    public void start() {
        engine.start();
    }

    public void turnOff() {
        engine.turnOff();
    }

    private static class Engine {

        private boolean running;

        private void start() {
            running = true;
            System.out.println("дыр-дыр-дыр-ДЫР-ДЫР-ДР-ДРРРРРРРРРР");
        }

        private void turnOff() {
            running = false;
            System.out.println("пффффффф");
        }
    }
}
