package com.javarush.task.pro.task04.task0414;

import java.util.Scanner;

/* 
Хорошего не бывает много
*/

public class Solution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        int number = sc.nextInt();

        if (number > 0 && number < 5 ) {
            int i = 0;
            do {
                System.out.println(string);
                i++;
            } while (i < number);
        } else
            System.out.println(string);
    }
}