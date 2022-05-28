package com.javarush.task.pro.task03.task0312;

import java.util.Scanner;

/* 
Сравним строки
*/

public class Solution {
    public static void main(String[] args) {

        Scanner scanner1 = new Scanner(System.in);

        String string1 = scanner1.nextLine();
        String string2 = scanner1.nextLine();

        if (string1.equals(string2))
            System.out.println("строки одинаковые");
        else
            System.out.println("строки разные");
    }
}
