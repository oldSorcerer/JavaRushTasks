package com.javarush.task.task19.task1909;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Замена знаков
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        List<String> list = new ArrayList<>();

        try (BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader reader = new BufferedReader(new FileReader(console.readLine()));
             BufferedWriter writer = new BufferedWriter(new FileWriter(console.readLine()))) {
            while (reader.ready()) {
                String string = reader.readLine();
                String replaceAll = string.replaceAll("\\.", "!");
                list.add(replaceAll);
            }
            for (String string : list) {
                writer.write(string);
            }
        }
    }
}
