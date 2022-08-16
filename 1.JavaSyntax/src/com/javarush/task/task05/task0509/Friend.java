package com.javarush.task.task05.task0509;

/* 
Создать класс Friend
*/

public class Friend {
    //напишите тут ваш код
    String name;
    int age;
    char sex;
public void initialize(String name, int age, char sex){
this.name = name;
this.age = age;
this.sex = sex;
}
    public void initialize(String name, int age){
        this.name = name;
        this.age = age;

    }
    public void initialize(String name){
        this.name = name;

    }
    public static void main(String[] args) {

    }
}
/*Создать класс Friend (друг) с тремя инициализаторами (тремя методами initialize):
— Имя
— Имя, возраст
— Имя, возраст, пол

Примечание:
Имя(String), возраст(int), пол(char).*/