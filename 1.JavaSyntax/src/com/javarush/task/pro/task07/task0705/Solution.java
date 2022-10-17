package com.javarush.task.pro.task07.task0705;

/* 
Бесконечность не предел
*/

public class Solution {
    public static void main(String[] args) {
        div(0, 15);
        div(0, -15);
    }

    public static void div(double a, double b){
        System.out.println(b/a);
    }
}
