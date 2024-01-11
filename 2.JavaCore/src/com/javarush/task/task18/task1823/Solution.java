package com.javarush.task.task18.task1823;


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<>();

    public static void main(String[] args) throws IOException {

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            while (true) {
                String fileName = reader.readLine();
                if (fileName.equals("exit")) {
                    break;
                }
                new ReadThread(fileName).start();
            }
        }
    }

    public static class ReadThread extends Thread {
        private final String fileName;

        public ReadThread(String fileName) {
            this.fileName = fileName;
        }

        @Override
        public void run() {
            Map<Integer, Integer> map = new HashMap<>();

            try (FileInputStream inputStream = new FileInputStream(fileName)) {
                while (inputStream.available() > 0) {
                    int read = inputStream.read();
                    if (!map.containsKey(read)) {
                        map.put(read, 1);
                    } else {
                        map.put(read, map.get(read) + 1);
                    }
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }


            Integer max = map.values().stream().max(Comparator.naturalOrder()).orElseThrow();

            map.entrySet().stream()
                    .filter(entry -> entry.getValue().equals(max)).findFirst()
                    .ifPresent(entry -> resultMap.put(fileName, entry.getKey()));




            List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
            Comparator<Map.Entry<Integer, Integer>> comparator = Map.Entry.comparingByValue();
            list.sort(comparator.reversed());
            resultMap.put(fileName, list.get(0).getKey());
        }
    }
}

/*
* Integer max = map.values().stream().max(Comparator.comparingInt(x -> x)).get();
* List<Integer> list = new ArrayList<>();
* for (Map.Entry<Integer, Integer> pair : map.entrySet()) {
    if (Objects.equals(pair.getValue(), max)) {
        list.add(pair.getKey());
        }
}
list.sort(Comparator.comparingInt(x -> x));
* resultMap.put(fileName, list.get(0));*/