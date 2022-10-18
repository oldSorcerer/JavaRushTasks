package com.javarush.task.task29.task2909.human;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Human {
    public static final int FIRST = 1;
    public static final int SECOND = 2;
    public static final int THIRD = 3;
    public static final int FOURTH = 4;

    public static int nextId = 0;

    private int id;
    private int bloodGroup;
    private final List<Human> children = new ArrayList<>();

    protected int age;
    protected String name;
    protected int course;
    protected int[] size;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
        this.id = nextId;
        nextId++;
    }

    public void printSize() {
        System.out.println("Рост: " + size[0] + " Вес: " + size[1]);
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    public void addChild(Human human) {
        children.add(human);
    }

    public void removeChild(Human human) {
        children.remove(human);
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(int code) {
        bloodGroup = code;
    }

    public List<Human> getChildren() {
        return Collections.unmodifiableList(children);
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourse() {
        return course;
    }

}