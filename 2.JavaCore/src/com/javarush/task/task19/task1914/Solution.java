package com.javarush.task.task19.task1914;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

/* 
Решаем пример
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) throws IOException {
        try(PrintStream consoleStream = System.out;
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            PrintStream stream = new PrintStream(outputStream)) {
            System.setOut(stream);

            testString.printSomething();

            System.setOut(consoleStream);

            String[] strings = outputStream.toString().split(" ");

            int numberOne = Integer.parseInt(strings[0]);

            int numberTwo = Integer.parseInt(strings[2]);

            String result = switch (strings[1]) {
                case "+" -> numberOne + " + " + numberTwo + " = " + (numberOne + numberTwo);
                case "-" -> numberOne + " - " + numberTwo + " = " + (numberOne - numberTwo);
                case "*" -> numberOne + " * " + numberTwo + " = " + (numberOne * numberTwo);
                default -> "";
            };

            System.out.println(result);
        }
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

