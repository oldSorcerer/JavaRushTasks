package com.javarush.task.jdk13.task20.task2009;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.IOException;
import java.util.ArrayList;

/* 
Десериализация котов
*/

public class Solution {

    public static void main(String[] args) throws IOException {
        Cat cat = getFromXml("<Cat><name>Матроскин</name><cats><cats><name>кот1</name><cats/></cats><cats><name>кот2</name><cats/></cats><cats><name>кот3</name><cats/></cats></cats></Cat>", Cat.class);
        System.out.println(cat);
    }

    public static <T> T getFromXml(String xmlString, Class<T> clazz) throws IOException {
        ObjectMapper mapper = new XmlMapper();
        return mapper.readValue(xmlString, clazz);
    }

    static class Cat {
        public String name;
        public ArrayList<Cat> cats = new ArrayList<>();

        public Cat() {
        }

        public Cat(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Cat{" +
                    "name='" + name + '\'' +
                    ", cats=" + cats +
                    '}';
        }
    }
}

