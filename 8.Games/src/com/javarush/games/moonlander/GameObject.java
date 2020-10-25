package com.javarush.games.moonlander;

public class GameObject {

    public double x;
    public double y;
    public int[][] matrix;
    
    public GameObject(double x, double y, int[][] matrix) {
        this.x = x;
        this.y = y;
        this.matrix = matrix;
    }
}
