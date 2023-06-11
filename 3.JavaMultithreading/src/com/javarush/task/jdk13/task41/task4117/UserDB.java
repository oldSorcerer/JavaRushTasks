package com.javarush.task.jdk13.task41.task4117;

import java.util.HashMap;
import java.util.Map;

public class UserDB {

    private final Map<Integer, User> users = new HashMap<>();

    public void add(User user) {
        users.put(user.getId(), user);
    }

    public User getById(int id) {
        return users.get(id);
    }
}
