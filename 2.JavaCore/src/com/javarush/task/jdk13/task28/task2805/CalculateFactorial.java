package com.javarush.task.jdk13.task28.task2805;

public class CalculateFactorial {

    public static Long calculate(Long number) {
        long result = 1L;
        while (number > 1) {
            result *= number;
            number--;
        }
        return result;
    }
}
