package com.javarush.games.racer;

import com.javarush.engine.cell.*;

public class GameObject {

    public int x;
    public int y;
    public int[][] matrix;
    public int width;
    public int height;

    public GameObject(int x, int y, int[][] matrix) {
        this.x = x;
        this.y = y;
        this.matrix = matrix;
        width = matrix[0].length;
        height = matrix.length;
    }

    public void draw(Game game) {
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                game.setCellColor(x + i, y + j, Color.values()[matrix[i][j]]);
            }
        }
    }

}
