package com.javarush.task.jdk13.task20.task2010;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Event {

    public String name;
    public Date eventDate;

    public Event() {
    }

    public Event(String name) {
        this.name = name;
        this.eventDate = new Date();
    }

    @Override
    public String toString() {
        return "Event{" +
                "name='" + name + '\'' +
                ", eventDate=" + eventDate +
                '}';
    }
}