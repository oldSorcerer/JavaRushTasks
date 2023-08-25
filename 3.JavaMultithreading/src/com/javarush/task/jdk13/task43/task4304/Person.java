package com.javarush.task.jdk13.task43.task4304;

/* 
Нам null-ы не страшны
*/

import org.apache.commons.lang3.StringUtils;

public class Person implements Comparable<Person> {

    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Person person1 = new Person("John", 55);
        Person person2 = new Person("Jane", 55);
        Person person3 = new Person(null, 55);

        System.out.println(person1.compareTo(person2));
        System.out.println(person3.compareTo(person2));
    }

    @Override
    public int compareTo(Person o) {
        return StringUtils.compare(this.name, o.name);
    }
}
