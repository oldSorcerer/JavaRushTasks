package com.javarush.task.jdk13.task43.task4306;

/* 
В поиске ботана
*/

import org.apache.commons.lang3.ObjectUtils;

public class Solution {

    public static void main(String[] args) {
        Student studentOne = new Student("Joe", 10, 8, 7, 7, 5, 6, 9);
        Student studentTwo = new Student("Jane", 8, 9, 5, 6, 7, 7, 8);

        String result = compareStudentGrades(studentOne, studentTwo);
        System.out.println(result);
    }

    public static String compareStudentGrades(Student studentOne, Student studentTwo) {
        int score = 0;
        if (ObjectUtils.allNotNull(studentOne, studentTwo)) {
            score += ObjectUtils.compare(studentOne.getMathScore(), studentTwo.getMathScore());
            score = score + ObjectUtils.compare(studentOne.getPhysicsScore(), studentTwo.getPhysicsScore());
            score = score + ObjectUtils.compare(studentOne.getChemistryScore(), studentTwo.getChemistryScore());
            score = score + ObjectUtils.compare(studentOne.getBiologyScore(), studentTwo.getBiologyScore());
            score = score + ObjectUtils.compare(studentOne.getGeographyScore(), studentTwo.getGeographyScore());
            score = score + ObjectUtils.compare(studentOne.getHistoryScore(), studentTwo.getHistoryScore());
            score = score + ObjectUtils.compare(studentOne.getEnglishScore(), studentTwo.getEnglishScore());
        } else {
            return "Make sure there are no null objects";
        }
        if (score > 0) {
            return studentOne.getName() + " has a higher grades score";
        }else if (score < 0) {
            return studentTwo.getName() + " has a higher grades score";
        } else {
            return "Student grades scores are equal";
        }
    }
}
