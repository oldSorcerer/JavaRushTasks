package com.javarush.task.task20.task2015;

import java.io.*;

/* 
Переопределение сериализации
*/

public class Solution implements Serializable, Runnable {
    private transient Thread runner;
    private int speed;

    public Solution(int speed) {
        this.speed = speed;
        runner = new Thread(this);
        runner.start();
    }

    public void run() {
    }

    @Serial
    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
    }

    @Serial
    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        Thread thread = new Thread(this);
        thread.start();
    }

    public static void main(String[] args) {
    }
}
