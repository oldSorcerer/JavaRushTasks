package com.javarush.task.task19.task1918;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

/* 
Знакомство с тегами
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        StringBuilder builder = new StringBuilder();

        try (BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader reader = new BufferedReader(new FileReader(console.readLine()))) {

            while (reader.ready()) {
                builder.append(reader.readLine());
            }

            Document document = Jsoup.parse(builder.toString(), "", Parser.xmlParser());
            Elements elements = document.select(args[0]);
            elements.forEach(System.out::println);

        }
    }

    public static void main1(String[] args) throws IOException {
        try (BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader bufferedReader = new BufferedReader((new FileReader(console.readLine())))) {
            StringBuilder stringBuilder = new StringBuilder();

            while (bufferedReader.ready()) {
                stringBuilder.append(bufferedReader.readLine());
            }

            String line = stringBuilder.toString();

            int tagIndex = line.indexOf("<" + args[0]);
            List<Integer> tagList = new ArrayList<>();

            while (tagIndex != -1) {
                tagList.add(tagIndex);

                tagIndex = line.indexOf("<" + args[0], tagIndex + 1);
            }

            for (Integer startIndex : tagList) {
                int lastOpenTagIndex = startIndex;
                int lastCloseTagIndex = line.indexOf("</" + args[0], lastOpenTagIndex);

                while (true) {
                    int next = line.indexOf("<" + args[0], lastOpenTagIndex + 1);
                    if (next < lastCloseTagIndex && lastOpenTagIndex < next) {
                        lastOpenTagIndex = line.indexOf("<" + args[0], lastOpenTagIndex + 1);
                        lastCloseTagIndex = line.indexOf("</" + args[0], lastCloseTagIndex + 1);
                    } else {
                        System.out.println(line.substring(startIndex, lastCloseTagIndex + 3 + args[0].length()));
                        break;
                    }
                }
            }
        }
    }

    public static void main2(String[] args) {
        String fileName = null;
        try (BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in))) {
            fileName = consoleReader.readLine();
        } catch (IOException ignore) {
        }

        StringBuilder readFileContent = new StringBuilder();
        try (BufferedReader fileReader = new BufferedReader(new FileReader(fileName))) {
            while (fileReader.ready()) {
                readFileContent.append(fileReader.readLine());
            }
        } catch (IOException ignore) {
        }

        String fileContent = readFileContent.toString().replaceAll("[\\r\\n]+", "");

        String tag = args[0];
        String openedTag = "<" + tag;
        String closedTag = "</" + tag;
        int openedTagIndex = fileContent.indexOf(openedTag);
        int closedTagIndex = fileContent.indexOf(closedTag);
        ArrayList<Integer> openedTagsIndexes = new ArrayList<>();
        ArrayList<Integer> closedTagsIndexes = new ArrayList<>();

        while (openedTagIndex != -1 || closedTagIndex != -1) {
            if (openedTagIndex != -1 && openedTagIndex < closedTagIndex) {
                openedTagsIndexes.add(openedTagIndex);
                openedTagIndex = fileContent.indexOf(openedTag, openedTagIndex + 1);
            } else if (closedTagIndex < openedTagIndex || openedTagIndex == -1) {
                closedTagsIndexes.add(closedTagIndex + tag.length() + 3);
                closedTagIndex = fileContent.indexOf(closedTag, closedTagIndex + 1);
            }
        }

        Stack<String> stack = new Stack<>();
        for (int i = openedTagsIndexes.size() - 1; i >= 0; i--) {
            stack.push(fileContent.substring(openedTagsIndexes.get(i), getNextCloseTag(closedTagsIndexes, openedTagsIndexes.get(i))));
        }

        while (stack.size() > 0) {
            System.out.println(stack.pop());
        }
    }

    private static int getNextCloseTag(ArrayList<Integer> closedTagsIndexes, Integer openTagIndex) {
        Iterator<Integer> iterator = closedTagsIndexes.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            if (next > openTagIndex) {
                iterator.remove();
                return next;
            }
        }
        return 0;
    }

}
