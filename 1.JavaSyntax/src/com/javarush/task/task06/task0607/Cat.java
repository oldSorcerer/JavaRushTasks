package com.javarush.task.task06.task0607;

/* 
Классовый счетчик
*/

public class Cat {
    //напишите тут ваш код
static int catCount;

    public Cat(){
        catCount++;
    }
    public static void main(String[] args) {

    }
}

/*Создать статическую переменную int catCount в классе Cat. Создай конструктор [public Cat()], в котором увеличивай данную переменную на 1.


Требования:
1. Добавь в класс Cat конструктор.
2. Конструктор должен быть public.
3. Добавь в класс Cat поле catCount.
4. Поле catCount должно быть типа int.
5. Поле catCount должно быть статическим.
6. Конструктор класса должен на 1 увеличивать значение переменной catCount.*/