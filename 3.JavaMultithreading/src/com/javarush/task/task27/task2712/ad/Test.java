package com.javarush.task.task27.task2712.ad;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static List<Integer> durations = new ArrayList<>(Arrays.asList(3, 4, 5, 8, 9));

    public static List<Long> prices = new ArrayList<>(Arrays.asList(1L, 6L, 4L, 7L, 6L));

    static int timeSeconds = 13;

    public static void main(String[] args) {

        int count = durations.size();
        int maxDuration = 13;

        long[][] A = allOptions();

        List<Integer> optimalList = new ArrayList<>();
        optimalList(A, durations, count, maxDuration, optimalList);

        for (Integer integer : optimalList) {
            System.out.println(integer);
        }
    }

    public static long[][] allOptions() {

        long[][] A = new long[durations.size() + 1][timeSeconds + 1];

        for (int k = 0; k <= durations.size(); k++) {
            for (int s = 0; s <= timeSeconds; s++) {
                if (k == 0 || s == 0) A[k][s] = 0;
                else {
                    if (s >= durations.get(k - 1)) {
                        A[k][s] = Math.max(A[k - 1][s], A[k - 1][s - durations.get(k - 1)] + prices.get(k - 1));
                    } else A[k][s] = A[k - 1][s];
                }
            }
        }
        return A;
    }

    private static void optimalList(long[][] A, List<Integer> durations, int k, int s, List<Integer> result) {
        if (A[k][s] == 0) return;
        if (A[k - 1][s] == A[k][s])
            optimalList(A, durations, k - 1, s, result);
        else {
            optimalList(A, durations, k - 1, s - durations.get(k - 1), result);
            result.add(0, k);
        }
    }
}

