package com.javarush.games.racer;

import com.javarush.engine.cell.Color;
import com.javarush.engine.cell.Game;

import java.util.Arrays;

public class ProgressBar {
    private GameObject progressBar;
    private GameObject progressBarField;
    private int maxValue;

    public ProgressBar(int maxValue) {
        this.maxValue = maxValue;
        int[][] fieldMatrix = createColoredMatrix(1, maxValue, Color.BLACK);
        int[][] indicatorMatrix = createColoredMatrix(1, 1, Color.WHITE);

        int x = RacerGame.WIDTH - 5;
        int y = RacerGame.HEIGHT / 2 - maxValue / 2;
        progressBarField = new GameObject(x, y, fieldMatrix);

        progressBar = new GameObject(x, y + maxValue, indicatorMatrix);
    }

    public void draw(Game game) {
        progressBarField.draw(game);
        progressBar.draw(game);
    }

    public void move(int currentValue) {
        int dy = currentValue < maxValue - 1 ? currentValue : maxValue - 1;
        progressBar.y = progressBarField.y + progressBarField.height - dy - 1;
    }

    private int[][] createColoredMatrix(int width, int height, Color color) {
        int[] line = new int[width];
        Arrays.fill(line, color.ordinal());

        int[][] matrix = new int[height][width];
        Arrays.fill(matrix, line);

        return matrix;
    }
}