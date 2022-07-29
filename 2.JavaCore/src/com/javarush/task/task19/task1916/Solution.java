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
        List<String> listOne = new ArrayList<>();
        List<String> listTwo = new ArrayList<>();

        try (BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
            BufferedReader readerFileOne = new BufferedReader(new FileReader(console.readLine()));
            BufferedReader readerFileTwo = new BufferedReader(new FileReader(console.readLine()))) {

            while (readerFileOne.ready()) {
                listOne.add(readerFileOne.readLine());
            }
            while (readerFileTwo.ready()) {
                listTwo.add(readerFileOne.readLine());
            }
        }

        for (int i = 0, j = 0; i < listOne.size() && j < listTwo.size(); ) {
            if (listOne.get(i).equals(listTwo.get(j))) {
                lines.add(new LineItem(Type.SAME, listOne.get(i)));
                i++;
                j++;
            } else if ((i + 1 < listOne.size()) && listOne.get(i + 1).equals(listTwo.get(j))) {
                lines.add(new LineItem(Type.REMOVED, listOne.get(i)));
                i++;
            } else if ((j + 1 < listTwo.size()) && listOne.get(i).equals(listTwo.get(j + 1))){
                lines.add(new LineItem(Type.ADDED, listTwo.get(j)));
                j++;
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
