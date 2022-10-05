package com.javarush.task.task24.task2413;

/**
 * Подставка, с помощью которой отражаем мячик.
 */
public class Stand extends BaseObject {
    //картинка для отрисовки
    private static int[][] matrix = {
            {1, 1, 1, 1, 1},
            {1, 0, 0, 0, 1},
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},
    };

    //скорость
    private double speed = 1;
    //направление (-1 влево, +1 вправо)
    private double direction = 0;

    public Stand(double x, double y) {
        super(x, y, 3);
    }

    /**
     * Метод передвигает подставку в соответствии с текущим значением direction.
     */
    void move() {
        double dx = speed * direction;
        x = x + dx;

        checkBorders(radius, Arkanoid.game.getWidth() - radius + 1, 1, Arkanoid.game.getHeight() + 1);
    }

    /**
     * direction устанавливается равным -1
     */
    void moveLeft() {
        direction = -1;
    }

    /**
     * direction устанавливается равным +1
     */
    void moveRight() {
        direction = 1;
    }

    public double getSpeed() {
        return speed;
    }

    public double getDirection() {
        return direction;
    }

    /**
     * Отрисовываем себя на холсте
     */
    @Override
    void draw(Canvas canvas) {
        canvas.drawMatrix(x - radius + 1, y, matrix, 'M');
    }
}
