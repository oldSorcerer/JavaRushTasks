package com.javarush.task.pro.task03.task0318;

import java.util.Scanner;

/*
Био-мясо
*/

public class Solution {
    public static String NOT_YET = "Искусственное мясо еще не готово.";
    public static String DONE = "Искусственное мясо готово.";
    public static String HORRIBLY_DONE = "Искусственное мясо превратилось в мясного монстра!";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = scanner.nextInt();
        int minutes = scanner.nextInt();

        if (minutes == 30 && hour == 0) {
            System.out.println(DONE);
        } else if (minutes < 30 && hour == 0) {
            System.out.println(NOT_YET);
        } else if ((minutes > 30 && hour == 0) || hour >= 1) {
            System.out.println(HORRIBLY_DONE);
        }
    }
}