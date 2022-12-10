package com.javarush.task.pro.task14.task1420;

public class WrongAnswerException extends Exception {

    private final String answer;

    public WrongAnswerException(String answer) {
        this.answer = answer;
    }

    @Override
    public String toString() {
        return String.format("WrongAnswerException{ \"%s\" }", answer);
    }
}