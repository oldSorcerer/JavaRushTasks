package com.javarush.task.task06.task0614;

import java.util.ArrayList;

/* 
Статические коты
*/

public class Cat {
    //напишите тут ваш код
    public static ArrayList<Cat> cats = new ArrayList<>();

    public Cat() {

    }

    public static void main(String[] args) {
        //напишите тут ваш код
       // cats
     //  for(int i = 0;i<10;i++){

       Cat t = new Cat(); cats.add(t);
        Cat t1 = new Cat(); cats.add(t1);
        Cat t2 = new Cat(); cats.add(t2);
        Cat t3 = new Cat(); cats.add(t3);
        Cat t4 = new Cat(); cats.add(t4);
        Cat t5 = new Cat(); cats.add(t5);
        Cat t6 = new Cat(); cats.add(t6);
        Cat t7 = new Cat(); cats.add(t7);
        Cat t8 = new Cat(); cats.add(t8);
        Cat t9 = new Cat(); cats.add(t9);
          //  }
        printCats();
    }

    public static void printCats() {
        //напишите тут ваш код
       for(Cat f:cats){
            System.out.println(f);
        }
    }
}
/*Статические коты
1. В классе Cat добавь public статическую переменную cats (ArrayList<Cat>).
2. Пусть при каждом создании кота (нового объекта Cat) в переменную cats добавляется этот новый кот. Создать 10 объектов Cat.
3. Метод printCats должен выводить всех котов на экран. Нужно использовать переменную cats.


Требования:
1. Добавь в класс Cat public статическую переменную cats (ArrayList).
2. Переменная cats должна быть проинициализирована.
3. Метод main должен создавать 10 объектов Cat.
4. Метод main должен добавить всех созданных котов в переменную cats.
5. Метод printCats должен выводить всех котов из переменной cats на экран. Каждого с новой строки.*/