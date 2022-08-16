package com.javarush.task.task08.task0816;

import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() {
        HashMap<String, Date> map = new HashMap<String, Date>();



        for (int i =0;i<9;i++) {
            map.put("Stallone"+i, new Date("JUNE "+(i+1)+" 1980"));
        }
        map.put("Stalloneoo", new Date("MAY 5 1980"));


      /*  for(Map.Entry<String, Date> t:map.entrySet()){
            System.out.println(t.getValue()+" --- "+t.getKey());


        }*/


        return map;


        //напишите тут ваш код
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        //напишите тут ваш код
/*for(Map.Entry<String, Date> t:map.entrySet()){
    if ((t.getValue().getMonth()>=5)&&(t.getValue().getMonth()<=7)){
        map.remove(t.getKey());
    }

}*/

        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();

        while (iterator.hasNext())
        {
            //получение «пары» элементов
            Map.Entry<String, Date> pair = iterator.next();

            if ((pair.getValue().getMonth()>=5)&&(pair.getValue().getMonth()<=7)){
                iterator.remove();
               // map.remove(pair.getKey());
            }



        }
     /*   System.out.println();
        for(Map.Entry<String, Date> t:map.entrySet()){
            System.out.println(t.getValue()+" --- "+t.getKey());


        } */


    }

    public static void main(String[] args) {

//removeAllSummerPeople(createMap());
    }
}
/*Добрая Зинаида и летние каникулы
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» — «дата рождения».
Удалить из словаря всех людей, родившихся летом.


Требования:
1. Программа не должна выводить текст на экран.
2. Программа не должна считывать значения с клавиатуры.
3. Класс Solution должен содержать только три метода.
4. Метод createMap() должен создавать и возвращать словарь HashMap с типом элементов String, Date состоящий из 10 записей.
5. Метод removeAllSummerPeople() должен удалять из словаря всех людей, родившихся летом.*/