package com.javarush.task.task19.task1908;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Выделяем числа
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        List<Integer> list = new ArrayList<>();

        try (BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader reader = new BufferedReader(new FileReader(console.readLine()));
             BufferedWriter writer = new BufferedWriter(new FileWriter(console.readLine()))) {
            while (reader.ready()) {
                String string = reader.readLine();
                for (String str : string.split(" ")) {
                    try {
                        int number = Integer.parseInt(str);
                        list.add(number);
                    } catch (Exception ignore) {
                    }
                }
            }
            for (Integer integer: list) {
                writer.write(integer + " ");
            }
        }
    }
}
