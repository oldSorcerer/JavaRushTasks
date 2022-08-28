package com.javarush.task.task33.task3303;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileReader;
import java.io.IOException;

/* 
Десериализация JSON объекта
*/

public class Solution {
    public static <T> T convertFromJsonToNormal(String fileName, Class<T> clazz) throws IOException {
        try (FileReader reader = new FileReader(fileName)) {
            ObjectMapper mapper = new ObjectMapper();
            return mapper.readValue(reader, clazz);
        }
    }

    public static void main(String[] args) {

    }
}
