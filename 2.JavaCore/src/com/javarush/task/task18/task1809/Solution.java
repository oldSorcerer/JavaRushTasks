package com.javarush.task.task18.task1809;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Реверс файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        List<Integer> list = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileInputStream inputStream = new FileInputStream(reader.readLine());
             FileOutputStream outputStream = new FileOutputStream(reader.readLine())
        ) {
            while (inputStream.available() > 0) {
                int read = inputStream.read();
                list.add(read);
            }
            Collections.reverse(list);
            for (Integer integer : list) {
                outputStream.write(integer);
            }
        }
    }
}