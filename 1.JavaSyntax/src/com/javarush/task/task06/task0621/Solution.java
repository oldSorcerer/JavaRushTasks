package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Cat grandfather = new Cat(reader.readLine());
        Cat grandmother = new Cat(reader.readLine());
        Cat father = new Cat(grandfather, reader.readLine());
        Cat mother = new Cat(reader.readLine(), grandmother);
        Cat son = new Cat(reader.readLine(), mother, father);
        Cat daughter = new Cat(reader.readLine(), mother, father);

        System.out.println(grandfather);
        System.out.println(grandmother);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(son);
        System.out.println(daughter);
    }

    public static class Cat {
        private final String name;
        private Cat mother;
        private Cat father;

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat mother) {
            this.name = name;
            this.mother = mother;
        }

        Cat(String name, Cat mother, Cat father) {
            this.name = name;
            this.mother = mother;
            this.father = father;
        }

        Cat(Cat father, String name) {
            this.name = name;
            this.father = father;
        }

        @Override
        public String toString() {
            if ((mother == null) && (father == null))
                return "Cat name is " + name + ", no mother, no father";
            else if (mother == null)
                return "Cat name is " + name + ", no mother, father is " + father.name;
            else if (father == null)
                return "Cat name is " + name + ", mother is " + mother.name + ", no father";
            else
                return "Cat name is " + name + ", mother is " + mother.name + ", father is " + father.name;
        }
    }
}