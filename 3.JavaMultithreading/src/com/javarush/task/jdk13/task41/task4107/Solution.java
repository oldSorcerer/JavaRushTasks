package com.javarush.task.jdk13.task41.task4107;

import com.javarush.task.jdk13.task41.task4107.factory.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Кузница кадров
*/

public class Solution {

    private static ProgrammingCourse course;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String direction = reader.readLine();
//        String direction = "web";
        choose(direction);
        startLearningProcess();
    }

    static void choose(String direction) {
        switch (direction) {
            case "web" -> course = new JavaRush();
            case "android" -> course = new KotlinCourse();
            default -> course = new DotNetCourse();
        }
    }

    static void startLearningProcess() {
        course.educateStudent();
    }
}
