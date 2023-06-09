package com.javarush.task.jdk13.task41.task4116.visitor;

import com.javarush.task.jdk13.task41.task4116.animals.*;

public interface Visitor {

    String visitCat(Cat cat);

    String visitCow(Cow cow);

    String visitDog(Dog dog);

}
