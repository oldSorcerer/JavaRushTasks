package com.javarush.task.task20.task2002;

import java.io.*;
import java.util.*;

/* 
Читаем и пишем в файл: JavaRush
*/

public class Solution {
    public static void main(String[] args) {


        try {
            File your_file = File.createTempFile("text.txt", null);
            try (OutputStream outputStream = new FileOutputStream(your_file);
                 InputStream inputStream = new FileInputStream(your_file)) {

                JavaRush javaRush = new JavaRush();

                User user = new User();
                user.setFirstName("Ivan");
                user.setLastName("Ivanov");
                user.setBirthDate(new Date(1991, Calendar.JUNE, 5));
                user.setMale(true);
                user.setCountry(User.Country.RUSSIA);

                javaRush.users.add(user);

                javaRush.save(outputStream);
                outputStream.flush();

                JavaRush loadedObject = new JavaRush();
                loadedObject.load(inputStream);

                System.out.println(loadedObject.equals(javaRush));
            }
        } catch (IOException e) {
            System.out.println("Oops, something is wrong with my file");
        } catch (Exception e) {
            System.out.println("Oops, something is wrong with the save/load method");
        }
    }

    public static class JavaRush {
        public List<User> users = new ArrayList<>();

        public void save(OutputStream outputStream) throws Exception {
            try (PrintWriter writer = new PrintWriter(outputStream)) {
                if (!users.isEmpty()) {
                    for (User user : users) {
                        String builder = user.getFirstName() + " " +
                                user.getLastName() + " " +
                                user.getBirthDate().getTime() + " " +
                                user.isMale() + " " +
                                user.getCountry().getDisplayName();
                        writer.println(builder);
                    }
                }
            }
        }

        public void load(InputStream inputStream) throws Exception {
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    String[] strings = line.split(" ");
                    if (strings.length < 5) {
                        break;
                    }
                    User user = new User();
                    user.setFirstName(strings[0]);
                    user.setLastName(strings[1]);
                    user.setBirthDate(new Date(Long.parseLong(strings[2])));
                    user.setMale(Boolean.parseBoolean(strings[3]));
                    user.setCountry(User.Country.valueOf(strings[4].toUpperCase()));
                    users.add(user);
                }
            }
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JavaRush javaRush = (JavaRush) o;

            return Objects.equals(users, javaRush.users);
        }

        @Override
        public int hashCode() {
            return users != null ? users.hashCode() : 0;
        }
    }
}
