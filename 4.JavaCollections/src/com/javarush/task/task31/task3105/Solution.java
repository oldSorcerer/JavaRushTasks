package com.javarush.task.task31.task3105;

import java.io.*;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

/* 
Добавление файла в архив
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        String fileName = args[0];
        String zipFilePath = args[1];

        ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(zipFilePath));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ZipEntry zipEntry;
        while ((zipEntry = zipInputStream.getNextEntry()) != null) {
            byte[] buffer = new byte[1024];
            for (int length; (length = zipInputStream.read(buffer)) > 0; ) {
                byteArrayOutputStream.write(buffer, 0, length);
            }

        }
        ZipOutputStream zipOutputStream = new ZipOutputStream(new FileOutputStream(fileName));
    }
}
