package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {

        Human ded1 = new Human("AA", true, 99);
        Human ded2 = new Human("AA2", true, 96);
        Human b1 = new Human("AA3", false, 97);
        Human b2 = new Human("A4A", false, 98);
        Human mom = new Human("A34A", false, 34, ded1, b1);
        Human o = new Human("A44A", true, 44, ded2, b2);
        Human d1 = new Human("A74A", true, 9, o, mom);
        Human d2 = new Human("A64A", true, 8, o, mom);
        Human d3 = new Human("5A4A", true, 7, o, mom);
        System.out.println(ded1);
        System.out.println(ded2);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(mom);
        System.out.println(o);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father, mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}













