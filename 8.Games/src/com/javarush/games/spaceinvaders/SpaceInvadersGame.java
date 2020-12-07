package com.javarush.games.spaceinvaders;

import com.javarush.engine.cell.*;

import com.javarush.games.spaceinvaders.gameobjects.*;

import java.util.ArrayList;
import java.util.List;

public class SpaceInvadersGame extends Game {
    
    public static final int WIDTH = 64;
    public static final int HEIGHT = 64;
    public static final int COMPLEXITY = 5;

    private static final int PLAYER_BULLETS_MAX = 1;

    private List<Star> stars;
    private List<Bullet> enemyBullets;
    private List<Bullet> playerBullets;

    private EnemyFleet enemyFleet;
    private PlayerShip playerShip;

    private boolean isGameStopped;

    private int animationsCount;
    private int score;

    private void createGame() {
        enemyBullets = new ArrayList<>();
        playerBullets = new ArrayList<>();
        enemyFleet = new EnemyFleet();
        playerShip = new PlayerShip();
        isGameStopped = false;
        animationsCount = 0;
        score = 0;
        createStars();
        drawScene();
        setTurnTimer(40);
    }
    
    private void drawScene() {
        drawField();
        for (Bullet bullet : enemyBullets) {
            bullet.draw(this);
        }
        for (Bullet bullet : playerBullets) {
            bullet.draw(this);
        }
        enemyFleet.draw(this);
        playerShip.draw(this);
    }
    
    private void drawField() {
        for (int y = 0; y < WIDTH ; y++) {
            for (int x = 0; x < HEIGHT; x++) {
                setCellValueEx(x, y, Color.BLACK, "");
            }
        }
        for (Star star : stars) {
            star.draw(this);
        }
    }

    private void createStars() {
        stars = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            stars.add(new Star(getRandomNumber(WIDTH), getRandomNumber(HEIGHT)));
        }
    }

    private void moveSpaceObjects() {
        enemyFleet.move();
        playerShip.move();
        for (Bullet bullet : enemyBullets) {
            bullet.move();
        }
        for (Bullet bullet : playerBullets) {
            bullet.move();
        }
    }

    private void removeDeadBullets() {
        List<Bullet> enemyBulletsCopy = new ArrayList<>(enemyBullets);
        for (Bullet bullet : enemyBulletsCopy) {
            if (!bullet.isAlive || bullet.y >= HEIGHT - 1) {
                enemyBullets.remove(bullet);
            }
        }
        List<Bullet> playerBulletsCopy = new ArrayList<>(playerBullets);
        for (Bullet bullet : playerBulletsCopy) {
            if (!bullet.isAlive || bullet.y + bullet.height < 0) {
                playerBullets.remove(bullet);
            }
        }
    }

    private void check() {
        playerShip.verifyHit(enemyBullets);
        int verifyHit = enemyFleet.verifyHit(playerBullets);
        enemyFleet.deleteHiddenShips();
        double bottomBorder = enemyFleet.getBottomBorder();
        if (bottomBorder >= playerShip.y) {
            playerShip.kill();
        }
        int shipsCount = enemyFleet.getShipsCount();
        if (shipsCount == 0) {
            playerShip.win();
            stopGameWithDelay();
        }

        removeDeadBullets();
        if (!playerShip.isAlive) {
            stopGameWithDelay();
        }

        score += verifyHit;
    }

    @Override
    public void initialize() {
        setScreenSize(WIDTH, HEIGHT);
        createGame();
    }

    @Override
    public void onTurn(int step) {
        moveSpaceObjects();
        check();
        Bullet bullet =  enemyFleet.fire(this);
        if (bullet != null) {
            enemyBullets.add(bullet);
        }
        setScore(score);
        drawScene();
    }

    private void stopGame(boolean isWin) {
        isGameStopped = true;
        stopTurnTimer();
        if (isWin) {
            showMessageDialog(Color.NONE, "YOU WIN", Color.GREEN, 100);
        } else {
            showMessageDialog(Color.NONE, "GAME OVER", Color.RED, 100);
        }
    }

    private void stopGameWithDelay() {
        animationsCount++;
        if (animationsCount >= 10) {
            stopGame(playerShip.isAlive);
        }
    }

    @Override
    public void onKeyPress(Key key) {
        if (key == Key.SPACE && isGameStopped) {
            createGame();
        } else if (key == Key.LEFT) {
            playerShip.setDirection(Direction.LEFT);
        } else if (key == Key.RIGHT) {
            playerShip.setDirection(Direction.RIGHT);
        } else if (key == Key.SPACE) {
            Bullet bullet = playerShip.fire();
            if ( bullet != null && playerBullets.size() < PLAYER_BULLETS_MAX) {
                playerBullets.add(bullet);
            }
        }
    }

    @Override
    public void onKeyReleased(Key key) {
        if (key == Key.LEFT && playerShip.getDirection() == Direction.LEFT) {
            playerShip.setDirection(Direction.UP);
        } else if (key == Key.RIGHT && playerShip.getDirection() == Direction.RIGHT){
            playerShip.setDirection(Direction.UP);
        }
    }

    @Override
    public void setCellValueEx(int x, int y, Color cellColor, String value) {
        if (x < 0 || x >= WIDTH || y < 0 || y >= HEIGHT ) {
            return;
        }
        super.setCellValueEx(x, y, cellColor, value);
    }
}