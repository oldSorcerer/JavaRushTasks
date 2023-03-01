package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] byteCountArray = new int[256];

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileInputStream inputStream = new FileInputStream(reader.readLine())
        ) {
            while (inputStream.available() > 0) {
                byteCountArray[inputStream.read()]++;
            }
        }
        int maxCount = 0;
        for (int byteCount : byteCountArray) {
            if (byteCount > maxCount) {
                maxCount = byteCount;
            }
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < byteCountArray.length; i++) {
            if (byteCountArray[i] == maxCount) {
                list.add(i);
            }
        }
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }

//        IntStream.range(0, byteCountArray.length)
//                .filter(i -> byteCountArray[i] == Arrays.stream(byteCountArray).max().getAsInt())
//                .boxed()
//                .toList()
//                .forEach(integer -> System.out.print(integer + " "));
    }
}
