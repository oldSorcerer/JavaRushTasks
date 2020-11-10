package com.javarush.games.moonlander;

import com.javarush.engine.cell.*;

public class MoonLanderGame extends Game {

    public static final int WIDTH = 64;
    public static final int HEIGHT = 64;

    private Rocket rocket;
    private GameObject landscape;
    private GameObject platform;
    private boolean isUpPressed;
    private boolean isLeftPressed;
    private boolean isRightPressed;
    private boolean isGameStopped;

    @Override
    public void initialize() {
        setScreenSize(WIDTH, HEIGHT);
        createGame();
        showGrid(false);
    }

    private void createGame() {
        setTurnTimer(50);
        createGameObjects();
        drawScene();
        isUpPressed = false;
        isLeftPressed = false;
        isRightPressed = false;
        isGameStopped = false;
    }

    private void drawScene() {
        for(int x = 0; x < WIDTH; x++) {
            for(int y = 0; y < HEIGHT; y++) {
                setCellColor(x, y, Color.BLACK);
            }
        }
        rocket.draw(this);
        landscape.draw(this);
    }

    private void createGameObjects() {
        rocket = new Rocket(WIDTH/2.0, 0);
        landscape = new GameObject(0,25, ShapeMatrix.LANDSCAPE);
        platform = new GameObject(23, MoonLanderGame.HEIGHT - 1, ShapeMatrix.PLATFORM);
    }

    @Override
    public void onTurn(int step) {
        rocket.move(isUpPressed, isLeftPressed, isRightPressed);
        check();
        drawScene();
    }

    @Override
    public void setCellColor(int x, int y, Color color) {
        if ( x < WIDTH && y < HEIGHT && x >= 0 && y >= 0) {
            super.setCellColor(x, y, color);
        }
    }

    @Override
    public void onKeyPress(Key key) {
        if (key.equals(Key.UP)) {
            isUpPressed = true;
        } else if (key.equals(Key.LEFT)) {
            isLeftPressed = true;
            isRightPressed = false;
        } else if (key.equals(Key.RIGHT)) {
            isRightPressed = true;
            isLeftPressed = false;
        }
    }

    @Override
    public void onKeyReleased(Key key) {
        if (key.equals(Key.UP)) {
            isUpPressed = false;
        } else if (key.equals(Key.LEFT)) {
            isLeftPressed = false;
        } else if (key.equals(Key.RIGHT)) {
            isRightPressed = false;
        } else if (key.equals(Key.SPACE) && isGameStopped) {
            createGame();
        }
    }

    private void check() {
        if (rocket.isCollision(landscape)) {
            gameOver();
        } else if (rocket.isCollision(platform) && rocket.isStopped()) {
            win();
        }
    }

    private void win() {
        rocket.land();
        isGameStopped = true;
        showMessageDialog(Color.NONE, "WIN", Color.GREEN, 75);
        stopTurnTimer();

    }

    private void gameOver() {
        rocket.crash();
        isGameStopped = true;
        showMessageDialog(Color.NONE, "GAME OVER", Color.RED, 75);
        stopTurnTimer();
    }

}