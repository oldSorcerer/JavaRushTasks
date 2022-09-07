package com.javarush.task.pro.task08.task0824;

import java.util.Random;

public class Diego {
    public int hashSum;

    {
        Random random = new Random();
        for (int i = 0; i < 9; i++) {
            hashSum += random.nextInt(10) * Math.pow(10, i);
        }
    }
}
