package com.javarush.task.task38.task3812;

import org.powermock.core.classloader.annotations.PrepareForTest;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@PrepareForTest
public @interface PrepareMyTest {
    Class<?>[] value() default Solution.class;

    String[] fullyQualifiedNames() default "";
}