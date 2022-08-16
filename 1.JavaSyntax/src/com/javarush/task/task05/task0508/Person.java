package com.javarush.task.task05.task0508;

/* 
Геттеры и сеттеры для класса Person
*/

public class Person {
    //напишите тут ваш код
 private  String name;
    private   int age;
    private  char sex;

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setSex(char sex) {
        this.sex = sex;
    }

    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public char getSex(){
        return this.sex;
    }
    public static void main(String[] args) {

    }
}
