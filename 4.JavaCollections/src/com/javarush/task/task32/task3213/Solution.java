package com.javarush.task.task32.task3213;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.stream.IntStream;

/* 
Шифр Цезаря
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        StringReader reader = new StringReader("Khoor#Dpljr#&C,₷B'3");
        System.out.println(decode(reader, -3));  //Hello Amigo #@)₴?$0
    }

    public static String decode(StringReader reader, int key) throws IOException {
        String string = "";
        if (reader != null) {
            String line = new BufferedReader(reader).readLine();

            char[] buff = new char[line.length()];

            IntStream.range(0, line.length()).forEach(i -> buff[i] = (char) (line.charAt(i) + key));
            string = new String(buff);
        }
        return string;
    }
}
