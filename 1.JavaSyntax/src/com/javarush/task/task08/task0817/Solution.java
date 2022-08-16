package com.javarush.task.task08.task0817;

import java.util.HashMap;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<String, String>();
        for (int i =0;i<5;i++) {
            map.put("q"+i,"w"+i);
        }
        map.put("q11","w1");
        map.put("q112","w1");
        map.put("q113","w3");
        map.put("q114","w17");
        map.put("q115","w16");

    /*    for (Map.Entry<String, String> pair : map.entrySet()) {
           System.out.println(pair.getKey()+" --- "+pair.getValue());
        }*/


return map;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {
        //напишите тут ваш код
        String n;
        int t;
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            n = pair.getValue();
            t=0;
           // System.out.println("цикл 1");
            for (Map.Entry<String, String> pair1 : copy.entrySet()) {
          //      System.out.println("цикл 2");
                if ( pair1.getValue().equals(n)){
                    t++;
                }
                if (t>1) {
                    removeItemFromMapByValue(map, n);
                    continue;
                }
            }

        }


      /*  System.out.println("------------");
        for (Map.Entry<String, String> pair : map.entrySet()) {
            System.out.println(pair.getKey()+" --- "+pair.getValue());
        }*/
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {
   //     removeTheFirstNameDuplicates(createMap());
    }
}
/*Нам повторы не нужны
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» — «имя».
Удалить людей, имеющих одинаковые имена.


Требования:
1. Программа не должна выводить текст на экран.
2. Программа не должна считывать значения с клавиатуры.
3. Класс Solution должен содержать только четыре метода.
4. Метод createMap() должен создавать и возвращать словарь HashMap с типом элементов String, String состоящих из 10 записей.
5. Метод removeTheFirstNameDuplicates() должен удалять из словаря всех людей, имеющие одинаковые имена.
6. Метод removeTheFirstNameDuplicates() должен вызывать метод removeItemFromMapByValue().*/