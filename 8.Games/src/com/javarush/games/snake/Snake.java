package com.javarush.games.snake;

import java.util.*;
import com.javarush.engine.cell.*;

public class Snake {

    public boolean isAlive = true;

    private List<GameObject> snakeParts = new ArrayList<>();
    private static final String HEAD_SIGN = "\uD83D\uDC7E";
    private static final String BODY_SIGN = "\u26AB";
    private Direction direction = Direction.LEFT;

    public void setDirection(Direction direction) {
        if (this.direction.equals(Direction.LEFT) && !direction.equals(Direction.RIGHT))
            this.direction = direction;
        else if (this.direction.equals(Direction.RIGHT) && !direction.equals(Direction.LEFT))
             this.direction = direction;
        else if (this.direction.equals(Direction.UP) && !direction.equals(Direction.DOWN))
            this.direction = direction;
        else if ( this.direction.equals(Direction.DOWN) && !direction.equals(Direction.UP))
            this.direction = direction;
    }

    public Snake(int x, int y) {
        GameObject obj1 = new GameObject(x, y);
        GameObject obj2 = new GameObject(x + 1, y);
        GameObject obj3 = new GameObject(x + 2, y);

        snakeParts.add(obj1);
        snakeParts.add(obj2);
        snakeParts.add(obj3);
    }

    public void draw(Game game) {
        Color color = isAlive ? Color.BLACK : Color.RED;
        for (int i = 0; i < snakeParts.size(); i++) {
            String sign = (i == 0) ? HEAD_SIGN : BODY_SIGN;
            game.setCellValueEx(snakeParts.get(i).x, snakeParts.get(i).y, Color.NONE, sign, color, 75);
        }
    }

    public void move(Apple apple) {

        GameObject newHead = createNewHead();

        if (newHead.x < 0 || newHead.x >= SnakeGame.WIDTH || newHead.y < 0 || newHead.y >= SnakeGame.HEIGHT)
            isAlive = false;
        else {
            snakeParts.add(0, newHead);
            if (newHead.x == apple.x && newHead.y == apple.y) {
                apple.isAlive = false;
                return;
            }
            removeTail();
        }
    }

    public GameObject createNewHead() {
        if (direction.equals(Direction.LEFT))
            return new GameObject(snakeParts.get(0).x - 1, snakeParts.get(0).y);
        else if (direction.equals(Direction.RIGHT))
            return new GameObject(snakeParts.get(0).x + 1, snakeParts.get(0).y);
        else if (direction.equals(Direction.DOWN))
            return new GameObject(snakeParts.get(0).x, snakeParts.get(0).y + 1);
        else
            return new GameObject(snakeParts.get(0).x, snakeParts.get(0).y - 1);

    }

    public void removeTail() {
        snakeParts.remove(snakeParts.size() - 1);
    }

    public boolean checkCollision(GameObject gameObject) {
        return false;
    }
}