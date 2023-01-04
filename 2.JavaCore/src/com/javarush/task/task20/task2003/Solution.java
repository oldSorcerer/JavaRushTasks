package com.javarush.task.task20.task2003;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/* 
Знакомство с properties
*/

public class Solution {

    public static Map<String, String> runtimeStorage = new HashMap<>();

    public static void save(OutputStream outputStream) throws Exception {
        Properties properties = new Properties();
        for (Map.Entry<String, String> entry : runtimeStorage.entrySet()) {
            properties.setProperty(entry.getKey(), entry.getValue());
        } //runtimeStorage.forEach((k,v) ->properties.setProperty(k, v));
        //properties.putAll(runtimeStorage);
        properties.store(outputStream, null);
    }

    public static void load(InputStream inputStream) throws IOException {
        Properties properties = new Properties();
        properties.load(inputStream);
        for (Map.Entry<Object, Object> entry : properties.entrySet()) {
            runtimeStorage.put(entry.getKey().toString(), entry.getValue().toString());
        } // properties.forEach((k,v) -> runtimeStorage.put(k.toString(), v.toString()));
    }

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileInputStream fos = new FileInputStream(reader.readLine())) {
            load(fos);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(runtimeStorage);
    }
}
