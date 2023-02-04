package com.javarush.task.pro.task04.task0415;

import java.util.Scanner;

/* 
Площадь круга
*/

public class Solution {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int radius = scanner.nextInt();

        if ( radius >= 0) {
            System.out.println((int)(3.14 * radius * radius));
        }
    }
}