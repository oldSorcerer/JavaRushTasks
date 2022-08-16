package com.javarush.task.task05.task0520;

/* 
Создать класс прямоугольник (Rectangle)
*/


public class Rectangle {
    //напишите тут ваш код
int top, left, width, height;

public Rectangle(int top,int  left, int width, int height){
   this.top = top;
    this.left = left;
    this.width = width;
    this.height = height;
}
    public Rectangle(int top,int  left, int width ){
        this.top = top;
        this.left = left;
        this.width = width;

    }
    public Rectangle(int top,int  left ){
        this.top = top;
        this.left = left;

    }
    public Rectangle(int top ){
        this.top = top;

    }
    public static void main(String[] args) {

    }
}
/*Создать класс прямоугольник (Rectangle). Его данными будут top, left, width, height (верхняя координата, левая, ширина и высота).
Создать для него как можно больше методов конструкторов.

Примеры:
— заданы 4 параметра: left, top, width, height
— ширина/высота не задана (оба равны 0)
— высота не задана (равно ширине) создаём квадрат
— создаём копию другого прямоугольника (он и передаётся в параметрах)*/