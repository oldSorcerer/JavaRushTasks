package com.javarush.task.task32.task3204;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Random;

/* 
Генератор паролей
*/

public class Solution {
    public static void main(String[] args) {
        ByteArrayOutputStream password = getPassword();
        System.out.println(password);
    }

    public static ByteArrayOutputStream getPassword() {

        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String alphanumeric = "0123456789" + alphabet + alphabet.toUpperCase();

        char[] password = new char[8];
        String string = "";
        while (!string.matches(".*\\d.*") || !string.matches(".*[a-z].*") || !string.matches(".*[A-Z].*")) {
            for (int i = 0; i < password.length; i++) {
                password[i] = alphanumeric.charAt(new Random().nextInt(alphanumeric.length()));
            }
            string = new String(password);
        }
        
        try (ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream()) {
            byteArrayOutputStream.write(string.getBytes());
            return byteArrayOutputStream;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
