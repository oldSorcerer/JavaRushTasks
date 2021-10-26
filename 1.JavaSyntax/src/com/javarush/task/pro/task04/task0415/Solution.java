package com.javarush.task.pro.task04.task0415;

import java.util.Scanner;

/* 
Площадь круга
*/

public class Solution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int rad = sc.nextInt();

        if ( rad >= 0) {
            System.out.println((int)(3.14 * rad * rad));
        }

    }
}