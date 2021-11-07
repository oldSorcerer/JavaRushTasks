package com.javarush.games.snake;

import java.util.*;
import com.javarush.engine.cell.*;

public class Snake {

    private static final String HEAD_SIGN = "\uD83D\uDC7E";
    private static final String BODY_SIGN = "\u26AB";

    public boolean isAlive = true;

    private List<GameObject> snakeParts = new ArrayList<>();
    private Direction direction = Direction.LEFT;

    public Snake(int x, int y) {
        snakeParts.add(new GameObject(x, y));
        snakeParts.add(new GameObject(x + 1, y));
        snakeParts.add(new GameObject(x + 2, y));
    }

    public void setDirection(Direction direction) {

        boolean flagX =  snakeParts.get(0).x == snakeParts.get(1).x;
        boolean flagY =  snakeParts.get(0).y == snakeParts.get(1).y;

        if ( (this.direction == Direction.LEFT || this.direction == Direction.RIGHT ) && flagX)
            return;
        if ( (this.direction == Direction.UP || this.direction == Direction.DOWN) && flagY )
            return;

        if (this.direction.equals(Direction.LEFT) && direction.equals(Direction.RIGHT))
            return;
        else if (this.direction.equals(Direction.RIGHT) && direction.equals(Direction.LEFT))
             return;
        else if (this.direction.equals(Direction.UP) && direction.equals(Direction.DOWN))
            return;
        else if ( this.direction.equals(Direction.DOWN) && direction.equals(Direction.UP))
            return;

        this.direction = direction;
    }

    public void draw(Game game) {
        Color color = isAlive ? Color.BLACK : Color.RED;
        for (int i = 0; i < snakeParts.size(); i++) {
            GameObject part = snakeParts.get(i);
            String sign = (i == 0) ? HEAD_SIGN : BODY_SIGN;
            game.setCellValueEx(part.x, part.y, Color.NONE, sign, color, 75);
        }
    }

    public void move(Apple apple) {
        GameObject newHead = createNewHead();
        if (newHead.x < 0 || newHead.x >= SnakeGame.WIDTH ||
                newHead.y < 0 || newHead.y >= SnakeGame.HEIGHT) {
            isAlive = false;
            return;
        }
        if (checkCollision(newHead)) {
            isAlive = false;
            return;
        }
        snakeParts.add(0, newHead);
        if (newHead.x == apple.x && newHead.y == apple.y) {
            apple.isAlive = false;
        } else {
            removeTail();
        }
    }

    public GameObject createNewHead() {
        GameObject oldHead = snakeParts.get(0);
        if (direction.equals(Direction.LEFT))
            return new GameObject(oldHead.x - 1, oldHead.y);
        else if (direction.equals(Direction.RIGHT))
            return new GameObject(oldHead.x + 1, oldHead.y);
        else if (direction.equals(Direction.DOWN))
            return new GameObject(oldHead.x, oldHead.y + 1);
        else
            return new GameObject(oldHead.x, oldHead.y - 1);
    }

    public void removeTail() {
        snakeParts.remove(snakeParts.size() - 1);
    }

    public boolean checkCollision(GameObject gameObject) {
        for (GameObject snakePart : snakeParts)  {
            if (gameObject.x == snakePart.x && gameObject.y == snakePart.y)
                return true;
        }
        return false;
    }

    public int getLength() {
        return snakeParts.size();
    }
}