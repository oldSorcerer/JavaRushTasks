package com.javarush.games.racer;

import com.javarush.games.racer.road.RoadManager;

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
        if (x < RoadManager.LEFT_BORDER) {
            x = RoadManager.LEFT_BORDER;
        } else if (x > RoadManager.RIGHT_BORDER - width) {
            x = RoadManager.RIGHT_BORDER - width;
        }
    }

    public void stop() {
        matrix = ShapeMatrix.PLAYER_DEAD;
    }
}
