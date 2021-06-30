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
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(reader.readLine());
        reader.close();

        System.out.println(factorial(input));
        
    }

    public static String factorial(int n) {
        BigDecimal factorial = BigDecimal.valueOf(1);
        if (n < 0) {
            return "0";
        } else if ( n == 0) {
            return "1";
        } else if (n <= 150) {
            for (int i = 0; i < n; i++) {
                factorial = factorial.multiply(BigDecimal.valueOf(i + 1));
            }
        } else {
            return "больше условия в 150";
        }
        return String.valueOf(factorial);
    }
}
