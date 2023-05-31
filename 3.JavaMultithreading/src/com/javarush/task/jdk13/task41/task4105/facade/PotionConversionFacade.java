package com.javarush.task.jdk13.task41.task4105.facade;

import com.javarush.task.jdk13.task41.task4105.alchemy_library.*;

import static com.javarush.task.jdk13.task41.task4105.alchemy_library.Type.MANA;
import static com.javarush.task.jdk13.task41.task4105.alchemy_library.Type.STAMINA;

public class PotionConversionFacade {


    public String convertPotion(String potionName, String convertTo) {
        System.out.println("PotionConversionFacade: conversion started.");
        Potion potion = new Potion(potionName);
        Type type = Type.valueOf(convertTo.toUpperCase());
        Essence sourceEssence = EssenceFactory.extract(potion);
        Essence destinationEssence;
        if (type == MANA) {
            destinationEssence = new ManaEssenceConverter();
        } else if (type == STAMINA) {
            destinationEssence = new StaminaEssenceConverter();
        } else {
            destinationEssence = new HealingEssenceConverter();
        }
        Potion portion = Extractor.extractPortion(potion, sourceEssence);
        Potion intermediateResult = Extractor.convert(portion, destinationEssence);
        Potion result = new Finalizator().fix(intermediateResult);
        System.out.println("PotionConversionFacade: conversion completed.");

       return result.getName();
    }

}
