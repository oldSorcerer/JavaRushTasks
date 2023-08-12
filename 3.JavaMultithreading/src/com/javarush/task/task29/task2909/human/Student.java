package com.javarush.task.task29.task2909.human;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Student extends UniversityPerson {
    @Getter
    int course;
    @Getter
    double averageGrade;
    Date beginningOfSession;
    Date endOfSession;

    public Student(String name, int age, double averageGrade) {
        super(name, age);
        this.averageGrade = averageGrade;
    }

    @Override
    public void live() {
        learn();
    }

    public void learn() {
    }

    public void incAverageGrade(double delta) {
        setAverageGrade(getAverageGrade() + delta);
    }

    @Override
    public String getPosition() {
        return "Студент";
    }
}