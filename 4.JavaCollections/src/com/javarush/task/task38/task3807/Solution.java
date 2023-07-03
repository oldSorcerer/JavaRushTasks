package com.javarush.task.task38.task3807;

/* 
Предопределенные типы аннотаций (Predefined Annotation Types)
*/

public class Solution {

    private String[] arguments;

    public Solution(String... arguments) {
        this.arguments = arguments;
    }

    public void voidMethod() throws Exception {
    }

    public static void main(String[] args) throws Exception {
        new Solution().new SubSolution().voidMethod();
    }

    class SubSolution extends Solution {

        public void voidMethod() throws Exception {
            super.voidMethod();
        }
    }
}
