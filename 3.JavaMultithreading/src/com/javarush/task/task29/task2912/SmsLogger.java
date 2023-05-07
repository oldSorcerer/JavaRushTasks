package com.javarush.task.task29.task2912;

public class SmsLogger extends AbstractLogger {

    public SmsLogger(int level) {
        super(level);
    }

    @Override
    public void info(String message) {
        System.out.println("Send SMS to CEO: " + message);
    }
}