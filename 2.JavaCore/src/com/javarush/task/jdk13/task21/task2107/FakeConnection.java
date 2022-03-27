package com.javarush.task.jdk13.task21.task2107;

public class FakeConnection implements AutoCloseable{

    public FakeConnection() {
        System.out.println("Establishing database connection...");
    }

    public void unsupportedOperation() {
        System.out.println("Operation is not supported yet!");
        throw new RuntimeException("UnsupportedOperation!");
    }

    public void usefulOperation() {
        System.out.println("Executing useful operation.");
    }

    @Override
    public void close() throws Exception {
        System.out.println("Closing database connection...");
    }
}
