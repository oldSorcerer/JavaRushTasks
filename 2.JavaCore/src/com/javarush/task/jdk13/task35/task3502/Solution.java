package com.javarush.task.jdk13.task35.task3502;

import java.util.List;

/* 
Знакомство с дженериками
*/

public class Solution <T extends List<Solution.SomeClass<?>>> {
    public static void main(String[] args) {

    }

    public static class SomeClass <T extends Number> {
    }
}
