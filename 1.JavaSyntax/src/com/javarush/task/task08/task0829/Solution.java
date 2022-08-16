package com.javarush.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* 
Модернизация ПО
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        HashMap<String, String> addresses = new HashMap<>();
        while (true) {
            String adr = reader.readLine();
            if (adr.isEmpty()) break;

            addresses.put(adr, reader.readLine());
        }

        String city = reader.readLine();
        System.out.println(addresses.get(city));

    }
}