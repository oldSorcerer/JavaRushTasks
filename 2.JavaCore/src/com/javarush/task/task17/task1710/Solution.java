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

        Date birthday;
        Person person = null;

        switch (args[0]) {
            case "-c" -> {
                birthday = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(args[3]);

                if (args[2].equalsIgnoreCase("м")) {
                    person = Person.createMale(args[1], birthday);
                } else if (args[2].equalsIgnoreCase("ж")) {
                    person = Person.createFemale(args[1], birthday);
                }
                allPeople.add(person);
                System.out.println(allPeople.size() - 1);
            }
            case "-r" -> {
                person = allPeople.get(Integer.parseInt(args[1]));
                if (person != null) {

                    String sex = null;
                    if (person.getSex().equals(Sex.MALE)) {
                        sex = "м";
                    } else if (person.getSex().equals(Sex.FEMALE)) {
                        sex = "ж";
                    }

                    String format = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH).format(person.getBirthDate());

                    System.out.println(person.getName() + " " + sex + " " + format);
                }
            }
            case "-u" -> {
                person = allPeople.get(Integer.parseInt(args[1]));
                if (person == null) {
                    throw new IllegalAccessError();
                }
                person.setName(args[2]);
                if (args[3].equalsIgnoreCase("м")) {
                    person.setSex(Sex.MALE);
                } else if (args[3].equalsIgnoreCase("ж")) {
                    person.setSex(Sex.FEMALE);
                }
                Date date = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(args[4]);
                person.setBirthDate(date);
            }
            case "-d" -> {
                person = allPeople.get(Integer.parseInt(args[1]));
                person.setName(null);
                person.setSex(null);
                person.setBirthDate(null);
            }
        }
    }
}
