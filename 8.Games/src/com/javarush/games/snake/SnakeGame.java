package com.javarush.games.snake;

import com.javarush.engine.cell.*;

public class SnakeGame extends Game {
    
    public static final int WIDTH = 15;
    public static final int HEIGHT = 15;

    private static final int GOAL = 28;

    private Snake snake;
    private Apple apple;

    private int turnDelay;
    private int score;
    private boolean isGameStopped;

    private void createGame() {
        score = 0;
        setScore(score);
        turnDelay = 300;
        setTurnTimer(turnDelay);
        snake = new Snake(WIDTH / 2, HEIGHT / 2);
        createNewApple();
        isGameStopped = false;
        drawScene();
    }
    
    private void drawScene() {
        for (int x = 0; x < WIDTH; x++) {
            for (int y = 0; y < HEIGHT; y++) {
                setCellValueEx(x, y, Color.DARKSEAGREEN, "");
            }
        }
        snake.draw(this);
        apple.draw(this);
    }
    
    @Override
    public void initialize() {
        setScreenSize(WIDTH, HEIGHT);
        createGame();
    }

    @Override
    public void onTurn(int step) {
        snake.move(apple);
        if (!apple.isAlive) {
            setScore(score += 5);
            setTurnTimer(turnDelay -= 10);
            createNewApple();
        }
        if (!snake.isAlive) {
            gameOver();
        }
        if (snake.getLength() > GOAL) {
            win();
        }
        drawScene();
    }

    @Override
    public void onKeyPress(Key key) {
        if (key.equals(Key.LEFT)) {
            snake.setDirection(Direction.LEFT);
        } else if (key.equals(Key.RIGHT)) {
            snake.setDirection(Direction.RIGHT);
        } else if (key.equals(Key.UP)) {
            snake.setDirection(Direction.UP);
        } else if (key.equals(Key.DOWN)) {
            snake.setDirection(Direction.DOWN);
        } else if (key.equals(Key.SPACE) && isGameStopped) {
            createGame();
        }
    }

    private void createNewApple() {
        while (true) {
            apple = new Apple(getRandomNumber(WIDTH), getRandomNumber(HEIGHT));
            if (!snake.checkCollision(apple)) {
                return;
            }
        }
    }

    private void gameOver() {
        stopTurnTimer();
        isGameStopped = true;
        showMessageDialog(Color.NONE,"GAME OVER", Color.RED, 75);
    }

    private void win() {
        stopTurnTimer();
        isGameStopped = true;
        showMessageDialog(Color.NONE, "YOU WIN", Color.GREEN, 75);
    }
}