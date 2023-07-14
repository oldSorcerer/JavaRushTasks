package com.javarush.task.task34.task3410.model;

public abstract class CollisionObject extends GameObject {

    public CollisionObject(int x, int y) {
        super(x, y);
    }

    public boolean isCollision(GameObject gameObject, Direction direction) {
        boolean b = this.getX() + Model.FIELD_CELL_SIZE == gameObject.getX()
                && getY() == gameObject.getY();

        direction = Direction.DOWN;
        return false;

    }
}
