package com.javarush.task.task06.task0613;

/* 
Кот и статика
*/

public class Solution {
    public static void main(String[] args) {
        //создай 10 котов
for(int i = 1;i<=10;i++){
    Cat t = new Cat();
}
System.out.print(Cat.catCount);
        //выведи значение переменной catCount
    }

    public static class Cat {
        //создай статическую переменную catCount
        static public int catCount;
        //создай конструктор
        public Cat(){
            catCount++;

        }
    }
}
/*Кот и статика
В классе Cat создай статическую переменную public int catCount.
Создай конструктор [public Cat()]. Пусть при каждом создании кота (нового объекта Cat) статическая переменная catCount увеличивается на 1. Создать 10 объектов Cat и вывести значение переменной catCount на экран.


Требования:
1. В классе Cat создай статическую переменную public int catCount.
2. В классе Cat создай создай конструктор public Cat().
3. Конструктор должен увеличивать значение статической переменной catCount на 1.
4. В методе main создай 10 котов.
5. В методе main, после создания котов, выведи значение переменной catCount.*/