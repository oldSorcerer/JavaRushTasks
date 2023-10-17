package com.javarush.task.task18.task1827;

import java.io.*;

/* 
Прайсы
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        try (BufferedReader console = new BufferedReader(new InputStreamReader(System.in))) {
            String fileName = console.readLine();
            try (BufferedReader reader = new BufferedReader(new FileReader(fileName));
                 BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
                int maxId = 0;
                while (reader.ready()) {
                    String string = reader.readLine().substring(0, 8).trim();
                    int id = Integer.parseInt(string);
                    if (id > maxId) maxId = id;
                }

                if (args.length != 0) {
                    if (args[0].equals("-c")) {
                        String index = checkLength(String.valueOf(++maxId), 8);
                        String productName = checkLength(args[1], 30);
                        String price = checkLength(args[2], 8);
                        String quantity = checkLength(args[3], 4);
                        writer.newLine();
                        writer.write(index + productName + price + quantity);
                    }
                }
            }
        }
    }

    private static String checkLength(String string, int limit) {

        if (string.length() > limit) {
            return string.substring(0, limit);
        } else {
            StringBuilder builder = new StringBuilder(string);
            while (builder.length() != limit) {
                builder.append(" ");
            }
            return builder.toString();
        }
    }
}