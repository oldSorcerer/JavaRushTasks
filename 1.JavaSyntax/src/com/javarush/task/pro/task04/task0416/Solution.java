package com.javarush.task.pro.task04.task0416;

import java.util.Scanner;

/* 
Share a Coke
*/

public class Solution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int countCola = sc.nextInt();
        int countPiople = sc.nextInt();

        double number = countCola / (countPiople * 1.0);

        System.out.println(number);

    }
}