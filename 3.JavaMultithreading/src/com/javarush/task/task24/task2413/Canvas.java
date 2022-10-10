package com.javarush.task.task24.task2413;

/**
 * Класс-холст для отрисовки.
 */
public class Canvas {
    //ширина и высота
    private final int width;
    private final int height;
    //матрица, где рисуем. символ - это цвет.
    private char[][] matrix;

    public Canvas(int width, int height) {
        this.width = width;
        this.height = height;
        this.matrix = new char[height + 2][width + 2];
    }
    /**
     * Очищаем холст
     */
    void clear() {
        this.matrix = new char[height + 2][width + 2];
    }
    /**
     * Печатаем переданную фигуру в указанных координатах цветом c.
     * Если переданный массив содержит единицы, то на холсте им будут соответствовать символы - с.
     */
    void drawMatrix(double x, double y, int[][] matrix, char c) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 1)
                    setPoint(x + j, y + i, c);
            }
        }
    }

    /**
     * Ставим одну точку на холсте с координатами (x,y) и цветом - c.
     */
    void setPoint(double x, double y, char c) {
        int roundX = (int) Math.round(x);
        int roundY = (int) Math.round(y);
        if (roundY < 0 || roundY >= matrix.length) return;
        if (roundX < 0 || roundX >= matrix[roundY].length) return;

        matrix[roundY][roundX] = c;
    }
    /**
     * Печатаем содержимое холста на экран.
     */
    void print() {
        System.out.println();

        for (int i = 0; i < height + 2; i++) {
            for (int j = 0; j < width + 2; j++) {
                System.out.print(" ");
                System.out.print(matrix[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();
        System.out.println();
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public char[][] getMatrix() {
        return matrix;
    }
}
