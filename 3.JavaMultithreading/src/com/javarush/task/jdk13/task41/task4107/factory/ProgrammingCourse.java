package com.javarush.task.jdk13.task41.task4107.factory;

import com.javarush.task.jdk13.task41.task4107.developers.Developer;

public abstract class ProgrammingCourse {

    public abstract Developer createDeveloper();

    public void educateStudent() {
        Developer developer = createDeveloper();
        developer.study();
    }
}
