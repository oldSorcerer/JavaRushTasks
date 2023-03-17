package com.javarush.task.task18.task1819;

import java.io.*;

/* 
Объединение файлов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try (BufferedReader console = new BufferedReader(new InputStreamReader(System.in))) {

            String pathFileOne = console.readLine();
            StringBuilder contentFileOne = new StringBuilder();

            try (BufferedReader readerFileOne = new BufferedReader(new FileReader(pathFileOne));
                 BufferedReader readerFileTwo = new BufferedReader(new FileReader(console.readLine()))) {

                while (readerFileTwo.ready()) {
                    contentFileOne.append(readerFileTwo.readLine()).append(System.lineSeparator());
                }
                while (readerFileOne.ready()) {
                    contentFileOne.append(readerFileOne.readLine()).append(System.lineSeparator());
                }
            }
            try (OutputStream outputStream = new FileOutputStream(pathFileOne)) {
                outputStream.write(contentFileOne.toString().getBytes());
            }
        }
    }
}
//class Solution2 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
//
//        String fileName = console.readLine();
//        ByteArrayOutputStream arrayOutputStream = new ByteArrayOutputStream();
//
//        try (InputStream inputStream1 = new FileInputStream(fileName);
//             InputStream inputStream2 = new FileInputStream(console.readLine())) {
//            while (inputStream2.available() > 0) {
//                arrayOutputStream.write(inputStream2.read());
//            }
//            while (inputStream1.available() > 0) {
//                arrayOutputStream.write(inputStream1.read());
//            }
//        }
//        try (OutputStream outputStream = new FileOutputStream(fileName);) {
//            arrayOutputStream.writeTo(outputStream);
//        }
//    }
//}