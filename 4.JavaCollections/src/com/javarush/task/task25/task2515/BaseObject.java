package com.javarush.task.task25.task2515;

public abstract class BaseObject {

    private double x;
    private double y;
    private double radius;

    private boolean isAlive;

    public BaseObject(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        isAlive = true;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void draw() {

    }

    public void move() {

    }

    public void die() {
        isAlive = false;
    }

    public boolean isIntersect(BaseObject o) {
        double distance = Math.sqrt(Math.pow((o.x - x), 2) + Math.pow((o.y - y), 2));
        return distance < Math.max(this.radius, o.radius);
    }


}
