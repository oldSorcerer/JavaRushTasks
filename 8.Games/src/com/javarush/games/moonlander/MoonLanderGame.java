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
    private int score;

    @Override
    public void initialize() {
        setScreenSize(WIDTH, HEIGHT);
        createGame();
        showGrid(false);
    }

    @Override
    public void onTurn(int step) {
        rocket.move(isUpPressed, isLeftPressed, isRightPressed);
        check();
        drawScene();
        if (score > 0) {
            score--;
        }
        setScore(score);
    }

    @Override
    public void setCellColor(int x, int y, Color color) {
        if (x > WIDTH - 1 || x < 0 || y < 0 || y > HEIGHT - 1) {
            return;
        }
        super.setCellColor(x, y, color);
    }

    @Override
    public void onKeyPress(Key key) {
        if (key.equals(Key.RIGHT)) {
            isRightPressed = true;
            isLeftPressed = false;
        } else if (key.equals(Key.LEFT)) {
            isLeftPressed = true;
            isRightPressed = false;
        } else if (key.equals(Key.UP)) {
            isUpPressed = true;
        } else if (key.equals(Key.SPACE) && isGameStopped) {
            createGame();
        }
    }

    @Override
    public void onKeyReleased(Key key) {
        if (key.equals(Key.RIGHT)) {
            isRightPressed = false;
        } else if (key.equals(Key.LEFT)) {
            isLeftPressed = false;
        } else if (key.equals(Key.UP)) {
            isUpPressed = false;
        }
    }

    private void createGame() {
        setTurnTimer(50);
        createGameObjects();
        drawScene();
        isUpPressed = false;
        isLeftPressed = false;
        isRightPressed = false;
        isGameStopped = false;
        score = 1000;
    }

    private void drawScene() {
        for (int y = 0; y < HEIGHT; y++) {
            for (int x = 0; x < WIDTH; x++) {
                setCellColor(x, y, Color.BLACK);
            }
        }
        rocket.draw(this);
        landscape.draw(this);
    }

    private void createGameObjects() {
        rocket = new Rocket(WIDTH / 2.0, 0);
        landscape = new GameObject(0, 25, ShapeMatrix.LANDSCAPE);
        platform = new GameObject(23, MoonLanderGame.HEIGHT - 1, ShapeMatrix.PLATFORM);
    }

    private void check() {
        if (rocket.isCollision(landscape)){
            gameOver();
        }
        if (rocket.isCollision(platform) && rocket.isStopped()) {
            win();
        }
    }

    private void win() {
        rocket.land();
        isGameStopped = true;
        showMessageDialog(Color.NONE, "YOU WIN", Color.VIOLET, 75);
        stopTurnTimer();
    }

    private void gameOver() {
        rocket.crash();
        isGameStopped = true;
        showMessageDialog(Color.NONE, "GAME OVER", Color.RED, 75);
        stopTurnTimer();
        score = 0;
    }
} //--module-path "D:\TheProjects\IdeaProjects\JavaRushTasks\lib\javafx-sdk-17.0.2\lib" --add-modules javafx.controls,javafx.fxml