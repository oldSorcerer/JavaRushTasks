package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Human ded1 = new Human("AA",true,99);
        Human ded2 = new Human("AA2",true,96);
        Human b1 = new Human("AA3",false,97);
        Human b2 = new Human("A4A",false,98);
        Human m = new Human("A34A",false,34,ded1,b1);
        Human o = new Human("A44A",true,44,ded2,b2);
        Human d1 = new Human("A74A",true,9,o,m);
        Human d2 = new Human("A64A",true,8,o,m);
        Human d3 = new Human("5A4A",true,7,o,m);
        System.out.println(ded1);
        System.out.println(ded2);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(m);
        System.out.println(o);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
    }

    public static class Human {
        //напишите тут ваш код

        String name;
        boolean sex;
        int age;
        Human  father,mother;

        public Human(String name, boolean sex, int age){
            this.name=name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother){
            this.name=name;
            this.sex = sex;
            this.age = age;
            this.father=father;
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





/*Семейная перепись
Создай класс Human с полями имя(String), пол(boolean), возраст(int), отец(Human), мать(Human).
 Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.

Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.

Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…


Требования:
1. Программа не должна считывать данные с клавиатуры.
2. Добавить в класс Human поля: имя(String), пол(boolean), возраст(int), отец(Human), мать(Human).
3. Добавить в класс конструктор public Human(String name, boolean sex, int age).
4. Добавить в класс конструктор public Human(String name, boolean sex, int age, Human father, Human mother).
5. Создай 9 разных объектов типа Human (4 объекта без отца и матери и 5 объектов с ними)).
6. Выведи созданные объекты на экран.*/
















