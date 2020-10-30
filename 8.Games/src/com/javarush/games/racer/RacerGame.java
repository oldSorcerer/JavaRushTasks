package com.javarush.games.racer;

import com.javarush.engine.cell.*;

public class RacerGame extends Game {
    
    public static final int WIDTH = 64;
    public static final int HEIGHT = 64;
    public static final int CENTER_X = WIDTH / 2;
    public static final int ROADSIDE_WIDTH = 14;
    
    @Override
    public void initialize() {
        showGrid(false);
        setScreenSize(WIDTH, HEIGHT);
        createGame();
    }
    
    private void createGame() {
        drawScene();
    }
    
    private void drawScene() {
        drawField();
    }
    
    private void drawField() {

    }
}