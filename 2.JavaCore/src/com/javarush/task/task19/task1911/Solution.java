package com.javarush.task.task19.task1911;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

/* 
Ридер обертка
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) throws IOException {

        try (PrintStream consoleStream = System.out;
             ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
             PrintStream stream = new PrintStream(outputStream)) {

            System.setOut(stream);

            testString.printSomething();

            String string = outputStream.toString();

            System.setOut(consoleStream);

            System.out.println(string.toUpperCase());
        }
    }

    public static class TestString {

        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}
