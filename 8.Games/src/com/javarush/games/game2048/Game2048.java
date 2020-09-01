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
        for(int i = 0; i < SIDE; i++)
            for (int j = 0; j < SIDE; j++)
                setCellColor(i, j, Color.RED);
    }
    
    @Override
    public void initialize() {
        setScreenSize(SIDE, SIDE);
        createGame();
        drawScene();
    }

    private void createNewNumber() {
        getRandomNumber(SIDE);
        getRandomNumber(SIDE);
        getRandomNumber(10);
    }
    
}