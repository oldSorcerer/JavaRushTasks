package com.javarush.task.task36.task3608.model;

import com.javarush.task.task36.task3608.bean.User;
import com.javarush.task.task36.task3608.model.service.UserService;
import com.javarush.task.task36.task3608.model.service.UserServiceImpl;
import lombok.Getter;

import java.util.List;

public class MainModel implements Model {

    private final ModelData modelData = new ModelData();
    private final UserService userService = new UserServiceImpl();

    @Override
    public ModelData getModelData() {
        return modelData;
    }

    @Override
    public void loadUsers() {
        List<User> users = getAllUsers();
        modelData.setUsers(users);
        modelData.setDisplayDeletedUserList(false);
    }

    public void loadDeletedUsers() {
        List<User> users = userService.getAllDeletedUsers();
        modelData.setUsers(users);
        modelData.setDisplayDeletedUserList(true);
    }

    public void loadUserById(long userId) {
        User user = userService.getUsersById(userId);
        modelData.setActiveUser(user);
    }

    @Override
    public void deleteUserById(long id) {
        userService.deleteUser(id);

        List<User> users = getAllUsers();
        modelData.setUsers(users);
    }

    @Override
    public void changeUserData(String name, long id, int level) {
        userService.createOrUpdateUser(name, id, level);

        List<User> users = getAllUsers();
        modelData.setUsers(users);
    }

    private List<User> getAllUsers() {
        List<User> users = userService.getUsersBetweenLevels(1, 100);
        return userService.filterOnlyActiveUsers(users);
    }
}
