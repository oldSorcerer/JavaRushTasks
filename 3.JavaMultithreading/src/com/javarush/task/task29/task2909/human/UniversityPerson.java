package com.javarush.task.task29.task2909.human;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UniversityPerson extends Human {

    private University university;

    public UniversityPerson(String name, int age) {
        super(name, age);
    }
}
