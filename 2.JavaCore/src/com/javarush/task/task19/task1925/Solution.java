package com.javarush.task.task19.task1925;

import java.io.*;
import java.util.ArrayList;

/* 
Длинные слова
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        String fileNameOne = args[0];
        String fileNameTwo = args[1];

        try (BufferedReader reader = new BufferedReader(new FileReader(fileNameOne));
             BufferedWriter writer = new BufferedWriter(new FileWriter(fileNameTwo))
            ) {
            while (reader.ready()) {
                String string = reader.readLine();
                String[] strings = string.split(" ");

            }
        }

    }
}
