package com.javarush.task.task19.task1910;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Пунктуация
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        List<String> list = new ArrayList<>();

        try (BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader reader = new BufferedReader(new FileReader(console.readLine()));
             BufferedWriter writer = new BufferedWriter(new FileWriter(console.readLine()))) {
            while (reader.ready()) {
                String string = reader.readLine();
                String replaceAll = string.replaceAll("\\p{Punct}", "");
                list.add(replaceAll);
            }
            for (String string : list) {
                writer.write(string);
            }
        }
    }
}