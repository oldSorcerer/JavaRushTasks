package com.javarush.task.task29.task2912;

public class ConsoleLogger implements Logger {
    int level;
    Logger next;

    public ConsoleLogger(int level) {
        this.level = level;
    }

    @Override
    public void inform(String message, int level) {
        if (this.level <= level) {
            info(message);
        }
        if (next != null) {
            next.inform(message, level);
        }
    }

    @Override
    public void setNext(Logger next) {
        this.next = next;
    }

    @Override
    public void info(String message) {
        System.out.println("Logging to console: " + message);
    }
}