package com.javarush.task.task10.task1011;

/* 
Большая зарплата
*/

public class Solution {
    public static void main(String[] args) {
        String s = "Я не хочу изучать Java, я хочу большую зарплату";
        int length = s.length();
        int i = 0, j = 40;
        while (length > 0 && j > 0) {
            System.out.println(s.substring(i));
            i++;
            j--;
            length--;
        }
    }
}