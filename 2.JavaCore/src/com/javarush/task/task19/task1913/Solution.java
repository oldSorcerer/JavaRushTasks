package com.javarush.task.task19.task1913;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

/* 
Выводим только цифры
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

            String allNumber = string.replaceAll("\\D", "");

            System.setOut(consoleStream);

            System.out.println(allNumber);

        }
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's 1 a 23 text 4 f5-6or7 tes8ting");
        }
    }
}
