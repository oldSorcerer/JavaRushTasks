package com.javarush.task.task32.task3213;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;

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
            String line = "";
            BufferedReader bufferedReader = new BufferedReader(reader);
            while (bufferedReader.ready()) {
                line = bufferedReader.readLine();
            }




            byte[] buff = new byte[line.length()];
            for (int i = 0; i < line.length(); i++) {
                int index = reader.read() + key;
                buff[i] = (byte) index;
            }
            string = new String(buff);
        }
        return string;
    }
}
