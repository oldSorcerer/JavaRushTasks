package com.javarush.task.task35.task3503;

/* 
Несколько суперклассов для дженерика
*/

public class Solution<T extends ClassForGenerics & InterfaceForGenerics> {
    public static void main(String[] args) {
        Solution<TestClassGood> testClassSolution = new Solution<>();
        testClassSolution.check();
    }

    public void check() {
        System.out.println("Works!");
    }

    public static class TestClassGood extends ClassForGenerics implements InterfaceForGenerics {

    }

    public static class TestClassWrong1 extends ClassForGenerics {

    }

    public static class TestClassWrong2 implements InterfaceForGenerics {

    }

}
