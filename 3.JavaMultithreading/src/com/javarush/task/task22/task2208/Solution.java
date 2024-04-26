package com.javarush.task.task22.task2208;

import java.util.LinkedHashMap;
import java.util.Map;

/* 
Формируем WHERE
*/

public class Solution {
    public static void main(String[] args) {

        Map<String, String> map = new LinkedHashMap<>();
        map.put("name","Ivanov");
        map.put("country","Ukraine");
        map.put("city","Kiev");
        map.put("age",null);

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

        return builder.substring(0, builder.lastIndexOf("'") + 1);
    }
}
