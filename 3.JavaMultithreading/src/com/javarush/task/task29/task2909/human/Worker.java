package com.javarush.task.task29.task2909.human;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Worker extends Human {

    private double salary;
    private String company;

    public Worker(String name, int age) {
        super(name, age);
    }
}