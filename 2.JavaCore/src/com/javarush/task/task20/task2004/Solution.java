package com.javarush.task.task20.task2004;

import java.io.*;
import java.util.Objects;

/* 
Читаем и пишем в файл статики
*/

public class Solution {
    public static void main(String[] args) {

        try {
            File yourFile = File.createTempFile("your_file_name", null);
            try (OutputStream outputStream = new FileOutputStream(yourFile);
                 InputStream inputStream = new FileInputStream(yourFile);) {

                ClassWithStatic classWithStatic = new ClassWithStatic();
                classWithStatic.i = 3;
                classWithStatic.j = 4;
                classWithStatic.save(outputStream);
                outputStream.flush();

                ClassWithStatic loadedObject = new ClassWithStatic();
                loadedObject.staticString = "something";
                loadedObject.i = 6;
                loadedObject.j = 7;

                loadedObject.load(inputStream);

                System.out.println(classWithStatic.equals(loadedObject));
            }

        } catch (IOException e) {
            System.out.println("Oops, something is wrong with my file");
        } catch (Exception e) {
            System.out.println("Oops, something is wrong with the save/load method");
        }
    }

    public static class ClassWithStatic {
        public static String staticString = "This is a static test string";
        public int i;
        public int j;

        public void save(OutputStream outputStream) throws Exception {
            try (PrintWriter printWriter = new PrintWriter(outputStream)) {
                printWriter.println(staticString);
                printWriter.println(this.i);
                printWriter.println(this.j);
            }
        }

        public void load(InputStream inputStream) throws Exception {
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {
                staticString = reader.readLine();
                this.i = Integer.parseInt(reader.readLine());
                this.j = Integer.parseInt(reader.readLine());
            }
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            ClassWithStatic that = (ClassWithStatic) o;
            return i == that.i && j == that.j;
        }

        @Override
        public int hashCode() {
            return Objects.hash(i, j);
        }
    }
}
