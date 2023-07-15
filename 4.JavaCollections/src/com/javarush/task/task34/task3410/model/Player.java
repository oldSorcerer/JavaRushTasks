package com.javarush.task.task34.task3410.model;

import java.awt.*;

public class Player extends CollisionObject implements Movable {

    public Player(int x, int y) {
        super(x, y);
    }

    @Override
    public void draw(Graphics graphics) {

    }

    @Override
    public void move(int x, int y) {
        setX(getX() + x);
        setY(getX() + y);
    }
}
