package com.javarush.task.jdk13.task28.task2806;

import java.util.*;

/* 
Параллельный парсинг
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        List<String> lines = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            lines.add(scanner.nextLine());
        }

        Map<Thread, ParseLinkTask> tasks = new HashMap<>();
        for (String line : lines) {
            ParseLinkTask parseLinkTask = new ParseLinkTask(line);
            Thread thread = new Thread(parseLinkTask);
            tasks.put(thread, parseLinkTask);
            thread.start();
        }

        for (Map.Entry<Thread, ParseLinkTask> entry : tasks.entrySet()) {
            entry.getKey().join();
            System.out.println(entry.getValue().getLink());
        }
    }
}