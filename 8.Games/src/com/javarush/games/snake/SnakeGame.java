package com.javarush.games.snake;

import com.javarush.engine.cell.*;


public class SnakeGame extends Game {
    
    public static final int WIDTH = 15;
    public static final int HEIGHT = 15;
    private Snake snake;
    private int turnDelay;
    
    private void createGame() {
        turnDelay = 300;
        setTurnTimer(turnDelay);

        Snake newSnake = new Snake(WIDTH / 2, HEIGHT / 2);
        this.snake = newSnake;
        drawScene();
       /* Apple apple = new Apple(7, 7);
        apple.draw(this);*/
       
        
    }
    
    private void drawScene() {
        for (int y = 0; y < WIDTH; y++)
            for (int x = 0; x < HEIGHT; x++)
                setCellColor(x, y, Color.DARKSEAGREEN);
        snake.draw(this);
    }
    
    @Override
    public void initialize() {
        setScreenSize(15, 15);
        createGame();
        
    }

    @Override
    public void onTurn(int step) {
        snake.move();
        drawScene();
    }
}