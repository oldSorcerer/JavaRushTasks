package com.javarush.games.spaceinvaders;

import com.javarush.engine.cell.*;

import com.javarush.games.spaceinvaders.gameobjects.*;

import java.util.ArrayList;
import java.util.List;

public class SpaceInvadersGame extends Game {
    
    public static final int WIDTH = 64;
    public static final int HEIGHT = 64;
    public static final int COMPLEXITY = 5;

    private List<Star> stars;
    private List<Bullet> enemyBullets;

    private EnemyFleet enemyFleet;

    private void createGame() {
        enemyBullets = new ArrayList<>();
        enemyFleet = new EnemyFleet();
        createStars();
        drawScene();
        setTurnTimer(40);
    }
    
    private void drawScene() {
        drawField();
        for (Bullet bullet : enemyBullets) {
            bullet.draw(this);
        }
        enemyFleet.draw(this);
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
            stars.add(new Star(i + 5.5, i + 4.5));
        }
    }

    private void moveSpaceObjects() {
        enemyFleet.move();
        for (Bullet bullet : enemyBullets) {
            bullet.move();
        }
    }

    private void removeDeadBullets() {
        List<Bullet> bulletsCopy = new ArrayList<>(enemyBullets);
        for (Bullet bullet : bulletsCopy) {
            if (!bullet.isAlive || bullet.y >= HEIGHT - 1) {
                enemyBullets.remove(bullet);
            }
        }
    }

    private void check() {
        removeDeadBullets();
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
        drawScene();
    }
}