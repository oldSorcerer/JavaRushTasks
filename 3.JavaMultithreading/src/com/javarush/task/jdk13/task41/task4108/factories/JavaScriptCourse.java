package com.javarush.task.jdk13.task41.task4108.factories;

import com.javarush.task.jdk13.task41.task4108.juniors.*;
import com.javarush.task.jdk13.task41.task4108.middles.*;
import com.javarush.task.jdk13.task41.task4108.seniors.*;

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
