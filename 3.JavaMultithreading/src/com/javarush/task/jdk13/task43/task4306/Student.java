package com.javarush.task.jdk13.task43.task4306;

/* 
В поиске ботана
*/

public class Student {
    private final String name;
    private final int mathScore;
    private final int physicsScore;
    private final int chemistryScore;
    private final int biologyScore;
    private final int geographyScore;
    private final int historyScore;
    private final int englishScore;

    public Student(String name, int mathScore, int physicsScore, int chemistryScore, int biologyScore, int geographyScore, int historyScore, int englishScore) {
        this.name = name;
        this.mathScore = mathScore;
        this.physicsScore = physicsScore;
        this.chemistryScore = chemistryScore;
        this.biologyScore = biologyScore;
        this.geographyScore = geographyScore;
        this.historyScore = historyScore;
        this.englishScore = englishScore;
    }

    public String getName() {
        return name;
    }

    public int getMathScore() {
        return mathScore;
    }

    public int getPhysicsScore() {
        return physicsScore;
    }

    public int getChemistryScore() {
        return chemistryScore;
    }

    public int getBiologyScore() {
        return biologyScore;
    }

    public int getGeographyScore() {
        return geographyScore;
    }

    public int getHistoryScore() {
        return historyScore;
    }

    public int getEnglishScore() {
        return englishScore;
    }
}