package com.javarush.task.pro.task04.task0414;

import java.util.Scanner;

/* 
Хорошего не бывает много
*/

public class Solution {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        String string = console.nextLine();
        int number = console.nextInt();

        if (number > 0 && number < 5 ) {
            int i = 0;
            do {
                System.out.println(string);
                i++;
            } while (i < number);
        } else {
            System.out.println(string);
        }
    }
}