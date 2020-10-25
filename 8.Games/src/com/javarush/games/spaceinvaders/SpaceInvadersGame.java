package com.javarush.games.spaceinvaders;

import com.javarush.engine.cell.*;

public class SpaceInvadersGame extends Game {
    
    public static final int WIDTH = 64;
    public static final int HEIGHT = 64;

    private void createGame() {
        drawScene();
    }
    
    private void drawScene() {
        drawField();
    }
    
    private void drawField() {
        for (int y = 0; y < WIDTH ; y++) {
            for (int x = 0; x < HEIGHT; x++) {
                setCellValueEx(x, y, Color.BLACK, "");
            }

        }
    }
    
    @Override
    public void initialize() {
        setScreenSize(WIDTH, HEIGHT);
        createGame();
    }
}