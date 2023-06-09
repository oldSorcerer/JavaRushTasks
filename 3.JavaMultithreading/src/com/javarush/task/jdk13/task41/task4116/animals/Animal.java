package com.javarush.task.jdk13.task41.task4116.animals;

import com.javarush.task.jdk13.task41.task4116.visitor.Visitor;

public abstract class Animal {

    public abstract String getName();

    public abstract String accept(Visitor visitor);
}
