package com.javarush.task.jdk13.task21.task2107;

public class DBConnectionManager {
    public FakeConnection getFakeConnection() {
        return new FakeConnection();
    }
}
