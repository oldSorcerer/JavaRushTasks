package com.javarush.task.pro.task04.task0416;

import java.util.Scanner;

/* 
Share a Coke
*/

public class Solution {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int countCola = scanner.nextInt();
        int countHuman = scanner.nextInt();

        System.out.println(countCola / (countHuman * 1.0));
    }
}