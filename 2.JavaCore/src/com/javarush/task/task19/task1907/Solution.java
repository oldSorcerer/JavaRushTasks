package com.javarush.task.task19.task1907;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Считаем слово
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        try (BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
            BufferedReader reader = new BufferedReader(new FileReader(console.readLine()))) {
            int count = 0;
            while (reader.ready()) {
                String string = reader.readLine();
                String replacedString = string.replaceAll("\\p{P}", " ").replaceAll("\\s", " ");
                for (String str: replacedString.split(" ")) {
                    if (str.equals("world")) {
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
}