package com.javarush.task.jdk13.task41.task4103;

public class User {
    private final int id;
    private final String firstName;
    private final String lastName;
    private final Object photo;

    public User(int id, String firstName, String lastName, Object photo) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.photo = photo;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Object getPhoto() {
        return photo;
    }

    @Override
    public String toString() {
        return '\'' + firstName + ' ' + lastName + '\'';
    }
}
