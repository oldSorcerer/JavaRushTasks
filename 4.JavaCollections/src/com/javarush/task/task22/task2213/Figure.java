package com.javarush.task.task22.task2213;

public class Figure {

    private int x;
    private int y;
    private final int[][] matrix;

    public Figure(int x, int y, int[][] matrix) {
        this.x = x;
        this.y = y;
        this.matrix = matrix;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public void left() {
        if (isCurrentPositionAvailable()) {
            x--;
        }
    }

    public void right() {
        if (isCurrentPositionAvailable()) {
            x++;
        }
    }

    public void down() {
        if (isCurrentPositionAvailable()) {
            y++;
        }
    }

    public void up() {
        if (isCurrentPositionAvailable()) {
            y--;
        }
    }

    public void rotate() {

    }

    public void downMaximum() {

    }

    public boolean isCurrentPositionAvailable() {
        return true;
    }

    public void landed() {
        
    }


}
