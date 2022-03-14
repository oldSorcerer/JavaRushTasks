package com.javarush.task.jdk13.task35.task3503;

/* 
Несколько суперклассов для дженерика
*/

public class Solution<T> {
    public static void main(String[] args) {
        Solution<TestClassGood> testClassSolution = new Solution<>();
        testClassSolution.check();

        //!!! Следующие оба варианта не должны работать, закомментируй их:
        Solution<TestClassWrong1> wrong1Solution = new Solution<>();
        wrong1Solution.check();

        Solution<TestClassWrong2> wrong2Solution = new Solution<>();
        wrong2Solution.check();
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
