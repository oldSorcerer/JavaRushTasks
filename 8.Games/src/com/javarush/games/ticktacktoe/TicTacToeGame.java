package com.javarush.games.ticktacktoe;

import com.javarush.engine.cell.Game;

public class TicTacToeGame extends Game {
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

    }
}
