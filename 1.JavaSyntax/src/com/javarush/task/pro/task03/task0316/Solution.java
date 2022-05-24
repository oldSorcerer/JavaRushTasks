package com.javarush.task.pro.task03.task0316;

import java.util.Scanner;

/*
Орбитальный лифт
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int speed = scanner.nextInt();

        if (speed < 0) {
            System.out.println("System error!");
        }else if (speed > 3) {
            System.out.println("Скорость лифта слишком высокая, снижаем...");
        } else {
            System.out.println("Скорость лифта в норме");
        }
    }
}