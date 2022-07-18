package com.javarush.task.task19.task1906;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Четные символы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        List<Integer> list = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileReader fileReader = new FileReader(reader.readLine());
             FileWriter fileWriter = new FileWriter(reader.readLine())) {
            while (fileReader.ready()) {
                int read = fileReader.read();
                list.add(read);
            }
            for (int i = 1; i < list.size(); i += 2) {
                fileWriter.write(list.get(i));
            }
        }
    }
}