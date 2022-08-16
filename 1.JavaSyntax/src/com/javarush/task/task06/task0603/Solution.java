package com.javarush.task.task06.task0603;

/* 
По 50 000 объектов Cat и Dog
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        int i=0,y=0;
        while (i<50000){
            Cat t = new Cat();

            i++;
          //  System.out.println(1);
        }
        while (y<50000){

            Dog t1 = new Dog();
            y++;
            //  System.out.println(1);
        }
      //  System.out.println(Cat.ccc);
      //  System.out.println(Dog.ccc);
    }
}

class Cat {
  //  static int ccc=0;
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Cat was destroyed");
     //   ccc++;
    }
}

class Dog {
 //   static int ccc=0;
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Dog was destroyed");
    //    ccc++;
    }
}

/*Создать в цикле по 50 000 объектов Cat и Dog.
(Java-машина должна начать уничтожать неиспользуемые, и метод finalize хоть раз да вызовется).


Требования:
1. В классе Cat должен быть void метод finalize.
2. В классе Dog должен быть void метод finalize.
3. Метод finalize класса Cat должен выводить на экран "Cat was destroyed".
4. Метод finalize класса Dog должен выводить на экран "Dog was destroyed".
5. Метод main должен создавать 50000 объектов типа Cat и 50000 объектов типа Dog.*/