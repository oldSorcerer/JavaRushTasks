package com.javarush.task.task29.task2909.human;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Human implements Alive {

    private static int nextId = 0;

    @Getter
    private final int id;
    @Getter
    @Setter
    private BloodGroup bloodGroup;
    private final List<Human> children = new ArrayList<>();

    @Getter
    @Setter
    protected int age;
    @Getter
    @Setter
    protected String name;
    protected Size size;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
        this.id = nextId;
        nextId++;
    }

    public void printSize() {
        System.out.println("Рост: " + size.height + " Вес: " + size.weight);
    }

    public String getPosition() {
        return "Человек";
    }

    public void printData() {
        System.out.println(getPosition() + ": " + name);
    }

    public void addChild(Human human) {
        children.add(human);
    }

    public void removeChild(Human human) {
        children.remove(human);
    }

    public List<Human> getChildren() {
        return Collections.unmodifiableList(children);
    }

    @Override
    public void live() {
    }

    public static class Size {
        public int height;
        public int weight;
    }
}