package com.javarush.task.task15.task1531;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

/* 
Факториал
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int input = Integer.parseInt(reader.readLine());
            System.out.println(factorial(input));
        }
    }

    public static String factorial(int n) {
        if (n < 0) {
            return "0";
        }
        BigDecimal result = BigDecimal.ONE;
        for (int i = 1; i <= n ; i++) {
            result = result.multiply(BigDecimal.valueOf(i));
        }

        return result.toString();
    }
}