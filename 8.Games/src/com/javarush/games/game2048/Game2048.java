package com.javarush.games.game2048;

import com.javarush.engine.cell.*;

public class Game2048 extends Game{
    
    private static final int SIDE = 4;
    
    private int[][] gameField = new int[SIDE][SIDE];
    
    private void createGame() {
        createNewNumber();
        createNewNumber();
    }
    
    private void drawScene() {
        for(int y = 0; y < SIDE; y++)
            for (int x = 0; x < SIDE; x++)
                setCellColor(x, y, Color.RED);
    }
    
    @Override
    public void initialize() {
        setScreenSize(SIDE, SIDE);
        createGame();
        drawScene();
    }

    private void createNewNumber() {
        int x = getRandomNumber(SIDE);
        int y = getRandomNumber(SIDE);
        int number = getRandomNumber(10);

        if (gameField[x][y] == 0) {
            if (number < 9)
                gameField[x][y] = 2;
            else
                gameField[x][y] = 4;
        } else
            createNewNumber();
    }

    private Color setCellColoredNumber () {
        return null;
    }
    
}