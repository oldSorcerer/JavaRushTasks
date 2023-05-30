package com.javarush.task.jdk13.task41.task4107.factory;

import com.javarush.task.jdk13.task41.task4107.developers.Developer;
import com.javarush.task.jdk13.task41.task4107.developers.JavaDeveloper;

public class JavaRush extends ProgrammingCourse{

    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }
}
