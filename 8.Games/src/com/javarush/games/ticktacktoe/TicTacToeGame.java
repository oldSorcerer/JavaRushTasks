package com.javarush.games.ticktacktoe;

import com.javarush.engine.cell.*;

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

    public void updateView() {
        for (int x = 0; x < 3; x++)
            for (int y = 0; y < 3; y++) {
                updateCellView(x, y, model[x][y]);
            }
    }

    public void updateCellView(int x, int y, int value) {
        String str;
        if (value == 0) {
            str = " ";
        } else if (value == 1) {
            str = "X";
        } else if (value == 2) {
            str = "O";
        } else {
            str = "";
        }

        Color color = value == 1 ? Color.RED : value == 2 ? Color.BLUE : Color.WHITE;
        setCellValueEx(x, y, Color.WHITE, str, color);
    }

    public void onMouseLeftClick(int x, int y) {
        if (isGameStopped) {
            return;
        }
        if (model[x][y] != 0) {
            return;
        }
        model[x][y] = currentPlayer;
        updateView();
        if (checkWin(x, y, currentPlayer)){
            isGameStopped = true;
            showMessageDialog(Color.NONE, " Player #" + currentPlayer + " win!", Color.GREEN, 75);
        }
        currentPlayer = 3 - currentPlayer;
    }

    public boolean checkWin(int x, int y, int n) {
        return (model[x][0] == n && model[x][1] == n && model[x][2] == n) ||
                (model[0][y] == n && model[1][y] == n && model[2][y] == n);
    }
}
