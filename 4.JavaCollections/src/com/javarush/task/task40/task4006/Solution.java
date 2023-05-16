package com.javarush.task.task40.task4006;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.net.URL;

/* 
Отправка GET-запроса через сокет
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        getSite(new URL("http://javarush.ru/social.html"));
    }

    public static void getSite(URL url) {
//        try {
//            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
//
//            connection.setRequestMethod("GET");
//
//            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
//            String responseLine;
//
//            while ((responseLine = bufferedReader.readLine()) != null) {
//                System.out.println(responseLine);
//            }
//            bufferedReader.close();
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}