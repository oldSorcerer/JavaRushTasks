package com.javarush.task.jdk13.task54.task5407;

import java.util.Arrays;
import java.util.Date;
import java.util.Random;

/* 
Бинарный поиск 2
*/

public class Solution {

    public static void main(String[] args) {
        runMeasurements(new int[]{1, 2, 2, 2, 3, 4, 5, 5, 5}, new int[]{2, 4, 5, 6});
        runMeasurements(getBigArray(1_000_000), getBigArray(10_000));
    }

    public static int[] countOccurrencesUsingIterate(int[] array, int[] queries) {
        int[] result = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int count = 0;
            for (int k : array) {
                if (k == queries[i]) {
                    count++;
                }
            }
            result[i] = count;
        }

        return result;
    }

    public static int[] countOccurrencesUsingBinarySearch(int[] array, int[] queries) {
        //напишите тут ваш код

        return null;
    }

    public static void runMeasurements(int[] array, int[] queries) {
        long startTime = new Date().getTime();
        int[] binarySearchResult = countOccurrencesUsingBinarySearch(array, queries);
        long stopTime = new Date().getTime();
        long binarySearchTime = stopTime - startTime;

        startTime = new Date().getTime();
        int[] iterateResult = countOccurrencesUsingIterate(array, queries);
        stopTime = new Date().getTime();
        long iterateTime = stopTime - startTime;

        System.out.printf("""
                        Массив на %d элементов.
                        Методы вернули %s результат.
                        Обычный перебор отработал за %d милисекунд.
                        Бинарный поиск отработал за %d милисекунд.
                        ------------------------------------------
                        """,
                array.length,
                Arrays.equals(binarySearchResult, iterateResult) ? "одинаковый" : "разный",
                iterateTime,
                binarySearchTime);
    }

    public static int[] getBigArray(int length) {
        Random random = new Random();
        int[] result = new int[length];
        for (int i = 1; i < length; i++) {
            result[i] = random.nextInt(1_000_000_000);
        }

        Arrays.sort(result);
        return result;
    }
}
