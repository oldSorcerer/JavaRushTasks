package com.javarush.task.task30.task3010;

import java.math.BigDecimal;
import java.math.BigInteger;

/* 
Минимальное допустимое основание системы счисления
*/

public class Solution {
    public static void main(String[] args) {
        String result = "";
        for (int i = 2; i < 37; i++) {
            try {
                new BigDecimal(new BigInteger(args[0], i));
                result = String.valueOf(i);
                break;
            } catch (Exception e) {
                result = "incorrect";
            }
        }
        System.out.println(result);
    }
}