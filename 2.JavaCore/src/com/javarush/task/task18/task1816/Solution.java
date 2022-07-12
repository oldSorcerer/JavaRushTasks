package com.javarush.task.task18.task1816;

import java.io.FileReader;
import java.io.IOException;

/* 
Английские буквы
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        int count = 0;

        try (FileReader fileReader = new FileReader(args[0])) {
            while (fileReader.ready()) {
                int read = fileReader.read();
                if (read >= 65 && read <= 122 && Character.isAlphabetic(read)) {
                    count++;
                }
            }
        }
        System.out.print(count);
    }
}
