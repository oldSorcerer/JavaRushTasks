package com.javarush.task.task07.task0710;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
В начало списка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        List<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            list.add(null);
        }
        for (int i = 9; i >= 0; i--) {
            list.set(i, reader.readLine());
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(list.get(i));
        }
    }
}