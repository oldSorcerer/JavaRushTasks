package com.javarush.task.jdk13.task38.task3802;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(value = RetentionPolicy.RUNTIME)
@Target(value = ElementType.TYPE)
public @interface Ticket {

    Priority priority() default Priority.MEDIUM;

    String createdBy() default "Amigo";

    String[] tags() default {};

    enum Priority {
        LOW, MEDIUM, HIGH
    }
}
