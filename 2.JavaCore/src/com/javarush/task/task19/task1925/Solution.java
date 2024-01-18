package com.javarush.task.task19.task1925;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.stream.Collectors;

/* 
Длинные слова
*/

public class Solution {

    public static void main(String[] args) throws IOException {

        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]));
             BufferedWriter writer = new BufferedWriter(new FileWriter(args[1]))) {
            StringBuilder builder = new StringBuilder();
            while (reader.ready()) {
                String string = reader.readLine();
                String[] strings = string.split(" ");
                for (String str : strings) {
                    if (str.length() > 6) {
                        builder.append(str).append(",");
                    }
                }
            }
            writer.write(builder.toString().replaceAll(",$", ""));
        }
    }

    public static void main1(String[] args) throws IOException{

        Files.writeString(Path.of(args[1]), Arrays.stream(Files.readString(Path.of(args[0])).split("[\\n\\r\\s]+"))
                .filter(string -> string.length() > 6)
                .collect(Collectors.joining(",")));
    }
}