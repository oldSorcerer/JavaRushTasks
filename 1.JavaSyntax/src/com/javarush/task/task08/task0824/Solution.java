package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Human d1 = new Human();
        d1.name="d1";d1.age=100;d1.sex=true;
        Human d2 = new Human();
        d2.name="d2";d2.age=100;d2.sex=true;
        Human b1 = new Human();
        b1.name="b1";b1.age=100;b1.sex=false;
        Human b2 = new Human();
        b2.name="b2";b2.age=100;b2.sex=false;
        Human o = new Human();
        o.name="o";o.age=50;o.sex=true;
        Human m = new Human();
        m.name="m";m.age=50;m.sex=false;
        Human r1 = new Human();
        r1.name="r1";r1.age=1;r1.sex=false;
        Human r2 = new Human();
        r2.name="r2";r2.age=2;r2.sex=true;
        Human r3 = new Human();
        r3.name="r3";r3.age=3;r3.sex=true;
     //   d1.children = new ArrayList();
        d1.children.add(o);
     //   b1.children = new ArrayList();
        b1.children.add(o);
      //  d2.children = new ArrayList();
        d2.children.add(m);
       // b2.children = new ArrayList();
        b2.children.add(m);
       // o.children = new ArrayList();
        o.children.add(r1);
        o.children.add(r2);
        o.children.add(r3);
       // m.children = new ArrayList();
        m.children.add(r1);
        m.children.add(r2);
        m.children.add(r3);
        System.out.println(d1);
        System.out.println(b1);
        System.out.println(d2);
        System.out.println(b2);
        System.out.println(o);
        System.out.println(m);
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        /*два дедушки, две бабушки, отец, мать, трое детей*/
    }

    public static class Human {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList();

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
/*Собираем семейство
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.


Требования:
1. Программа должна выводить текст на экран.
2. Класс Human должен содержать четыре поля.
3. Класс Human должен содержать один метод.
4. Класс Solution должен содержать один метод.
5. Программа должна создавать объекты и заполнять их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.*/