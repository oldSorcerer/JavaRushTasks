package com.javarush.task.task22.task2213;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Класс Field описывает "поле клеток" игры Тетрис
 */
public class Field {
    //ширина и высота
    private final int width;
    private final int height;

    //матрица поля: 1 - клетка занята, 0 - свободна
    private int[][] matrix;

    public Field(int width, int height) {
        this.width = width;
        this.height = height;
        matrix = new int[height][width];
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int[][] getMatrix() {
        return matrix;
    }

    /**
     * Метод возвращает значение, которое содержится в матрице с координатами (x,y)
     * Если координаты за пределами матрицы, метод возвращает null.
     */
    public Integer getValue(int x, int y) {
        if (x >= 0 && x < width && y >= 0 && y < height)
            return matrix[y][x];

        return null;
    }

    /**
     * Метод устанавливает переданное значение(value) в ячейку матрицы с координатами (x,y)
     */
    public void setValue(int x, int y, int value) {
        if (x >= 0 && x < width && y >= 0 && y < height)
            matrix[y][x] = value;
    }

    /**
     * Метод печатает на экран текущее содержание матрицы
     */
    public void print() {
        //Создаем массив, куда будем "рисовать" текущее состояние игры
        int[][] canvas = new int[height][width];

        //Копируем "матрицу поля" в массив
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                canvas[i][j] = matrix[i][j];
            }
        }

        //Копируем фигурку в массив, только непустые клетки
        int left = Tetris.game.getFigure().getX();
        int top = Tetris.game.getFigure().getY();
        int[][] brickMatrix = Tetris.game.getFigure().getMatrix();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (top + i >= height || left + j >= width) continue;
                if (brickMatrix[i][j] == 1)
                    canvas[top + i][left + j] = 2;
            }
        }

        //Выводим "нарисованное" на экран, но начинаем с "границы кадра".
        System.out.println("---------------------------------------------------------------------------\n");

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                int index = canvas[i][j];
                if (index == 0)
                    System.out.print(" . ");
                else if (index == 1)
                    System.out.print(" X ");
                else if (index == 2)
                    System.out.print(" X ");
                else
                    System.out.print("???");
            }
            System.out.println();
        }


        System.out.println();
        System.out.println();
    }

    /**
     * Удаляем заполненные линии
     */
    public void removeFullLines() {
        //Создаем список для хранения линий
        List<int[]> list = new ArrayList<>();
        //Копируем все неполные линии в список.
        int count = 0;
        for (int[] line : matrix) {
            for (int i = 0; i < line.length; i++) {
                if (line[i] == 0) {
                    list.add(line);
                    count++;
                    break;
                }
            }
        }
        //Добавляем недостающие строки в начало списка.
        for (int i = 0; i < height - count; i++) {
            list.add(0, new int[width]);
        }
        //Преобразуем список обратно в матрицу
        matrix = list.toArray(new int[height][width]);

//        int[][] newMatrix = new int[height][];
//        for (int i = 0; i < newMatrix.length; i++) {
//            newMatrix[i] = list.get(i);
//        }
//        matrix = newMatrix;

    }

//    public static void main(String[] args) {
//        Field field = new Field(5, 5);
//        field.matrix = new int[][]{
//                {0, 0, 0, 0, 0},
//                {0, 0, 0, 0, 0},
//                {0, 0, 1, 0, 0},
//                {1, 1, 1, 1, 1},
//                {0, 0, 0, 1, 0},
//        };
//        field.removeFullLines();
//        for (int i = 0; i < field.matrix.length; i++) {
//            for (int j = 0; j < field.matrix[i].length; j++) {
//                System.out.print(field.matrix[i][j]);
//            }
//            System.out.println();
//        }
//
//    }
}
