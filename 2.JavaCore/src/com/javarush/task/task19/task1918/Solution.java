package com.javarush.task.task19.task1918;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
}
