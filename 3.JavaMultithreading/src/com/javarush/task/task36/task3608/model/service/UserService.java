package com.javarush.task.task36.task3608.model.service;

import com.javarush.task.task36.task3608.bean.User;

import java.util.List;

public interface UserService {
    User deleteUser(long id);

    User createOrUpdateUser(String name, long id, int level);

    List<User> getUsersByName(String name);

    List<User> getAllDeletedUsers();

    List<User> getUsersBetweenLevels(int fromLevel, int toLevel);

    List<User> filterOnlyActiveUsers(List<User> allUsers);

    User getUsersById(long userId);
}