package com.javarush.task.jdk13.task54.task5405;

import java.util.Date;

/* 
Бинарный поиск 1
*/

public class Solution {

    public static void main(String[] args) {
        runMeasurements(new int[]{11, 12, 13, 14, 15, 16, 17, 18, 20});
        runMeasurements(getBigArray(1_000_000_000, 249_999_998));
    }

    public static int findMissingNumberUsingBinarySearch(int[] nums) {
        //напишите тут ваш код

        return 0;
    }

    public static int findMissingNumberUsingIterate(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1] + 1) {
                return nums[i - 1] + 1;
            }
        }
        throw new RuntimeException("Входной массив - некорректен.");
    }

    public static void runMeasurements(int[] nums) {
        long startTime = new Date().getTime();
        int binarySearchResult = findMissingNumberUsingBinarySearch(nums);
        long stopTime = new Date().getTime();
        long binarySearchTime = stopTime - startTime;

        startTime = new Date().getTime();
        int iterateResult = findMissingNumberUsingIterate(nums);
        stopTime = new Date().getTime();
        long iterateTime = stopTime - startTime;

        System.out.printf("""
                        Массив на %d элементов.
                        Методы вернули %s результат.
                        Обычный перебор отработал за %d милисекунд.
                        Бинарный поиск отработал за %d милисекунд.
                        ------------------------------------------
                        """,
                nums.length,
                binarySearchResult == iterateResult ? "одинаковый" : "разный",
                iterateTime,
                binarySearchTime);
    }

    public static int[] getBigArray(int length, int missingPosition) {
        int[] result = new int[length];
        for (int i = 1; i < missingPosition; i++) {
            result[i] = i;
        }
        for (int i = missingPosition; i < length; i++) {
            result[i] = i + 1;
        }
        return result;
    }
}
