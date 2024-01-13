package com.javarush.games.ticktacktoe;

import com.javarush.engine.cell.Game;

public class TicTacToeGame extends Game {
    private int[][] model = new int[3][3];
    private int currentPlayer;

    @Override
    public void initialize() {
        setScreenSize(3, 3);
        startGame();
    }

    public void startGame() {
        currentPlayer = 1;
        model = new int[3][3];
    }

    void updateCellView(int x, int y, int value) {
        if (value == 0) {
            setCellValue(x, y, " ");
        } else if (value == 1) {
            setCellValue(x, y, "X");
        } else if (value == 2) {
            setCellValue(x, y, "O");
        }
    }
}
