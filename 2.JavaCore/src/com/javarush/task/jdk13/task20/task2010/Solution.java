package com.javarush.task.jdk13.task20.task2010;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/* 
Дата в JSON
*/

public class Solution {

    public static void main(String[] args) throws JsonProcessingException {
        String jsonString = "{\"name\":\"event#1\",\"eventDate\":\"11-02-2022 09:18:34\"}";
        Event event = new ObjectMapper().readValue(jsonString, Event.class);
        System.out.println(event);
    }
}
