package com.javarush.games.minesweeper;

import com.javarush.engine.cell.*;

public class MinesweeperGame extends Game {
    
    private static final int SIDE = 9;
    private GameObject[][] gameField = new GameObject[SIDE][SIDE];
    private int countMinesOnField;
    
    private void createGame() {
        for (int i = 0; i < gameField.length; i++) {
            for (int j = 0; j < gameField[i].length; j++) {
                boolean isMin = getRandomNumber(10) < 1;
                if (isMin) {
                    countMinesOnField++;
                }
                gameField[i][j] = new GameObject(j, i, isMin);
                setCellColor(gameField[i][j].x, gameField[i][j].y, Color.ORANGE);
            }
        }
    }
    
    @Override
    public void initialize() {
        setScreenSize(SIDE, SIDE);
        createGame();
    }
}