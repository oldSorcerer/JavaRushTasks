package com.javarush.games.spaceinvaders;

public class ShapeMatrix {
    public static final int[][] ENEMY = new int[][]{
            {7, 0, 7},
            {7, 7, 7},
            {0, 7, 0}
    };

    public static final int[][] BULLET = new int[][]{
            {2},
            {2}
    };

    public static final int[][] PLAYER = new int[][]{
            {0, 0, 6, 0, 0},
            {0, 6, 6, 6, 0},
            {6, 6, 6, 6, 6}
    };
}