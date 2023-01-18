package com.javarush.task.task19.task1923;

import java.io.*;

/* 
Слова с цифрами
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        try(BufferedReader reader = new BufferedReader(new FileReader(args[0]));
            BufferedWriter writer = new BufferedWriter(new FileWriter(args[1]))) {
            while (reader.ready()) {
                String string = reader.readLine();
                for (String word : string.split(" ")) {
                    if (word.matches(".*\\d.*")) {
                        writer.write(word + " ");
                    }
                }
            }
        }
    }
}
