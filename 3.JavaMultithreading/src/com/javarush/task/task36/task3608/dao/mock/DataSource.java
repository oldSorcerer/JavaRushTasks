package com.javarush.task.task36.task3608.dao.mock;

import com.javarush.task.task36.task3608.bean.User;

import java.util.LinkedList;
import java.util.List;

public class DataSource {
    private static final DataSource ourInstance = new DataSource();

    public static DataSource getInstance() {
        return ourInstance;
    }

    private DataSource() {
    }

    private final List<User> users = new LinkedList<User>() {{
        add(new User("Ivanov", 123L, 1));
        add(new User("Petrov", 124L, 2));
        add(new User("Petrov", 125L, 1));
        add(new User("Sidorov", 126L, 2));
    }};

    private long maxUserId = 126L;

    public List<User> getUsers() {
        return users;
    }

    public User createOrUpdate(User newUser) {
        if (newUser == User.NULL_USER)
            return User.NULL_USER;

        //new User
        if (newUser.getId() == 0)
            return createNewUser(newUser);
        else
            return updateUser(newUser);
    }

    private User createNewUser(User newUser) {
        User clone = newUser.clone(++maxUserId);
        users.add(clone);
        return clone;
    }

    private User updateUser(User newUser) {
        for (User user : users) {
            if (user.getId() == newUser.getId()) {
                user.setName(newUser.getName());
                user.setLevel(newUser.getLevel());
                return user;
            }
        }
        //if we didn't find such a user
        return User.NULL_USER;
    }
}