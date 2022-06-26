package com.javarush.task.task17.task1721;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<>();
    public static List<String> forRemoveLines = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            BufferedReader readerPathOne = new BufferedReader(new FileReader(reader.readLine()));
             BufferedReader readerPathTwo = new BufferedReader(new FileReader(reader.readLine()));) {
            while (readerPathOne.ready()) {
                allLines.add(readerPathOne.readLine());
            }
            while (readerPathTwo.ready()) {
                forRemoveLines.add(readerPathTwo.readLine());
            }
            new Solution().joinData();
        }
    }

    public  void joinData() throws CorruptedDataException {
        if (new HashSet<>(allLines).containsAll(forRemoveLines)) {
            allLines.removeAll(forRemoveLines);
        } else {
            allLines.clear();
            throw new CorruptedDataException();
        }
    }
}
