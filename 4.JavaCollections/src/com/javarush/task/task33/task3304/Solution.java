package com.javarush.task.task33.task3304;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

/* 
Конвертация из одного класса в другой используя JSON Ӏ 3304
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Second s = (Second) convertOneToAnother(new First(), Second.class);
        System.out.println(s);
        First f = (First) convertOneToAnother(new Second(), First.class);
        System.out.println(f);
    }

    public static Object convertOneToAnother(Object one, Class<?> resultClassObject) throws IOException {
        ObjectMapper mapper = new ObjectMapper();

        mapper.disable(MapperFeature.USE_ANNOTATIONS);

        String string = mapper.writeValueAsString(one);

        return mapper.readValue(string, resultClassObject);
    }

    @JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "className")
    @JsonSubTypes(@JsonSubTypes.Type(value = First.class, name = "first"))
    public static class First {
        public int i;
        public String name;

        @Override
        public String toString() {
            return "First{" +
                   "i=" + i +
                   ", name='" + name + '\'' +
                   '}';
        }
    }

    @JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "className")
    @JsonSubTypes(@JsonSubTypes.Type(value = Second.class, name = "second"))
    public static class Second {
        public int i;
        public String name;

        @Override
        public String toString() {
            return "Second{" +
                   "i=" + i +
                   ", name='" + name + '\'' +
                   '}';
        }
    }
}
