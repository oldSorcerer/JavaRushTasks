package com.javarush.task.task30.task3008.client;

import lombok.Getter;
import lombok.Setter;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ClientGuiModel {

    private final Set<String> allUserNames = new HashSet<>();
    @Getter
    @Setter
    private String newMessage;

    public Set<String> getAllUserNames() {
        return Collections.unmodifiableSet(allUserNames);
    }

    public void addUser(String newUserName) {
        allUserNames.add(newUserName);
    }

    public void deleteUser(String userName) {
        allUserNames.remove(userName);
    }
}