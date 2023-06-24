package com.javarush.task.task29.task2909.human;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UniversityPerson extends Human {

    University university;

    public UniversityPerson(String name, int age) {
        super(name, age);
    }
}
