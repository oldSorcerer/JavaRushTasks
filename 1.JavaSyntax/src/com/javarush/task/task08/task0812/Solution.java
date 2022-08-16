package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }
        int a = 1, max = 1;
        for (int i = 1; i < 10; i++) {
            if (Objects.equals(list.get(i - 1), list.get(i))) {
                a++;
            } else
                a = 1;
            if (a > max)
                max = a;
        }
        System.out.println(max);
    }
}