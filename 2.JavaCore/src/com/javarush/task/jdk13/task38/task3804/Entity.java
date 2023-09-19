package com.javarush.task.jdk13.task38.task3804;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(value = RetentionPolicy.RUNTIME)
public @interface Entity {

    String name();

    int value() default 45;

    boolean required() default true;
}
