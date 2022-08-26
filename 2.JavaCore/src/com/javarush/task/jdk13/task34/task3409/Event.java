package com.javarush.task.jdk13.task34.task3409;

public class Event {

    private static int nextId = 1;

    private Integer id;
    private String name;
    private Boolean isActive;

    public Event(String name, Boolean isActive) {
        this.id = nextId++;
        this.name = name;
        this.isActive = isActive;
    }

    @Override
    public String toString() {
        return "Event{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", isActive=" + isActive +
                '}';
    }
}
