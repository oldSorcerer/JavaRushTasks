package com.javarush.task.jdk13.task41.task4114;

public class Processor {

    private static final String pattern = "%d %s %d = %d\n";

    public void plus(int operand1, int operand2) {
        int result = operand1 + operand2;
        System.out.printf(pattern, operand1, "+", operand2, result);
    }

    public void minus(int operand1, int operand2) {
        int result = operand1 - operand2;
        System.out.printf(pattern, operand1, "-", operand2, result);
    }

    public void multiply(int operand1, int operand2) {
        int result = operand1 * operand2;
        System.out.printf(pattern, operand1, "*", operand2, result);
    }

    public void divide(int operand1, int operand2) {
        int result = operand1 / operand2;
        System.out.printf(pattern, operand1, "/", operand2, result);
    }
}
