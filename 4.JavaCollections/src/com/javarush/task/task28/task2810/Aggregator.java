package com.javarush.task.task28.task2810;

import com.javarush.task.task28.task2810.model.Provider;

public class Aggregator {
    public static void main(String[] args) {
        Provider provider = new Provider(null);
        Controller controller = new Controller(provider);
        System.out.println(controller);

    }
}
