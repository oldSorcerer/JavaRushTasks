package com.javarush.task.task29.task2909.human;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.util.*;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class University {

    int age;
    String name;
    List<Student> students = new ArrayList<>();

    public University(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student getStudentWithAverageGrade(double averageGrade) {
        return students.stream().filter(s -> s.getAverageGrade() == averageGrade).findFirst().orElseThrow();
    }

    public Student getStudentWithMaxAverageGrade() {
        return students.stream().max(Comparator.comparingDouble(Student::getAverageGrade)).orElseThrow();
    }

    public Student getStudentWithMinAverageGrade() {
        return students.stream().min(Comparator.comparingDouble(Student::getAverageGrade)).orElseThrow();
    }

    public void expel(Student student) {
        students.removeIf(s -> s.equals(student));
    }
}