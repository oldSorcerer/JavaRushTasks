package com.javarush.task.task07.task0722;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Это конец
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        List<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String str = "";
        while (!str.equals("end")) {
            str = reader.readLine();
            if (!str.equals("end")) {
                list.add(str);
            }
        }
        for (String string : list) {
            System.out.println(string);
        }
    }
}