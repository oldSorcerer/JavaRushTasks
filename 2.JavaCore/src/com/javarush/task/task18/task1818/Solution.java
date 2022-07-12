package com.javarush.task.task18.task1818;

import java.io.*;

/* 
Два в одном
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        
        try (var console = new BufferedReader(new InputStreamReader(System.in));
        var outputStream = new FileOutputStream(console.readLine(), true);
        var readerFileTwo = new BufferedReader(new FileReader(console.readLine()));
        var readerFileThree = new BufferedReader(new FileReader(console.readLine()))) {

            while (readerFileTwo.ready()) {
                outputStream.write(readerFileTwo.readLine().getBytes());
            }
            while (readerFileThree.ready()) {
                outputStream.write(readerFileThree.readLine().getBytes());
            }
        }
    }
}
