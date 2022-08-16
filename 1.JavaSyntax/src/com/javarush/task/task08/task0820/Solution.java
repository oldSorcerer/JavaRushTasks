package com.javarush.task.task08.task0820;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Множество всех животных
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

    //    Set<Object> qq = new HashSet(cats);
  //      Set<Object> qqq = new HashSet(dogs);
//System.out.println("---");
//printPets(qq);
//        System.out.println("---");
//        printPets(qqq);


    //    System.out.println("---");
        Set<Object> pets = join(cats, dogs);
        printPets(pets);


      //  System.out.println("---");
        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        HashSet<Cat> result = new HashSet<Cat>();
        result.add(new Cat());
        result.add(new Cat());
        result.add(new Cat());
        result.add(new Cat());
        //напишите тут ваш код

        return result;
    }

    public static Set<Dog> createDogs() {
        //напишите тут ваш код
        HashSet<Dog> result = new HashSet<Dog>();
        result.add(new Dog());
        result.add(new Dog());
        result.add(new Dog());

        return result;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        //напишите тут ваш код
        HashSet result = new HashSet();
        result.addAll(cats);
        result.addAll(dogs);

        return result;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        //напишите тут ваш код

        pets.remove(cats);
     /*   Iterator p = pets.iterator();

        while (p.hasNext()){
            Iterator c = cats.iterator();
            Object t = p.next();
            while (c.hasNext()){
             //   if (t.equals(c.next())){
                if (t==c.next()){
                    pets.remove(t);
                  //  p.remove();
                }

            }
        }*/
    }

    public static void printPets(Set<Object> pets) {
        //напишите тут ваш код

      /*  Iterator p = pets.iterator();

        while (p.hasNext()) {
            System.out.println( p.next());
            System.out.println("dd");
        }*/
         for(Object w:pets){
            System.out.println(w);

        }

       /* for (Iterator iterator = pets.iterator(); iterator.hasNext();) {
            System.out.println(iterator.next());
        }
        System.out.println();*/
    }


/*    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs)
    {
        //В группу животных собираются коты и собаки
        HashSet<Object> pets = new HashSet<Object>();
        pets.addAll(cats);
        pets.addAll(dogs);

        return pets;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats)
    {
        //Все коты удаляются
        pets.removeAll(cats);
    }

    public static void printPets(Set<Object> pets)
    {
        //Печатется группа животных с помощью  итератора
        for (Iterator iterator = pets.iterator(); iterator.hasNext();) {
            System.out.println(iterator.next());
        }
        System.out.println();
    }
 */

    public static class Cat {

    }

    public static class Dog {

    }
    //напишите тут ваш код
}
/*Множество всех животных
1. Внутри класса Solution создать public static классы Cat, Dog.
2. Реализовать метод createCats, который должен возвращать множество с 4 котами.
3. Реализовать метод createDogs, который должен возвращать множество с 3 собаками.
4. Реализовать метод join, который должен возвращать объединенное множество всех животных — всех котов и собак.
5. Реализовать метод removeCats, который должен удалять из множества pets всех котов, которые есть в множестве cats.
6. Реализовать метод printPets, который должен выводить на экран всех животных, которые в нем есть.
Каждое животное с новой строки


Требования:
1. Программа должна выводить текст на экран.
2. Внутри класса Solution должен быть public static классы Cat, Dog.
3. Метод createCats() класса Solution должен возвращать множество (Set) содержащее 4 кота.
4. Метод createDogs() класса Solution должен возвращать множество (Set) содержащее 3 собаки.
5. Метод join() класса Solution должен возвращать объединенное множество всех животных - всех котов и собак.
6. Метод removeCats() должен удалять из множества pets всех котов, которые есть в множестве cats.
7. Метод printPets() должен выводить на экран всех животных, которые в нем есть. Каждое животное с новой строки.*/