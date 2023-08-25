package com.javarush.task.jdk13.task43.task4305;

/* 
Вернуться к истокам
*/

import org.apache.commons.lang3.StringUtils;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();
        boolean result = helloWorldChecker(choice);
        System.out.println("The result is: " + result);
    }

    public static boolean helloWorldChecker(String s) {
        return StringUtils.containsOnly(s, "Helo Wrd!");
    }
}