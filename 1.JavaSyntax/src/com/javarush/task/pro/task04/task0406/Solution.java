package com.javarush.task.pro.task04.task0406;

import java.util.Scanner;

/* 
Показываем, что получаем
*/

public class Solution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            String string = sc.nextLine();
            if (string.equals("enough")) {
                break;
            }
            System.out.println(string);
        }

    }
}