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

class Solution1 {


    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            ByteArrayOutputStream password = getPassword();
            System.out.println(password.toString());
        }
    }

    public static ByteArrayOutputStream getPassword1() {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String str = "0123456789" + alphabet + alphabet.toUpperCase();
        String password = "";

        for (int i = 0; i < 8; i++) {
            Random random = new Random();
            int index = random.nextInt(str.length());
            char charAt = str.charAt(index);
            password = password + charAt;
        }
        if (!password.matches(".*\\d.*") ||
            !password.matches(".*[a-z].*") ||
            !password.matches(".*[A-Z].*")) {
            return getPassword();
        }
        try (ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream()) {
            byteArrayOutputStream.write(password.getBytes());
            return byteArrayOutputStream;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static ByteArrayOutputStream getPassword() {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String str = "0123456789" + alphabet + alphabet.toUpperCase();
        char[] password = new char[8];
        String string = "";
        while (!string.matches(".*\\d.*") ||
               !string.matches(".*[a-z].*") ||
               !string.matches(".*[A-Z].*")){
            for (int i = 0; i < password.length; i++) {
                password[i] = str.charAt(new Random().nextInt(str.length()));
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