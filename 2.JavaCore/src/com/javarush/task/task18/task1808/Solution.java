package com.javarush.task.task18.task1808;

import java.io.*;
import java.util.Arrays;

/* 
Разделение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        try (BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
             FileInputStream readerFileOne = new FileInputStream(console.readLine());
             FileOutputStream writerFileTwo = new FileOutputStream(console.readLine());
             FileOutputStream writerFileThree = new FileOutputStream(console.readLine())
        ) {
            int halfFile = (readerFileOne.available() + 1) / 2;
            int count = 0;
            while (readerFileOne.available() > 0) {
                if (count < halfFile) {
                    writerFileTwo.write(readerFileOne.read());
                    count++;
                } else {
                    writerFileThree.write(readerFileOne.read());
                }
            }
//            byte[] bytes = readerFileOne.readAllBytes();
//            if (bytes.length % 2 != 0) {
//                writerFileTwo.write(Arrays.copyOfRange(bytes, 0, bytes.length / 2 + 1));
//                writerFileThree.write(Arrays.copyOfRange(bytes, bytes.length / 2 + 1, bytes.length));
//            } else {
//                writerFileTwo.write(Arrays.copyOfRange(bytes, 0, bytes.length / 2 ));
//                writerFileThree.write(Arrays.copyOfRange(bytes, bytes.length / 2, bytes.length));
//            }
        }
    }
}