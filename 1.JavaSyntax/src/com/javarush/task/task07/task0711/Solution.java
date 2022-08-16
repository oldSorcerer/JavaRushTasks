package com.javarush.task.task07.task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Удалить и вставить
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        List<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++) {
            list.add(reader.readLine());
        }

        for (int i = 0; i < 13; i++) {
            String swap = list.get(4);
            for (int y = 4; y > 0; y--) {
                list.set(y, list.get(y - 1));

            }
            list.set(0, swap);
        }

        for (int q = 0; q < 5; q++) {
            System.out.println(list.get(q));
        }
    }
}