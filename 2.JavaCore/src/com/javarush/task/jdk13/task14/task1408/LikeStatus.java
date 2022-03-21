package com.javarush.task.jdk13.task14.task1408;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public enum LikeStatus {
    UNKNOWN,

    LIKE,
    HOT,
    FOLLOW,
    FAVORITE,
    SOLUTION,
    HELPFUL,
    ARTICLE,
    OSCAR,

    DISLIKE,
    WRONG,
    SPAM,
    OFFTOPIC,
    DUPLICATE,
    AWFUL;

    public static List<LikeStatus> generateMassActivity() {
        List<LikeStatus> result = new ArrayList<>();
        Random random = new Random();
        int size = random.nextInt(100_000) + 100;
        int statusesNumber = LikeStatus.values().length;
        for (int i = 0; i < size; i++) {
            LikeStatus next = LikeStatus.values()[random.nextInt(statusesNumber)];
            result.add(next);
        }

        return result;
    }
}
