package com.javarush.games.moonlander;

public class Rocket extends GameObject{

    private double speedY = 0.0;
    private double boost = 0.05;

    public Rocket(double x, double y) {
        super(x, y, ShapeMatrix.ROCKET);
    }

    public void move() {
        speedY += boost;
        this.y += speedY;
    }
}
