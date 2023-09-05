package com.javarush.task.jdk13.task38.task3804;

@Entity(name = "User")
public class User {

    private int id;
    private String displayName;
    private String email;

    public User(int id, String displayName, String email) {
        this.id = id;
        this.displayName = displayName;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getDisplayName() {
        return displayName;
    }

    public String getEmail() {
        return email;
    }
}
