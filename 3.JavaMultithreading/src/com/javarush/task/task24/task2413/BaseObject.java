package com.javarush.task.task24.task2413;

public abstract class BaseObject {

    private double x;
    private double y;
    private double radius;

    public BaseObject(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public abstract void draw(Canvas canvas);

    public abstract void move();

    public boolean intersects(BaseObject baseObject) {
        double pow1 = Math.pow(baseObject.getX() - this.getX(), 2);
        double pow2 = Math.pow(baseObject.getY() - this.getY(), 2);

        return Math.sqrt(pow1 + pow2) <= Math.max(this.radius, baseObject.radius);
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
}
