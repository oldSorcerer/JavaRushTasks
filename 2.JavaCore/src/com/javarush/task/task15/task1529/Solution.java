package com.javarush.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Осваивание статического блока
*/

public class Solution {
    public static void main(String[] args) {

    }

    static {
        reset();
    }

    public static CanFly result;

    public static void reset() {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)) ) {
            String string = reader.readLine();
            if (string.equalsIgnoreCase("helicopter")) {
                result = new Helicopter();
            } else if (string.equalsIgnoreCase("plane")) {
                int count = Integer.parseInt(reader.readLine());
                result = new Plane(count);
            }
        } catch (IOException ignore) {
        }
    }
}
