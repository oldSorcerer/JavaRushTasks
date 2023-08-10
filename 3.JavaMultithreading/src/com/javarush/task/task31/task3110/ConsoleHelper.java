package com.javarush.task.task31.task3110;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class ConsoleHelper {

    static BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

    public static void writeMessage(String message) {
        System.out.println(message);
    }

    public static String readString() throws IOException {
        return console.readLine();
    }

    public static int readInt() throws IOException {
        return Integer.parseInt(readString().trim());
    }
}
