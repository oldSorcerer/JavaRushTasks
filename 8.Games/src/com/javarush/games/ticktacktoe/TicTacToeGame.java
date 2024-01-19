package com.javarush.games.ticktacktoe;

import com.javarush.engine.cell.Game;

public class TicTacToeGame extends Game {

    private boolean isGameStopped;
    private int[][] model = new int[3][3];
    private int currentPlayer;

    @Override
    public void initialize() {
        setScreenSize(3, 3);
        startGame();
        updateView();
    }

    public void startGame() {
        currentPlayer = 1;
        model = new int[3][3];
        isGameStopped = false;
    }

    public void updateCellView(int x, int y, int value) {
        String str = switch (value) {
            case 0 -> " ";
            case 1 -> "X";
            case 2 -> "O";
            default -> "";
        };
        setCellValue(x, y, str);
    }

    public void updateView() {
        for (int x = 0; x < model.length; x++) {
            for (int y = 0; y < model[x].length; y++) {
                updateCellView(x, y, model[x][y]);
            }
        }
    }

    public void onMouseLeftClick(int x, int y) {
        if (isGameStopped) {
            return;
        }
        model[x][y] = currentPlayer;
        updateView();
        currentPlayer = 3 - currentPlayer;
    }

    public boolean checkWin(int x, int y, int n) {
        for (int i = 0; i < model.length; i++) {
            for (int j = 0; j < model[i].length; j++) {
                if (model[i][j] == n) {

                }
            }

        }

        return false;
    }
}
