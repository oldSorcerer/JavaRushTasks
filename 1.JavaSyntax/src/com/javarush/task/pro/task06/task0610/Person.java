package com.javarush.task.pro.task06.task0610;

public class Person {
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    protected String getFirstName() {
        return firstName;
    }

    String getLastName() {
        return lastName;
    }

    protected String getFullName(){
        return firstName + " " + lastName;
    }
}
