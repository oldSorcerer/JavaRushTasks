package com.javarush.task.pro.task05.task0529;

/*
Галаксианские роботанки (5)
*/

import java.util.Arrays;

public class Solution {
    public static String robotank = "☖";
    public static String empty = "_";
    public static String hit = "🎯";
    public static int width = 30;
    public static int height= 10;
    public static String[][] field = new String[height][width];
    public static int[][] bombs = new int[height][width];

    public static void main(String[] args) {

        for (String[] value : field) {
            Arrays.fill(value, empty);
        }

        for (int i = 0; i < field.length ; i++) {
            int j = (int) (Math.random() * width);
            field[i][j] = robotank;
        }

        int countsRobotank = 10;
        while (countsRobotank > 0) {
            bombs = new int[height][width];
            for (int i = 0; i < bombs.length; i++) {
                for (int count = 0; count < 10; ) {
                    int j = (int) (Math.random() * width);
                    if (bombs[i][j] == 0) {
                        bombs[i][j] = 1;
                        count++;
                    }
                }
            }
            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++) {
                    if (field[i][j].equalsIgnoreCase(robotank) && bombs[i][j] == 1) {
                        field[i][j] = hit;
                        countsRobotank--;
                    }
                }
            }
        }

        for (String[] strings : field) {
            for (String string : strings) {
                System.out.print(string);
            }
            System.out.println();
        }
    }
}
