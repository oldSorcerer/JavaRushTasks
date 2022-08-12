package com.javarush.task.jdk13.task43.task4301;

/* 
Сравни кандидатов
*/

public class Solution {

    public static void main(String[] args) {
        Candidate candidate1 = new Candidate("John", 38, "male", 185, 81, 15);
        Candidate candidate2 = new Candidate("Omar", 44, "male", 175, 75, 15);

        System.out.println(candidate1.equals(candidate2));
    }
}
