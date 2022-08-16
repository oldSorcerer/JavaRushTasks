package com.javarush.task.task09.task0904;

/* 
Стек-трейс длиной 10 вызовов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        method1();
    }

    public static StackTraceElement[] method1() {
        return method2();
    }

    public static StackTraceElement[] method2() {
        //напишите тут ваш код
        return method3();
    }

    public static StackTraceElement[] method3() {
        //напишите тут ваш код
        return method4();
    }

    public static StackTraceElement[] method4() {
        //напишите тут ваш код
        return method5();
    }

    public static StackTraceElement[] method5() {
        //напишите тут ваш код
        return method6();
    }

    public static StackTraceElement[] method6() {
        //напишите тут ваш код
        return method7();
    }

    public static StackTraceElement[] method7() {
        //напишите тут ваш код
        return method8();
    }

    public static StackTraceElement[] method8() {
        //напишите тут ваш код
        return  method9();
    }

    public static StackTraceElement[] method9() {
        return method10();
    }

    public static StackTraceElement[] method10() {
       // System.out.println(Thread.currentThread().getStackTrace().length);
        return Thread.currentThread().getStackTrace();
    }
}
/*Стек-трейс длиной 10 вызовов
Напиши код, чтобы получить стек-трейс длиной 10 вызовов.


Требования:
1. В классе должно быть 10 методов (метод main не учитывать).
2. Длина стек-трейса в методе method10 должна быть 10.
3. Каждый метод должен вызывать другой метод.
4. Используй метод Thread.currentThread().getStackTrace().*/