package com.javarush.task.task14.task1420;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
НОД
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int num1 = Integer.parseInt(reader.readLine());
            int num2 = Integer.parseInt(reader.readLine());

            for (int i = Math.min(num1, num2); i > 0; i--) {
                if (num1 % i == 0 && num2 % i == 0 ) {
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}
