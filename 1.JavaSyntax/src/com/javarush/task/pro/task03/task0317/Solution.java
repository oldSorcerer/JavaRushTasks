package com.javarush.task.pro.task03.task0317;

import java.util.Scanner;

/*
Пищевой конвеер
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        int number4 = scanner.nextInt();

        if(number1 > 0){
            System.out.println(number1);
        }
        if(number2 > 0){
            System.out.println(number2);
        }
        if(number3 > 0){
            System.out.println(number3);
        }
        if(number4 > 0){
            System.out.println(number4);
        }

    }
}