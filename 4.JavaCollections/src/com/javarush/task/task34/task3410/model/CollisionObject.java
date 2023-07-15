package com.javarush.task.task34.task3410.model;

public abstract class CollisionObject extends GameObject {

    public CollisionObject(int x, int y) {
        super(x, y);
    }

    public boolean isCollision(GameObject gameObject, Direction direction) {
        switch (direction) {
            case LEFT:
                return getX() - Model.FIELD_CELL_SIZE == gameObject.getX() && getY() == gameObject.getY();
            case RIGHT:
                return getX() + Model.FIELD_CELL_SIZE == gameObject.getX() && getY() == gameObject.getY();
            case UP:
                return getX() == gameObject.getX() && getY() - Model.FIELD_CELL_SIZE == gameObject.getY();
            case DOWN:
                return getX() == gameObject.getX() && getY() + Model.FIELD_CELL_SIZE == gameObject.getY();
        }
        return false;
    }
}
