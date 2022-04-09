package com.javarush.task.jdk13.task23.task2301;

/* 
Inner
*/

public class Solution {
    public InnerClass[] innerClasses = new InnerClass[2];

    public static void main(String[] args) {

    }

    public static Solution[] getTwoSolutions() {

        Solution solution0 = new Solution();
        Solution solution1 = new Solution();
        Solution [] solutions = {solution0, solution1};

        solution0.innerClasses[0] = new InnerClass();
        solution0.innerClasses[1] = new InnerClass();

        solution1.innerClasses[0] = new InnerClass();
        solution1.innerClasses[1] = new InnerClass();

        return solutions;
    }

    public static class InnerClass {
    }
}
