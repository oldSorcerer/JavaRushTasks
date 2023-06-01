package com.javarush.task.jdk13.task41.task4108.factories;

import com.javarush.task.jdk13.task41.task4108.juniors.JuniorDeveloper;
import com.javarush.task.jdk13.task41.task4108.juniors.PythonJunior;
import com.javarush.task.jdk13.task41.task4108.middles.MiddleDeveloper;
import com.javarush.task.jdk13.task41.task4108.middles.PythonMiddle;
import com.javarush.task.jdk13.task41.task4108.seniors.PythonSenior;
import com.javarush.task.jdk13.task41.task4108.seniors.SeniorDeveloper;

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
