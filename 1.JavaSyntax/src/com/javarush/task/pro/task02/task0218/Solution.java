package com.javarush.task.pro.task02.task0218;

import java.util.Scanner;

/* 
Ручное управление
*/

public class Solution {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int num1 = key.nextInt();
        int num2 = key.nextInt();
        int num3 = key.nextInt();

        System.out.println(num1 * num2 * num3);
    }
}
