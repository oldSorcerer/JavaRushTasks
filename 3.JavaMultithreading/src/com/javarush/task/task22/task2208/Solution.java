package com.javarush.task.task22.task2208;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

/* 
Формируем WHERE
*/

public class Solution {
    public static void main(String[] args) {

        Map<String, String> map = new LinkedHashMap<>();
        map.put("name", "Ivanov");
        map.put("country", "Ukraine");
        map.put("city", "Kiev");
        map.put("age", null);

        System.out.println(getQuery(map));
    }

    public static String getQuery(Map<String, String> params) {

        StringBuilder builder = new StringBuilder();

        for (Map.Entry<String, String> pair : params.entrySet()) {
            if (pair.getValue() != null) {
                builder.append(pair.getKey())
                        .append(" = '")
                        .append(pair.getValue())
                        .append("' and ");
            }
        }
//        String collect = params.entrySet().stream()
//                .filter(entry -> Objects.nonNull(entry.getValue()))
//                .map(entry -> new StringBuilder(entry.getKey()).append(" = '")
//                        .append(entry.getValue())
//                        .append("' and "))
//                .collect(Collectors.joining());

        return builder.substring(0, builder.lastIndexOf("'") + 1);
    }
}
