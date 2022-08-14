package com.javarush.task.task19.task1915;

import java.io.*;

/* 
Дублируем текст
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) throws IOException {

        try(PrintStream consoleStream = System.out;
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            PrintStream stream = new PrintStream(outputStream);
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            FileOutputStream fileOutputStream = new FileOutputStream(reader.readLine())) {

            System.setOut(stream);

            testString.printSomething();

            fileOutputStream.write(outputStream.toByteArray());

            System.setOut(consoleStream);

            System.out.println(outputStream);
        }
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}

