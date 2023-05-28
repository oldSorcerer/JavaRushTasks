package com.javarush.task.jdk13.task41.task4104.move;

public class Fly implements MoveLogic{

    @Override
    public void move(String name) {
        System.out.println(name + " машет крыльями.");
    }
}
