package com.javarush.task.pro.task05.task0523;

/*
Охота на Кибердракона
*/

public class Solution {
    public static int[] coordinates = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        for (int i = 0; i <coordinates.length; i++) {
            if(coordinates[i] % 2 != 0){
                y = y+ coordinates[i];
            }else{
                x = x+ coordinates[i];
            }
        }
        System.out.println("("+ y +";"+ x + ")");
    }
}