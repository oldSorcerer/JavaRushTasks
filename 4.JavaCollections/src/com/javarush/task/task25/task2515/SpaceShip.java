package com.javarush.task.task25.task2515;

import java.util.List;

public class SpaceShip extends BaseObject {

    private double dx;

    public SpaceShip(double x, double y) {
        super(x, y, 3);
    }

    public void moveLeft() {
        dx = -1;
    }

    public void moveRight() {
        dx = 1;
    }

    public void move() {
        x = x + dx;
        checkBorders(0, Space.game.getWidth(), 0, Space.game.getHeight());
    }

    public void draw(Canvas canvas) {

    }

    public void fire() {
        Rocket rocketOne = new Rocket(x + 2, y);
        Rocket rocketTwo = new Rocket(x - 2, y);
        List<Rocket> rockets = Space.game.getRockets();
        rockets.add(rocketOne);
        rockets.add(rocketTwo);
    }

}
