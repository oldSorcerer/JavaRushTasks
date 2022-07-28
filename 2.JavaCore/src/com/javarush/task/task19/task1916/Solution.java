package com.javarush.task.task19.task1916;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Отслеживаем изменения
*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        List<String> stringListFileOne = new ArrayList<>();
        List<String> stringListFileTwo = new ArrayList<>();

        try (BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
            BufferedReader readerFileOne = new BufferedReader(new FileReader(console.readLine()));
            BufferedReader readerFileTwo = new BufferedReader(new FileReader(console.readLine()))) {

            while (readerFileOne.ready()) {
                stringListFileOne.add(readerFileOne.readLine());
            }
            while (readerFileTwo.ready()) {
                stringListFileTwo.add(readerFileOne.readLine());
            }
        }

        for (int i = 0; i < stringListFileOne.size(); i++) {
            if (stringListFileOne.get(i).equals(stringListFileTwo.get(i))) {
                lines.add(new LineItem(Type.SAME, stringListFileOne.get(i)));
            }
        }
    }


    public enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
    }
}
