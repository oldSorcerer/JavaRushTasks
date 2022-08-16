package com.javarush.task.task09.task0905;

/* 
Там, в синих глубинах стек-трейса…
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int deep = getStackTraceDeep();
    }

    public static int getStackTraceDeep() {
        //напишите тут ваш код
        System.out.println(Thread.currentThread().getStackTrace().length);
        return Thread.currentThread().getStackTrace().length;
    }
}

/*Там, в синих глубинах стек-трейса…
Написать метод, который возвращает результат – глубину его стек-трейса – количество методов в нем (количество элементов в списке).
Это же число метод должен выводить на экран.


Требования:
1. Метод getStackTraceDeep должен возвращать глубину своего стек-трейса.
2. Метод getStackTraceDeep должен выводить на экран глубину своего стек-трейса.
3. Воспользуйся методом Thread.currentThread().getStackTrace().
4. Метод main должен вызывать метод getStackTraceDeep.*/