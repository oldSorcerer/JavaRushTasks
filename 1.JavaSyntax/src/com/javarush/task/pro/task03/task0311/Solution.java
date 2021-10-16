package com.javarush.task.pro.task03.task0311;

import java.util.Scanner;

/* 
Высокая точность
*/

public class Solution {
    public static void main(String[] args) {

        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);

        double number1 = scanner1.nextDouble();
        double number2 = scanner2.nextDouble();

        if (Math.abs(number2 - number1) < 0.000001)
            System.out.println("числа равны");
        else
            System.out.println("числа не равны");
    }
}
