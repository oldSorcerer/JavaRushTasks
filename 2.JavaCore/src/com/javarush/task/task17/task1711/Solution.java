package com.javarush.task.task17.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static final List<Person> allPeople = new ArrayList<>();

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
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i += 3) {
                        if (args[i + 1].equalsIgnoreCase("м")) {
                            person = Person.createMale(args[i], inputFormat.parse(args[i + 2]));
                        } else if (args[i + 1].equalsIgnoreCase("ж")) {
                            person = Person.createFemale(args[i], inputFormat.parse(args[i + 2]));
                        }
                        allPeople.add(person);
                        System.out.println(allPeople.indexOf(person));
                    }
                }
            }
            case "-u" -> {
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i += 4) {
                        int id = Integer.parseInt(args[i]);
                        if (id >= 0 && id < allPeople.size() && (person = allPeople.get(id)) != null) {
                            person.setName(args[i + 1]);
                            if (args[i + 2].equalsIgnoreCase("м")) {
                                person.setSex(Sex.MALE);
                            } else if (args[i + 2].equalsIgnoreCase("ж")) {
                                person.setSex(Sex.FEMALE);
                            }
                            person.setBirthDate(inputFormat.parse(args[i + 3]));
                        }
                    }
                }
            }
            case "-d" -> {
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++) {
                        person = allPeople.get(Integer.parseInt(args[i]));
                        person.setName(null);
                        person.setSex(null);
                        person.setBirthDate(null);
                    }
                }
            }
            case "-i" -> {
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++) {
                        int id = Integer.parseInt(args[i]);
                        if (id >= 0 && id < allPeople.size() && (person = allPeople.get(id)) != null) {
                            String sex = null;
                            if (person.getSex().equals(Sex.MALE)) {
                                sex = "м";
                            } else if (person.getSex().equals(Sex.FEMALE)) {
                                sex = "ж";
                            } // Sex sex = person.getSex().equals(Sex.MALE) ? "м" : "ж";
                            System.out.println(person.getName() + " " + sex +
                                    " " + outputFormat.format(person.getBirthDate()));
                        }
                    }
                }
            }
        }
    }
}