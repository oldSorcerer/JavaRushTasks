package com.javarush.task.task36.task3608.model;

import com.javarush.task.task36.task3608.bean.User;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ModelData {

    List<User> users;
    User activeUser;
    boolean displayDeletedUserList;

}
