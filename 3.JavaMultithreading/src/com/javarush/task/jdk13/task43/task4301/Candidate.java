package com.javarush.task.jdk13.task43.task4301;

/* 
Сравни кандидатов
*/

import org.apache.commons.lang3.builder.EqualsBuilder;
import java.util.Objects;

public class Candidate {

    private String name;
    private int age;
    private final transient String sex;
    private transient int weight;
    private transient int height;
    private int yearsExperience;

    public Candidate(String name, int age, String sex, int weight, int height, int yearsExperience) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.weight = weight;
        this.height = height;
        this.yearsExperience = yearsExperience;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        return EqualsBuilder.reflectionEquals(this, obj, true, null, "name", "age", "height", "weight");
    }

    @Override
    public int hashCode() {
        return Objects.hash(sex, yearsExperience);
    }
}
