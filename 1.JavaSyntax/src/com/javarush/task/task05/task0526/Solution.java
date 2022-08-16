package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Man m = new Man("d",1,"f");
        Man m1 = new Man("d1",11,"f1");
        Woman m2 = new Woman("d2",12,"f2");
        Woman m3 = new Woman("d3",13,"f3");
        System.out.println(m);
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);
    }

    public static class Man {
        String name,address;
          int age ;
          public Man(  String name, int age,String address){
              this.name = name;
              this.address = address;
              this.age = age;
          }
        public String toString(){
            return this.name+" "+this.age+" "+this.address;
        }
    }
    public static class Woman {
        String name,address;
        int age ;

        public Woman(  String name,  int age,String address){
            this.name = name;
            this.address = address;
            this.age = age;
        }
        public String toString(){
            return this.name+" "+this.age+" "+this.address;
        }
    }
    //напишите тут ваш код
}
/*. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name (String), age (int), address (String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате «name + » » + age + » « + address».


Требования:
1. В классе Solution создай public static класс Man.
2. В классе Solution создай public static класс Woman.
3. Класс Man должен содержать переменные: name(String), age(int) и address(String).
4. Класс Woman должен содержать переменные: name(String), age(int) и address(String).
5. У классов Man и Woman должны быть конструкторы, принимающие параметры с типами String, int и String.
6. Конструкторы должны инициализировать переменные класса.
7. В методе main необходимо создать по два объекта каждого типа.
8. Метод main должен выводить созданные объекты на экран в указанном формате.*/