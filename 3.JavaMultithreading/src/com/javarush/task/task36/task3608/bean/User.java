package com.javarush.task.task36.task3608.bean;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@ToString
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class User implements Cloneable {

    @Setter
    String name;
    final long id;
    @Setter
    int level;

    public static final User NULL_USER = new User();

    public User() {
        this("", 0, 0);
    }

    //methods with logic
    public boolean isNew() {
        return id == 0;
    }

    @Override
    public User clone() {
        try {
            return (User) super.clone();
        } catch (CloneNotSupportedException ignored) {
            return NULL_USER;
        }
    }

    public User clone(long newId) {
        if (this == NULL_USER) return NULL_USER;

        return new User(name, newId, level);
    }
}