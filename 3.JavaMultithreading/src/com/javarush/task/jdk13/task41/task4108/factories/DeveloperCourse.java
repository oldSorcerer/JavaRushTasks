package com.javarush.task.jdk13.task41.task4108.factories;

import com.javarush.task.jdk13.task41.task4108.juniors.JuniorDeveloper;
import com.javarush.task.jdk13.task41.task4108.middles.MiddleDeveloper;
import com.javarush.task.jdk13.task41.task4108.seniors.SeniorDeveloper;

public interface DeveloperCourse {

    JuniorDeveloper createJunior();

    MiddleDeveloper createMiddle();

    SeniorDeveloper createSenior();

}
