package com.javarush.task.jdk13.task41.task4108.factories;

import com.javarush.task.jdk13.task41.task4108.juniors.*;
import com.javarush.task.jdk13.task41.task4108.middles.*;
import com.javarush.task.jdk13.task41.task4108.seniors.*;

public class PythonCourse implements DeveloperCourse{

    @Override
    public JuniorDeveloper createJunior() {
        return new PythonJunior();
    }

    @Override
    public MiddleDeveloper createMiddle() {
        return new PythonMiddle();
    }

    @Override
    public SeniorDeveloper createSenior() {
        return new PythonSenior();
    }
}
