package com.javarush.task.task18.task1827;

import java.io.*;

/* 
Прайсы
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        try (BufferedReader console = new BufferedReader(new InputStreamReader(System.in))) {
            String fileName = console.readLine();
            try (BufferedReader reader = new BufferedReader(new FileReader(fileName));
                 BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))
            ) {
                int id = 0;
                int max = 0;
                while (reader.ready()) {
                    String string = reader.readLine();
                    String substring = string.substring(0, 8);
                    String trim = substring.trim();
                    id = Integer.parseInt(trim);
                    if (id > max) {
                        max = id;
                    } else {
                        id = max;
                    }
                    id++;

                }
                if (args.length != 0) {
                    if (args[0].equals("-c")) {
                        String index = checkLength(String.valueOf(id), 8);
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

    public static String checkLength(String string, int limit) {
        StringBuilder stringBuilder = new StringBuilder(string);

        if (string.length() > limit) {
            return string.substring(0, limit);
        } else {
            while (stringBuilder.length() != limit) {
                stringBuilder.append(" ");
            }
            return stringBuilder.toString();
        }
    }
}
