package com.javarush.task.task19.task1904;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) throws IOException {
        PersonScannerAdapter adapter = new PersonScannerAdapter(new Scanner(new File("")));
        Person person = adapter.read();
        System.out.println(person);
    }

    public static class PersonScannerAdapter implements PersonScanner {

        private final Scanner fileScanner;

        public PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }

        @Override
        public Person read() throws IOException {

            String string = fileScanner.nextLine();
            String[] split = string.split(" ");

            int year = Integer.parseInt(split[5]);
            int month = Integer.parseInt(split[4]) - 1;
            int dayOfMonth = Integer.parseInt(split[3]);
            Calendar calendar = new GregorianCalendar(year, month, dayOfMonth);
            Date date = calendar.getTime();

            return new Person(split[1], split[2], split[0], date) ;
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}
