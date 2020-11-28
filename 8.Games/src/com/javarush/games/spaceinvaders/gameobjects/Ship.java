package com.javarush.games.spaceinvaders.gameobjects;

public class Ship extends GameObject {

    public Ship(double x, double y) {
        super(x, y);
    }

    public void setStaticView(int[][] viewFrame) {
        setMatrix(viewFrame);
    }

    public Bullet fire() {
        return null;
    }
}
