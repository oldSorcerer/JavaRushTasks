package com.javarush.games.racer.road;

import java.util.List;

public class MovingCar extends RoadObject {
    private int dx = 0;

    public MovingCar(int x, int y) {
        super(RoadObjectType.DRUNK_CAR, x, y);
        speed = 1;
    }

    @Override
    public void move(int boost, List<RoadObject> roadObjects) {
        y += boost;
        x += dx;

        if (y > 0 && dx == 0) {
            dx = 1;
        }

        if (x < RoadManager.LEFT_BORDER + 1) {
            dx = 1;
        }

        if (x + width > RoadManager.RIGHT_BORDER - 1) {
            dx = -1;
        }

        if (checkRoadHit(roadObjects)) {
            dx = -dx;
        }
    }

    private boolean checkRoadHit(List<RoadObject> items) {
        for (RoadObject item : items) {
            if (item == this || item.type == RoadObjectType.THORN) {
                continue;
            }
            if (item.isCollisionPossible(this)) {
                return true;
            }
        }
        return false;
    }
}