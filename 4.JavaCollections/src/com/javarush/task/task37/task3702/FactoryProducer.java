package com.javarush.task.task37.task3702;

import com.javarush.task.task37.task3702.female.FemaleFactory;
import com.javarush.task.task37.task3702.male.MaleFactory;

public class FactoryProducer {

    public static AbstractFactory getFactory(HumanFactoryType type) {
        if (type == HumanFactoryType.MALE) {
            return new MaleFactory();
        } else if (type == HumanFactoryType.FEMALE) {
            return new FemaleFactory();
        } else {
            return null;
        }
    }

    public enum HumanFactoryType {
        MALE, FEMALE
    }
}
