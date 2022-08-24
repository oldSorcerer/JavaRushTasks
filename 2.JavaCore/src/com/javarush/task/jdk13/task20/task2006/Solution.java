package com.javarush.task.jdk13.task20.task2006;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
//import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* 
Сериализация в XML
*/

public class Solution {

    public static void main(String[] args) throws IOException {
        Cat cat = new Cat();
        cat.name = "Мурка";
        cat.age = 5;
        cat.weight = 3;

        Dog dog = new Dog();
        dog.name = "Полкан";
        dog.age = 8;
        dog.owner = "Билли Бонс";

        List<Pet> pets = new ArrayList<>();
        pets.add(cat);
        pets.add(dog);

        System.out.println(getXmlString(pets));
    }

    public static String getXmlString(Object object) throws IOException {
        //напишите тут ваш код

        return null;
    }

    public static class Pet {
        public String name;
    }

    public static class Cat extends Pet {
        public int age;
        public int weight;
    }

    public static class Dog extends Pet {
        public int age;
        public String owner;
    }
}

