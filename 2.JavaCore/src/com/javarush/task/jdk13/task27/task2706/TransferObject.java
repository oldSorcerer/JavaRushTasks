package com.javarush.task.jdk13.task27.task2706;

public class TransferObject {
    private int value;
    protected volatile boolean isValuePresent = false; //use this variable

    public int get() {
        System.out.println("Got: " + value);
        return value;
    }

    public void put(int value) {
        this.value = value;
        System.out.println("Put: " + value);
    }
}
