package com.javarush.task.pro.task05.task0529;

/*
Галаксианские роботанки (1)
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

        for (int i = 0; i < field.length; i++) {
            Arrays.fill(field[i], empty);
        }

        for (int i = 0; i < 10 ; i++) {
            int j = (int) (Math.random() * width);
            field[i][j] = robotank;
        }


        for (int i = 0; i < 10; i++) {

            int j = (int) (Math.random() * width);
            bombs[i][j] = 1;
        }

        int countsRobotank = 10;

        while (countsRobotank > 0) {

            for (int i = 0; i < bombs.length; i++) {
                for (int j = 1; j < 10; j++) {
                    int k = (int) (Math.random() * width);
                    if (bombs[i][k] == 1) {
                        j--;
                    } else {
                        bombs[i][k] = 1;
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

        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                System.out.print(field[i][j]);
            }
            System.out.println();
        }

    }
}
