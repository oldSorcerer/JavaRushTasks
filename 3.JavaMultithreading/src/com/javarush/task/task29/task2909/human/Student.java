package com.javarush.task.task29.task2909.human;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
public class Student extends UniversityPerson {
    @Getter
    private int course;
    @Getter
    private double averageGrade;
    private Date beginningOfSession;
    private Date endOfSession;

    public Student(String name, int age, double averageGrade) {
        super(name, age);
        this.averageGrade = averageGrade;
    }

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