package com.javarush.task.task17.task1710;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws Exception {
        if (args == null || args.length < 1 ) {
            throw new RuntimeException();
        }

        Date birthdayDate;
        Person person = null;

        switch (args[0]) {
            case "-c" :
                birthdayDate = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(args[3]);

                if (args[2].equals("м"))
                    person = Person.createMale(args[1], birthdayDate);
                else if (args[2].equals("ж"))
                    person = Person.createFemale(args[1], birthdayDate);

                allPeople.add(person);
                
                System.out.println(allPeople.size() - 1);

                break;
            case "-r" :
                person = allPeople.get(Integer.parseInt(args[1]));
                if (person != null) {

                    String sex = null;
                    if (person.getSex().equals(Sex.MALE)) sex = "м";
                    if (person.getSex().equals(Sex.FEMALE)) sex = "ж";

                    String string = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH).format(person.getBirthDate());

                    System.out.println(person.getName() + " " + sex + " " + string);
                }

                break;
            case "-u" :
                birthdayDate = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(args[4]);
                int id = Integer.parseInt(args[1]);

                person = allPeople.get(id);
                if (person == null) {
                    throw new IllegalArgumentException();
                }

                person.setName(args[2]);

                if (args[3].equals("м")) person.setSex(Sex.MALE);
                if (args[3].equals("ж")) person.setSex(Sex.FEMALE);

                person.setBirthDate(birthdayDate);

                break;

            case "-d" :
                Person currentPerson = allPeople.get(Integer.parseInt(args[1]));
                currentPerson.setName(null);
                currentPerson.setSex(null);
                currentPerson.setBirthDate(null);
                break;

        }
    }

}
