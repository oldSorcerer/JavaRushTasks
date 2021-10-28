package com.javarush.task.pro.task07.task0705;

/* 
Бесконечность не предел
*/

public class Solution {
    public static void main(String[] args) {
        double a = 0.0;
        double b = 100.0;
        div(a, b);
        div(a, b * -1);
    }

    public static void div(double a, double b){
        System.out.println(b/a);
    }
}
