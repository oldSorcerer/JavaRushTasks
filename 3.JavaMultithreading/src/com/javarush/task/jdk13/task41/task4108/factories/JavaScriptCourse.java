package com.javarush.task.jdk13.task41.task4108.factories;

import com.javarush.task.jdk13.task41.task4108.juniors.JavaScriptJunior;
import com.javarush.task.jdk13.task41.task4108.juniors.JuniorDeveloper;
import com.javarush.task.jdk13.task41.task4108.middles.JavaScriptMiddle;
import com.javarush.task.jdk13.task41.task4108.middles.MiddleDeveloper;
import com.javarush.task.jdk13.task41.task4108.seniors.JavaScriptSenior;
import com.javarush.task.jdk13.task41.task4108.seniors.SeniorDeveloper;

public class JavaScriptCourse implements DeveloperCourse {

    @Override
    public JuniorDeveloper createJunior() {
        return new JavaScriptJunior();
    }

    @Override
    public MiddleDeveloper createMiddle() {
        return new JavaScriptMiddle();
    }

    @Override
    public SeniorDeveloper createSenior() {
        return new JavaScriptSenior();
    }
}
