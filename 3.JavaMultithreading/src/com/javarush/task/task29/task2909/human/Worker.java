package com.javarush.task.task29.task2909.human;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Worker extends Human {

    double salary;
    String company;

    public Worker(String name, int age) {
        super(name, age);
    }
}