package com.javarush.task.task36.task3608.dao.mock;

import com.javarush.task.task36.task3608.bean.User;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.util.LinkedList;
import java.util.List;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class DataSource {

    private long maxUserId = 126L;
    static final DataSource ourInstance = new DataSource();

    @Getter
    private final List<User> users = new LinkedList<>() {{
        add(new User("Ivanov", 123L, 1));
        add(new User("Petrov", 124L, 2));
        add(new User("Petrov", 125L, 1));
        add(new User("Sidorov", 126L, 2));
    }};

    public static DataSource getInstance() {
        return ourInstance;
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