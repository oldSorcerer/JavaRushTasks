package com.javarush.games.racer.road;

import com.javarush.games.racer.GameObject;
import com.javarush.games.racer.ShapeMatrix;

public class RoadObject extends GameObject {
    public RoadObjectType type;
    public int speed;

    public RoadObject(RoadObjectType type, int x, int y) {
        super(x, y);
        this.type = type;
        this.matrix = getMatrix(type);
        this.width = matrix[0].length;
        this.height = matrix.length;
    }

    /**
     * Метод, отвечающий за передвижение препятствия. У препятствия может быть своя скорость и дополнительная,
     * которая зависит от скорости движения игрока.
     */
    public void move(int boost) {
        this.y += boost;
    }

    /**
     * Проверяет текущий объект и объект, который пришел в качестве параметра, на пересечение их изображений
     * с учетом дистанции distance.
     * Например, если в качестве distance передать число 12, а 2 объекта расположены друг от друга на расстоянии меньшем,
     * чем 12 ячеек игрового поля, метод вернет true. В ином случае вернет false.
     */
    public boolean isCollisionWithDistance(RoadObject roadObject, int distance) {
        if ((x - distance > roadObject.x + roadObject.width) || (x + width + distance < roadObject.x)) {
            return false;
        }

        if ((y - distance > roadObject.y + roadObject.height) || (y + height + distance < roadObject.y)) {
            return false;
        }

        return true;
    }

    /**
     * Возвращает матрицу изображения объекта в зависимости от его типа.
     */
    private static int[][] getMatrix(RoadObjectType type) {
        switch (type) {
            case CAR:
                return ShapeMatrix.PASSENGER_CAR;
            case BUS:
                return ShapeMatrix.BUS;
            case SPORT_CAR:
                return ShapeMatrix.SPORT_CAR;
            case THORN:
                return ShapeMatrix.THORN;
            case DRUNK_CAR:
                return ShapeMatrix.DRUNK_CAR;
            default:
                return ShapeMatrix.TRUCK;
        }
    }

    /**
     * Возвращает высоту объекта.
     */
    public static int getHeight(RoadObjectType type) {
        return getMatrix(type).length;
    }
}