package com.javarush.task.task24.task2413;

import java.util.ArrayList;
import java.util.List;

public class Arkanoid {

    private int width;
    private int height;
    private Ball ball;
    private Stand stand;
    private List<Brick> bricks;

    private boolean isGameOver;

    public static Arkanoid game;

    public int getWidth() {
        return width;
    }

    public Arkanoid(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void run() {

    }

    public void move() {
        stand.move();
        ball.move();
    }

    public void draw(Canvas canvas) {
        stand.draw(canvas);
        ball.draw(canvas);
        bricks.forEach(brick -> brick.draw(canvas));
    }

    public void checkBricksBump() {
        List<Brick> copyBrick = new ArrayList<>(bricks);
        for (Brick brick : copyBrick) {
            if (brick.intersects(ball)) {
                double angle = Math.random() * 360;
                ball.setDirection(angle);
                bricks.remove(brick);
            }
        }
    }

    public void checkStandBump() {
        if (ball.intersects(stand)) {
            double angle = 90 + 20 * (Math.random() - 0.5);
            ball.setDirection(angle);
        }
    }

    public void checkEndGame() {
        if (ball.getY() > height) {
            isGameOver = true;
        }
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Ball getBall() {
        return ball;
    }

    public void setBall(Ball ball) {
        this.ball = ball;
    }

    public Stand getStand() {
        return stand;
    }

    public void setStand(Stand stand) {
        this.stand = stand;
    }

    public List<Brick> getBricks() {
        return bricks;
    }

    public void setBricks(List<Brick> bricks) {
        this.bricks = bricks;
    }


    public static void main(String[] args) {

    }
}
