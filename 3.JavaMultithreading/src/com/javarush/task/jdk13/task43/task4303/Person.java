package com.javarush.task.jdk13.task43.task4303;

/* 
Нам шаблоны не нужны
*/

//import org.apache.commons.lang3.builder.StandardToStringStyle;
//import org.apache.commons.lang3.builder.ToStringBuilder;

public class Person {
    private String name;
    private int age;
    private int weight;
    private int height;
    private transient String sex;

    public Person(String name, int age, int weight, int height, String sex) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.sex = sex;
    }

    @Override
    public String toString() {
        //напишите тут ваш код

        return null;
    }
}
