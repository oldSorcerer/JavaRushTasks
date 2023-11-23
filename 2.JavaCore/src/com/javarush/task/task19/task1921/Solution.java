package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<>();

    public static void main(String[] args) throws Exception {

        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]))) {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd MM yyyy");

            while (reader.ready()) {
                String string = reader.readLine();

                String name = string.replaceAll("\\d", "").trim();
                String date = string.replaceAll("\\D", " ").trim();

                PEOPLE.add(new Person(name, dateFormat.parse(date)));
            }
        }
        for (Person person : PEOPLE) {
            System.out.println(person.getName() + person.getBirthDate());
        }

        Files.readAllLines(Paths.get(args[0]))
                .stream()
                .map(string -> new Person(
                        string.replaceAll("\\d", "").trim(), //neme
                        Date.from(
                                LocalDate.parse(string.replaceAll("\\D", " ").trim(), DateTimeFormatter.ofPattern("dd MM yyyy")).atStartOfDay(ZoneId.systemDefault()).toInstant()
                        ) //date
                ))
                .peek(PEOPLE::add).forEach(person -> System.out.println(person.getName() + " " + person.getBirthDate()));
    }
}
