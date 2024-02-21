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
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                updateCellView(x, y, model[x][y]);
            }
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

    @Override
    public void onMouseLeftClick(int x, int y) {
        if (isGameStopped) {
            return;
        }
        if (model[x][y] != 0) {
            return;
        }
        setSignAndCheck(x, y);
        currentPlayer = 3 - currentPlayer;
        computerTurn();
        currentPlayer = 3 - currentPlayer;
    }

    public boolean checkWin(int x, int y, int n) {
        return (model[x][0] == n && model[x][1] == n && model[x][2] == n) ||
               (model[0][y] == n && model[1][y] == n && model[2][y] == n) ||
               (model[0][0] == n && model[1][1] == n && model[2][2] == n) ||
               (model[0][2] == n && model[1][1] == n && model[2][0] == n);
    }

    public void setSignAndCheck(int x, int y) {
        model[x][y] = currentPlayer;
        updateView();
        if (checkWin(x, y, currentPlayer)) {
            isGameStopped = true;
            if (currentPlayer == 1) {
                showMessageDialog(Color.NONE, "You Win!", Color.GREEN, 75);
            } else if (currentPlayer == 2) {
                showMessageDialog(Color.NONE, "Game Over", Color.RED, 75);
            }
        }

        if (!hasEmptyCell()) {
            isGameStopped = true;
            showMessageDialog(Color.NONE, " Draw!", Color.BLUE, 75);
        }
    }

    public boolean hasEmptyCell() {
        for (int i = 0; i < model.length; i++) {
            for (int j = 0; j < model[i].length; j++) {
                if (model[i][j] == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public void onKeyPress(Key key) {
        if (isGameStopped && Key.SPACE == key) {
            startGame();
            updateView();
        } else if (Key.ESCAPE == key) {
            startGame();
            updateView();
        }
    }

    public void computerTurn() {
        for (int i = 0; i < model.length; i++) {
            for (int j = 0; j < model.length; j++) {
                if (model[i][j] == 0) {
                    setSignAndCheck(i, j);
                    return;
                }
            }
        }
    }
}
