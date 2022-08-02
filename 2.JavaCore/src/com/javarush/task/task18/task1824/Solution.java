package com.javarush.task.task18.task1824;

import java.io.*;

/* 
Файлы и исключения
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            while (true) {
                String string = reader.readLine();
                try (FileReader fileReader = new FileReader(string)) {

                } catch (FileNotFoundException e) {
                    System.out.println(string);
                    break;
                }
            }
        }
    }
}