package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

       // String motherName = reader.readLine();
       // Cat catMother = new Cat(motherName);

       // String daughterName = reader.readLine();
       // Cat catDaughter = new Cat(daughterName, catMother);

        Cat d=new Cat(reader.readLine());
        Cat b=new Cat(reader.readLine());
        Cat p=new Cat(d,reader.readLine());
        Cat m=new Cat(reader.readLine(),b);
        Cat s=new Cat(reader.readLine(),m,p);
        Cat doch=new Cat(reader.readLine(),m,p);

        System.out.println(d);
        System.out.println(b);
        System.out.println(p);
        System.out.println(m);
        System.out.println(s);
        System.out.println(doch);
        /*Создать 6 объектов: дедушку (папин папа), бабушку (мамина мама), папу, маму, сына, дочь.
Вывести их всех на экран в порядке: дедушка, бабушка, папа, мама, сын, дочь.*/
    }

    public static class Cat {
        private String name;
        private Cat m;
        private Cat o;


        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat m) {
            this.name = name;
            this.m = m;
        }
        Cat(String name, Cat m, Cat o) {
            this.name = name;
            this.m = m;
            this.o = o;
        }
        Cat(Cat o, String name ) {
            this.name = name;
            this.o = o;
        }

        @Override
        public String toString() {
            if ((m == null)&&(o==null))
                return "Cat name is " + name + ", no mother, no father";
            else if ((m == null)&&(o!=null))
                return "Cat name is " + name + ", no mother, father is " + o.name;
            else if ((m!=null)&&(o==null))
                return "Cat name is " + name + ", mother is " + m.name+", no father";
            else
                return "Cat name is " + name + ", mother is " + m.name+", father is " + o.name;
        }
    }

}
/*Родственные связи кошек
Задача: У каждой кошки есть имя и кошка-мама.
Создать класс, который бы описывал данную ситуацию.
Создать два объекта: кошку-дочь и кошку-маму.
Вывести их на экран.

Новая задача: У каждой кошки есть имя, кошка-папа и кошка-мама.
Изменить класс Cat так, чтобы он мог описать данную ситуацию.
Создать 6 объектов: дедушку (папин папа), бабушку (мамина мама), папу, маму, сына, дочь.
Вывести их всех на экран в порядке: дедушка, бабушка, папа, мама, сын, дочь.

Пример ввода:
дедушка Вася
бабушка Мурка
папа Котофей
мама Василиса
сын Мурчик
дочь Пушинка

Пример вывода:
Cat name is дедушка Вася, no mother, no father
Cat name is бабушка Мурка, no mother, no father
Cat name is папа Котофей, no mother, father is дедушка Вася
Cat name is мама Василиса, mother is бабушка Мурка, no father
Cat name is сын Мурчик, mother is мама Василиса, father is папа Котофей
Cat name is дочь Пушинка, mother is мама Василиса, father is папа Котофей


Требования:
1. Программа должна считывать имена 6 котов в указанном порядке.
2. Метод main должен создавать 6 объектов типа Cat.
3. Программа должна выводить 6 строк с информацией о котах.
4. Строка про дедушку (первая) должна соответствовать условию.
5. Строка про бабушку (вторая) должна соответствовать условию.
6. Строка про папу (третья) должна соответствовать условию.
7. Строка про маму (четвертая) должна соответствовать условию.
8. Строка про сына (пятая) должна соответствовать условию.
9. Строка про дочь (шестая) должна соответствовать условию.*/