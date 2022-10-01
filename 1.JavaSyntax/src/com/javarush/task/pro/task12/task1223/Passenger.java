package com.javarush.task.pro.task12.task1223;

public class Passenger {
    public String name;

    public Passenger(String name) {
        this.name = name;
    }

    public void jump(Integer delay) {
        System.out.printf("%s выжидает %d секунд... и прыгает!\n", name, delay);
    }
}
