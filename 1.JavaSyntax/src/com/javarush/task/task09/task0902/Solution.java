package com.javarush.task.task09.task0902;

/* 
И снова StackTrace
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        method1();
    }

    public static String method1() {
        method2();
        //напишите тут ваш код
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        return stackTraceElements[2].getMethodName();
    }

    public static String method2() {
        method3();
        //напишите тут ваш код
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        return stackTraceElements[2].getMethodName();
    }

    public static String method3() {
        method4();
        //напишите тут ваш код
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        return stackTraceElements[2].getMethodName();
    }

    public static String method4() {
        method5();
        //напишите тут ваш код
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        return stackTraceElements[2].getMethodName();
    }

    public static String method5() {
        //напишите тут ваш код
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
    /*    for (StackTraceElement element : stackTraceElements)
        {
            System.out.println(element.getMethodName());
        }*/
        return stackTraceElements[2].getMethodName();
    }
}
/*  public static void method3()
  {
    StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
    for (StackTraceElement element : stackTraceElements)
    {
       System.out.println(element.getMethodName());
    }
  }
}
Написать пять методов, которые вызывают друг друга.
Каждый метод должен возвращать имя метода, вызвавшего его, полученное с помощью StackTrace.


Требования:
1. В классе должно быть 5 методов (метод main не учитывать).
2. Каждый метод должен вызывать следующий: main вызывать method1, method1 вызывать method2 и т.д.
3. Каждый метод должен возвращать имя метода, вызвавшего его.
4. Для получения имени вызвавшего метода, используй метод getMethodName.*/