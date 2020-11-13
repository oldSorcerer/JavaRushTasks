package com.javarush.games.racer;

public class PlayerCar extends GameObject {

    public int speed = 1;

    private static int playerCarHeight = ShapeMatrix.PLAYER.length;
    private Direction direction;

    public PlayerCar() {
        super(RacerGame.WIDTH / 2 + 2, RacerGame.HEIGHT - playerCarHeight - 1, ShapeMatrix.PLAYER);
    }


    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public Direction getDirection() {
        return direction;
    }

    public void move() {
        if (direction.equals(Direction.LEFT)) {
            x--;
        } else if (direction.equals(Direction.RIGHT)) {
            x++;
        }
    }
}
