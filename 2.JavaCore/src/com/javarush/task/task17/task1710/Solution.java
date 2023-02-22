package com.javarush.task.task17.task1710;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        if (args == null || args.length < 1) {
            throw new RuntimeException();
        }

        SimpleDateFormat inputFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        SimpleDateFormat outputFormat = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);

        Person person = null;

        switch (args[0]) {
            case "-c" -> {
                if (args[2].equalsIgnoreCase("м")) {
                    person = Person.createMale(args[1], inputFormat.parse(args[3]));
                } else if (args[2].equalsIgnoreCase("ж")) {
                    person = Person.createFemale(args[1], inputFormat.parse(args[3]));
                }
                allPeople.add(person);
                System.out.println(allPeople.size() - 1);
            }
            case "-r" -> {
                int id = Integer.parseInt(args[1]);
                if (id >= 0 && id < allPeople.size() && (person = allPeople.get(id)) != null) {
                    String sex = null;
                    if (person.getSex().equals(Sex.MALE)) {
                        sex = "м";
                    } else if (person.getSex().equals(Sex.FEMALE)) {
                        sex = "ж";
                    }
                    System.out.println(person.getName() + " " + sex +
                            " " + outputFormat.format(person.getBirthDate()));
                } //String sex = person.getSex().equals(Sex.MALE) ? "м" : "ж";
            }
            case "-u" -> {
                int id = Integer.parseInt(args[1]);
                if (id >= 0 && id < allPeople.size() && (person = allPeople.get(id)) != null) {
                    person.setName(args[2]);
                    if (args[3].equalsIgnoreCase("м")) {
                        person.setSex(Sex.MALE);
                    } else if (args[3].equalsIgnoreCase("ж")) {
                        person.setSex(Sex.FEMALE);
                    }
                    person.setBirthDate(inputFormat.parse(args[4]));
                }
            }
            case "-d" -> {
                int id = Integer.parseInt(args[1]);
                if (id >= 0 && id < allPeople.size() && (person = allPeople.get(id)) != null) {
                    person.setName(null);
                    person.setSex(null);
                    person.setBirthDate(null);
                }
            }
        }
    }
}
