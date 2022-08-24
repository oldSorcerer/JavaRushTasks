package com.javarush.task.jdk13.task20.task2004;

import java.io.Serializable;

/* 
Как сериализовать static?
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static class ClassWithStatic implements Serializable {
        public static String staticString = "This is a static test string";
        public int i;
        public int j;
    }
}
