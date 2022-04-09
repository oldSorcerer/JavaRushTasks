package com.javarush.task.jdk13.task23.task2302;

/* 
Как выбрать нужное?
*/

public class Solution {
    public static final String TEST = "test";
    static Object obj;

    public static void main(String[] args) {
        obj = new Solution.TEST();
        System.out.println(obj);
    }

    public static class TEST {
        @Override
        public String toString() {
            return "test class";
        }
    }
}
