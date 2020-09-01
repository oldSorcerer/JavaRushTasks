package com.javarush.task.task13.task1319;

/* 
Писатель в файл с консоли
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String fileName = reader.readLine();

        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));

        String str;
        while (true) {
            str = reader.readLine();
            writer.write(str + "\n");
            if (str.equals("exit"))
                break;
        }
        writer.close();

    }
}
