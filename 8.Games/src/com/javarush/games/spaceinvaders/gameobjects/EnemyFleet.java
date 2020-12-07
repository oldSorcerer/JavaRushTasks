package com.javarush.games.spaceinvaders.gameobjects;

import com.javarush.engine.cell.Game;
import com.javarush.games.spaceinvaders.Direction;
import com.javarush.games.spaceinvaders.ShapeMatrix;
import com.javarush.games.spaceinvaders.SpaceInvadersGame;

import java.util.ArrayList;
import java.util.List;

public class EnemyFleet {

    private static final int ROWS_COUNT = 3;
    private static final int COLUMNS_COUNT = 10;
    private static final int STEP = ShapeMatrix.ENEMY.length + 1;
    private List<EnemyShip> ships;
    private Direction direction = Direction.RIGHT;

    public EnemyFleet() {
        createShips();
    }

    private void createShips() {

        ships = new ArrayList<>();
        for (int x = 0; x < COLUMNS_COUNT; x++) {
            for (int y = 0; y < ROWS_COUNT; y++) {
                ships.add(new EnemyShip(x * STEP, y * STEP + 12));
            }
        }
        ships.add(new Boss(STEP * COLUMNS_COUNT / 2
                - ShapeMatrix.BOSS_ANIMATION_FIRST.length / 2 - 1, 5));
    }

    public void draw(Game game) {
        for (EnemyShip ship : ships) {
            ship.draw(game);
        }
    }

    private double getLeftBorder() {
        double min = ships.get(0).x;

        for (EnemyShip ship : ships) {
            if (ship.x < min) {
                min = ship.x;
            }
        }
        return min;
    }

    private double getRightBorder() {
        double max = ships.get(0).x + ships.get(0).width;

        for (EnemyShip ship : ships) {
            if (ship.x + ship.width > max) {
                max = ship.x + ship.width;
            }
        }
        return max;
    }

    private double getSpeed() {
        return Math.min(2.0, 3.0 /ships.size());
    }

    public void move() {
        boolean flagDirection = false;
        if (ships.isEmpty()) {
            return;
        }
        if (direction == Direction.LEFT && getLeftBorder() < 0) {
            direction = Direction.RIGHT;
            flagDirection = true;
        } else if (direction == Direction.RIGHT && getRightBorder() > SpaceInvadersGame.WIDTH) {
            direction = Direction.LEFT;
            flagDirection = true;
        }
        if (flagDirection) {
            for (EnemyShip ship : ships) {
                ship.move(Direction.DOWN, getSpeed());
            }
        } else {
            for (EnemyShip ship : ships) {
                ship.move(direction, getSpeed());
            }
        }


    }

    public Bullet fire(Game game) {
        if (ships.isEmpty()) {
            return null;
        }
        if (game.getRandomNumber(100 / SpaceInvadersGame.COMPLEXITY) > 0) {
            return null;
        }

        int index = game.getRandomNumber(ships.size());

        return ships.get(index).fire();
    }

    public int verifyHit(List<Bullet> bullets) {
        if (bullets.isEmpty()) {
            return 0;
        }
        int summScore = 0;
        for (EnemyShip enemyShip : ships) {
            for (Bullet bullet : bullets) {
                boolean flag = enemyShip.isCollision(bullet);
                if (flag && enemyShip.isAlive && bullet.isAlive) {
                    enemyShip.kill();
                    bullet.kill();
                    summScore += enemyShip.score;
                }
            }
        }
        return summScore;
    }

    public void deleteHiddenShips() {
        List<EnemyShip> enemyShipsCopy = new ArrayList<>(ships);
        for (EnemyShip enemyShip : enemyShipsCopy) {
            if (!enemyShip.isVisible()) {
                ships.remove(enemyShip);
            }
        }
    }

    public double getBottomBorder() {
        double bottom = 0;
        for (EnemyShip ship : ships) {
            bottom = Math.max(bottom, ship.y + ship.height);
        }
        return bottom;
    }

    public int getShipsCount() {
        return ships.size();
    }

}
