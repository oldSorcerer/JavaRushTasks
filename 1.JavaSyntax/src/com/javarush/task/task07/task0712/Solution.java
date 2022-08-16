package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        List<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            list.add(reader.readLine());
        }

        int min = list.get(0).length();
        for (int i = 0; i < 10; i++) {
            if (min > list.get(i).length())
                min = list.get(i).length();
        }

        int max = 0;
        for (int i = 0; i < 10; i++) {
            if (max < (list.get(i)).length()) {
                max = list.get(i).length();

            }
        }

        String str = "";

        for (int i = 0; i < 10; i++) {
            if ((max == (list.get(i)).length()) || (min == (list.get(i)).length())) {
                str = list.get(i);
                break;
            }
        }
        System.out.print(str);


    }
}