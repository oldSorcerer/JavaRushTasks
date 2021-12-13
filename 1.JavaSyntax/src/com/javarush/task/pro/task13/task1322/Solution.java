package com.javarush.task.pro.task13.task1322;

public class Solution {

    public static void main(String[] args) {
        System.out.println(getShapeNameByCountOfCorners(3));
        System.out.println(getShapeNameByCountOfCorners(5));
        System.out.println(getShapeNameByCountOfCorners(1));
    }

    public static String getShapeNameByCountOfCorners(int countOfCorner) {
        return switch (countOfCorner) {
            case 3 -> "Треугольник";
            case 4 -> "Четырехугольник";
            case 5 -> "Пятиугольник";
            case 6 -> "Шестиугольник";
            case 7 -> "Семиугольник";
            case 8 -> "Восьмиугольник";
            default -> "Другая фигура";
        };
    }
}
