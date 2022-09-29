package com.javarush.task.task30.task3001;

public class Number {
    private NumberSystem numberSystem;
    private String digit;

    public Number(NumberSystem numberSystem, String digit) {
        this.numberSystem = numberSystem;
        this.digit = digit;
    }

    public NumberSystem getNumberSystem() {
        return numberSystem;
    }

    public String getDigit() {
        return digit;
    }

    @Override
    public String toString() {
        return "Number{" +
                "numberSystem=" + numberSystem +
                ", digit='" + digit + '\'' +
                '}';
    }
}
