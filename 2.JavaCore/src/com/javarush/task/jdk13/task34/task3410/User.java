package com.javarush.task.jdk13.task34.task3410;

import java.util.ArrayList;
import java.util.List;

public class User {
    private static String type = "user";
    private int id;
    public String displayName;
    private int level;
    public int rating;
    private String email;
    private List<User> friends = new ArrayList<>();

    public User(int id, String displayName, int level, int rating, String email) {
        this.id = id;
        this.displayName = displayName;
        this.level = level;
        this.rating = rating;
        this.email = email;
    }

    @Override
    public String toString() {
        return type + "{" +
                "id=" + id +
                ", displayName='" + displayName + '\'' +
                ", level=" + level +
                ", rating=" + rating +
                ", email='" + email + '\'' +
                ", friends=" + friends +
                '}';
    }
}
