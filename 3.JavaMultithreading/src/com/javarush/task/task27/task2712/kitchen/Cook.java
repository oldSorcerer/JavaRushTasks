package com.javarush.task.task27.task2712.kitchen;

import com.javarush.task.task27.task2712.ConsoleHelper;

import java.util.Observable;
import java.util.Observer;

public class Cook implements Observer {

    private final String name;

    public Cook(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable observable, Object order) {
        ConsoleHelper.writeMessage("Start cooking - " + order);
    }

    @Override
    public String toString() {
        return name;
    }
}
